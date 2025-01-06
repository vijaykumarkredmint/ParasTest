package utilities;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import java.io.File;
import java.io.IOException;
import java.util.Properties;

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

        // Send the report as email
        try {
            // Here, the report will be sent to vijaykumarmeerut1@gmail.com
            sendEmailWithAttachment("vijaykumarmeerut1@gmail.com", "Test Report - " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()), 
                    "Hello, \n\nPlease find the attached test report for the latest test execution.\n\nRegards,\nTest Automation Team", 
                    reportFilePath);
            System.out.println("Report email sent successfully.");
        } catch (Exception e) {
            System.out.println("Error sending email with the report: " + e.getMessage());
        }

        // Optionally, open the report in browser
        openReportInBrowser(reportFilePath);
    }

    // Get the current ExtentTest object (used in tests)
    public static ExtentTest getTest() {
        return test.get();  // Access the thread-local ExtentTest instance
    }

    // Method to open the report in the browser (you already have this logic)
    private void openReportInBrowser(String reportFilePath) {
        try {
            String os = System.getProperty("os.name").toLowerCase();
            String[] cmd;

            if (os.contains("mac")) {
                cmd = new String[] { "open", reportFilePath };
            } else if (os.contains("win")) {
                cmd = new String[] { "cmd", "/c", "start", reportFilePath };
            } else {
                cmd = new String[] { "xdg-open", reportFilePath };
            }

            Runtime.getRuntime().exec(cmd);
            System.out.println("Report opened in browser.");
        } catch (Exception e) {
            System.out.println("Error opening report: " + e.getMessage());
        }
    }

    // Email sending method using JavaMail API
    public void sendEmailWithAttachment(String toEmail, String subject, String body, String attachmentPath) throws MessagingException, IOException {
        // Gmail SMTP server settings
        String host = "smtp.gmail.com";
        String fromEmail = "vijaykumarmeerut1@gmail.com";  // From email (sender email)
        String password = "xpqz tsxu pcay kily";  // Use the sender's Gmail app password

        // Set properties for the SMTP session
        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true"); // TLS is required for Gmail

        // Create a session with authentication
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        });

        // Compose the email message
        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(fromEmail));
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
        message.setSubject(subject);
        message.setText(body);

        // Create an attachment
        MimeBodyPart attachmentPart = new MimeBodyPart();
        attachmentPart.attachFile(new File(attachmentPath));

        // Create a multipart message to include text and attachment
        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(attachmentPart);

        // Set the content of the email
        message.setContent(multipart);

        // Send the message
        Transport.send(message);
        System.out.println("Email sent successfully with attachment.");
    }
}
