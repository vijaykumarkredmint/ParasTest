package bearerTokenGenerate;

import org.testng.annotations.Test;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.restassured.response.Response;
import utilities.ExtentReportManager;

public class TestsBearerTokenGenerate {
	@Test(priority = 1,groups = {"BearerTokenGeneration"})
	public void testOrderFlowGenerateToken() {
		ExtentTest test = ExtentReportManager.getTest();
//		test.assignCategory("Token Generation");
		
	    Response response = MethodsBearerTokenGenerate.methodBearerToken();
//		response.then().log().all();
	    
	    test.log(Status.INFO, "Response Status Line: " + response.getStatusLine());
	    test.log(Status.INFO, "Response Body: " + response.getBody().asPrettyString());
	    
	    int statusCode = response.getStatusCode();
	    if (statusCode != 200) {
	        test.log(Status.FAIL, "Expected status code 200, but found: " + response.getStatusCode());
	        Assert.fail("Test failed due to unexpected status code: " + response.getStatusCode());  // Marks the test as failed
	    } else {
	        test.log(Status.PASS, "Passed because status code is 200");
	    }
	    
	    VarBearerTokenGenerate.varBearerTokenValue = response.jsonPath().getString("payload.access_token");
	    if (VarBearerTokenGenerate.varBearerTokenValue == null || VarBearerTokenGenerate.varBearerTokenValue.isEmpty()) {
	        test.log(Status.FAIL, "Bearer token is null or empty. The value is:- "+VarBearerTokenGenerate.varBearerTokenValue);
	        Assert.fail("Test failed due to bearer token:- "+VarBearerTokenGenerate.varBearerTokenValue);
	    } else {
	        test.log(Status.PASS, "Passed because bearerToken is not null or empty. The value is:- " + VarBearerTokenGenerate.varBearerTokenValue);
	    }
	    VarBearerTokenGenerate.varBearerTokenValue = "Bearer "+VarBearerTokenGenerate.varBearerTokenValue;
	}
}
