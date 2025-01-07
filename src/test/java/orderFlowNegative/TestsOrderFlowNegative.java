package orderFlowNegative;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import allCommonData.TestHelper;
import io.restassured.response.Response;
import orderFlowPositive.MethodsOrderFlowPositive;
import utilities.ExtentReportManager;

public class TestsOrderFlowNegative {
	
	@Test(priority = 1,groups = {"OrderFlowNegative"})
	public void testOrderFlowNegativeInventoryDetailsBeforeCreateOrder(){
		SoftAssert softAssert = new SoftAssert();
		
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderFlowNegative.methodOrderFlowNegativeInventoryDetailsBeforeCreateOrder();
        
		TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    
	    if(MethodsOrderFlowNegative.varPendingStockBeforeCreateOrder>=0){
	    	test.log(Status.PASS, "Expected Pending Stock value before Create Order should be long number "+ "And Actual is: "+MethodsOrderFlowNegative.varPendingStockBeforeCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Pending Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderFlowNegative.varPendingStockBeforeCreateOrder+". Incorrect");
	    	softAssert.fail("Expected Pending Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderFlowNegative.varPendingStockBeforeCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderFlowNegative.varTotalDemandBeforeCreateOrder>=0){
	    	test.log(Status.PASS, "Expected Total Demand value before Create Order should be long number "+ "And Actual is: "+MethodsOrderFlowNegative.varTotalDemandBeforeCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Total Demand value before Create Order should be long number "+ "But Actual is: "+MethodsOrderFlowNegative.varTotalDemandBeforeCreateOrder+". Incorrect");
	    	softAssert.fail("Expected Total Demand value should be before Create Order long number "+ "But Actual is: "+MethodsOrderFlowNegative.varTotalDemandBeforeCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderFlowNegative.varStockBeforeCreateOrder>=0){
	    	test.log(Status.PASS, "Expected Stock value before Create Order should be long number "+ "And Actual is: "+MethodsOrderFlowNegative.varStockBeforeCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderFlowNegative.varStockBeforeCreateOrder+". Incorrect");
	    	softAssert.fail("Expected Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderFlowNegative.varStockBeforeCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderFlowNegative.varIntransientStockBeforeCreateOrder>=0){
	    	test.log(Status.PASS, "Expected Intransient Stock value before Create Order should be long number "+ "And Actual is: "+MethodsOrderFlowNegative.varIntransientStockBeforeCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Intransient Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderFlowNegative.varIntransientStockBeforeCreateOrder+". Incorrect");
	    	softAssert.fail("Expected Intransient Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderFlowNegative.varIntransientStockBeforeCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderFlowNegative.varAvailableStockBeforeCreateOrder>=0){
	    	test.log(Status.PASS, "Expected Available Stock value before Create Order should be long number "+ "And Actual is: "+MethodsOrderFlowNegative.varAvailableStockBeforeCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Available Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderFlowNegative.varAvailableStockBeforeCreateOrder+". Incorrect");
	    	softAssert.fail("Expected Available Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderFlowNegative.varAvailableStockBeforeCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderFlowNegative.varUsedQuantityBeforeCreateOrder>=0){
	    	test.log(Status.PASS, "Expected Used Quantity value before Create Order should be long number "+ "And Actual is: "+MethodsOrderFlowNegative.varUsedQuantityBeforeCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Used Quantity value before Create Order should be long number "+ "But Actual is: "+MethodsOrderFlowNegative.varUsedQuantityBeforeCreateOrder+". Incorrect");
	    	softAssert.fail("Expected Used Quantity value should be before Create Order long number "+ "But Actual is: "+MethodsOrderFlowNegative.varUsedQuantityBeforeCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderFlowNegative.varAvailableQuantityBeforeCreateOrder>=0){
	    	test.log(Status.PASS, "Expected Available Quantity value before Create Order should be long number "+ "And Actual is: "+MethodsOrderFlowNegative.varAvailableQuantityBeforeCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Available Quantity value before Create Order should be long number "+ "But Actual is: "+MethodsOrderFlowNegative.varAvailableQuantityBeforeCreateOrder+". Incorrect");
	    	softAssert.fail("Expected Available Quantity value should be before Create Order long number "+ "But Actual is: "+MethodsOrderFlowNegative.varAvailableQuantityBeforeCreateOrder+". Incorrect");
	    }
	}
	
	
	
	@Test(dependsOnMethods = "testOrderFlowNegativeInventoryDetailsBeforeCreateOrder", groups = {"OrderFlowNegative"})
	public void testOrderFlowNegativecreateOrder(){
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderFlowNegative.methodOrderFlowNegativeCreateOrder();
        
		TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    TestHelper.validateStatus(test, response, "Created");
	    TestHelper.validateId(test, response);
	}

	
	
	@Test(dependsOnMethods = "testOrderFlowNegativecreateOrder",groups = {"OrderFlowNegative"})
	public void testOrderFlowNegativeInventoryDetailsAfterCreateOrder(){
		SoftAssert softAssert = new SoftAssert();
		
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderFlowNegative.methodOrderFlowNegativeInventoryDetailsAfterCreateOrder();
        
		TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    
	    if(MethodsOrderFlowNegative.varPendingStockAfterCreateOrder==(MethodsOrderFlowNegative.varPendingStockBeforeCreateOrder+MethodsOrderFlowNegative.varOrderedQuantity)){
	    	test.log(Status.PASS, "Pending Stock value Before Create Order is: "+MethodsOrderFlowNegative.varPendingStockBeforeCreateOrder+", Ordered Quantity is: "+MethodsOrderFlowNegative.varOrderedQuantity+ ", Expected Pending Stock value (Pending Stock Value Before Creating Order + Ordered Quantity) After Create Order is: "+(MethodsOrderFlowNegative.varPendingStockBeforeCreateOrder+MethodsOrderFlowNegative.varOrderedQuantity)+ ", And Actual Pending Stock value After Create Order is: "+MethodsOrderFlowNegative.varPendingStockAfterCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Pending Stock value Before Create Order is: "+MethodsOrderFlowNegative.varPendingStockBeforeCreateOrder+", Ordered Quantity is: "+MethodsOrderFlowNegative.varOrderedQuantity+ ", Expected Pending Stock value (Pending Stock Value Before Creating Order + Ordered Quantity) After Create Order is: "+(MethodsOrderFlowNegative.varPendingStockBeforeCreateOrder+MethodsOrderFlowNegative.varOrderedQuantity)+ ", But Actual Pending Stock value After Create Order is: "+MethodsOrderFlowNegative.varPendingStockAfterCreateOrder+". Incorrect");
	    	softAssert.fail("Pending Stock value Before Create Order is: "+MethodsOrderFlowNegative.varPendingStockBeforeCreateOrder+", Ordered Quantity is: "+MethodsOrderFlowNegative.varOrderedQuantity+ ", Expected Pending Stock value (Pending Stock Value Before Creating Order + Ordered Quantity) After Create Order is: "+(MethodsOrderFlowNegative.varPendingStockBeforeCreateOrder+MethodsOrderFlowNegative.varOrderedQuantity)+ ", But Actual Pending Stock value After Create Order is: "+MethodsOrderFlowNegative.varPendingStockAfterCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderFlowNegative.varTotalDemandAfterCreateOrder==(MethodsOrderFlowNegative.varTotalDemandBeforeCreateOrder+MethodsOrderFlowNegative.varOrderedQuantity)){
	    	test.log(Status.PASS, "Total Demand value Before Create Order is: "+MethodsOrderFlowNegative.varTotalDemandBeforeCreateOrder+", Ordered Quantity is: "+MethodsOrderFlowNegative.varOrderedQuantity+ ", Expected Total Demand value (Total Demand Value Before Creating Order + Ordered Quantity) After Create Order is: "+(MethodsOrderFlowNegative.varTotalDemandBeforeCreateOrder+MethodsOrderFlowNegative.varOrderedQuantity)+ ", And Actual Total Demand value After Create Order is: "+MethodsOrderFlowNegative.varTotalDemandAfterCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Total Demand value Before Create Order is: "+MethodsOrderFlowNegative.varTotalDemandBeforeCreateOrder+", Ordered Quantity is: "+MethodsOrderFlowNegative.varOrderedQuantity+ ", Expected Total Demand value (Total Demand Value Before Creating Order + Ordered Quantity) After Create Order is: "+(MethodsOrderFlowNegative.varTotalDemandBeforeCreateOrder+MethodsOrderFlowNegative.varOrderedQuantity)+ ", But Actual Total Demand value After Create Order is: "+MethodsOrderFlowNegative.varTotalDemandAfterCreateOrder+". Incorrect");
	    	softAssert.fail("Total Demand value Before Create Order is: "+MethodsOrderFlowNegative.varTotalDemandBeforeCreateOrder+", Ordered Quantity is: "+MethodsOrderFlowNegative.varOrderedQuantity+ ", Expected Total Demand value (Pending Stock Value Before Creating Order + Ordered Quantity) After Create Order is: "+(MethodsOrderFlowNegative.varTotalDemandBeforeCreateOrder+MethodsOrderFlowNegative.varOrderedQuantity)+ ", But Actual Total Demand value After Create Order is: "+MethodsOrderFlowNegative.varTotalDemandAfterCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderFlowNegative.varAvailableQuantityAfterCreateOrder==MethodsOrderFlowNegative.varAvailableQuantityBeforeCreateOrder){
	    	test.log(Status.PASS, "Expected Available Quantity value (Available Quantity value After Create Order = Available Quantity value Before Create Order) After Create Order is: "+MethodsOrderFlowNegative.varAvailableQuantityBeforeCreateOrder+" And Actual Available Quantity value After Create Order is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Available Quantity value (Available Quantity value After Create Order = Available Quantity value Before Create Order) After Create Order is: "+MethodsOrderFlowNegative.varAvailableQuantityBeforeCreateOrder+" But Actual Available Quantity value After Create Order is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterCreateOrder+". InCorrect");
	    	softAssert.fail("Expected Available Quantity value (Available Quantity value After Create Order = Available Quantity value Before Create Order) After Create Order is: "+MethodsOrderFlowNegative.varAvailableQuantityBeforeCreateOrder+" But Actual Available Quantity value After Create Order is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterCreateOrder+". InCorrect");
	    }
	    
	    if(MethodsOrderFlowNegative.varStockAfterCreateOrder==MethodsOrderFlowNegative.varStockBeforeCreateOrder){
	    	test.log(Status.PASS, "Expected Stock value (Stock value After Create Order = Stock value Before Create Order) After Create Order is: "+MethodsOrderFlowNegative.varStockBeforeCreateOrder+" And Actual Stock value After Create Order is: "+MethodsOrderFlowNegative.varStockAfterCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Stock value (Stock value After Create Order = Stock value Before Create Order) After Create Order is: "+MethodsOrderFlowNegative.varStockBeforeCreateOrder+" But Actual Stock value After Create Order is: "+MethodsOrderFlowNegative.varStockAfterCreateOrder+". InCorrect");
	    	softAssert.fail("Expected Stock value (Stock value After Create Order = Stock value Before Create Order) After Create Order is: "+MethodsOrderFlowNegative.varStockBeforeCreateOrder+" But Actual Stock value After Create Order is: "+MethodsOrderFlowNegative.varStockAfterCreateOrder+". InCorrect");
	    }
	    
	    if(MethodsOrderFlowNegative.varIntransientStockAfterCreateOrder==MethodsOrderFlowNegative.varIntransientStockBeforeCreateOrder){
	    	test.log(Status.PASS, "Expected Intransient Stock value (Intransient Stock value After Create Order = Intransient Stock value Before Create Order) After Create Order is: "+MethodsOrderFlowNegative.varIntransientStockBeforeCreateOrder+" And Actual Intransient Stock value After Create Order is: "+MethodsOrderFlowNegative.varIntransientStockAfterCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Intransient Stock value (Intransient Stock value After Create Order = Intransient Stock value Before Create Order) After Create Order is: "+MethodsOrderFlowNegative.varIntransientStockBeforeCreateOrder+" But Actual Intransient Stock value After Create Order is: "+MethodsOrderFlowNegative.varIntransientStockAfterCreateOrder+". InCorrect");
	    	softAssert.fail("Expected Intransient Stock value (Intransient Stock value After Create Order = Intransient Stock value Before Create Order) After Create Order is: "+MethodsOrderFlowNegative.varIntransientStockBeforeCreateOrder+" But Actual Intransient Stock value After Create Order is: "+MethodsOrderFlowNegative.varIntransientStockAfterCreateOrder+". InCorrect");
	    }
	    
	    if(MethodsOrderFlowNegative.varAvailableStockAfterCreateOrder==MethodsOrderFlowNegative.varAvailableStockBeforeCreateOrder){
	    	test.log(Status.PASS, "Expected Available Stock value (Available Stock value After Create Order = Available Stock value Before Create Order) After Create Order is: "+MethodsOrderFlowNegative.varAvailableStockBeforeCreateOrder+" And Actual Available Stock value After Create Order is: "+MethodsOrderFlowNegative.varAvailableStockAfterCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Available Stock value (Available Stock value After Create Order = Available Stock value Before Create Order) After Create Order is: "+MethodsOrderFlowNegative.varAvailableStockBeforeCreateOrder+" But Actual Available Stock value After Create Order is: "+MethodsOrderFlowNegative.varAvailableStockAfterCreateOrder+". InCorrect");
	    	softAssert.fail("Expected Available Stock value (Available Stock value After Create Order = Available Stock value Before Create Order) After Create Order is: "+MethodsOrderFlowNegative.varAvailableStockBeforeCreateOrder+" But Actual Available Stock value After Create Order is: "+MethodsOrderFlowNegative.varAvailableStockAfterCreateOrder+". InCorrect");
	    }
	    
	    if(MethodsOrderFlowNegative.varUsedQuantityAfterCreateOrder==MethodsOrderFlowNegative.varUsedQuantityBeforeCreateOrder){
	    	test.log(Status.PASS, "Expected Used Quantity value (Used Quantity value After Create Order = Used Quantity value Before Create Order) After Create Order is: "+MethodsOrderFlowNegative.varUsedQuantityBeforeCreateOrder+" And Actual Available Stock value After Create Order is: "+MethodsOrderFlowNegative.varUsedQuantityAfterCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Used Quantity value (Used Quantity value After Create Order = Used Quantity value Before Create Order) After Create Order is: "+MethodsOrderFlowNegative.varUsedQuantityBeforeCreateOrder+" But Actual Available Stock value After Create Order is: "+MethodsOrderFlowNegative.varUsedQuantityAfterCreateOrder+". InCorrect");
	    	softAssert.fail("Expected Used Quantity value (Used Quantity value After Create Order = Used Quantity value Before Create Order) After Create Order is: "+MethodsOrderFlowNegative.varUsedQuantityBeforeCreateOrder+" But Actual Available Stock value After Create Order is: "+MethodsOrderFlowNegative.varUsedQuantityAfterCreateOrder+". InCorrect");
	    }
	    
	    
	    
	    if(MethodsOrderFlowNegative.varAvailableQuantityAfterCreateOrder>=MethodsOrderFlowNegative.varOrderedQuantity){
	    	test.log(Status.PASS, "Available Quantity value After Create Order is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterCreateOrder + ", Ordered Quantity is: " + MethodsOrderFlowNegative.varOrderedQuantity + ", Available Quantity value After Create Order >= Ordered Quantity. Correct");
	    } else {
	    	test.log(Status.FAIL, "Add Inventory, Available Quantity value After Create Order is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterCreateOrder + ", Ordered Quantity is: " + MethodsOrderFlowNegative.varOrderedQuantity + ", Available Quantity value After Create Order >= Ordered Quantity. Incorrect");
	    	softAssert.fail("Add Inventory, Available Quantity value After Create Order is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterCreateOrder + ", Ordered Quantity is: " + MethodsOrderFlowNegative.varOrderedQuantity + ", Available Quantity value After Create Order >= Ordered Quantity. Incorrect");
	    }
	}
	
	

	@Test(dependsOnMethods = "testOrderFlowNegativeInventoryDetailsAfterCreateOrder",groups = {"OrderFlowNegative"})
	public void testOrderFlowNegativeBatchAssign(){
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderFlowNegative.methodOrderFlowNegativeBatchAssign();
	    
		TestHelper.logDetails(test, response);
		TestHelper.validateStatusCode(test, response, 200);
	    TestHelper.validateStatus(test, response, "BatchAssigned");
	    TestHelper.validateId(test, response);
	}
	
	
	
	@Test(dependsOnMethods = "testOrderFlowNegativeBatchAssign",groups = {"OrderFlowNegative"})
	public void testOrderFlowNegativeInventoryDetailsAfterBatchAssign(){
		SoftAssert softAssert = new SoftAssert();
		
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderFlowNegative.methodOrderFlowNegativeInventoryDetailsAfterBatchAssign();
	    
		TestHelper.logDetails(test, response);
		TestHelper.validateStatusCode(test, response, 200);
		
		if(MethodsOrderFlowNegative.varUsedQuantityAfterBatchAssign==(MethodsOrderFlowNegative.varUsedQuantityAfterCreateOrder+MethodsOrderFlowNegative.varOrderedQuantity)){
	    	test.log(Status.PASS, "Used Quantity value After Create Order is: "+MethodsOrderFlowNegative.varUsedQuantityAfterCreateOrder+", Ordered Quantity is: "+MethodsOrderFlowNegative.varOrderedQuantity+ ", Expected Used Quantity value (Used Quantity value After Create Order + Ordered Quantity) After Batch Assign is: "+(MethodsOrderFlowNegative.varUsedQuantityAfterCreateOrder+MethodsOrderFlowNegative.varOrderedQuantity)+ ", And Actual Used Quantity value value After Batch Assign is: "+MethodsOrderFlowNegative.varUsedQuantityAfterBatchAssign+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Used Quantity value After Create Order is: "+MethodsOrderFlowNegative.varUsedQuantityAfterCreateOrder+", Ordered Quantity is: "+MethodsOrderFlowNegative.varOrderedQuantity+ ", Expected Used Quantity value (Used Quantity value After Create Order + Ordered Quantity) After Batch Assign is: "+(MethodsOrderFlowNegative.varUsedQuantityAfterCreateOrder+MethodsOrderFlowNegative.varOrderedQuantity)+ ", But Actual Used Quantity value value After Batch Assign is: "+MethodsOrderFlowNegative.varUsedQuantityAfterBatchAssign+". Incorrect");
	    	softAssert.fail("Used Quantity value After Create Order is: "+MethodsOrderFlowNegative.varUsedQuantityAfterCreateOrder+", Ordered Quantity is: "+MethodsOrderFlowNegative.varOrderedQuantity+ ", Expected Used Quantity value (Used Quantity value After Create Order + Ordered Quantity) After BatchAssign is: "+(MethodsOrderFlowNegative.varUsedQuantityAfterCreateOrder+MethodsOrderFlowNegative.varOrderedQuantity)+ ", But Actual Used Quantity value value After Batch Assign is: "+MethodsOrderFlowNegative.varUsedQuantityAfterBatchAssign+". Incorrect");
	    }
		
		if(MethodsOrderFlowNegative.varAvailableQuantityAfterBatchAssign==(MethodsOrderFlowNegative.varAvailableQuantityAfterCreateOrder-MethodsOrderFlowNegative.varOrderedQuantity)){
	    	test.log(Status.PASS, "Available Quantity value After Create Order is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterCreateOrder+", Ordered Quantity is: "+MethodsOrderFlowNegative.varOrderedQuantity+ ", Expected Available Quantity value (Available Quantity value After Create Order - Ordered Quantity) After Batch Assign is: "+(MethodsOrderFlowNegative.varAvailableQuantityAfterCreateOrder-MethodsOrderFlowNegative.varOrderedQuantity)+ ", And Actual Available Quantity value value After Batch Assign is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterBatchAssign+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Available Quantity value After Create Order is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterCreateOrder+", Ordered Quantity is: "+MethodsOrderFlowNegative.varOrderedQuantity+ ", Expected Available Quantity value (Available Quantity value After Create Order - Ordered Quantity) After Batch Assign is: "+(MethodsOrderFlowNegative.varAvailableQuantityAfterCreateOrder-MethodsOrderFlowNegative.varOrderedQuantity)+ ", But Actual Available Quantity value value After Batch Assign is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterBatchAssign+". Incorrect");
	    	softAssert.fail("Available Quantity value After Create Order is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterCreateOrder+", Ordered Quantity is: "+MethodsOrderFlowNegative.varOrderedQuantity+ ", Expected Available Quantity value (Available Quantity value After Create Order - Ordered Quantity) After BatchAssign is: "+(MethodsOrderFlowNegative.varAvailableQuantityAfterCreateOrder-MethodsOrderFlowNegative.varOrderedQuantity)+ ", But Actual Available Quantity value value After Batch Assign is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterBatchAssign+". Incorrect");
	    }
		
	    if(MethodsOrderFlowNegative.varPendingStockAfterBatchAssign==MethodsOrderFlowNegative.varPendingStockAfterCreateOrder){
	    	test.log(Status.PASS, "Expected Pending Stock value (Pending Stock value After Batch Assign = Pending Stock value After Create Order) After Batch Assign is: "+MethodsOrderFlowNegative.varPendingStockAfterCreateOrder+" And Actual Pending Stock value After Batch Assign is: "+MethodsOrderFlowNegative.varPendingStockAfterBatchAssign+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Pending Stock value (Pending Stock value After Batch Assign = Pending Stock value After Create Order) After Batch Assign is: "+MethodsOrderFlowNegative.varPendingStockAfterCreateOrder+" But Actual Pending Stock value After Batch Assign is: "+MethodsOrderFlowNegative.varPendingStockAfterBatchAssign+". InCorrect");
	    	softAssert.fail("Expected Pending Stock value (Pending Stock value After Batch Assign = Pending Stock value After Create Order) After Batch Assign is: "+MethodsOrderFlowNegative.varPendingStockAfterCreateOrder+" But Actual Pending Stock value After Batch Assign is: "+MethodsOrderFlowNegative.varPendingStockAfterBatchAssign+". InCorrect");
	    }
	    
	    if(MethodsOrderFlowNegative.varTotalDemandAfterBatchAssign==MethodsOrderFlowNegative.varTotalDemandAfterCreateOrder){
	    	test.log(Status.PASS, "Expected Total Demand value (Total Demand value After Batch Assign = Total Demand value After Create Order) After Batch Assign is: "+MethodsOrderFlowNegative.varTotalDemandAfterCreateOrder+" And Actual Total Demand value After Batch Assign is: "+MethodsOrderFlowNegative.varTotalDemandAfterBatchAssign+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Total Demand value (Total Demand value After Batch Assign = Total Demand value After Create Order) After Batch Assign is: "+MethodsOrderFlowNegative.varTotalDemandAfterCreateOrder+" But Actual Total Demand value After Batch Assign is: "+MethodsOrderFlowNegative.varTotalDemandAfterBatchAssign+". InCorrect");
	    	softAssert.fail("Expected Total Demand value (Total Demand value After Batch Assign = Total Demand value After Create Order) After Batch Assign is: "+MethodsOrderFlowNegative.varTotalDemandAfterCreateOrder+" But Actual Total Demand value After Batch Assign is: "+MethodsOrderFlowNegative.varTotalDemandAfterBatchAssign+". InCorrect");
	    }
		
	    if(MethodsOrderFlowNegative.varStockAfterBatchAssign==MethodsOrderFlowNegative.varStockAfterCreateOrder){
	    	test.log(Status.PASS, "Expected Stock value (Stock value After Batch Assign = Stock value After Create Order) After Batch Assign is: "+MethodsOrderFlowNegative.varStockAfterCreateOrder+" And Actual Stock value After Batch Assign is: "+MethodsOrderFlowNegative.varStockAfterBatchAssign+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Stock value (Stock value After Batch Assign = Stock value After Create Order) After Batch Assign is: "+MethodsOrderFlowNegative.varStockAfterCreateOrder+" But Actual Stock value After Batch Assign is: "+MethodsOrderFlowNegative.varStockAfterBatchAssign+". InCorrect");
	    	softAssert.fail("Expected Stock value (Stock value After Batch Assign = Stock value After Create Order) After Batch Assign is: "+MethodsOrderFlowNegative.varStockAfterCreateOrder+" But Actual Stock value After Batch Assign is: "+MethodsOrderFlowNegative.varStockAfterBatchAssign+". InCorrect");
	    }
	    
	    if(MethodsOrderFlowNegative.varIntransientStockAfterBatchAssign==MethodsOrderFlowNegative.varIntransientStockAfterCreateOrder){
	    	test.log(Status.PASS, "Expected Intransient Stock value (Intransient Stock value After Batch Assign = Intransient Stock value After Create Order) After Batch Assign is: "+MethodsOrderFlowNegative.varIntransientStockAfterCreateOrder+" And Actual Intransient Stock value After Batch Assign is: "+MethodsOrderFlowNegative.varIntransientStockAfterBatchAssign+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Intransient Stock value (Intransient Stock value After Batch Assign = Intransient Stock value After Create Order) After Batch Assign is: "+MethodsOrderFlowNegative.varIntransientStockAfterCreateOrder+" But Actual Intransient Stock value After Batch Assign is: "+MethodsOrderFlowNegative.varIntransientStockAfterBatchAssign+". InCorrect");
	    	softAssert.fail("Expected Intransient Stock value (Intransient Stock value After Batch Assign = Intransient Stock value After Create Order) After Batch Assign is: "+MethodsOrderFlowNegative.varIntransientStockAfterCreateOrder+" But Actual Intransient Stock value After Batch Assign is: "+MethodsOrderFlowNegative.varIntransientStockAfterBatchAssign+". InCorrect");
	    }
	    
	    if(MethodsOrderFlowNegative.varAvailableStockAfterBatchAssign==MethodsOrderFlowNegative.varAvailableStockAfterCreateOrder){
	    	test.log(Status.PASS, "Expected Available Stock value (Available Stock value After Batch Assign = Available Stock value After Create Order) After Batch Assign is: "+MethodsOrderFlowNegative.varAvailableStockAfterCreateOrder+" And Actual Available Stock value After Batch Assign is: "+MethodsOrderFlowNegative.varAvailableStockAfterBatchAssign+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Available Stock value (Available Stock value After Batch Assign = Available Stock value After Create Order) After Batch Assign is: "+MethodsOrderFlowNegative.varAvailableStockAfterCreateOrder+" But Actual Available Stock value After Batch Assign is: "+MethodsOrderFlowNegative.varAvailableStockAfterBatchAssign+". InCorrect");
	    	softAssert.fail("Expected Available Stock value (Available Stock value After Batch Assign = Available Stock value After Create Order) After Batch Assign is: "+MethodsOrderFlowNegative.varAvailableStockAfterCreateOrder+" But Actual Available Stock value After Batch Assign is: "+MethodsOrderFlowNegative.varAvailableStockAfterBatchAssign+". InCorrect");
	    }
	}
	
	
	
	@Test(dependsOnMethods = "testOrderFlowNegativeInventoryDetailsAfterBatchAssign",groups = {"OrderFlowNegative"})
	public void testOrderFlowNegativeMarkPacked(){
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderFlowNegative.methodOrderFlowNegativeMarkPacked();
	    
		TestHelper.logDetails(test, response);
		TestHelper.validateStatusCode(test, response, 200);
	    TestHelper.validateStatus(test, response, "Packed");
	    TestHelper.validateId(test, response);
	}
	
	
	
	@Test(dependsOnMethods = "testOrderFlowNegativeMarkPacked",groups = {"OrderFlowNegative"})
	public void testOrderFlowNegativeInventoryDetailsAfterMarkPacked(){
		SoftAssert softAssert = new SoftAssert();
		
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderFlowNegative.methodOrderFlowNegativeInventoryDetailsAfterMarkPacked();
	    
		TestHelper.logDetails(test, response);
		TestHelper.validateStatusCode(test, response, 200);
		
		if(MethodsOrderFlowNegative.varUsedQuantityAfterMarkPacked==MethodsOrderFlowNegative.varUsedQuantityAfterBatchAssign){
	    	test.log(Status.PASS, "Expected Used Quantity value (Used Quantity value After Mark Packed = Used Quantity value After Batch Assign) After Mark Packed is: "+MethodsOrderFlowNegative.varUsedQuantityAfterBatchAssign+" And Actual Used Quantity value After Mark Packed is: "+MethodsOrderFlowNegative.varUsedQuantityAfterBatchAssign+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Used Quantity value (Used Quantity value After Mark Packed = Used Quantity value After Batch Assign) After Mark Packed is: "+MethodsOrderFlowNegative.varUsedQuantityAfterBatchAssign+" But Actual Used Quantity value After Mark Packed is: "+MethodsOrderFlowNegative.varUsedQuantityAfterBatchAssign+". InCorrect");
	    	softAssert.fail("Expected Used Quantity value (Used Quantity value After Mark Packed = Used Quantity value After Batch Assign) After Mark Packed is: "+MethodsOrderFlowNegative.varUsedQuantityAfterBatchAssign+" But Actual Used Quantity value After Mark Packed is: "+MethodsOrderFlowNegative.varUsedQuantityAfterBatchAssign+". InCorrect");
	    }
		
		if(MethodsOrderFlowNegative.varAvailableQuantityAfterMarkPacked==MethodsOrderFlowNegative.varAvailableQuantityAfterBatchAssign){
	    	test.log(Status.PASS, "Expected Available Quantity value (Available Quantity value After Mark Packed = Available Quantity value After Batch Assign) After Mark Packed is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterBatchAssign+" And Actual Available Quantity value After Mark Packed is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterBatchAssign+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Available Quantity value (Available Quantity value After Mark Packed = Available Quantity value After Batch Assign) After Mark Packed is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterBatchAssign+" But Actual Available Quantity value After Mark Packed is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterBatchAssign+". InCorrect");
	    	softAssert.fail("Expected Available Quantity value (Available Quantity value After Mark Packed = Available Quantity value After Batch Assign) After Mark Packed is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterBatchAssign+" But Actual Available Quantity value After Mark Packed is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterBatchAssign+". InCorrect");
	    }
		
	    if(MethodsOrderFlowNegative.varPendingStockAfterMarkPacked==MethodsOrderFlowNegative.varPendingStockAfterBatchAssign){
	    	test.log(Status.PASS, "Expected Pending Stock value (Pending Stock value After Mark Packed = Pending Stock value After Batch Assign) After Mark Packed is: "+MethodsOrderFlowNegative.varPendingStockAfterBatchAssign+" And Actual Pending Stock value After Mark Packed is: "+MethodsOrderFlowNegative.varPendingStockAfterMarkPacked+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Pending Stock value (Pending Stock value After Mark Packed = Pending Stock value After Batch Assign) After Mark Packed is: "+MethodsOrderFlowNegative.varPendingStockAfterBatchAssign+" But Actual Pending Stock value After Mark Packed is: "+MethodsOrderFlowNegative.varPendingStockAfterMarkPacked+". InCorrect");
	    	softAssert.fail("Expected Pending Stock value (Pending Stock value After Mark Packed = Pending Stock value After Batch Assign) After Mark Packed is: "+MethodsOrderFlowNegative.varPendingStockAfterBatchAssign+" But Actual Pending Stock value After Mark Packed is: "+MethodsOrderFlowNegative.varPendingStockAfterMarkPacked+". InCorrect");
	    }
	    
	    if(MethodsOrderFlowNegative.varTotalDemandAfterMarkPacked==MethodsOrderFlowNegative.varTotalDemandAfterBatchAssign){
	    	test.log(Status.PASS, "Expected Total Demand value (Total Demand value After Mark Packed = Total Demand value After Batch Assign) After Mark Packed is: "+MethodsOrderFlowNegative.varTotalDemandAfterBatchAssign+" And Actual Total Demand value After Mark Packed is: "+MethodsOrderFlowNegative.varTotalDemandAfterMarkPacked+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Total Demand value (Total Demand value After Mark Packed = Total Demand value After Batch Assign) After Mark Packed is: "+MethodsOrderFlowNegative.varTotalDemandAfterBatchAssign+" But Actual Total Demand value After Mark Packed is: "+MethodsOrderFlowNegative.varTotalDemandAfterMarkPacked+". InCorrect");
	    	softAssert.fail("Expected Total Demand value (Total Demand value After Mark Packed = Total Demand value After Batch Assign) After Mark Packed is: "+MethodsOrderFlowNegative.varTotalDemandAfterBatchAssign+" But Actual Total Demand value After Mark Packed is: "+MethodsOrderFlowNegative.varTotalDemandAfterMarkPacked+". InCorrect");
	    }
		
	    if(MethodsOrderFlowNegative.varStockAfterMarkPacked==MethodsOrderFlowNegative.varStockAfterBatchAssign){
	    	test.log(Status.PASS, "Expected Stock value (Stock value After Mark Packed = Stock value After Batch Assign) After Mark Packed is: "+MethodsOrderFlowNegative.varStockAfterBatchAssign+" And Actual Stock value After Mark Packed is: "+MethodsOrderFlowNegative.varStockAfterMarkPacked+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Stock value (Stock value After Mark Packed = Stock value After Batch Assign) After Mark Packed is: "+MethodsOrderFlowNegative.varStockAfterBatchAssign+" But Actual Stock value After Mark Packed is: "+MethodsOrderFlowNegative.varStockAfterMarkPacked+". InCorrect");
	    	softAssert.fail("Expected Stock value (Stock value After Mark Packed = Stock value After Batch Assign) After Mark Packed is: "+MethodsOrderFlowNegative.varStockAfterBatchAssign+" But Actual Stock value After Mark Packed is: "+MethodsOrderFlowNegative.varStockAfterMarkPacked+". InCorrect");
	    }
	    
	    if(MethodsOrderFlowNegative.varIntransientStockAfterMarkPacked==MethodsOrderFlowNegative.varIntransientStockAfterBatchAssign){
	    	test.log(Status.PASS, "Expected Intransient Stock value (Intransient Stock value After Mark Packed = Intransient Stock value After Batch Assign) After Mark Packed is: "+MethodsOrderFlowNegative.varIntransientStockAfterBatchAssign+" And Actual Intransient Stock value After Mark Packed is: "+MethodsOrderFlowNegative.varIntransientStockAfterMarkPacked+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Intransient Stock value (Intransient Stock value After Mark Packed = Intransient Stock value After Batch Assign) After Mark Packed is: "+MethodsOrderFlowNegative.varIntransientStockAfterBatchAssign+" But Actual Intransient Stock value After Mark Packed is: "+MethodsOrderFlowNegative.varIntransientStockAfterMarkPacked+". InCorrect");
	    	softAssert.fail("Expected Intransient Stock value (Intransient Stock value After Mark Packed = Intransient Stock value After Batch Assign) After Mark Packed is: "+MethodsOrderFlowNegative.varIntransientStockAfterBatchAssign+" But Actual Intransient Stock value After Mark Packed is: "+MethodsOrderFlowNegative.varIntransientStockAfterMarkPacked+". InCorrect");
	    }
	    
	    if(MethodsOrderFlowNegative.varAvailableStockAfterMarkPacked==MethodsOrderFlowNegative.varAvailableStockAfterBatchAssign){
	    	test.log(Status.PASS, "Expected Available Stock value (Available Stock value After Mark Packed = Available Stock value After Batch Assign) After Mark Packed is: "+MethodsOrderFlowNegative.varAvailableStockAfterBatchAssign+" And Actual Available Stock value After Mark Packed is: "+MethodsOrderFlowNegative.varAvailableStockAfterMarkPacked+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Available Stock value (Available Stock value After Mark Packed = Available Stock value After Batch Assign) After Mark Packed is: "+MethodsOrderFlowNegative.varAvailableStockAfterBatchAssign+" But Actual Available Stock value After Mark Packed is: "+MethodsOrderFlowNegative.varAvailableStockAfterMarkPacked+". InCorrect");
	    	softAssert.fail("Expected Available Stock value (Available Stock value After Mark Packed = Available Stock value After Batch Assign) After Mark Packed is: "+MethodsOrderFlowNegative.varAvailableStockAfterBatchAssign+" But Actual Available Stock value After Mark Packed is: "+MethodsOrderFlowNegative.varAvailableStockAfterMarkPacked+". InCorrect");
	    }
	}

	
	
	@Test(dependsOnMethods = "testOrderFlowNegativeInventoryDetailsAfterMarkPacked",groups = {"OrderFlowNegative"})
	public void testOrderFlowNegativeCreateShipment(){
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderFlowNegative.methodOrderFlowNegativeCreateShipment();
	    
		TestHelper.logDetails(test, response);
		TestHelper.validateStatusCode(test, response, 200);
	    TestHelper.validateStatus(test, response, "INITIATED");
	    TestHelper.validateId(test, response);
	}

	
	
	@Test(dependsOnMethods = "testOrderFlowNegativeCreateShipment",groups = {"OrderFlowNegative"})
	public void testOrderFlowNegativeInventoryDetailsAfterCreateShipment(){
		SoftAssert softAssert = new SoftAssert();
		
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderFlowNegative.methodOrderFlowNegativeInventoryDetailsCreateShipment();
	    
		TestHelper.logDetails(test, response);
		TestHelper.validateStatusCode(test, response, 200);
		
		if(MethodsOrderFlowNegative.varUsedQuantityAfterCreateShipment==MethodsOrderFlowNegative.varUsedQuantityAfterMarkPacked){
	    	test.log(Status.PASS, "Expected Used Quantity value (Used Quantity value After Create Shipment = Used Quantity value After Mark Packed) After Create Shipment is: "+MethodsOrderFlowNegative.varUsedQuantityAfterMarkPacked+" And Actual Used Quantity value After Mark Packed is: "+MethodsOrderFlowNegative.varUsedQuantityAfterCreateShipment+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Used Quantity value (Used Quantity value After Create Shipment = Used Quantity value After Mark Packed) After Create Shipment is: "+MethodsOrderFlowNegative.varUsedQuantityAfterMarkPacked+" But Actual Used Quantity value After Mark Packed is: "+MethodsOrderFlowNegative.varUsedQuantityAfterCreateShipment+". InCorrect");
	    	softAssert.fail("Expected Used Quantity value (Used Quantity value After Create Shipment = Used Quantity value After Mark Packed) After Create Shipment is: "+MethodsOrderFlowNegative.varUsedQuantityAfterMarkPacked+" But Actual Used Quantity value After Mark Packed is: "+MethodsOrderFlowNegative.varUsedQuantityAfterCreateShipment+". InCorrect");
	    }
		
		if(MethodsOrderFlowNegative.varAvailableQuantityAfterCreateShipment == MethodsOrderFlowNegative.varAvailableQuantityAfterMarkPacked){
		    test.log(Status.PASS, "Expected Available Quantity value (Available Quantity value After Create Shipment = Available Quantity value After Mark Packed) After Create Shipment is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterMarkPacked+" And Actual Available Quantity value After Create Shipment is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterMarkPacked+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Available Quantity value (Available Quantity value After Create Shipment = Available Quantity value After Mark Packed) After Create Shipment is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterMarkPacked+" But Actual Available Quantity value After Create Shipment is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterMarkPacked+". InCorrect");
		    softAssert.fail("Expected Available Quantity value (Available Quantity value After Create Shipment = Available Quantity value After Mark Packed) After Create Shipment is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterMarkPacked+" But Actual Available Quantity value After Create Shipment is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterMarkPacked+". InCorrect");
		}

		if(MethodsOrderFlowNegative.varPendingStockAfterCreateShipment == MethodsOrderFlowNegative.varPendingStockAfterMarkPacked){
		    test.log(Status.PASS, "Expected Pending Stock value (Pending Stock value After Create Shipment = Pending Stock value After Mark Packed) After Create Shipment is: "+MethodsOrderFlowNegative.varPendingStockAfterMarkPacked+" And Actual Pending Stock value After Create Shipment is: "+MethodsOrderFlowNegative.varPendingStockAfterCreateShipment+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Pending Stock value (Pending Stock value After Create Shipment = Pending Stock value After Mark Packed) After Create Shipment is: "+MethodsOrderFlowNegative.varPendingStockAfterMarkPacked+" But Actual Pending Stock value After Create Shipment is: "+MethodsOrderFlowNegative.varPendingStockAfterCreateShipment+". InCorrect");
		    softAssert.fail("Expected Pending Stock value (Pending Stock value After Create Shipment = Pending Stock value After Mark Packed) After Create Shipment is: "+MethodsOrderFlowNegative.varPendingStockAfterMarkPacked+" But Actual Pending Stock value After Create Shipment is: "+MethodsOrderFlowNegative.varPendingStockAfterCreateShipment+". InCorrect");
		}

		if(MethodsOrderFlowNegative.varTotalDemandAfterCreateShipment == MethodsOrderFlowNegative.varTotalDemandAfterMarkPacked){
		    test.log(Status.PASS, "Expected Total Demand value (Total Demand value After Create Shipment = Total Demand value After Mark Packed) After Create Shipment is: "+MethodsOrderFlowNegative.varTotalDemandAfterMarkPacked+" And Actual Total Demand value After Create Shipment is: "+MethodsOrderFlowNegative.varTotalDemandAfterCreateShipment+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Total Demand value (Total Demand value After Create Shipment = Total Demand value After Mark Packed) After Create Shipment is: "+MethodsOrderFlowNegative.varTotalDemandAfterMarkPacked+" But Actual Total Demand value After Create Shipment is: "+MethodsOrderFlowNegative.varTotalDemandAfterCreateShipment+". InCorrect");
		    softAssert.fail("Expected Total Demand value (Total Demand value After Create Shipment = Total Demand value After Mark Packed) After Create Shipment is: "+MethodsOrderFlowNegative.varTotalDemandAfterMarkPacked+" But Actual Total Demand value After Create Shipment is: "+MethodsOrderFlowNegative.varTotalDemandAfterCreateShipment+". InCorrect");
		}

		if(MethodsOrderFlowNegative.varStockAfterCreateShipment == MethodsOrderFlowNegative.varStockAfterMarkPacked){
		    test.log(Status.PASS, "Expected Stock value (Stock value After Create Shipment = Stock value After Mark Packed) After Create Shipment is: "+MethodsOrderFlowNegative.varStockAfterMarkPacked+" And Actual Stock value After Create Shipment is: "+MethodsOrderFlowNegative.varStockAfterCreateShipment+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Stock value (Stock value After Create Shipment = Stock value After Mark Packed) After Create Shipment is: "+MethodsOrderFlowNegative.varStockAfterMarkPacked+" But Actual Stock value After Create Shipment is: "+MethodsOrderFlowNegative.varStockAfterCreateShipment+". InCorrect");
		    softAssert.fail("Expected Stock value (Stock value After Create Shipment = Stock value After Mark Packed) After Create Shipment is: "+MethodsOrderFlowNegative.varStockAfterMarkPacked+" But Actual Stock value After Create Shipment is: "+MethodsOrderFlowNegative.varStockAfterCreateShipment+". InCorrect");
		}

		if(MethodsOrderFlowNegative.varIntransientStockAfterCreateShipment == MethodsOrderFlowNegative.varIntransientStockAfterMarkPacked){
		    test.log(Status.PASS, "Expected Intransient Stock value (Intransient Stock value After Create Shipment = Intransient Stock value After Mark Packed) After Create Shipment is: "+MethodsOrderFlowNegative.varIntransientStockAfterMarkPacked+" And Actual Intransient Stock value After Create Shipment is: "+MethodsOrderFlowNegative.varIntransientStockAfterCreateShipment+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Intransient Stock value (Intransient Stock value After Create Shipment = Intransient Stock value After Mark Packed) After Create Shipment is: "+MethodsOrderFlowNegative.varIntransientStockAfterMarkPacked+" But Actual Intransient Stock value After Create Shipment is: "+MethodsOrderFlowNegative.varIntransientStockAfterCreateShipment+". InCorrect");
		    softAssert.fail("Expected Intransient Stock value (Intransient Stock value After Create Shipment = Intransient Stock value After Mark Packed) After Create Shipment is: "+MethodsOrderFlowNegative.varIntransientStockAfterMarkPacked+" But Actual Intransient Stock value After Create Shipment is: "+MethodsOrderFlowNegative.varIntransientStockAfterCreateShipment+". InCorrect");
		}

		if(MethodsOrderFlowNegative.varAvailableStockAfterCreateShipment == MethodsOrderFlowNegative.varAvailableStockAfterMarkPacked){
		    test.log(Status.PASS, "Expected Available Stock value (Available Stock value After Create Shipment = Available Stock value After Mark Packed) After Create Shipment is: "+MethodsOrderFlowNegative.varAvailableStockAfterMarkPacked+" And Actual Available Stock value After Create Shipment is: "+MethodsOrderFlowNegative.varAvailableStockAfterCreateShipment+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Available Stock value (Available Stock value After Create Shipment = Available Stock value After Mark Packed) After Create Shipment is: "+MethodsOrderFlowNegative.varAvailableStockAfterMarkPacked+" But Actual Available Stock value After Create Shipment is: "+MethodsOrderFlowNegative.varAvailableStockAfterCreateShipment+". InCorrect");
		    softAssert.fail("Expected Available Stock value (Available Stock value After Create Shipment = Available Stock value After Mark Packed) After Create Shipment is: "+MethodsOrderFlowNegative.varAvailableStockAfterMarkPacked+" But Actual Available Stock value After Create Shipment is: "+MethodsOrderFlowNegative.varAvailableStockAfterCreateShipment+". InCorrect");
		}
	}

	
	
	@Test(dependsOnMethods = "testOrderFlowNegativeInventoryDetailsAfterCreateShipment",groups = {"OrderFlowNegative"})
	public void testOrderFlowNegativeDispatch(){
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderFlowNegative.methodOrderFlowNegativeDispatch();
	    
		TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    TestHelper.validateStatus(test, response, "Dispatched");
	    TestHelper.validateId(test, response);
	}
	
	
	
	@Test(dependsOnMethods = "testOrderFlowNegativeDispatch",groups = {"OrderFlowNegative"})
	public void testOrderFlowNegativeInventoryDetailsAfterDispatch(){
		SoftAssert softAssert = new SoftAssert();
		
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderFlowNegative.methodOrderFlowNegativeInventoryDetailsDispatch();
	    
		TestHelper.logDetails(test, response);
		TestHelper.validateStatusCode(test, response, 200);
		
		if(MethodsOrderFlowNegative.varPendingStockAfterDispatch == (MethodsOrderFlowNegative.varPendingStockAfterCreateShipment - MethodsOrderFlowNegative.varOrderedQuantity)){
		    test.log(Status.PASS, "Pending Stock value After Create Shipment is: "+MethodsOrderFlowNegative.varPendingStockAfterCreateShipment+", Ordered Quantity is: "+MethodsOrderFlowNegative.varOrderedQuantity+ ", Expected Pending Stock value (Pending Stock value After Create Shipment - Ordered Quantity) After Dispatch is: "+(MethodsOrderFlowNegative.varPendingStockAfterCreateShipment - MethodsOrderFlowNegative.varOrderedQuantity)+ ", And Actual Pending Stock value After Dispatch is: "+MethodsOrderFlowNegative.varPendingStockAfterDispatch+". Correct");
		} else {
		    test.log(Status.FAIL, "Pending Stock value After Create Shipment is: "+MethodsOrderFlowNegative.varPendingStockAfterCreateShipment+", Ordered Quantity is: "+MethodsOrderFlowNegative.varOrderedQuantity+ ", Expected Pending Stock value (Pending Stock value After Create Shipment - Ordered Quantity) After Dispatch is: "+(MethodsOrderFlowNegative.varPendingStockAfterCreateShipment - MethodsOrderFlowNegative.varOrderedQuantity)+ ", But Actual Pending Stock value After Dispatch is: "+MethodsOrderFlowNegative.varPendingStockAfterDispatch+". Incorrect");
		    softAssert.fail("Pending Stock value After Create Shipment is: "+MethodsOrderFlowNegative.varPendingStockAfterCreateShipment+", Ordered Quantity is: "+MethodsOrderFlowNegative.varOrderedQuantity+ ", Expected Pending Stock value (Pending Stock value After Create Shipment - Ordered Quantity) After Dispatch is: "+(MethodsOrderFlowNegative.varPendingStockAfterCreateShipment - MethodsOrderFlowNegative.varOrderedQuantity)+ ", But Actual Pending Stock value After Dispatch is: "+MethodsOrderFlowNegative.varPendingStockAfterDispatch+". Incorrect");
		}
		
		if(MethodsOrderFlowNegative.varIntransientStockAfterDispatch == (MethodsOrderFlowNegative.varIntransientStockAfterCreateShipment + MethodsOrderFlowNegative.varOrderedQuantity)){
		    test.log(Status.PASS, "Intransient Stock value After Create Shipment is: "+MethodsOrderFlowNegative.varIntransientStockAfterCreateShipment+", Ordered Quantity is: "+MethodsOrderFlowNegative.varOrderedQuantity+ ", Expected Intransient Stock value (Intransient Stock value After Create Shipment + Ordered Quantity) After Dispatch is: "+(MethodsOrderFlowNegative.varIntransientStockAfterCreateShipment + MethodsOrderFlowNegative.varOrderedQuantity)+ ", And Actual Intransient Stock value After Dispatch is: "+MethodsOrderFlowNegative.varIntransientStockAfterDispatch+". Correct");
		} else {
		    test.log(Status.FAIL, "Intransient Stock value After Create Shipment is: "+MethodsOrderFlowNegative.varIntransientStockAfterCreateShipment+", Ordered Quantity is: "+MethodsOrderFlowNegative.varOrderedQuantity+ ", Expected Intransient Stock value (Intransient Stock value After Create Shipment + Ordered Quantity) After Dispatch is: "+(MethodsOrderFlowNegative.varIntransientStockAfterCreateShipment + MethodsOrderFlowNegative.varOrderedQuantity)+ ", But Actual Intransient Stock value After Dispatch is: "+MethodsOrderFlowNegative.varIntransientStockAfterDispatch+". Incorrect");
		    softAssert.fail("Intransient Stock value After Create Shipment is: "+MethodsOrderFlowNegative.varIntransientStockAfterCreateShipment+", Ordered Quantity is: "+MethodsOrderFlowNegative.varOrderedQuantity+ ", Expected Intransient Stock value (Intransient Stock value After Create Shipment + Ordered Quantity) After Dispatch is: "+(MethodsOrderFlowNegative.varIntransientStockAfterCreateShipment + MethodsOrderFlowNegative.varOrderedQuantity)+ ", But Actual Intransient Stock value After Dispatch is: "+MethodsOrderFlowNegative.varIntransientStockAfterDispatch+". Incorrect");
		}
		
		if(MethodsOrderFlowNegative.varAvailableStockAfterDispatch == (MethodsOrderFlowNegative.varAvailableStockAfterCreateShipment - MethodsOrderFlowNegative.varOrderedQuantity)){
		    test.log(Status.PASS, "Available Stock value After Create Shipment is: "+MethodsOrderFlowNegative.varAvailableStockAfterCreateShipment+", Ordered Quantity is: "+MethodsOrderFlowNegative.varOrderedQuantity+ ", Expected Available Stock value (Available Stock value After Create Shipment - Ordered Quantity) After Dispatch is: "+(MethodsOrderFlowNegative.varAvailableStockAfterCreateShipment - MethodsOrderFlowNegative.varOrderedQuantity)+ ", And Actual Available Stock value After Dispatch is: "+MethodsOrderFlowNegative.varAvailableStockAfterDispatch+". Correct");
		} else {
		    test.log(Status.FAIL, "Available Stock value After Create Shipment is: "+MethodsOrderFlowNegative.varAvailableStockAfterCreateShipment+", Ordered Quantity is: "+MethodsOrderFlowNegative.varOrderedQuantity+ ", Expected Available Stock value (Available Stock value After Create Shipment - Ordered Quantity) After Dispatch is: "+(MethodsOrderFlowNegative.varAvailableStockAfterCreateShipment - MethodsOrderFlowNegative.varOrderedQuantity)+ ", But Actual Available Stock value After Dispatch is: "+MethodsOrderFlowNegative.varAvailableStockAfterDispatch+". Incorrect");
		    softAssert.fail("Available Stock value After Create Shipment is: "+MethodsOrderFlowNegative.varAvailableStockAfterCreateShipment+", Ordered Quantity is: "+MethodsOrderFlowNegative.varOrderedQuantity+ ", Expected Available Stock value (Available Stock value After Create Shipment - Ordered Quantity) After Dispatch is: "+(MethodsOrderFlowNegative.varAvailableStockAfterCreateShipment - MethodsOrderFlowNegative.varOrderedQuantity)+ ", But Actual Available Stock value After Dispatch is: "+MethodsOrderFlowNegative.varAvailableStockAfterDispatch+". Incorrect");
		}
		
		if(MethodsOrderFlowNegative.varUsedQuantityAfterDispatch == MethodsOrderFlowNegative.varUsedQuantityAfterCreateShipment){
		    test.log(Status.PASS, "Expected Used Quantity value (Used Quantity value After Dispatch = Used Quantity value After Create Shipment) After Dispatch is: "+MethodsOrderFlowNegative.varUsedQuantityAfterCreateShipment+" And Actual Used Quantity value After Create Shipment is: "+MethodsOrderFlowNegative.varUsedQuantityAfterDispatch+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Used Quantity value (Used Quantity value After Dispatch = Used Quantity value After Create Shipment) After Dispatch is: "+MethodsOrderFlowNegative.varUsedQuantityAfterCreateShipment+" But Actual Used Quantity value After Dispatch is: "+MethodsOrderFlowNegative.varUsedQuantityAfterDispatch+". InCorrect");
		    softAssert.fail("Expected Used Quantity value (Used Quantity value After Dispatch = Used Quantity value After Create Shipment) After Dispatch is: "+MethodsOrderFlowNegative.varUsedQuantityAfterCreateShipment+" But Actual Used Quantity value After Dispatch is: "+MethodsOrderFlowNegative.varUsedQuantityAfterDispatch+". InCorrect");
		}

		if(MethodsOrderFlowNegative.varAvailableQuantityAfterDispatch == MethodsOrderFlowNegative.varAvailableQuantityAfterCreateShipment){
		    test.log(Status.PASS, "Expected Available Quantity value (Available Quantity value After Dispatch = Available Quantity value After Create Shipment) After Dispatch is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterCreateShipment+" And Actual Available Quantity value After Dispatch is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterDispatch+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Available Quantity value (Available Quantity value After Dispatch = Available Quantity value After Create Shipment) After Dispatch is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterCreateShipment+" But Actual Available Quantity value After Dispatch is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterDispatch+". InCorrect");
		    softAssert.fail("Expected Available Quantity value (Available Quantity value After Dispatch = Available Quantity value After Create Shipment) After Dispatch is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterCreateShipment+" But Actual Available Quantity value After Dispatch is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterDispatch+". InCorrect");
		}

		if(MethodsOrderFlowNegative.varTotalDemandAfterDispatch == MethodsOrderFlowNegative.varTotalDemandAfterCreateShipment){
		    test.log(Status.PASS, "Expected Total Demand value (Total Demand value After Dispatch = Total Demand value After Create Shipment) After Dispatch is: "+MethodsOrderFlowNegative.varTotalDemandAfterCreateShipment+" And Actual Total Demand value After Dispatch is: "+MethodsOrderFlowNegative.varTotalDemandAfterDispatch+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Total Demand value (Total Demand value After Dispatch = Total Demand value After Create Shipment) After Dispatch is: "+MethodsOrderFlowNegative.varTotalDemandAfterCreateShipment+" But Actual Total Demand value After Dispatch is: "+MethodsOrderFlowNegative.varTotalDemandAfterDispatch+". InCorrect");
		    softAssert.fail("Expected Total Demand value (Total Demand value After Dispatch = Total Demand value After Create Shipment) After Dispatch is: "+MethodsOrderFlowNegative.varTotalDemandAfterCreateShipment+" But Actual Total Demand value After Dispatch is: "+MethodsOrderFlowNegative.varTotalDemandAfterDispatch+". InCorrect");
		}

		if(MethodsOrderFlowNegative.varStockAfterDispatch == MethodsOrderFlowNegative.varStockAfterCreateShipment){
		    test.log(Status.PASS, "Expected Stock value (Stock value After Dispatch = Stock value After Create Shipment) After Dispatch is: "+MethodsOrderFlowNegative.varStockAfterCreateShipment+" And Actual Stock value After Dispatch is: "+MethodsOrderFlowNegative.varStockAfterDispatch+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Stock value (Stock value After Dispatch = Stock value After Create Shipment) After Dispatch is: "+MethodsOrderFlowNegative.varStockAfterCreateShipment+" But Actual Stock value After Dispatch is: "+MethodsOrderFlowNegative.varStockAfterDispatch+". InCorrect");
		    softAssert.fail("Expected Stock value (Stock value After Dispatch = Stock value After Create Shipment) After Dispatch is: "+MethodsOrderFlowNegative.varStockAfterCreateShipment+" But Actual Stock value After Dispatch is: "+MethodsOrderFlowNegative.varStockAfterDispatch+". InCorrect");
		}
	}
	

	
	@Test(dependsOnMethods = "testOrderFlowNegativeInventoryDetailsAfterDispatch", groups = {"OrderFlowNegative"})
	public void testOrderFlowNegativeMarkShipped() {
	    ExtentTest test = ExtentReportManager.getTest();
	    Response response = MethodsOrderFlowNegative.methodOrderFlowNegativeMarkShipped();
	    
	    TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    TestHelper.validateStatus(test, response, "SHIPPED");
	    TestHelper.validateId(test, response);
	}
	
	

	@Test(dependsOnMethods = "testOrderFlowNegativeMarkShipped", groups = {"OrderFlowNegative"})
	public void testOrderFlowNegativeInventoryDetailsAfterMarkShipped() {
	    SoftAssert softAssert = new SoftAssert();
	    
	    ExtentTest test = ExtentReportManager.getTest();
	    Response response = MethodsOrderFlowNegative.methodOrderFlowNegativeInventoryDetailsAfterMarkShipped();
	    
	    TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    
	    if (MethodsOrderFlowNegative.varPendingStockAfterMarkShipped == MethodsOrderFlowNegative.varPendingStockAfterDispatch) {
	        test.log(Status.PASS, "Expected Pending Stock value (Pending Stock value After Mark Shipped = Pending Stock value After Dispatch) After Mark Shipped is: " + MethodsOrderFlowNegative.varPendingStockAfterDispatch + " And Actual Pending Stock value After Dispatch is: " + MethodsOrderFlowNegative.varPendingStockAfterMarkShipped + ". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Pending Stock value (Pending Stock value After Mark Shipped = Pending Stock value After Dispatch) After Mark Shipped is: " + MethodsOrderFlowNegative.varPendingStockAfterDispatch + " But Actual Pending Stock value After Mark Shipped is: " + MethodsOrderFlowNegative.varPendingStockAfterMarkShipped + ". InCorrect");
	        softAssert.fail("Expected Pending Stock value (Pending Stock value After Mark Shipped = Pending Stock value After Dispatch) After Mark Shipped is: " + MethodsOrderFlowNegative.varPendingStockAfterDispatch + " But Actual Pending Stock value After Mark Shipped is: " + MethodsOrderFlowNegative.varPendingStockAfterMarkShipped + ". InCorrect");
	    }

	    if (MethodsOrderFlowNegative.varIntransientStockAfterMarkShipped == MethodsOrderFlowNegative.varIntransientStockAfterDispatch) {
	        test.log(Status.PASS, "Expected Intransient Stock value (Intransient Stock value After Mark Shipped = Intransient Stock value After Dispatch) After Mark Shipped is: " + MethodsOrderFlowNegative.varIntransientStockAfterDispatch + " And Actual Intransient Stock value After Dispatch is: " + MethodsOrderFlowNegative.varIntransientStockAfterMarkShipped + ". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Intransient Stock value (Intransient Stock value After Mark Shipped = Intransient Stock value After Dispatch) After Mark Shipped is: " + MethodsOrderFlowNegative.varIntransientStockAfterDispatch + " But Actual Intransient Stock value After Mark Shipped is: " + MethodsOrderFlowNegative.varIntransientStockAfterMarkShipped + ". InCorrect");
	        softAssert.fail("Expected Intransient Stock value (Intransient Stock value After Mark Shipped = Intransient Stock value After Dispatch) After Mark Shipped is: " + MethodsOrderFlowNegative.varIntransientStockAfterDispatch + " But Actual Intransient Stock value After Mark Shipped is: " + MethodsOrderFlowNegative.varIntransientStockAfterMarkShipped + ". InCorrect");
	    }

	    if (MethodsOrderFlowNegative.varAvailableStockAfterMarkShipped == MethodsOrderFlowNegative.varAvailableStockAfterDispatch) {
	        test.log(Status.PASS, "Expected Available Stock value (Available Stock value After Mark Shipped = Available Stock value After Dispatch) After Mark Shipped is: " + MethodsOrderFlowNegative.varAvailableStockAfterDispatch + " And Actual Available Stock value After Dispatch is: " + MethodsOrderFlowNegative.varAvailableStockAfterMarkShipped + ". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Available Stock value (Available Stock value After Mark Shipped = Available Stock value After Dispatch) After Mark Shipped is: " + MethodsOrderFlowNegative.varAvailableStockAfterDispatch + " But Actual Available Stock value After Mark Shipped is: " + MethodsOrderFlowNegative.varAvailableStockAfterMarkShipped + ". InCorrect");
	        softAssert.fail("Expected Available Stock value (Available Stock value After Mark Shipped = Available Stock value After Dispatch) After Mark Shipped is: " + MethodsOrderFlowNegative.varAvailableStockAfterDispatch + " But Actual Available Stock value After Mark Shipped is: " + MethodsOrderFlowNegative.varAvailableStockAfterMarkShipped + ". InCorrect");
	    }

	    if (MethodsOrderFlowNegative.varUsedQuantityAfterMarkShipped == MethodsOrderFlowNegative.varUsedQuantityAfterDispatch) {
	        test.log(Status.PASS, "Expected Used Quantity value (Used Quantity value After Mark Shipped = Used Quantity value After Dispatch) After Mark Shipped is: " + MethodsOrderFlowNegative.varUsedQuantityAfterDispatch + " And Actual Used Quantity value After Dispatch is: " + MethodsOrderFlowNegative.varUsedQuantityAfterMarkShipped + ". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Used Quantity value (Used Quantity value After Mark Shipped = Used Quantity value After Dispatch) After Mark Shipped is: " + MethodsOrderFlowNegative.varUsedQuantityAfterDispatch + " But Actual Used Quantity value After Mark Shipped is: " + MethodsOrderFlowNegative.varUsedQuantityAfterMarkShipped + ". InCorrect");
	        softAssert.fail("Expected Used Quantity value (Used Quantity value After Mark Shipped = Used Quantity value After Dispatch) After Mark Shipped is: " + MethodsOrderFlowNegative.varUsedQuantityAfterDispatch + " But Actual Used Quantity value After Mark Shipped is: " + MethodsOrderFlowNegative.varUsedQuantityAfterMarkShipped + ". InCorrect");
	    }

	    if (MethodsOrderFlowNegative.varAvailableQuantityAfterMarkShipped == MethodsOrderFlowNegative.varAvailableQuantityAfterDispatch) {
	        test.log(Status.PASS, "Expected Available Quantity value (Available Quantity value After Mark Shipped = Available Quantity value After Dispatch) After Mark Shipped is: " + MethodsOrderFlowNegative.varAvailableQuantityAfterDispatch + " And Actual Available Quantity value After Dispatch is: " + MethodsOrderFlowNegative.varAvailableQuantityAfterMarkShipped + ". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Available Quantity value (Available Quantity value After Mark Shipped = Available Quantity value After Dispatch) After Mark Shipped is: " + MethodsOrderFlowNegative.varAvailableQuantityAfterDispatch + " But Actual Available Quantity value After Mark Shipped is: " + MethodsOrderFlowNegative.varAvailableQuantityAfterMarkShipped + ". InCorrect");
	        softAssert.fail("Expected Available Quantity value (Available Quantity value After Mark Shipped = Available Quantity value After Dispatch) After Mark Shipped is: " + MethodsOrderFlowNegative.varAvailableQuantityAfterDispatch + " But Actual Available Quantity value After Mark Shipped is: " + MethodsOrderFlowNegative.varAvailableQuantityAfterMarkShipped + ". InCorrect");
	    }

	    if (MethodsOrderFlowNegative.varTotalDemandAfterMarkShipped == MethodsOrderFlowNegative.varTotalDemandAfterDispatch) {
	        test.log(Status.PASS, "Expected Total Demand value (Total Demand value After Mark Shipped = Total Demand value After Dispatch) After Mark Shipped is: " + MethodsOrderFlowNegative.varTotalDemandAfterDispatch + " And Actual Total Demand value After Dispatch is: " + MethodsOrderFlowNegative.varTotalDemandAfterMarkShipped + ". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Total Demand value (Total Demand value After Mark Shipped = Total Demand value After Dispatch) After Mark Shipped is: " + MethodsOrderFlowNegative.varTotalDemandAfterDispatch + " But Actual Total Demand value After Mark Shipped is: " + MethodsOrderFlowNegative.varTotalDemandAfterMarkShipped + ". InCorrect");
	        softAssert.fail("Expected Total Demand value (Total Demand value After Mark Shipped = Total Demand value After Dispatch) After Mark Shipped is: " + MethodsOrderFlowNegative.varTotalDemandAfterDispatch + " But Actual Total Demand value After Mark Shipped is: " + MethodsOrderFlowNegative.varTotalDemandAfterMarkShipped + ". InCorrect");
	    }

	    if (MethodsOrderFlowNegative.varStockAfterMarkShipped == MethodsOrderFlowNegative.varStockAfterDispatch) {
	        test.log(Status.PASS, "Expected Stock value (Stock value After Mark Shipped = Stock value After Dispatch) After Mark Shipped is: " + MethodsOrderFlowNegative.varStockAfterDispatch + " And Actual Stock value After Dispatch is: " + MethodsOrderFlowNegative.varStockAfterMarkShipped + ". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Stock value (Stock value After Mark Shipped = Stock value After Dispatch) After Mark Shipped is: " + MethodsOrderFlowNegative.varStockAfterDispatch + " But Actual Stock value After Mark Shipped is: " + MethodsOrderFlowNegative.varStockAfterMarkShipped + ". InCorrect");
	        softAssert.fail("Expected Stock value (Stock value After Mark Shipped = Stock value After Dispatch) After Mark Shipped is: " + MethodsOrderFlowNegative.varStockAfterDispatch + " But Actual Stock value After Mark Shipped is: " + MethodsOrderFlowNegative.varStockAfterMarkShipped + ". InCorrect");
	    }

	    softAssert.assertAll();
	}
	
	

	@Test(dependsOnMethods = "testOrderFlowNegativeInventoryDetailsAfterMarkShipped", groups = {"OrderFlowNegative"})
	public void testOrderFlowNegativeInvoiceNumber() {
	    ExtentTest test = ExtentReportManager.getTest();
	    Response response = MethodsOrderFlowNegative.methodOrderFlowNegativeInvoiceNumber();
	    
	    TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    TestHelper.validateStatus(test, response, "SHIPPED");
	    TestHelper.validateId(test, response);
	    
	    String invoiceNumber = response.jsonPath().getString("payload.extInvoiceId");
	    if (invoiceNumber == null) {
	        test.log(Status.FAIL, "Invoice Number should not be Null but found Null");
	        Assert.fail("Test failed due to Invoice Number is: Null");
	    } else {
	        test.log(Status.PASS, "Passed because Invoice Number is not: Null");
	    }
	}

	
	
	@Test(dependsOnMethods = "testOrderFlowNegativeInvoiceNumber", groups = {"OrderFlowNegative"})
	public void testOrderFlowNegativeInventoryDetailsAfterInvoiceNumber() {
	    SoftAssert softAssert = new SoftAssert();
	    
	    ExtentTest test = ExtentReportManager.getTest();
	    Response response = MethodsOrderFlowNegative.methodOrderFlowNegativeInventoryDetailsAfterInvoiceNumber();
	    
	    TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    
	    if (MethodsOrderFlowNegative.varUsedQuantityAfterInvoiceNumber == MethodsOrderFlowNegative.varUsedQuantityAfterMarkShipped) { 
	        test.log(Status.PASS, "Expected Used Quantity value (Used Quantity value After Invoice Number = Used Quantity value After Mark Shipped) After Invoice Number is: " + MethodsOrderFlowNegative.varUsedQuantityAfterMarkShipped + " And Actual Used Quantity value After Mark Shipped is: " + MethodsOrderFlowNegative.varUsedQuantityAfterInvoiceNumber + ". Correct"); 
	    } else { 
	        test.log(Status.FAIL, "Expected Used Quantity value (Used Quantity value After Invoice Number = Used Quantity value After Mark Shipped) After Invoice Number is: " + MethodsOrderFlowNegative.varUsedQuantityAfterMarkShipped + " But Actual Used Quantity value After Mark Shipped is: " + MethodsOrderFlowNegative.varUsedQuantityAfterInvoiceNumber + ". InCorrect"); 
	        softAssert.fail("Expected Used Quantity value (Used Quantity value After Invoice Number = Used Quantity value After Mark Shipped) After Invoice Number is: " + MethodsOrderFlowNegative.varUsedQuantityAfterMarkShipped + " But Actual Used Quantity value After Mark Shipped is: " + MethodsOrderFlowNegative.varUsedQuantityAfterInvoiceNumber + ". InCorrect"); 
	    } 

	    if (MethodsOrderFlowNegative.varAvailableQuantityAfterInvoiceNumber == MethodsOrderFlowNegative.varAvailableQuantityAfterMarkShipped) { 
	        test.log(Status.PASS, "Expected Available Quantity value (Available Quantity value After Invoice Number = Available Quantity value After Mark Shipped) After Invoice Number is: " + MethodsOrderFlowNegative.varAvailableQuantityAfterMarkShipped + " And Actual Available Quantity value After Mark Shipped is: " + MethodsOrderFlowNegative.varAvailableQuantityAfterInvoiceNumber + ". Correct"); 
	    } else { 
	        test.log(Status.FAIL, "Expected Available Quantity value (Available Quantity value After Invoice Number = Available Quantity value After Mark Shipped) After Invoice Number is: " + MethodsOrderFlowNegative.varAvailableQuantityAfterMarkShipped + " But Actual Available Quantity value After Mark Shipped is: " + MethodsOrderFlowNegative.varAvailableQuantityAfterInvoiceNumber + ". InCorrect"); 
	        softAssert.fail("Expected Available Quantity value (Available Quantity value After Invoice Number = Available Quantity value After Mark Shipped) After Invoice Number is: " + MethodsOrderFlowNegative.varAvailableQuantityAfterMarkShipped + " But Actual Available Quantity value After Mark Shipped is: " + MethodsOrderFlowNegative.varAvailableQuantityAfterInvoiceNumber + ". InCorrect"); 
	    } 

	    if (MethodsOrderFlowNegative.varPendingStockAfterInvoiceNumber == MethodsOrderFlowNegative.varPendingStockAfterMarkShipped) { 
	        test.log(Status.PASS, "Expected Pending Stock value (Pending Stock value After Invoice Number = Pending Stock value After Mark Shipped) After Invoice Number is: " + MethodsOrderFlowNegative.varPendingStockAfterMarkShipped + " And Actual Pending Stock value After Mark Shipped is: " + MethodsOrderFlowNegative.varPendingStockAfterInvoiceNumber + ". Correct"); 
	    } else { 
	        test.log(Status.FAIL, "Expected Pending Stock value (Pending Stock value After Invoice Number = Pending Stock value After Mark Shipped) After Invoice Number is: " + MethodsOrderFlowNegative.varPendingStockAfterMarkShipped + " But Actual Pending Stock value After Mark Shipped is: " + MethodsOrderFlowNegative.varPendingStockAfterInvoiceNumber + ". InCorrect"); 
	        softAssert.fail("Expected Pending Stock value (Pending Stock value After Invoice Number = Pending Stock value After Mark Shipped) After Invoice Number is: " + MethodsOrderFlowNegative.varPendingStockAfterMarkShipped + " But Actual Pending Stock value After Mark Shipped is: " + MethodsOrderFlowNegative.varPendingStockAfterInvoiceNumber + ". InCorrect"); 
	    } 

	    if (MethodsOrderFlowNegative.varTotalDemandAfterInvoiceNumber == MethodsOrderFlowNegative.varTotalDemandAfterMarkShipped) { 
	        test.log(Status.PASS, "Expected Total Demand value (Total Demand value After Invoice Number = Total Demand value After Mark Shipped) After Invoice Number is: " + MethodsOrderFlowNegative.varTotalDemandAfterMarkShipped + " And Actual Total Demand value After Mark Shipped is: " + MethodsOrderFlowNegative.varTotalDemandAfterInvoiceNumber + ". Correct"); 
	    } else { 
	        test.log(Status.FAIL, "Expected Total Demand value (Total Demand value After Invoice Number = Total Demand value After Mark Shipped) After Invoice Number is: " + MethodsOrderFlowNegative.varTotalDemandAfterMarkShipped + " But Actual Total Demand value After Mark Shipped is: " + MethodsOrderFlowNegative.varTotalDemandAfterInvoiceNumber + ". InCorrect"); 
	        softAssert.fail("Expected Total Demand value (Total Demand value After Invoice Number = Total Demand value After Mark Shipped) After Invoice Number is: " + MethodsOrderFlowNegative.varTotalDemandAfterMarkShipped + " But Actual Total Demand value After Mark Shipped is: " + MethodsOrderFlowNegative.varTotalDemandAfterInvoiceNumber + ". InCorrect"); 
	    } 

	    if (MethodsOrderFlowNegative.varStockAfterInvoiceNumber == MethodsOrderFlowNegative.varStockAfterMarkShipped) { 
	        test.log(Status.PASS, "Expected Stock value (Stock value After Invoice Number = Stock value After Mark Shipped) After Invoice Number is: " + MethodsOrderFlowNegative.varStockAfterMarkShipped + " And Actual Stock value After Mark Shipped is: " + MethodsOrderFlowNegative.varStockAfterInvoiceNumber + ". Correct"); 
	    } else { 
	        test.log(Status.FAIL, "Expected Stock value (Stock value After Invoice Number = Stock value After Mark Shipped) After Invoice Number is: " + MethodsOrderFlowNegative.varStockAfterMarkShipped + " But Actual Stock value After Mark Shipped is: " + MethodsOrderFlowNegative.varStockAfterInvoiceNumber + ". InCorrect"); 
	        softAssert.fail("Expected Stock value (Stock value After Invoice Number = Stock value After Mark Shipped) After Invoice Number is: " + MethodsOrderFlowNegative.varStockAfterMarkShipped + " But Actual Stock value After Mark Shipped is: " + MethodsOrderFlowNegative.varStockAfterInvoiceNumber + ". InCorrect"); 
	    } 

	    softAssert.assertAll();
	}

	

	@Test(dependsOnMethods = "testOrderFlowNegativeInventoryDetailsAfterInvoiceNumber",groups = {"OrderFlowNegative"})
	public void testOrderFlowNegativeDeliver(){
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderFlowNegative.methodOrderFlowNegativeDeliver();
	    
		TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    TestHelper.validateStatus(test, response, "QC_PENDING");
	    TestHelper.validateId(test, response);
	}
	
	
	
	@Test(dependsOnMethods = "testOrderFlowNegativeDeliver",groups = {"OrderFlowNegative"})
	public void testOrderFlowNegativeInventoryDetailsAfterDeliver(){
		SoftAssert softAssert = new SoftAssert();
		
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderFlowNegative.methodOrderFlowNegativeInventoryDetailsDeliver();
	    
		TestHelper.logDetails(test, response);
		TestHelper.validateStatusCode(test, response, 200);
		
		if(MethodsOrderFlowNegative.varUsedQuantityAfterDeliver == MethodsOrderFlowNegative.varUsedQuantityAfterDispatch){
		    test.log(Status.PASS, "Expected Used Quantity value (Used Quantity value After Deliver = Used Quantity value After Dispatch) After Deliver is: "+MethodsOrderFlowNegative.varUsedQuantityAfterDispatch+" And Actual Used Quantity value After Dispatch is: "+MethodsOrderFlowNegative.varUsedQuantityAfterDeliver+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Used Quantity value (Used Quantity value After Deliver = Used Quantity value After Dispatch) After Deliver is: "+MethodsOrderFlowNegative.varUsedQuantityAfterDispatch+" But Actual Used Quantity value After Dispatch is: "+MethodsOrderFlowNegative.varUsedQuantityAfterDeliver+". InCorrect");
		    softAssert.fail("Expected Used Quantity value (Used Quantity value After Deliver = Used Quantity value After Dispatch) After Deliver is: "+MethodsOrderFlowNegative.varUsedQuantityAfterDispatch+" But Actual Used Quantity value After Dispatch is: "+MethodsOrderFlowNegative.varUsedQuantityAfterDeliver+". InCorrect");
		}

		if(MethodsOrderFlowNegative.varAvailableQuantityAfterDeliver == MethodsOrderFlowNegative.varAvailableQuantityAfterDispatch){
		    test.log(Status.PASS, "Expected Available Quantity value (Available Quantity value After Deliver = Available Quantity value After Dispatch) After Deliver is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterDispatch+" And Actual Available Quantity value After Deliver is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterDispatch+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Available Quantity value (Available Quantity value After Deliver = Available Quantity value After Dispatch) After Deliver is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterDispatch+" But Actual Available Quantity value After Deliver is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterDispatch+". InCorrect");
		    softAssert.fail("Expected Available Quantity value (Available Quantity value After Deliver = Available Quantity value After Dispatch) After Deliver is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterDispatch+" But Actual Available Quantity value After Deliver is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterDispatch+". InCorrect");
		}

		if(MethodsOrderFlowNegative.varPendingStockAfterDeliver == MethodsOrderFlowNegative.varPendingStockAfterDispatch){
		    test.log(Status.PASS, "Expected Pending Stock value (Pending Stock value After Deliver = Pending Stock value After Dispatch) After Deliver is: "+MethodsOrderFlowNegative.varPendingStockAfterDispatch+" And Actual Pending Stock value After Deliver is: "+MethodsOrderFlowNegative.varPendingStockAfterDeliver+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Pending Stock value (Pending Stock value After Deliver = Pending Stock value After Dispatch) After Deliver is: "+MethodsOrderFlowNegative.varPendingStockAfterDispatch+" But Actual Pending Stock value After Deliver is: "+MethodsOrderFlowNegative.varPendingStockAfterDeliver+". InCorrect");
		    softAssert.fail("Expected Pending Stock value (Pending Stock value After Deliver = Pending Stock value After Dispatch) After Deliver is: "+MethodsOrderFlowNegative.varPendingStockAfterDispatch+" But Actual Pending Stock value After Deliver is: "+MethodsOrderFlowNegative.varPendingStockAfterDeliver+". InCorrect");
		}

		if(MethodsOrderFlowNegative.varTotalDemandAfterDeliver == MethodsOrderFlowNegative.varTotalDemandAfterDispatch){
		    test.log(Status.PASS, "Expected Total Demand value (Total Demand value After Deliver = Total Demand value After Dispatch) After Deliver is: "+MethodsOrderFlowNegative.varTotalDemandAfterDispatch+" And Actual Total Demand value After Deliver is: "+MethodsOrderFlowNegative.varTotalDemandAfterDeliver+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Total Demand value (Total Demand value After Deliver = Total Demand value After Dispatch) After Deliver is: "+MethodsOrderFlowNegative.varTotalDemandAfterDispatch+" But Actual Total Demand value After Deliver is: "+MethodsOrderFlowNegative.varTotalDemandAfterDeliver+". InCorrect");
		    softAssert.fail("Expected Total Demand value (Total Demand value After Deliver = Total Demand value After Dispatch) After Deliver is: "+MethodsOrderFlowNegative.varTotalDemandAfterDispatch+" But Actual Total Demand value After Deliver is: "+MethodsOrderFlowNegative.varTotalDemandAfterDeliver+". InCorrect");
		}

		if(MethodsOrderFlowNegative.varStockAfterDeliver == MethodsOrderFlowNegative.varStockAfterDispatch){
		    test.log(Status.PASS, "Expected Stock value (Stock value After Deliver = Stock value After Dispatch) After Deliver is: "+MethodsOrderFlowNegative.varStockAfterDispatch+" And Actual Stock value After Deliver is: "+MethodsOrderFlowNegative.varStockAfterDeliver+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Stock value (Stock value After Deliver = Stock value After Dispatch) After Deliver is: "+MethodsOrderFlowNegative.varStockAfterDispatch+" But Actual Stock value After Deliver is: "+MethodsOrderFlowNegative.varStockAfterDeliver+". InCorrect");
		    softAssert.fail("Expected Stock value (Stock value After Deliver = Stock value After Dispatch) After Deliver is: "+MethodsOrderFlowNegative.varStockAfterDispatch+" But Actual Stock value After Deliver is: "+MethodsOrderFlowNegative.varStockAfterDeliver+". InCorrect");
		}

		if(MethodsOrderFlowNegative.varIntransientStockAfterDeliver == MethodsOrderFlowNegative.varIntransientStockAfterDispatch){
		    test.log(Status.PASS, "Expected Intransient Stock value (Intransient Stock value After Deliver = Intransient Stock value After Dispatch) After Deliver is: "+MethodsOrderFlowNegative.varIntransientStockAfterDispatch+" And Actual Intransient Stock value After Deliver is: "+MethodsOrderFlowNegative.varIntransientStockAfterDeliver+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Intransient Stock value (Intransient Stock value After Deliver = Intransient Stock value After Dispatch) After Deliver is: "+MethodsOrderFlowNegative.varIntransientStockAfterDispatch+" But Actual Intransient Stock value After Deliver is: "+MethodsOrderFlowNegative.varIntransientStockAfterDeliver+". InCorrect");
		    softAssert.fail("Expected Intransient Stock value (Intransient Stock value After Deliver = Intransient Stock value After Dispatch) After Deliver is: "+MethodsOrderFlowNegative.varIntransientStockAfterDispatch+" But Actual Intransient Stock value After Deliver is: "+MethodsOrderFlowNegative.varIntransientStockAfterDeliver+". InCorrect");
		}

		if(MethodsOrderFlowNegative.varAvailableStockAfterDeliver == MethodsOrderFlowNegative.varAvailableStockAfterDispatch){
		    test.log(Status.PASS, "Expected Available Stock value (Available Stock value After Deliver = Available Stock value After Dispatch) After Deliver is: "+MethodsOrderFlowNegative.varAvailableStockAfterDispatch+" And Actual Available Stock value After Deliver is: "+MethodsOrderFlowNegative.varAvailableStockAfterDeliver+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Available Stock value (Available Stock value After Deliver = Available Stock value After Dispatch) After Deliver is: "+MethodsOrderFlowNegative.varAvailableStockAfterDispatch+" But Actual Available Stock value After Deliver is: "+MethodsOrderFlowNegative.varAvailableStockAfterDeliver+". InCorrect");
		    softAssert.fail("Expected Available Stock value (Available Stock value After Deliver = Available Stock value After Dispatch) After Deliver is: "+MethodsOrderFlowNegative.varAvailableStockAfterDispatch+" But Actual Available Stock value After Deliver is: "+MethodsOrderFlowNegative.varAvailableStockAfterDeliver+". InCorrect");
		}
	}
	
	
	
	@Test(dependsOnMethods = "testOrderFlowNegativeInventoryDetailsAfterDeliver",groups = {"OrderFlowNegative"})
	public void testOrderFlowNegativeActionCompleteQC(){
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderFlowNegative.methodOrderFlowNegativeActionCompleteQC();
	    
		TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    TestHelper.validateOrderStatus(test, response, "QC_PENDING");
	    TestHelper.validateId(test, response);
	}

	
	
	@Test(dependsOnMethods = "testOrderFlowNegativeActionCompleteQC",groups = {"OrderFlowNegative"})
	public void testOrderFlowNegativeInventoryDetailsAfterActionCompleteQC(){
		SoftAssert softAssert = new SoftAssert();
		
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderFlowNegative.methodOrderFlowNegativeInventoryDetailsActionCompleteQC();
	    
		TestHelper.logDetails(test, response);
		TestHelper.validateStatusCode(test, response, 200);
		
		if(MethodsOrderFlowNegative.varUsedQuantityAfterActionCompleteQC == MethodsOrderFlowNegative.varUsedQuantityAfterDeliver){
		    test.log(Status.PASS, "Expected Used Quantity value (Used Quantity value After Action CompleteQC = Used Quantity value After Deliver) After Action CompleteQC is: "+MethodsOrderFlowNegative.varUsedQuantityAfterDeliver+" And Actual Used Quantity value After Deliver is: "+MethodsOrderFlowNegative.varUsedQuantityAfterActionCompleteQC+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Used Quantity value (Used Quantity value After Action CompleteQC = Used Quantity value After Deliver) After Action CompleteQC is: "+MethodsOrderFlowNegative.varUsedQuantityAfterDeliver+" But Actual Used Quantity value After Deliver is: "+MethodsOrderFlowNegative.varUsedQuantityAfterActionCompleteQC+". InCorrect");
		    softAssert.fail("Expected Used Quantity value (Used Quantity value After Action CompleteQC = Used Quantity value After Deliver) After Action CompleteQC is: "+MethodsOrderFlowNegative.varUsedQuantityAfterDeliver+" But Actual Used Quantity value After Deliver is: "+MethodsOrderFlowNegative.varUsedQuantityAfterActionCompleteQC+". InCorrect");
		}

		if(MethodsOrderFlowNegative.varAvailableQuantityAfterActionCompleteQC == MethodsOrderFlowNegative.varAvailableQuantityAfterDeliver){
		    test.log(Status.PASS, "Expected Available Quantity value (Available Quantity value After Action CompleteQC = Available Quantity value After Deliver) After Action CompleteQC is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterDeliver+" And Actual Available Quantity value After Action CompleteQC is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterDeliver+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Available Quantity value (Available Quantity value After Action CompleteQC = Available Quantity value After Deliver) After Action CompleteQC is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterDeliver+" But Actual Available Quantity value After Action CompleteQC is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterDeliver+". InCorrect");
		    softAssert.fail("Expected Available Quantity value (Available Quantity value After Action CompleteQC = Available Quantity value After Deliver) After Action CompleteQC is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterDeliver+" But Actual Available Quantity value After Action CompleteQC is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterDeliver+". InCorrect");
		}

		if(MethodsOrderFlowNegative.varPendingStockAfterActionCompleteQC == MethodsOrderFlowNegative.varPendingStockAfterDeliver){
		    test.log(Status.PASS, "Expected Pending Stock value (Pending Stock value After Action CompleteQC = Pending Stock value After Deliver) After Action CompleteQC is: "+MethodsOrderFlowNegative.varPendingStockAfterDeliver+" And Actual Pending Stock value After Action CompleteQC is: "+MethodsOrderFlowNegative.varPendingStockAfterActionCompleteQC+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Pending Stock value (Pending Stock value After Action CompleteQC = Pending Stock value After Deliver) After Action CompleteQC is: "+MethodsOrderFlowNegative.varPendingStockAfterDeliver+" But Actual Pending Stock value After Action CompleteQC is: "+MethodsOrderFlowNegative.varPendingStockAfterActionCompleteQC+". InCorrect");
		    softAssert.fail("Expected Pending Stock value (Pending Stock value After Action CompleteQC = Pending Stock value After Deliver) After Action CompleteQC is: "+MethodsOrderFlowNegative.varPendingStockAfterDeliver+" But Actual Pending Stock value After Action CompleteQC is: "+MethodsOrderFlowNegative.varPendingStockAfterActionCompleteQC+". InCorrect");
		}

		if(MethodsOrderFlowNegative.varTotalDemandAfterActionCompleteQC == MethodsOrderFlowNegative.varTotalDemandAfterDeliver){
		    test.log(Status.PASS, "Expected Total Demand value (Total Demand value After Action CompleteQC = Total Demand value After Deliver) After Action CompleteQC is: "+MethodsOrderFlowNegative.varTotalDemandAfterDeliver+" And Actual Total Demand value After Action CompleteQC is: "+MethodsOrderFlowNegative.varTotalDemandAfterActionCompleteQC+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Total Demand value (Total Demand value After Action CompleteQC = Total Demand value After Deliver) After Action CompleteQC is: "+MethodsOrderFlowNegative.varTotalDemandAfterDeliver+" But Actual Total Demand value After Action CompleteQC is: "+MethodsOrderFlowNegative.varTotalDemandAfterActionCompleteQC+". InCorrect");
		    softAssert.fail("Expected Total Demand value (Total Demand value After Action CompleteQC = Total Demand value After Deliver) After Action CompleteQC is: "+MethodsOrderFlowNegative.varTotalDemandAfterDeliver+" But Actual Total Demand value After Action CompleteQC is: "+MethodsOrderFlowNegative.varTotalDemandAfterActionCompleteQC+". InCorrect");
		}

		if(MethodsOrderFlowNegative.varStockAfterActionCompleteQC == MethodsOrderFlowNegative.varStockAfterDeliver){
		    test.log(Status.PASS, "Expected Stock value (Stock value After Action CompleteQC = Stock value After Deliver) After Action CompleteQC is: "+MethodsOrderFlowNegative.varStockAfterDeliver+" And Actual Stock value After Action CompleteQC is: "+MethodsOrderFlowNegative.varStockAfterActionCompleteQC+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Stock value (Stock value After Action CompleteQC = Stock value After Deliver) After Action CompleteQC is: "+MethodsOrderFlowNegative.varStockAfterDeliver+" But Actual Stock value After Action CompleteQC is: "+MethodsOrderFlowNegative.varStockAfterActionCompleteQC+". InCorrect");
		    softAssert.fail("Expected Stock value (Stock value After Action CompleteQC = Stock value After Deliver) After Action CompleteQC is: "+MethodsOrderFlowNegative.varStockAfterDeliver+" But Actual Stock value After Action CompleteQC is: "+MethodsOrderFlowNegative.varStockAfterActionCompleteQC+". InCorrect");
		}

		if(MethodsOrderFlowNegative.varIntransientStockAfterActionCompleteQC == MethodsOrderFlowNegative.varIntransientStockAfterDeliver){
		    test.log(Status.PASS, "Expected Intransient Stock value (Intransient Stock value After Action CompleteQC = Intransient Stock value After Deliver) After Action CompleteQC is: "+MethodsOrderFlowNegative.varIntransientStockAfterDeliver+" And Actual Intransient Stock value After Action CompleteQC is: "+MethodsOrderFlowNegative.varIntransientStockAfterActionCompleteQC+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Intransient Stock value (Intransient Stock value After Action CompleteQC = Intransient Stock value After Deliver) After Action CompleteQC is: "+MethodsOrderFlowNegative.varIntransientStockAfterDeliver+" But Actual Intransient Stock value After Action CompleteQC is: "+MethodsOrderFlowNegative.varIntransientStockAfterActionCompleteQC+". InCorrect");
		    softAssert.fail("Expected Intransient Stock value (Intransient Stock value After Action CompleteQC = Intransient Stock value After Deliver) After Action CompleteQC is: "+MethodsOrderFlowNegative.varIntransientStockAfterDeliver+" But Actual Intransient Stock value After Action CompleteQC is: "+MethodsOrderFlowNegative.varIntransientStockAfterActionCompleteQC+". InCorrect");
		}

		if(MethodsOrderFlowNegative.varAvailableStockAfterActionCompleteQC == MethodsOrderFlowNegative.varAvailableStockAfterDeliver){
		    test.log(Status.PASS, "Expected Available Stock value (Available Stock value After Action CompleteQC = Available Stock value After Deliver) After Action CompleteQC is: "+MethodsOrderFlowNegative.varAvailableStockAfterDeliver+" And Actual Available Stock value After Action CompleteQC is: "+MethodsOrderFlowNegative.varAvailableStockAfterActionCompleteQC+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Available Stock value (Available Stock value After Action CompleteQC = Available Stock value After Deliver) After Action CompleteQC is: "+MethodsOrderFlowNegative.varAvailableStockAfterDeliver+" But Actual Available Stock value After Action CompleteQC is: "+MethodsOrderFlowNegative.varAvailableStockAfterActionCompleteQC+". InCorrect");
		    softAssert.fail("Expected Available Stock value (Available Stock value After Action CompleteQC = Available Stock value After Deliver) After Action CompleteQC is: "+MethodsOrderFlowNegative.varAvailableStockAfterDeliver+" But Actual Available Stock value After Action CompleteQC is: "+MethodsOrderFlowNegative.varAvailableStockAfterActionCompleteQC+". InCorrect");
		}
	}
	
	
	
	@Test(dependsOnMethods = "testOrderFlowNegativeInventoryDetailsAfterActionCompleteQC",groups = {"OrderFlowNegative"})
	public void testOrderFlowNegativeRejectItemQC(){
		SoftAssert softAssert = new SoftAssert();
		
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderFlowNegative.methodOrderFlowNegativeRejectItemQC();
	    
		TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	
	    String status = response.jsonPath().getString("payload.qcOrderItems[0].orderItemBatches[0].status");
	    if (!"Rejected".equals(status)) {
	    	test.log(Status.FAIL, "Expected Status is Rejected, but found:- "+status);
	    	softAssert.fail("Test failed due to unexpected Status:- "+status);
	    } else {
	    	test.log(Status.PASS, "Passed because Status is:- "+status);
	    }

	    TestHelper.validateId(test, response);
	}
	
	
	
	@Test(dependsOnMethods = "testOrderFlowNegativeRejectItemQC",groups = {"OrderFlowNegative"})
	public void testOrderFlowNegativeInventoryDetailsAfterRejectItemQC(){
		SoftAssert softAssert = new SoftAssert();
		
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderFlowNegative.methodOrderFlowNegativeInventoryDetailsRejectItemQC();
	    
		TestHelper.logDetails(test, response);
		TestHelper.validateStatusCode(test, response, 200);
		
		if(MethodsOrderFlowNegative.varUsedQuantityAfterRejectItemQC == MethodsOrderFlowNegative.varUsedQuantityAfterActionCompleteQC){
		    test.log(Status.PASS, "Expected Used Quantity value (Used Quantity value After Reject Item1QC = Used Quantity value After Action CompleteQC) After Reject Item1QC is: "+MethodsOrderFlowNegative.varUsedQuantityAfterActionCompleteQC+" And Actual Used Quantity value After Action CompleteQC is: "+MethodsOrderFlowNegative.varUsedQuantityAfterRejectItemQC+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Used Quantity value (Used Quantity value After Reject Item1QC = Used Quantity value After Action CompleteQC) After Reject Item1QC is: "+MethodsOrderFlowNegative.varUsedQuantityAfterActionCompleteQC+" But Actual Used Quantity value After Action CompleteQC is: "+MethodsOrderFlowNegative.varUsedQuantityAfterRejectItemQC+". InCorrect");
		    softAssert.fail("Expected Used Quantity value (Used Quantity value After Reject Item1QC = Used Quantity value After Action CompleteQC) After Reject Item1QC is: "+MethodsOrderFlowNegative.varUsedQuantityAfterActionCompleteQC+" But Actual Used Quantity value After Action CompleteQC is: "+MethodsOrderFlowNegative.varUsedQuantityAfterRejectItemQC+". InCorrect");
		}

		if(MethodsOrderFlowNegative.varAvailableQuantityAfterRejectItemQC == MethodsOrderFlowNegative.varAvailableQuantityAfterActionCompleteQC){
		    test.log(Status.PASS, "Expected Available Quantity value (Available Quantity value After Reject Item1QC = Available Quantity value After Action CompleteQC) After Reject Item1QC is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterActionCompleteQC+" And Actual Available Quantity value After Reject Item1QC is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterActionCompleteQC+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Available Quantity value (Available Quantity value After Reject Item1QC = Available Quantity value After Action CompleteQC) After Reject Item1QC is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterActionCompleteQC+" But Actual Available Quantity value After Reject Item1QC is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterActionCompleteQC+". InCorrect");
		    softAssert.fail("Expected Available Quantity value (Available Quantity value After Reject Item1QC = Available Quantity value After Action CompleteQC) After Reject Item1QC is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterActionCompleteQC+" But Actual Available Quantity value After Reject Item1QC is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterActionCompleteQC+". InCorrect");
		}

		if(MethodsOrderFlowNegative.varPendingStockAfterRejectItemQC == MethodsOrderFlowNegative.varPendingStockAfterActionCompleteQC){
		    test.log(Status.PASS, "Expected Pending Stock value (Pending Stock value After Reject Item1QC = Pending Stock value After Action CompleteQC) After Reject Item1QC is: "+MethodsOrderFlowNegative.varPendingStockAfterActionCompleteQC+" And Actual Pending Stock value After Reject Item1QC is: "+MethodsOrderFlowNegative.varPendingStockAfterRejectItemQC+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Pending Stock value (Pending Stock value After Reject Item1QC = Pending Stock value After Action CompleteQC) After Reject Item1QC is: "+MethodsOrderFlowNegative.varPendingStockAfterActionCompleteQC+" But Actual Pending Stock value After Reject Item1QC is: "+MethodsOrderFlowNegative.varPendingStockAfterRejectItemQC+". InCorrect");
		    softAssert.fail("Expected Pending Stock value (Pending Stock value After Reject Item1QC = Pending Stock value After Action CompleteQC) After Reject Item1QC is: "+MethodsOrderFlowNegative.varPendingStockAfterActionCompleteQC+" But Actual Pending Stock value After Reject Item1QC is: "+MethodsOrderFlowNegative.varPendingStockAfterRejectItemQC+". InCorrect");
		}

		if(MethodsOrderFlowNegative.varTotalDemandAfterRejectItemQC == MethodsOrderFlowNegative.varTotalDemandAfterActionCompleteQC){
		    test.log(Status.PASS, "Expected Total Demand value (Total Demand value After Reject Item1QC = Total Demand value After Action CompleteQC) After Reject Item1QC is: "+MethodsOrderFlowNegative.varTotalDemandAfterActionCompleteQC+" And Actual Total Demand value After Reject Item1QC is: "+MethodsOrderFlowNegative.varTotalDemandAfterRejectItemQC+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Total Demand value (Total Demand value After Reject Item1QC = Total Demand value After Action CompleteQC) After Reject Item1QC is: "+MethodsOrderFlowNegative.varTotalDemandAfterActionCompleteQC+" But Actual Total Demand value After Reject Item1QC is: "+MethodsOrderFlowNegative.varTotalDemandAfterRejectItemQC+". InCorrect");
		    softAssert.fail("Expected Total Demand value (Total Demand value After Reject Item1QC = Total Demand value After Action CompleteQC) After Reject Item1QC is: "+MethodsOrderFlowNegative.varTotalDemandAfterActionCompleteQC+" But Actual Total Demand value After Reject Item1QC is: "+MethodsOrderFlowNegative.varTotalDemandAfterRejectItemQC+". InCorrect");
		}

		if(MethodsOrderFlowNegative.varStockAfterRejectItemQC == MethodsOrderFlowNegative.varStockAfterActionCompleteQC){
		    test.log(Status.PASS, "Expected Stock value (Stock value After Reject Item1QC = Stock value After Action CompleteQC) After Reject Item1QC is: "+MethodsOrderFlowNegative.varStockAfterActionCompleteQC+" And Actual Stock value After Reject Item1QC is: "+MethodsOrderFlowNegative.varStockAfterRejectItemQC+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Stock value (Stock value After Reject Item1QC = Stock value After Action CompleteQC) After Reject Item1QC is: "+MethodsOrderFlowNegative.varStockAfterActionCompleteQC+" But Actual Stock value After Reject Item1QC is: "+MethodsOrderFlowNegative.varStockAfterRejectItemQC+". InCorrect");
		    softAssert.fail("Expected Stock value (Stock value After Reject Item1QC = Stock value After Action CompleteQC) After Reject Item1QC is: "+MethodsOrderFlowNegative.varStockAfterActionCompleteQC+" But Actual Stock value After Reject Item1QC is: "+MethodsOrderFlowNegative.varStockAfterRejectItemQC+". InCorrect");
		}

		if(MethodsOrderFlowNegative.varIntransientStockAfterRejectItemQC == MethodsOrderFlowNegative.varIntransientStockAfterActionCompleteQC){
		    test.log(Status.PASS, "Expected Intransient Stock value (Intransient Stock value After Reject Item1QC = Intransient Stock value After Action CompleteQC) After Reject Item1QC is: "+MethodsOrderFlowNegative.varIntransientStockAfterActionCompleteQC+" And Actual Intransient Stock value After Reject Item1QC is: "+MethodsOrderFlowNegative.varIntransientStockAfterRejectItemQC+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Intransient Stock value (Intransient Stock value After Reject Item1QC = Intransient Stock value After Action CompleteQC) After Reject Item1QC is: "+MethodsOrderFlowNegative.varIntransientStockAfterActionCompleteQC+" But Actual Intransient Stock value After Reject Item1QC is: "+MethodsOrderFlowNegative.varIntransientStockAfterRejectItemQC+". InCorrect");
		    softAssert.fail("Expected Intransient Stock value (Intransient Stock value After Reject Item1QC = Intransient Stock value After Action CompleteQC) After Reject Item1QC is: "+MethodsOrderFlowNegative.varIntransientStockAfterActionCompleteQC+" But Actual Intransient Stock value After Reject Item1QC is: "+MethodsOrderFlowNegative.varIntransientStockAfterRejectItemQC+". InCorrect");
		}

		if(MethodsOrderFlowNegative.varAvailableStockAfterRejectItemQC == MethodsOrderFlowNegative.varAvailableStockAfterActionCompleteQC){
		    test.log(Status.PASS, "Expected Available Stock value (Available Stock value After Reject Item1QC = Available Stock value After Action CompleteQC) After Reject Item1QC is: "+MethodsOrderFlowNegative.varAvailableStockAfterActionCompleteQC+" And Actual Available Stock value After Reject Item1QC is: "+MethodsOrderFlowNegative.varAvailableStockAfterRejectItemQC+". Correct");
		} else {
		    test.log(Status.FAIL, "Expected Available Stock value (Available Stock value After Reject Item1QC = Available Stock value After Action CompleteQC) After Reject Item1QC is: "+MethodsOrderFlowNegative.varAvailableStockAfterActionCompleteQC+" But Actual Available Stock value After Reject Item1QC is: "+MethodsOrderFlowNegative.varAvailableStockAfterRejectItemQC+". InCorrect");
		    softAssert.fail("Expected Available Stock value (Available Stock value After Reject Item1QC = Available Stock value After Action CompleteQC) After Reject Item1QC is: "+MethodsOrderFlowNegative.varAvailableStockAfterActionCompleteQC+" But Actual Available Stock value After Reject Item1QC is: "+MethodsOrderFlowNegative.varAvailableStockAfterRejectItemQC+". InCorrect");
		}
	}

	
	
	@Test(dependsOnMethods = "testOrderFlowNegativeInventoryDetailsAfterRejectItemQC",groups = {"OrderFlowNegative"})
	public void testOrderFlowNegativeCompleteQC(){
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderFlowNegative.methodOrderFlowNegativeCompleteQC();
		
		TestHelper.logDetails(test, response);
		TestHelper.validateStatusCode(test, response, 200);
		TestHelper.validateOrderStatus(test, response, "QC_Completed");
	    TestHelper.validateId(test, response);
	}

	
	
	@Test(dependsOnMethods = "testOrderFlowNegativeCompleteQC", groups = {"OrderFlowNegative"})
	public void testOrderFlowNegativeInventoryDetailsAfterCompleteQC(){
		SoftAssert softAssert = new SoftAssert();
		
	    ExtentTest test = ExtentReportManager.getTest();
	    Response response = MethodsOrderFlowNegative.methodOrderFlowNegativeInventoryDetailsCompleteQC();
	    
	    TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    
	    if (MethodsOrderFlowNegative.varUsedQuantityAfterCompleteQC == MethodsOrderFlowNegative.varUsedQuantityAfterRejectItemQC) {
	        test.log(Status.PASS, "Expected Used Quantity value (Used Quantity value After CompleteQC = Used Quantity value After Reject ItemQC) After CompleteQC is: " + MethodsOrderFlowNegative.varUsedQuantityAfterRejectItemQC + " And Actual Used Quantity value After Reject ItemQC is: " + MethodsOrderFlowNegative.varUsedQuantityAfterCompleteQC + ". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Used Quantity value (Used Quantity value After CompleteQC = Used Quantity value After Reject ItemQC) After CompleteQC is: " + MethodsOrderFlowNegative.varUsedQuantityAfterRejectItemQC + " But Actual Used Quantity value After Reject ItemQC is: " + MethodsOrderFlowNegative.varUsedQuantityAfterCompleteQC + ". Incorrect");
	        softAssert.fail("Expected Used Quantity value (Used Quantity value After CompleteQC = Used Quantity value After Reject ItemQC) After CompleteQC is: " + MethodsOrderFlowNegative.varUsedQuantityAfterRejectItemQC + " But Actual Used Quantity value After Reject ItemQC is: " + MethodsOrderFlowNegative.varUsedQuantityAfterCompleteQC + ". Incorrect");
	    }

	    if (MethodsOrderFlowNegative.varAvailableQuantityAfterCompleteQC == MethodsOrderFlowNegative.varAvailableQuantityAfterRejectItemQC) {
	        test.log(Status.PASS, "Expected Available Quantity value (Available Quantity value After CompleteQC = Available Quantity value After Reject ItemQC) After CompleteQC is: " + MethodsOrderFlowNegative.varAvailableQuantityAfterRejectItemQC + " And Actual Available Quantity value After CompleteQC is: " + MethodsOrderFlowNegative.varAvailableQuantityAfterCompleteQC + ". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Available Quantity value (Available Quantity value After CompleteQC = Available Quantity value After Reject ItemQC) After CompleteQC is: " + MethodsOrderFlowNegative.varAvailableQuantityAfterRejectItemQC + " But Actual Available Quantity value After CompleteQC is: " + MethodsOrderFlowNegative.varAvailableQuantityAfterCompleteQC + ". Incorrect");
	        softAssert.fail("Expected Available Quantity value (Available Quantity value After CompleteQC = Available Quantity value After Reject ItemQC) After CompleteQC is: " + MethodsOrderFlowNegative.varAvailableQuantityAfterRejectItemQC + " But Actual Available Quantity value After CompleteQC is: " + MethodsOrderFlowNegative.varAvailableQuantityAfterCompleteQC + ". Incorrect");
	    }

	    if (MethodsOrderFlowNegative.varPendingStockAfterCompleteQC == MethodsOrderFlowNegative.varPendingStockAfterRejectItemQC) {
	        test.log(Status.PASS, "Expected Pending Stock value (Pending Stock value After CompleteQC = Pending Stock value After Reject ItemQC) After CompleteQC is: " + MethodsOrderFlowNegative.varPendingStockAfterRejectItemQC + " And Actual Pending Stock value After Reject ItemQC is: " + MethodsOrderFlowNegative.varPendingStockAfterCompleteQC + ". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Pending Stock value (Pending Stock value After CompleteQC = Pending Stock value After Reject ItemQC) After CompleteQC is: " + MethodsOrderFlowNegative.varPendingStockAfterRejectItemQC + " But Actual Pending Stock value After Reject ItemQC is: " + MethodsOrderFlowNegative.varPendingStockAfterCompleteQC + ". Incorrect");
	        softAssert.fail("Expected Pending Stock value (Pending Stock value After CompleteQC = Pending Stock value After Reject ItemQC) After CompleteQC is: " + MethodsOrderFlowNegative.varPendingStockAfterRejectItemQC + " But Actual Pending Stock value After Reject ItemQC is: " + MethodsOrderFlowNegative.varPendingStockAfterCompleteQC + ". Incorrect");
	    }

	    if (MethodsOrderFlowNegative.varStockAfterCompleteQC == MethodsOrderFlowNegative.varStockAfterRejectItemQC) {
	        test.log(Status.PASS, "Expected Stock value (Stock value After CompleteQC = Stock value After Reject ItemQC) After CompleteQC is: " + MethodsOrderFlowNegative.varStockAfterRejectItemQC + " And Actual Stock value After CompleteQC is: " + MethodsOrderFlowNegative.varStockAfterCompleteQC + ". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Stock value (Stock value After CompleteQC = Stock value After Reject ItemQC) After CompleteQC is: " + MethodsOrderFlowNegative.varStockAfterRejectItemQC + " But Actual Stock value After CompleteQC is: " + MethodsOrderFlowNegative.varStockAfterCompleteQC + ". Incorrect");
	        softAssert.fail("Expected Stock value (Stock value After CompleteQC = Stock value After Reject ItemQC) After CompleteQC is: " + MethodsOrderFlowNegative.varStockAfterRejectItemQC + " But Actual Stock value After CompleteQC is: " + MethodsOrderFlowNegative.varStockAfterCompleteQC + ". Incorrect");
	    }

	    if (MethodsOrderFlowNegative.varIntransientStockAfterCompleteQC == MethodsOrderFlowNegative.varIntransientStockAfterRejectItemQC) {
	        test.log(Status.PASS, "Expected Intransient Stock value (Intransient Stock value After CompleteQC = Intransient Stock value After Reject ItemQC) After CompleteQC is: " + MethodsOrderFlowNegative.varIntransientStockAfterRejectItemQC + " And Actual Intransient Stock value After CompleteQC is: " + MethodsOrderFlowNegative.varIntransientStockAfterCompleteQC + ". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Intransient Stock value (Intransient Stock value After CompleteQC = Intransient Stock value After Reject ItemQC) After CompleteQC is: " + MethodsOrderFlowNegative.varIntransientStockAfterRejectItemQC + " But Actual Intransient Stock value After CompleteQC is: " + MethodsOrderFlowNegative.varIntransientStockAfterCompleteQC + ". Incorrect");
	        softAssert.fail("Expected Intransient Stock value (Intransient Stock value After CompleteQC = Intransient Stock value After Reject ItemQC) After CompleteQC is: " + MethodsOrderFlowNegative.varIntransientStockAfterRejectItemQC + " But Actual Intransient Stock value After CompleteQC is: " + MethodsOrderFlowNegative.varIntransientStockAfterCompleteQC + ". Incorrect");
	    }

	    if (MethodsOrderFlowNegative.varAvailableStockAfterCompleteQC == MethodsOrderFlowNegative.varAvailableStockAfterRejectItemQC) {
	        test.log(Status.PASS, "Expected Available Stock value (Available Stock value After CompleteQC = Available Stock value After Reject ItemQC) After CompleteQC is: " + MethodsOrderFlowNegative.varAvailableStockAfterRejectItemQC + " And Actual Available Stock value After CompleteQC is: " + MethodsOrderFlowNegative.varAvailableStockAfterCompleteQC + ". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Available Stock value (Available Stock value After CompleteQC = Available Stock value After Reject ItemQC) After CompleteQC is: " + MethodsOrderFlowNegative.varAvailableStockAfterRejectItemQC + " But Actual Available Stock value After CompleteQC is: " + MethodsOrderFlowNegative.varAvailableStockAfterCompleteQC + ". Incorrect");
	        softAssert.fail("Expected Available Stock value (Available Stock value After CompleteQC = Available Stock value After Reject ItemQC) After CompleteQC is: " + MethodsOrderFlowNegative.varAvailableStockAfterRejectItemQC + " But Actual Available Stock value After CompleteQC is: " + MethodsOrderFlowNegative.varAvailableStockAfterCompleteQC + ". Incorrect");
	    }

	    if (MethodsOrderFlowNegative.varTotalDemandAfterCompleteQC == MethodsOrderFlowNegative.varTotalDemandAfterRejectItemQC) {
	        test.log(Status.PASS, "Expected Total Demand value (Total Demand value After CompleteQC = Total Demand value After Reject ItemQC) After CompleteQC is: " + MethodsOrderFlowNegative.varTotalDemandAfterRejectItemQC + " And Actual Total Demand value After CompleteQC is: " + MethodsOrderFlowNegative.varTotalDemandAfterCompleteQC + ". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Total Demand value (Total Demand value After CompleteQC = Total Demand value After Reject ItemQC) After CompleteQC is: " + MethodsOrderFlowNegative.varTotalDemandAfterRejectItemQC + " But Actual Total Demand value After CompleteQC is: " + MethodsOrderFlowNegative.varTotalDemandAfterCompleteQC + ". Incorrect");
	        softAssert.fail("Expected Total Demand value (Total Demand value After CompleteQC = Total Demand value After Reject ItemQC) After CompleteQC is: " + MethodsOrderFlowNegative.varTotalDemandAfterRejectItemQC + " But Actual Total Demand value After CompleteQC is: " + MethodsOrderFlowNegative.varTotalDemandAfterCompleteQC + ". Incorrect");
	    }
	}
	
	

	@Test(dependsOnMethods = "testOrderFlowNegativeInventoryDetailsAfterCompleteQC",groups = {"OrderFlowNegative"})
	public void testOrderFlowNegativeInventorySettlement(){
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderFlowNegative.methodOrderFlowNegativeInventorySettlement();
		
		TestHelper.logDetails(test, response);
		TestHelper.validateStatusCode(test, response, 200);
		TestHelper.validateOrderStatus(test, response, "COMPLETED");
	    TestHelper.validateId(test, response);
	}
	
	
	
	@Test(dependsOnMethods = "testOrderFlowNegativeInventorySettlement", groups = {"OrderFlowNegative"})
	public void testOrderFlowNegativeInventoryDetailsAfterInventorySettlement(){
		SoftAssert softAssert = new SoftAssert();
		
	    ExtentTest test = ExtentReportManager.getTest();
	    Response response = MethodsOrderFlowNegative.methodOrderFlowNegativeInventoryDetailsInventorySettlement();
	    
	    TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    	    
	    if(MethodsOrderFlowNegative.varTotalDemandAfterInventorySettlement == MethodsOrderFlowNegative.varTotalDemandAfterCompleteQC){
	        test.log(Status.PASS, "Expected Total Demand value (Total Demand value After Inventory Settlement = Total Demand value After CompleteQC) After Inventory Settlement is: "+MethodsOrderFlowNegative.varTotalDemandAfterCompleteQC+" And Actual Total Demand value After Inventory Settlement is: "+MethodsOrderFlowNegative.varTotalDemandAfterInventorySettlement+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Total Demand value (Total Demand value After Inventory Settlement = Total Demand value After CompleteQC) After Inventory Settlement is: "+MethodsOrderFlowNegative.varTotalDemandAfterCompleteQC+" But Actual Total Demand value After Inventory Settlement is: "+MethodsOrderFlowNegative.varTotalDemandAfterInventorySettlement+". InCorrect");
	        softAssert.fail("Expected Total Demand value (Total Demand value After Inventory Settlement = Total Demand value After CompleteQC) After Inventory Settlement is: "+MethodsOrderFlowNegative.varTotalDemandAfterCompleteQC+" But Actual Total Demand value After Inventory Settlement is: "+MethodsOrderFlowNegative.varTotalDemandAfterInventorySettlement+". InCorrect");
	    }
	    
	    if(MethodsOrderFlowNegative.varUsedQuantityAfterInventorySettlement == MethodsOrderFlowNegative.varUsedQuantityAfterCompleteQC){
	        test.log(Status.PASS, "Expected Used Quantity value (Used Quantity value After Inventory Settlement = Used Quantity value After CompleteQC) After Inventory Settlement is: "+MethodsOrderFlowNegative.varUsedQuantityAfterCompleteQC+" And Actual Used Quantity value After Inventory Settlement is: "+MethodsOrderFlowNegative.varUsedQuantityAfterInventorySettlement+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Used Quantity value (Used Quantity value After Inventory Settlement = Used Quantity value After CompleteQC) After Inventory Settlement is: "+MethodsOrderFlowNegative.varUsedQuantityAfterCompleteQC+" But Actual Used Quantity value After Inventory Settlement is: "+MethodsOrderFlowNegative.varUsedQuantityAfterInventorySettlement+". InCorrect");
	        softAssert.fail("Expected Used Quantity value (Used Quantity value After Inventory Settlement = Used Quantity value After CompleteQC) After Inventory Settlement is: "+MethodsOrderFlowNegative.varUsedQuantityAfterCompleteQC+" But Actual Used Quantity value After Inventory Settlement is: "+MethodsOrderFlowNegative.varUsedQuantityAfterInventorySettlement+". InCorrect");
	    }

	    if(MethodsOrderFlowNegative.varIntransientStockAfterInventorySettlement == MethodsOrderFlowNegative.varIntransientStockAfterCompleteQC){
	        test.log(Status.PASS, "Expected Intransient Stock value (Intransient Stock value After Inventory Settlement = Intransient Stock value After CompleteQC) After Inventory Settlement is: "+MethodsOrderFlowNegative.varIntransientStockAfterCompleteQC+" And Actual Intransient Stock value After Inventory Settlement is: "+MethodsOrderFlowNegative.varIntransientStockAfterInventorySettlement+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Intransient Stock value (Intransient Stock value After Inventory Settlement = Intransient Stock value After CompleteQC) After Inventory Settlement is: "+MethodsOrderFlowNegative.varIntransientStockAfterCompleteQC+" But Actual Intransient Stock value After Inventory Settlement is: "+MethodsOrderFlowNegative.varIntransientStockAfterInventorySettlement+". InCorrect");
	        softAssert.fail("Expected Intransient Stock value (Intransient Stock value After Inventory Settlement = Intransient Stock value After CompleteQC) After Inventory Settlement is: "+MethodsOrderFlowNegative.varIntransientStockAfterCompleteQC+" But Actual Intransient Stock value After Inventory Settlement is: "+MethodsOrderFlowNegative.varIntransientStockAfterInventorySettlement+". InCorrect");
	    }

	    if(MethodsOrderFlowNegative.varStockAfterInventorySettlement == MethodsOrderFlowNegative.varStockAfterCompleteQC){
	        test.log(Status.PASS, "Expected Stock value (Stock value After Inventory Settlement = Stock value After CompleteQC) After Inventory Settlement is: "+MethodsOrderFlowNegative.varStockAfterCompleteQC+" And Actual Stock value After Inventory Settlement is: "+MethodsOrderFlowNegative.varStockAfterInventorySettlement+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Stock value (Stock value After Inventory Settlement = Stock value After CompleteQC) After Inventory Settlement is: "+MethodsOrderFlowNegative.varStockAfterCompleteQC+" But Actual Stock value After Inventory Settlement is: "+MethodsOrderFlowNegative.varStockAfterInventorySettlement+". InCorrect");
	        softAssert.fail("Expected Stock value (Stock value After Inventory Settlement = Stock value After CompleteQC) After Inventory Settlement is: "+MethodsOrderFlowNegative.varStockAfterCompleteQC+" But Actual Stock value After Inventory Settlement is: "+MethodsOrderFlowNegative.varStockAfterInventorySettlement+". InCorrect");
	    }
	    
	    if(MethodsOrderFlowNegative.varAvailableQuantityAfterInventorySettlement == MethodsOrderFlowNegative.varAvailableQuantityAfterCompleteQC){
	        test.log(Status.PASS, "Expected Available Quantity value (Available Quantity value After Inventory Settlement = Available Quantity value After CompleteQC) After Inventory Settlement is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterCompleteQC+" And Actual Available Quantity value After Inventory Settlement is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterInventorySettlement+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Available Quantity value (Available Quantity value After Inventory Settlement = Available Quantity value After CompleteQC) After Inventory Settlement is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterCompleteQC+" But Actual Available Quantity value After Inventory Settlement is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterInventorySettlement+". InCorrect");
	        softAssert.fail("Expected Available Quantity value (Available Quantity value After Inventory Settlement = Available Quantity value After CompleteQC) After Inventory Settlement is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterCompleteQC+" But Actual Available Quantity value After Inventory Settlement is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterInventorySettlement+". InCorrect");
	    }

	    if(MethodsOrderFlowNegative.varPendingStockAfterInventorySettlement == MethodsOrderFlowNegative.varPendingStockAfterCompleteQC){
	        test.log(Status.PASS, "Expected Pending Stock value (Pending Stock value After Inventory Settlement = Pending Stock value After CompleteQC) After Inventory Settlement is: "+MethodsOrderFlowNegative.varPendingStockAfterCompleteQC+" And Actual Pending Stock value After Inventory Settlement is: "+MethodsOrderFlowNegative.varPendingStockAfterInventorySettlement+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Pending Stock value (Pending Stock value After Inventory Settlement = Pending Stock value After CompleteQC) After Inventory Settlement is: "+MethodsOrderFlowNegative.varPendingStockAfterCompleteQC+" But Actual Pending Stock value After Inventory Settlement is: "+MethodsOrderFlowNegative.varPendingStockAfterInventorySettlement+". InCorrect");
	        softAssert.fail("Expected Pending Stock value (Pending Stock value After Inventory Settlement = Pending Stock value After CompleteQC) After Inventory Settlement is: "+MethodsOrderFlowNegative.varPendingStockAfterCompleteQC+" But Actual Pending Stock value After Inventory Settlement is: "+MethodsOrderFlowNegative.varPendingStockAfterInventorySettlement+". InCorrect");
	    }

	    if(MethodsOrderFlowNegative.varAvailableStockAfterInventorySettlement == MethodsOrderFlowNegative.varAvailableStockAfterCompleteQC){
	        test.log(Status.PASS, "Expected Available Stock value (Available Stock value After Inventory Settlement = Available Stock value After CompleteQC) After Inventory Settlement is: "+MethodsOrderFlowNegative.varAvailableStockAfterCompleteQC+" And Actual Available Stock value After Inventory Settlement is: "+MethodsOrderFlowNegative.varAvailableStockAfterInventorySettlement+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Available Stock value (Available Stock value After Inventory Settlement = Available Stock value After CompleteQC) After Inventory Settlement is: "+MethodsOrderFlowNegative.varAvailableStockAfterCompleteQC+" But Actual Available Stock value After Inventory Settlement is: "+MethodsOrderFlowNegative.varAvailableStockAfterInventorySettlement+". InCorrect");
	        softAssert.fail("Expected Available Stock value (Available Stock value After Inventory Settlement = Available Stock value After CompleteQC) After Inventory Settlement is: "+MethodsOrderFlowNegative.varAvailableStockAfterCompleteQC+" But Actual Available Stock value After Inventory Settlement is: "+MethodsOrderFlowNegative.varAvailableStockAfterInventorySettlement+". InCorrect");
	    }
	}
	
	
	
	@Test(dependsOnMethods = "testOrderFlowNegativeInventoryDetailsAfterInventorySettlement",groups = {"OrderFlowNegative"})
	public void testOrderFlowNegativeOrderIdReturn(){
		SoftAssert softAssert = new SoftAssert();
		
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderFlowNegative.methodOrderFlowNegativeOrderIdReturn();
	    
		TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    
	    if(MethodsOrderFlowNegative.varOrderIdReturn!=null){
	    	test.log(Status.PASS, "Return Order Id is: "+MethodsOrderFlowNegative.varOrderIdReturn);
	    } else {
	    	test.log(Status.FAIL, "Return Order Id is invalid: "+MethodsOrderFlowNegative.varOrderIdReturn);
	    	softAssert.fail("Return Order Id is invalid: "+MethodsOrderFlowNegative.varOrderIdReturn);
	    }
	}
	
	
	
	@Test(dependsOnMethods = "testOrderFlowNegativeOrderIdReturn", groups = {"OrderFlowNegative"})
	public void testOrderFlowNegativeInventoryAfterDetailsOrderIdReturn(){
		SoftAssert softAssert = new SoftAssert();
		
	    ExtentTest test = ExtentReportManager.getTest();
	    Response response = MethodsOrderFlowNegative.methodOrderFlowNegativeInventoryDetailsOrderIdReturn();
	    
	    TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    	    
	    if(MethodsOrderFlowNegative.varTotalDemandAfterOrderIdReturn == MethodsOrderFlowNegative.varTotalDemandAfterInventorySettlement){
	        test.log(Status.PASS, "Expected Total Demand value (Total Demand value After OrderId Return = Total Demand value After Inventory Settlement) After OrderId Return is: "+MethodsOrderFlowNegative.varTotalDemandAfterInventorySettlement+" And Actual Total Demand value After OrderId Return is: "+MethodsOrderFlowNegative.varTotalDemandAfterOrderIdReturn+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Total Demand value (Total Demand value After OrderId Return = Total Demand value After Inventory Settlement) After OrderId Return is: "+MethodsOrderFlowNegative.varTotalDemandAfterInventorySettlement+" But Actual Total Demand value After OrderId Return is: "+MethodsOrderFlowNegative.varTotalDemandAfterOrderIdReturn+". InCorrect");
	        softAssert.fail("Expected Total Demand value (Total Demand value After OrderId Return = Total Demand value After Inventory Settlement) After OrderId Return is: "+MethodsOrderFlowNegative.varTotalDemandAfterInventorySettlement+" But Actual Total Demand value After OrderId Return is: "+MethodsOrderFlowNegative.varTotalDemandAfterOrderIdReturn+". InCorrect");
	    }

	    if(MethodsOrderFlowNegative.varUsedQuantityAfterOrderIdReturn == MethodsOrderFlowNegative.varUsedQuantityAfterInventorySettlement){
	        test.log(Status.PASS, "Expected Used Quantity value (Used Quantity value After OrderId Return = Used Quantity value After Inventory Settlement) After OrderId Return is: "+MethodsOrderFlowNegative.varUsedQuantityAfterInventorySettlement+" And Actual Used Quantity value After OrderId Return is: "+MethodsOrderFlowNegative.varUsedQuantityAfterOrderIdReturn+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Used Quantity value (Used Quantity value After OrderId Return = Used Quantity value After Inventory Settlement) After OrderId Return is: "+MethodsOrderFlowNegative.varUsedQuantityAfterInventorySettlement+" But Actual Used Quantity value After OrderId Return is: "+MethodsOrderFlowNegative.varUsedQuantityAfterOrderIdReturn+". InCorrect");
	        softAssert.fail("Expected Used Quantity value (Used Quantity value After OrderId Return = Used Quantity value After Inventory Settlement) After OrderId Return is: "+MethodsOrderFlowNegative.varUsedQuantityAfterInventorySettlement+" But Actual Used Quantity value After OrderId Return is: "+MethodsOrderFlowNegative.varUsedQuantityAfterOrderIdReturn+". InCorrect");
	    }

	    if(MethodsOrderFlowNegative.varIntransientStockAfterOrderIdReturn == MethodsOrderFlowNegative.varIntransientStockAfterInventorySettlement){
	        test.log(Status.PASS, "Expected Intransient Stock value (Intransient Stock value After OrderId Return = Intransient Stock value After Inventory Settlement) After OrderId Return is: "+MethodsOrderFlowNegative.varIntransientStockAfterInventorySettlement+" And Actual Intransient Stock value After OrderId Return is: "+MethodsOrderFlowNegative.varIntransientStockAfterOrderIdReturn+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Intransient Stock value (Intransient Stock value After OrderId Return = Intransient Stock value After Inventory Settlement) After OrderId Return is: "+MethodsOrderFlowNegative.varIntransientStockAfterInventorySettlement+" But Actual Intransient Stock value After OrderId Return is: "+MethodsOrderFlowNegative.varIntransientStockAfterOrderIdReturn+". InCorrect");
	        softAssert.fail("Expected Intransient Stock value (Intransient Stock value After OrderId Return = Intransient Stock value After Inventory Settlement) After OrderId Return is: "+MethodsOrderFlowNegative.varIntransientStockAfterInventorySettlement+" But Actual Intransient Stock value After OrderId Return is: "+MethodsOrderFlowNegative.varIntransientStockAfterOrderIdReturn+". InCorrect");
	    }

	    if(MethodsOrderFlowNegative.varStockAfterOrderIdReturn == MethodsOrderFlowNegative.varStockAfterInventorySettlement){
	        test.log(Status.PASS, "Expected Stock value (Stock value After OrderId Return = Stock value After Inventory Settlement) After OrderId Return is: "+MethodsOrderFlowNegative.varStockAfterInventorySettlement+" And Actual Stock value After OrderId Return is: "+MethodsOrderFlowNegative.varStockAfterOrderIdReturn+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Stock value (Stock value After OrderId Return = Stock value After Inventory Settlement) After OrderId Return is: "+MethodsOrderFlowNegative.varStockAfterInventorySettlement+" But Actual Stock value After OrderId Return is: "+MethodsOrderFlowNegative.varStockAfterOrderIdReturn+". InCorrect");
	        softAssert.fail("Expected Stock value (Stock value After OrderId Return = Stock value After Inventory Settlement) After OrderId Return is: "+MethodsOrderFlowNegative.varStockAfterInventorySettlement+" But Actual Stock value After OrderId Return is: "+MethodsOrderFlowNegative.varStockAfterOrderIdReturn+". InCorrect");
	    }

	    if(MethodsOrderFlowNegative.varAvailableQuantityAfterOrderIdReturn == MethodsOrderFlowNegative.varAvailableQuantityAfterInventorySettlement){
	        test.log(Status.PASS, "Expected Available Quantity value (Available Quantity value After OrderId Return = Available Quantity value After Inventory Settlement) After OrderId Return is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterInventorySettlement+" And Actual Available Quantity value After OrderId Return is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterOrderIdReturn+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Available Quantity value (Available Quantity value After OrderId Return = Available Quantity value After Inventory Settlement) After OrderId Return is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterInventorySettlement+" But Actual Available Quantity value After OrderId Return is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterOrderIdReturn+". InCorrect");
	        softAssert.fail("Expected Available Quantity value (Available Quantity value After OrderId Return = Available Quantity value After Inventory Settlement) After OrderId Return is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterInventorySettlement+" But Actual Available Quantity value After OrderId Return is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterOrderIdReturn+". InCorrect");
	    }

	    if(MethodsOrderFlowNegative.varPendingStockAfterOrderIdReturn == MethodsOrderFlowNegative.varPendingStockAfterInventorySettlement){
	        test.log(Status.PASS, "Expected Pending Stock value (Pending Stock value After OrderId Return = Pending Stock value After Inventory Settlement) After OrderId Return is: "+MethodsOrderFlowNegative.varPendingStockAfterInventorySettlement+" And Actual Pending Stock value After OrderId Return is: "+MethodsOrderFlowNegative.varPendingStockAfterOrderIdReturn+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Pending Stock value (Pending Stock value After OrderId Return = Pending Stock value After Inventory Settlement) After OrderId Return is: "+MethodsOrderFlowNegative.varPendingStockAfterInventorySettlement+" But Actual Pending Stock value After OrderId Return is: "+MethodsOrderFlowNegative.varPendingStockAfterOrderIdReturn+". InCorrect");
	        softAssert.fail("Expected Pending Stock value (Pending Stock value After OrderId Return = Pending Stock value After Inventory Settlement) After OrderId Return is: "+MethodsOrderFlowNegative.varPendingStockAfterInventorySettlement+" But Actual Pending Stock value After OrderId Return is: "+MethodsOrderFlowNegative.varPendingStockAfterOrderIdReturn+". InCorrect");
	    }

	    if(MethodsOrderFlowNegative.varAvailableStockAfterOrderIdReturn == MethodsOrderFlowNegative.varAvailableStockAfterInventorySettlement){
	        test.log(Status.PASS, "Expected Available Stock value (Available Stock value After OrderId Return = Available Stock value After Inventory Settlement) After OrderId Return is: "+MethodsOrderFlowNegative.varAvailableStockAfterInventorySettlement+" And Actual Available Stock value After OrderId Return is: "+MethodsOrderFlowNegative.varAvailableStockAfterOrderIdReturn+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Available Stock value (Available Stock value After OrderId Return = Available Stock value After Inventory Settlement) After OrderId Return is: "+MethodsOrderFlowNegative.varAvailableStockAfterInventorySettlement+" But Actual Available Stock value After OrderId Return is: "+MethodsOrderFlowNegative.varAvailableStockAfterOrderIdReturn+". InCorrect");
	        softAssert.fail("Expected Available Stock value (Available Stock value After OrderId Return = Available Stock value After Inventory Settlement) After OrderId Return is: "+MethodsOrderFlowNegative.varAvailableStockAfterInventorySettlement+" But Actual Available Stock value After OrderId Return is: "+MethodsOrderFlowNegative.varAvailableStockAfterOrderIdReturn+". InCorrect");
	    }
	}
	
	
	
	@Test(dependsOnMethods = "testOrderFlowNegativeInventoryAfterDetailsOrderIdReturn",groups = {"OrderFlowNegative"})
	public void testOrderFlowNegativeActionCompleteQCReturn(){
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderFlowNegative.methodOrderFlowNegativeActionCompleteQCReturn();
	    
		TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    TestHelper.validateOrderStatus(test, response, "QC_PENDING");
	    TestHelper.validateId(test, response);
	}
	
	
	
	@Test(dependsOnMethods = "testOrderFlowNegativeActionCompleteQCReturn", groups = {"OrderFlowNegative"})
	public void testOrderFlowNegativeInventoryDetailsAfterActionCompleteQCReturn(){
		SoftAssert softAssert = new SoftAssert();
		
	    ExtentTest test = ExtentReportManager.getTest();
	    Response response = MethodsOrderFlowNegative.methodOrderFlowNegativeInventoryDetailsActionCompleteQCReturn();
	    
	    TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    	    
	    if(MethodsOrderFlowNegative.varTotalDemandAfterActionCompleteQCReturn == MethodsOrderFlowNegative.varTotalDemandAfterInventorySettlement){
	        test.log(Status.PASS, "Expected Total Demand value (Total Demand value After Action CompleteQC Return = Total Demand value After Inventory Settlement) After Action CompleteQC Return is: "+MethodsOrderFlowNegative.varTotalDemandAfterInventorySettlement+" And Actual Total Demand value After Action CompleteQC Return is: "+MethodsOrderFlowNegative.varTotalDemandAfterActionCompleteQCReturn+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Total Demand value (Total Demand value After Action CompleteQC Return = Total Demand value After Inventory Settlement) After Action CompleteQC Return is: "+MethodsOrderFlowNegative.varTotalDemandAfterInventorySettlement+" But Actual Total Demand value After Action CompleteQC Return is: "+MethodsOrderFlowNegative.varTotalDemandAfterActionCompleteQCReturn+". InCorrect");
	        softAssert.fail("Expected Total Demand value (Total Demand value After Action CompleteQC Return = Total Demand value After Inventory Settlement) After Action CompleteQC Return is: "+MethodsOrderFlowNegative.varTotalDemandAfterInventorySettlement+" But Actual Total Demand value After Action CompleteQC Return is: "+MethodsOrderFlowNegative.varTotalDemandAfterActionCompleteQCReturn+". InCorrect");
	    }

	    if(MethodsOrderFlowNegative.varUsedQuantityAfterActionCompleteQCReturn == MethodsOrderFlowNegative.varUsedQuantityAfterInventorySettlement){
	        test.log(Status.PASS, "Expected Used Quantity value (Used Quantity value After Action CompleteQC Return = Used Quantity value After Inventory Settlement) After Action CompleteQC Return is: "+MethodsOrderFlowNegative.varUsedQuantityAfterInventorySettlement+" And Actual Used Quantity value After Action CompleteQC Return is: "+MethodsOrderFlowNegative.varUsedQuantityAfterActionCompleteQCReturn+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Used Quantity value (Used Quantity value After Action CompleteQC Return = Used Quantity value After Inventory Settlement) After Action CompleteQC Return is: "+MethodsOrderFlowNegative.varUsedQuantityAfterInventorySettlement+" But Actual Used Quantity value After Action CompleteQC Return is: "+MethodsOrderFlowNegative.varUsedQuantityAfterActionCompleteQCReturn+". InCorrect");
	        softAssert.fail("Expected Used Quantity value (Used Quantity value After Action CompleteQC Return = Used Quantity value After Inventory Settlement) After Action CompleteQC Return is: "+MethodsOrderFlowNegative.varUsedQuantityAfterInventorySettlement+" But Actual Used Quantity value After Action CompleteQC Return is: "+MethodsOrderFlowNegative.varUsedQuantityAfterActionCompleteQCReturn+". InCorrect");
	    }

	    if(MethodsOrderFlowNegative.varIntransientStockAfterActionCompleteQCReturn == MethodsOrderFlowNegative.varIntransientStockAfterInventorySettlement){
	        test.log(Status.PASS, "Expected Intransient Stock value (Intransient Stock value After Action CompleteQC Return = Intransient Stock value After Inventory Settlement) After Action CompleteQC Return is: "+MethodsOrderFlowNegative.varIntransientStockAfterInventorySettlement+" And Actual Intransient Stock value After Action CompleteQC Return is: "+MethodsOrderFlowNegative.varIntransientStockAfterActionCompleteQCReturn+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Intransient Stock value (Intransient Stock value After Action CompleteQC Return = Intransient Stock value After Inventory Settlement) After Action CompleteQC Return is: "+MethodsOrderFlowNegative.varIntransientStockAfterInventorySettlement+" But Actual Intransient Stock value After Action CompleteQC Return is: "+MethodsOrderFlowNegative.varIntransientStockAfterActionCompleteQCReturn+". InCorrect");
	        softAssert.fail("Expected Intransient Stock value (Intransient Stock value After Action CompleteQC Return = Intransient Stock value After Inventory Settlement) After Action CompleteQC Return is: "+MethodsOrderFlowNegative.varIntransientStockAfterInventorySettlement+" But Actual Intransient Stock value After Action CompleteQC Return is: "+MethodsOrderFlowNegative.varIntransientStockAfterActionCompleteQCReturn+". InCorrect");
	    }

	    if(MethodsOrderFlowNegative.varStockAfterActionCompleteQCReturn == MethodsOrderFlowNegative.varStockAfterInventorySettlement){
	        test.log(Status.PASS, "Expected Stock value (Stock value After Action CompleteQC Return = Stock value After Inventory Settlement) After Action CompleteQC Return is: "+MethodsOrderFlowNegative.varStockAfterInventorySettlement+" And Actual Stock value After Action CompleteQC Return is: "+MethodsOrderFlowNegative.varStockAfterActionCompleteQCReturn+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Stock value (Stock value After Action CompleteQC Return = Stock value After Inventory Settlement) After Action CompleteQC Return is: "+MethodsOrderFlowNegative.varStockAfterInventorySettlement+" But Actual Stock value After Action CompleteQC Return is: "+MethodsOrderFlowNegative.varStockAfterActionCompleteQCReturn+". InCorrect");
	        softAssert.fail("Expected Stock value (Stock value After Action CompleteQC Return = Stock value After Inventory Settlement) After Action CompleteQC Return is: "+MethodsOrderFlowNegative.varStockAfterInventorySettlement+" But Actual Stock value After Action CompleteQC Return is: "+MethodsOrderFlowNegative.varStockAfterActionCompleteQCReturn+". InCorrect");
	    }

	    if(MethodsOrderFlowNegative.varAvailableQuantityAfterActionCompleteQCReturn == MethodsOrderFlowNegative.varAvailableQuantityAfterInventorySettlement){
	        test.log(Status.PASS, "Expected Available Quantity value (Available Quantity value After Action CompleteQC Return = Available Quantity value After Inventory Settlement) After Action CompleteQC Return is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterInventorySettlement+" And Actual Available Quantity value After Action CompleteQC Return is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterActionCompleteQCReturn+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Available Quantity value (Available Quantity value After Action CompleteQC Return = Available Quantity value After Inventory Settlement) After Action CompleteQC Return is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterInventorySettlement+" But Actual Available Quantity value After Action CompleteQC Return is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterActionCompleteQCReturn+". InCorrect");
	        softAssert.fail("Expected Available Quantity value (Available Quantity value After Action CompleteQC Return = Available Quantity value After Inventory Settlement) After Action CompleteQC Return is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterInventorySettlement+" But Actual Available Quantity value After Action CompleteQC Return is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterActionCompleteQCReturn+". InCorrect");
	    }

	    if(MethodsOrderFlowNegative.varPendingStockAfterActionCompleteQCReturn == MethodsOrderFlowNegative.varPendingStockAfterInventorySettlement){
	        test.log(Status.PASS, "Expected Pending Stock value (Pending Stock value After Action CompleteQC Return = Pending Stock value After Inventory Settlement) After Action CompleteQC Return is: "+MethodsOrderFlowNegative.varPendingStockAfterInventorySettlement+" And Actual Pending Stock value After Action CompleteQC Return is: "+MethodsOrderFlowNegative.varPendingStockAfterActionCompleteQCReturn+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Pending Stock value (Pending Stock value After Action CompleteQC Return = Pending Stock value After Inventory Settlement) After Action CompleteQC Return is: "+MethodsOrderFlowNegative.varPendingStockAfterInventorySettlement+" But Actual Pending Stock value After Action CompleteQC Return is: "+MethodsOrderFlowNegative.varPendingStockAfterActionCompleteQCReturn+". InCorrect");
	        softAssert.fail("Expected Pending Stock value (Pending Stock value After Action CompleteQC Return = Pending Stock value After Inventory Settlement) After Action CompleteQC Return is: "+MethodsOrderFlowNegative.varPendingStockAfterInventorySettlement+" But Actual Pending Stock value After Action CompleteQC Return is: "+MethodsOrderFlowNegative.varPendingStockAfterActionCompleteQCReturn+". InCorrect");
	    }

	    if(MethodsOrderFlowNegative.varAvailableStockAfterActionCompleteQCReturn == MethodsOrderFlowNegative.varAvailableStockAfterInventorySettlement){
	        test.log(Status.PASS, "Expected Available Stock value (Available Stock value After Action CompleteQC Return = Available Stock value After Inventory Settlement) After Action CompleteQC Return is: "+MethodsOrderFlowNegative.varAvailableStockAfterInventorySettlement+" And Actual Available Stock value After Action CompleteQC Return is: "+MethodsOrderFlowNegative.varAvailableStockAfterActionCompleteQCReturn+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Available Stock value (Available Stock value After Action CompleteQC Return = Available Stock value After Inventory Settlement) After Action CompleteQC Return is: "+MethodsOrderFlowNegative.varAvailableStockAfterInventorySettlement+" But Actual Available Stock value After Action CompleteQC Return is: "+MethodsOrderFlowNegative.varAvailableStockAfterActionCompleteQCReturn+". InCorrect");
	        softAssert.fail("Expected Available Stock value (Available Stock value After Action CompleteQC Return = Available Stock value After Inventory Settlement) After Action CompleteQC Return is: "+MethodsOrderFlowNegative.varAvailableStockAfterInventorySettlement+" But Actual Available Stock value After Action CompleteQC Return is: "+MethodsOrderFlowNegative.varAvailableStockAfterActionCompleteQCReturn+". InCorrect");
	    }

	}

	
	
	@Test(dependsOnMethods = "testOrderFlowNegativeInventoryDetailsAfterActionCompleteQCReturn",groups = {"OrderFlowNegative"})

	public void testOrderFlowNegativeAcceptItemQCReturn(){
		SoftAssert softAssert = new SoftAssert();
		
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderFlowNegative.methodOrderFlowNegativeAcceptItemQCReturn();
	    
		TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	
	    String status = response.jsonPath().getString("payload.qcOrderItems[0].orderItemBatches[0].status");
	    if (!"Accepted".equals(status)) {
	    	test.log(Status.FAIL, "Expected Status is Accepted, but found:- "+status);
	    	softAssert.fail("Test failed due to unexpected Status:- "+status);
	    } else {
	    	test.log(Status.PASS, "Passed because Status is:- "+status);
	    }

	    TestHelper.validateId(test, response);
	}
	
	
	
	@Test(dependsOnMethods = "testOrderFlowNegativeAcceptItemQCReturn", groups = {"OrderFlowNegative"})
	public void testOrderFlowNegativeInventoryDetailsAfterAcceptItemQCReturn(){
		SoftAssert softAssert = new SoftAssert();
		
	    ExtentTest test = ExtentReportManager.getTest();
	    Response response = MethodsOrderFlowNegative.methodOrderFlowNegativeInventoryDetailsAcceptItemQCReturn();
	    
	    TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    	    
	    if(MethodsOrderFlowNegative.varTotalDemandAfterAcceptItemQCReturn == MethodsOrderFlowNegative.varTotalDemandAfterActionCompleteQCReturn){
	        test.log(Status.PASS, "Expected Total Demand value (Total Demand value After Accept ItemQC Return = Total Demand value After Action CompleteQC Return) After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varTotalDemandAfterActionCompleteQCReturn+" And Actual Total Demand value After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varTotalDemandAfterAcceptItemQCReturn+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Total Demand value (Total Demand value After Accept ItemQC Return = Total Demand value After Action CompleteQC Return) After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varTotalDemandAfterActionCompleteQCReturn+" But Actual Total Demand value After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varTotalDemandAfterAcceptItemQCReturn+". InCorrect");
	        softAssert.fail("Expected Total Demand value (Total Demand value After Accept ItemQC Return = Total Demand value After Action CompleteQC Return) After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varTotalDemandAfterActionCompleteQCReturn+" But Actual Total Demand value After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varTotalDemandAfterAcceptItemQCReturn+". InCorrect");
	    }

	    if(MethodsOrderFlowNegative.varUsedQuantityAfterAcceptItemQCReturn == MethodsOrderFlowNegative.varUsedQuantityAfterActionCompleteQCReturn){
	        test.log(Status.PASS, "Expected Used Quantity value (Used Quantity value After Accept ItemQC Return = Used Quantity value After Action CompleteQC Return) After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varUsedQuantityAfterActionCompleteQCReturn+" And Actual Used Quantity value After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varUsedQuantityAfterAcceptItemQCReturn+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Used Quantity value (Used Quantity value After Accept ItemQC Return = Used Quantity value After Action CompleteQC Return) After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varUsedQuantityAfterActionCompleteQCReturn+" But Actual Used Quantity value After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varUsedQuantityAfterAcceptItemQCReturn+". InCorrect");
	        softAssert.fail("Expected Used Quantity value (Used Quantity value After Accept ItemQC Return = Used Quantity value After Action CompleteQC Return) After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varUsedQuantityAfterActionCompleteQCReturn+" But Actual Used Quantity value After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varUsedQuantityAfterAcceptItemQCReturn+". InCorrect");
	    }

	    if(MethodsOrderFlowNegative.varIntransientStockAfterAcceptItemQCReturn == MethodsOrderFlowNegative.varIntransientStockAfterActionCompleteQCReturn){
	        test.log(Status.PASS, "Expected Intransient Stock value (Intransient Stock value After Accept ItemQC Return = Intransient Stock value After Action CompleteQC Return) After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varIntransientStockAfterActionCompleteQCReturn+" And Actual Intransient Stock value After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varIntransientStockAfterAcceptItemQCReturn+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Intransient Stock value (Intransient Stock value After Accept ItemQC Return = Intransient Stock value After Action CompleteQC Return) After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varIntransientStockAfterActionCompleteQCReturn+" But Actual Intransient Stock value After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varIntransientStockAfterAcceptItemQCReturn+". InCorrect");
	        softAssert.fail("Expected Intransient Stock value (Intransient Stock value After Accept ItemQC Return = Intransient Stock value After Action CompleteQC Return) After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varIntransientStockAfterActionCompleteQCReturn+" But Actual Intransient Stock value After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varIntransientStockAfterAcceptItemQCReturn+". InCorrect");
	    }

	    if(MethodsOrderFlowNegative.varStockAfterAcceptItemQCReturn == MethodsOrderFlowNegative.varStockAfterActionCompleteQCReturn){
	        test.log(Status.PASS, "Expected Stock value (Stock value After Accept ItemQC Return = Stock value After Action CompleteQC Return) After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varStockAfterActionCompleteQCReturn+" And Actual Stock value After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varStockAfterAcceptItemQCReturn+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Stock value (Stock value After Accept ItemQC Return = Stock value After Action CompleteQC Return) After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varStockAfterActionCompleteQCReturn+" But Actual Stock value After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varStockAfterAcceptItemQCReturn+". InCorrect");
	        softAssert.fail("Expected Stock value (Stock value After Accept ItemQC Return = Stock value After Action CompleteQC Return) After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varStockAfterActionCompleteQCReturn+" But Actual Stock value After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varStockAfterAcceptItemQCReturn+". InCorrect");
	    }

	    if(MethodsOrderFlowNegative.varAvailableQuantityAfterAcceptItemQCReturn == MethodsOrderFlowNegative.varAvailableQuantityAfterActionCompleteQCReturn){
	        test.log(Status.PASS, "Expected Available Quantity value (Available Quantity value After Accept ItemQC Return = Available Quantity value After Action CompleteQC Return) After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterActionCompleteQCReturn+" And Actual Available Quantity value After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterAcceptItemQCReturn+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Available Quantity value (Available Quantity value After Accept ItemQC Return = Available Quantity value After Action CompleteQC Return) After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterActionCompleteQCReturn+" But Actual Available Quantity value After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterAcceptItemQCReturn+". InCorrect");
	        softAssert.fail("Expected Available Quantity value (Available Quantity value After Accept ItemQC Return = Available Quantity value After Action CompleteQC Return) After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterActionCompleteQCReturn+" But Actual Available Quantity value After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterAcceptItemQCReturn+". InCorrect");
	    }

	    if(MethodsOrderFlowNegative.varPendingStockAfterAcceptItemQCReturn == MethodsOrderFlowNegative.varPendingStockAfterActionCompleteQCReturn){
	        test.log(Status.PASS, "Expected Pending Stock value (Pending Stock value After Accept ItemQC Return = Pending Stock value After Action CompleteQC Return) After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varPendingStockAfterActionCompleteQCReturn+" And Actual Pending Stock value After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varPendingStockAfterAcceptItemQCReturn+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Pending Stock value (Pending Stock value After Accept ItemQC Return = Pending Stock value After Action CompleteQC Return) After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varPendingStockAfterActionCompleteQCReturn+" But Actual Pending Stock value After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varPendingStockAfterAcceptItemQCReturn+". InCorrect");
	        softAssert.fail("Expected Pending Stock value (Pending Stock value After Accept ItemQC Return = Pending Stock value After Action CompleteQC Return) After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varPendingStockAfterActionCompleteQCReturn+" But Actual Pending Stock value After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varPendingStockAfterAcceptItemQCReturn+". InCorrect");
	    }

	    if(MethodsOrderFlowNegative.varAvailableStockAfterAcceptItemQCReturn == MethodsOrderFlowNegative.varAvailableStockAfterActionCompleteQCReturn){
	        test.log(Status.PASS, "Expected Available Stock value (Available Stock value After Accept ItemQC Return = Available Stock value After Action CompleteQC Return) After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varAvailableStockAfterActionCompleteQCReturn+" And Actual Available Stock value After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varAvailableStockAfterAcceptItemQCReturn+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Available Stock value (Available Stock value After Accept ItemQC Return = Available Stock value After Action CompleteQC Return) After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varAvailableStockAfterActionCompleteQCReturn+" But Actual Available Stock value After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varAvailableStockAfterAcceptItemQCReturn+". InCorrect");
	        softAssert.fail("Expected Available Stock value (Available Stock value After Accept ItemQC Return = Available Stock value After Action CompleteQC Return) After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varAvailableStockAfterActionCompleteQCReturn+" But Actual Available Stock value After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varAvailableStockAfterAcceptItemQCReturn+". InCorrect");
	    }
	}

	
	
	@Test(dependsOnMethods = "testOrderFlowNegativeInventoryDetailsAfterAcceptItemQCReturn",groups = {"OrderFlowNegative"})
	public void testOrderFlowNegativeCompleteQCReturn(){
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderFlowNegative.methodOrderFlowNegativeCompleteQCReturn();
		
		TestHelper.logDetails(test, response);
		TestHelper.validateStatusCode(test, response, 200);
		TestHelper.validateOrderStatus(test, response, "QC_Completed");
	    TestHelper.validateId(test, response);
	}

	
	
	@Test(dependsOnMethods = "testOrderFlowNegativeCompleteQCReturn", groups = {"OrderFlowNegative"})
	public void testOrderFlowNegativeInventoryDetailsAfterCompleteQCReturn(){
		SoftAssert softAssert = new SoftAssert();
		
	    ExtentTest test = ExtentReportManager.getTest();
	    Response response = MethodsOrderFlowNegative.methodOrderFlowNegativeInventoryDetailsCompleteQCReturn();
	    
	    TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    
	    if(MethodsOrderFlowNegative.varUsedQuantityAfterCompleteQCReturn == MethodsOrderFlowNegative.varUsedQuantityAfterAcceptItemQCReturn){
	        test.log(Status.PASS, "Expected Used Quantity value (Used Quantity value After CompleteQC Return = Used Quantity value After Accept ItemQC Return) After CompleteQC Return is: "+MethodsOrderFlowNegative.varUsedQuantityAfterAcceptItemQCReturn+" And Actual Used Quantity value After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varUsedQuantityAfterCompleteQCReturn+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Used Quantity value (Used Quantity value After CompleteQC Return = Used Quantity value After Accept ItemQC Return) After CompleteQC Return is: "+MethodsOrderFlowNegative.varUsedQuantityAfterAcceptItemQCReturn+" But Actual Used Quantity value After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varUsedQuantityAfterCompleteQCReturn+". InCorrect");
	        softAssert.fail("Expected Used Quantity value (Used Quantity value After CompleteQC Return = Used Quantity value After Accept ItemQC Return) After CompleteQC Return is: "+MethodsOrderFlowNegative.varUsedQuantityAfterAcceptItemQCReturn+" But Actual Used Quantity value After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varUsedQuantityAfterCompleteQCReturn+". InCorrect");
	    }

	    if(MethodsOrderFlowNegative.varAvailableQuantityAfterCompleteQCReturn == MethodsOrderFlowNegative.varAvailableQuantityAfterAcceptItemQCReturn){
	        test.log(Status.PASS, "Expected Available Quantity value (Available Quantity value After CompleteQC Return = Available Quantity value After Accept ItemQC Return) After CompleteQC Return is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterAcceptItemQCReturn+" And Actual Available Quantity value After CompleteQC Return is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterCompleteQCReturn+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Available Quantity value (Available Quantity value After CompleteQC Return = Available Quantity value After Accept ItemQC Return) After CompleteQC Return is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterAcceptItemQCReturn+" But Actual Available Quantity value After CompleteQC Return is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterCompleteQCReturn+". InCorrect");
	        softAssert.fail("Expected Available Quantity value (Available Quantity value After CompleteQC Return = Available Quantity value After Accept ItemQC Return) After CompleteQC Return is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterAcceptItemQCReturn+" But Actual Available Quantity value After CompleteQC Return is: "+MethodsOrderFlowNegative.varAvailableQuantityAfterCompleteQCReturn+". InCorrect");
	    }

	    if(MethodsOrderFlowNegative.varPendingStockAfterCompleteQCReturn == MethodsOrderFlowNegative.varPendingStockAfterAcceptItemQCReturn){
	        test.log(Status.PASS, "Expected Pending Stock value (Pending Stock value After CompleteQC Return = Pending Stock value After Accept ItemQC Return) After CompleteQC Return is: "+MethodsOrderFlowNegative.varPendingStockAfterAcceptItemQCReturn+" And Actual Pending Stock value After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varPendingStockAfterCompleteQCReturn+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Pending Stock value (Pending Stock value After CompleteQC Return = Pending Stock value After Accept ItemQC Return) After CompleteQC Return is: "+MethodsOrderFlowNegative.varPendingStockAfterAcceptItemQCReturn+" But Actual Pending Stock value After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varPendingStockAfterCompleteQCReturn+". InCorrect");
	        softAssert.fail("Expected Pending Stock value (Pending Stock value After CompleteQC Return = Pending Stock value After Accept ItemQC Return) After CompleteQC Return is: "+MethodsOrderFlowNegative.varPendingStockAfterAcceptItemQCReturn+" But Actual Pending Stock value After Accept ItemQC Return is: "+MethodsOrderFlowNegative.varPendingStockAfterCompleteQCReturn+". InCorrect");
	    }

	    if(MethodsOrderFlowNegative.varStockAfterCompleteQCReturn == MethodsOrderFlowNegative.varStockAfterAcceptItemQCReturn){
	        test.log(Status.PASS, "Expected Stock value (Stock value After CompleteQC Return = Stock value After Accept ItemQC Return) After CompleteQC Return is: "+MethodsOrderFlowNegative.varStockAfterAcceptItemQCReturn+" And Actual Stock value After CompleteQC Return is: "+MethodsOrderFlowNegative.varStockAfterCompleteQCReturn+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Stock value (Stock value After CompleteQC Return = Stock value After Accept ItemQC Return) After CompleteQC Return is: "+MethodsOrderFlowNegative.varStockAfterAcceptItemQCReturn+" But Actual Stock value After CompleteQC Return is: "+MethodsOrderFlowNegative.varStockAfterCompleteQCReturn+". InCorrect");
	        softAssert.fail("Expected Stock value (Stock value After CompleteQC Return = Stock value After Accept ItemQC Return) After CompleteQC Return is: "+MethodsOrderFlowNegative.varStockAfterAcceptItemQCReturn+" But Actual Stock value After CompleteQC Return is: "+MethodsOrderFlowNegative.varStockAfterCompleteQCReturn+". InCorrect");
	    }

	    if(MethodsOrderFlowNegative.varIntransientStockAfterCompleteQCReturn == MethodsOrderFlowNegative.varIntransientStockAfterAcceptItemQCReturn){
	        test.log(Status.PASS, "Expected Intransient Stock value (Intransient Stock value After CompleteQC Return = Intransient Stock value After Accept ItemQC Return) After CompleteQC Return is: "+MethodsOrderFlowNegative.varIntransientStockAfterAcceptItemQCReturn+" And Actual Intransient Stock value After CompleteQC Return is: "+MethodsOrderFlowNegative.varIntransientStockAfterCompleteQCReturn+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Intransient Stock value (Intransient Stock value After CompleteQC Return = Intransient Stock value After Accept ItemQC Return) After CompleteQC Return is: "+MethodsOrderFlowNegative.varIntransientStockAfterAcceptItemQCReturn+" But Actual Intransient Stock value After CompleteQC Return is: "+MethodsOrderFlowNegative.varIntransientStockAfterCompleteQCReturn+". InCorrect");
	        softAssert.fail("Expected Intransient Stock value (Intransient Stock value After CompleteQC Return = Intransient Stock value After Accept ItemQC Return) After CompleteQC Return is: "+MethodsOrderFlowNegative.varIntransientStockAfterAcceptItemQCReturn+" But Actual Intransient Stock value After CompleteQC Return is: "+MethodsOrderFlowNegative.varIntransientStockAfterCompleteQCReturn+". InCorrect");
	    }

	    if(MethodsOrderFlowNegative.varAvailableStockAfterCompleteQCReturn == MethodsOrderFlowNegative.varAvailableStockAfterAcceptItemQCReturn){
	        test.log(Status.PASS, "Expected Available Stock value (Available Stock value After CompleteQC Return = Available Stock value After Accept ItemQC Return) After CompleteQC Return is: "+MethodsOrderFlowNegative.varAvailableStockAfterAcceptItemQCReturn+" And Actual Available Stock value After CompleteQC Return is: "+MethodsOrderFlowNegative.varAvailableStockAfterCompleteQCReturn+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Available Stock value (Available Stock value After CompleteQC Return = Available Stock value After Accept ItemQC Return) After CompleteQC Return is: "+MethodsOrderFlowNegative.varAvailableStockAfterAcceptItemQCReturn+" But Actual Available Stock value After CompleteQC Return is: "+MethodsOrderFlowNegative.varAvailableStockAfterCompleteQCReturn+". InCorrect");
	        softAssert.fail("Expected Available Stock value (Available Stock value After CompleteQC Return = Available Stock value After Accept ItemQC Return) After CompleteQC Return is: "+MethodsOrderFlowNegative.varAvailableStockAfterAcceptItemQCReturn+" But Actual Available Stock value After CompleteQC Return is: "+MethodsOrderFlowNegative.varAvailableStockAfterCompleteQCReturn+". InCorrect");
	    }

	    if(MethodsOrderFlowNegative.varTotalDemandAfterCompleteQCReturn == MethodsOrderFlowNegative.varTotalDemandAfterAcceptItemQCReturn){
	        test.log(Status.PASS, "Expected Total Demand value (Total Demand value After CompleteQC Return = Total Demand value After Accept ItemQC Return) After CompleteQC Return is: "+MethodsOrderFlowNegative.varTotalDemandAfterAcceptItemQCReturn+" And Actual Total Demand value After CompleteQC Return is: "+MethodsOrderFlowNegative.varTotalDemandAfterCompleteQCReturn+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Total Demand value (Total Demand value After CompleteQC Return = Total Demand value After Accept ItemQC Return) After CompleteQC Return is: "+MethodsOrderFlowNegative.varTotalDemandAfterAcceptItemQCReturn+" But Actual Total Demand value After CompleteQC Return is: "+MethodsOrderFlowNegative.varTotalDemandAfterCompleteQCReturn+". InCorrect");
	        softAssert.fail("Expected Total Demand value (Total Demand value After CompleteQC Return = Total Demand value After Accept ItemQC Return) After CompleteQC Return is: "+MethodsOrderFlowNegative.varTotalDemandAfterAcceptItemQCReturn+" But Actual Total Demand value After CompleteQC Return is: "+MethodsOrderFlowNegative.varTotalDemandAfterCompleteQCReturn+". InCorrect");
	    }

	}
	
	

	@Test(dependsOnMethods = "testOrderFlowNegativeInventoryDetailsAfterCompleteQCReturn",groups = {"OrderFlowNegative"})
	public void testOrderFlowNegativeInventorySettlementReturn(){
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderFlowNegative.methodOrderFlowNegativeInventorySettlementReturn();
		
		TestHelper.logDetails(test, response);
		TestHelper.validateStatusCode(test, response, 200);
		TestHelper.validateOrderStatus(test, response, "COMPLETED");
	    TestHelper.validateId(test, response);
	}
	
	
	
	@Test(dependsOnMethods = "testOrderFlowNegativeInventorySettlementReturn", groups = {"OrderFlowNegative"})
	public void testOrderFlowNegativeInventoryDetailsAfterInventorySettlementReturn(){
		SoftAssert softAssert = new SoftAssert();
		
	    ExtentTest test = ExtentReportManager.getTest();
	    Response response = MethodsOrderFlowNegative.methodOrderFlowNegativeInventoryDetailsInventorySettlementReturn();
	    
	    TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    	    
	    if (MethodsOrderFlowNegative.varTotalDemandAfterInventorySettlementReturn == (MethodsOrderFlowNegative.varTotalDemandAfterCompleteQCReturn - MethodsOrderFlowNegative.varOrderedQuantity)) {
	        test.log(Status.PASS, "Total Demand value After CompleteQC Return is: " + MethodsOrderFlowNegative.varTotalDemandAfterCompleteQCReturn + ", Ordered Quantity is: " + MethodsOrderFlowNegative.varOrderedQuantity + ", Expected Total Demand value (Total Demand Value After CompleteQC Return - Ordered Quantity) After Inventory Settlement Return is: " + (MethodsOrderFlowNegative.varTotalDemandAfterCompleteQCReturn - MethodsOrderFlowNegative.varOrderedQuantity) + ", And Actual Total Demand value After Inventory Settlement Return is: " + MethodsOrderFlowNegative.varTotalDemandAfterInventorySettlementReturn + ". Correct");
	    } else {
	        test.log(Status.FAIL, "Total Demand value After CompleteQC Return is: " + MethodsOrderFlowNegative.varTotalDemandAfterCompleteQCReturn + ", Ordered Quantity is: " + MethodsOrderFlowNegative.varOrderedQuantity + ", Expected Total Demand value (Total Demand Value After CompleteQC Return - Ordered Quantity) After Inventory Settlement Return is: " + (MethodsOrderFlowNegative.varTotalDemandAfterCompleteQCReturn - MethodsOrderFlowNegative.varOrderedQuantity) + ", But Actual Total Demand value After Inventory Settlement Return is: " + MethodsOrderFlowNegative.varTotalDemandAfterInventorySettlementReturn + ". Incorrect");
	        softAssert.fail("Total Demand value After CompleteQC Return is: " + MethodsOrderFlowNegative.varTotalDemandAfterCompleteQCReturn + ", Ordered Quantity is: " + MethodsOrderFlowNegative.varOrderedQuantity + ", Expected Total Demand value (Pending Stock Value After CompleteQC Return - Ordered Quantity) After Inventory Settlement Return is: " + (MethodsOrderFlowNegative.varTotalDemandAfterCompleteQCReturn - MethodsOrderFlowNegative.varOrderedQuantity) + ", But Actual Total Demand value After Inventory Settlement Return is: " + MethodsOrderFlowNegative.varTotalDemandAfterInventorySettlementReturn + ". Incorrect");
	    }

	    if(MethodsOrderFlowNegative.varUsedQuantityAfterInventorySettlementReturn == (MethodsOrderFlowNegative.varUsedQuantityAfterCompleteQCReturn - MethodsOrderFlowNegative.varOrderedQuantity)){
	        test.log(Status.PASS, "Used Quantity value After Complete QC Return is: "+MethodsOrderFlowNegative.varUsedQuantityAfterCompleteQCReturn+", Ordered Quantity is: "+MethodsOrderFlowNegative.varOrderedQuantity+ ", Expected Used Quantity value (Used Quantity value After Complete QC Return - Ordered Quantity) After Inventory Settlement Return is: "+(MethodsOrderFlowNegative.varUsedQuantityAfterCompleteQCReturn - MethodsOrderFlowNegative.varOrderedQuantity)+ ", And Actual Used Quantity value After Inventory Settlement Return is: "+MethodsOrderFlowNegative.varUsedQuantityAfterInventorySettlementReturn+". Correct");
	    } else {
	        test.log(Status.FAIL, "Used Quantity value After Complete QC Return is: "+MethodsOrderFlowNegative.varUsedQuantityAfterCompleteQCReturn+", Ordered Quantity is: "+MethodsOrderFlowNegative.varOrderedQuantity+ ", Expected Used Quantity value (Used Quantity value After Complete QC Return - Ordered Quantity) After Inventory Settlement Return is: "+(MethodsOrderFlowNegative.varUsedQuantityAfterCompleteQCReturn - MethodsOrderFlowNegative.varOrderedQuantity)+ ", But Actual Used Quantity value After Inventory Settlement Return is: "+MethodsOrderFlowNegative.varUsedQuantityAfterInventorySettlementReturn+". Incorrect");
	        softAssert.fail("Used Quantity value After Complete QC Return is: "+MethodsOrderFlowNegative.varUsedQuantityAfterCompleteQCReturn+", Ordered Quantity is: "+MethodsOrderFlowNegative.varOrderedQuantity+", Expected Used Quantity value (Used Quantity value After Complete QC Return - Ordered Quantity) After Inventory Settlement Return is: "+(MethodsOrderFlowNegative.varUsedQuantityAfterCompleteQCReturn - MethodsOrderFlowNegative.varOrderedQuantity)+ ", But Actual Used Quantity value After Inventory Settlement Return is: "+MethodsOrderFlowNegative.varUsedQuantityAfterInventorySettlementReturn+". Incorrect");
	    }

	    if(MethodsOrderFlowNegative.varIntransientStockAfterInventorySettlementReturn == (MethodsOrderFlowNegative.varIntransientStockAfterCompleteQCReturn - MethodsOrderFlowNegative.varOrderedQuantity)){
	        test.log(Status.PASS, "Intransient Stock value After CompleteQC Return is: "+MethodsOrderFlowNegative.varIntransientStockAfterCompleteQCReturn+", Ordered Quantity is: "+MethodsOrderFlowNegative.varOrderedQuantity+ ", Expected Intransient Stock value (Intransient Stock value After CompleteQC Return - Ordered Quantity) After Inventory Settlement Return is: "+(MethodsOrderFlowNegative.varIntransientStockAfterCompleteQCReturn - MethodsOrderFlowNegative.varOrderedQuantity)+ ", And Actual Intransient Stock value After Inventory Settlement Return is: "+MethodsOrderFlowNegative.varIntransientStockAfterInventorySettlementReturn+". Correct");
	    } else {
	        test.log(Status.FAIL, "Intransient Stock value After CompleteQC Return is: "+MethodsOrderFlowNegative.varIntransientStockAfterCompleteQCReturn+", Ordered Quantity is: "+MethodsOrderFlowNegative.varOrderedQuantity+ ", Expected Intransient Stock value (Intransient Stock value After CompleteQC Return - Ordered Quantity) After Inventory Settlement Return is: "+(MethodsOrderFlowNegative.varIntransientStockAfterCompleteQCReturn - MethodsOrderFlowNegative.varOrderedQuantity)+ ", But Actual Intransient Stock value After Inventory Settlement Return is: "+MethodsOrderFlowNegative.varIntransientStockAfterInventorySettlementReturn+". Incorrect");
	        softAssert.fail("Intransient Stock value After CompleteQC Return is: "+MethodsOrderFlowNegative.varIntransientStockAfterCompleteQCReturn+", Ordered Quantity is: "+MethodsOrderFlowNegative.varOrderedQuantity+ ", Expected Intransient Stock value (Intransient Stock value After CompleteQC Return - Ordered Quantity) After Inventory Settlement Return is: "+(MethodsOrderFlowNegative.varIntransientStockAfterCompleteQCReturn - MethodsOrderFlowNegative.varOrderedQuantity)+ ", But Actual Intransient Stock value After Inventory Settlement Return is: "+MethodsOrderFlowNegative.varIntransientStockAfterInventorySettlementReturn+". Incorrect");
	    }
	    
	    if (MethodsOrderFlowNegative.varAvailableQuantityAfterInventorySettlementReturn == (MethodsOrderFlowNegative.varAvailableQuantityAfterCompleteQCReturn + MethodsOrderFlowNegative.varOrderedQuantity)) {
	        test.log(Status.PASS, "Available Quantity value After CompleteQC Return is: " + MethodsOrderFlowNegative.varAvailableQuantityAfterCompleteQCReturn + ", Ordered Quantity is: " + MethodsOrderFlowNegative.varOrderedQuantity + ", Expected Available Quantity value (Available Quantity value After CompleteQC Return + Ordered Quantity) After Inventory Settlement Return is: " + (MethodsOrderFlowNegative.varAvailableQuantityAfterCompleteQCReturn + MethodsOrderFlowNegative.varOrderedQuantity) + ", And Actual Available Quantity value After Inventory Settlement Return is: " + MethodsOrderFlowNegative.varAvailableQuantityAfterInventorySettlementReturn + ". Correct");
	    } else {
	        test.log(Status.FAIL, "Available Quantity value After CompleteQC Return is: " + MethodsOrderFlowNegative.varAvailableQuantityAfterCompleteQCReturn + ", Ordered Quantity is: " + MethodsOrderFlowNegative.varOrderedQuantity + ", Expected Available Quantity value (Available Quantity value After CompleteQC Return + Ordered Quantity) After Inventory Settlement Return is: " + (MethodsOrderFlowNegative.varAvailableQuantityAfterCompleteQCReturn + MethodsOrderFlowNegative.varOrderedQuantity) + ", But Actual Available Quantity value After Inventory Settlement Return is: " + MethodsOrderFlowNegative.varAvailableQuantityAfterInventorySettlementReturn + ". Incorrect");
	        softAssert.fail("Available Quantity value After CompleteQC Return is: " + MethodsOrderFlowNegative.varAvailableQuantityAfterCompleteQCReturn + ", Ordered Quantity is: " + MethodsOrderFlowNegative.varOrderedQuantity + ", Expected Available Quantity value (Available Quantity value After CompleteQC Return + Ordered Quantity) After Inventory Settlement Return is: " + (MethodsOrderFlowNegative.varAvailableQuantityAfterCompleteQCReturn + MethodsOrderFlowNegative.varOrderedQuantity) + ", But Actual Available Quantity value After Inventory Settlement Return is: " + MethodsOrderFlowNegative.varAvailableQuantityAfterInventorySettlementReturn + ". Incorrect");
	    }

	    if (MethodsOrderFlowNegative.varAvailableStockAfterInventorySettlementReturn == (MethodsOrderFlowNegative.varAvailableStockAfterCompleteQCReturn + MethodsOrderFlowNegative.varOrderedQuantity)) {
	        test.log(Status.PASS, "Available Stock value After CompleteQC Return is: " + MethodsOrderFlowNegative.varAvailableStockAfterCompleteQCReturn + ", Ordered Quantity is: " + MethodsOrderFlowNegative.varOrderedQuantity + ", Expected Available Stock value (Available Stock value After CompleteQC Return + Ordered Quantity) After Inventory Settlement Return is: " + (MethodsOrderFlowNegative.varAvailableStockAfterCompleteQCReturn + MethodsOrderFlowNegative.varOrderedQuantity) + ", And Actual Available Stock value After Inventory Settlement Return is: " + MethodsOrderFlowNegative.varAvailableStockAfterInventorySettlementReturn + ". Correct");
	    } else {
	        test.log(Status.FAIL, "Available Stock value After CompleteQC Return is: " + MethodsOrderFlowNegative.varAvailableStockAfterCompleteQCReturn + ", Ordered Quantity is: " + MethodsOrderFlowNegative.varOrderedQuantity + ", Expected Available Stock value (Available Stock value After CompleteQC Return + Ordered Quantity) After Inventory Settlement Return is: " + (MethodsOrderFlowNegative.varAvailableStockAfterCompleteQCReturn + MethodsOrderFlowNegative.varOrderedQuantity) + ", But Actual Available Stock value After Inventory Settlement Return is: " + MethodsOrderFlowNegative.varAvailableStockAfterInventorySettlementReturn + ". Incorrect");
	        softAssert.fail("Available Stock value After CompleteQC Return is: " + MethodsOrderFlowNegative.varAvailableStockAfterCompleteQCReturn + ", Ordered Quantity is: " + MethodsOrderFlowNegative.varOrderedQuantity + ", Expected Available Stock value (Available Stock value After CompleteQC Return + Ordered Quantity) After Inventory Settlement Return is: " + (MethodsOrderFlowNegative.varAvailableStockAfterCompleteQCReturn + MethodsOrderFlowNegative.varOrderedQuantity) + ", But Actual Available Stock value After Inventory Settlement Return is: " + MethodsOrderFlowNegative.varAvailableStockAfterInventorySettlementReturn + ". Incorrect");
	    }
	    
	    if(MethodsOrderFlowNegative.varStockAfterInventorySettlementReturn == MethodsOrderFlowNegative.varStockAfterCompleteQCReturn){
	        test.log(Status.PASS, "Expected Stock value (Stock value After Inventory Settlement Return = Stock value After CompleteQC Return) After Inventory Settlement Return is: " + MethodsOrderFlowNegative.varStockAfterCompleteQCReturn + " And Actual Stock value After Inventory Settlement Return is: " + MethodsOrderFlowNegative.varStockAfterInventorySettlementReturn + ". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Stock value (Stock value After Inventory Settlement Return = Stock value After CompleteQC Return) After Inventory Settlement Return is: " + MethodsOrderFlowNegative.varStockAfterCompleteQCReturn + " But Actual Stock value After Inventory Settlement Return is: " + MethodsOrderFlowNegative.varStockAfterInventorySettlementReturn + ". Incorrect");
	        softAssert.fail("Expected Stock value (Stock value After Inventory Settlement Return = Stock value After CompleteQC Return) After Inventory Settlement Return is: " + MethodsOrderFlowNegative.varStockAfterCompleteQCReturn + " But Actual Stock value After Inventory Settlement Return is: " + MethodsOrderFlowNegative.varStockAfterInventorySettlementReturn + ". Incorrect");
	    }
	    
	    if(MethodsOrderFlowNegative.varPendingStockAfterInventorySettlementReturn == MethodsOrderFlowNegative.varPendingStockAfterCompleteQCReturn){
	        test.log(Status.PASS, "Expected Pending Stock value (Pending Stock value After Inventory Settlement Return = Pending Stock value After CompleteQC Return) After Inventory Settlement Return is: "+MethodsOrderFlowNegative.varPendingStockAfterCompleteQCReturn+" And Actual Pending Stock value After Inventory Settlement Return is: "+MethodsOrderFlowNegative.varPendingStockAfterInventorySettlementReturn+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Pending Stock value (Pending Stock value After Inventory Settlement Return = Pending Stock value After CompleteQC Return) After Inventory Settlement Return is: "+MethodsOrderFlowNegative.varPendingStockAfterCompleteQCReturn+" But Actual Pending Stock value After Inventory Settlement Return is: "+MethodsOrderFlowNegative.varPendingStockAfterInventorySettlementReturn+". Incorrect");
	        softAssert.fail("Expected Pending Stock value (Pending Stock value After Inventory Settlement Return = Pending Stock value After CompleteQC Return) After Inventory Settlement Return is: "+MethodsOrderFlowNegative.varPendingStockAfterCompleteQCReturn+" But Actual Pending Stock value After Inventory Settlement Return is: "+MethodsOrderFlowNegative.varPendingStockAfterInventorySettlementReturn+". Incorrect");
	    }
	}
}