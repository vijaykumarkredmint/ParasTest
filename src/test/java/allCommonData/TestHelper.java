package allCommonData;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.restassured.response.Response;

public class TestHelper {
		
	    public static void logDetails(ExtentTest test, Response response) {
	    	test.log(Status.INFO, "Response Status Line: " + response.getStatusLine());
	        test.log(Status.INFO, "Response Body: " + response.getBody().asPrettyString());
	    }
	    
	    public static void validateStatusCode(ExtentTest test, Response response, int expectedStatusCode) {
	        int statusCode = response.getStatusCode();
	        if (statusCode != expectedStatusCode) {
	            test.log(Status.FAIL, "Expected status code: " + expectedStatusCode + ", but Actual is: " + statusCode);
	            Assert.fail("Test failed due to unexpected status code: " + statusCode);
	        } else {
	            test.log(Status.PASS, "Passed because status code is: " + expectedStatusCode);
	        }
	    }
	    
	    public static void validateStatus(ExtentTest test, Response response, String expectedStatus) {
	        String status = response.jsonPath().getString("payload.status");
	        if (!status.equals(expectedStatus)) {
	            test.log(Status.FAIL, "Expected Status is: " + expectedStatus + ", but Actual is: " + status);
	            Assert.fail("Test failed due to unexpected Status: " + status);
	        } else {
	            test.log(Status.PASS, "Passed because Status is: " + status);
	        }
	    }
	    
	    public static void validateOrderStatus(ExtentTest test, Response response, String expectedOrderStatus) {
	        String OrderStatus = response.jsonPath().getString("payload.orderStatus");
	        if (!OrderStatus.equals(expectedOrderStatus)) {
	            test.log(Status.FAIL, "Expected Order Status is: " + expectedOrderStatus + ", but Actual is: " + OrderStatus);
	            Assert.fail("Test failed due to unexpected Order Status: " + OrderStatus);
	        } else {
	            test.log(Status.PASS, "Passed because Order Status is: " + OrderStatus);
	        }
	    }
	    
	    public static void validateId(ExtentTest test, Response response) {
	    	String id = response.jsonPath().getString("payload.id");
	        if (id==null) {
	            test.log(Status.FAIL, "Id should not be Null but found Null");
	            Assert.fail("Test failed due to Id is: Null");
	        } else {
	            test.log(Status.PASS, "Passed because Id is not: Null");
	        }
	    }
	}