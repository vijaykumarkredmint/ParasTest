package orderCancelBatchAssign;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import allCommonData.TestHelper;
import io.restassured.response.Response;
import utilities.ExtentReportManager;

public class TestsOrderCancelBatchAssign {
	@Test(priority = 1,groups = {"OrderCancelBatchAssign"})
	public void testOrderCancelBatchAssignInventoryDetailsBeforeCreateOrder(){
		SoftAssert softAssert = new SoftAssert();
		
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderCancelBatchAssign.methodOrderCancelBatchAssignInventoryDetailsBeforeCreateOrder();
        
		TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    
	    if(MethodsOrderCancelBatchAssign.varPendingStockBeforeCreateOrder>=0){
	    	test.log(Status.PASS, "Expected Pending Stock value before Create Order should be long number "+ "And Actual is: "+MethodsOrderCancelBatchAssign.varPendingStockBeforeCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Pending Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderCancelBatchAssign.varPendingStockBeforeCreateOrder+". Incorrect");
	    	Assert.fail("Expected Pending Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderCancelBatchAssign.varPendingStockBeforeCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderCancelBatchAssign.varTotalDemandBeforeCreateOrder>=0){
	    	test.log(Status.PASS, "Expected Total Demand value before Create Order should be long number "+ "And Actual is: "+MethodsOrderCancelBatchAssign.varTotalDemandBeforeCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Total Demand value before Create Order should be long number "+ "But Actual is: "+MethodsOrderCancelBatchAssign.varTotalDemandBeforeCreateOrder+". Incorrect");
	    	Assert.fail("Expected Total Demand value should be before Create Order long number "+ "But Actual is: "+MethodsOrderCancelBatchAssign.varTotalDemandBeforeCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderCancelBatchAssign.varStockBeforeCreateOrder>=0){
	    	test.log(Status.PASS, "Expected Stock value before Create Order should be long number "+ "And Actual is: "+MethodsOrderCancelBatchAssign.varStockBeforeCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderCancelBatchAssign.varStockBeforeCreateOrder+". Incorrect");
	    	Assert.fail("Expected Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderCancelBatchAssign.varStockBeforeCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderCancelBatchAssign.varIntransientStockBeforeCreateOrder>=0){
	    	test.log(Status.PASS, "Expected Intransient Stock value before Create Order should be long number "+ "And Actual is: "+MethodsOrderCancelBatchAssign.varIntransientStockBeforeCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Intransient Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderCancelBatchAssign.varIntransientStockBeforeCreateOrder+". Incorrect");
	    	Assert.fail("Expected Intransient Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderCancelBatchAssign.varIntransientStockBeforeCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderCancelBatchAssign.varAvailableStockBeforeCreateOrder>=0){
	    	test.log(Status.PASS, "Expected Available Stock value before Create Order should be long number "+ "And Actual is: "+MethodsOrderCancelBatchAssign.varAvailableStockBeforeCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Available Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderCancelBatchAssign.varAvailableStockBeforeCreateOrder+". Incorrect");
	    	Assert.fail("Expected Available Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderCancelBatchAssign.varAvailableStockBeforeCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderCancelBatchAssign.varUsedQuantityBeforeCreateOrder>=0){
	    	test.log(Status.PASS, "Expected Used Quantity value before Create Order should be long number "+ "And Actual is: "+MethodsOrderCancelBatchAssign.varUsedQuantityBeforeCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Used Quantity value before Create Order should be long number "+ "But Actual is: "+MethodsOrderCancelBatchAssign.varUsedQuantityBeforeCreateOrder+". Incorrect");
	    	Assert.fail("Expected Used Quantity value should be before Create Order long number "+ "But Actual is: "+MethodsOrderCancelBatchAssign.varUsedQuantityBeforeCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderCancelBatchAssign.varAvailableQuantityBeforeCreateOrder>=0){
	    	test.log(Status.PASS, "Expected Available Quantity value before Create Order should be long number "+ "And Actual is: "+MethodsOrderCancelBatchAssign.varAvailableQuantityBeforeCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Available Quantity value before Create Order should be long number "+ "But Actual is: "+MethodsOrderCancelBatchAssign.varAvailableQuantityBeforeCreateOrder+". Incorrect");
	    	Assert.fail("Expected Available Quantity value should be before Create Order long number "+ "But Actual is: "+MethodsOrderCancelBatchAssign.varAvailableQuantityBeforeCreateOrder+". Incorrect");
	    }
	    
	    softAssert.assertAll();
	}
	
	
	
	@Test(dependsOnMethods = "testOrderCancelBatchAssignInventoryDetailsBeforeCreateOrder", groups = {"OrderCancelBatchAssign"})
	public void testOrderCancelBatchAssignCreateOrder(){
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderCancelBatchAssign.methodOrderCancelBatchAssignCreateOrder();
        
		TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    TestHelper.validateStatus(test, response, "Created");
	    TestHelper.validateId(test, response);
	}

	
	
	@Test(dependsOnMethods = "testOrderCancelBatchAssignCreateOrder",groups = {"OrderCancelBatchAssign"})
	public void testOrderCancelBatchAssignInventoryDetailsAfterCreateOrder(){
		SoftAssert softAssert = new SoftAssert();
		
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderCancelBatchAssign.methodOrderCancelBatchAssignInventoryDetailsAfterCreateOrder();
        
		TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    
	    if(MethodsOrderCancelBatchAssign.varPendingStockAfterCreateOrder==(MethodsOrderCancelBatchAssign.varPendingStockBeforeCreateOrder+MethodsOrderCancelBatchAssign.varOrderedQuantity)){
	    	test.log(Status.PASS, "Pending Stock value Before Create Order is: "+MethodsOrderCancelBatchAssign.varPendingStockBeforeCreateOrder+", Ordered Quantity is: "+MethodsOrderCancelBatchAssign.varOrderedQuantity+ ", Expected Pending Stock value (Pending Stock Value Before Creating Order + Ordered Quantity) After Create Order is: "+(MethodsOrderCancelBatchAssign.varPendingStockBeforeCreateOrder+MethodsOrderCancelBatchAssign.varOrderedQuantity)+ ", And Actual Pending Stock value After Create Order is: "+MethodsOrderCancelBatchAssign.varPendingStockAfterCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Pending Stock value Before Create Order is: "+MethodsOrderCancelBatchAssign.varPendingStockBeforeCreateOrder+", Ordered Quantity is: "+MethodsOrderCancelBatchAssign.varOrderedQuantity+ ", Expected Pending Stock value (Pending Stock Value Before Creating Order + Ordered Quantity) After Create Order is: "+(MethodsOrderCancelBatchAssign.varPendingStockBeforeCreateOrder+MethodsOrderCancelBatchAssign.varOrderedQuantity)+ ", But Actual Pending Stock value After Create Order is: "+MethodsOrderCancelBatchAssign.varPendingStockAfterCreateOrder+". Incorrect");
	    	Assert.fail("Pending Stock value Before Create Order is: "+MethodsOrderCancelBatchAssign.varPendingStockBeforeCreateOrder+", Ordered Quantity is: "+MethodsOrderCancelBatchAssign.varOrderedQuantity+ ", Expected Pending Stock value (Pending Stock Value Before Creating Order + Ordered Quantity) After Create Order is: "+(MethodsOrderCancelBatchAssign.varPendingStockBeforeCreateOrder+MethodsOrderCancelBatchAssign.varOrderedQuantity)+ ", But Actual Pending Stock value After Create Order is: "+MethodsOrderCancelBatchAssign.varPendingStockAfterCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderCancelBatchAssign.varTotalDemandAfterCreateOrder==(MethodsOrderCancelBatchAssign.varTotalDemandBeforeCreateOrder+MethodsOrderCancelBatchAssign.varOrderedQuantity)){
	    	test.log(Status.PASS, "Total Demand value Before Create Order is: "+MethodsOrderCancelBatchAssign.varTotalDemandBeforeCreateOrder+", Ordered Quantity is: "+MethodsOrderCancelBatchAssign.varOrderedQuantity+ ", Expected Total Demand value (Total Demand Value Before Creating Order + Ordered Quantity) After Create Order is: "+(MethodsOrderCancelBatchAssign.varTotalDemandBeforeCreateOrder+MethodsOrderCancelBatchAssign.varOrderedQuantity)+ ", And Actual Total Demand value After Create Order is: "+MethodsOrderCancelBatchAssign.varTotalDemandAfterCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Total Demand value Before Create Order is: "+MethodsOrderCancelBatchAssign.varTotalDemandBeforeCreateOrder+", Ordered Quantity is: "+MethodsOrderCancelBatchAssign.varOrderedQuantity+ ", Expected Total Demand value (Total Demand Value Before Creating Order + Ordered Quantity) After Create Order is: "+(MethodsOrderCancelBatchAssign.varTotalDemandBeforeCreateOrder+MethodsOrderCancelBatchAssign.varOrderedQuantity)+ ", But Actual Total Demand value After Create Order is: "+MethodsOrderCancelBatchAssign.varTotalDemandAfterCreateOrder+". Incorrect");
	    	Assert.fail("Total Demand value Before Create Order is: "+MethodsOrderCancelBatchAssign.varTotalDemandBeforeCreateOrder+", Ordered Quantity is: "+MethodsOrderCancelBatchAssign.varOrderedQuantity+ ", Expected Total Demand value (Pending Stock Value Before Creating Order + Ordered Quantity) After Create Order is: "+(MethodsOrderCancelBatchAssign.varTotalDemandBeforeCreateOrder+MethodsOrderCancelBatchAssign.varOrderedQuantity)+ ", But Actual Total Demand value After Create Order is: "+MethodsOrderCancelBatchAssign.varTotalDemandAfterCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderCancelBatchAssign.varAvailableQuantityAfterCreateOrder==MethodsOrderCancelBatchAssign.varAvailableQuantityBeforeCreateOrder){
	    	test.log(Status.PASS, "Expected Available Quantity value (Available Quantity value After Create Order = Available Quantity value Before Create Order) After Create Order is: "+MethodsOrderCancelBatchAssign.varAvailableQuantityBeforeCreateOrder+" And Actual Available Quantity value After Create Order is: "+MethodsOrderCancelBatchAssign.varAvailableQuantityAfterCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Available Quantity value (Available Quantity value After Create Order = Available Quantity value Before Create Order) After Create Order is: "+MethodsOrderCancelBatchAssign.varAvailableQuantityBeforeCreateOrder+" But Actual Available Quantity value After Create Order is: "+MethodsOrderCancelBatchAssign.varAvailableQuantityAfterCreateOrder+". InCorrect");
	    	Assert.fail("Expected Available Quantity value (Available Quantity value After Create Order = Available Quantity value Before Create Order) After Create Order is: "+MethodsOrderCancelBatchAssign.varAvailableQuantityBeforeCreateOrder+" But Actual Available Quantity value After Create Order is: "+MethodsOrderCancelBatchAssign.varAvailableQuantityAfterCreateOrder+". InCorrect");
	    }
	    
	    if(MethodsOrderCancelBatchAssign.varStockAfterCreateOrder==MethodsOrderCancelBatchAssign.varStockBeforeCreateOrder){
	    	test.log(Status.PASS, "Expected Stock value (Stock value After Create Order = Stock value Before Create Order) After Create Order is: "+MethodsOrderCancelBatchAssign.varStockBeforeCreateOrder+" And Actual Stock value After Create Order is: "+MethodsOrderCancelBatchAssign.varStockAfterCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Stock value (Stock value After Create Order = Stock value Before Create Order) After Create Order is: "+MethodsOrderCancelBatchAssign.varStockBeforeCreateOrder+" But Actual Stock value After Create Order is: "+MethodsOrderCancelBatchAssign.varStockAfterCreateOrder+". InCorrect");
	    	Assert.fail("Expected Stock value (Stock value After Create Order = Stock value Before Create Order) After Create Order is: "+MethodsOrderCancelBatchAssign.varStockBeforeCreateOrder+" But Actual Stock value After Create Order is: "+MethodsOrderCancelBatchAssign.varStockAfterCreateOrder+". InCorrect");
	    }
	    
	    if(MethodsOrderCancelBatchAssign.varIntransientStockAfterCreateOrder==MethodsOrderCancelBatchAssign.varIntransientStockBeforeCreateOrder){
	    	test.log(Status.PASS, "Expected Intransient Stock value (Intransient Stock value After Create Order = Intransient Stock value Before Create Order) After Create Order is: "+MethodsOrderCancelBatchAssign.varIntransientStockBeforeCreateOrder+" And Actual Intransient Stock value After Create Order is: "+MethodsOrderCancelBatchAssign.varIntransientStockAfterCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Intransient Stock value (Intransient Stock value After Create Order = Intransient Stock value Before Create Order) After Create Order is: "+MethodsOrderCancelBatchAssign.varIntransientStockBeforeCreateOrder+" But Actual Intransient Stock value After Create Order is: "+MethodsOrderCancelBatchAssign.varIntransientStockAfterCreateOrder+". InCorrect");
	    	Assert.fail("Expected Intransient Stock value (Intransient Stock value After Create Order = Intransient Stock value Before Create Order) After Create Order is: "+MethodsOrderCancelBatchAssign.varIntransientStockBeforeCreateOrder+" But Actual Intransient Stock value After Create Order is: "+MethodsOrderCancelBatchAssign.varIntransientStockAfterCreateOrder+". InCorrect");
	    }
	    
	    if(MethodsOrderCancelBatchAssign.varAvailableStockAfterCreateOrder==MethodsOrderCancelBatchAssign.varAvailableStockBeforeCreateOrder){
	    	test.log(Status.PASS, "Expected Available Stock value (Available Stock value After Create Order = Available Stock value Before Create Order) After Create Order is: "+MethodsOrderCancelBatchAssign.varAvailableStockBeforeCreateOrder+" And Actual Available Stock value After Create Order is: "+MethodsOrderCancelBatchAssign.varAvailableStockAfterCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Available Stock value (Available Stock value After Create Order = Available Stock value Before Create Order) After Create Order is: "+MethodsOrderCancelBatchAssign.varAvailableStockBeforeCreateOrder+" But Actual Available Stock value After Create Order is: "+MethodsOrderCancelBatchAssign.varAvailableStockAfterCreateOrder+". InCorrect");
	    	Assert.fail("Expected Available Stock value (Available Stock value After Create Order = Available Stock value Before Create Order) After Create Order is: "+MethodsOrderCancelBatchAssign.varAvailableStockBeforeCreateOrder+" But Actual Available Stock value After Create Order is: "+MethodsOrderCancelBatchAssign.varAvailableStockAfterCreateOrder+". InCorrect");
	    }
	    
	    if(MethodsOrderCancelBatchAssign.varUsedQuantityAfterCreateOrder==MethodsOrderCancelBatchAssign.varUsedQuantityBeforeCreateOrder){
	    	test.log(Status.PASS, "Expected Used Quantity value (Used Quantity value After Create Order = Used Quantity value Before Create Order) After Create Order is: "+MethodsOrderCancelBatchAssign.varUsedQuantityBeforeCreateOrder+" And Actual Available Stock value After Create Order is: "+MethodsOrderCancelBatchAssign.varUsedQuantityAfterCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Used Quantity value (Used Quantity value After Create Order = Used Quantity value Before Create Order) After Create Order is: "+MethodsOrderCancelBatchAssign.varUsedQuantityBeforeCreateOrder+" But Actual Available Stock value After Create Order is: "+MethodsOrderCancelBatchAssign.varUsedQuantityAfterCreateOrder+". InCorrect");
	    	Assert.fail("Expected Used Quantity value (Used Quantity value After Create Order = Used Quantity value Before Create Order) After Create Order is: "+MethodsOrderCancelBatchAssign.varUsedQuantityBeforeCreateOrder+" But Actual Available Stock value After Create Order is: "+MethodsOrderCancelBatchAssign.varUsedQuantityAfterCreateOrder+". InCorrect");
	    }
	    
	    if(MethodsOrderCancelBatchAssign.varAvailableQuantityAfterCreateOrder>=MethodsOrderCancelBatchAssign.varOrderedQuantity){
	    	test.log(Status.PASS, "Available Quantity value After Create Order is: "+MethodsOrderCancelBatchAssign.varAvailableQuantityAfterCreateOrder + ", Ordered Quantity is: " + MethodsOrderCancelBatchAssign.varOrderedQuantity + ", Available Quantity value After Create Order >= Ordered Quantity. Correct");
	    } else {
	    	test.log(Status.FAIL, "Add Inventory, Available Quantity value After Create Order is: "+MethodsOrderCancelBatchAssign.varAvailableQuantityAfterCreateOrder + ", Ordered Quantity is: " + MethodsOrderCancelBatchAssign.varOrderedQuantity + ", Available Quantity value After Create Order >= Ordered Quantity. Incorrect");
	    	Assert.fail("Add Inventory, Available Quantity value After Create Order is: "+MethodsOrderCancelBatchAssign.varAvailableQuantityAfterCreateOrder + ", Ordered Quantity is: " + MethodsOrderCancelBatchAssign.varOrderedQuantity + ", Available Quantity value After Create Order >= Ordered Quantity. Incorrect");
	    }
	    
	    softAssert.assertAll();
	}
	
	
	
	@Test(dependsOnMethods = "testOrderCancelBatchAssignInventoryDetailsAfterCreateOrder",groups = {"OrderCancelBatchAssign"})
	public void testOrderCancelBatchAssignBatchAssign(){
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderCancelBatchAssign.methodOrderCancelBatchAssignBatchAssign();
	    
		TestHelper.logDetails(test, response);
		TestHelper.validateStatusCode(test, response, 200);
	    TestHelper.validateStatus(test, response, "BatchAssigned");
	    TestHelper.validateId(test, response);
	}
	
	
	
	@Test(dependsOnMethods = "testOrderCancelBatchAssignBatchAssign",groups = {"OrderCancelBatchAssign"})
	public void testOrderCancelBatchAssignInventoryDetailsAfterBatchAssign(){
		SoftAssert softAssert = new SoftAssert();
		
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderCancelBatchAssign.methodOrderCancelBatchAssignInventoryDetailsAfterBatchAssign();
	    
		TestHelper.logDetails(test, response);
		TestHelper.validateStatusCode(test, response, 200);
		
		if(MethodsOrderCancelBatchAssign.varUsedQuantityAfterBatchAssign==(MethodsOrderCancelBatchAssign.varUsedQuantityAfterCreateOrder+MethodsOrderCancelBatchAssign.varOrderedQuantity)){
	    	test.log(Status.PASS, "Used Quantity value After Create Order is: "+MethodsOrderCancelBatchAssign.varUsedQuantityAfterCreateOrder+", Ordered Quantity is: "+MethodsOrderCancelBatchAssign.varOrderedQuantity+ ", Expected Used Quantity value (Used Quantity value After Create Order + Ordered Quantity) After Batch Assign is: "+(MethodsOrderCancelBatchAssign.varUsedQuantityAfterCreateOrder+MethodsOrderCancelBatchAssign.varOrderedQuantity)+ ", And Actual Used Quantity value value After Batch Assign is: "+MethodsOrderCancelBatchAssign.varUsedQuantityAfterBatchAssign+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Used Quantity value After Create Order is: "+MethodsOrderCancelBatchAssign.varUsedQuantityAfterCreateOrder+", Ordered Quantity is: "+MethodsOrderCancelBatchAssign.varOrderedQuantity+ ", Expected Used Quantity value (Used Quantity value After Create Order + Ordered Quantity) After Batch Assign is: "+(MethodsOrderCancelBatchAssign.varUsedQuantityAfterCreateOrder+MethodsOrderCancelBatchAssign.varOrderedQuantity)+ ", But Actual Used Quantity value value After Batch Assign is: "+MethodsOrderCancelBatchAssign.varUsedQuantityAfterBatchAssign+". Incorrect");
	    	Assert.fail("Used Quantity value After Create Order is: "+MethodsOrderCancelBatchAssign.varUsedQuantityAfterCreateOrder+", Ordered Quantity is: "+MethodsOrderCancelBatchAssign.varOrderedQuantity+ ", Expected Used Quantity value (Used Quantity value After Create Order + Ordered Quantity) After BatchAssign is: "+(MethodsOrderCancelBatchAssign.varUsedQuantityAfterCreateOrder+MethodsOrderCancelBatchAssign.varOrderedQuantity)+ ", But Actual Used Quantity value value After Batch Assign is: "+MethodsOrderCancelBatchAssign.varUsedQuantityAfterBatchAssign+". Incorrect");
	    }
		
		if(MethodsOrderCancelBatchAssign.varAvailableQuantityAfterBatchAssign==(MethodsOrderCancelBatchAssign.varAvailableQuantityAfterCreateOrder-MethodsOrderCancelBatchAssign.varOrderedQuantity)){
	    	test.log(Status.PASS, "Available Quantity value After Create Order is: "+MethodsOrderCancelBatchAssign.varAvailableQuantityAfterCreateOrder+", Ordered Quantity is: "+MethodsOrderCancelBatchAssign.varOrderedQuantity+ ", Expected Available Quantity value (Available Quantity value After Create Order - Ordered Quantity) After Batch Assign is: "+(MethodsOrderCancelBatchAssign.varAvailableQuantityAfterCreateOrder-MethodsOrderCancelBatchAssign.varOrderedQuantity)+ ", And Actual Available Quantity value value After Batch Assign is: "+MethodsOrderCancelBatchAssign.varAvailableQuantityAfterBatchAssign+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Available Quantity value After Create Order is: "+MethodsOrderCancelBatchAssign.varAvailableQuantityAfterCreateOrder+", Ordered Quantity is: "+MethodsOrderCancelBatchAssign.varOrderedQuantity+ ", Expected Available Quantity value (Available Quantity value After Create Order - Ordered Quantity) After Batch Assign is: "+(MethodsOrderCancelBatchAssign.varAvailableQuantityAfterCreateOrder-MethodsOrderCancelBatchAssign.varOrderedQuantity)+ ", But Actual Available Quantity value value After Batch Assign is: "+MethodsOrderCancelBatchAssign.varAvailableQuantityAfterBatchAssign+". Incorrect");
	    	Assert.fail("Available Quantity value After Create Order is: "+MethodsOrderCancelBatchAssign.varAvailableQuantityAfterCreateOrder+", Ordered Quantity is: "+MethodsOrderCancelBatchAssign.varOrderedQuantity+ ", Expected Available Quantity value (Available Quantity value After Create Order - Ordered Quantity) After BatchAssign is: "+(MethodsOrderCancelBatchAssign.varAvailableQuantityAfterCreateOrder-MethodsOrderCancelBatchAssign.varOrderedQuantity)+ ", But Actual Available Quantity value value After Batch Assign is: "+MethodsOrderCancelBatchAssign.varAvailableQuantityAfterBatchAssign+". Incorrect");
	    }
		
	    if(MethodsOrderCancelBatchAssign.varPendingStockAfterBatchAssign==MethodsOrderCancelBatchAssign.varPendingStockAfterCreateOrder){
	    	test.log(Status.PASS, "Expected Pending Stock value (Pending Stock value After Batch Assign = Pending Stock value After Create Order) After Batch Assign is: "+MethodsOrderCancelBatchAssign.varPendingStockAfterCreateOrder+" And Actual Pending Stock value After Batch Assign is: "+MethodsOrderCancelBatchAssign.varPendingStockAfterBatchAssign+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Pending Stock value (Pending Stock value After Batch Assign = Pending Stock value After Create Order) After Batch Assign is: "+MethodsOrderCancelBatchAssign.varPendingStockAfterCreateOrder+" But Actual Pending Stock value After Batch Assign is: "+MethodsOrderCancelBatchAssign.varPendingStockAfterBatchAssign+". InCorrect");
	    	Assert.fail("Expected Pending Stock value (Pending Stock value After Batch Assign = Pending Stock value After Create Order) After Batch Assign is: "+MethodsOrderCancelBatchAssign.varPendingStockAfterCreateOrder+" But Actual Pending Stock value After Batch Assign is: "+MethodsOrderCancelBatchAssign.varPendingStockAfterBatchAssign+". InCorrect");
	    }
	    
	    if(MethodsOrderCancelBatchAssign.varTotalDemandAfterBatchAssign==MethodsOrderCancelBatchAssign.varTotalDemandAfterCreateOrder){
	    	test.log(Status.PASS, "Expected Total Demand value (Total Demand value After Batch Assign = Total Demand value After Create Order) After Batch Assign is: "+MethodsOrderCancelBatchAssign.varTotalDemandAfterCreateOrder+" And Actual Total Demand value After Batch Assign is: "+MethodsOrderCancelBatchAssign.varTotalDemandAfterBatchAssign+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Total Demand value (Total Demand value After Batch Assign = Total Demand value After Create Order) After Batch Assign is: "+MethodsOrderCancelBatchAssign.varTotalDemandAfterCreateOrder+" But Actual Total Demand value After Batch Assign is: "+MethodsOrderCancelBatchAssign.varTotalDemandAfterBatchAssign+". InCorrect");
	    	Assert.fail("Expected Total Demand value (Total Demand value After Batch Assign = Total Demand value After Create Order) After Batch Assign is: "+MethodsOrderCancelBatchAssign.varTotalDemandAfterCreateOrder+" But Actual Total Demand value After Batch Assign is: "+MethodsOrderCancelBatchAssign.varTotalDemandAfterBatchAssign+". InCorrect");
	    }
		
	    if(MethodsOrderCancelBatchAssign.varStockAfterBatchAssign==MethodsOrderCancelBatchAssign.varStockAfterCreateOrder){
	    	test.log(Status.PASS, "Expected Stock value (Stock value After Batch Assign = Stock value After Create Order) After Batch Assign is: "+MethodsOrderCancelBatchAssign.varStockAfterCreateOrder+" And Actual Stock value After Batch Assign is: "+MethodsOrderCancelBatchAssign.varStockAfterBatchAssign+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Stock value (Stock value After Batch Assign = Stock value After Create Order) After Batch Assign is: "+MethodsOrderCancelBatchAssign.varStockAfterCreateOrder+" But Actual Stock value After Batch Assign is: "+MethodsOrderCancelBatchAssign.varStockAfterBatchAssign+". InCorrect");
	    	Assert.fail("Expected Stock value (Stock value After Batch Assign = Stock value After Create Order) After Batch Assign is: "+MethodsOrderCancelBatchAssign.varStockAfterCreateOrder+" But Actual Stock value After Batch Assign is: "+MethodsOrderCancelBatchAssign.varStockAfterBatchAssign+". InCorrect");
	    }
	    
	    if(MethodsOrderCancelBatchAssign.varIntransientStockAfterBatchAssign==MethodsOrderCancelBatchAssign.varIntransientStockAfterCreateOrder){
	    	test.log(Status.PASS, "Expected Intransient Stock value (Intransient Stock value After Batch Assign = Intransient Stock value After Create Order) After Batch Assign is: "+MethodsOrderCancelBatchAssign.varIntransientStockAfterCreateOrder+" And Actual Intransient Stock value After Batch Assign is: "+MethodsOrderCancelBatchAssign.varIntransientStockAfterBatchAssign+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Intransient Stock value (Intransient Stock value After Batch Assign = Intransient Stock value After Create Order) After Batch Assign is: "+MethodsOrderCancelBatchAssign.varIntransientStockAfterCreateOrder+" But Actual Intransient Stock value After Batch Assign is: "+MethodsOrderCancelBatchAssign.varIntransientStockAfterBatchAssign+". InCorrect");
	    	Assert.fail("Expected Intransient Stock value (Intransient Stock value After Batch Assign = Intransient Stock value After Create Order) After Batch Assign is: "+MethodsOrderCancelBatchAssign.varIntransientStockAfterCreateOrder+" But Actual Intransient Stock value After Batch Assign is: "+MethodsOrderCancelBatchAssign.varIntransientStockAfterBatchAssign+". InCorrect");
	    }
	    
	    if(MethodsOrderCancelBatchAssign.varAvailableStockAfterBatchAssign==MethodsOrderCancelBatchAssign.varAvailableStockAfterCreateOrder){
	    	test.log(Status.PASS, "Expected Available Stock value (Available Stock value After Batch Assign = Available Stock value After Create Order) After Batch Assign is: "+MethodsOrderCancelBatchAssign.varAvailableStockAfterCreateOrder+" And Actual Available Stock value After Batch Assign is: "+MethodsOrderCancelBatchAssign.varAvailableStockAfterBatchAssign+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Available Stock value (Available Stock value After Batch Assign = Available Stock value After Create Order) After Batch Assign is: "+MethodsOrderCancelBatchAssign.varAvailableStockAfterCreateOrder+" But Actual Available Stock value After Batch Assign is: "+MethodsOrderCancelBatchAssign.varAvailableStockAfterBatchAssign+". InCorrect");
	    	Assert.fail("Expected Available Stock value (Available Stock value After Batch Assign = Available Stock value After Create Order) After Batch Assign is: "+MethodsOrderCancelBatchAssign.varAvailableStockAfterCreateOrder+" But Actual Available Stock value After Batch Assign is: "+MethodsOrderCancelBatchAssign.varAvailableStockAfterBatchAssign+". InCorrect");
	    }
	    
	    softAssert.assertAll();
	}

	
	
	
	
	
	
	
	
	
	
	
	@Test(dependsOnMethods = "testOrderCancelBatchAssignInventoryDetailsAfterBatchAssign", groups = {"OrderCancelBatchAssign"})
	public void testOrderCancelBatchAssignCancelOrder(){
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderCancelBatchAssign.methodOrderCancelBatchAssignCancelOrder();
        
		TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    TestHelper.validateStatus(test, response, "CANCELLED");
	    TestHelper.validateId(test, response);
	}
	
	
	
//	@Test(dependsOnMethods = "testOrderCancelBatchAssignCancelOrder",groups = {"OrderCancelBatchAssign"})
//	public void testOrderCancelBatchAssignInventoryDetailsAfterCancelOrder(){
//		SoftAssert softAssert = new SoftAssert();
//		
//		ExtentTest test = ExtentReportManager.getTest();
//		Response response = MethodsOrderCancelBatchAssign.methodOrderCancelBatchAssignInventoryDetailsAfterCancelOrder();
//        
//		TestHelper.logDetails(test, response);
//	    TestHelper.validateStatusCode(test, response, 200);
//	    
//	    if(MethodsOrderCancelBatchAssign.varPendingStockAfterCancelOrder == MethodsOrderCancelBatchAssign.varPendingStockBeforeCreateOrder){
//	        test.log(Status.PASS, "Expected Pending Stock value After Cancel Order is: " + MethodsOrderCancelBatchAssign.varPendingStockBeforeCreateOrder + " And Actual Pending Stock value After Cancel Order is: " + MethodsOrderCancelBatchAssign.varPendingStockAfterCancelOrder + ". Correct");
//	    } else {
//	        test.log(Status.FAIL, "Expected Pending Stock value After Cancel Order is: " + MethodsOrderCancelBatchAssign.varPendingStockBeforeCreateOrder + " But Actual Pending Stock value After Cancel Order is: " + MethodsOrderCancelBatchAssign.varPendingStockAfterCancelOrder + ". Incorrect");
//	        softAssert.fail("Expected Pending Stock value After Cancel Order is: " + MethodsOrderCancelBatchAssign.varPendingStockBeforeCreateOrder + " But Actual Pending Stock value After Cancel Order is: " + MethodsOrderCancelBatchAssign.varPendingStockAfterCancelOrder + ". Incorrect");
//	    }
//
//	    if(MethodsOrderCancelBatchAssign.varTotalDemandAfterCancelOrder == MethodsOrderCancelBatchAssign.varTotalDemandBeforeCreateOrder){
//	        test.log(Status.PASS, "Expected Total Demand value After Cancel Order is: " + MethodsOrderCancelBatchAssign.varTotalDemandBeforeCreateOrder + " And Actual Total Demand value After Cancel Order is: " + MethodsOrderCancelBatchAssign.varTotalDemandAfterCancelOrder + ". Correct");
//	    } else {
//	        test.log(Status.FAIL, "Expected Total Demand value After Cancel Order is: " + MethodsOrderCancelBatchAssign.varTotalDemandBeforeCreateOrder + " But Actual Total Demand value After Cancel Order is: " + MethodsOrderCancelBatchAssign.varTotalDemandAfterCancelOrder + ". Incorrect");
//	        softAssert.fail("Expected Total Demand value After Cancel Order is: " + MethodsOrderCancelBatchAssign.varTotalDemandBeforeCreateOrder + " But Actual Total Demand value After Cancel Order is: " + MethodsOrderCancelBatchAssign.varTotalDemandAfterCancelOrder + ". Incorrect");
//	    }
//
//	    if(MethodsOrderCancelBatchAssign.varAvailableQuantityAfterCancelOrder == MethodsOrderCancelBatchAssign.varAvailableQuantityBeforeCreateOrder){
//	        test.log(Status.PASS, "Expected Available Quantity value (Available Quantity value After Cancel Order = Available Quantity value Before Cancel Order) After Cancel Order is: " + MethodsOrderCancelBatchAssign.varAvailableQuantityBeforeCreateOrder + " And Actual Available Quantity value After Cancel Order is: " + MethodsOrderCancelBatchAssign.varAvailableQuantityAfterCancelOrder + ". Correct");
//	    } else {
//	        test.log(Status.FAIL, "Expected Available Quantity value (Available Quantity value After Cancel Order = Available Quantity value Before Cancel Order) After Cancel Order is: " + MethodsOrderCancelBatchAssign.varAvailableQuantityBeforeCreateOrder + " But Actual Available Quantity value After Cancel Order is: " + MethodsOrderCancelBatchAssign.varAvailableQuantityAfterCancelOrder + ". Incorrect");
//	        softAssert.fail("Expected Available Quantity value (Available Quantity value After Cancel Order = Available Quantity value Before Cancel Order) After Cancel Order is: " + MethodsOrderCancelBatchAssign.varAvailableQuantityBeforeCreateOrder + " But Actual Available Quantity value After Cancel Order is: " + MethodsOrderCancelBatchAssign.varAvailableQuantityAfterCancelOrder + ". Incorrect");
//	    }
//
//	    if(MethodsOrderCancelBatchAssign.varStockAfterCancelOrder == MethodsOrderCancelBatchAssign.varStockBeforeCreateOrder){
//	        test.log(Status.PASS, "Expected Stock value (Stock value After Cancel Order = Stock value Before Cancel Order) After Cancel Order is: " + MethodsOrderCancelBatchAssign.varStockBeforeCreateOrder + " And Actual Stock value After Cancel Order is: " + MethodsOrderCancelBatchAssign.varStockAfterCancelOrder + ". Correct");
//	    } else {
//	        test.log(Status.FAIL, "Expected Stock value (Stock value After Cancel Order = Stock value Before Cancel Order) After Cancel Order is: " + MethodsOrderCancelBatchAssign.varStockBeforeCreateOrder + " But Actual Stock value After Cancel Order is: " + MethodsOrderCancelBatchAssign.varStockAfterCancelOrder + ". Incorrect");
//	        softAssert.fail("Expected Stock value (Stock value After Cancel Order = Stock value Before Cancel Order) After Cancel Order is: " + MethodsOrderCancelBatchAssign.varStockBeforeCreateOrder + " But Actual Stock value After Cancel Order is: " + MethodsOrderCancelBatchAssign.varStockAfterCancelOrder + ". Incorrect");
//	    }
//
//	    if(MethodsOrderCancelBatchAssign.varIntransientStockAfterCancelOrder == MethodsOrderCancelBatchAssign.varIntransientStockBeforeCreateOrder){
//	        test.log(Status.PASS, "Expected Intransient Stock value (Intransient Stock value After Cancel Order = Intransient Stock value Before Cancel Order) After Cancel Order is: " + MethodsOrderCancelBatchAssign.varIntransientStockBeforeCreateOrder + " And Actual Intransient Stock value After Cancel Order is: " + MethodsOrderCancelBatchAssign.varIntransientStockAfterCancelOrder + ". Correct");
//	    } else {
//	        test.log(Status.FAIL, "Expected Intransient Stock value (Intransient Stock value After Cancel Order = Intransient Stock value Before Cancel Order) After Cancel Order is: " + MethodsOrderCancelBatchAssign.varIntransientStockBeforeCreateOrder + " But Actual Intransient Stock value After Cancel Order is: " + MethodsOrderCancelBatchAssign.varIntransientStockAfterCancelOrder + ". Incorrect");
//	        softAssert.fail("Expected Intransient Stock value (Intransient Stock value After Cancel Order = Intransient Stock value Before Cancel Order) After Cancel Order is: " + MethodsOrderCancelBatchAssign.varIntransientStockBeforeCreateOrder + " But Actual Intransient Stock value After Cancel Order is: " + MethodsOrderCancelBatchAssign.varIntransientStockAfterCancelOrder + ". Incorrect");
//	    }
//
//	    if(MethodsOrderCancelBatchAssign.varAvailableStockAfterCancelOrder == MethodsOrderCancelBatchAssign.varAvailableStockBeforeCreateOrder){
//	        test.log(Status.PASS, "Expected Available Stock value (Available Stock value After Cancel Order = Available Stock value Before Cancel Order) After Cancel Order is: " + MethodsOrderCancelBatchAssign.varAvailableStockBeforeCreateOrder + " And Actual Available Stock value After Cancel Order is: " + MethodsOrderCancelBatchAssign.varAvailableStockAfterCancelOrder + ". Correct");
//	    } else {
//	        test.log(Status.FAIL, "Expected Available Stock value (Available Stock value After Cancel Order = Available Stock value Before Cancel Order) After Cancel Order is: " + MethodsOrderCancelBatchAssign.varAvailableStockBeforeCreateOrder + " But Actual Available Stock value After Cancel Order is: " + MethodsOrderCancelBatchAssign.varAvailableStockAfterCancelOrder + ". Incorrect");
//	        softAssert.fail("Expected Available Stock value (Available Stock value After Cancel Order = Available Stock value Before Cancel Order) After Cancel Order is: " + MethodsOrderCancelBatchAssign.varAvailableStockBeforeCreateOrder + " But Actual Available Stock value After Cancel Order is: " + MethodsOrderCancelBatchAssign.varAvailableStockAfterCancelOrder + ". Incorrect");
//	    }
//
//	    if(MethodsOrderCancelBatchAssign.varUsedQuantityAfterCancelOrder == MethodsOrderCancelBatchAssign.varUsedQuantityBeforeCreateOrder){
//	        test.log(Status.PASS, "Expected Used Quantity value (Used Quantity value After Cancel Order = Used Quantity value Before Cancel Order) After Cancel Order is: " + MethodsOrderCancelBatchAssign.varUsedQuantityBeforeCreateOrder + " And Actual Used Quantity value After Cancel Order is: " + MethodsOrderCancelBatchAssign.varUsedQuantityAfterCancelOrder + ". Correct");
//	    } else {
//	        test.log(Status.FAIL, "Expected Used Quantity value (Used Quantity value After Cancel Order = Used Quantity value Before Cancel Order) After Cancel Order is: " + MethodsOrderCancelBatchAssign.varUsedQuantityBeforeCreateOrder + " But Actual Used Quantity value After Cancel Order is: " + MethodsOrderCancelBatchAssign.varUsedQuantityAfterCancelOrder + ". Incorrect");
//	        softAssert.fail("Expected Used Quantity value (Used Quantity value After Cancel Order = Used Quantity value Before Cancel Order) After Cancel Order is: " + MethodsOrderCancelBatchAssign.varUsedQuantityBeforeCreateOrder + " But Actual Used Quantity value After Cancel Order is: " + MethodsOrderCancelBatchAssign.varUsedQuantityAfterCancelOrder + ". Incorrect");
//	    }
//	    
//	    softAssert.assertAll();
//	}
}
