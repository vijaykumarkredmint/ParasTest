package orderUpdateDispatch;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import allCommonData.TestHelper;
import io.restassured.response.Response;
import utilities.ExtentReportManager;

public class TestsOrderUpdateDispatch {

	@Test(priority = 1,groups = {"OrderUpdateDispatch"})
	public void testOrderUpdateDispatchInventoryDetailsBeforeCreateOrder(){
		SoftAssert softAssert = new SoftAssert();
		
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderUpdateDispatch.methodOrderUpdateDispatchInventoryDetailsBeforeCreateOrder();
        
		TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    
	    if(MethodsOrderUpdateDispatch.varPendingStockBeforeCreateOrder>=0){
	    	test.log(Status.PASS, "Expected Pending Stock value before Create Order should be long number "+ "And Actual is: "+MethodsOrderUpdateDispatch.varPendingStockBeforeCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Pending Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderUpdateDispatch.varPendingStockBeforeCreateOrder+". Incorrect");
	    	softAssert.fail("Expected Pending Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderUpdateDispatch.varPendingStockBeforeCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderUpdateDispatch.varTotalDemandBeforeCreateOrder>=0){
	    	test.log(Status.PASS, "Expected Total Demand value before Create Order should be long number "+ "And Actual is: "+MethodsOrderUpdateDispatch.varTotalDemandBeforeCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Total Demand value before Create Order should be long number "+ "But Actual is: "+MethodsOrderUpdateDispatch.varTotalDemandBeforeCreateOrder+". Incorrect");
	    	softAssert.fail("Expected Total Demand value should be before Create Order long number "+ "But Actual is: "+MethodsOrderUpdateDispatch.varTotalDemandBeforeCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderUpdateDispatch.varStockBeforeCreateOrder>=0){
	    	test.log(Status.PASS, "Expected Stock value before Create Order should be long number "+ "And Actual is: "+MethodsOrderUpdateDispatch.varStockBeforeCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderUpdateDispatch.varStockBeforeCreateOrder+". Incorrect");
	    	softAssert.fail("Expected Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderUpdateDispatch.varStockBeforeCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderUpdateDispatch.varIntransientStockBeforeCreateOrder>=0){
	    	test.log(Status.PASS, "Expected Intransient Stock value before Create Order should be long number "+ "And Actual is: "+MethodsOrderUpdateDispatch.varIntransientStockBeforeCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Intransient Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderUpdateDispatch.varIntransientStockBeforeCreateOrder+". Incorrect");
	    	softAssert.fail("Expected Intransient Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderUpdateDispatch.varIntransientStockBeforeCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderUpdateDispatch.varAvailableStockBeforeCreateOrder>=0){
	    	test.log(Status.PASS, "Expected Available Stock value before Create Order should be long number "+ "And Actual is: "+MethodsOrderUpdateDispatch.varAvailableStockBeforeCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Available Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderUpdateDispatch.varAvailableStockBeforeCreateOrder+". Incorrect");
	    	softAssert.fail("Expected Available Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderUpdateDispatch.varAvailableStockBeforeCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderUpdateDispatch.varUsedQuantityBeforeCreateOrder>=0){
	    	test.log(Status.PASS, "Expected Used Quantity value before Create Order should be long number "+ "And Actual is: "+MethodsOrderUpdateDispatch.varUsedQuantityBeforeCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Used Quantity value before Create Order should be long number "+ "But Actual is: "+MethodsOrderUpdateDispatch.varUsedQuantityBeforeCreateOrder+". Incorrect");
	    	softAssert.fail("Expected Used Quantity value should be before Create Order long number "+ "But Actual is: "+MethodsOrderUpdateDispatch.varUsedQuantityBeforeCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderUpdateDispatch.varAvailableQuantityBeforeCreateOrder>=0){
	    	test.log(Status.PASS, "Expected Available Quantity value before Create Order should be long number "+ "And Actual is: "+MethodsOrderUpdateDispatch.varAvailableQuantityBeforeCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Available Quantity value before Create Order should be long number "+ "But Actual is: "+MethodsOrderUpdateDispatch.varAvailableQuantityBeforeCreateOrder+". Incorrect");
	    	softAssert.fail("Expected Available Quantity value should be before Create Order long number "+ "But Actual is: "+MethodsOrderUpdateDispatch.varAvailableQuantityBeforeCreateOrder+". Incorrect");
	    }
	    
	    softAssert.assertAll();
	}
	
	
	
	@Test(dependsOnMethods = "testOrderUpdateDispatchInventoryDetailsBeforeCreateOrder", groups = {"OrderUpdateDispatch"})
	public void testOrderUpdateDispatchCreateOrder(){
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderUpdateDispatch.methodOrderUpdateDispatchCreateOrder();
        
		TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    TestHelper.validateStatus(test, response, "Created");
	    TestHelper.validateId(test, response);
	}

	
	
	@Test(dependsOnMethods = "testOrderUpdateDispatchCreateOrder",groups = {"OrderUpdateDispatch"})
	public void testOrderUpdateDispatchInventoryDetailsAfterCreateOrder(){
		SoftAssert softAssert = new SoftAssert();
		
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderUpdateDispatch.methodOrderUpdateDispatchInventoryDetailsAfterCreateOrder();
        
		TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    
	    if(MethodsOrderUpdateDispatch.varPendingStockAfterCreateOrder==(MethodsOrderUpdateDispatch.varPendingStockBeforeCreateOrder+MethodsOrderUpdateDispatch.varOrderedQuantity)){
	    	test.log(Status.PASS, "Pending Stock value Before Create Order is: "+MethodsOrderUpdateDispatch.varPendingStockBeforeCreateOrder+", Ordered Quantity is: "+MethodsOrderUpdateDispatch.varOrderedQuantity+ ", Expected Pending Stock value (Pending Stock Value Before Creating Order + Ordered Quantity) After Create Order is: "+(MethodsOrderUpdateDispatch.varPendingStockBeforeCreateOrder+MethodsOrderUpdateDispatch.varOrderedQuantity)+ ", And Actual Pending Stock value After Create Order is: "+MethodsOrderUpdateDispatch.varPendingStockAfterCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Pending Stock value Before Create Order is: "+MethodsOrderUpdateDispatch.varPendingStockBeforeCreateOrder+", Ordered Quantity is: "+MethodsOrderUpdateDispatch.varOrderedQuantity+ ", Expected Pending Stock value (Pending Stock Value Before Creating Order + Ordered Quantity) After Create Order is: "+(MethodsOrderUpdateDispatch.varPendingStockBeforeCreateOrder+MethodsOrderUpdateDispatch.varOrderedQuantity)+ ", But Actual Pending Stock value After Create Order is: "+MethodsOrderUpdateDispatch.varPendingStockAfterCreateOrder+". Incorrect");
	    	softAssert.fail("Pending Stock value Before Create Order is: "+MethodsOrderUpdateDispatch.varPendingStockBeforeCreateOrder+", Ordered Quantity is: "+MethodsOrderUpdateDispatch.varOrderedQuantity+ ", Expected Pending Stock value (Pending Stock Value Before Creating Order + Ordered Quantity) After Create Order is: "+(MethodsOrderUpdateDispatch.varPendingStockBeforeCreateOrder+MethodsOrderUpdateDispatch.varOrderedQuantity)+ ", But Actual Pending Stock value After Create Order is: "+MethodsOrderUpdateDispatch.varPendingStockAfterCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderUpdateDispatch.varTotalDemandAfterCreateOrder==(MethodsOrderUpdateDispatch.varTotalDemandBeforeCreateOrder+MethodsOrderUpdateDispatch.varOrderedQuantity)){
	    	test.log(Status.PASS, "Total Demand value Before Create Order is: "+MethodsOrderUpdateDispatch.varTotalDemandBeforeCreateOrder+", Ordered Quantity is: "+MethodsOrderUpdateDispatch.varOrderedQuantity+ ", Expected Total Demand value (Total Demand Value Before Creating Order + Ordered Quantity) After Create Order is: "+(MethodsOrderUpdateDispatch.varTotalDemandBeforeCreateOrder+MethodsOrderUpdateDispatch.varOrderedQuantity)+ ", And Actual Total Demand value After Create Order is: "+MethodsOrderUpdateDispatch.varTotalDemandAfterCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Total Demand value Before Create Order is: "+MethodsOrderUpdateDispatch.varTotalDemandBeforeCreateOrder+", Ordered Quantity is: "+MethodsOrderUpdateDispatch.varOrderedQuantity+ ", Expected Total Demand value (Total Demand Value Before Creating Order + Ordered Quantity) After Create Order is: "+(MethodsOrderUpdateDispatch.varTotalDemandBeforeCreateOrder+MethodsOrderUpdateDispatch.varOrderedQuantity)+ ", But Actual Total Demand value After Create Order is: "+MethodsOrderUpdateDispatch.varTotalDemandAfterCreateOrder+". Incorrect");
	    	softAssert.fail("Total Demand value Before Create Order is: "+MethodsOrderUpdateDispatch.varTotalDemandBeforeCreateOrder+", Ordered Quantity is: "+MethodsOrderUpdateDispatch.varOrderedQuantity+ ", Expected Total Demand value (Pending Stock Value Before Creating Order + Ordered Quantity) After Create Order is: "+(MethodsOrderUpdateDispatch.varTotalDemandBeforeCreateOrder+MethodsOrderUpdateDispatch.varOrderedQuantity)+ ", But Actual Total Demand value After Create Order is: "+MethodsOrderUpdateDispatch.varTotalDemandAfterCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderUpdateDispatch.varAvailableQuantityAfterCreateOrder==MethodsOrderUpdateDispatch.varAvailableQuantityBeforeCreateOrder){
	    	test.log(Status.PASS, "Expected Available Quantity value (Available Quantity value After Create Order = Available Quantity value Before Create Order) After Create Order is: "+MethodsOrderUpdateDispatch.varAvailableQuantityBeforeCreateOrder+" And Actual Available Quantity value After Create Order is: "+MethodsOrderUpdateDispatch.varAvailableQuantityAfterCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Available Quantity value (Available Quantity value After Create Order = Available Quantity value Before Create Order) After Create Order is: "+MethodsOrderUpdateDispatch.varAvailableQuantityBeforeCreateOrder+" But Actual Available Quantity value After Create Order is: "+MethodsOrderUpdateDispatch.varAvailableQuantityAfterCreateOrder+". InCorrect");
	    	softAssert.fail("Expected Available Quantity value (Available Quantity value After Create Order = Available Quantity value Before Create Order) After Create Order is: "+MethodsOrderUpdateDispatch.varAvailableQuantityBeforeCreateOrder+" But Actual Available Quantity value After Create Order is: "+MethodsOrderUpdateDispatch.varAvailableQuantityAfterCreateOrder+". InCorrect");
	    }
	    
	    if(MethodsOrderUpdateDispatch.varStockAfterCreateOrder==MethodsOrderUpdateDispatch.varStockBeforeCreateOrder){
	    	test.log(Status.PASS, "Expected Stock value (Stock value After Create Order = Stock value Before Create Order) After Create Order is: "+MethodsOrderUpdateDispatch.varStockBeforeCreateOrder+" And Actual Stock value After Create Order is: "+MethodsOrderUpdateDispatch.varStockAfterCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Stock value (Stock value After Create Order = Stock value Before Create Order) After Create Order is: "+MethodsOrderUpdateDispatch.varStockBeforeCreateOrder+" But Actual Stock value After Create Order is: "+MethodsOrderUpdateDispatch.varStockAfterCreateOrder+". InCorrect");
	    	softAssert.fail("Expected Stock value (Stock value After Create Order = Stock value Before Create Order) After Create Order is: "+MethodsOrderUpdateDispatch.varStockBeforeCreateOrder+" But Actual Stock value After Create Order is: "+MethodsOrderUpdateDispatch.varStockAfterCreateOrder+". InCorrect");
	    }
	    
	    if(MethodsOrderUpdateDispatch.varIntransientStockAfterCreateOrder==MethodsOrderUpdateDispatch.varIntransientStockBeforeCreateOrder){
	    	test.log(Status.PASS, "Expected Intransient Stock value (Intransient Stock value After Create Order = Intransient Stock value Before Create Order) After Create Order is: "+MethodsOrderUpdateDispatch.varIntransientStockBeforeCreateOrder+" And Actual Intransient Stock value After Create Order is: "+MethodsOrderUpdateDispatch.varIntransientStockAfterCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Intransient Stock value (Intransient Stock value After Create Order = Intransient Stock value Before Create Order) After Create Order is: "+MethodsOrderUpdateDispatch.varIntransientStockBeforeCreateOrder+" But Actual Intransient Stock value After Create Order is: "+MethodsOrderUpdateDispatch.varIntransientStockAfterCreateOrder+". InCorrect");
	    	softAssert.fail("Expected Intransient Stock value (Intransient Stock value After Create Order = Intransient Stock value Before Create Order) After Create Order is: "+MethodsOrderUpdateDispatch.varIntransientStockBeforeCreateOrder+" But Actual Intransient Stock value After Create Order is: "+MethodsOrderUpdateDispatch.varIntransientStockAfterCreateOrder+". InCorrect");
	    }
	    
	    if(MethodsOrderUpdateDispatch.varAvailableStockAfterCreateOrder==MethodsOrderUpdateDispatch.varAvailableStockBeforeCreateOrder){
	    	test.log(Status.PASS, "Expected Available Stock value (Available Stock value After Create Order = Available Stock value Before Create Order) After Create Order is: "+MethodsOrderUpdateDispatch.varAvailableStockBeforeCreateOrder+" And Actual Available Stock value After Create Order is: "+MethodsOrderUpdateDispatch.varAvailableStockAfterCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Available Stock value (Available Stock value After Create Order = Available Stock value Before Create Order) After Create Order is: "+MethodsOrderUpdateDispatch.varAvailableStockBeforeCreateOrder+" But Actual Available Stock value After Create Order is: "+MethodsOrderUpdateDispatch.varAvailableStockAfterCreateOrder+". InCorrect");
	    	softAssert.fail("Expected Available Stock value (Available Stock value After Create Order = Available Stock value Before Create Order) After Create Order is: "+MethodsOrderUpdateDispatch.varAvailableStockBeforeCreateOrder+" But Actual Available Stock value After Create Order is: "+MethodsOrderUpdateDispatch.varAvailableStockAfterCreateOrder+". InCorrect");
	    }
	    
	    if(MethodsOrderUpdateDispatch.varUsedQuantityAfterCreateOrder==MethodsOrderUpdateDispatch.varUsedQuantityBeforeCreateOrder){
	    	test.log(Status.PASS, "Expected Used Quantity value (Used Quantity value After Create Order = Used Quantity value Before Create Order) After Create Order is: "+MethodsOrderUpdateDispatch.varUsedQuantityBeforeCreateOrder+" And Actual Available Stock value After Create Order is: "+MethodsOrderUpdateDispatch.varUsedQuantityAfterCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Used Quantity value (Used Quantity value After Create Order = Used Quantity value Before Create Order) After Create Order is: "+MethodsOrderUpdateDispatch.varUsedQuantityBeforeCreateOrder+" But Actual Available Stock value After Create Order is: "+MethodsOrderUpdateDispatch.varUsedQuantityAfterCreateOrder+". InCorrect");
	    	softAssert.fail("Expected Used Quantity value (Used Quantity value After Create Order = Used Quantity value Before Create Order) After Create Order is: "+MethodsOrderUpdateDispatch.varUsedQuantityBeforeCreateOrder+" But Actual Available Stock value After Create Order is: "+MethodsOrderUpdateDispatch.varUsedQuantityAfterCreateOrder+". InCorrect");
	    }
	    

	    
	    if(MethodsOrderUpdateDispatch.varAvailableQuantityAfterCreateOrder>=MethodsOrderUpdateDispatch.varOrderedQuantity){
	    	test.log(Status.PASS, "Available Quantity value After Create Order is: "+MethodsOrderUpdateDispatch.varAvailableQuantityAfterCreateOrder + ", Ordered Quantity is: " + MethodsOrderUpdateDispatch.varOrderedQuantity + ", Available Quantity value After Create Order >= Ordered Quantity. Correct");
	    } else {
	    	test.log(Status.FAIL, "Add Inventory, Available Quantity value After Create Order is: "+MethodsOrderUpdateDispatch.varAvailableQuantityAfterCreateOrder + ", Ordered Quantity is: " + MethodsOrderUpdateDispatch.varOrderedQuantity + ", Available Quantity value After Create Order >= Ordered Quantity. Incorrect");
	    	softAssert.fail("Add Inventory, Available Quantity value After Create Order is: "+MethodsOrderUpdateDispatch.varAvailableQuantityAfterCreateOrder + ", Ordered Quantity is: " + MethodsOrderUpdateDispatch.varOrderedQuantity + ", Available Quantity value After Create Order >= Ordered Quantity. Incorrect");
	    }
	}
	
	

	@Test(dependsOnMethods = "testOrderUpdateDispatchInventoryDetailsAfterCreateOrder",groups = {"OrderUpdateDispatch"})
	public void testOrderUpdateDispatchBatchAssign(){
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderUpdateDispatch.methodOrderUpdateDispatchBatchAssign();
	    
		TestHelper.logDetails(test, response);
		TestHelper.validateStatusCode(test, response, 200);
	    TestHelper.validateStatus(test, response, "BatchAssigned");
	    TestHelper.validateId(test, response);
	}
	
	
	
	@Test(dependsOnMethods = "testOrderUpdateDispatchBatchAssign",groups = {"OrderUpdateDispatch"})
	public void testOrderUpdateDispatchInventoryDetailsAfterBatchAssign(){
		SoftAssert softAssert = new SoftAssert();
		
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderUpdateDispatch.methodOrderUpdateDispatchInventoryDetailsAfterBatchAssign();
	    
		TestHelper.logDetails(test, response);
		TestHelper.validateStatusCode(test, response, 200);
		
		if(MethodsOrderUpdateDispatch.varUsedQuantityAfterBatchAssign==(MethodsOrderUpdateDispatch.varUsedQuantityAfterCreateOrder+MethodsOrderUpdateDispatch.varOrderedQuantity)){
	    	test.log(Status.PASS, "Used Quantity value After Create Order is: "+MethodsOrderUpdateDispatch.varUsedQuantityAfterCreateOrder+", Ordered Quantity is: "+MethodsOrderUpdateDispatch.varOrderedQuantity+ ", Expected Used Quantity value (Used Quantity value After Create Order + Ordered Quantity) After Batch Assign is: "+(MethodsOrderUpdateDispatch.varUsedQuantityAfterCreateOrder+MethodsOrderUpdateDispatch.varOrderedQuantity)+ ", And Actual Used Quantity value value After Batch Assign is: "+MethodsOrderUpdateDispatch.varUsedQuantityAfterBatchAssign+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Used Quantity value After Create Order is: "+MethodsOrderUpdateDispatch.varUsedQuantityAfterCreateOrder+", Ordered Quantity is: "+MethodsOrderUpdateDispatch.varOrderedQuantity+ ", Expected Used Quantity value (Used Quantity value After Create Order + Ordered Quantity) After Batch Assign is: "+(MethodsOrderUpdateDispatch.varUsedQuantityAfterCreateOrder+MethodsOrderUpdateDispatch.varOrderedQuantity)+ ", But Actual Used Quantity value value After Batch Assign is: "+MethodsOrderUpdateDispatch.varUsedQuantityAfterBatchAssign+". Incorrect");
	    	softAssert.fail("Used Quantity value After Create Order is: "+MethodsOrderUpdateDispatch.varUsedQuantityAfterCreateOrder+", Ordered Quantity is: "+MethodsOrderUpdateDispatch.varOrderedQuantity+ ", Expected Used Quantity value (Used Quantity value After Create Order + Ordered Quantity) After BatchAssign is: "+(MethodsOrderUpdateDispatch.varUsedQuantityAfterCreateOrder+MethodsOrderUpdateDispatch.varOrderedQuantity)+ ", But Actual Used Quantity value value After Batch Assign is: "+MethodsOrderUpdateDispatch.varUsedQuantityAfterBatchAssign+". Incorrect");
	    }
		
		if(MethodsOrderUpdateDispatch.varAvailableQuantityAfterBatchAssign==(MethodsOrderUpdateDispatch.varAvailableQuantityAfterCreateOrder-MethodsOrderUpdateDispatch.varOrderedQuantity)){
	    	test.log(Status.PASS, "Available Quantity value After Create Order is: "+MethodsOrderUpdateDispatch.varAvailableQuantityAfterCreateOrder+", Ordered Quantity is: "+MethodsOrderUpdateDispatch.varOrderedQuantity+ ", Expected Available Quantity value (Available Quantity value After Create Order - Ordered Quantity) After Batch Assign is: "+(MethodsOrderUpdateDispatch.varAvailableQuantityAfterCreateOrder-MethodsOrderUpdateDispatch.varOrderedQuantity)+ ", And Actual Available Quantity value value After Batch Assign is: "+MethodsOrderUpdateDispatch.varAvailableQuantityAfterBatchAssign+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Available Quantity value After Create Order is: "+MethodsOrderUpdateDispatch.varAvailableQuantityAfterCreateOrder+", Ordered Quantity is: "+MethodsOrderUpdateDispatch.varOrderedQuantity+ ", Expected Available Quantity value (Available Quantity value After Create Order - Ordered Quantity) After Batch Assign is: "+(MethodsOrderUpdateDispatch.varAvailableQuantityAfterCreateOrder-MethodsOrderUpdateDispatch.varOrderedQuantity)+ ", But Actual Available Quantity value value After Batch Assign is: "+MethodsOrderUpdateDispatch.varAvailableQuantityAfterBatchAssign+". Incorrect");
	    	softAssert.fail("Available Quantity value After Create Order is: "+MethodsOrderUpdateDispatch.varAvailableQuantityAfterCreateOrder+", Ordered Quantity is: "+MethodsOrderUpdateDispatch.varOrderedQuantity+ ", Expected Available Quantity value (Available Quantity value After Create Order - Ordered Quantity) After BatchAssign is: "+(MethodsOrderUpdateDispatch.varAvailableQuantityAfterCreateOrder-MethodsOrderUpdateDispatch.varOrderedQuantity)+ ", But Actual Available Quantity value value After Batch Assign is: "+MethodsOrderUpdateDispatch.varAvailableQuantityAfterBatchAssign+". Incorrect");
	    }
		
	    if(MethodsOrderUpdateDispatch.varPendingStockAfterBatchAssign==MethodsOrderUpdateDispatch.varPendingStockAfterCreateOrder){
	    	test.log(Status.PASS, "Expected Pending Stock value (Pending Stock value After Batch Assign = Pending Stock value After Create Order) After Batch Assign is: "+MethodsOrderUpdateDispatch.varPendingStockAfterCreateOrder+" And Actual Pending Stock value After Batch Assign is: "+MethodsOrderUpdateDispatch.varPendingStockAfterBatchAssign+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Pending Stock value (Pending Stock value After Batch Assign = Pending Stock value After Create Order) After Batch Assign is: "+MethodsOrderUpdateDispatch.varPendingStockAfterCreateOrder+" But Actual Pending Stock value After Batch Assign is: "+MethodsOrderUpdateDispatch.varPendingStockAfterBatchAssign+". InCorrect");
	    	softAssert.fail("Expected Pending Stock value (Pending Stock value After Batch Assign = Pending Stock value After Create Order) After Batch Assign is: "+MethodsOrderUpdateDispatch.varPendingStockAfterCreateOrder+" But Actual Pending Stock value After Batch Assign is: "+MethodsOrderUpdateDispatch.varPendingStockAfterBatchAssign+". InCorrect");
	    }
	    
	    if(MethodsOrderUpdateDispatch.varTotalDemandAfterBatchAssign==MethodsOrderUpdateDispatch.varTotalDemandAfterCreateOrder){
	    	test.log(Status.PASS, "Expected Total Demand value (Total Demand value After Batch Assign = Total Demand value After Create Order) After Batch Assign is: "+MethodsOrderUpdateDispatch.varTotalDemandAfterCreateOrder+" And Actual Total Demand value After Batch Assign is: "+MethodsOrderUpdateDispatch.varTotalDemandAfterBatchAssign+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Total Demand value (Total Demand value After Batch Assign = Total Demand value After Create Order) After Batch Assign is: "+MethodsOrderUpdateDispatch.varTotalDemandAfterCreateOrder+" But Actual Total Demand value After Batch Assign is: "+MethodsOrderUpdateDispatch.varTotalDemandAfterBatchAssign+". InCorrect");
	    	softAssert.fail("Expected Total Demand value (Total Demand value After Batch Assign = Total Demand value After Create Order) After Batch Assign is: "+MethodsOrderUpdateDispatch.varTotalDemandAfterCreateOrder+" But Actual Total Demand value After Batch Assign is: "+MethodsOrderUpdateDispatch.varTotalDemandAfterBatchAssign+". InCorrect");
	    }
		
	    if(MethodsOrderUpdateDispatch.varStockAfterBatchAssign==MethodsOrderUpdateDispatch.varStockAfterCreateOrder){
	    	test.log(Status.PASS, "Expected Stock value (Stock value After Batch Assign = Stock value After Create Order) After Batch Assign is: "+MethodsOrderUpdateDispatch.varStockAfterCreateOrder+" And Actual Stock value After Batch Assign is: "+MethodsOrderUpdateDispatch.varStockAfterBatchAssign+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Stock value (Stock value After Batch Assign = Stock value After Create Order) After Batch Assign is: "+MethodsOrderUpdateDispatch.varStockAfterCreateOrder+" But Actual Stock value After Batch Assign is: "+MethodsOrderUpdateDispatch.varStockAfterBatchAssign+". InCorrect");
	    	softAssert.fail("Expected Stock value (Stock value After Batch Assign = Stock value After Create Order) After Batch Assign is: "+MethodsOrderUpdateDispatch.varStockAfterCreateOrder+" But Actual Stock value After Batch Assign is: "+MethodsOrderUpdateDispatch.varStockAfterBatchAssign+". InCorrect");
	    }
	    
	    if(MethodsOrderUpdateDispatch.varIntransientStockAfterBatchAssign==MethodsOrderUpdateDispatch.varIntransientStockAfterCreateOrder){
	    	test.log(Status.PASS, "Expected Intransient Stock value (Intransient Stock value After Batch Assign = Intransient Stock value After Create Order) After Batch Assign is: "+MethodsOrderUpdateDispatch.varIntransientStockAfterCreateOrder+" And Actual Intransient Stock value After Batch Assign is: "+MethodsOrderUpdateDispatch.varIntransientStockAfterBatchAssign+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Intransient Stock value (Intransient Stock value After Batch Assign = Intransient Stock value After Create Order) After Batch Assign is: "+MethodsOrderUpdateDispatch.varIntransientStockAfterCreateOrder+" But Actual Intransient Stock value After Batch Assign is: "+MethodsOrderUpdateDispatch.varIntransientStockAfterBatchAssign+". InCorrect");
	    	softAssert.fail("Expected Intransient Stock value (Intransient Stock value After Batch Assign = Intransient Stock value After Create Order) After Batch Assign is: "+MethodsOrderUpdateDispatch.varIntransientStockAfterCreateOrder+" But Actual Intransient Stock value After Batch Assign is: "+MethodsOrderUpdateDispatch.varIntransientStockAfterBatchAssign+". InCorrect");
	    }
	    
	    if(MethodsOrderUpdateDispatch.varAvailableStockAfterBatchAssign==MethodsOrderUpdateDispatch.varAvailableStockAfterCreateOrder){
	    	test.log(Status.PASS, "Expected Available Stock value (Available Stock value After Batch Assign = Available Stock value After Create Order) After Batch Assign is: "+MethodsOrderUpdateDispatch.varAvailableStockAfterCreateOrder+" And Actual Available Stock value After Batch Assign is: "+MethodsOrderUpdateDispatch.varAvailableStockAfterBatchAssign+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Available Stock value (Available Stock value After Batch Assign = Available Stock value After Create Order) After Batch Assign is: "+MethodsOrderUpdateDispatch.varAvailableStockAfterCreateOrder+" But Actual Available Stock value After Batch Assign is: "+MethodsOrderUpdateDispatch.varAvailableStockAfterBatchAssign+". InCorrect");
	    	softAssert.fail("Expected Available Stock value (Available Stock value After Batch Assign = Available Stock value After Create Order) After Batch Assign is: "+MethodsOrderUpdateDispatch.varAvailableStockAfterCreateOrder+" But Actual Available Stock value After Batch Assign is: "+MethodsOrderUpdateDispatch.varAvailableStockAfterBatchAssign+". InCorrect");
	    }
	    
	    softAssert.assertAll();
	}
	
	
	
	@Test(dependsOnMethods = "testOrderUpdateDispatchInventoryDetailsAfterBatchAssign",groups = {"OrderUpdateDispatch"})
	public void testOrderUpdateDispatchMarkPacked(){
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderUpdateDispatch.methodOrderUpdateDispatchMarkPacked();
	    
		TestHelper.logDetails(test, response);
		TestHelper.validateStatusCode(test, response, 200);
	    TestHelper.validateStatus(test, response, "Packed");
	    TestHelper.validateId(test, response);
	}
	
	
	
	@Test(dependsOnMethods = "testOrderUpdateDispatchMarkPacked",groups = {"OrderUpdateDispatch"})
	public void testOrderUpdateDispatchInventoryDetailsAfterMarkPacked(){
		SoftAssert softAssert = new SoftAssert();
		
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderUpdateDispatch.methodOrderUpdateDispatchInventoryDetailsAfterMarkPacked();
	    
		TestHelper.logDetails(test, response);
		TestHelper.validateStatusCode(test, response, 200);
		
		if(MethodsOrderUpdateDispatch.varUsedQuantityAfterMarkPacked==MethodsOrderUpdateDispatch.varUsedQuantityAfterBatchAssign){
	    	test.log(Status.PASS, "Expected Used Quantity value (Used Quantity value After Mark Packed = Used Quantity value After Batch Assign) After Mark Packed is: "+MethodsOrderUpdateDispatch.varUsedQuantityAfterBatchAssign+" And Actual Used Quantity value After Mark Packed is: "+MethodsOrderUpdateDispatch.varUsedQuantityAfterBatchAssign+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Used Quantity value (Used Quantity value After Mark Packed = Used Quantity value After Batch Assign) After Mark Packed is: "+MethodsOrderUpdateDispatch.varUsedQuantityAfterBatchAssign+" But Actual Used Quantity value After Mark Packed is: "+MethodsOrderUpdateDispatch.varUsedQuantityAfterBatchAssign+". InCorrect");
	    	softAssert.fail("Expected Used Quantity value (Used Quantity value After Mark Packed = Used Quantity value After Batch Assign) After Mark Packed is: "+MethodsOrderUpdateDispatch.varUsedQuantityAfterBatchAssign+" But Actual Used Quantity value After Mark Packed is: "+MethodsOrderUpdateDispatch.varUsedQuantityAfterBatchAssign+". InCorrect");
	    }
		
		if(MethodsOrderUpdateDispatch.varAvailableQuantityAfterMarkPacked==MethodsOrderUpdateDispatch.varAvailableQuantityAfterBatchAssign){
	    	test.log(Status.PASS, "Expected Available Quantity value (Available Quantity value After Mark Packed = Available Quantity value After Batch Assign) After Mark Packed is: "+MethodsOrderUpdateDispatch.varAvailableQuantityAfterBatchAssign+" And Actual Available Quantity value After Mark Packed is: "+MethodsOrderUpdateDispatch.varAvailableQuantityAfterBatchAssign+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Available Quantity value (Available Quantity value After Mark Packed = Available Quantity value After Batch Assign) After Mark Packed is: "+MethodsOrderUpdateDispatch.varAvailableQuantityAfterBatchAssign+" But Actual Available Quantity value After Mark Packed is: "+MethodsOrderUpdateDispatch.varAvailableQuantityAfterBatchAssign+". InCorrect");
	    	softAssert.fail("Expected Available Quantity value (Available Quantity value After Mark Packed = Available Quantity value After Batch Assign) After Mark Packed is: "+MethodsOrderUpdateDispatch.varAvailableQuantityAfterBatchAssign+" But Actual Available Quantity value After Mark Packed is: "+MethodsOrderUpdateDispatch.varAvailableQuantityAfterBatchAssign+". InCorrect");
	    }
		
	    if(MethodsOrderUpdateDispatch.varPendingStockAfterMarkPacked==MethodsOrderUpdateDispatch.varPendingStockAfterBatchAssign){
	    	test.log(Status.PASS, "Expected Pending Stock value (Pending Stock value After Mark Packed = Pending Stock value After Batch Assign) After Mark Packed is: "+MethodsOrderUpdateDispatch.varPendingStockAfterBatchAssign+" And Actual Pending Stock value After Mark Packed is: "+MethodsOrderUpdateDispatch.varPendingStockAfterMarkPacked+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Pending Stock value (Pending Stock value After Mark Packed = Pending Stock value After Batch Assign) After Mark Packed is: "+MethodsOrderUpdateDispatch.varPendingStockAfterBatchAssign+" But Actual Pending Stock value After Mark Packed is: "+MethodsOrderUpdateDispatch.varPendingStockAfterMarkPacked+". InCorrect");
	    	softAssert.fail("Expected Pending Stock value (Pending Stock value After Mark Packed = Pending Stock value After Batch Assign) After Mark Packed is: "+MethodsOrderUpdateDispatch.varPendingStockAfterBatchAssign+" But Actual Pending Stock value After Mark Packed is: "+MethodsOrderUpdateDispatch.varPendingStockAfterMarkPacked+". InCorrect");
	    }
	    
	    if(MethodsOrderUpdateDispatch.varTotalDemandAfterMarkPacked==MethodsOrderUpdateDispatch.varTotalDemandAfterBatchAssign){
	    	test.log(Status.PASS, "Expected Total Demand value (Total Demand value After Mark Packed = Total Demand value After Batch Assign) After Mark Packed is: "+MethodsOrderUpdateDispatch.varTotalDemandAfterBatchAssign+" And Actual Total Demand value After Mark Packed is: "+MethodsOrderUpdateDispatch.varTotalDemandAfterMarkPacked+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Total Demand value (Total Demand value After Mark Packed = Total Demand value After Batch Assign) After Mark Packed is: "+MethodsOrderUpdateDispatch.varTotalDemandAfterBatchAssign+" But Actual Total Demand value After Mark Packed is: "+MethodsOrderUpdateDispatch.varTotalDemandAfterMarkPacked+". InCorrect");
	    	softAssert.fail("Expected Total Demand value (Total Demand value After Mark Packed = Total Demand value After Batch Assign) After Mark Packed is: "+MethodsOrderUpdateDispatch.varTotalDemandAfterBatchAssign+" But Actual Total Demand value After Mark Packed is: "+MethodsOrderUpdateDispatch.varTotalDemandAfterMarkPacked+". InCorrect");
	    }
		
	    if(MethodsOrderUpdateDispatch.varStockAfterMarkPacked==MethodsOrderUpdateDispatch.varStockAfterBatchAssign){
	    	test.log(Status.PASS, "Expected Stock value (Stock value After Mark Packed = Stock value After Batch Assign) After Mark Packed is: "+MethodsOrderUpdateDispatch.varStockAfterBatchAssign+" And Actual Stock value After Mark Packed is: "+MethodsOrderUpdateDispatch.varStockAfterMarkPacked+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Stock value (Stock value After Mark Packed = Stock value After Batch Assign) After Mark Packed is: "+MethodsOrderUpdateDispatch.varStockAfterBatchAssign+" But Actual Stock value After Mark Packed is: "+MethodsOrderUpdateDispatch.varStockAfterMarkPacked+". InCorrect");
	    	softAssert.fail("Expected Stock value (Stock value After Mark Packed = Stock value After Batch Assign) After Mark Packed is: "+MethodsOrderUpdateDispatch.varStockAfterBatchAssign+" But Actual Stock value After Mark Packed is: "+MethodsOrderUpdateDispatch.varStockAfterMarkPacked+". InCorrect");
	    }
	    
	    if(MethodsOrderUpdateDispatch.varIntransientStockAfterMarkPacked==MethodsOrderUpdateDispatch.varIntransientStockAfterBatchAssign){
	    	test.log(Status.PASS, "Expected Intransient Stock value (Intransient Stock value After Mark Packed = Intransient Stock value After Batch Assign) After Mark Packed is: "+MethodsOrderUpdateDispatch.varIntransientStockAfterBatchAssign+" And Actual Intransient Stock value After Mark Packed is: "+MethodsOrderUpdateDispatch.varIntransientStockAfterMarkPacked+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Intransient Stock value (Intransient Stock value After Mark Packed = Intransient Stock value After Batch Assign) After Mark Packed is: "+MethodsOrderUpdateDispatch.varIntransientStockAfterBatchAssign+" But Actual Intransient Stock value After Mark Packed is: "+MethodsOrderUpdateDispatch.varIntransientStockAfterMarkPacked+". InCorrect");
	    	softAssert.fail("Expected Intransient Stock value (Intransient Stock value After Mark Packed = Intransient Stock value After Batch Assign) After Mark Packed is: "+MethodsOrderUpdateDispatch.varIntransientStockAfterBatchAssign+" But Actual Intransient Stock value After Mark Packed is: "+MethodsOrderUpdateDispatch.varIntransientStockAfterMarkPacked+". InCorrect");
	    }
	    
	    if(MethodsOrderUpdateDispatch.varAvailableStockAfterMarkPacked==MethodsOrderUpdateDispatch.varAvailableStockAfterBatchAssign){
	    	test.log(Status.PASS, "Expected Available Stock value (Available Stock value After Mark Packed = Available Stock value After Batch Assign) After Mark Packed is: "+MethodsOrderUpdateDispatch.varAvailableStockAfterBatchAssign+" And Actual Available Stock value After Mark Packed is: "+MethodsOrderUpdateDispatch.varAvailableStockAfterMarkPacked+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Available Stock value (Available Stock value After Mark Packed = Available Stock value After Batch Assign) After Mark Packed is: "+MethodsOrderUpdateDispatch.varAvailableStockAfterBatchAssign+" But Actual Available Stock value After Mark Packed is: "+MethodsOrderUpdateDispatch.varAvailableStockAfterMarkPacked+". InCorrect");
	    	softAssert.fail("Expected Available Stock value (Available Stock value After Mark Packed = Available Stock value After Batch Assign) After Mark Packed is: "+MethodsOrderUpdateDispatch.varAvailableStockAfterBatchAssign+" But Actual Available Stock value After Mark Packed is: "+MethodsOrderUpdateDispatch.varAvailableStockAfterMarkPacked+". InCorrect");
	    }
	    
	    softAssert.assertAll();
	}

	
	
	@Test(dependsOnMethods = "testOrderUpdateDispatchInventoryDetailsAfterMarkPacked",groups = {"OrderUpdateDispatch"})
	public void testOrderUpdateDispatchCreateShipment(){
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderUpdateDispatch.methodOrderUpdateDispatchCreateShipment();
	    
		TestHelper.logDetails(test, response);
		TestHelper.validateStatusCode(test, response, 200);
	    TestHelper.validateStatus(test, response, "INITIATED");
	    TestHelper.validateId(test, response);
	}

	
	
	@Test(dependsOnMethods = "testOrderUpdateDispatchCreateShipment",groups = {"OrderUpdateDispatch"})
	public void testOrderUpdateDispatchInventoryDetailsAfterCreateShipment(){
		SoftAssert softAssert = new SoftAssert();
		
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderUpdateDispatch.methodOrderUpdateDispatchInventoryDetailsAfterCreateShipment();
	    
		TestHelper.logDetails(test, response);
		TestHelper.validateStatusCode(test, response, 200);
		
		if(MethodsOrderUpdateDispatch.varUsedQuantityAfterCreateShipment==MethodsOrderUpdateDispatch.varUsedQuantityAfterMarkPacked){
	    	test.log(Status.PASS, "Expected Used Quantity value (Used Quantity value After Create Shipment = Used Quantity value After Mark Packed) After Create Shipment is: "+MethodsOrderUpdateDispatch.varUsedQuantityAfterMarkPacked+" And Actual Used Quantity value After Mark Packed is: "+MethodsOrderUpdateDispatch.varUsedQuantityAfterCreateShipment+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Used Quantity value (Used Quantity value After Create Shipment = Used Quantity value After Mark Packed) After Create Shipment is: "+MethodsOrderUpdateDispatch.varUsedQuantityAfterMarkPacked+" But Actual Used Quantity value After Mark Packed is: "+MethodsOrderUpdateDispatch.varUsedQuantityAfterCreateShipment+". InCorrect");
	    	softAssert.fail("Expected Used Quantity value (Used Quantity value After Create Shipment = Used Quantity value After Mark Packed) After Create Shipment is: "+MethodsOrderUpdateDispatch.varUsedQuantityAfterMarkPacked+" But Actual Used Quantity value After Mark Packed is: "+MethodsOrderUpdateDispatch.varUsedQuantityAfterCreateShipment+". InCorrect");
	    }
		
		if(MethodsOrderUpdateDispatch.varAvailableQuantityAfterCreateShipment == MethodsOrderUpdateDispatch.varAvailableQuantityAfterMarkPacked){
		    test.log(Status.PASS, "Expected Available Quantity value (Available Quantity value After Create Shipment = Available Quantity value After Mark Packed) After Create Shipment is: "+MethodsOrderUpdateDispatch.varAvailableQuantityAfterMarkPacked+" And Actual Available Quantity value After Create Shipment is: "+MethodsOrderUpdateDispatch.varAvailableQuantityAfterMarkPacked+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Available Quantity value (Available Quantity value After Create Shipment = Available Quantity value After Mark Packed) After Create Shipment is: "+MethodsOrderUpdateDispatch.varAvailableQuantityAfterMarkPacked+" But Actual Available Quantity value After Create Shipment is: "+MethodsOrderUpdateDispatch.varAvailableQuantityAfterMarkPacked+". InCorrect");
		    softAssert.fail("Expected Available Quantity value (Available Quantity value After Create Shipment = Available Quantity value After Mark Packed) After Create Shipment is: "+MethodsOrderUpdateDispatch.varAvailableQuantityAfterMarkPacked+" But Actual Available Quantity value After Create Shipment is: "+MethodsOrderUpdateDispatch.varAvailableQuantityAfterMarkPacked+". InCorrect");
		}

		if(MethodsOrderUpdateDispatch.varPendingStockAfterCreateShipment == MethodsOrderUpdateDispatch.varPendingStockAfterMarkPacked){
		    test.log(Status.PASS, "Expected Pending Stock value (Pending Stock value After Create Shipment = Pending Stock value After Mark Packed) After Create Shipment is: "+MethodsOrderUpdateDispatch.varPendingStockAfterMarkPacked+" And Actual Pending Stock value After Create Shipment is: "+MethodsOrderUpdateDispatch.varPendingStockAfterCreateShipment+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Pending Stock value (Pending Stock value After Create Shipment = Pending Stock value After Mark Packed) After Create Shipment is: "+MethodsOrderUpdateDispatch.varPendingStockAfterMarkPacked+" But Actual Pending Stock value After Create Shipment is: "+MethodsOrderUpdateDispatch.varPendingStockAfterCreateShipment+". InCorrect");
		    softAssert.fail("Expected Pending Stock value (Pending Stock value After Create Shipment = Pending Stock value After Mark Packed) After Create Shipment is: "+MethodsOrderUpdateDispatch.varPendingStockAfterMarkPacked+" But Actual Pending Stock value After Create Shipment is: "+MethodsOrderUpdateDispatch.varPendingStockAfterCreateShipment+". InCorrect");
		}

		if(MethodsOrderUpdateDispatch.varTotalDemandAfterCreateShipment == MethodsOrderUpdateDispatch.varTotalDemandAfterMarkPacked){
		    test.log(Status.PASS, "Expected Total Demand value (Total Demand value After Create Shipment = Total Demand value After Mark Packed) After Create Shipment is: "+MethodsOrderUpdateDispatch.varTotalDemandAfterMarkPacked+" And Actual Total Demand value After Create Shipment is: "+MethodsOrderUpdateDispatch.varTotalDemandAfterCreateShipment+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Total Demand value (Total Demand value After Create Shipment = Total Demand value After Mark Packed) After Create Shipment is: "+MethodsOrderUpdateDispatch.varTotalDemandAfterMarkPacked+" But Actual Total Demand value After Create Shipment is: "+MethodsOrderUpdateDispatch.varTotalDemandAfterCreateShipment+". InCorrect");
		    softAssert.fail("Expected Total Demand value (Total Demand value After Create Shipment = Total Demand value After Mark Packed) After Create Shipment is: "+MethodsOrderUpdateDispatch.varTotalDemandAfterMarkPacked+" But Actual Total Demand value After Create Shipment is: "+MethodsOrderUpdateDispatch.varTotalDemandAfterCreateShipment+". InCorrect");
		}

		if(MethodsOrderUpdateDispatch.varStockAfterCreateShipment == MethodsOrderUpdateDispatch.varStockAfterMarkPacked){
		    test.log(Status.PASS, "Expected Stock value (Stock value After Create Shipment = Stock value After Mark Packed) After Create Shipment is: "+MethodsOrderUpdateDispatch.varStockAfterMarkPacked+" And Actual Stock value After Create Shipment is: "+MethodsOrderUpdateDispatch.varStockAfterCreateShipment+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Stock value (Stock value After Create Shipment = Stock value After Mark Packed) After Create Shipment is: "+MethodsOrderUpdateDispatch.varStockAfterMarkPacked+" But Actual Stock value After Create Shipment is: "+MethodsOrderUpdateDispatch.varStockAfterCreateShipment+". InCorrect");
		    softAssert.fail("Expected Stock value (Stock value After Create Shipment = Stock value After Mark Packed) After Create Shipment is: "+MethodsOrderUpdateDispatch.varStockAfterMarkPacked+" But Actual Stock value After Create Shipment is: "+MethodsOrderUpdateDispatch.varStockAfterCreateShipment+". InCorrect");
		}

		if(MethodsOrderUpdateDispatch.varIntransientStockAfterCreateShipment == MethodsOrderUpdateDispatch.varIntransientStockAfterMarkPacked){
		    test.log(Status.PASS, "Expected Intransient Stock value (Intransient Stock value After Create Shipment = Intransient Stock value After Mark Packed) After Create Shipment is: "+MethodsOrderUpdateDispatch.varIntransientStockAfterMarkPacked+" And Actual Intransient Stock value After Create Shipment is: "+MethodsOrderUpdateDispatch.varIntransientStockAfterCreateShipment+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Intransient Stock value (Intransient Stock value After Create Shipment = Intransient Stock value After Mark Packed) After Create Shipment is: "+MethodsOrderUpdateDispatch.varIntransientStockAfterMarkPacked+" But Actual Intransient Stock value After Create Shipment is: "+MethodsOrderUpdateDispatch.varIntransientStockAfterCreateShipment+". InCorrect");
		    softAssert.fail("Expected Intransient Stock value (Intransient Stock value After Create Shipment = Intransient Stock value After Mark Packed) After Create Shipment is: "+MethodsOrderUpdateDispatch.varIntransientStockAfterMarkPacked+" But Actual Intransient Stock value After Create Shipment is: "+MethodsOrderUpdateDispatch.varIntransientStockAfterCreateShipment+". InCorrect");
		}

		if(MethodsOrderUpdateDispatch.varAvailableStockAfterCreateShipment == MethodsOrderUpdateDispatch.varAvailableStockAfterMarkPacked){
		    test.log(Status.PASS, "Expected Available Stock value (Available Stock value After Create Shipment = Available Stock value After Mark Packed) After Create Shipment is: "+MethodsOrderUpdateDispatch.varAvailableStockAfterMarkPacked+" And Actual Available Stock value After Create Shipment is: "+MethodsOrderUpdateDispatch.varAvailableStockAfterCreateShipment+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Available Stock value (Available Stock value After Create Shipment = Available Stock value After Mark Packed) After Create Shipment is: "+MethodsOrderUpdateDispatch.varAvailableStockAfterMarkPacked+" But Actual Available Stock value After Create Shipment is: "+MethodsOrderUpdateDispatch.varAvailableStockAfterCreateShipment+". InCorrect");
		    softAssert.fail("Expected Available Stock value (Available Stock value After Create Shipment = Available Stock value After Mark Packed) After Create Shipment is: "+MethodsOrderUpdateDispatch.varAvailableStockAfterMarkPacked+" But Actual Available Stock value After Create Shipment is: "+MethodsOrderUpdateDispatch.varAvailableStockAfterCreateShipment+". InCorrect");
		}
	    
	    softAssert.assertAll();
	}

	
	
	@Test(dependsOnMethods = "testOrderUpdateDispatchInventoryDetailsAfterCreateShipment",groups = {"OrderUpdateDispatch"})
	public void testOrderUpdateDispatchDispatch(){
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderUpdateDispatch.methodOrderUpdateDispatchDispatch();
	    
		TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    TestHelper.validateStatus(test, response, "Dispatched");
	    TestHelper.validateId(test, response);
	}
	
	
	
	@Test(dependsOnMethods = "testOrderUpdateDispatchDispatch",groups = {"OrderUpdateDispatch"})
	public void testOrderUpdateDispatchInventoryDetailsAfterDispatch(){
		SoftAssert softAssert = new SoftAssert();
		
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderUpdateDispatch.methodOrderUpdateDispatchInventoryDetailsAfterDispatch();
	    
		TestHelper.logDetails(test, response);
		TestHelper.validateStatusCode(test, response, 200);
		
		if(MethodsOrderUpdateDispatch.varPendingStockAfterDispatch == (MethodsOrderUpdateDispatch.varPendingStockAfterCreateShipment - MethodsOrderUpdateDispatch.varOrderedQuantity)){
		    test.log(Status.PASS, "Pending Stock value After Create Shipment is: "+MethodsOrderUpdateDispatch.varPendingStockAfterCreateShipment+", Ordered Quantity is: "+MethodsOrderUpdateDispatch.varOrderedQuantity+ ", Expected Pending Stock value (Pending Stock value After Create Shipment - Ordered Quantity) After Dispatch is: "+(MethodsOrderUpdateDispatch.varPendingStockAfterCreateShipment - MethodsOrderUpdateDispatch.varOrderedQuantity)+ ", And Actual Pending Stock value After Dispatch is: "+MethodsOrderUpdateDispatch.varPendingStockAfterDispatch+". Correct");
		} else {
		    test.log(Status.FAIL, "Pending Stock value After Create Shipment is: "+MethodsOrderUpdateDispatch.varPendingStockAfterCreateShipment+", Ordered Quantity is: "+MethodsOrderUpdateDispatch.varOrderedQuantity+ ", Expected Pending Stock value (Pending Stock value After Create Shipment - Ordered Quantity) After Dispatch is: "+(MethodsOrderUpdateDispatch.varPendingStockAfterCreateShipment - MethodsOrderUpdateDispatch.varOrderedQuantity)+ ", But Actual Pending Stock value After Dispatch is: "+MethodsOrderUpdateDispatch.varPendingStockAfterDispatch+". Incorrect");
		    softAssert.fail("Pending Stock value After Create Shipment is: "+MethodsOrderUpdateDispatch.varPendingStockAfterCreateShipment+", Ordered Quantity is: "+MethodsOrderUpdateDispatch.varOrderedQuantity+ ", Expected Pending Stock value (Pending Stock value After Create Shipment - Ordered Quantity) After Dispatch is: "+(MethodsOrderUpdateDispatch.varPendingStockAfterCreateShipment - MethodsOrderUpdateDispatch.varOrderedQuantity)+ ", But Actual Pending Stock value After Dispatch is: "+MethodsOrderUpdateDispatch.varPendingStockAfterDispatch+". Incorrect");
		}
		
		if(MethodsOrderUpdateDispatch.varIntransientStockAfterDispatch == (MethodsOrderUpdateDispatch.varIntransientStockAfterCreateShipment + MethodsOrderUpdateDispatch.varOrderedQuantity)){
		    test.log(Status.PASS, "Intransient Stock value After Create Shipment is: "+MethodsOrderUpdateDispatch.varIntransientStockAfterCreateShipment+", Ordered Quantity is: "+MethodsOrderUpdateDispatch.varOrderedQuantity+ ", Expected Intransient Stock value (Intransient Stock value After Create Shipment + Ordered Quantity) After Dispatch is: "+(MethodsOrderUpdateDispatch.varIntransientStockAfterCreateShipment + MethodsOrderUpdateDispatch.varOrderedQuantity)+ ", And Actual Intransient Stock value After Dispatch is: "+MethodsOrderUpdateDispatch.varIntransientStockAfterDispatch+". Correct");
		} else {
		    test.log(Status.FAIL, "Intransient Stock value After Create Shipment is: "+MethodsOrderUpdateDispatch.varIntransientStockAfterCreateShipment+", Ordered Quantity is: "+MethodsOrderUpdateDispatch.varOrderedQuantity+ ", Expected Intransient Stock value (Intransient Stock value After Create Shipment + Ordered Quantity) After Dispatch is: "+(MethodsOrderUpdateDispatch.varIntransientStockAfterCreateShipment + MethodsOrderUpdateDispatch.varOrderedQuantity)+ ", But Actual Intransient Stock value After Dispatch is: "+MethodsOrderUpdateDispatch.varIntransientStockAfterDispatch+". Incorrect");
		    softAssert.fail("Intransient Stock value After Create Shipment is: "+MethodsOrderUpdateDispatch.varIntransientStockAfterCreateShipment+", Ordered Quantity is: "+MethodsOrderUpdateDispatch.varOrderedQuantity+ ", Expected Intransient Stock value (Intransient Stock value After Create Shipment + Ordered Quantity) After Dispatch is: "+(MethodsOrderUpdateDispatch.varIntransientStockAfterCreateShipment + MethodsOrderUpdateDispatch.varOrderedQuantity)+ ", But Actual Intransient Stock value After Dispatch is: "+MethodsOrderUpdateDispatch.varIntransientStockAfterDispatch+". Incorrect");
		}
		
		if(MethodsOrderUpdateDispatch.varAvailableStockAfterDispatch == (MethodsOrderUpdateDispatch.varAvailableStockAfterCreateShipment - MethodsOrderUpdateDispatch.varOrderedQuantity)){
		    test.log(Status.PASS, "Available Stock value After Create Shipment is: "+MethodsOrderUpdateDispatch.varAvailableStockAfterCreateShipment+", Ordered Quantity is: "+MethodsOrderUpdateDispatch.varOrderedQuantity+ ", Expected Available Stock value (Available Stock value After Create Shipment - Ordered Quantity) After Dispatch is: "+(MethodsOrderUpdateDispatch.varAvailableStockAfterCreateShipment - MethodsOrderUpdateDispatch.varOrderedQuantity)+ ", And Actual Available Stock value After Dispatch is: "+MethodsOrderUpdateDispatch.varAvailableStockAfterDispatch+". Correct");
		} else {
		    test.log(Status.FAIL, "Available Stock value After Create Shipment is: "+MethodsOrderUpdateDispatch.varAvailableStockAfterCreateShipment+", Ordered Quantity is: "+MethodsOrderUpdateDispatch.varOrderedQuantity+ ", Expected Available Stock value (Available Stock value After Create Shipment - Ordered Quantity) After Dispatch is: "+(MethodsOrderUpdateDispatch.varAvailableStockAfterCreateShipment - MethodsOrderUpdateDispatch.varOrderedQuantity)+ ", But Actual Available Stock value After Dispatch is: "+MethodsOrderUpdateDispatch.varAvailableStockAfterDispatch+". Incorrect");
		    softAssert.fail("Available Stock value After Create Shipment is: "+MethodsOrderUpdateDispatch.varAvailableStockAfterCreateShipment+", Ordered Quantity is: "+MethodsOrderUpdateDispatch.varOrderedQuantity+ ", Expected Available Stock value (Available Stock value After Create Shipment - Ordered Quantity) After Dispatch is: "+(MethodsOrderUpdateDispatch.varAvailableStockAfterCreateShipment - MethodsOrderUpdateDispatch.varOrderedQuantity)+ ", But Actual Available Stock value After Dispatch is: "+MethodsOrderUpdateDispatch.varAvailableStockAfterDispatch+". Incorrect");
		}
		
		if(MethodsOrderUpdateDispatch.varUsedQuantityAfterDispatch == MethodsOrderUpdateDispatch.varUsedQuantityAfterCreateShipment){
		    test.log(Status.PASS, "Expected Used Quantity value (Used Quantity value After Dispatch = Used Quantity value After Create Shipment) After Dispatch is: "+MethodsOrderUpdateDispatch.varUsedQuantityAfterCreateShipment+" And Actual Used Quantity value After Create Shipment is: "+MethodsOrderUpdateDispatch.varUsedQuantityAfterDispatch+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Used Quantity value (Used Quantity value After Dispatch = Used Quantity value After Create Shipment) After Dispatch is: "+MethodsOrderUpdateDispatch.varUsedQuantityAfterCreateShipment+" But Actual Used Quantity value After Dispatch is: "+MethodsOrderUpdateDispatch.varUsedQuantityAfterDispatch+". InCorrect");
		    softAssert.fail("Expected Used Quantity value (Used Quantity value After Dispatch = Used Quantity value After Create Shipment) After Dispatch is: "+MethodsOrderUpdateDispatch.varUsedQuantityAfterCreateShipment+" But Actual Used Quantity value After Dispatch is: "+MethodsOrderUpdateDispatch.varUsedQuantityAfterDispatch+". InCorrect");
		}

		if(MethodsOrderUpdateDispatch.varAvailableQuantityAfterDispatch == MethodsOrderUpdateDispatch.varAvailableQuantityAfterCreateShipment){
		    test.log(Status.PASS, "Expected Available Quantity value (Available Quantity value After Dispatch = Available Quantity value After Create Shipment) After Dispatch is: "+MethodsOrderUpdateDispatch.varAvailableQuantityAfterCreateShipment+" And Actual Available Quantity value After Dispatch is: "+MethodsOrderUpdateDispatch.varAvailableQuantityAfterDispatch+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Available Quantity value (Available Quantity value After Dispatch = Available Quantity value After Create Shipment) After Dispatch is: "+MethodsOrderUpdateDispatch.varAvailableQuantityAfterCreateShipment+" But Actual Available Quantity value After Dispatch is: "+MethodsOrderUpdateDispatch.varAvailableQuantityAfterDispatch+". InCorrect");
		    softAssert.fail("Expected Available Quantity value (Available Quantity value After Dispatch = Available Quantity value After Create Shipment) After Dispatch is: "+MethodsOrderUpdateDispatch.varAvailableQuantityAfterCreateShipment+" But Actual Available Quantity value After Dispatch is: "+MethodsOrderUpdateDispatch.varAvailableQuantityAfterDispatch+". InCorrect");
		}

		if(MethodsOrderUpdateDispatch.varTotalDemandAfterDispatch == MethodsOrderUpdateDispatch.varTotalDemandAfterCreateShipment){
		    test.log(Status.PASS, "Expected Total Demand value (Total Demand value After Dispatch = Total Demand value After Create Shipment) After Dispatch is: "+MethodsOrderUpdateDispatch.varTotalDemandAfterCreateShipment+" And Actual Total Demand value After Dispatch is: "+MethodsOrderUpdateDispatch.varTotalDemandAfterDispatch+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Total Demand value (Total Demand value After Dispatch = Total Demand value After Create Shipment) After Dispatch is: "+MethodsOrderUpdateDispatch.varTotalDemandAfterCreateShipment+" But Actual Total Demand value After Dispatch is: "+MethodsOrderUpdateDispatch.varTotalDemandAfterDispatch+". InCorrect");
		    softAssert.fail("Expected Total Demand value (Total Demand value After Dispatch = Total Demand value After Create Shipment) After Dispatch is: "+MethodsOrderUpdateDispatch.varTotalDemandAfterCreateShipment+" But Actual Total Demand value After Dispatch is: "+MethodsOrderUpdateDispatch.varTotalDemandAfterDispatch+". InCorrect");
		}

		if(MethodsOrderUpdateDispatch.varStockAfterDispatch == MethodsOrderUpdateDispatch.varStockAfterCreateShipment){
		    test.log(Status.PASS, "Expected Stock value (Stock value After Dispatch = Stock value After Create Shipment) After Dispatch is: "+MethodsOrderUpdateDispatch.varStockAfterCreateShipment+" And Actual Stock value After Dispatch is: "+MethodsOrderUpdateDispatch.varStockAfterDispatch+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Stock value (Stock value After Dispatch = Stock value After Create Shipment) After Dispatch is: "+MethodsOrderUpdateDispatch.varStockAfterCreateShipment+" But Actual Stock value After Dispatch is: "+MethodsOrderUpdateDispatch.varStockAfterDispatch+". InCorrect");
		    softAssert.fail("Expected Stock value (Stock value After Dispatch = Stock value After Create Shipment) After Dispatch is: "+MethodsOrderUpdateDispatch.varStockAfterCreateShipment+" But Actual Stock value After Dispatch is: "+MethodsOrderUpdateDispatch.varStockAfterDispatch+". InCorrect");
		}
	    
	    softAssert.assertAll();
	}
	
	
	
	@Test(dependsOnMethods = "testOrderUpdateDispatchInventoryDetailsAfterDispatch", groups = {"OrderUpdateDispatch"})
	public void testOrderUpdateDispatchUpdateOrder(){
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderUpdateDispatch.methodOrderUpdateDispatchUpdateOrder();
        
		TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    TestHelper.validateStatus(test, response, "Created");
	    TestHelper.validateId(test, response);
	}

	
	
	@Test(dependsOnMethods = "testOrderUpdateDispatchUpdateOrder",groups = {"OrderUpdateDispatch"})
	public void testOrderUpdateDispatchInventoryDetailsAfterUpdateOrder(){
		SoftAssert softAssert = new SoftAssert();
		
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderUpdateDispatch.methodOrderUpdateDispatchInventoryDetailsAfterUpdateOrder();
	    
		TestHelper.logDetails(test, response);
		TestHelper.validateStatusCode(test, response, 200);
		
		if(MethodsOrderUpdateDispatch.varPendingStockAfterUpdateOrder==(MethodsOrderUpdateDispatch.varPendingStockBeforeCreateOrder+MethodsOrderUpdateDispatch.varOrderedQuantityNew)){
		    test.log(Status.PASS, "Pending Stock value Before Create Order is: "+MethodsOrderUpdateDispatch.varPendingStockBeforeCreateOrder+", New Ordered Quantity is: "+MethodsOrderUpdateDispatch.varOrderedQuantityNew+ ", Expected Pending Stock value (Pending Stock Value Before Updating Order + New Ordered Quantity) After Update Order is: "+(MethodsOrderUpdateDispatch.varPendingStockBeforeCreateOrder+MethodsOrderUpdateDispatch.varOrderedQuantityNew)+ ", And Actual Pending Stock value After Update Order is: "+MethodsOrderUpdateDispatch.varPendingStockAfterUpdateOrder+". Correct");
		} else {
		    test.log(Status.FAIL, "Pending Stock value Before Create Order is: "+MethodsOrderUpdateDispatch.varPendingStockBeforeCreateOrder+", New Ordered Quantity is: "+MethodsOrderUpdateDispatch.varOrderedQuantityNew+ ", Expected Pending Stock value (Pending Stock Value Before Updating Order + New Ordered Quantity) After Update Order is: "+(MethodsOrderUpdateDispatch.varPendingStockBeforeCreateOrder+MethodsOrderUpdateDispatch.varOrderedQuantityNew)+ ", But Actual Pending Stock value After Update Order is: "+MethodsOrderUpdateDispatch.varPendingStockAfterUpdateOrder+". Incorrect");
		    softAssert.fail("Pending Stock value Before Create Order is: "+MethodsOrderUpdateDispatch.varPendingStockBeforeCreateOrder+", New Ordered Quantity is: "+MethodsOrderUpdateDispatch.varOrderedQuantityNew+ ", Expected Pending Stock value (Pending Stock Value Before Updating Order + New Ordered Quantity) After Update Order is: "+(MethodsOrderUpdateDispatch.varPendingStockBeforeCreateOrder+MethodsOrderUpdateDispatch.varOrderedQuantityNew)+ ", But Actual Pending Stock value After Update Order is: "+MethodsOrderUpdateDispatch.varPendingStockAfterUpdateOrder+". Incorrect");
		}

		if(MethodsOrderUpdateDispatch.varTotalDemandAfterUpdateOrder==(MethodsOrderUpdateDispatch.varTotalDemandBeforeCreateOrder+MethodsOrderUpdateDispatch.varOrderedQuantityNew)){
		    test.log(Status.PASS, "Total Demand value Before Create Order is: "+MethodsOrderUpdateDispatch.varTotalDemandBeforeCreateOrder+", New Ordered Quantity is: "+MethodsOrderUpdateDispatch.varOrderedQuantityNew+ ", Expected Total Demand value (Total Demand Value Before Updating Order + New Ordered Quantity) After Update Order is: "+(MethodsOrderUpdateDispatch.varTotalDemandBeforeCreateOrder+MethodsOrderUpdateDispatch.varOrderedQuantityNew)+ ", And Actual Total Demand value After Update Order is: "+MethodsOrderUpdateDispatch.varTotalDemandAfterUpdateOrder+". Correct");
		} else {
		    test.log(Status.FAIL, "Total Demand value Before Create Order is: "+MethodsOrderUpdateDispatch.varTotalDemandBeforeCreateOrder+", New Ordered Quantity is: "+MethodsOrderUpdateDispatch.varOrderedQuantityNew+ ", Expected Total Demand value (Total Demand Value Before Updating Order + New Ordered Quantity) After Update Order is: "+(MethodsOrderUpdateDispatch.varTotalDemandBeforeCreateOrder+MethodsOrderUpdateDispatch.varOrderedQuantityNew)+ ", But Actual Total Demand value After Update Order is: "+MethodsOrderUpdateDispatch.varTotalDemandAfterUpdateOrder+". Incorrect");
		    softAssert.fail("Total Demand value Before Create Order is: "+MethodsOrderUpdateDispatch.varTotalDemandBeforeCreateOrder+", New Ordered Quantity is: "+MethodsOrderUpdateDispatch.varOrderedQuantityNew+ ", Expected Total Demand value (Total Demand Value Before Updating Order + New Ordered Quantity) After Update Order is: "+(MethodsOrderUpdateDispatch.varTotalDemandBeforeCreateOrder+MethodsOrderUpdateDispatch.varOrderedQuantityNew)+ ", But Actual Total Demand value After Update Order is: "+MethodsOrderUpdateDispatch.varTotalDemandAfterUpdateOrder+". Incorrect");
		}

		if(MethodsOrderUpdateDispatch.varAvailableQuantityAfterUpdateOrder==MethodsOrderUpdateDispatch.varAvailableQuantityBeforeCreateOrder){
		    test.log(Status.PASS, "Expected Available Quantity value (Available Quantity value After Update Order = Available Quantity value Before Create Order) After Update Order is: "+MethodsOrderUpdateDispatch.varAvailableQuantityBeforeCreateOrder+" And Actual Available Quantity value After Update Order is: "+MethodsOrderUpdateDispatch.varAvailableQuantityAfterUpdateOrder+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Available Quantity value (Available Quantity value After Update Order = Available Quantity value Before Create Order) After Update Order is: "+MethodsOrderUpdateDispatch.varAvailableQuantityBeforeCreateOrder+" But Actual Available Quantity value After Update Order is: "+MethodsOrderUpdateDispatch.varAvailableQuantityAfterUpdateOrder+". Incorrect");
		    softAssert.fail("Expected Available Quantity value (Available Quantity value After Update Order = Available Quantity value Before Create Order) After Update Order is: "+MethodsOrderUpdateDispatch.varAvailableQuantityBeforeCreateOrder+" But Actual Available Quantity value After Update Order is: "+MethodsOrderUpdateDispatch.varAvailableQuantityAfterUpdateOrder+". Incorrect");
		}

		if(MethodsOrderUpdateDispatch.varStockAfterUpdateOrder==MethodsOrderUpdateDispatch.varStockBeforeCreateOrder){
		    test.log(Status.PASS, "Expected Stock value (Stock value After Update Order = Stock value Before Create Order) After Update Order is: "+MethodsOrderUpdateDispatch.varStockBeforeCreateOrder+" And Actual Stock value After Update Order is: "+MethodsOrderUpdateDispatch.varStockAfterUpdateOrder+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Stock value (Stock value After Update Order = Stock value Before Create Order) After Update Order is: "+MethodsOrderUpdateDispatch.varStockBeforeCreateOrder+" But Actual Stock value After Update Order is: "+MethodsOrderUpdateDispatch.varStockAfterUpdateOrder+". Incorrect");
		    softAssert.fail("Expected Stock value (Stock value After Update Order = Stock value Before Create Order) After Update Order is: "+MethodsOrderUpdateDispatch.varStockBeforeCreateOrder+" But Actual Stock value After Update Order is: "+MethodsOrderUpdateDispatch.varStockAfterUpdateOrder+". Incorrect");
		}

		if(MethodsOrderUpdateDispatch.varIntransientStockAfterUpdateOrder==MethodsOrderUpdateDispatch.varIntransientStockBeforeCreateOrder){
		    test.log(Status.PASS, "Expected Intransient Stock value (Intransient Stock value After Update Order = Intransient Stock value Before Create Order) After Update Order is: "+MethodsOrderUpdateDispatch.varIntransientStockBeforeCreateOrder+" And Actual Intransient Stock value After Update Order is: "+MethodsOrderUpdateDispatch.varIntransientStockAfterUpdateOrder+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Intransient Stock value (Intransient Stock value After Update Order = Intransient Stock value Before Create Order) After Update Order is: "+MethodsOrderUpdateDispatch.varIntransientStockBeforeCreateOrder+" But Actual Intransient Stock value After Update Order is: "+MethodsOrderUpdateDispatch.varIntransientStockAfterUpdateOrder+". Incorrect");
		    softAssert.fail("Expected Intransient Stock value (Intransient Stock value After Update Order = Intransient Stock value Before Create Order) After Update Order is: "+MethodsOrderUpdateDispatch.varIntransientStockBeforeCreateOrder+" But Actual Intransient Stock value After Update Order is: "+MethodsOrderUpdateDispatch.varIntransientStockAfterUpdateOrder+". Incorrect");
		}

		if(MethodsOrderUpdateDispatch.varAvailableStockAfterUpdateOrder==MethodsOrderUpdateDispatch.varAvailableStockBeforeCreateOrder){
		    test.log(Status.PASS, "Expected Available Stock value (Available Stock value After Update Order = Available Stock value Before Create Order) After Update Order is: "+MethodsOrderUpdateDispatch.varAvailableStockBeforeCreateOrder+" And Actual Available Stock value After Update Order is: "+MethodsOrderUpdateDispatch.varAvailableStockAfterUpdateOrder+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Available Stock value (Available Stock value After Update Order = Available Stock value Before Create Order) After Update Order is: "+MethodsOrderUpdateDispatch.varAvailableStockBeforeCreateOrder+" But Actual Available Stock value After Update Order is: "+MethodsOrderUpdateDispatch.varAvailableStockAfterUpdateOrder+". Incorrect");
		    softAssert.fail("Expected Available Stock value (Available Stock value After Update Order = Available Stock value Before Create Order) After Update Order is: "+MethodsOrderUpdateDispatch.varAvailableStockBeforeCreateOrder+" But Actual Available Stock value After Update Order is: "+MethodsOrderUpdateDispatch.varAvailableStockAfterUpdateOrder+". Incorrect");
		}

		if(MethodsOrderUpdateDispatch.varUsedQuantityAfterUpdateOrder==MethodsOrderUpdateDispatch.varUsedQuantityBeforeCreateOrder){
		    test.log(Status.PASS, "Expected Used Quantity value (Used Quantity value After Update Order = Used Quantity value Before Create Order) After Update Order is: "+MethodsOrderUpdateDispatch.varUsedQuantityBeforeCreateOrder+" And Actual Used Quantity value After Update Order is: "+MethodsOrderUpdateDispatch.varUsedQuantityAfterUpdateOrder+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Used Quantity value (Used Quantity value After Update Order = Used Quantity value Before Create Order) After Update Order is: "+MethodsOrderUpdateDispatch.varUsedQuantityBeforeCreateOrder+" But Actual Used Quantity value After Update Order is: "+MethodsOrderUpdateDispatch.varUsedQuantityAfterUpdateOrder+". Incorrect");
		    softAssert.fail("Expected Used Quantity value (Used Quantity value After Update Order = Used Quantity value Before Create Order) After Update Order is: "+MethodsOrderUpdateDispatch.varUsedQuantityBeforeCreateOrder+" But Actual Used Quantity value After Update Order is: "+MethodsOrderUpdateDispatch.varUsedQuantityAfterUpdateOrder+". Incorrect");
		}

	    softAssert.assertAll();
	}
}
