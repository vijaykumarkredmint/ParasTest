package orderCancelCreateOrder;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import allCommonData.TestHelper;
import io.restassured.response.Response;
import utilities.ExtentReportManager;

public class TestsOrderCancelCreateOrder {
	
	@Test(priority = 1,groups = {"OrderCancelCreateOrder"})
	public void testOrderCancelCreateOrderInventoryDetailsBeforeCreateOrder(){
		SoftAssert softAssert = new SoftAssert();
		
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderCancelCreateOrder.methodOrderCancelCreateOrderInventoryDetailsBeforeCreateOrder();
        
		TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    
	    if(MethodsOrderCancelCreateOrder.varPendingStockBeforeCreateOrder>=0){
	    	test.log(Status.PASS, "Expected Pending Stock value before Create Order should be long number "+ "And Actual is: "+MethodsOrderCancelCreateOrder.varPendingStockBeforeCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Pending Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderCancelCreateOrder.varPendingStockBeforeCreateOrder+". Incorrect");
	    	softAssert.fail("Expected Pending Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderCancelCreateOrder.varPendingStockBeforeCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderCancelCreateOrder.varTotalDemandBeforeCreateOrder>=0){
	    	test.log(Status.PASS, "Expected Total Demand value before Create Order should be long number "+ "And Actual is: "+MethodsOrderCancelCreateOrder.varTotalDemandBeforeCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Total Demand value before Create Order should be long number "+ "But Actual is: "+MethodsOrderCancelCreateOrder.varTotalDemandBeforeCreateOrder+". Incorrect");
	    	softAssert.fail("Expected Total Demand value should be before Create Order long number "+ "But Actual is: "+MethodsOrderCancelCreateOrder.varTotalDemandBeforeCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderCancelCreateOrder.varStockBeforeCreateOrder>=0){
	    	test.log(Status.PASS, "Expected Stock value before Create Order should be long number "+ "And Actual is: "+MethodsOrderCancelCreateOrder.varStockBeforeCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderCancelCreateOrder.varStockBeforeCreateOrder+". Incorrect");
	    	softAssert.fail("Expected Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderCancelCreateOrder.varStockBeforeCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderCancelCreateOrder.varIntransientStockBeforeCreateOrder>=0){
	    	test.log(Status.PASS, "Expected Intransient Stock value before Create Order should be long number "+ "And Actual is: "+MethodsOrderCancelCreateOrder.varIntransientStockBeforeCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Intransient Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderCancelCreateOrder.varIntransientStockBeforeCreateOrder+". Incorrect");
	    	softAssert.fail("Expected Intransient Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderCancelCreateOrder.varIntransientStockBeforeCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderCancelCreateOrder.varAvailableStockBeforeCreateOrder>=0){
	    	test.log(Status.PASS, "Expected Available Stock value before Create Order should be long number "+ "And Actual is: "+MethodsOrderCancelCreateOrder.varAvailableStockBeforeCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Available Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderCancelCreateOrder.varAvailableStockBeforeCreateOrder+". Incorrect");
	    	softAssert.fail("Expected Available Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderCancelCreateOrder.varAvailableStockBeforeCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderCancelCreateOrder.varUsedQuantityBeforeCreateOrder>=0){
	    	test.log(Status.PASS, "Expected Used Quantity value before Create Order should be long number "+ "And Actual is: "+MethodsOrderCancelCreateOrder.varUsedQuantityBeforeCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Used Quantity value before Create Order should be long number "+ "But Actual is: "+MethodsOrderCancelCreateOrder.varUsedQuantityBeforeCreateOrder+". Incorrect");
	    	softAssert.fail("Expected Used Quantity value should be before Create Order long number "+ "But Actual is: "+MethodsOrderCancelCreateOrder.varUsedQuantityBeforeCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderCancelCreateOrder.varAvailableQuantityBeforeCreateOrder>=0){
	    	test.log(Status.PASS, "Expected Available Quantity value before Create Order should be long number "+ "And Actual is: "+MethodsOrderCancelCreateOrder.varAvailableQuantityBeforeCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Available Quantity value before Create Order should be long number "+ "But Actual is: "+MethodsOrderCancelCreateOrder.varAvailableQuantityBeforeCreateOrder+". Incorrect");
	    	softAssert.fail("Expected Available Quantity value should be before Create Order long number "+ "But Actual is: "+MethodsOrderCancelCreateOrder.varAvailableQuantityBeforeCreateOrder+". Incorrect");
	    }
	    
	    softAssert.assertAll();
	}
	
	
	
	@Test(dependsOnMethods = "testOrderCancelCreateOrderInventoryDetailsBeforeCreateOrder", groups = {"OrderCancelCreateOrder"})
	public void testOrderCancelCreateOrderCreateOrder(){
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderCancelCreateOrder.methodOrderCancelCreateOrderCreateOrder();
        
		TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    TestHelper.validateStatus(test, response, "Created");
	    TestHelper.validateId(test, response);
	}

	
	
	@Test(dependsOnMethods = "testOrderCancelCreateOrderCreateOrder",groups = {"OrderCancelCreateOrder"})
	public void testOrderCancelCreateOrderInventoryDetailsAfterCreateOrder(){
		SoftAssert softAssert = new SoftAssert();
		
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderCancelCreateOrder.methodOrderCancelCreateOrderInventoryDetailsAfterCreateOrder();
        
		TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    
	    if(MethodsOrderCancelCreateOrder.varPendingStockAfterCreateOrder==(MethodsOrderCancelCreateOrder.varPendingStockBeforeCreateOrder+MethodsOrderCancelCreateOrder.varOrderedQuantity)){
	    	test.log(Status.PASS, "Pending Stock value Before Create Order is: "+MethodsOrderCancelCreateOrder.varPendingStockBeforeCreateOrder+", Ordered Quantity is: "+MethodsOrderCancelCreateOrder.varOrderedQuantity+ ", Expected Pending Stock value (Pending Stock Value Before Creating Order + Ordered Quantity) After Create Order is: "+(MethodsOrderCancelCreateOrder.varPendingStockBeforeCreateOrder+MethodsOrderCancelCreateOrder.varOrderedQuantity)+ ", And Actual Pending Stock value After Create Order is: "+MethodsOrderCancelCreateOrder.varPendingStockAfterCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Pending Stock value Before Create Order is: "+MethodsOrderCancelCreateOrder.varPendingStockBeforeCreateOrder+", Ordered Quantity is: "+MethodsOrderCancelCreateOrder.varOrderedQuantity+ ", Expected Pending Stock value (Pending Stock Value Before Creating Order + Ordered Quantity) After Create Order is: "+(MethodsOrderCancelCreateOrder.varPendingStockBeforeCreateOrder+MethodsOrderCancelCreateOrder.varOrderedQuantity)+ ", But Actual Pending Stock value After Create Order is: "+MethodsOrderCancelCreateOrder.varPendingStockAfterCreateOrder+". Incorrect");
	    	softAssert.fail("Pending Stock value Before Create Order is: "+MethodsOrderCancelCreateOrder.varPendingStockBeforeCreateOrder+", Ordered Quantity is: "+MethodsOrderCancelCreateOrder.varOrderedQuantity+ ", Expected Pending Stock value (Pending Stock Value Before Creating Order + Ordered Quantity) After Create Order is: "+(MethodsOrderCancelCreateOrder.varPendingStockBeforeCreateOrder+MethodsOrderCancelCreateOrder.varOrderedQuantity)+ ", But Actual Pending Stock value After Create Order is: "+MethodsOrderCancelCreateOrder.varPendingStockAfterCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderCancelCreateOrder.varTotalDemandAfterCreateOrder==(MethodsOrderCancelCreateOrder.varTotalDemandBeforeCreateOrder+MethodsOrderCancelCreateOrder.varOrderedQuantity)){
	    	test.log(Status.PASS, "Total Demand value Before Create Order is: "+MethodsOrderCancelCreateOrder.varTotalDemandBeforeCreateOrder+", Ordered Quantity is: "+MethodsOrderCancelCreateOrder.varOrderedQuantity+ ", Expected Total Demand value (Total Demand Value Before Creating Order + Ordered Quantity) After Create Order is: "+(MethodsOrderCancelCreateOrder.varTotalDemandBeforeCreateOrder+MethodsOrderCancelCreateOrder.varOrderedQuantity)+ ", And Actual Total Demand value After Create Order is: "+MethodsOrderCancelCreateOrder.varTotalDemandAfterCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Total Demand value Before Create Order is: "+MethodsOrderCancelCreateOrder.varTotalDemandBeforeCreateOrder+", Ordered Quantity is: "+MethodsOrderCancelCreateOrder.varOrderedQuantity+ ", Expected Total Demand value (Total Demand Value Before Creating Order + Ordered Quantity) After Create Order is: "+(MethodsOrderCancelCreateOrder.varTotalDemandBeforeCreateOrder+MethodsOrderCancelCreateOrder.varOrderedQuantity)+ ", But Actual Total Demand value After Create Order is: "+MethodsOrderCancelCreateOrder.varTotalDemandAfterCreateOrder+". Incorrect");
	    	softAssert.fail("Total Demand value Before Create Order is: "+MethodsOrderCancelCreateOrder.varTotalDemandBeforeCreateOrder+", Ordered Quantity is: "+MethodsOrderCancelCreateOrder.varOrderedQuantity+ ", Expected Total Demand value (Pending Stock Value Before Creating Order + Ordered Quantity) After Create Order is: "+(MethodsOrderCancelCreateOrder.varTotalDemandBeforeCreateOrder+MethodsOrderCancelCreateOrder.varOrderedQuantity)+ ", But Actual Total Demand value After Create Order is: "+MethodsOrderCancelCreateOrder.varTotalDemandAfterCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderCancelCreateOrder.varAvailableQuantityAfterCreateOrder==MethodsOrderCancelCreateOrder.varAvailableQuantityBeforeCreateOrder){
	    	test.log(Status.PASS, "Expected Available Quantity value (Available Quantity value After Create Order = Available Quantity value Before Create Order) After Create Order is: "+MethodsOrderCancelCreateOrder.varAvailableQuantityBeforeCreateOrder+" And Actual Available Quantity value After Create Order is: "+MethodsOrderCancelCreateOrder.varAvailableQuantityAfterCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Available Quantity value (Available Quantity value After Create Order = Available Quantity value Before Create Order) After Create Order is: "+MethodsOrderCancelCreateOrder.varAvailableQuantityBeforeCreateOrder+" But Actual Available Quantity value After Create Order is: "+MethodsOrderCancelCreateOrder.varAvailableQuantityAfterCreateOrder+". InCorrect");
	    	softAssert.fail("Expected Available Quantity value (Available Quantity value After Create Order = Available Quantity value Before Create Order) After Create Order is: "+MethodsOrderCancelCreateOrder.varAvailableQuantityBeforeCreateOrder+" But Actual Available Quantity value After Create Order is: "+MethodsOrderCancelCreateOrder.varAvailableQuantityAfterCreateOrder+". InCorrect");
	    }
	    
	    if(MethodsOrderCancelCreateOrder.varStockAfterCreateOrder==MethodsOrderCancelCreateOrder.varStockBeforeCreateOrder){
	    	test.log(Status.PASS, "Expected Stock value (Stock value After Create Order = Stock value Before Create Order) After Create Order is: "+MethodsOrderCancelCreateOrder.varStockBeforeCreateOrder+" And Actual Stock value After Create Order is: "+MethodsOrderCancelCreateOrder.varStockAfterCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Stock value (Stock value After Create Order = Stock value Before Create Order) After Create Order is: "+MethodsOrderCancelCreateOrder.varStockBeforeCreateOrder+" But Actual Stock value After Create Order is: "+MethodsOrderCancelCreateOrder.varStockAfterCreateOrder+". InCorrect");
	    	softAssert.fail("Expected Stock value (Stock value After Create Order = Stock value Before Create Order) After Create Order is: "+MethodsOrderCancelCreateOrder.varStockBeforeCreateOrder+" But Actual Stock value After Create Order is: "+MethodsOrderCancelCreateOrder.varStockAfterCreateOrder+". InCorrect");
	    }
	    
	    if(MethodsOrderCancelCreateOrder.varIntransientStockAfterCreateOrder==MethodsOrderCancelCreateOrder.varIntransientStockBeforeCreateOrder){
	    	test.log(Status.PASS, "Expected Intransient Stock value (Intransient Stock value After Create Order = Intransient Stock value Before Create Order) After Create Order is: "+MethodsOrderCancelCreateOrder.varIntransientStockBeforeCreateOrder+" And Actual Intransient Stock value After Create Order is: "+MethodsOrderCancelCreateOrder.varIntransientStockAfterCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Intransient Stock value (Intransient Stock value After Create Order = Intransient Stock value Before Create Order) After Create Order is: "+MethodsOrderCancelCreateOrder.varIntransientStockBeforeCreateOrder+" But Actual Intransient Stock value After Create Order is: "+MethodsOrderCancelCreateOrder.varIntransientStockAfterCreateOrder+". InCorrect");
	    	softAssert.fail("Expected Intransient Stock value (Intransient Stock value After Create Order = Intransient Stock value Before Create Order) After Create Order is: "+MethodsOrderCancelCreateOrder.varIntransientStockBeforeCreateOrder+" But Actual Intransient Stock value After Create Order is: "+MethodsOrderCancelCreateOrder.varIntransientStockAfterCreateOrder+". InCorrect");
	    }
	    
	    if(MethodsOrderCancelCreateOrder.varAvailableStockAfterCreateOrder==MethodsOrderCancelCreateOrder.varAvailableStockBeforeCreateOrder){
	    	test.log(Status.PASS, "Expected Available Stock value (Available Stock value After Create Order = Available Stock value Before Create Order) After Create Order is: "+MethodsOrderCancelCreateOrder.varAvailableStockBeforeCreateOrder+" And Actual Available Stock value After Create Order is: "+MethodsOrderCancelCreateOrder.varAvailableStockAfterCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Available Stock value (Available Stock value After Create Order = Available Stock value Before Create Order) After Create Order is: "+MethodsOrderCancelCreateOrder.varAvailableStockBeforeCreateOrder+" But Actual Available Stock value After Create Order is: "+MethodsOrderCancelCreateOrder.varAvailableStockAfterCreateOrder+". InCorrect");
	    	softAssert.fail("Expected Available Stock value (Available Stock value After Create Order = Available Stock value Before Create Order) After Create Order is: "+MethodsOrderCancelCreateOrder.varAvailableStockBeforeCreateOrder+" But Actual Available Stock value After Create Order is: "+MethodsOrderCancelCreateOrder.varAvailableStockAfterCreateOrder+". InCorrect");
	    }
	    
	    if(MethodsOrderCancelCreateOrder.varUsedQuantityAfterCreateOrder==MethodsOrderCancelCreateOrder.varUsedQuantityBeforeCreateOrder){
	    	test.log(Status.PASS, "Expected Used Quantity value (Used Quantity value After Create Order = Used Quantity value Before Create Order) After Create Order is: "+MethodsOrderCancelCreateOrder.varUsedQuantityBeforeCreateOrder+" And Actual Available Stock value After Create Order is: "+MethodsOrderCancelCreateOrder.varUsedQuantityAfterCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Used Quantity value (Used Quantity value After Create Order = Used Quantity value Before Create Order) After Create Order is: "+MethodsOrderCancelCreateOrder.varUsedQuantityBeforeCreateOrder+" But Actual Available Stock value After Create Order is: "+MethodsOrderCancelCreateOrder.varUsedQuantityAfterCreateOrder+". InCorrect");
	    	softAssert.fail("Expected Used Quantity value (Used Quantity value After Create Order = Used Quantity value Before Create Order) After Create Order is: "+MethodsOrderCancelCreateOrder.varUsedQuantityBeforeCreateOrder+" But Actual Available Stock value After Create Order is: "+MethodsOrderCancelCreateOrder.varUsedQuantityAfterCreateOrder+". InCorrect");
	    }
	    
	    softAssert.assertAll();
	}
	
	
	
	@Test(dependsOnMethods = "testOrderCancelCreateOrderInventoryDetailsAfterCreateOrder", groups = {"OrderCancelCreateOrder"})
	public void testOrderCancelCreateOrderCancelOrder(){
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderCancelCreateOrder.methodOrderCancelCreateOrderCancelOrder();
        
		TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    TestHelper.validateStatus(test, response, "CANCELLED");
	    TestHelper.validateId(test, response);
	}
	
	
	
	@Test(dependsOnMethods = "testOrderCancelCreateOrderCancelOrder",groups = {"OrderCancelCreateOrder"})
	public void testOrderCancelCreateOrderInventoryDetailsAfterCancelOrder(){
		SoftAssert softAssert = new SoftAssert();
		
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderCancelCreateOrder.methodOrderCancelCreateOrderInventoryDetailsAfterCancelOrder();
        
		TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    
	    if(MethodsOrderCancelCreateOrder.varPendingStockAfterCancelOrder == MethodsOrderCancelCreateOrder.varPendingStockBeforeCreateOrder){
	        test.log(Status.PASS, "Expected Pending Stock value After Cancel Order is: " + MethodsOrderCancelCreateOrder.varPendingStockBeforeCreateOrder + " And Actual Pending Stock value After Cancel Order is: " + MethodsOrderCancelCreateOrder.varPendingStockAfterCancelOrder + ". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Pending Stock value After Cancel Order is: " + MethodsOrderCancelCreateOrder.varPendingStockBeforeCreateOrder + " But Actual Pending Stock value After Cancel Order is: " + MethodsOrderCancelCreateOrder.varPendingStockAfterCancelOrder + ". Incorrect");
	        softAssert.fail("Expected Pending Stock value After Cancel Order is: " + MethodsOrderCancelCreateOrder.varPendingStockBeforeCreateOrder + " But Actual Pending Stock value After Cancel Order is: " + MethodsOrderCancelCreateOrder.varPendingStockAfterCancelOrder + ". Incorrect");
	    }

	    if(MethodsOrderCancelCreateOrder.varTotalDemandAfterCancelOrder == MethodsOrderCancelCreateOrder.varTotalDemandBeforeCreateOrder){
	        test.log(Status.PASS, "Expected Total Demand value After Cancel Order is: " + MethodsOrderCancelCreateOrder.varTotalDemandBeforeCreateOrder + " And Actual Total Demand value After Cancel Order is: " + MethodsOrderCancelCreateOrder.varTotalDemandAfterCancelOrder + ". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Total Demand value After Cancel Order is: " + MethodsOrderCancelCreateOrder.varTotalDemandBeforeCreateOrder + " But Actual Total Demand value After Cancel Order is: " + MethodsOrderCancelCreateOrder.varTotalDemandAfterCancelOrder + ". Incorrect");
	        softAssert.fail("Expected Total Demand value After Cancel Order is: " + MethodsOrderCancelCreateOrder.varTotalDemandBeforeCreateOrder + " But Actual Total Demand value After Cancel Order is: " + MethodsOrderCancelCreateOrder.varTotalDemandAfterCancelOrder + ". Incorrect");
	    }

	    if(MethodsOrderCancelCreateOrder.varAvailableQuantityAfterCancelOrder == MethodsOrderCancelCreateOrder.varAvailableQuantityBeforeCreateOrder){
	        test.log(Status.PASS, "Expected Available Quantity value (Available Quantity value After Cancel Order = Available Quantity value Before Cancel Order) After Cancel Order is: " + MethodsOrderCancelCreateOrder.varAvailableQuantityBeforeCreateOrder + " And Actual Available Quantity value After Cancel Order is: " + MethodsOrderCancelCreateOrder.varAvailableQuantityAfterCancelOrder + ". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Available Quantity value (Available Quantity value After Cancel Order = Available Quantity value Before Cancel Order) After Cancel Order is: " + MethodsOrderCancelCreateOrder.varAvailableQuantityBeforeCreateOrder + " But Actual Available Quantity value After Cancel Order is: " + MethodsOrderCancelCreateOrder.varAvailableQuantityAfterCancelOrder + ". Incorrect");
	        softAssert.fail("Expected Available Quantity value (Available Quantity value After Cancel Order = Available Quantity value Before Cancel Order) After Cancel Order is: " + MethodsOrderCancelCreateOrder.varAvailableQuantityBeforeCreateOrder + " But Actual Available Quantity value After Cancel Order is: " + MethodsOrderCancelCreateOrder.varAvailableQuantityAfterCancelOrder + ". Incorrect");
	    }

	    if(MethodsOrderCancelCreateOrder.varStockAfterCancelOrder == MethodsOrderCancelCreateOrder.varStockBeforeCreateOrder){
	        test.log(Status.PASS, "Expected Stock value (Stock value After Cancel Order = Stock value Before Cancel Order) After Cancel Order is: " + MethodsOrderCancelCreateOrder.varStockBeforeCreateOrder + " And Actual Stock value After Cancel Order is: " + MethodsOrderCancelCreateOrder.varStockAfterCancelOrder + ". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Stock value (Stock value After Cancel Order = Stock value Before Cancel Order) After Cancel Order is: " + MethodsOrderCancelCreateOrder.varStockBeforeCreateOrder + " But Actual Stock value After Cancel Order is: " + MethodsOrderCancelCreateOrder.varStockAfterCancelOrder + ". Incorrect");
	        softAssert.fail("Expected Stock value (Stock value After Cancel Order = Stock value Before Cancel Order) After Cancel Order is: " + MethodsOrderCancelCreateOrder.varStockBeforeCreateOrder + " But Actual Stock value After Cancel Order is: " + MethodsOrderCancelCreateOrder.varStockAfterCancelOrder + ". Incorrect");
	    }

	    if(MethodsOrderCancelCreateOrder.varIntransientStockAfterCancelOrder == MethodsOrderCancelCreateOrder.varIntransientStockBeforeCreateOrder){
	        test.log(Status.PASS, "Expected Intransient Stock value (Intransient Stock value After Cancel Order = Intransient Stock value Before Cancel Order) After Cancel Order is: " + MethodsOrderCancelCreateOrder.varIntransientStockBeforeCreateOrder + " And Actual Intransient Stock value After Cancel Order is: " + MethodsOrderCancelCreateOrder.varIntransientStockAfterCancelOrder + ". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Intransient Stock value (Intransient Stock value After Cancel Order = Intransient Stock value Before Cancel Order) After Cancel Order is: " + MethodsOrderCancelCreateOrder.varIntransientStockBeforeCreateOrder + " But Actual Intransient Stock value After Cancel Order is: " + MethodsOrderCancelCreateOrder.varIntransientStockAfterCancelOrder + ". Incorrect");
	        softAssert.fail("Expected Intransient Stock value (Intransient Stock value After Cancel Order = Intransient Stock value Before Cancel Order) After Cancel Order is: " + MethodsOrderCancelCreateOrder.varIntransientStockBeforeCreateOrder + " But Actual Intransient Stock value After Cancel Order is: " + MethodsOrderCancelCreateOrder.varIntransientStockAfterCancelOrder + ". Incorrect");
	    }

	    if(MethodsOrderCancelCreateOrder.varAvailableStockAfterCancelOrder == MethodsOrderCancelCreateOrder.varAvailableStockBeforeCreateOrder){
	        test.log(Status.PASS, "Expected Available Stock value (Available Stock value After Cancel Order = Available Stock value Before Cancel Order) After Cancel Order is: " + MethodsOrderCancelCreateOrder.varAvailableStockBeforeCreateOrder + " And Actual Available Stock value After Cancel Order is: " + MethodsOrderCancelCreateOrder.varAvailableStockAfterCancelOrder + ". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Available Stock value (Available Stock value After Cancel Order = Available Stock value Before Cancel Order) After Cancel Order is: " + MethodsOrderCancelCreateOrder.varAvailableStockBeforeCreateOrder + " But Actual Available Stock value After Cancel Order is: " + MethodsOrderCancelCreateOrder.varAvailableStockAfterCancelOrder + ". Incorrect");
	        softAssert.fail("Expected Available Stock value (Available Stock value After Cancel Order = Available Stock value Before Cancel Order) After Cancel Order is: " + MethodsOrderCancelCreateOrder.varAvailableStockBeforeCreateOrder + " But Actual Available Stock value After Cancel Order is: " + MethodsOrderCancelCreateOrder.varAvailableStockAfterCancelOrder + ". Incorrect");
	    }

	    if(MethodsOrderCancelCreateOrder.varUsedQuantityAfterCancelOrder == MethodsOrderCancelCreateOrder.varUsedQuantityBeforeCreateOrder){
	        test.log(Status.PASS, "Expected Used Quantity value (Used Quantity value After Cancel Order = Used Quantity value Before Cancel Order) After Cancel Order is: " + MethodsOrderCancelCreateOrder.varUsedQuantityBeforeCreateOrder + " And Actual Used Quantity value After Cancel Order is: " + MethodsOrderCancelCreateOrder.varUsedQuantityAfterCancelOrder + ". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Used Quantity value (Used Quantity value After Cancel Order = Used Quantity value Before Cancel Order) After Cancel Order is: " + MethodsOrderCancelCreateOrder.varUsedQuantityBeforeCreateOrder + " But Actual Used Quantity value After Cancel Order is: " + MethodsOrderCancelCreateOrder.varUsedQuantityAfterCancelOrder + ". Incorrect");
	        softAssert.fail("Expected Used Quantity value (Used Quantity value After Cancel Order = Used Quantity value Before Cancel Order) After Cancel Order is: " + MethodsOrderCancelCreateOrder.varUsedQuantityBeforeCreateOrder + " But Actual Used Quantity value After Cancel Order is: " + MethodsOrderCancelCreateOrder.varUsedQuantityAfterCancelOrder + ". Incorrect");
	    }
	    
	    softAssert.assertAll();
	}
}
