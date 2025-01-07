package utilities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

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

    // List of recipient email addresses
    private List<String> recipients = List.of("shivam.jindal@kredmint.com","vijay.kumar@kredmint.com","vijaykumarmeerut1@gmail.com", "vk1151257@gmail.com");

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

        // Send the report via email
        sendReportByEmail(reportFilePath);
    }

    // Get the current ExtentTest object (used in tests)
    public static ExtentTest getTest() {
        return test.get();  // Access the thread-local ExtentTest instance
    }

    // Method to send the report by email
    private void sendReportByEmail(String reportFilePath) {
        // Gmail SMTP configuration
        String host = "smtp.gmail.com"; 
//        String from = "vijaykumarmeerut1@gmail.com"; // Sender's email address
//        String password = "dkwm oulr ybmg uoyb"; // Replace with your App password if 2FA is enabled (or the Gmail password if not)
        String from = "vijay.kumar@kredmint.com"; // Sender's email address
        String password = "qvmo tbgw cqgz fayr"; // Replace with your App password if 2FA is enabled (or the Gmail password if not)

        // Set up the mail properties
        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");

        // Create session with authentication
        Session session = Session.getInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        });

        try {
            // Create the email message
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setSubject("Test Report: " + repName);

            // Add recipients
            for (String recipient : recipients) {
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
            }

            // Create the email body
            MimeBodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText("Please find attached the test report.");

            // Create the attachment part
            MimeBodyPart attachmentPart = new MimeBodyPart();
            attachmentPart.attachFile(reportFilePath);

            // Create multipart and add the message body and attachment
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            multipart.addBodyPart(attachmentPart);

            // Set the content of the email
            message.setContent(multipart);

            // Send the email
            Transport.send(message);
            System.out.println("Report sent via email.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error sending email: " + e.getMessage());
        }
    }
}
