package orderFlowPositive;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import allCommonData.TestHelper;
import io.restassured.response.Response;
import utilities.ExtentReportManager;

public class TestsOrderFlowPositive {
	
	@Test(priority = 1,groups = {"OrderFlowPositive"})
	public void testOrderFlowPositiveInventoryDetailsBeforeCreateOrder(){
		SoftAssert softAssert = new SoftAssert();
		
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderFlowPositive.methodOrderFlowPositiveInventoryDetailsBeforeCreateOrder();
        
		TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    
	    if(MethodsOrderFlowPositive.varPendingStockBeforeCreateOrder>=0){
	    	test.log(Status.PASS, "Expected Pending Stock value before Create Order should be long number "+ "And Actual is: "+MethodsOrderFlowPositive.varPendingStockBeforeCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Pending Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderFlowPositive.varPendingStockBeforeCreateOrder+". Incorrect");
	    	softAssert.fail("Expected Pending Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderFlowPositive.varPendingStockBeforeCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderFlowPositive.varTotalDemandBeforeCreateOrder>=0){
	    	test.log(Status.PASS, "Expected Total Demand value before Create Order should be long number "+ "And Actual is: "+MethodsOrderFlowPositive.varTotalDemandBeforeCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Total Demand value before Create Order should be long number "+ "But Actual is: "+MethodsOrderFlowPositive.varTotalDemandBeforeCreateOrder+". Incorrect");
	    	softAssert.fail("Expected Total Demand value should be before Create Order long number "+ "But Actual is: "+MethodsOrderFlowPositive.varTotalDemandBeforeCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderFlowPositive.varStockBeforeCreateOrder>=0){
	    	test.log(Status.PASS, "Expected Stock value before Create Order should be long number "+ "And Actual is: "+MethodsOrderFlowPositive.varStockBeforeCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderFlowPositive.varStockBeforeCreateOrder+". Incorrect");
	    	softAssert.fail("Expected Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderFlowPositive.varStockBeforeCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderFlowPositive.varIntransientStockBeforeCreateOrder>=0){
	    	test.log(Status.PASS, "Expected Intransient Stock value before Create Order should be long number "+ "And Actual is: "+MethodsOrderFlowPositive.varIntransientStockBeforeCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Intransient Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderFlowPositive.varIntransientStockBeforeCreateOrder+". Incorrect");
	    	softAssert.fail("Expected Intransient Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderFlowPositive.varIntransientStockBeforeCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderFlowPositive.varAvailableStockBeforeCreateOrder>=0){
	    	test.log(Status.PASS, "Expected Available Stock value before Create Order should be long number "+ "And Actual is: "+MethodsOrderFlowPositive.varAvailableStockBeforeCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Available Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderFlowPositive.varAvailableStockBeforeCreateOrder+". Incorrect");
	    	softAssert.fail("Expected Available Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderFlowPositive.varAvailableStockBeforeCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderFlowPositive.varUsedQuantityBeforeCreateOrder>=0){
	    	test.log(Status.PASS, "Expected Used Quantity value before Create Order should be long number "+ "And Actual is: "+MethodsOrderFlowPositive.varUsedQuantityBeforeCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Used Quantity value before Create Order should be long number "+ "But Actual is: "+MethodsOrderFlowPositive.varUsedQuantityBeforeCreateOrder+". Incorrect");
	    	softAssert.fail("Expected Used Quantity value should be before Create Order long number "+ "But Actual is: "+MethodsOrderFlowPositive.varUsedQuantityBeforeCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderFlowPositive.varAvailableQuantityBeforeCreateOrder>=0){
	    	test.log(Status.PASS, "Expected Available Quantity value before Create Order should be long number "+ "And Actual is: "+MethodsOrderFlowPositive.varAvailableQuantityBeforeCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Available Quantity value before Create Order should be long number "+ "But Actual is: "+MethodsOrderFlowPositive.varAvailableQuantityBeforeCreateOrder+". Incorrect");
	    	softAssert.fail("Expected Available Quantity value should be before Create Order long number "+ "But Actual is: "+MethodsOrderFlowPositive.varAvailableQuantityBeforeCreateOrder+". Incorrect");
	    }
	    
	    softAssert.assertAll();
	}
	
	
	
	@Test(dependsOnMethods = "testOrderFlowPositiveInventoryDetailsBeforeCreateOrder", groups = {"OrderFlowPositive"})
	public void testOrderFlowPositivecreateOrder(){
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderFlowPositive.methodOrderFlowPositiveCreateOrder();
        
		TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    TestHelper.validateStatus(test, response, "Created");
	    TestHelper.validateId(test, response);
	}

	
	
	@Test(dependsOnMethods = "testOrderFlowPositivecreateOrder",groups = {"OrderFlowPositive"})
	public void testOrderFlowPositiveInventoryDetailsAfterCreateOrder(){
		SoftAssert softAssert = new SoftAssert();
		
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderFlowPositive.methodOrderFlowPositiveInventoryDetailsAfterCreateOrder();
        
		TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    
	    if(MethodsOrderFlowPositive.varPendingStockAfterCreateOrder==(MethodsOrderFlowPositive.varPendingStockBeforeCreateOrder+MethodsOrderFlowPositive.varOrderedQuantity)){
	    	test.log(Status.PASS, "Pending Stock value Before Create Order is: "+MethodsOrderFlowPositive.varPendingStockBeforeCreateOrder+", Ordered Quantity is: "+MethodsOrderFlowPositive.varOrderedQuantity+ ", Expected Pending Stock value (Pending Stock Value Before Creating Order + Ordered Quantity) After Create Order is: "+(MethodsOrderFlowPositive.varPendingStockBeforeCreateOrder+MethodsOrderFlowPositive.varOrderedQuantity)+ ", And Actual Pending Stock value After Create Order is: "+MethodsOrderFlowPositive.varPendingStockAfterCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Pending Stock value Before Create Order is: "+MethodsOrderFlowPositive.varPendingStockBeforeCreateOrder+", Ordered Quantity is: "+MethodsOrderFlowPositive.varOrderedQuantity+ ", Expected Pending Stock value (Pending Stock Value Before Creating Order + Ordered Quantity) After Create Order is: "+(MethodsOrderFlowPositive.varPendingStockBeforeCreateOrder+MethodsOrderFlowPositive.varOrderedQuantity)+ ", But Actual Pending Stock value After Create Order is: "+MethodsOrderFlowPositive.varPendingStockAfterCreateOrder+". Incorrect");
	    	softAssert.fail("Pending Stock value Before Create Order is: "+MethodsOrderFlowPositive.varPendingStockBeforeCreateOrder+", Ordered Quantity is: "+MethodsOrderFlowPositive.varOrderedQuantity+ ", Expected Pending Stock value (Pending Stock Value Before Creating Order + Ordered Quantity) After Create Order is: "+(MethodsOrderFlowPositive.varPendingStockBeforeCreateOrder+MethodsOrderFlowPositive.varOrderedQuantity)+ ", But Actual Pending Stock value After Create Order is: "+MethodsOrderFlowPositive.varPendingStockAfterCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderFlowPositive.varTotalDemandAfterCreateOrder==(MethodsOrderFlowPositive.varTotalDemandBeforeCreateOrder+MethodsOrderFlowPositive.varOrderedQuantity)){
	    	test.log(Status.PASS, "Total Demand value Before Create Order is: "+MethodsOrderFlowPositive.varTotalDemandBeforeCreateOrder+", Ordered Quantity is: "+MethodsOrderFlowPositive.varOrderedQuantity+ ", Expected Total Demand value (Total Demand Value Before Creating Order + Ordered Quantity) After Create Order is: "+(MethodsOrderFlowPositive.varTotalDemandBeforeCreateOrder+MethodsOrderFlowPositive.varOrderedQuantity)+ ", And Actual Total Demand value After Create Order is: "+MethodsOrderFlowPositive.varTotalDemandAfterCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Total Demand value Before Create Order is: "+MethodsOrderFlowPositive.varTotalDemandBeforeCreateOrder+", Ordered Quantity is: "+MethodsOrderFlowPositive.varOrderedQuantity+ ", Expected Total Demand value (Total Demand Value Before Creating Order + Ordered Quantity) After Create Order is: "+(MethodsOrderFlowPositive.varTotalDemandBeforeCreateOrder+MethodsOrderFlowPositive.varOrderedQuantity)+ ", But Actual Total Demand value After Create Order is: "+MethodsOrderFlowPositive.varTotalDemandAfterCreateOrder+". Incorrect");
	    	softAssert.fail("Total Demand value Before Create Order is: "+MethodsOrderFlowPositive.varTotalDemandBeforeCreateOrder+", Ordered Quantity is: "+MethodsOrderFlowPositive.varOrderedQuantity+ ", Expected Total Demand value (Pending Stock Value Before Creating Order + Ordered Quantity) After Create Order is: "+(MethodsOrderFlowPositive.varTotalDemandBeforeCreateOrder+MethodsOrderFlowPositive.varOrderedQuantity)+ ", But Actual Total Demand value After Create Order is: "+MethodsOrderFlowPositive.varTotalDemandAfterCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderFlowPositive.varAvailableQuantityAfterCreateOrder==MethodsOrderFlowPositive.varAvailableQuantityBeforeCreateOrder){
	    	test.log(Status.PASS, "Expected Available Quantity value (Available Quantity value After Create Order = Available Quantity value Before Create Order) After Create Order is: "+MethodsOrderFlowPositive.varAvailableQuantityBeforeCreateOrder+" And Actual Available Quantity value After Create Order is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Available Quantity value (Available Quantity value After Create Order = Available Quantity value Before Create Order) After Create Order is: "+MethodsOrderFlowPositive.varAvailableQuantityBeforeCreateOrder+" But Actual Available Quantity value After Create Order is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterCreateOrder+". InCorrect");
	    	softAssert.fail("Expected Available Quantity value (Available Quantity value After Create Order = Available Quantity value Before Create Order) After Create Order is: "+MethodsOrderFlowPositive.varAvailableQuantityBeforeCreateOrder+" But Actual Available Quantity value After Create Order is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterCreateOrder+". InCorrect");
	    }
	    
	    if(MethodsOrderFlowPositive.varStockAfterCreateOrder==MethodsOrderFlowPositive.varStockBeforeCreateOrder){
	    	test.log(Status.PASS, "Expected Stock value (Stock value After Create Order = Stock value Before Create Order) After Create Order is: "+MethodsOrderFlowPositive.varStockBeforeCreateOrder+" And Actual Stock value After Create Order is: "+MethodsOrderFlowPositive.varStockAfterCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Stock value (Stock value After Create Order = Stock value Before Create Order) After Create Order is: "+MethodsOrderFlowPositive.varStockBeforeCreateOrder+" But Actual Stock value After Create Order is: "+MethodsOrderFlowPositive.varStockAfterCreateOrder+". InCorrect");
	    	softAssert.fail("Expected Stock value (Stock value After Create Order = Stock value Before Create Order) After Create Order is: "+MethodsOrderFlowPositive.varStockBeforeCreateOrder+" But Actual Stock value After Create Order is: "+MethodsOrderFlowPositive.varStockAfterCreateOrder+". InCorrect");
	    }
	    
	    if(MethodsOrderFlowPositive.varIntransientStockAfterCreateOrder==MethodsOrderFlowPositive.varIntransientStockBeforeCreateOrder){
	    	test.log(Status.PASS, "Expected Intransient Stock value (Intransient Stock value After Create Order = Intransient Stock value Before Create Order) After Create Order is: "+MethodsOrderFlowPositive.varIntransientStockBeforeCreateOrder+" And Actual Intransient Stock value After Create Order is: "+MethodsOrderFlowPositive.varIntransientStockAfterCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Intransient Stock value (Intransient Stock value After Create Order = Intransient Stock value Before Create Order) After Create Order is: "+MethodsOrderFlowPositive.varIntransientStockBeforeCreateOrder+" But Actual Intransient Stock value After Create Order is: "+MethodsOrderFlowPositive.varIntransientStockAfterCreateOrder+". InCorrect");
	    	softAssert.fail("Expected Intransient Stock value (Intransient Stock value After Create Order = Intransient Stock value Before Create Order) After Create Order is: "+MethodsOrderFlowPositive.varIntransientStockBeforeCreateOrder+" But Actual Intransient Stock value After Create Order is: "+MethodsOrderFlowPositive.varIntransientStockAfterCreateOrder+". InCorrect");
	    }
	    
	    if(MethodsOrderFlowPositive.varAvailableStockAfterCreateOrder==MethodsOrderFlowPositive.varAvailableStockBeforeCreateOrder){
	    	test.log(Status.PASS, "Expected Available Stock value (Available Stock value After Create Order = Available Stock value Before Create Order) After Create Order is: "+MethodsOrderFlowPositive.varAvailableStockBeforeCreateOrder+" And Actual Available Stock value After Create Order is: "+MethodsOrderFlowPositive.varAvailableStockAfterCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Available Stock value (Available Stock value After Create Order = Available Stock value Before Create Order) After Create Order is: "+MethodsOrderFlowPositive.varAvailableStockBeforeCreateOrder+" But Actual Available Stock value After Create Order is: "+MethodsOrderFlowPositive.varAvailableStockAfterCreateOrder+". InCorrect");
	    	softAssert.fail("Expected Available Stock value (Available Stock value After Create Order = Available Stock value Before Create Order) After Create Order is: "+MethodsOrderFlowPositive.varAvailableStockBeforeCreateOrder+" But Actual Available Stock value After Create Order is: "+MethodsOrderFlowPositive.varAvailableStockAfterCreateOrder+". InCorrect");
	    }
	    
	    if(MethodsOrderFlowPositive.varUsedQuantityAfterCreateOrder==MethodsOrderFlowPositive.varUsedQuantityBeforeCreateOrder){
	    	test.log(Status.PASS, "Expected Used Quantity value (Used Quantity value After Create Order = Used Quantity value Before Create Order) After Create Order is: "+MethodsOrderFlowPositive.varUsedQuantityBeforeCreateOrder+" And Actual Available Stock value After Create Order is: "+MethodsOrderFlowPositive.varUsedQuantityAfterCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Used Quantity value (Used Quantity value After Create Order = Used Quantity value Before Create Order) After Create Order is: "+MethodsOrderFlowPositive.varUsedQuantityBeforeCreateOrder+" But Actual Available Stock value After Create Order is: "+MethodsOrderFlowPositive.varUsedQuantityAfterCreateOrder+". InCorrect");
	    	softAssert.fail("Expected Used Quantity value (Used Quantity value After Create Order = Used Quantity value Before Create Order) After Create Order is: "+MethodsOrderFlowPositive.varUsedQuantityBeforeCreateOrder+" But Actual Available Stock value After Create Order is: "+MethodsOrderFlowPositive.varUsedQuantityAfterCreateOrder+". InCorrect");
	    }
	    

	    
	    if(MethodsOrderFlowPositive.varAvailableQuantityAfterCreateOrder>=MethodsOrderFlowPositive.varOrderedQuantity){
	    	test.log(Status.PASS, "Available Quantity value After Create Order is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterCreateOrder + ", Ordered Quantity is: " + MethodsOrderFlowPositive.varOrderedQuantity + ", Available Quantity value After Create Order >= Ordered Quantity. Correct");
	    } else {
	    	test.log(Status.FAIL, "Add Inventory, Available Quantity value After Create Order is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterCreateOrder + ", Ordered Quantity is: " + MethodsOrderFlowPositive.varOrderedQuantity + ", Available Quantity value After Create Order >= Ordered Quantity. Incorrect");
	    	softAssert.fail("Add Inventory, Available Quantity value After Create Order is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterCreateOrder + ", Ordered Quantity is: " + MethodsOrderFlowPositive.varOrderedQuantity + ", Available Quantity value After Create Order >= Ordered Quantity. Incorrect");
	    }
	}
	
	

	@Test(dependsOnMethods = "testOrderFlowPositiveInventoryDetailsAfterCreateOrder",groups = {"OrderFlowPositive"})
	public void testOrderFlowPositiveBatchAssign(){
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderFlowPositive.methodOrderFlowPositiveBatchAssign();
	    
		TestHelper.logDetails(test, response);
		TestHelper.validateStatusCode(test, response, 200);
	    TestHelper.validateStatus(test, response, "BatchAssigned");
	    TestHelper.validateId(test, response);
	}
	
	
	
	@Test(dependsOnMethods = "testOrderFlowPositiveBatchAssign",groups = {"OrderFlowPositive"})
	public void testOrderFlowPositiveInventoryDetailsAfterBatchAssign(){
		SoftAssert softAssert = new SoftAssert();
		
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderFlowPositive.methodOrderFlowPositiveInventoryDetailsAfterBatchAssign();
	    
		TestHelper.logDetails(test, response);
		TestHelper.validateStatusCode(test, response, 200);
		
		if(MethodsOrderFlowPositive.varUsedQuantityAfterBatchAssign==(MethodsOrderFlowPositive.varUsedQuantityAfterCreateOrder+MethodsOrderFlowPositive.varOrderedQuantity)){
	    	test.log(Status.PASS, "Used Quantity value After Create Order is: "+MethodsOrderFlowPositive.varUsedQuantityAfterCreateOrder+", Ordered Quantity is: "+MethodsOrderFlowPositive.varOrderedQuantity+ ", Expected Used Quantity value (Used Quantity value After Create Order + Ordered Quantity) After Batch Assign is: "+(MethodsOrderFlowPositive.varUsedQuantityAfterCreateOrder+MethodsOrderFlowPositive.varOrderedQuantity)+ ", And Actual Used Quantity value value After Batch Assign is: "+MethodsOrderFlowPositive.varUsedQuantityAfterBatchAssign+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Used Quantity value After Create Order is: "+MethodsOrderFlowPositive.varUsedQuantityAfterCreateOrder+", Ordered Quantity is: "+MethodsOrderFlowPositive.varOrderedQuantity+ ", Expected Used Quantity value (Used Quantity value After Create Order + Ordered Quantity) After Batch Assign is: "+(MethodsOrderFlowPositive.varUsedQuantityAfterCreateOrder+MethodsOrderFlowPositive.varOrderedQuantity)+ ", But Actual Used Quantity value value After Batch Assign is: "+MethodsOrderFlowPositive.varUsedQuantityAfterBatchAssign+". Incorrect");
	    	softAssert.fail("Used Quantity value After Create Order is: "+MethodsOrderFlowPositive.varUsedQuantityAfterCreateOrder+", Ordered Quantity is: "+MethodsOrderFlowPositive.varOrderedQuantity+ ", Expected Used Quantity value (Used Quantity value After Create Order + Ordered Quantity) After BatchAssign is: "+(MethodsOrderFlowPositive.varUsedQuantityAfterCreateOrder+MethodsOrderFlowPositive.varOrderedQuantity)+ ", But Actual Used Quantity value value After Batch Assign is: "+MethodsOrderFlowPositive.varUsedQuantityAfterBatchAssign+". Incorrect");
	    }
		
		if(MethodsOrderFlowPositive.varAvailableQuantityAfterBatchAssign==(MethodsOrderFlowPositive.varAvailableQuantityAfterCreateOrder-MethodsOrderFlowPositive.varOrderedQuantity)){
	    	test.log(Status.PASS, "Available Quantity value After Create Order is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterCreateOrder+", Ordered Quantity is: "+MethodsOrderFlowPositive.varOrderedQuantity+ ", Expected Available Quantity value (Available Quantity value After Create Order - Ordered Quantity) After Batch Assign is: "+(MethodsOrderFlowPositive.varAvailableQuantityAfterCreateOrder-MethodsOrderFlowPositive.varOrderedQuantity)+ ", And Actual Available Quantity value value After Batch Assign is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterBatchAssign+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Available Quantity value After Create Order is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterCreateOrder+", Ordered Quantity is: "+MethodsOrderFlowPositive.varOrderedQuantity+ ", Expected Available Quantity value (Available Quantity value After Create Order - Ordered Quantity) After Batch Assign is: "+(MethodsOrderFlowPositive.varAvailableQuantityAfterCreateOrder-MethodsOrderFlowPositive.varOrderedQuantity)+ ", But Actual Available Quantity value value After Batch Assign is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterBatchAssign+". Incorrect");
	    	softAssert.fail("Available Quantity value After Create Order is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterCreateOrder+", Ordered Quantity is: "+MethodsOrderFlowPositive.varOrderedQuantity+ ", Expected Available Quantity value (Available Quantity value After Create Order - Ordered Quantity) After BatchAssign is: "+(MethodsOrderFlowPositive.varAvailableQuantityAfterCreateOrder-MethodsOrderFlowPositive.varOrderedQuantity)+ ", But Actual Available Quantity value value After Batch Assign is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterBatchAssign+". Incorrect");
	    }
		
	    if(MethodsOrderFlowPositive.varPendingStockAfterBatchAssign==MethodsOrderFlowPositive.varPendingStockAfterCreateOrder){
	    	test.log(Status.PASS, "Expected Pending Stock value (Pending Stock value After Batch Assign = Pending Stock value After Create Order) After Batch Assign is: "+MethodsOrderFlowPositive.varPendingStockAfterCreateOrder+" And Actual Pending Stock value After Batch Assign is: "+MethodsOrderFlowPositive.varPendingStockAfterBatchAssign+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Pending Stock value (Pending Stock value After Batch Assign = Pending Stock value After Create Order) After Batch Assign is: "+MethodsOrderFlowPositive.varPendingStockAfterCreateOrder+" But Actual Pending Stock value After Batch Assign is: "+MethodsOrderFlowPositive.varPendingStockAfterBatchAssign+". InCorrect");
	    	softAssert.fail("Expected Pending Stock value (Pending Stock value After Batch Assign = Pending Stock value After Create Order) After Batch Assign is: "+MethodsOrderFlowPositive.varPendingStockAfterCreateOrder+" But Actual Pending Stock value After Batch Assign is: "+MethodsOrderFlowPositive.varPendingStockAfterBatchAssign+". InCorrect");
	    }
	    
	    if(MethodsOrderFlowPositive.varTotalDemandAfterBatchAssign==MethodsOrderFlowPositive.varTotalDemandAfterCreateOrder){
	    	test.log(Status.PASS, "Expected Total Demand value (Total Demand value After Batch Assign = Total Demand value After Create Order) After Batch Assign is: "+MethodsOrderFlowPositive.varTotalDemandAfterCreateOrder+" And Actual Total Demand value After Batch Assign is: "+MethodsOrderFlowPositive.varTotalDemandAfterBatchAssign+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Total Demand value (Total Demand value After Batch Assign = Total Demand value After Create Order) After Batch Assign is: "+MethodsOrderFlowPositive.varTotalDemandAfterCreateOrder+" But Actual Total Demand value After Batch Assign is: "+MethodsOrderFlowPositive.varTotalDemandAfterBatchAssign+". InCorrect");
	    	softAssert.fail("Expected Total Demand value (Total Demand value After Batch Assign = Total Demand value After Create Order) After Batch Assign is: "+MethodsOrderFlowPositive.varTotalDemandAfterCreateOrder+" But Actual Total Demand value After Batch Assign is: "+MethodsOrderFlowPositive.varTotalDemandAfterBatchAssign+". InCorrect");
	    }
		
	    if(MethodsOrderFlowPositive.varStockAfterBatchAssign==MethodsOrderFlowPositive.varStockAfterCreateOrder){
	    	test.log(Status.PASS, "Expected Stock value (Stock value After Batch Assign = Stock value After Create Order) After Batch Assign is: "+MethodsOrderFlowPositive.varStockAfterCreateOrder+" And Actual Stock value After Batch Assign is: "+MethodsOrderFlowPositive.varStockAfterBatchAssign+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Stock value (Stock value After Batch Assign = Stock value After Create Order) After Batch Assign is: "+MethodsOrderFlowPositive.varStockAfterCreateOrder+" But Actual Stock value After Batch Assign is: "+MethodsOrderFlowPositive.varStockAfterBatchAssign+". InCorrect");
	    	softAssert.fail("Expected Stock value (Stock value After Batch Assign = Stock value After Create Order) After Batch Assign is: "+MethodsOrderFlowPositive.varStockAfterCreateOrder+" But Actual Stock value After Batch Assign is: "+MethodsOrderFlowPositive.varStockAfterBatchAssign+". InCorrect");
	    }
	    
	    if(MethodsOrderFlowPositive.varIntransientStockAfterBatchAssign==MethodsOrderFlowPositive.varIntransientStockAfterCreateOrder){
	    	test.log(Status.PASS, "Expected Intransient Stock value (Intransient Stock value After Batch Assign = Intransient Stock value After Create Order) After Batch Assign is: "+MethodsOrderFlowPositive.varIntransientStockAfterCreateOrder+" And Actual Intransient Stock value After Batch Assign is: "+MethodsOrderFlowPositive.varIntransientStockAfterBatchAssign+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Intransient Stock value (Intransient Stock value After Batch Assign = Intransient Stock value After Create Order) After Batch Assign is: "+MethodsOrderFlowPositive.varIntransientStockAfterCreateOrder+" But Actual Intransient Stock value After Batch Assign is: "+MethodsOrderFlowPositive.varIntransientStockAfterBatchAssign+". InCorrect");
	    	softAssert.fail("Expected Intransient Stock value (Intransient Stock value After Batch Assign = Intransient Stock value After Create Order) After Batch Assign is: "+MethodsOrderFlowPositive.varIntransientStockAfterCreateOrder+" But Actual Intransient Stock value After Batch Assign is: "+MethodsOrderFlowPositive.varIntransientStockAfterBatchAssign+". InCorrect");
	    }
	    
	    if(MethodsOrderFlowPositive.varAvailableStockAfterBatchAssign==MethodsOrderFlowPositive.varAvailableStockAfterCreateOrder){
	    	test.log(Status.PASS, "Expected Available Stock value (Available Stock value After Batch Assign = Available Stock value After Create Order) After Batch Assign is: "+MethodsOrderFlowPositive.varAvailableStockAfterCreateOrder+" And Actual Available Stock value After Batch Assign is: "+MethodsOrderFlowPositive.varAvailableStockAfterBatchAssign+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Available Stock value (Available Stock value After Batch Assign = Available Stock value After Create Order) After Batch Assign is: "+MethodsOrderFlowPositive.varAvailableStockAfterCreateOrder+" But Actual Available Stock value After Batch Assign is: "+MethodsOrderFlowPositive.varAvailableStockAfterBatchAssign+". InCorrect");
	    	softAssert.fail("Expected Available Stock value (Available Stock value After Batch Assign = Available Stock value After Create Order) After Batch Assign is: "+MethodsOrderFlowPositive.varAvailableStockAfterCreateOrder+" But Actual Available Stock value After Batch Assign is: "+MethodsOrderFlowPositive.varAvailableStockAfterBatchAssign+". InCorrect");
	    }
	    
	    softAssert.assertAll();
	}
	
	
	
	@Test(dependsOnMethods = "testOrderFlowPositiveInventoryDetailsAfterBatchAssign",groups = {"OrderFlowPositive"})
	public void testOrderFlowPositiveMarkPacked(){
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderFlowPositive.methodOrderFlowPositiveMarkPacked();
	    
		TestHelper.logDetails(test, response);
		TestHelper.validateStatusCode(test, response, 200);
	    TestHelper.validateStatus(test, response, "Packed");
	    TestHelper.validateId(test, response);
	}
	
	
	
	@Test(dependsOnMethods = "testOrderFlowPositiveMarkPacked",groups = {"OrderFlowPositive"})
	public void testOrderFlowPositiveInventoryDetailsAfterMarkPacked(){
		SoftAssert softAssert = new SoftAssert();
		
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderFlowPositive.methodOrderFlowPositiveInventoryDetailsAfterMarkPacked();
	    
		TestHelper.logDetails(test, response);
		TestHelper.validateStatusCode(test, response, 200);
		
		if(MethodsOrderFlowPositive.varUsedQuantityAfterMarkPacked==MethodsOrderFlowPositive.varUsedQuantityAfterBatchAssign){
	    	test.log(Status.PASS, "Expected Used Quantity value (Used Quantity value After Mark Packed = Used Quantity value After Batch Assign) After Mark Packed is: "+MethodsOrderFlowPositive.varUsedQuantityAfterBatchAssign+" And Actual Used Quantity value After Mark Packed is: "+MethodsOrderFlowPositive.varUsedQuantityAfterBatchAssign+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Used Quantity value (Used Quantity value After Mark Packed = Used Quantity value After Batch Assign) After Mark Packed is: "+MethodsOrderFlowPositive.varUsedQuantityAfterBatchAssign+" But Actual Used Quantity value After Mark Packed is: "+MethodsOrderFlowPositive.varUsedQuantityAfterBatchAssign+". InCorrect");
	    	softAssert.fail("Expected Used Quantity value (Used Quantity value After Mark Packed = Used Quantity value After Batch Assign) After Mark Packed is: "+MethodsOrderFlowPositive.varUsedQuantityAfterBatchAssign+" But Actual Used Quantity value After Mark Packed is: "+MethodsOrderFlowPositive.varUsedQuantityAfterBatchAssign+". InCorrect");
	    }
		
		if(MethodsOrderFlowPositive.varAvailableQuantityAfterMarkPacked==MethodsOrderFlowPositive.varAvailableQuantityAfterBatchAssign){
	    	test.log(Status.PASS, "Expected Available Quantity value (Available Quantity value After Mark Packed = Available Quantity value After Batch Assign) After Mark Packed is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterBatchAssign+" And Actual Available Quantity value After Mark Packed is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterBatchAssign+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Available Quantity value (Available Quantity value After Mark Packed = Available Quantity value After Batch Assign) After Mark Packed is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterBatchAssign+" But Actual Available Quantity value After Mark Packed is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterBatchAssign+". InCorrect");
	    	softAssert.fail("Expected Available Quantity value (Available Quantity value After Mark Packed = Available Quantity value After Batch Assign) After Mark Packed is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterBatchAssign+" But Actual Available Quantity value After Mark Packed is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterBatchAssign+". InCorrect");
	    }
		
	    if(MethodsOrderFlowPositive.varPendingStockAfterMarkPacked==MethodsOrderFlowPositive.varPendingStockAfterBatchAssign){
	    	test.log(Status.PASS, "Expected Pending Stock value (Pending Stock value After Mark Packed = Pending Stock value After Batch Assign) After Mark Packed is: "+MethodsOrderFlowPositive.varPendingStockAfterBatchAssign+" And Actual Pending Stock value After Mark Packed is: "+MethodsOrderFlowPositive.varPendingStockAfterMarkPacked+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Pending Stock value (Pending Stock value After Mark Packed = Pending Stock value After Batch Assign) After Mark Packed is: "+MethodsOrderFlowPositive.varPendingStockAfterBatchAssign+" But Actual Pending Stock value After Mark Packed is: "+MethodsOrderFlowPositive.varPendingStockAfterMarkPacked+". InCorrect");
	    	softAssert.fail("Expected Pending Stock value (Pending Stock value After Mark Packed = Pending Stock value After Batch Assign) After Mark Packed is: "+MethodsOrderFlowPositive.varPendingStockAfterBatchAssign+" But Actual Pending Stock value After Mark Packed is: "+MethodsOrderFlowPositive.varPendingStockAfterMarkPacked+". InCorrect");
	    }
	    
	    if(MethodsOrderFlowPositive.varTotalDemandAfterMarkPacked==MethodsOrderFlowPositive.varTotalDemandAfterBatchAssign){
	    	test.log(Status.PASS, "Expected Total Demand value (Total Demand value After Mark Packed = Total Demand value After Batch Assign) After Mark Packed is: "+MethodsOrderFlowPositive.varTotalDemandAfterBatchAssign+" And Actual Total Demand value After Mark Packed is: "+MethodsOrderFlowPositive.varTotalDemandAfterMarkPacked+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Total Demand value (Total Demand value After Mark Packed = Total Demand value After Batch Assign) After Mark Packed is: "+MethodsOrderFlowPositive.varTotalDemandAfterBatchAssign+" But Actual Total Demand value After Mark Packed is: "+MethodsOrderFlowPositive.varTotalDemandAfterMarkPacked+". InCorrect");
	    	softAssert.fail("Expected Total Demand value (Total Demand value After Mark Packed = Total Demand value After Batch Assign) After Mark Packed is: "+MethodsOrderFlowPositive.varTotalDemandAfterBatchAssign+" But Actual Total Demand value After Mark Packed is: "+MethodsOrderFlowPositive.varTotalDemandAfterMarkPacked+". InCorrect");
	    }
		
	    if(MethodsOrderFlowPositive.varStockAfterMarkPacked==MethodsOrderFlowPositive.varStockAfterBatchAssign){
	    	test.log(Status.PASS, "Expected Stock value (Stock value After Mark Packed = Stock value After Batch Assign) After Mark Packed is: "+MethodsOrderFlowPositive.varStockAfterBatchAssign+" And Actual Stock value After Mark Packed is: "+MethodsOrderFlowPositive.varStockAfterMarkPacked+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Stock value (Stock value After Mark Packed = Stock value After Batch Assign) After Mark Packed is: "+MethodsOrderFlowPositive.varStockAfterBatchAssign+" But Actual Stock value After Mark Packed is: "+MethodsOrderFlowPositive.varStockAfterMarkPacked+". InCorrect");
	    	softAssert.fail("Expected Stock value (Stock value After Mark Packed = Stock value After Batch Assign) After Mark Packed is: "+MethodsOrderFlowPositive.varStockAfterBatchAssign+" But Actual Stock value After Mark Packed is: "+MethodsOrderFlowPositive.varStockAfterMarkPacked+". InCorrect");
	    }
	    
	    if(MethodsOrderFlowPositive.varIntransientStockAfterMarkPacked==MethodsOrderFlowPositive.varIntransientStockAfterBatchAssign){
	    	test.log(Status.PASS, "Expected Intransient Stock value (Intransient Stock value After Mark Packed = Intransient Stock value After Batch Assign) After Mark Packed is: "+MethodsOrderFlowPositive.varIntransientStockAfterBatchAssign+" And Actual Intransient Stock value After Mark Packed is: "+MethodsOrderFlowPositive.varIntransientStockAfterMarkPacked+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Intransient Stock value (Intransient Stock value After Mark Packed = Intransient Stock value After Batch Assign) After Mark Packed is: "+MethodsOrderFlowPositive.varIntransientStockAfterBatchAssign+" But Actual Intransient Stock value After Mark Packed is: "+MethodsOrderFlowPositive.varIntransientStockAfterMarkPacked+". InCorrect");
	    	softAssert.fail("Expected Intransient Stock value (Intransient Stock value After Mark Packed = Intransient Stock value After Batch Assign) After Mark Packed is: "+MethodsOrderFlowPositive.varIntransientStockAfterBatchAssign+" But Actual Intransient Stock value After Mark Packed is: "+MethodsOrderFlowPositive.varIntransientStockAfterMarkPacked+". InCorrect");
	    }
	    
	    if(MethodsOrderFlowPositive.varAvailableStockAfterMarkPacked==MethodsOrderFlowPositive.varAvailableStockAfterBatchAssign){
	    	test.log(Status.PASS, "Expected Available Stock value (Available Stock value After Mark Packed = Available Stock value After Batch Assign) After Mark Packed is: "+MethodsOrderFlowPositive.varAvailableStockAfterBatchAssign+" And Actual Available Stock value After Mark Packed is: "+MethodsOrderFlowPositive.varAvailableStockAfterMarkPacked+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Available Stock value (Available Stock value After Mark Packed = Available Stock value After Batch Assign) After Mark Packed is: "+MethodsOrderFlowPositive.varAvailableStockAfterBatchAssign+" But Actual Available Stock value After Mark Packed is: "+MethodsOrderFlowPositive.varAvailableStockAfterMarkPacked+". InCorrect");
	    	softAssert.fail("Expected Available Stock value (Available Stock value After Mark Packed = Available Stock value After Batch Assign) After Mark Packed is: "+MethodsOrderFlowPositive.varAvailableStockAfterBatchAssign+" But Actual Available Stock value After Mark Packed is: "+MethodsOrderFlowPositive.varAvailableStockAfterMarkPacked+". InCorrect");
	    }
	    
	    softAssert.assertAll();
	}

	
	
	@Test(dependsOnMethods = "testOrderFlowPositiveInventoryDetailsAfterMarkPacked",groups = {"OrderFlowPositive"})
	public void testOrderFlowPositiveCreateShipment(){
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderFlowPositive.methodOrderFlowPositiveCreateShipment();
	    
		TestHelper.logDetails(test, response);
		TestHelper.validateStatusCode(test, response, 200);
	    TestHelper.validateStatus(test, response, "INITIATED");
	    TestHelper.validateId(test, response);
	}

	
	
	@Test(dependsOnMethods = "testOrderFlowPositiveCreateShipment",groups = {"OrderFlowPositive"})
	public void testOrderFlowPositiveInventoryDetailsAfterCreateShipment(){
		SoftAssert softAssert = new SoftAssert();
		
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderFlowPositive.methodOrderFlowPositiveInventoryDetailsAfterCreateShipment();
	    
		TestHelper.logDetails(test, response);
		TestHelper.validateStatusCode(test, response, 200);
		
		if(MethodsOrderFlowPositive.varUsedQuantityAfterCreateShipment==MethodsOrderFlowPositive.varUsedQuantityAfterMarkPacked){
	    	test.log(Status.PASS, "Expected Used Quantity value (Used Quantity value After Create Shipment = Used Quantity value After Mark Packed) After Create Shipment is: "+MethodsOrderFlowPositive.varUsedQuantityAfterMarkPacked+" And Actual Used Quantity value After Mark Packed is: "+MethodsOrderFlowPositive.varUsedQuantityAfterCreateShipment+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Used Quantity value (Used Quantity value After Create Shipment = Used Quantity value After Mark Packed) After Create Shipment is: "+MethodsOrderFlowPositive.varUsedQuantityAfterMarkPacked+" But Actual Used Quantity value After Mark Packed is: "+MethodsOrderFlowPositive.varUsedQuantityAfterCreateShipment+". InCorrect");
	    	softAssert.fail("Expected Used Quantity value (Used Quantity value After Create Shipment = Used Quantity value After Mark Packed) After Create Shipment is: "+MethodsOrderFlowPositive.varUsedQuantityAfterMarkPacked+" But Actual Used Quantity value After Mark Packed is: "+MethodsOrderFlowPositive.varUsedQuantityAfterCreateShipment+". InCorrect");
	    }
		
		if(MethodsOrderFlowPositive.varAvailableQuantityAfterCreateShipment == MethodsOrderFlowPositive.varAvailableQuantityAfterMarkPacked){
		    test.log(Status.PASS, "Expected Available Quantity value (Available Quantity value After Create Shipment = Available Quantity value After Mark Packed) After Create Shipment is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterMarkPacked+" And Actual Available Quantity value After Create Shipment is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterMarkPacked+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Available Quantity value (Available Quantity value After Create Shipment = Available Quantity value After Mark Packed) After Create Shipment is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterMarkPacked+" But Actual Available Quantity value After Create Shipment is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterMarkPacked+". InCorrect");
		    softAssert.fail("Expected Available Quantity value (Available Quantity value After Create Shipment = Available Quantity value After Mark Packed) After Create Shipment is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterMarkPacked+" But Actual Available Quantity value After Create Shipment is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterMarkPacked+". InCorrect");
		}

		if(MethodsOrderFlowPositive.varPendingStockAfterCreateShipment == MethodsOrderFlowPositive.varPendingStockAfterMarkPacked){
		    test.log(Status.PASS, "Expected Pending Stock value (Pending Stock value After Create Shipment = Pending Stock value After Mark Packed) After Create Shipment is: "+MethodsOrderFlowPositive.varPendingStockAfterMarkPacked+" And Actual Pending Stock value After Create Shipment is: "+MethodsOrderFlowPositive.varPendingStockAfterCreateShipment+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Pending Stock value (Pending Stock value After Create Shipment = Pending Stock value After Mark Packed) After Create Shipment is: "+MethodsOrderFlowPositive.varPendingStockAfterMarkPacked+" But Actual Pending Stock value After Create Shipment is: "+MethodsOrderFlowPositive.varPendingStockAfterCreateShipment+". InCorrect");
		    softAssert.fail("Expected Pending Stock value (Pending Stock value After Create Shipment = Pending Stock value After Mark Packed) After Create Shipment is: "+MethodsOrderFlowPositive.varPendingStockAfterMarkPacked+" But Actual Pending Stock value After Create Shipment is: "+MethodsOrderFlowPositive.varPendingStockAfterCreateShipment+". InCorrect");
		}

		if(MethodsOrderFlowPositive.varTotalDemandAfterCreateShipment == MethodsOrderFlowPositive.varTotalDemandAfterMarkPacked){
		    test.log(Status.PASS, "Expected Total Demand value (Total Demand value After Create Shipment = Total Demand value After Mark Packed) After Create Shipment is: "+MethodsOrderFlowPositive.varTotalDemandAfterMarkPacked+" And Actual Total Demand value After Create Shipment is: "+MethodsOrderFlowPositive.varTotalDemandAfterCreateShipment+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Total Demand value (Total Demand value After Create Shipment = Total Demand value After Mark Packed) After Create Shipment is: "+MethodsOrderFlowPositive.varTotalDemandAfterMarkPacked+" But Actual Total Demand value After Create Shipment is: "+MethodsOrderFlowPositive.varTotalDemandAfterCreateShipment+". InCorrect");
		    softAssert.fail("Expected Total Demand value (Total Demand value After Create Shipment = Total Demand value After Mark Packed) After Create Shipment is: "+MethodsOrderFlowPositive.varTotalDemandAfterMarkPacked+" But Actual Total Demand value After Create Shipment is: "+MethodsOrderFlowPositive.varTotalDemandAfterCreateShipment+". InCorrect");
		}

		if(MethodsOrderFlowPositive.varStockAfterCreateShipment == MethodsOrderFlowPositive.varStockAfterMarkPacked){
		    test.log(Status.PASS, "Expected Stock value (Stock value After Create Shipment = Stock value After Mark Packed) After Create Shipment is: "+MethodsOrderFlowPositive.varStockAfterMarkPacked+" And Actual Stock value After Create Shipment is: "+MethodsOrderFlowPositive.varStockAfterCreateShipment+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Stock value (Stock value After Create Shipment = Stock value After Mark Packed) After Create Shipment is: "+MethodsOrderFlowPositive.varStockAfterMarkPacked+" But Actual Stock value After Create Shipment is: "+MethodsOrderFlowPositive.varStockAfterCreateShipment+". InCorrect");
		    softAssert.fail("Expected Stock value (Stock value After Create Shipment = Stock value After Mark Packed) After Create Shipment is: "+MethodsOrderFlowPositive.varStockAfterMarkPacked+" But Actual Stock value After Create Shipment is: "+MethodsOrderFlowPositive.varStockAfterCreateShipment+". InCorrect");
		}

		if(MethodsOrderFlowPositive.varIntransientStockAfterCreateShipment == MethodsOrderFlowPositive.varIntransientStockAfterMarkPacked){
		    test.log(Status.PASS, "Expected Intransient Stock value (Intransient Stock value After Create Shipment = Intransient Stock value After Mark Packed) After Create Shipment is: "+MethodsOrderFlowPositive.varIntransientStockAfterMarkPacked+" And Actual Intransient Stock value After Create Shipment is: "+MethodsOrderFlowPositive.varIntransientStockAfterCreateShipment+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Intransient Stock value (Intransient Stock value After Create Shipment = Intransient Stock value After Mark Packed) After Create Shipment is: "+MethodsOrderFlowPositive.varIntransientStockAfterMarkPacked+" But Actual Intransient Stock value After Create Shipment is: "+MethodsOrderFlowPositive.varIntransientStockAfterCreateShipment+". InCorrect");
		    softAssert.fail("Expected Intransient Stock value (Intransient Stock value After Create Shipment = Intransient Stock value After Mark Packed) After Create Shipment is: "+MethodsOrderFlowPositive.varIntransientStockAfterMarkPacked+" But Actual Intransient Stock value After Create Shipment is: "+MethodsOrderFlowPositive.varIntransientStockAfterCreateShipment+". InCorrect");
		}

		if(MethodsOrderFlowPositive.varAvailableStockAfterCreateShipment == MethodsOrderFlowPositive.varAvailableStockAfterMarkPacked){
		    test.log(Status.PASS, "Expected Available Stock value (Available Stock value After Create Shipment = Available Stock value After Mark Packed) After Create Shipment is: "+MethodsOrderFlowPositive.varAvailableStockAfterMarkPacked+" And Actual Available Stock value After Create Shipment is: "+MethodsOrderFlowPositive.varAvailableStockAfterCreateShipment+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Available Stock value (Available Stock value After Create Shipment = Available Stock value After Mark Packed) After Create Shipment is: "+MethodsOrderFlowPositive.varAvailableStockAfterMarkPacked+" But Actual Available Stock value After Create Shipment is: "+MethodsOrderFlowPositive.varAvailableStockAfterCreateShipment+". InCorrect");
		    softAssert.fail("Expected Available Stock value (Available Stock value After Create Shipment = Available Stock value After Mark Packed) After Create Shipment is: "+MethodsOrderFlowPositive.varAvailableStockAfterMarkPacked+" But Actual Available Stock value After Create Shipment is: "+MethodsOrderFlowPositive.varAvailableStockAfterCreateShipment+". InCorrect");
		}
	    
	    softAssert.assertAll();
	}

	
	
	@Test(dependsOnMethods = "testOrderFlowPositiveInventoryDetailsAfterCreateShipment",groups = {"OrderFlowPositive"})
	public void testOrderFlowPositiveDispatch(){
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderFlowPositive.methodOrderFlowPositiveDispatch();
	    
		TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    TestHelper.validateStatus(test, response, "Dispatched");
	    TestHelper.validateId(test, response);
	}
	
	
	
	@Test(dependsOnMethods = "testOrderFlowPositiveDispatch",groups = {"OrderFlowPositive"})
	public void testOrderFlowPositiveInventoryDetailsAfterDispatch(){
		SoftAssert softAssert = new SoftAssert();
		
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderFlowPositive.methodOrderFlowPositiveInventoryDetailsAfterDispatch();
	    
		TestHelper.logDetails(test, response);
		TestHelper.validateStatusCode(test, response, 200);
		
		if(MethodsOrderFlowPositive.varPendingStockAfterDispatch == (MethodsOrderFlowPositive.varPendingStockAfterCreateShipment - MethodsOrderFlowPositive.varOrderedQuantity)){
		    test.log(Status.PASS, "Pending Stock value After Create Shipment is: "+MethodsOrderFlowPositive.varPendingStockAfterCreateShipment+", Ordered Quantity is: "+MethodsOrderFlowPositive.varOrderedQuantity+ ", Expected Pending Stock value (Pending Stock value After Create Shipment - Ordered Quantity) After Dispatch is: "+(MethodsOrderFlowPositive.varPendingStockAfterCreateShipment - MethodsOrderFlowPositive.varOrderedQuantity)+ ", And Actual Pending Stock value After Dispatch is: "+MethodsOrderFlowPositive.varPendingStockAfterDispatch+". Correct");
		} else {
		    test.log(Status.FAIL, "Pending Stock value After Create Shipment is: "+MethodsOrderFlowPositive.varPendingStockAfterCreateShipment+", Ordered Quantity is: "+MethodsOrderFlowPositive.varOrderedQuantity+ ", Expected Pending Stock value (Pending Stock value After Create Shipment - Ordered Quantity) After Dispatch is: "+(MethodsOrderFlowPositive.varPendingStockAfterCreateShipment - MethodsOrderFlowPositive.varOrderedQuantity)+ ", But Actual Pending Stock value After Dispatch is: "+MethodsOrderFlowPositive.varPendingStockAfterDispatch+". Incorrect");
		    softAssert.fail("Pending Stock value After Create Shipment is: "+MethodsOrderFlowPositive.varPendingStockAfterCreateShipment+", Ordered Quantity is: "+MethodsOrderFlowPositive.varOrderedQuantity+ ", Expected Pending Stock value (Pending Stock value After Create Shipment - Ordered Quantity) After Dispatch is: "+(MethodsOrderFlowPositive.varPendingStockAfterCreateShipment - MethodsOrderFlowPositive.varOrderedQuantity)+ ", But Actual Pending Stock value After Dispatch is: "+MethodsOrderFlowPositive.varPendingStockAfterDispatch+". Incorrect");
		}
		
		if(MethodsOrderFlowPositive.varIntransientStockAfterDispatch == (MethodsOrderFlowPositive.varIntransientStockAfterCreateShipment + MethodsOrderFlowPositive.varOrderedQuantity)){
		    test.log(Status.PASS, "Intransient Stock value After Create Shipment is: "+MethodsOrderFlowPositive.varIntransientStockAfterCreateShipment+", Ordered Quantity is: "+MethodsOrderFlowPositive.varOrderedQuantity+ ", Expected Intransient Stock value (Intransient Stock value After Create Shipment + Ordered Quantity) After Dispatch is: "+(MethodsOrderFlowPositive.varIntransientStockAfterCreateShipment + MethodsOrderFlowPositive.varOrderedQuantity)+ ", And Actual Intransient Stock value After Dispatch is: "+MethodsOrderFlowPositive.varIntransientStockAfterDispatch+". Correct");
		} else {
		    test.log(Status.FAIL, "Intransient Stock value After Create Shipment is: "+MethodsOrderFlowPositive.varIntransientStockAfterCreateShipment+", Ordered Quantity is: "+MethodsOrderFlowPositive.varOrderedQuantity+ ", Expected Intransient Stock value (Intransient Stock value After Create Shipment + Ordered Quantity) After Dispatch is: "+(MethodsOrderFlowPositive.varIntransientStockAfterCreateShipment + MethodsOrderFlowPositive.varOrderedQuantity)+ ", But Actual Intransient Stock value After Dispatch is: "+MethodsOrderFlowPositive.varIntransientStockAfterDispatch+". Incorrect");
		    softAssert.fail("Intransient Stock value After Create Shipment is: "+MethodsOrderFlowPositive.varIntransientStockAfterCreateShipment+", Ordered Quantity is: "+MethodsOrderFlowPositive.varOrderedQuantity+ ", Expected Intransient Stock value (Intransient Stock value After Create Shipment + Ordered Quantity) After Dispatch is: "+(MethodsOrderFlowPositive.varIntransientStockAfterCreateShipment + MethodsOrderFlowPositive.varOrderedQuantity)+ ", But Actual Intransient Stock value After Dispatch is: "+MethodsOrderFlowPositive.varIntransientStockAfterDispatch+". Incorrect");
		}
		
		if(MethodsOrderFlowPositive.varAvailableStockAfterDispatch == (MethodsOrderFlowPositive.varAvailableStockAfterCreateShipment - MethodsOrderFlowPositive.varOrderedQuantity)){
		    test.log(Status.PASS, "Available Stock value After Create Shipment is: "+MethodsOrderFlowPositive.varAvailableStockAfterCreateShipment+", Ordered Quantity is: "+MethodsOrderFlowPositive.varOrderedQuantity+ ", Expected Available Stock value (Available Stock value After Create Shipment - Ordered Quantity) After Dispatch is: "+(MethodsOrderFlowPositive.varAvailableStockAfterCreateShipment - MethodsOrderFlowPositive.varOrderedQuantity)+ ", And Actual Available Stock value After Dispatch is: "+MethodsOrderFlowPositive.varAvailableStockAfterDispatch+". Correct");
		} else {
		    test.log(Status.FAIL, "Available Stock value After Create Shipment is: "+MethodsOrderFlowPositive.varAvailableStockAfterCreateShipment+", Ordered Quantity is: "+MethodsOrderFlowPositive.varOrderedQuantity+ ", Expected Available Stock value (Available Stock value After Create Shipment - Ordered Quantity) After Dispatch is: "+(MethodsOrderFlowPositive.varAvailableStockAfterCreateShipment - MethodsOrderFlowPositive.varOrderedQuantity)+ ", But Actual Available Stock value After Dispatch is: "+MethodsOrderFlowPositive.varAvailableStockAfterDispatch+". Incorrect");
		    softAssert.fail("Available Stock value After Create Shipment is: "+MethodsOrderFlowPositive.varAvailableStockAfterCreateShipment+", Ordered Quantity is: "+MethodsOrderFlowPositive.varOrderedQuantity+ ", Expected Available Stock value (Available Stock value After Create Shipment - Ordered Quantity) After Dispatch is: "+(MethodsOrderFlowPositive.varAvailableStockAfterCreateShipment - MethodsOrderFlowPositive.varOrderedQuantity)+ ", But Actual Available Stock value After Dispatch is: "+MethodsOrderFlowPositive.varAvailableStockAfterDispatch+". Incorrect");
		}
		
		if(MethodsOrderFlowPositive.varUsedQuantityAfterDispatch == MethodsOrderFlowPositive.varUsedQuantityAfterCreateShipment){
		    test.log(Status.PASS, "Expected Used Quantity value (Used Quantity value After Dispatch = Used Quantity value After Create Shipment) After Dispatch is: "+MethodsOrderFlowPositive.varUsedQuantityAfterCreateShipment+" And Actual Used Quantity value After Create Shipment is: "+MethodsOrderFlowPositive.varUsedQuantityAfterDispatch+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Used Quantity value (Used Quantity value After Dispatch = Used Quantity value After Create Shipment) After Dispatch is: "+MethodsOrderFlowPositive.varUsedQuantityAfterCreateShipment+" But Actual Used Quantity value After Dispatch is: "+MethodsOrderFlowPositive.varUsedQuantityAfterDispatch+". InCorrect");
		    softAssert.fail("Expected Used Quantity value (Used Quantity value After Dispatch = Used Quantity value After Create Shipment) After Dispatch is: "+MethodsOrderFlowPositive.varUsedQuantityAfterCreateShipment+" But Actual Used Quantity value After Dispatch is: "+MethodsOrderFlowPositive.varUsedQuantityAfterDispatch+". InCorrect");
		}

		if(MethodsOrderFlowPositive.varAvailableQuantityAfterDispatch == MethodsOrderFlowPositive.varAvailableQuantityAfterCreateShipment){
		    test.log(Status.PASS, "Expected Available Quantity value (Available Quantity value After Dispatch = Available Quantity value After Create Shipment) After Dispatch is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterCreateShipment+" And Actual Available Quantity value After Dispatch is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterDispatch+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Available Quantity value (Available Quantity value After Dispatch = Available Quantity value After Create Shipment) After Dispatch is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterCreateShipment+" But Actual Available Quantity value After Dispatch is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterDispatch+". InCorrect");
		    softAssert.fail("Expected Available Quantity value (Available Quantity value After Dispatch = Available Quantity value After Create Shipment) After Dispatch is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterCreateShipment+" But Actual Available Quantity value After Dispatch is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterDispatch+". InCorrect");
		}

		if(MethodsOrderFlowPositive.varTotalDemandAfterDispatch == MethodsOrderFlowPositive.varTotalDemandAfterCreateShipment){
		    test.log(Status.PASS, "Expected Total Demand value (Total Demand value After Dispatch = Total Demand value After Create Shipment) After Dispatch is: "+MethodsOrderFlowPositive.varTotalDemandAfterCreateShipment+" And Actual Total Demand value After Dispatch is: "+MethodsOrderFlowPositive.varTotalDemandAfterDispatch+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Total Demand value (Total Demand value After Dispatch = Total Demand value After Create Shipment) After Dispatch is: "+MethodsOrderFlowPositive.varTotalDemandAfterCreateShipment+" But Actual Total Demand value After Dispatch is: "+MethodsOrderFlowPositive.varTotalDemandAfterDispatch+". InCorrect");
		    softAssert.fail("Expected Total Demand value (Total Demand value After Dispatch = Total Demand value After Create Shipment) After Dispatch is: "+MethodsOrderFlowPositive.varTotalDemandAfterCreateShipment+" But Actual Total Demand value After Dispatch is: "+MethodsOrderFlowPositive.varTotalDemandAfterDispatch+". InCorrect");
		}

		if(MethodsOrderFlowPositive.varStockAfterDispatch == MethodsOrderFlowPositive.varStockAfterCreateShipment){
		    test.log(Status.PASS, "Expected Stock value (Stock value After Dispatch = Stock value After Create Shipment) After Dispatch is: "+MethodsOrderFlowPositive.varStockAfterCreateShipment+" And Actual Stock value After Dispatch is: "+MethodsOrderFlowPositive.varStockAfterDispatch+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Stock value (Stock value After Dispatch = Stock value After Create Shipment) After Dispatch is: "+MethodsOrderFlowPositive.varStockAfterCreateShipment+" But Actual Stock value After Dispatch is: "+MethodsOrderFlowPositive.varStockAfterDispatch+". InCorrect");
		    softAssert.fail("Expected Stock value (Stock value After Dispatch = Stock value After Create Shipment) After Dispatch is: "+MethodsOrderFlowPositive.varStockAfterCreateShipment+" But Actual Stock value After Dispatch is: "+MethodsOrderFlowPositive.varStockAfterDispatch+". InCorrect");
		}
	    
	    softAssert.assertAll();
	}

	
	
	@Test(dependsOnMethods = "testOrderFlowPositiveInventoryDetailsAfterDispatch",groups = {"OrderFlowPositive"})
	public void testOrderFlowPositiveMarkShipped(){
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderFlowPositive.methodOrderFlowPositiveMarkShipped();
	    
		TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    TestHelper.validateStatus(test, response, "SHIPPED");
	    TestHelper.validateId(test, response);
	}
	
	
	
	@Test(dependsOnMethods = "testOrderFlowPositiveMarkShipped",groups = {"OrderFlowPositive"})
	public void testOrderFlowPositiveInventoryDetailsAfterMarkShipped(){
		SoftAssert softAssert = new SoftAssert();
		
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderFlowPositive.methodOrderFlowPositiveInventoryDetailsAfterMarkShipped();
	    
		TestHelper.logDetails(test, response);
		TestHelper.validateStatusCode(test, response, 200);
		
		if(MethodsOrderFlowPositive.varPendingStockAfterMarkShipped == MethodsOrderFlowPositive.varPendingStockAfterDispatch){
		    test.log(Status.PASS, "Expected Pending Stock value (Pending Stock value After Mark Shipped = Pending Stock value After Dispatch) After Mark Shipped is: "+MethodsOrderFlowPositive.varPendingStockAfterDispatch+" And Actual Pending Stock value After Dispatch is: "+MethodsOrderFlowPositive.varPendingStockAfterMarkShipped+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Pending Stock value (Pending Stock value After Mark Shipped = Pending Stock value After Dispatch) After Mark Shipped is: "+MethodsOrderFlowPositive.varPendingStockAfterDispatch+" But Actual Pending Stock value After Mark Shipped is: "+MethodsOrderFlowPositive.varPendingStockAfterMarkShipped+". InCorrect");
		    softAssert.fail("Expected Pending Stock value (Pending Stock value After Mark Shipped = Pending Stock value After Dispatch) After Mark Shipped is: "+MethodsOrderFlowPositive.varPendingStockAfterDispatch+" But Actual Pending Stock value After Mark Shipped is: "+MethodsOrderFlowPositive.varPendingStockAfterMarkShipped+". InCorrect");
		}

		if(MethodsOrderFlowPositive.varIntransientStockAfterMarkShipped == MethodsOrderFlowPositive.varIntransientStockAfterDispatch){
		    test.log(Status.PASS, "Expected Intransient Stock value (Intransient Stock value After Mark Shipped = Intransient Stock value After Dispatch) After Mark Shipped is: "+MethodsOrderFlowPositive.varIntransientStockAfterDispatch+" And Actual Intransient Stock value After Dispatch is: "+MethodsOrderFlowPositive.varIntransientStockAfterMarkShipped+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Intransient Stock value (Intransient Stock value After Mark Shipped = Intransient Stock value After Dispatch) After Mark Shipped is: "+MethodsOrderFlowPositive.varIntransientStockAfterDispatch+" But Actual Intransient Stock value After Mark Shipped is: "+MethodsOrderFlowPositive.varIntransientStockAfterMarkShipped+". InCorrect");
		    softAssert.fail("Expected Intransient Stock value (Intransient Stock value After Mark Shipped = Intransient Stock value After Dispatch) After Mark Shipped is: "+MethodsOrderFlowPositive.varIntransientStockAfterDispatch+" But Actual Intransient Stock value After Mark Shipped is: "+MethodsOrderFlowPositive.varIntransientStockAfterMarkShipped+". InCorrect");
		}

		if(MethodsOrderFlowPositive.varAvailableStockAfterMarkShipped == MethodsOrderFlowPositive.varAvailableStockAfterDispatch){
		    test.log(Status.PASS, "Expected Available Stock value (Available Stock value After Mark Shipped = Available Stock value After Dispatch) After Mark Shipped is: "+MethodsOrderFlowPositive.varAvailableStockAfterDispatch+" And Actual Available Stock value After Dispatch is: "+MethodsOrderFlowPositive.varAvailableStockAfterMarkShipped+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Available Stock value (Available Stock value After Mark Shipped = Available Stock value After Dispatch) After Mark Shipped is: "+MethodsOrderFlowPositive.varAvailableStockAfterDispatch+" But Actual Available Stock value After Mark Shipped is: "+MethodsOrderFlowPositive.varAvailableStockAfterMarkShipped+". InCorrect");
		    softAssert.fail("Expected Available Stock value (Available Stock value After Mark Shipped = Available Stock value After Dispatch) After Mark Shipped is: "+MethodsOrderFlowPositive.varAvailableStockAfterDispatch+" But Actual Available Stock value After Mark Shipped is: "+MethodsOrderFlowPositive.varAvailableStockAfterMarkShipped+". InCorrect");
		}

		if(MethodsOrderFlowPositive.varUsedQuantityAfterMarkShipped == MethodsOrderFlowPositive.varUsedQuantityAfterDispatch){
		    test.log(Status.PASS, "Expected Used Quantity value (Used Quantity value After Mark Shipped = Used Quantity value After Dispatch) After Mark Shipped is: "+MethodsOrderFlowPositive.varUsedQuantityAfterDispatch+" And Actual Used Quantity value After Dispatch is: "+MethodsOrderFlowPositive.varUsedQuantityAfterMarkShipped+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Used Quantity value (Used Quantity value After Mark Shipped = Used Quantity value After Dispatch) After Mark Shipped is: "+MethodsOrderFlowPositive.varUsedQuantityAfterDispatch+" But Actual Used Quantity value After Mark Shipped is: "+MethodsOrderFlowPositive.varUsedQuantityAfterMarkShipped+". InCorrect");
		    softAssert.fail("Expected Used Quantity value (Used Quantity value After Mark Shipped = Used Quantity value After Dispatch) After Mark Shipped is: "+MethodsOrderFlowPositive.varUsedQuantityAfterDispatch+" But Actual Used Quantity value After Mark Shipped is: "+MethodsOrderFlowPositive.varUsedQuantityAfterMarkShipped+". InCorrect");
		}

		if(MethodsOrderFlowPositive.varAvailableQuantityAfterMarkShipped == MethodsOrderFlowPositive.varAvailableQuantityAfterDispatch){
		    test.log(Status.PASS, "Expected Available Quantity value (Available Quantity value After Mark Shipped = Available Quantity value After Dispatch) After Mark Shipped is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterDispatch+" And Actual Available Quantity value After Dispatch is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterMarkShipped+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Available Quantity value (Available Quantity value After Mark Shipped = Available Quantity value After Dispatch) After Mark Shipped is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterDispatch+" But Actual Available Quantity value After Mark Shipped is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterMarkShipped+". InCorrect");
		    softAssert.fail("Expected Available Quantity value (Available Quantity value After Mark Shipped = Available Quantity value After Dispatch) After Mark Shipped is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterDispatch+" But Actual Available Quantity value After Mark Shipped is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterMarkShipped+". InCorrect");
		}

		if(MethodsOrderFlowPositive.varTotalDemandAfterMarkShipped == MethodsOrderFlowPositive.varTotalDemandAfterDispatch){
		    test.log(Status.PASS, "Expected Total Demand value (Total Demand value After Mark Shipped = Total Demand value After Dispatch) After Mark Shipped is: "+MethodsOrderFlowPositive.varTotalDemandAfterDispatch+" And Actual Total Demand value After Dispatch is: "+MethodsOrderFlowPositive.varTotalDemandAfterMarkShipped+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Total Demand value (Total Demand value After Mark Shipped = Total Demand value After Dispatch) After Mark Shipped is: "+MethodsOrderFlowPositive.varTotalDemandAfterDispatch+" But Actual Total Demand value After Mark Shipped is: "+MethodsOrderFlowPositive.varTotalDemandAfterMarkShipped+". InCorrect");
		    softAssert.fail("Expected Total Demand value (Total Demand value After Mark Shipped = Total Demand value After Dispatch) After Mark Shipped is: "+MethodsOrderFlowPositive.varTotalDemandAfterDispatch+" But Actual Total Demand value After Mark Shipped is: "+MethodsOrderFlowPositive.varTotalDemandAfterMarkShipped+". InCorrect");
		}

		if(MethodsOrderFlowPositive.varStockAfterMarkShipped == MethodsOrderFlowPositive.varStockAfterDispatch){
		    test.log(Status.PASS, "Expected Stock value (Stock value After Mark Shipped = Stock value After Dispatch) After Mark Shipped is: "+MethodsOrderFlowPositive.varStockAfterDispatch+" And Actual Stock value After Dispatch is: "+MethodsOrderFlowPositive.varStockAfterMarkShipped+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Stock value (Stock value After Mark Shipped = Stock value After Dispatch) After Mark Shipped is: "+MethodsOrderFlowPositive.varStockAfterDispatch+" But Actual Stock value After Mark Shipped is: "+MethodsOrderFlowPositive.varStockAfterMarkShipped+". InCorrect");
		    softAssert.fail("Expected Stock value (Stock value After Mark Shipped = Stock value After Dispatch) After Mark Shipped is: "+MethodsOrderFlowPositive.varStockAfterDispatch+" But Actual Stock value After Mark Shipped is: "+MethodsOrderFlowPositive.varStockAfterMarkShipped+". InCorrect");
		}

	    softAssert.assertAll();
	}

	
	
	@Test(dependsOnMethods = "testOrderFlowPositiveInventoryDetailsAfterMarkShipped",groups = {"OrderFlowPositive"})
	public void testOrderFlowPositiveInvoiceNumber(){
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderFlowPositive.methodOrderFlowPositiveInvoiceNumber();
	    
		TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    TestHelper.validateStatus(test, response, "SHIPPED");
	    TestHelper.validateId(test, response);
	    
	    String invoiceNumber = response.jsonPath().getString("payload.extInvoiceId");
        if (invoiceNumber==null) {
            test.log(Status.FAIL, "Invoice Number should not be Null but found Null");
            Assert.fail("Test failed due to Invoice Number is: Null");
        } else {
            test.log(Status.PASS, "Passed because Invoice Number is not: Null");
        }
	}
	
	
	
	@Test(dependsOnMethods = "testOrderFlowPositiveInvoiceNumber",groups = {"OrderFlowPositive"})
	public void testOrderFlowPositiveInventoryDetailsAfterInvoiceNumber(){
		SoftAssert softAssert = new SoftAssert();
		
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderFlowPositive.methodOrderFlowPositiveInventoryDetailsAfterInvoiceNumber();
	    
		TestHelper.logDetails(test, response);
		TestHelper.validateStatusCode(test, response, 200);
		
		if(MethodsOrderFlowPositive.varUsedQuantityAfterInvoiceNumber == MethodsOrderFlowPositive.varUsedQuantityAfterMarkShipped){ 
		    test.log(Status.PASS, "Expected Used Quantity value (Used Quantity value After Invoice Number = Used Quantity value After Mark Shipped) After Invoice Number is: "+MethodsOrderFlowPositive.varUsedQuantityAfterMarkShipped+" And Actual Used Quantity value After Mark Shipped is: "+MethodsOrderFlowPositive.varUsedQuantityAfterInvoiceNumber+". Correct"); 
		} else { 
		    test.log(Status.FAIL, "Expected Used Quantity value (Used Quantity value After Invoice Number = Used Quantity value After Mark Shipped) After Invoice Number is: "+MethodsOrderFlowPositive.varUsedQuantityAfterMarkShipped+" But Actual Used Quantity value After Mark Shipped is: "+MethodsOrderFlowPositive.varUsedQuantityAfterInvoiceNumber+". InCorrect"); 
		    softAssert.fail("Expected Used Quantity value (Used Quantity value After Invoice Number = Used Quantity value After Mark Shipped) After Invoice Number is: "+MethodsOrderFlowPositive.varUsedQuantityAfterMarkShipped+" But Actual Used Quantity value After Mark Shipped is: "+MethodsOrderFlowPositive.varUsedQuantityAfterInvoiceNumber+". InCorrect"); 
		} 

		if(MethodsOrderFlowPositive.varAvailableQuantityAfterInvoiceNumber == MethodsOrderFlowPositive.varAvailableQuantityAfterMarkShipped){ 
		    test.log(Status.PASS, "Expected Available Quantity value (Available Quantity value After Invoice Number = Available Quantity value After Mark Shipped) After Invoice Number is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterMarkShipped+" And Actual Available Quantity value After Mark Shipped is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterInvoiceNumber+". Correct"); 
		} else { 
		    test.log(Status.FAIL, "Expected Available Quantity value (Available Quantity value After Invoice Number = Available Quantity value After Mark Shipped) After Invoice Number is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterMarkShipped+" But Actual Available Quantity value After Mark Shipped is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterInvoiceNumber+". InCorrect"); 
		    softAssert.fail("Expected Available Quantity value (Available Quantity value After Invoice Number = Available Quantity value After Mark Shipped) After Invoice Number is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterMarkShipped+" But Actual Available Quantity value After Mark Shipped is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterInvoiceNumber+". InCorrect"); 
		} 

		if(MethodsOrderFlowPositive.varPendingStockAfterInvoiceNumber == MethodsOrderFlowPositive.varPendingStockAfterMarkShipped){ 
		    test.log(Status.PASS, "Expected Pending Stock value (Pending Stock value After Invoice Number = Pending Stock value After Mark Shipped) After Invoice Number is: "+MethodsOrderFlowPositive.varPendingStockAfterMarkShipped+" And Actual Pending Stock value After Mark Shipped is: "+MethodsOrderFlowPositive.varPendingStockAfterInvoiceNumber+". Correct"); 
		} else { 
		    test.log(Status.FAIL, "Expected Pending Stock value (Pending Stock value After Invoice Number = Pending Stock value After Mark Shipped) After Invoice Number is: "+MethodsOrderFlowPositive.varPendingStockAfterMarkShipped+" But Actual Pending Stock value After Mark Shipped is: "+MethodsOrderFlowPositive.varPendingStockAfterInvoiceNumber+". InCorrect"); 
		    softAssert.fail("Expected Pending Stock value (Pending Stock value After Invoice Number = Pending Stock value After Mark Shipped) After Invoice Number is: "+MethodsOrderFlowPositive.varPendingStockAfterMarkShipped+" But Actual Pending Stock value After Mark Shipped is: "+MethodsOrderFlowPositive.varPendingStockAfterInvoiceNumber+". InCorrect"); 
		} 

		if(MethodsOrderFlowPositive.varTotalDemandAfterInvoiceNumber == MethodsOrderFlowPositive.varTotalDemandAfterMarkShipped){ 
		    test.log(Status.PASS, "Expected Total Demand value (Total Demand value After Invoice Number = Total Demand value After Mark Shipped) After Invoice Number is: "+MethodsOrderFlowPositive.varTotalDemandAfterMarkShipped+" And Actual Total Demand value After Mark Shipped is: "+MethodsOrderFlowPositive.varTotalDemandAfterInvoiceNumber+". Correct"); 
		} else { 
		    test.log(Status.FAIL, "Expected Total Demand value (Total Demand value After Invoice Number = Total Demand value After Mark Shipped) After Invoice Number is: "+MethodsOrderFlowPositive.varTotalDemandAfterMarkShipped+" But Actual Total Demand value After Mark Shipped is: "+MethodsOrderFlowPositive.varTotalDemandAfterInvoiceNumber+". InCorrect"); 
		    softAssert.fail("Expected Total Demand value (Total Demand value After Invoice Number = Total Demand value After Mark Shipped) After Invoice Number is: "+MethodsOrderFlowPositive.varTotalDemandAfterMarkShipped+" But Actual Total Demand value After Mark Shipped is: "+MethodsOrderFlowPositive.varTotalDemandAfterInvoiceNumber+". InCorrect"); 
		} 

		if(MethodsOrderFlowPositive.varStockAfterInvoiceNumber == MethodsOrderFlowPositive.varStockAfterMarkShipped){ 
		    test.log(Status.PASS, "Expected Stock value (Stock value After Invoice Number = Stock value After Mark Shipped) After Invoice Number is: "+MethodsOrderFlowPositive.varStockAfterMarkShipped+" And Actual Stock value After Mark Shipped is: "+MethodsOrderFlowPositive.varStockAfterInvoiceNumber+". Correct"); 
		} else { 
		    test.log(Status.FAIL, "Expected Stock value (Stock value After Invoice Number = Stock value After Mark Shipped) After Invoice Number is: "+MethodsOrderFlowPositive.varStockAfterMarkShipped+" But Actual Stock value After Mark Shipped is: "+MethodsOrderFlowPositive.varStockAfterInvoiceNumber+". InCorrect"); 
		    softAssert.fail("Expected Stock value (Stock value After Invoice Number = Stock value After Mark Shipped) After Invoice Number is: "+MethodsOrderFlowPositive.varStockAfterMarkShipped+" But Actual Stock value After Mark Shipped is: "+MethodsOrderFlowPositive.varStockAfterInvoiceNumber+". InCorrect"); 
		} 

		if(MethodsOrderFlowPositive.varIntransientStockAfterInvoiceNumber == MethodsOrderFlowPositive.varIntransientStockAfterMarkShipped){ 
		    test.log(Status.PASS, "Expected Intransient Stock value (Intransient Stock value After Invoice Number = Intransient Stock value After Mark Shipped) After Invoice Number is: "+MethodsOrderFlowPositive.varIntransientStockAfterMarkShipped+" And Actual Intransient Stock value After Mark Shipped is: "+MethodsOrderFlowPositive.varIntransientStockAfterInvoiceNumber+". Correct"); 
		} else { 
		    test.log(Status.FAIL, "Expected Intransient Stock value (Intransient Stock value After Invoice Number = Intransient Stock value After Mark Shipped) After Invoice Number is: "+MethodsOrderFlowPositive.varIntransientStockAfterMarkShipped+" But Actual Intransient Stock value After Mark Shipped is: "+MethodsOrderFlowPositive.varIntransientStockAfterInvoiceNumber+". InCorrect"); 
		    softAssert.fail("Expected Intransient Stock value (Intransient Stock value After Invoice Number = Intransient Stock value After Mark Shipped) After Invoice Number is: "+MethodsOrderFlowPositive.varIntransientStockAfterMarkShipped+" But Actual Intransient Stock value After Mark Shipped is: "+MethodsOrderFlowPositive.varIntransientStockAfterInvoiceNumber+". InCorrect"); 
		} 

		if(MethodsOrderFlowPositive.varAvailableStockAfterInvoiceNumber == MethodsOrderFlowPositive.varAvailableStockAfterMarkShipped){ 
		    test.log(Status.PASS, "Expected Available Stock value (Available Stock value After Invoice Number = Available Stock value After Mark Shipped) After Invoice Number is: "+MethodsOrderFlowPositive.varAvailableStockAfterMarkShipped+" And Actual Available Stock value After Mark Shipped is: "+MethodsOrderFlowPositive.varAvailableStockAfterInvoiceNumber+". Correct"); 
		} else { 
		    test.log(Status.FAIL, "Expected Available Stock value (Available Stock value After Invoice Number = Available Stock value After Mark Shipped) After Invoice Number is: "+MethodsOrderFlowPositive.varAvailableStockAfterMarkShipped+" But Actual Available Stock value After Mark Shipped is: "+MethodsOrderFlowPositive.varAvailableStockAfterInvoiceNumber+". InCorrect"); 
		    softAssert.fail("Expected Available Stock value (Available Stock value After Invoice Number = Available Stock value After Mark Shipped) After Invoice Number is: "+MethodsOrderFlowPositive.varAvailableStockAfterMarkShipped+" But Actual Available Stock value After Mark Shipped is: "+MethodsOrderFlowPositive.varAvailableStockAfterInvoiceNumber+". InCorrect"); 
		}
	    
	    softAssert.assertAll();
	}

	
	
	@Test(dependsOnMethods = "testOrderFlowPositiveInventoryDetailsAfterInvoiceNumber",groups = {"OrderFlowPositive"})
	public void testOrderFlowPositiveDeliver(){
		SoftAssert softAssert = new SoftAssert();
		
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderFlowPositive.methodOrderFlowPositiveDeliver();
	    
		TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    TestHelper.validateStatus(test, response, "QC_PENDING");
	    TestHelper.validateId(test, response);
	    
	    softAssert.assertAll();
	}
	
	
	
	@Test(dependsOnMethods = "testOrderFlowPositiveDeliver",groups = {"OrderFlowPositive"})
	public void testOrderFlowPositiveInventoryDetailsAfterDeliver(){
		SoftAssert softAssert = new SoftAssert();
		
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderFlowPositive.methodOrderFlowPositiveInventoryDetailsAfterDeliver();
	    
		TestHelper.logDetails(test, response);
		TestHelper.validateStatusCode(test, response, 200);
		
		if(MethodsOrderFlowPositive.varUsedQuantityAfterDeliver == MethodsOrderFlowPositive.varUsedQuantityAfterDispatch){
		    test.log(Status.PASS, "Expected Used Quantity value (Used Quantity value After Deliver = Used Quantity value After Dispatch) After Deliver is: "+MethodsOrderFlowPositive.varUsedQuantityAfterDispatch+" And Actual Used Quantity value After Dispatch is: "+MethodsOrderFlowPositive.varUsedQuantityAfterDeliver+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Used Quantity value (Used Quantity value After Deliver = Used Quantity value After Dispatch) After Deliver is: "+MethodsOrderFlowPositive.varUsedQuantityAfterDispatch+" But Actual Used Quantity value After Dispatch is: "+MethodsOrderFlowPositive.varUsedQuantityAfterDeliver+". InCorrect");
		    softAssert.fail("Expected Used Quantity value (Used Quantity value After Deliver = Used Quantity value After Dispatch) After Deliver is: "+MethodsOrderFlowPositive.varUsedQuantityAfterDispatch+" But Actual Used Quantity value After Dispatch is: "+MethodsOrderFlowPositive.varUsedQuantityAfterDeliver+". InCorrect");
		}

		if(MethodsOrderFlowPositive.varAvailableQuantityAfterDeliver == MethodsOrderFlowPositive.varAvailableQuantityAfterDispatch){
		    test.log(Status.PASS, "Expected Available Quantity value (Available Quantity value After Deliver = Available Quantity value After Dispatch) After Deliver is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterDispatch+" And Actual Available Quantity value After Deliver is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterDispatch+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Available Quantity value (Available Quantity value After Deliver = Available Quantity value After Dispatch) After Deliver is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterDispatch+" But Actual Available Quantity value After Deliver is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterDispatch+". InCorrect");
		    softAssert.fail("Expected Available Quantity value (Available Quantity value After Deliver = Available Quantity value After Dispatch) After Deliver is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterDispatch+" But Actual Available Quantity value After Deliver is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterDispatch+". InCorrect");
		}

		if(MethodsOrderFlowPositive.varPendingStockAfterDeliver == MethodsOrderFlowPositive.varPendingStockAfterDispatch){
		    test.log(Status.PASS, "Expected Pending Stock value (Pending Stock value After Deliver = Pending Stock value After Dispatch) After Deliver is: "+MethodsOrderFlowPositive.varPendingStockAfterDispatch+" And Actual Pending Stock value After Deliver is: "+MethodsOrderFlowPositive.varPendingStockAfterDeliver+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Pending Stock value (Pending Stock value After Deliver = Pending Stock value After Dispatch) After Deliver is: "+MethodsOrderFlowPositive.varPendingStockAfterDispatch+" But Actual Pending Stock value After Deliver is: "+MethodsOrderFlowPositive.varPendingStockAfterDeliver+". InCorrect");
		    softAssert.fail("Expected Pending Stock value (Pending Stock value After Deliver = Pending Stock value After Dispatch) After Deliver is: "+MethodsOrderFlowPositive.varPendingStockAfterDispatch+" But Actual Pending Stock value After Deliver is: "+MethodsOrderFlowPositive.varPendingStockAfterDeliver+". InCorrect");
		}

		if(MethodsOrderFlowPositive.varTotalDemandAfterDeliver == MethodsOrderFlowPositive.varTotalDemandAfterDispatch){
		    test.log(Status.PASS, "Expected Total Demand value (Total Demand value After Deliver = Total Demand value After Dispatch) After Deliver is: "+MethodsOrderFlowPositive.varTotalDemandAfterDispatch+" And Actual Total Demand value After Deliver is: "+MethodsOrderFlowPositive.varTotalDemandAfterDeliver+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Total Demand value (Total Demand value After Deliver = Total Demand value After Dispatch) After Deliver is: "+MethodsOrderFlowPositive.varTotalDemandAfterDispatch+" But Actual Total Demand value After Deliver is: "+MethodsOrderFlowPositive.varTotalDemandAfterDeliver+". InCorrect");
		    softAssert.fail("Expected Total Demand value (Total Demand value After Deliver = Total Demand value After Dispatch) After Deliver is: "+MethodsOrderFlowPositive.varTotalDemandAfterDispatch+" But Actual Total Demand value After Deliver is: "+MethodsOrderFlowPositive.varTotalDemandAfterDeliver+". InCorrect");
		}

		if(MethodsOrderFlowPositive.varStockAfterDeliver == MethodsOrderFlowPositive.varStockAfterDispatch){
		    test.log(Status.PASS, "Expected Stock value (Stock value After Deliver = Stock value After Dispatch) After Deliver is: "+MethodsOrderFlowPositive.varStockAfterDispatch+" And Actual Stock value After Deliver is: "+MethodsOrderFlowPositive.varStockAfterDeliver+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Stock value (Stock value After Deliver = Stock value After Dispatch) After Deliver is: "+MethodsOrderFlowPositive.varStockAfterDispatch+" But Actual Stock value After Deliver is: "+MethodsOrderFlowPositive.varStockAfterDeliver+". InCorrect");
		    softAssert.fail("Expected Stock value (Stock value After Deliver = Stock value After Dispatch) After Deliver is: "+MethodsOrderFlowPositive.varStockAfterDispatch+" But Actual Stock value After Deliver is: "+MethodsOrderFlowPositive.varStockAfterDeliver+". InCorrect");
		}

		if(MethodsOrderFlowPositive.varIntransientStockAfterDeliver == MethodsOrderFlowPositive.varIntransientStockAfterDispatch){
		    test.log(Status.PASS, "Expected Intransient Stock value (Intransient Stock value After Deliver = Intransient Stock value After Dispatch) After Deliver is: "+MethodsOrderFlowPositive.varIntransientStockAfterDispatch+" And Actual Intransient Stock value After Deliver is: "+MethodsOrderFlowPositive.varIntransientStockAfterDeliver+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Intransient Stock value (Intransient Stock value After Deliver = Intransient Stock value After Dispatch) After Deliver is: "+MethodsOrderFlowPositive.varIntransientStockAfterDispatch+" But Actual Intransient Stock value After Deliver is: "+MethodsOrderFlowPositive.varIntransientStockAfterDeliver+". InCorrect");
		    softAssert.fail("Expected Intransient Stock value (Intransient Stock value After Deliver = Intransient Stock value After Dispatch) After Deliver is: "+MethodsOrderFlowPositive.varIntransientStockAfterDispatch+" But Actual Intransient Stock value After Deliver is: "+MethodsOrderFlowPositive.varIntransientStockAfterDeliver+". InCorrect");
		}

		if(MethodsOrderFlowPositive.varAvailableStockAfterDeliver == MethodsOrderFlowPositive.varAvailableStockAfterDispatch){
		    test.log(Status.PASS, "Expected Available Stock value (Available Stock value After Deliver = Available Stock value After Dispatch) After Deliver is: "+MethodsOrderFlowPositive.varAvailableStockAfterDispatch+" And Actual Available Stock value After Deliver is: "+MethodsOrderFlowPositive.varAvailableStockAfterDeliver+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Available Stock value (Available Stock value After Deliver = Available Stock value After Dispatch) After Deliver is: "+MethodsOrderFlowPositive.varAvailableStockAfterDispatch+" But Actual Available Stock value After Deliver is: "+MethodsOrderFlowPositive.varAvailableStockAfterDeliver+". InCorrect");
		    softAssert.fail("Expected Available Stock value (Available Stock value After Deliver = Available Stock value After Dispatch) After Deliver is: "+MethodsOrderFlowPositive.varAvailableStockAfterDispatch+" But Actual Available Stock value After Deliver is: "+MethodsOrderFlowPositive.varAvailableStockAfterDeliver+". InCorrect");
		}
	    
	    softAssert.assertAll();
	}
	
	  
	
	@Test(dependsOnMethods = "testOrderFlowPositiveInventoryDetailsAfterDeliver",groups = {"OrderFlowPositive"})
	public void testOrderFlowPositiveActionCompleteQC(){
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderFlowPositive.methodOrderFlowPositiveActionCompleteQC();
	    
		TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    TestHelper.validateOrderStatus(test, response, "QC_PENDING");
	    TestHelper.validateId(test, response);
	}

	
	
	@Test(dependsOnMethods = "testOrderFlowPositiveActionCompleteQC",groups = {"OrderFlowPositive"})
	public void testOrderFlowPositiveInventoryDetailsAfterActionCompleteQC(){
		SoftAssert softAssert = new SoftAssert();
		
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderFlowPositive.methodOrderFlowPositiveInventoryDetailsAfterActionCompleteQC();
	    
		TestHelper.logDetails(test, response);
		TestHelper.validateStatusCode(test, response, 200);
		
		if(MethodsOrderFlowPositive.varUsedQuantityAfterActionCompleteQC == MethodsOrderFlowPositive.varUsedQuantityAfterDeliver){
		    test.log(Status.PASS, "Expected Used Quantity value (Used Quantity value After Action CompleteQC = Used Quantity value After Deliver) After Action CompleteQC is: "+MethodsOrderFlowPositive.varUsedQuantityAfterDeliver+" And Actual Used Quantity value After Deliver is: "+MethodsOrderFlowPositive.varUsedQuantityAfterActionCompleteQC+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Used Quantity value (Used Quantity value After Action CompleteQC = Used Quantity value After Deliver) After Action CompleteQC is: "+MethodsOrderFlowPositive.varUsedQuantityAfterDeliver+" But Actual Used Quantity value After Deliver is: "+MethodsOrderFlowPositive.varUsedQuantityAfterActionCompleteQC+". InCorrect");
		    softAssert.fail("Expected Used Quantity value (Used Quantity value After Action CompleteQC = Used Quantity value After Deliver) After Action CompleteQC is: "+MethodsOrderFlowPositive.varUsedQuantityAfterDeliver+" But Actual Used Quantity value After Deliver is: "+MethodsOrderFlowPositive.varUsedQuantityAfterActionCompleteQC+". InCorrect");
		}

		if(MethodsOrderFlowPositive.varAvailableQuantityAfterActionCompleteQC == MethodsOrderFlowPositive.varAvailableQuantityAfterDeliver){
		    test.log(Status.PASS, "Expected Available Quantity value (Available Quantity value After Action CompleteQC = Available Quantity value After Deliver) After Action CompleteQC is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterDeliver+" And Actual Available Quantity value After Action CompleteQC is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterDeliver+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Available Quantity value (Available Quantity value After Action CompleteQC = Available Quantity value After Deliver) After Action CompleteQC is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterDeliver+" But Actual Available Quantity value After Action CompleteQC is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterDeliver+". InCorrect");
		    softAssert.fail("Expected Available Quantity value (Available Quantity value After Action CompleteQC = Available Quantity value After Deliver) After Action CompleteQC is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterDeliver+" But Actual Available Quantity value After Action CompleteQC is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterDeliver+". InCorrect");
		}

		if(MethodsOrderFlowPositive.varPendingStockAfterActionCompleteQC == MethodsOrderFlowPositive.varPendingStockAfterDeliver){
		    test.log(Status.PASS, "Expected Pending Stock value (Pending Stock value After Action CompleteQC = Pending Stock value After Deliver) After Action CompleteQC is: "+MethodsOrderFlowPositive.varPendingStockAfterDeliver+" And Actual Pending Stock value After Action CompleteQC is: "+MethodsOrderFlowPositive.varPendingStockAfterActionCompleteQC+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Pending Stock value (Pending Stock value After Action CompleteQC = Pending Stock value After Deliver) After Action CompleteQC is: "+MethodsOrderFlowPositive.varPendingStockAfterDeliver+" But Actual Pending Stock value After Action CompleteQC is: "+MethodsOrderFlowPositive.varPendingStockAfterActionCompleteQC+". InCorrect");
		    softAssert.fail("Expected Pending Stock value (Pending Stock value After Action CompleteQC = Pending Stock value After Deliver) After Action CompleteQC is: "+MethodsOrderFlowPositive.varPendingStockAfterDeliver+" But Actual Pending Stock value After Action CompleteQC is: "+MethodsOrderFlowPositive.varPendingStockAfterActionCompleteQC+". InCorrect");
		}

		if(MethodsOrderFlowPositive.varTotalDemandAfterActionCompleteQC == MethodsOrderFlowPositive.varTotalDemandAfterDeliver){
		    test.log(Status.PASS, "Expected Total Demand value (Total Demand value After Action CompleteQC = Total Demand value After Deliver) After Action CompleteQC is: "+MethodsOrderFlowPositive.varTotalDemandAfterDeliver+" And Actual Total Demand value After Action CompleteQC is: "+MethodsOrderFlowPositive.varTotalDemandAfterActionCompleteQC+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Total Demand value (Total Demand value After Action CompleteQC = Total Demand value After Deliver) After Action CompleteQC is: "+MethodsOrderFlowPositive.varTotalDemandAfterDeliver+" But Actual Total Demand value After Action CompleteQC is: "+MethodsOrderFlowPositive.varTotalDemandAfterActionCompleteQC+". InCorrect");
		    softAssert.fail("Expected Total Demand value (Total Demand value After Action CompleteQC = Total Demand value After Deliver) After Action CompleteQC is: "+MethodsOrderFlowPositive.varTotalDemandAfterDeliver+" But Actual Total Demand value After Action CompleteQC is: "+MethodsOrderFlowPositive.varTotalDemandAfterActionCompleteQC+". InCorrect");
		}

		if(MethodsOrderFlowPositive.varStockAfterActionCompleteQC == MethodsOrderFlowPositive.varStockAfterDeliver){
		    test.log(Status.PASS, "Expected Stock value (Stock value After Action CompleteQC = Stock value After Deliver) After Action CompleteQC is: "+MethodsOrderFlowPositive.varStockAfterDeliver+" And Actual Stock value After Action CompleteQC is: "+MethodsOrderFlowPositive.varStockAfterActionCompleteQC+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Stock value (Stock value After Action CompleteQC = Stock value After Deliver) After Action CompleteQC is: "+MethodsOrderFlowPositive.varStockAfterDeliver+" But Actual Stock value After Action CompleteQC is: "+MethodsOrderFlowPositive.varStockAfterActionCompleteQC+". InCorrect");
		    softAssert.fail("Expected Stock value (Stock value After Action CompleteQC = Stock value After Deliver) After Action CompleteQC is: "+MethodsOrderFlowPositive.varStockAfterDeliver+" But Actual Stock value After Action CompleteQC is: "+MethodsOrderFlowPositive.varStockAfterActionCompleteQC+". InCorrect");
		}

		if(MethodsOrderFlowPositive.varIntransientStockAfterActionCompleteQC == MethodsOrderFlowPositive.varIntransientStockAfterDeliver){
		    test.log(Status.PASS, "Expected Intransient Stock value (Intransient Stock value After Action CompleteQC = Intransient Stock value After Deliver) After Action CompleteQC is: "+MethodsOrderFlowPositive.varIntransientStockAfterDeliver+" And Actual Intransient Stock value After Action CompleteQC is: "+MethodsOrderFlowPositive.varIntransientStockAfterActionCompleteQC+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Intransient Stock value (Intransient Stock value After Action CompleteQC = Intransient Stock value After Deliver) After Action CompleteQC is: "+MethodsOrderFlowPositive.varIntransientStockAfterDeliver+" But Actual Intransient Stock value After Action CompleteQC is: "+MethodsOrderFlowPositive.varIntransientStockAfterActionCompleteQC+". InCorrect");
		    softAssert.fail("Expected Intransient Stock value (Intransient Stock value After Action CompleteQC = Intransient Stock value After Deliver) After Action CompleteQC is: "+MethodsOrderFlowPositive.varIntransientStockAfterDeliver+" But Actual Intransient Stock value After Action CompleteQC is: "+MethodsOrderFlowPositive.varIntransientStockAfterActionCompleteQC+". InCorrect");
		}

		if(MethodsOrderFlowPositive.varAvailableStockAfterActionCompleteQC == MethodsOrderFlowPositive.varAvailableStockAfterDeliver){
		    test.log(Status.PASS, "Expected Available Stock value (Available Stock value After Action CompleteQC = Available Stock value After Deliver) After Action CompleteQC is: "+MethodsOrderFlowPositive.varAvailableStockAfterDeliver+" And Actual Available Stock value After Action CompleteQC is: "+MethodsOrderFlowPositive.varAvailableStockAfterActionCompleteQC+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Available Stock value (Available Stock value After Action CompleteQC = Available Stock value After Deliver) After Action CompleteQC is: "+MethodsOrderFlowPositive.varAvailableStockAfterDeliver+" But Actual Available Stock value After Action CompleteQC is: "+MethodsOrderFlowPositive.varAvailableStockAfterActionCompleteQC+". InCorrect");
		    softAssert.fail("Expected Available Stock value (Available Stock value After Action CompleteQC = Available Stock value After Deliver) After Action CompleteQC is: "+MethodsOrderFlowPositive.varAvailableStockAfterDeliver+" But Actual Available Stock value After Action CompleteQC is: "+MethodsOrderFlowPositive.varAvailableStockAfterActionCompleteQC+". InCorrect");
		}
	    
	    softAssert.assertAll();
	}
	
	
	
	@Test(dependsOnMethods = "testOrderFlowPositiveInventoryDetailsAfterActionCompleteQC",groups = {"OrderFlowPositive"})
	public void testOrderFlowPositiveAcceptItemQC(){
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderFlowPositive.methodOrderFlowPositiveAcceptItemQC();
	    
		TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	
	    String status = response.jsonPath().getString("payload.qcOrderItems[0].orderItemBatches[0].status");
	    if (!"Accepted".equals(status)) {
	    	test.log(Status.FAIL, "Expected Status is Accepted, but found:- "+status);
	    	Assert.fail("Test failed due to unexpected Status:- "+status);
	    } else {
	    	test.log(Status.PASS, "Passed because Status is:- "+status);
	    }

	    TestHelper.validateId(test, response);
	}
	
	
	
	@Test(dependsOnMethods = "testOrderFlowPositiveAcceptItemQC",groups = {"OrderFlowPositive"})
	public void testOrderFlowPositiveInventoryDetailsAfterAcceptItemQC(){
		SoftAssert softAssert = new SoftAssert();
		
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderFlowPositive.methodOrderFlowPositiveInventoryDetailsAfterAcceptItemQC();
	    
		TestHelper.logDetails(test, response);
		TestHelper.validateStatusCode(test, response, 200);
		
		if(MethodsOrderFlowPositive.varUsedQuantityAfterAcceptItemQC == MethodsOrderFlowPositive.varUsedQuantityAfterActionCompleteQC){
		    test.log(Status.PASS, "Expected Used Quantity value (Used Quantity value After Accept Item1QC = Used Quantity value After Action CompleteQC) After Accept Item1QC is: "+MethodsOrderFlowPositive.varUsedQuantityAfterActionCompleteQC+" And Actual Used Quantity value After Action CompleteQC is: "+MethodsOrderFlowPositive.varUsedQuantityAfterAcceptItemQC+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Used Quantity value (Used Quantity value After Accept Item1QC = Used Quantity value After Action CompleteQC) After Accept Item1QC is: "+MethodsOrderFlowPositive.varUsedQuantityAfterActionCompleteQC+" But Actual Used Quantity value After Action CompleteQC is: "+MethodsOrderFlowPositive.varUsedQuantityAfterAcceptItemQC+". InCorrect");
		    softAssert.fail("Expected Used Quantity value (Used Quantity value After Accept Item1QC = Used Quantity value After Action CompleteQC) After Accept Item1QC is: "+MethodsOrderFlowPositive.varUsedQuantityAfterActionCompleteQC+" But Actual Used Quantity value After Action CompleteQC is: "+MethodsOrderFlowPositive.varUsedQuantityAfterAcceptItemQC+". InCorrect");
		}

		if(MethodsOrderFlowPositive.varAvailableQuantityAfterAcceptItemQC == MethodsOrderFlowPositive.varAvailableQuantityAfterActionCompleteQC){
		    test.log(Status.PASS, "Expected Available Quantity value (Available Quantity value After Accept Item1QC = Available Quantity value After Action CompleteQC) After Accept Item1QC is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterActionCompleteQC+" And Actual Available Quantity value After Accept Item1QC is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterActionCompleteQC+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Available Quantity value (Available Quantity value After Accept Item1QC = Available Quantity value After Action CompleteQC) After Accept Item1QC is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterActionCompleteQC+" But Actual Available Quantity value After Accept Item1QC is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterActionCompleteQC+". InCorrect");
		    softAssert.fail("Expected Available Quantity value (Available Quantity value After Accept Item1QC = Available Quantity value After Action CompleteQC) After Accept Item1QC is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterActionCompleteQC+" But Actual Available Quantity value After Accept Item1QC is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterActionCompleteQC+". InCorrect");
		}

		if(MethodsOrderFlowPositive.varPendingStockAfterAcceptItemQC == MethodsOrderFlowPositive.varPendingStockAfterActionCompleteQC){
		    test.log(Status.PASS, "Expected Pending Stock value (Pending Stock value After Accept Item1QC = Pending Stock value After Action CompleteQC) After Accept Item1QC is: "+MethodsOrderFlowPositive.varPendingStockAfterActionCompleteQC+" And Actual Pending Stock value After Accept Item1QC is: "+MethodsOrderFlowPositive.varPendingStockAfterAcceptItemQC+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Pending Stock value (Pending Stock value After Accept Item1QC = Pending Stock value After Action CompleteQC) After Accept Item1QC is: "+MethodsOrderFlowPositive.varPendingStockAfterActionCompleteQC+" But Actual Pending Stock value After Accept Item1QC is: "+MethodsOrderFlowPositive.varPendingStockAfterAcceptItemQC+". InCorrect");
		    softAssert.fail("Expected Pending Stock value (Pending Stock value After Accept Item1QC = Pending Stock value After Action CompleteQC) After Accept Item1QC is: "+MethodsOrderFlowPositive.varPendingStockAfterActionCompleteQC+" But Actual Pending Stock value After Accept Item1QC is: "+MethodsOrderFlowPositive.varPendingStockAfterAcceptItemQC+". InCorrect");
		}

		if(MethodsOrderFlowPositive.varTotalDemandAfterAcceptItemQC == MethodsOrderFlowPositive.varTotalDemandAfterActionCompleteQC){
		    test.log(Status.PASS, "Expected Total Demand value (Total Demand value After Accept Item1QC = Total Demand value After Action CompleteQC) After Accept Item1QC is: "+MethodsOrderFlowPositive.varTotalDemandAfterActionCompleteQC+" And Actual Total Demand value After Accept Item1QC is: "+MethodsOrderFlowPositive.varTotalDemandAfterAcceptItemQC+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Total Demand value (Total Demand value After Accept Item1QC = Total Demand value After Action CompleteQC) After Accept Item1QC is: "+MethodsOrderFlowPositive.varTotalDemandAfterActionCompleteQC+" But Actual Total Demand value After Accept Item1QC is: "+MethodsOrderFlowPositive.varTotalDemandAfterAcceptItemQC+". InCorrect");
		    softAssert.fail("Expected Total Demand value (Total Demand value After Accept Item1QC = Total Demand value After Action CompleteQC) After Accept Item1QC is: "+MethodsOrderFlowPositive.varTotalDemandAfterActionCompleteQC+" But Actual Total Demand value After Accept Item1QC is: "+MethodsOrderFlowPositive.varTotalDemandAfterAcceptItemQC+". InCorrect");
		}

		if(MethodsOrderFlowPositive.varStockAfterAcceptItemQC == MethodsOrderFlowPositive.varStockAfterActionCompleteQC){
		    test.log(Status.PASS, "Expected Stock value (Stock value After Accept Item1QC = Stock value After Action CompleteQC) After Accept Item1QC is: "+MethodsOrderFlowPositive.varStockAfterActionCompleteQC+" And Actual Stock value After Accept Item1QC is: "+MethodsOrderFlowPositive.varStockAfterAcceptItemQC+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Stock value (Stock value After Accept Item1QC = Stock value After Action CompleteQC) After Accept Item1QC is: "+MethodsOrderFlowPositive.varStockAfterActionCompleteQC+" But Actual Stock value After Accept Item1QC is: "+MethodsOrderFlowPositive.varStockAfterAcceptItemQC+". InCorrect");
		    softAssert.fail("Expected Stock value (Stock value After Accept Item1QC = Stock value After Action CompleteQC) After Accept Item1QC is: "+MethodsOrderFlowPositive.varStockAfterActionCompleteQC+" But Actual Stock value After Accept Item1QC is: "+MethodsOrderFlowPositive.varStockAfterAcceptItemQC+". InCorrect");
		}

		if(MethodsOrderFlowPositive.varIntransientStockAfterAcceptItemQC == MethodsOrderFlowPositive.varIntransientStockAfterActionCompleteQC){
		    test.log(Status.PASS, "Expected Intransient Stock value (Intransient Stock value After Accept Item1QC = Intransient Stock value After Action CompleteQC) After Accept Item1QC is: "+MethodsOrderFlowPositive.varIntransientStockAfterActionCompleteQC+" And Actual Intransient Stock value After Accept Item1QC is: "+MethodsOrderFlowPositive.varIntransientStockAfterAcceptItemQC+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Intransient Stock value (Intransient Stock value After Accept Item1QC = Intransient Stock value After Action CompleteQC) After Accept Item1QC is: "+MethodsOrderFlowPositive.varIntransientStockAfterActionCompleteQC+" But Actual Intransient Stock value After Accept Item1QC is: "+MethodsOrderFlowPositive.varIntransientStockAfterAcceptItemQC+". InCorrect");
		    softAssert.fail("Expected Intransient Stock value (Intransient Stock value After Accept Item1QC = Intransient Stock value After Action CompleteQC) After Accept Item1QC is: "+MethodsOrderFlowPositive.varIntransientStockAfterActionCompleteQC+" But Actual Intransient Stock value After Accept Item1QC is: "+MethodsOrderFlowPositive.varIntransientStockAfterAcceptItemQC+". InCorrect");
		}

		if(MethodsOrderFlowPositive.varAvailableStockAfterAcceptItemQC == MethodsOrderFlowPositive.varAvailableStockAfterActionCompleteQC){
		    test.log(Status.PASS, "Expected Available Stock value (Available Stock value After Accept Item1QC = Available Stock value After Action CompleteQC) After Accept Item1QC is: "+MethodsOrderFlowPositive.varAvailableStockAfterActionCompleteQC+" And Actual Available Stock value After Accept Item1QC is: "+MethodsOrderFlowPositive.varAvailableStockAfterAcceptItemQC+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Available Stock value (Available Stock value After Accept Item1QC = Available Stock value After Action CompleteQC) After Accept Item1QC is: "+MethodsOrderFlowPositive.varAvailableStockAfterActionCompleteQC+" But Actual Available Stock value After Accept Item1QC is: "+MethodsOrderFlowPositive.varAvailableStockAfterAcceptItemQC+". InCorrect");
		    softAssert.fail("Expected Available Stock value (Available Stock value After Accept Item1QC = Available Stock value After Action CompleteQC) After Accept Item1QC is: "+MethodsOrderFlowPositive.varAvailableStockAfterActionCompleteQC+" But Actual Available Stock value After Accept Item1QC is: "+MethodsOrderFlowPositive.varAvailableStockAfterAcceptItemQC+". InCorrect");
		}
	    
	    softAssert.assertAll();
	}

	
	
	@Test(dependsOnMethods = "testOrderFlowPositiveInventoryDetailsAfterAcceptItemQC",groups = {"OrderFlowPositive"})
	public void testOrderFlowPositiveCompleteQC(){
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderFlowPositive.methodOrderFlowPositiveCompleteQC();
		
		TestHelper.logDetails(test, response);
		TestHelper.validateStatusCode(test, response, 200);
		TestHelper.validateOrderStatus(test, response, "QC_Completed");
	    TestHelper.validateId(test, response);
	}

	
	
	@Test(dependsOnMethods = "testOrderFlowPositiveCompleteQC", groups = {"OrderFlowPositive"})
	public void testOrderFlowPositiveInventoryDetailsAfterCompleteQC(){
		SoftAssert softAssert = new SoftAssert();
		
		ExtentTest test = ExtentReportManager.getTest();
	    Response response = MethodsOrderFlowPositive.methodOrderFlowPositiveInventoryDetailsAfterCompleteQC();
	    
	    TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    
	    if(MethodsOrderFlowPositive.varUsedQuantityAfterCompleteQC == MethodsOrderFlowPositive.varUsedQuantityAfterAcceptItemQC){
	        test.log(Status.PASS, "Expected Used Quantity value (Used Quantity value After CompleteQC = Used Quantity value After Accept ItemQC) After CompleteQC is: "+MethodsOrderFlowPositive.varUsedQuantityAfterAcceptItemQC+" And Actual Used Quantity value After Accept ItemQC is: "+MethodsOrderFlowPositive.varUsedQuantityAfterCompleteQC+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Used Quantity value (Used Quantity value After CompleteQC = Used Quantity value After Accept ItemQC) After CompleteQC is: "+MethodsOrderFlowPositive.varUsedQuantityAfterAcceptItemQC+" But Actual Used Quantity value After Accept ItemQC is: "+MethodsOrderFlowPositive.varUsedQuantityAfterCompleteQC+". InCorrect");
	        softAssert.fail("Expected Used Quantity value (Used Quantity value After CompleteQC = Used Quantity value After Accept ItemQC) After CompleteQC is: "+MethodsOrderFlowPositive.varUsedQuantityAfterAcceptItemQC+" But Actual Used Quantity value After Accept ItemQC is: "+MethodsOrderFlowPositive.varUsedQuantityAfterCompleteQC+". InCorrect");
	    }

	    if(MethodsOrderFlowPositive.varAvailableQuantityAfterCompleteQC == MethodsOrderFlowPositive.varAvailableQuantityAfterAcceptItemQC){
	        test.log(Status.PASS, "Expected Available Quantity value (Available Quantity value After CompleteQC = Available Quantity value After Accept ItemQC) After CompleteQC is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterAcceptItemQC+" And Actual Available Quantity value After CompleteQC is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterCompleteQC+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Available Quantity value (Available Quantity value After CompleteQC = Available Quantity value After Accept ItemQC) After CompleteQC is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterAcceptItemQC+" But Actual Available Quantity value After CompleteQC is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterCompleteQC+". InCorrect");
	        softAssert.fail("Expected Available Quantity value (Available Quantity value After CompleteQC = Available Quantity value After Accept ItemQC) After CompleteQC is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterAcceptItemQC+" But Actual Available Quantity value After CompleteQC is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterCompleteQC+". InCorrect");
	    }

	    if(MethodsOrderFlowPositive.varPendingStockAfterCompleteQC == MethodsOrderFlowPositive.varPendingStockAfterAcceptItemQC){
	        test.log(Status.PASS, "Expected Pending Stock value (Pending Stock value After CompleteQC = Pending Stock value After Accept ItemQC) After CompleteQC is: "+MethodsOrderFlowPositive.varPendingStockAfterAcceptItemQC+" And Actual Pending Stock value After Accept ItemQC is: "+MethodsOrderFlowPositive.varPendingStockAfterCompleteQC+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Pending Stock value (Pending Stock value After CompleteQC = Pending Stock value After Accept ItemQC) After CompleteQC is: "+MethodsOrderFlowPositive.varPendingStockAfterAcceptItemQC+" But Actual Pending Stock value After Accept ItemQC is: "+MethodsOrderFlowPositive.varPendingStockAfterCompleteQC+". InCorrect");
	        softAssert.fail("Expected Pending Stock value (Pending Stock value After CompleteQC = Pending Stock value After Accept ItemQC) After CompleteQC is: "+MethodsOrderFlowPositive.varPendingStockAfterAcceptItemQC+" But Actual Pending Stock value After Accept ItemQC is: "+MethodsOrderFlowPositive.varPendingStockAfterCompleteQC+". InCorrect");
	    }

	    if(MethodsOrderFlowPositive.varStockAfterCompleteQC == MethodsOrderFlowPositive.varStockAfterAcceptItemQC){
	        test.log(Status.PASS, "Expected Stock value (Stock value After CompleteQC = Stock value After Accept ItemQC) After CompleteQC is: "+MethodsOrderFlowPositive.varStockAfterAcceptItemQC+" And Actual Stock value After CompleteQC is: "+MethodsOrderFlowPositive.varStockAfterCompleteQC+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Stock value (Stock value After CompleteQC = Stock value After Accept ItemQC) After CompleteQC is: "+MethodsOrderFlowPositive.varStockAfterAcceptItemQC+" But Actual Stock value After CompleteQC is: "+MethodsOrderFlowPositive.varStockAfterCompleteQC+". InCorrect");
	        softAssert.fail("Expected Stock value (Stock value After CompleteQC = Stock value After Accept ItemQC) After CompleteQC is: "+MethodsOrderFlowPositive.varStockAfterAcceptItemQC+" But Actual Stock value After CompleteQC is: "+MethodsOrderFlowPositive.varStockAfterCompleteQC+". InCorrect");
	    }

	    if(MethodsOrderFlowPositive.varIntransientStockAfterCompleteQC == MethodsOrderFlowPositive.varIntransientStockAfterAcceptItemQC){
	        test.log(Status.PASS, "Expected Intransient Stock value (Intransient Stock value After CompleteQC = Intransient Stock value After Accept ItemQC) After CompleteQC is: "+MethodsOrderFlowPositive.varIntransientStockAfterAcceptItemQC+" And Actual Intransient Stock value After CompleteQC is: "+MethodsOrderFlowPositive.varIntransientStockAfterCompleteQC+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Intransient Stock value (Intransient Stock value After CompleteQC = Intransient Stock value After Accept ItemQC) After CompleteQC is: "+MethodsOrderFlowPositive.varIntransientStockAfterAcceptItemQC+" But Actual Intransient Stock value After CompleteQC is: "+MethodsOrderFlowPositive.varIntransientStockAfterCompleteQC+". InCorrect");
	        softAssert.fail("Expected Intransient Stock value (Intransient Stock value After CompleteQC = Intransient Stock value After Accept ItemQC) After CompleteQC is: "+MethodsOrderFlowPositive.varIntransientStockAfterAcceptItemQC+" But Actual Intransient Stock value After CompleteQC is: "+MethodsOrderFlowPositive.varIntransientStockAfterCompleteQC+". InCorrect");
	    }

	    if(MethodsOrderFlowPositive.varAvailableStockAfterCompleteQC == MethodsOrderFlowPositive.varAvailableStockAfterAcceptItemQC){
	        test.log(Status.PASS, "Expected Available Stock value (Available Stock value After CompleteQC = Available Stock value After Accept ItemQC) After CompleteQC is: "+MethodsOrderFlowPositive.varAvailableStockAfterAcceptItemQC+" And Actual Available Stock value After CompleteQC is: "+MethodsOrderFlowPositive.varAvailableStockAfterCompleteQC+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Available Stock value (Available Stock value After CompleteQC = Available Stock value After Accept ItemQC) After CompleteQC is: "+MethodsOrderFlowPositive.varAvailableStockAfterAcceptItemQC+" But Actual Available Stock value After CompleteQC is: "+MethodsOrderFlowPositive.varAvailableStockAfterCompleteQC+". InCorrect");
	        softAssert.fail("Expected Available Stock value (Available Stock value After CompleteQC = Available Stock value After Accept ItemQC) After CompleteQC is: "+MethodsOrderFlowPositive.varAvailableStockAfterAcceptItemQC+" But Actual Available Stock value After CompleteQC is: "+MethodsOrderFlowPositive.varAvailableStockAfterCompleteQC+". InCorrect");
	    }

	    if(MethodsOrderFlowPositive.varTotalDemandAfterCompleteQC == MethodsOrderFlowPositive.varTotalDemandAfterAcceptItemQC){
	        test.log(Status.PASS, "Expected Total Demand value (Total Demand value After CompleteQC = Total Demand value After Accept ItemQC) After CompleteQC is: "+MethodsOrderFlowPositive.varTotalDemandAfterAcceptItemQC+" And Actual Total Demand value After CompleteQC is: "+MethodsOrderFlowPositive.varTotalDemandAfterCompleteQC+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Total Demand value (Total Demand value After CompleteQC = Total Demand value After Accept ItemQC) After CompleteQC is: "+MethodsOrderFlowPositive.varTotalDemandAfterAcceptItemQC+" But Actual Total Demand value After CompleteQC is: "+MethodsOrderFlowPositive.varTotalDemandAfterCompleteQC+". InCorrect");
	        softAssert.fail("Expected Total Demand value (Total Demand value After CompleteQC = Total Demand value After Accept ItemQC) After CompleteQC is: "+MethodsOrderFlowPositive.varTotalDemandAfterAcceptItemQC+" But Actual Total Demand value After CompleteQC is: "+MethodsOrderFlowPositive.varTotalDemandAfterCompleteQC+". InCorrect");
	    }
	    
	    softAssert.assertAll();
	}
	
	

	@Test(dependsOnMethods = "testOrderFlowPositiveInventoryDetailsAfterCompleteQC",groups = {"OrderFlowPositive"})
	public void testOrderFlowPositiveInventorySettlement(){
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderFlowPositive.methodOrderFlowPositiveInventorySettlement();
		
		TestHelper.logDetails(test, response);
		TestHelper.validateStatusCode(test, response, 200);
		TestHelper.validateOrderStatus(test, response, "COMPLETED");
	    TestHelper.validateId(test, response);
	}
	
	
	
	@Test(dependsOnMethods = "testOrderFlowPositiveInventorySettlement", groups = {"OrderFlowPositive"})
	public void testOrderFlowPositiveInventoryDetailsAfterInventorySettlement(){
		SoftAssert softAssert = new SoftAssert();
		
		ExtentTest test = ExtentReportManager.getTest();
	    Response response = MethodsOrderFlowPositive.methodOrderFlowPositiveInventoryDetailsAfterInventorySettlement();
	    
	    TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    
	    if (MethodsOrderFlowPositive.varTotalDemandAfterInventorySettlement == (MethodsOrderFlowPositive.varTotalDemandAfterCompleteQC - MethodsOrderFlowPositive.varOrderedQuantity)) {
	        test.log(Status.PASS, "Total Demand value After CompleteQC is: " + MethodsOrderFlowPositive.varTotalDemandAfterCompleteQC + ", Ordered Quantity is: " + MethodsOrderFlowPositive.varOrderedQuantity + ", Expected Total Demand value (Total Demand Value After CompleteQC - Ordered Quantity) After Inventory Settlement is: " + (MethodsOrderFlowPositive.varTotalDemandAfterCompleteQC - MethodsOrderFlowPositive.varOrderedQuantity) + ", And Actual Total Demand value After Inventory Settlement is: " + MethodsOrderFlowPositive.varTotalDemandAfterInventorySettlement + ". Correct");
	    } else {
	        test.log(Status.FAIL, "Total Demand value After CompleteQC is: " + MethodsOrderFlowPositive.varTotalDemandAfterCompleteQC + ", Ordered Quantity is: " + MethodsOrderFlowPositive.varOrderedQuantity + ", Expected Total Demand value (Total Demand Value After CompleteQC - Ordered Quantity) After Inventory Settlement is: " + (MethodsOrderFlowPositive.varTotalDemandAfterCompleteQC - MethodsOrderFlowPositive.varOrderedQuantity) + ", But Actual Total Demand value After Inventory Settlement is: " + MethodsOrderFlowPositive.varTotalDemandAfterInventorySettlement + ". Incorrect");
	        softAssert.fail("Total Demand value After CompleteQC is: " + MethodsOrderFlowPositive.varTotalDemandAfterCompleteQC + ", Ordered Quantity is: " + MethodsOrderFlowPositive.varOrderedQuantity + ", Expected Total Demand value (Pending Stock Value After CompleteQC - Ordered Quantity) After Inventory Settlement is: " + (MethodsOrderFlowPositive.varTotalDemandAfterCompleteQC - MethodsOrderFlowPositive.varOrderedQuantity) + ", But Actual Total Demand value After Inventory Settlement is: " + MethodsOrderFlowPositive.varTotalDemandAfterInventorySettlement + ". Incorrect");
	    }
	    
	    if(MethodsOrderFlowPositive.varUsedQuantityAfterInventorySettlement == (MethodsOrderFlowPositive.varUsedQuantityAfterCompleteQC - MethodsOrderFlowPositive.varOrderedQuantity)){
	        test.log(Status.PASS, "Used Quantity value After Complete QC is: "+MethodsOrderFlowPositive.varUsedQuantityAfterCompleteQC+", Ordered Quantity is: "+MethodsOrderFlowPositive.varOrderedQuantity+ ", Expected Used Quantity value (Used Quantity value After Complete QC - Ordered Quantity) After Inventory Settlement is: "+(MethodsOrderFlowPositive.varUsedQuantityAfterCompleteQC - MethodsOrderFlowPositive.varOrderedQuantity)+ ", And Actual Used Quantity value After Inventory Settlement is: "+MethodsOrderFlowPositive.varUsedQuantityAfterInventorySettlement+". Correct");
	    } else {
	        test.log(Status.FAIL, "Used Quantity value After Complete QC is: "+MethodsOrderFlowPositive.varUsedQuantityAfterCompleteQC+", Ordered Quantity is: "+MethodsOrderFlowPositive.varOrderedQuantity+ ", Expected Used Quantity value (Used Quantity value After Complete QC - Ordered Quantity) After Inventory Settlement is: "+(MethodsOrderFlowPositive.varUsedQuantityAfterCompleteQC - MethodsOrderFlowPositive.varOrderedQuantity)+ ", But Actual Used Quantity value After Inventory Settlement is: "+MethodsOrderFlowPositive.varUsedQuantityAfterInventorySettlement+". Incorrect");
	        softAssert.fail("Used Quantity value After Complete QC is: "+MethodsOrderFlowPositive.varUsedQuantityAfterCompleteQC+", Ordered Quantity is: "+MethodsOrderFlowPositive.varOrderedQuantity+", Expected Used Quantity value (Used Quantity value After Complete QC - Ordered Quantity) After Inventory Settlement is: "+(MethodsOrderFlowPositive.varUsedQuantityAfterCompleteQC - MethodsOrderFlowPositive.varOrderedQuantity)+ ", But Actual Used Quantity value After Inventory Settlement is: "+MethodsOrderFlowPositive.varUsedQuantityAfterInventorySettlement+". Incorrect");
	    }
	    
	    if(MethodsOrderFlowPositive.varIntransientStockAfterInventorySettlement == (MethodsOrderFlowPositive.varIntransientStockAfterCompleteQC - MethodsOrderFlowPositive.varOrderedQuantity)){
	        test.log(Status.PASS, "Intransient Stock value After CompleteQC is: "+MethodsOrderFlowPositive.varIntransientStockAfterCompleteQC+", Ordered Quantity is: "+MethodsOrderFlowPositive.varOrderedQuantity+ ", Expected Intransient Stock value (Intransient Stock value After CompleteQC - Ordered Quantity) After Inventory Settlement is: "+(MethodsOrderFlowPositive.varIntransientStockAfterCompleteQC - MethodsOrderFlowPositive.varOrderedQuantity)+ ", And Actual Intransient Stock value After Inventory Settlement is: "+MethodsOrderFlowPositive.varIntransientStockAfterInventorySettlement+". Correct");
	    } else {
	        test.log(Status.FAIL, "Intransient Stock value After CompleteQC is: "+MethodsOrderFlowPositive.varIntransientStockAfterCompleteQC+", Ordered Quantity is: "+MethodsOrderFlowPositive.varOrderedQuantity+ ", Expected Intransient Stock value (Intransient Stock value After CompleteQC - Ordered Quantity) After Inventory Settlement is: "+(MethodsOrderFlowPositive.varIntransientStockAfterCompleteQC - MethodsOrderFlowPositive.varOrderedQuantity)+ ", But Actual Intransient Stock value After Inventory Settlement is: "+MethodsOrderFlowPositive.varIntransientStockAfterInventorySettlement+". Incorrect");
	        softAssert.fail("Intransient Stock value After CompleteQC is: "+MethodsOrderFlowPositive.varIntransientStockAfterCompleteQC+", Ordered Quantity is: "+MethodsOrderFlowPositive.varOrderedQuantity+ ", Expected Intransient Stock value (Intransient Stock value After CompleteQC - Ordered Quantity) After Inventory Settlement is: "+(MethodsOrderFlowPositive.varIntransientStockAfterCompleteQC - MethodsOrderFlowPositive.varOrderedQuantity)+ ", But Actual Intransient Stock value After Inventory Settlement is: "+MethodsOrderFlowPositive.varIntransientStockAfterInventorySettlement+". Incorrect");
	    }
	    
	    if(MethodsOrderFlowPositive.varStockAfterInventorySettlement == (MethodsOrderFlowPositive.varStockAfterCompleteQC - MethodsOrderFlowPositive.varOrderedQuantity)){
	        test.log(Status.PASS, "Stock value After CompleteQC is: "+MethodsOrderFlowPositive.varStockAfterCompleteQC+", Ordered Quantity is: "+MethodsOrderFlowPositive.varOrderedQuantity+ ", Expected Stock value (Stock value After CompleteQC - Ordered Quantity) After Inventory Settlement is: "+(MethodsOrderFlowPositive.varStockAfterCompleteQC - MethodsOrderFlowPositive.varOrderedQuantity)+ ", And Actual Stock value After Inventory Settlement is: "+MethodsOrderFlowPositive.varStockAfterInventorySettlement+". Correct");
	    } else {
	        test.log(Status.FAIL, "Stock value After CompleteQC is: "+MethodsOrderFlowPositive.varStockAfterCompleteQC+", Ordered Quantity is: "+MethodsOrderFlowPositive.varOrderedQuantity+ ", Expected Stock value (Stock value After CompleteQC - Ordered Quantity) After Inventory Settlement is: "+(MethodsOrderFlowPositive.varStockAfterCompleteQC - MethodsOrderFlowPositive.varOrderedQuantity)+ ", But Actual Stock value After Inventory Settlement is: "+MethodsOrderFlowPositive.varStockAfterInventorySettlement+". Incorrect");
	        softAssert.fail("Stock value After CompleteQC is: "+MethodsOrderFlowPositive.varStockAfterCompleteQC+", Ordered Quantity is: "+MethodsOrderFlowPositive.varOrderedQuantity+ ", Expected Stock value (Stock value After CompleteQC - Ordered Quantity) After Inventory Settlement is: "+(MethodsOrderFlowPositive.varStockAfterCompleteQC - MethodsOrderFlowPositive.varOrderedQuantity)+ ", But Actual Stock value After Inventory Settlement is: "+MethodsOrderFlowPositive.varStockAfterInventorySettlement+". Incorrect");
	    }
	    
	    if(MethodsOrderFlowPositive.varAvailableQuantityAfterInventorySettlement == MethodsOrderFlowPositive.varAvailableQuantityAfterCompleteQC){
	        test.log(Status.PASS, "Expected Available Quantity value (Available Quantity value After Inventory Settlement = Available Quantity value After CompleteQC) After Inventory Settlement is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterCompleteQC+" And Actual Available Quantity value After Inventory Settlement is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterInventorySettlement+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Available Quantity value (Available Quantity value After Inventory Settlement = Available Quantity value After CompleteQC) After Inventory Settlement is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterCompleteQC+" But Actual Available Quantity value After Inventory Settlement is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterInventorySettlement+". InCorrect");
	        softAssert.fail("Expected Available Quantity value (Available Quantity value After Inventory Settlement = Available Quantity value After CompleteQC) After Inventory Settlement is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterCompleteQC+" But Actual Available Quantity value After Inventory Settlement is: "+MethodsOrderFlowPositive.varAvailableQuantityAfterInventorySettlement+". InCorrect");
	    }

	    if(MethodsOrderFlowPositive.varPendingStockAfterInventorySettlement == MethodsOrderFlowPositive.varPendingStockAfterCompleteQC){
	        test.log(Status.PASS, "Expected Pending Stock value (Pending Stock value After Inventory Settlement = Pending Stock value After CompleteQC) After Inventory Settlement is: "+MethodsOrderFlowPositive.varPendingStockAfterCompleteQC+" And Actual Pending Stock value After Inventory Settlement is: "+MethodsOrderFlowPositive.varPendingStockAfterInventorySettlement+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Pending Stock value (Pending Stock value After Inventory Settlement = Pending Stock value After CompleteQC) After Inventory Settlement is: "+MethodsOrderFlowPositive.varPendingStockAfterCompleteQC+" But Actual Pending Stock value After Inventory Settlement is: "+MethodsOrderFlowPositive.varPendingStockAfterInventorySettlement+". InCorrect");
	        softAssert.fail("Expected Pending Stock value (Pending Stock value After Inventory Settlement = Pending Stock value After CompleteQC) After Inventory Settlement is: "+MethodsOrderFlowPositive.varPendingStockAfterCompleteQC+" But Actual Pending Stock value After Inventory Settlement is: "+MethodsOrderFlowPositive.varPendingStockAfterInventorySettlement+". InCorrect");
	    }

	    if(MethodsOrderFlowPositive.varAvailableStockAfterInventorySettlement == MethodsOrderFlowPositive.varAvailableStockAfterCompleteQC){
	        test.log(Status.PASS, "Expected Available Stock value (Available Stock value After Inventory Settlement = Available Stock value After CompleteQC) After Inventory Settlement is: "+MethodsOrderFlowPositive.varAvailableStockAfterCompleteQC+" And Actual Available Stock value After Inventory Settlement is: "+MethodsOrderFlowPositive.varAvailableStockAfterInventorySettlement+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Available Stock value (Available Stock value After Inventory Settlement = Available Stock value After CompleteQC) After Inventory Settlement is: "+MethodsOrderFlowPositive.varAvailableStockAfterCompleteQC+" But Actual Available Stock value After Inventory Settlement is: "+MethodsOrderFlowPositive.varAvailableStockAfterInventorySettlement+". InCorrect");
	        softAssert.fail("Expected Available Stock value (Available Stock value After Inventory Settlement = Available Stock value After CompleteQC) After Inventory Settlement is: "+MethodsOrderFlowPositive.varAvailableStockAfterCompleteQC+" But Actual Available Stock value After Inventory Settlement is: "+MethodsOrderFlowPositive.varAvailableStockAfterInventorySettlement+". InCorrect");
	    }
	    
	    softAssert.assertAll();
	}
	
}