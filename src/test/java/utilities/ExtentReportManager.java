package utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {

    private ExtentSparkReporter sparkReporter;
    private ExtentReports extent;
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>(); // ThreadLocal for thread safety

    private String repName;

    public void onStart(ITestContext testContext) {
        // Initialize the report setup
        System.out.println("Starting report generation...");
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd - HH:mm:ss").format(new Date());
        repName = "Test-report-" + timeStamp + ".html";
        String projectPath = System.getProperty("user.dir");
        sparkReporter = new ExtentSparkReporter(projectPath + "/reports/" + repName);

        sparkReporter.config().setDocumentTitle("ParasUATProject");
        sparkReporter.config().setReportName("Test-report");
        sparkReporter.config().setTheme(Theme.DARK);

        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
        extent.setSystemInfo("Application", "ParasUATProject");
        extent.setSystemInfo("Operating System", System.getProperty("os.name"));
        extent.setSystemInfo("User Name", System.getProperty("user.name"));
        extent.setSystemInfo("Environment", "UAT");
        extent.setSystemInfo("User", "Vijay");

        System.out.println("Report initialization completed.");
    }

    @Override
    public void onTestStart(ITestResult result) {
        // Create a new ExtentTest instance for each test method
        ExtentTest currentTest = extent.createTest(result.getName());
        currentTest.assignCategory(result.getMethod().getGroups());

        // Log the test start time
        String startTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        currentTest.log(Status.INFO, "Test started at: " + startTime);
        
        // Save the current ExtentTest instance in ThreadLocal for thread safety
        test.set(currentTest);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // Log the test end time and status
        String endTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        test.get().log(Status.PASS, "Test Passed");
        test.get().log(Status.INFO, "Test ended at: " + endTime);
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // Log the test failure message, end time, and status
        String endTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        test.get().log(Status.FAIL, "Test Failed");
        test.get().log(Status.FAIL, result.getThrowable().getMessage());
        test.get().log(Status.INFO, "Test ended at: " + endTime);
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // Log the test skipped message, end time, and status
        String endTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        test.get().log(Status.SKIP, "Test Skipped");
        test.get().log(Status.SKIP, result.getThrowable().getMessage());
        test.get().log(Status.INFO, "Test ended at: " + endTime);
    }

    @Override
    public void onFinish(ITestContext testContext) {
        extent.flush();  // Flush the report at the end of the test execution
        System.out.println("Report has been flushed to file.");
        System.out.println("Report location: " + repName);

        // Get the full path to the report
        String reportFilePath = System.getProperty("user.dir") + "/reports/" + repName;
        
        // Open the report in the default browser on different operating systems
        try {
            String os = System.getProperty("os.name").toLowerCase();
            String[] cmd;

            if (os.contains("mac")) {
                // macOS: open command
                cmd = new String[] { "open", reportFilePath };
            } else if (os.contains("win")) {
                // Windows: start command
                cmd = new String[] { "cmd", "/c", "start", reportFilePath };
            } else {
                // Linux and other OS: xdg-open
                cmd = new String[] { "xdg-open", reportFilePath };
            }

            Runtime.getRuntime().exec(cmd);
            System.out.println("Report opened in browser.");
        } catch (Exception e) {
            System.out.println("Error opening report: " + e.getMessage());
        }
    }

    // Get the current ExtentTest object (used in tests)
    public static ExtentTest getTest() {
        return test.get();  // Access the thread-local ExtentTest instance
    }
}
