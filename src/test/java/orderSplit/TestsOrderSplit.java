package orderSplit;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import allCommonData.TestHelper;
import io.restassured.response.Response;
import utilities.ExtentReportManager;

public class TestsOrderSplit {
	
	@Test(priority = 1,groups = {"OrderSplit"})
	public void testOrderSplitInventoryDetailsBeforeCreateOrder(){
		SoftAssert softAssert = new SoftAssert();
		
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderSplit.methodOrderSplitInventoryDetailsBeforeCreateOrder();
        
		TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    
	    if(MethodsOrderSplit.varPendingStockBeforeCreateOrder>=0){
	    	test.log(Status.PASS, "Expected Pending Stock value before Create Order should be long number "+ "And Actual is: "+MethodsOrderSplit.varPendingStockBeforeCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Pending Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderSplit.varPendingStockBeforeCreateOrder+". Incorrect");
	    	softAssert.fail("Expected Pending Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderSplit.varPendingStockBeforeCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderSplit.varTotalDemandBeforeCreateOrder>=0){
	    	test.log(Status.PASS, "Expected Total Demand value before Create Order should be long number "+ "And Actual is: "+MethodsOrderSplit.varTotalDemandBeforeCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Total Demand value before Create Order should be long number "+ "But Actual is: "+MethodsOrderSplit.varTotalDemandBeforeCreateOrder+". Incorrect");
	    	softAssert.fail("Expected Total Demand value should be before Create Order long number "+ "But Actual is: "+MethodsOrderSplit.varTotalDemandBeforeCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderSplit.varStockBeforeCreateOrder>=0){
	    	test.log(Status.PASS, "Expected Stock value before Create Order should be long number "+ "And Actual is: "+MethodsOrderSplit.varStockBeforeCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderSplit.varStockBeforeCreateOrder+". Incorrect");
	    	softAssert.fail("Expected Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderSplit.varStockBeforeCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderSplit.varIntransientStockBeforeCreateOrder>=0){
	    	test.log(Status.PASS, "Expected Intransient Stock value before Create Order should be long number "+ "And Actual is: "+MethodsOrderSplit.varIntransientStockBeforeCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Intransient Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderSplit.varIntransientStockBeforeCreateOrder+". Incorrect");
	    	softAssert.fail("Expected Intransient Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderSplit.varIntransientStockBeforeCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderSplit.varAvailableStockBeforeCreateOrder>=0){
	    	test.log(Status.PASS, "Expected Available Stock value before Create Order should be long number "+ "And Actual is: "+MethodsOrderSplit.varAvailableStockBeforeCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Available Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderSplit.varAvailableStockBeforeCreateOrder+". Incorrect");
	    	softAssert.fail("Expected Available Stock value before Create Order should be long number "+ "But Actual is: "+MethodsOrderSplit.varAvailableStockBeforeCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderSplit.varUsedQuantityBeforeCreateOrder>=0){
	    	test.log(Status.PASS, "Expected Used Quantity value before Create Order should be long number "+ "And Actual is: "+MethodsOrderSplit.varUsedQuantityBeforeCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Used Quantity value before Create Order should be long number "+ "But Actual is: "+MethodsOrderSplit.varUsedQuantityBeforeCreateOrder+". Incorrect");
	    	softAssert.fail("Expected Used Quantity value should be before Create Order long number "+ "But Actual is: "+MethodsOrderSplit.varUsedQuantityBeforeCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderSplit.varAvailableQuantityBeforeCreateOrder>=0){
	    	test.log(Status.PASS, "Expected Available Quantity value before Create Order should be long number "+ "And Actual is: "+MethodsOrderSplit.varAvailableQuantityBeforeCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Available Quantity value before Create Order should be long number "+ "But Actual is: "+MethodsOrderSplit.varAvailableQuantityBeforeCreateOrder+". Incorrect");
	    	softAssert.fail("Expected Available Quantity value should be before Create Order long number "+ "But Actual is: "+MethodsOrderSplit.varAvailableQuantityBeforeCreateOrder+". Incorrect");
	    }
	    
	    softAssert.assertAll();
	}
	
	
	
	@Test(dependsOnMethods = "testOrderSplitInventoryDetailsBeforeCreateOrder", groups = {"OrderSplit"})
	public void testOrderSplitCreateOrder(){
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderSplit.methodOrderSplitCreateOrder();
        
		TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    TestHelper.validateStatus(test, response, "Created");
	    TestHelper.validateId(test, response);
	}

	
	
	@Test(dependsOnMethods = "testOrderSplitCreateOrder",groups = {"OrderSplit"})
	public void testOrderSplitInventoryDetailsAfterCreateOrder(){
		SoftAssert softAssert = new SoftAssert();
		
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderSplit.methodOrderSplitInventoryDetailsAfterCreateOrder();
        
		TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    
	    if(MethodsOrderSplit.varPendingStockAfterCreateOrder==(MethodsOrderSplit.varPendingStockBeforeCreateOrder+MethodsOrderSplit.varOrderedQuantity)){
	    	test.log(Status.PASS, "Pending Stock value Before Create Order is: "+MethodsOrderSplit.varPendingStockBeforeCreateOrder+", Ordered Quantity is: "+MethodsOrderSplit.varOrderedQuantity+ ", Expected Pending Stock value (Pending Stock Value Before Creating Order + Ordered Quantity) After Create Order is: "+(MethodsOrderSplit.varPendingStockBeforeCreateOrder+MethodsOrderSplit.varOrderedQuantity)+ ", And Actual Pending Stock value After Create Order is: "+MethodsOrderSplit.varPendingStockAfterCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Pending Stock value Before Create Order is: "+MethodsOrderSplit.varPendingStockBeforeCreateOrder+", Ordered Quantity is: "+MethodsOrderSplit.varOrderedQuantity+ ", Expected Pending Stock value (Pending Stock Value Before Creating Order + Ordered Quantity) After Create Order is: "+(MethodsOrderSplit.varPendingStockBeforeCreateOrder+MethodsOrderSplit.varOrderedQuantity)+ ", But Actual Pending Stock value After Create Order is: "+MethodsOrderSplit.varPendingStockAfterCreateOrder+". Incorrect");
	    	softAssert.fail("Pending Stock value Before Create Order is: "+MethodsOrderSplit.varPendingStockBeforeCreateOrder+", Ordered Quantity is: "+MethodsOrderSplit.varOrderedQuantity+ ", Expected Pending Stock value (Pending Stock Value Before Creating Order + Ordered Quantity) After Create Order is: "+(MethodsOrderSplit.varPendingStockBeforeCreateOrder+MethodsOrderSplit.varOrderedQuantity)+ ", But Actual Pending Stock value After Create Order is: "+MethodsOrderSplit.varPendingStockAfterCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderSplit.varTotalDemandAfterCreateOrder==(MethodsOrderSplit.varTotalDemandBeforeCreateOrder+MethodsOrderSplit.varOrderedQuantity)){
	    	test.log(Status.PASS, "Total Demand value Before Create Order is: "+MethodsOrderSplit.varTotalDemandBeforeCreateOrder+", Ordered Quantity is: "+MethodsOrderSplit.varOrderedQuantity+ ", Expected Total Demand value (Total Demand Value Before Creating Order + Ordered Quantity) After Create Order is: "+(MethodsOrderSplit.varTotalDemandBeforeCreateOrder+MethodsOrderSplit.varOrderedQuantity)+ ", And Actual Total Demand value After Create Order is: "+MethodsOrderSplit.varTotalDemandAfterCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Total Demand value Before Create Order is: "+MethodsOrderSplit.varTotalDemandBeforeCreateOrder+", Ordered Quantity is: "+MethodsOrderSplit.varOrderedQuantity+ ", Expected Total Demand value (Total Demand Value Before Creating Order + Ordered Quantity) After Create Order is: "+(MethodsOrderSplit.varTotalDemandBeforeCreateOrder+MethodsOrderSplit.varOrderedQuantity)+ ", But Actual Total Demand value After Create Order is: "+MethodsOrderSplit.varTotalDemandAfterCreateOrder+". Incorrect");
	    	softAssert.fail("Total Demand value Before Create Order is: "+MethodsOrderSplit.varTotalDemandBeforeCreateOrder+", Ordered Quantity is: "+MethodsOrderSplit.varOrderedQuantity+ ", Expected Total Demand value (Pending Stock Value Before Creating Order + Ordered Quantity) After Create Order is: "+(MethodsOrderSplit.varTotalDemandBeforeCreateOrder+MethodsOrderSplit.varOrderedQuantity)+ ", But Actual Total Demand value After Create Order is: "+MethodsOrderSplit.varTotalDemandAfterCreateOrder+". Incorrect");
	    }
	    
	    if(MethodsOrderSplit.varAvailableQuantityAfterCreateOrder==MethodsOrderSplit.varAvailableQuantityBeforeCreateOrder){
	    	test.log(Status.PASS, "Expected Available Quantity value (Available Quantity value After Create Order = Available Quantity value Before Create Order) After Create Order is: "+MethodsOrderSplit.varAvailableQuantityBeforeCreateOrder+" And Actual Available Quantity value After Create Order is: "+MethodsOrderSplit.varAvailableQuantityAfterCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Available Quantity value (Available Quantity value After Create Order = Available Quantity value Before Create Order) After Create Order is: "+MethodsOrderSplit.varAvailableQuantityBeforeCreateOrder+" But Actual Available Quantity value After Create Order is: "+MethodsOrderSplit.varAvailableQuantityAfterCreateOrder+". InCorrect");
	    	softAssert.fail("Expected Available Quantity value (Available Quantity value After Create Order = Available Quantity value Before Create Order) After Create Order is: "+MethodsOrderSplit.varAvailableQuantityBeforeCreateOrder+" But Actual Available Quantity value After Create Order is: "+MethodsOrderSplit.varAvailableQuantityAfterCreateOrder+". InCorrect");
	    }
	    
	    if(MethodsOrderSplit.varStockAfterCreateOrder==MethodsOrderSplit.varStockBeforeCreateOrder){
	    	test.log(Status.PASS, "Expected Stock value (Stock value After Create Order = Stock value Before Create Order) After Create Order is: "+MethodsOrderSplit.varStockBeforeCreateOrder+" And Actual Stock value After Create Order is: "+MethodsOrderSplit.varStockAfterCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Stock value (Stock value After Create Order = Stock value Before Create Order) After Create Order is: "+MethodsOrderSplit.varStockBeforeCreateOrder+" But Actual Stock value After Create Order is: "+MethodsOrderSplit.varStockAfterCreateOrder+". InCorrect");
	    	softAssert.fail("Expected Stock value (Stock value After Create Order = Stock value Before Create Order) After Create Order is: "+MethodsOrderSplit.varStockBeforeCreateOrder+" But Actual Stock value After Create Order is: "+MethodsOrderSplit.varStockAfterCreateOrder+". InCorrect");
	    }
	    
	    if(MethodsOrderSplit.varIntransientStockAfterCreateOrder==MethodsOrderSplit.varIntransientStockBeforeCreateOrder){
	    	test.log(Status.PASS, "Expected Intransient Stock value (Intransient Stock value After Create Order = Intransient Stock value Before Create Order) After Create Order is: "+MethodsOrderSplit.varIntransientStockBeforeCreateOrder+" And Actual Intransient Stock value After Create Order is: "+MethodsOrderSplit.varIntransientStockAfterCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Intransient Stock value (Intransient Stock value After Create Order = Intransient Stock value Before Create Order) After Create Order is: "+MethodsOrderSplit.varIntransientStockBeforeCreateOrder+" But Actual Intransient Stock value After Create Order is: "+MethodsOrderSplit.varIntransientStockAfterCreateOrder+". InCorrect");
	    	softAssert.fail("Expected Intransient Stock value (Intransient Stock value After Create Order = Intransient Stock value Before Create Order) After Create Order is: "+MethodsOrderSplit.varIntransientStockBeforeCreateOrder+" But Actual Intransient Stock value After Create Order is: "+MethodsOrderSplit.varIntransientStockAfterCreateOrder+". InCorrect");
	    }
	    
	    if(MethodsOrderSplit.varAvailableStockAfterCreateOrder==MethodsOrderSplit.varAvailableStockBeforeCreateOrder){
	    	test.log(Status.PASS, "Expected Available Stock value (Available Stock value After Create Order = Available Stock value Before Create Order) After Create Order is: "+MethodsOrderSplit.varAvailableStockBeforeCreateOrder+" And Actual Available Stock value After Create Order is: "+MethodsOrderSplit.varAvailableStockAfterCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Available Stock value (Available Stock value After Create Order = Available Stock value Before Create Order) After Create Order is: "+MethodsOrderSplit.varAvailableStockBeforeCreateOrder+" But Actual Available Stock value After Create Order is: "+MethodsOrderSplit.varAvailableStockAfterCreateOrder+". InCorrect");
	    	softAssert.fail("Expected Available Stock value (Available Stock value After Create Order = Available Stock value Before Create Order) After Create Order is: "+MethodsOrderSplit.varAvailableStockBeforeCreateOrder+" But Actual Available Stock value After Create Order is: "+MethodsOrderSplit.varAvailableStockAfterCreateOrder+". InCorrect");
	    }
	    
	    if(MethodsOrderSplit.varUsedQuantityAfterCreateOrder==MethodsOrderSplit.varUsedQuantityBeforeCreateOrder){
	    	test.log(Status.PASS, "Expected Used Quantity value (Used Quantity value After Create Order = Used Quantity value Before Create Order) After Create Order is: "+MethodsOrderSplit.varUsedQuantityBeforeCreateOrder+" And Actual Available Stock value After Create Order is: "+MethodsOrderSplit.varUsedQuantityAfterCreateOrder+". Correct");
	    } else {
	    	test.log(Status.FAIL, "Expected Used Quantity value (Used Quantity value After Create Order = Used Quantity value Before Create Order) After Create Order is: "+MethodsOrderSplit.varUsedQuantityBeforeCreateOrder+" But Actual Available Stock value After Create Order is: "+MethodsOrderSplit.varUsedQuantityAfterCreateOrder+". InCorrect");
	    	softAssert.fail("Expected Used Quantity value (Used Quantity value After Create Order = Used Quantity value Before Create Order) After Create Order is: "+MethodsOrderSplit.varUsedQuantityBeforeCreateOrder+" But Actual Available Stock value After Create Order is: "+MethodsOrderSplit.varUsedQuantityAfterCreateOrder+". InCorrect");
	    }
	    
	    softAssert.assertAll();
	}
	
	
	
	@Test(dependsOnMethods = "testOrderSplitInventoryDetailsAfterCreateOrder", groups = {"OrderSplit"})
	public void testOrderSplitSplitOrder(){
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderSplit.methodOrderSplitSplitOrder();
        
		TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    TestHelper.validateStatus(test, response, "Created");
	    TestHelper.validateId(test, response);
	    test.log(Status.INFO, "NEW ORDER ID IS :- "+MethodsOrderSplit.varOrderIdNew);
	}
	
	
	
	@Test(dependsOnMethods = "testOrderSplitSplitOrder",groups = {"OrderSplit"})
	public void testOrderSplitInventoryDetailsAfterSplitOrder(){
		SoftAssert softAssert = new SoftAssert();
		
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderSplit.methodOrderSplitInventoryDetailsAfterSplitOrder();
        
		TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    
	    if(MethodsOrderSplit.varPendingStockAfterSplitOrder == MethodsOrderSplit.varPendingStockAfterCreateOrder){
	        test.log(Status.PASS, "Expected Pending Stock value (Pending Stock value After Split Order = Pending Stock value After Create Order) After Split Order is: "+MethodsOrderSplit.varPendingStockAfterCreateOrder+" And Actual Pending Stock value After Split Order is: "+MethodsOrderSplit.varPendingStockAfterSplitOrder+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Pending Stock value (Pending Stock value After Split Order = Pending Stock value After Create Order) After Split Order is: "+MethodsOrderSplit.varPendingStockAfterCreateOrder+" But Actual Pending Stock value After Split Order is: "+MethodsOrderSplit.varPendingStockAfterSplitOrder+". Incorrect");
	        softAssert.fail("Expected Pending Stock value (Pending Stock value After Split Order = Pending Stock value After Create Order) After Split Order is: "+MethodsOrderSplit.varPendingStockAfterCreateOrder+" But Actual Pending Stock value After Split Order is: "+MethodsOrderSplit.varPendingStockAfterSplitOrder+". Incorrect");
	    }

	    if(MethodsOrderSplit.varTotalDemandAfterSplitOrder == MethodsOrderSplit.varTotalDemandAfterCreateOrder){
	        test.log(Status.PASS, "Expected Total Demand value (Total Demand value After Split Order = Total Demand value After Create Order) After Split Order is: "+MethodsOrderSplit.varTotalDemandAfterCreateOrder+" And Actual Total Demand value After Split Order is: "+MethodsOrderSplit.varTotalDemandAfterSplitOrder+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Total Demand value (Total Demand value After Split Order = Total Demand value After Create Order) After Split Order is: "+MethodsOrderSplit.varTotalDemandAfterCreateOrder+" But Actual Total Demand value After Split Order is: "+MethodsOrderSplit.varTotalDemandAfterSplitOrder+". Incorrect");
	        softAssert.fail("Expected Total Demand value (Total Demand value After Split Order = Total Demand value After Create Order) After Split Order is: "+MethodsOrderSplit.varTotalDemandAfterCreateOrder+" But Actual Total Demand value After Split Order is: "+MethodsOrderSplit.varTotalDemandAfterSplitOrder+". Incorrect");
	    }

	    if(MethodsOrderSplit.varAvailableQuantityAfterSplitOrder==MethodsOrderSplit.varAvailableQuantityAfterCreateOrder){
	        test.log(Status.PASS, "Expected Available Quantity value (Available Quantity value After Split Order = Available Quantity value After Create Order) After Split Order is: "+MethodsOrderSplit.varAvailableQuantityAfterCreateOrder+" And Actual Available Quantity value After Split Order is: "+MethodsOrderSplit.varAvailableQuantityAfterSplitOrder+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Available Quantity value (Available Quantity value After Split Order = Available Quantity value After Create Order) After Split Order is: "+MethodsOrderSplit.varAvailableQuantityAfterCreateOrder+" But Actual Available Quantity value After Split Order is: "+MethodsOrderSplit.varAvailableQuantityAfterSplitOrder+". Incorrect");
	        softAssert.fail("Expected Available Quantity value (Available Quantity value After Split Order = Available Quantity value After Create Order) After Split Order is: "+MethodsOrderSplit.varAvailableQuantityAfterCreateOrder+" But Actual Available Quantity value After Split Order is: "+MethodsOrderSplit.varAvailableQuantityAfterSplitOrder+". Incorrect");
	    }

	    if(MethodsOrderSplit.varStockAfterSplitOrder==MethodsOrderSplit.varStockAfterCreateOrder){
	        test.log(Status.PASS, "Expected Stock value (Stock value After Split Order = Stock value After Create Order) After Split Order is: "+MethodsOrderSplit.varStockAfterCreateOrder+" And Actual Stock value After Split Order is: "+MethodsOrderSplit.varStockAfterSplitOrder+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Stock value (Stock value After Split Order = Stock value After Create Order) After Split Order is: "+MethodsOrderSplit.varStockAfterCreateOrder+" But Actual Stock value After Split Order is: "+MethodsOrderSplit.varStockAfterSplitOrder+". Incorrect");
	        softAssert.fail("Expected Stock value (Stock value After Split Order = Stock value After Create Order) After Split Order is: "+MethodsOrderSplit.varStockAfterCreateOrder+" But Actual Stock value After Split Order is: "+MethodsOrderSplit.varStockAfterSplitOrder+". Incorrect");
	    }

	    if(MethodsOrderSplit.varIntransientStockAfterSplitOrder==MethodsOrderSplit.varIntransientStockAfterCreateOrder){
	        test.log(Status.PASS, "Expected Intransient Stock value (Intransient Stock value After Split Order = Intransient Stock value After Create Order) After Split Order is: "+MethodsOrderSplit.varIntransientStockAfterCreateOrder+" And Actual Intransient Stock value After Split Order is: "+MethodsOrderSplit.varIntransientStockAfterSplitOrder+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Intransient Stock value (Intransient Stock value After Split Order = Intransient Stock value After Create Order) After Split Order is: "+MethodsOrderSplit.varIntransientStockAfterCreateOrder+" But Actual Intransient Stock value After Split Order is: "+MethodsOrderSplit.varIntransientStockAfterSplitOrder+". Incorrect");
	        softAssert.fail("Expected Intransient Stock value (Intransient Stock value After Split Order = Intransient Stock value After Create Order) After Split Order is: "+MethodsOrderSplit.varIntransientStockAfterCreateOrder+" But Actual Intransient Stock value After Split Order is: "+MethodsOrderSplit.varIntransientStockAfterSplitOrder+". Incorrect");
	    }

	    if(MethodsOrderSplit.varAvailableStockAfterSplitOrder==MethodsOrderSplit.varAvailableStockAfterCreateOrder){
	        test.log(Status.PASS, "Expected Available Stock value (Available Stock value After Split Order = Available Stock value After Create Order) After Split Order is: "+MethodsOrderSplit.varAvailableStockAfterCreateOrder+" And Actual Available Stock value After Split Order is: "+MethodsOrderSplit.varAvailableStockAfterSplitOrder+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Available Stock value (Available Stock value After Split Order = Available Stock value After Create Order) After Split Order is: "+MethodsOrderSplit.varAvailableStockAfterCreateOrder+" But Actual Available Stock value After Split Order is: "+MethodsOrderSplit.varAvailableStockAfterSplitOrder+". Incorrect");
	        softAssert.fail("Expected Available Stock value (Available Stock value After Split Order = Available Stock value After Create Order) After Split Order is: "+MethodsOrderSplit.varAvailableStockAfterCreateOrder+" But Actual Available Stock value After Split Order is: "+MethodsOrderSplit.varAvailableStockAfterSplitOrder+". Incorrect");
	    }

	    if(MethodsOrderSplit.varUsedQuantityAfterSplitOrder==MethodsOrderSplit.varUsedQuantityAfterCreateOrder){
	        test.log(Status.PASS, "Expected Used Quantity value (Used Quantity value After Split Order = Used Quantity value After Create Order) After Split Order is: "+MethodsOrderSplit.varUsedQuantityAfterCreateOrder+" And Actual Used Quantity value After Split Order is: "+MethodsOrderSplit.varUsedQuantityAfterSplitOrder+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Used Quantity value (Used Quantity value After Split Order = Used Quantity value After Create Order) After Split Order is: "+MethodsOrderSplit.varUsedQuantityAfterCreateOrder+" But Actual Used Quantity value After Split Order is: "+MethodsOrderSplit.varUsedQuantityAfterSplitOrder+". Incorrect");
	        softAssert.fail("Expected Used Quantity value (Used Quantity value After Split Order = Used Quantity value After Create Order) After Split Order is: "+MethodsOrderSplit.varUsedQuantityAfterCreateOrder+" But Actual Used Quantity value After Split Order is: "+MethodsOrderSplit.varUsedQuantityAfterSplitOrder+". Incorrect");
	    }
	    
	    softAssert.assertAll();
	}
	
	
	
	@Test(dependsOnMethods = "testOrderSplitInventoryDetailsAfterSplitOrder", groups = {"OrderSplit"})
	public void testOrderSplitSplitNewOrder(){
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderSplit.methodOrderSplitSplitNewOrder();
        
		TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    TestHelper.validateStatus(test, response, "Created");
	    TestHelper.validateId(test, response);
	}
	
	
	
	@Test(dependsOnMethods = "testOrderSplitSplitNewOrder",groups = {"OrderSplit"})
	public void testOrderSplitInventoryDetailsAfterSplitNewOrder(){
		SoftAssert softAssert = new SoftAssert();
		
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderSplit.methodOrderSplitInventoryDetailsAfterSplitNewOrder();
        
		TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    
	    if(MethodsOrderSplit.varPendingStockAfterSplitNewOrder == MethodsOrderSplit.varPendingStockAfterSplitOrder){
	        test.log(Status.PASS, "Expected Pending Stock value (Pending Stock value After Split New Order = Pending Stock value After Split Order) After Split New Order is: "+MethodsOrderSplit.varPendingStockAfterSplitOrder+" And Actual Pending Stock value After Split New Order is: "+MethodsOrderSplit.varPendingStockAfterSplitNewOrder+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Pending Stock value (Pending Stock value After Split New Order = Pending Stock value After Split Order) After Split New Order is: "+MethodsOrderSplit.varPendingStockAfterSplitOrder+" But Actual Pending Stock value After Split New Order is: "+MethodsOrderSplit.varPendingStockAfterSplitNewOrder+". Incorrect");
	        softAssert.fail("Expected Pending Stock value (Pending Stock value After Split New Order = Pending Stock value After Split Order) After Split New Order is: "+MethodsOrderSplit.varPendingStockAfterSplitOrder+" But Actual Pending Stock value After Split New Order is: "+MethodsOrderSplit.varPendingStockAfterSplitNewOrder+". Incorrect");
	    }

	    if(MethodsOrderSplit.varTotalDemandAfterSplitNewOrder == MethodsOrderSplit.varTotalDemandAfterSplitOrder){
	        test.log(Status.PASS, "Expected Total Demand value (Total Demand value After Split New Order = Total Demand value After Split Order) After Split New Order is: "+MethodsOrderSplit.varTotalDemandAfterSplitOrder+" And Actual Total Demand value After Split New Order is: "+MethodsOrderSplit.varTotalDemandAfterSplitNewOrder+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Total Demand value (Total Demand value After Split New Order = Total Demand value After Split Order) After Split New Order is: "+MethodsOrderSplit.varTotalDemandAfterSplitOrder+" But Actual Total Demand value After Split New Order is: "+MethodsOrderSplit.varTotalDemandAfterSplitNewOrder+". Incorrect");
	        softAssert.fail("Expected Total Demand value (Total Demand value After Split New Order = Total Demand value After Split Order) After Split New Order is: "+MethodsOrderSplit.varTotalDemandAfterSplitOrder+" But Actual Total Demand value After Split New Order is: "+MethodsOrderSplit.varTotalDemandAfterSplitNewOrder+". Incorrect");
	    }

	    if(MethodsOrderSplit.varAvailableQuantityAfterSplitNewOrder == MethodsOrderSplit.varAvailableQuantityAfterSplitOrder){
	        test.log(Status.PASS, "Expected Available Quantity value (Available Quantity value After Split New Order = Available Quantity value After Split Order) After Split New Order is: "+MethodsOrderSplit.varAvailableQuantityAfterSplitOrder+" And Actual Available Quantity value After Split New Order is: "+MethodsOrderSplit.varAvailableQuantityAfterSplitNewOrder+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Available Quantity value (Available Quantity value After Split New Order = Available Quantity value After Split Order) After Split New Order is: "+MethodsOrderSplit.varAvailableQuantityAfterSplitOrder+" But Actual Available Quantity value After Split New Order is: "+MethodsOrderSplit.varAvailableQuantityAfterSplitNewOrder+". Incorrect");
	        softAssert.fail("Expected Available Quantity value (Available Quantity value After Split New Order = Available Quantity value After Split Order) After Split New Order is: "+MethodsOrderSplit.varAvailableQuantityAfterSplitOrder+" But Actual Available Quantity value After Split New Order is: "+MethodsOrderSplit.varAvailableQuantityAfterSplitNewOrder+". Incorrect");
	    }

	    if(MethodsOrderSplit.varStockAfterSplitNewOrder == MethodsOrderSplit.varStockAfterSplitOrder){
	        test.log(Status.PASS, "Expected Stock value (Stock value After Split New Order = Stock value After Split Order) After Split New Order is: "+MethodsOrderSplit.varStockAfterSplitOrder+" And Actual Stock value After Split New Order is: "+MethodsOrderSplit.varStockAfterSplitNewOrder+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Stock value (Stock value After Split New Order = Stock value After Split Order) After Split New Order is: "+MethodsOrderSplit.varStockAfterSplitOrder+" But Actual Stock value After Split New Order is: "+MethodsOrderSplit.varStockAfterSplitNewOrder+". Incorrect");
	        softAssert.fail("Expected Stock value (Stock value After Split New Order = Stock value After Split Order) After Split New Order is: "+MethodsOrderSplit.varStockAfterSplitOrder+" But Actual Stock value After Split New Order is: "+MethodsOrderSplit.varStockAfterSplitNewOrder+". Incorrect");
	    }

	    if(MethodsOrderSplit.varIntransientStockAfterSplitNewOrder == MethodsOrderSplit.varIntransientStockAfterSplitOrder){
	        test.log(Status.PASS, "Expected Intransient Stock value (Intransient Stock value After Split New Order = Intransient Stock value After Split Order) After Split New Order is: "+MethodsOrderSplit.varIntransientStockAfterSplitOrder+" And Actual Intransient Stock value After Split New Order is: "+MethodsOrderSplit.varIntransientStockAfterSplitNewOrder+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Intransient Stock value (Intransient Stock value After Split New Order = Intransient Stock value After Split Order) After Split New Order is: "+MethodsOrderSplit.varIntransientStockAfterSplitOrder+" But Actual Intransient Stock value After Split New Order is: "+MethodsOrderSplit.varIntransientStockAfterSplitNewOrder+". Incorrect");
	        softAssert.fail("Expected Intransient Stock value (Intransient Stock value After Split New Order = Intransient Stock value After Split Order) After Split New Order is: "+MethodsOrderSplit.varIntransientStockAfterSplitOrder+" But Actual Intransient Stock value After Split New Order is: "+MethodsOrderSplit.varIntransientStockAfterSplitNewOrder+". Incorrect");
	    }

	    if(MethodsOrderSplit.varAvailableStockAfterSplitNewOrder == MethodsOrderSplit.varAvailableStockAfterSplitOrder){
	        test.log(Status.PASS, "Expected Available Stock value (Available Stock value After Split New Order = Available Stock value After Split Order) After Split New Order is: "+MethodsOrderSplit.varAvailableStockAfterSplitOrder+" And Actual Available Stock value After Split New Order is: "+MethodsOrderSplit.varAvailableStockAfterSplitNewOrder+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Available Stock value (Available Stock value After Split New Order = Available Stock value After Split Order) After Split New Order is: "+MethodsOrderSplit.varAvailableStockAfterSplitOrder+" But Actual Available Stock value After Split New Order is: "+MethodsOrderSplit.varAvailableStockAfterSplitNewOrder+". Incorrect");
	        softAssert.fail("Expected Available Stock value (Available Stock value After Split New Order = Available Stock value After Split Order) After Split New Order is: "+MethodsOrderSplit.varAvailableStockAfterSplitOrder+" But Actual Available Stock value After Split New Order is: "+MethodsOrderSplit.varAvailableStockAfterSplitNewOrder+". Incorrect");
	    }

	    if(MethodsOrderSplit.varUsedQuantityAfterSplitNewOrder == MethodsOrderSplit.varUsedQuantityAfterSplitOrder){
	        test.log(Status.PASS, "Expected Used Quantity value (Used Quantity value After Split New Order = Used Quantity value After Split Order) After Split New Order is: "+MethodsOrderSplit.varUsedQuantityAfterSplitOrder+" And Actual Used Quantity value After Split New Order is: "+MethodsOrderSplit.varUsedQuantityAfterSplitNewOrder+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Used Quantity value (Used Quantity value After Split New Order = Used Quantity value After Split Order) After Split New Order is: "+MethodsOrderSplit.varUsedQuantityAfterSplitOrder+" But Actual Used Quantity value After Split New Order is: "+MethodsOrderSplit.varUsedQuantityAfterSplitNewOrder+". Incorrect");
	        softAssert.fail("Expected Used Quantity value (Used Quantity value After Split New Order = Used Quantity value After Split Order) After Split New Order is: "+MethodsOrderSplit.varUsedQuantityAfterSplitOrder+" But Actual Used Quantity value After Split New Order is: "+MethodsOrderSplit.varUsedQuantityAfterSplitNewOrder+". Incorrect");
	    }

	    softAssert.assertAll();
	}

	
	
	@Test(dependsOnMethods = "testOrderSplitInventoryDetailsAfterSplitOrder", groups = {"OrderSplit"})
	public void testOrderSplitSplitOrderAgain(){
		SoftAssert softAssert = new SoftAssert();
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderSplit.methodOrderSplitSplitOrderAgain();
        
		TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 400);
	    
	    String actualErrorMessage = response.jsonPath().getString("errorMessage");
	    String expectedErrorMessage = "Order is already split. Cannot split again.";
	    if (!actualErrorMessage.equals(expectedErrorMessage)) {
            test.log(Status.FAIL, "Expected Error Message is: " + expectedErrorMessage + " But Actual Error Message is: " + actualErrorMessage);
            softAssert.fail("Expected Error Message is: " + expectedErrorMessage + " But Actual Error Message is: " + actualErrorMessage);
        } else {
            test.log(Status.PASS, "Passed because Expected Error Message is = Actual Error Message");
        }
	    
	    boolean actualSuccess = response.jsonPath().getBoolean("success");
        boolean expectedSuccess = false;
        if (actualSuccess != expectedSuccess) {
            test.log(Status.FAIL, "Expected Success is: " + expectedSuccess + " But Actual Success is: " + actualSuccess);
            softAssert.fail("Expected Success is: " + expectedSuccess + " But Actual Success is: " + actualSuccess);
        } else {
            test.log(Status.PASS, "Passed because Expected Success is = Actual Success");
        }
	}
	
	
	
	@Test(dependsOnMethods = "testOrderSplitSplitOrderAgain",groups = {"OrderSplit"})
	public void testOrderSplitInventoryDetailsAfterSplitOrderAgain(){
		SoftAssert softAssert = new SoftAssert();
		
		ExtentTest test = ExtentReportManager.getTest();
		Response response = MethodsOrderSplit.methodOrderSplitInventoryDetailsAfterSplitOrderAgain();
        
		TestHelper.logDetails(test, response);
	    TestHelper.validateStatusCode(test, response, 200);
	    
	    if(MethodsOrderSplit.varPendingStockAfterSplitOrderAgain == MethodsOrderSplit.varPendingStockAfterSplitOrder){
	        test.log(Status.PASS, "Expected Pending Stock value (Pending Stock value After Split Order Again = Pending Stock value After Split Order) After Split Order Again is: "+MethodsOrderSplit.varPendingStockAfterSplitOrder+" And Actual Pending Stock value After Split Order Again is: "+MethodsOrderSplit.varPendingStockAfterSplitOrderAgain+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Pending Stock value (Pending Stock value After Split Order Again = Pending Stock value After Split Order) After Split Order Again is: "+MethodsOrderSplit.varPendingStockAfterSplitOrder+" But Actual Pending Stock value After Split Order Again is: "+MethodsOrderSplit.varPendingStockAfterSplitOrderAgain+". Incorrect");
	        softAssert.fail("Expected Pending Stock value (Pending Stock value After Split Order Again = Pending Stock value After Split Order) After Split Order Again is: "+MethodsOrderSplit.varPendingStockAfterSplitOrder+" But Actual Pending Stock value After Split Order Again is: "+MethodsOrderSplit.varPendingStockAfterSplitOrderAgain+". Incorrect");
	    }

	    if(MethodsOrderSplit.varTotalDemandAfterSplitOrderAgain == MethodsOrderSplit.varTotalDemandAfterSplitOrder){
	        test.log(Status.PASS, "Expected Total Demand value (Total Demand value After Split Order Again = Total Demand value After Split Order) After Split Order Again is: "+MethodsOrderSplit.varTotalDemandAfterSplitOrder+" And Actual Total Demand value After Split Order Again is: "+MethodsOrderSplit.varTotalDemandAfterSplitOrderAgain+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Total Demand value (Total Demand value After Split Order Again = Total Demand value After Split Order) After Split Order Again is: "+MethodsOrderSplit.varTotalDemandAfterSplitOrder+" But Actual Total Demand value After Split Order Again is: "+MethodsOrderSplit.varTotalDemandAfterSplitOrderAgain+". Incorrect");
	        softAssert.fail("Expected Total Demand value (Total Demand value After Split Order Again = Total Demand value After Split Order) After Split Order Again is: "+MethodsOrderSplit.varTotalDemandAfterSplitOrder+" But Actual Total Demand value After Split Order Again is: "+MethodsOrderSplit.varTotalDemandAfterSplitOrderAgain+". Incorrect");
	    }

	    if(MethodsOrderSplit.varAvailableQuantityAfterSplitOrderAgain == MethodsOrderSplit.varAvailableQuantityAfterSplitOrder){
	        test.log(Status.PASS, "Expected Available Quantity value (Available Quantity value After Split Order Again = Available Quantity value After Split Order) After Split Order Again is: "+MethodsOrderSplit.varAvailableQuantityAfterSplitOrder+" And Actual Available Quantity value After Split Order Again is: "+MethodsOrderSplit.varAvailableQuantityAfterSplitOrderAgain+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Available Quantity value (Available Quantity value After Split Order Again = Available Quantity value After Split Order) After Split Order Again is: "+MethodsOrderSplit.varAvailableQuantityAfterSplitOrder+" But Actual Available Quantity value After Split Order Again is: "+MethodsOrderSplit.varAvailableQuantityAfterSplitOrderAgain+". Incorrect");
	        softAssert.fail("Expected Available Quantity value (Available Quantity value After Split Order Again = Available Quantity value After Split Order) After Split Order Again is: "+MethodsOrderSplit.varAvailableQuantityAfterSplitOrder+" But Actual Available Quantity value After Split Order Again is: "+MethodsOrderSplit.varAvailableQuantityAfterSplitOrderAgain+". Incorrect");
	    }

	    if(MethodsOrderSplit.varStockAfterSplitOrderAgain == MethodsOrderSplit.varStockAfterSplitOrder){
	        test.log(Status.PASS, "Expected Stock value (Stock value After Split Order Again = Stock value After Split Order) After Split Order Again is: "+MethodsOrderSplit.varStockAfterSplitOrder+" And Actual Stock value After Split Order Again is: "+MethodsOrderSplit.varStockAfterSplitOrderAgain+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Stock value (Stock value After Split Order Again = Stock value After Split Order) After Split Order Again is: "+MethodsOrderSplit.varStockAfterSplitOrder+" But Actual Stock value After Split Order Again is: "+MethodsOrderSplit.varStockAfterSplitOrderAgain+". Incorrect");
	        softAssert.fail("Expected Stock value (Stock value After Split Order Again = Stock value After Split Order) After Split Order Again is: "+MethodsOrderSplit.varStockAfterSplitOrder+" But Actual Stock value After Split Order Again is: "+MethodsOrderSplit.varStockAfterSplitOrderAgain+". Incorrect");
	    }

	    if(MethodsOrderSplit.varIntransientStockAfterSplitOrderAgain == MethodsOrderSplit.varIntransientStockAfterSplitOrder){
	        test.log(Status.PASS, "Expected Intransient Stock value (Intransient Stock value After Split Order Again = Intransient Stock value After Split Order) After Split Order Again is: "+MethodsOrderSplit.varIntransientStockAfterSplitOrder+" And Actual Intransient Stock value After Split Order Again is: "+MethodsOrderSplit.varIntransientStockAfterSplitOrderAgain+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Intransient Stock value (Intransient Stock value After Split Order Again = Intransient Stock value After Split Order) After Split Order Again is: "+MethodsOrderSplit.varIntransientStockAfterSplitOrder+" But Actual Intransient Stock value After Split Order Again is: "+MethodsOrderSplit.varIntransientStockAfterSplitOrderAgain+". Incorrect");
	        softAssert.fail("Expected Intransient Stock value (Intransient Stock value After Split Order Again = Intransient Stock value After Split Order) After Split Order Again is: "+MethodsOrderSplit.varIntransientStockAfterSplitOrder+" But Actual Intransient Stock value After Split Order Again is: "+MethodsOrderSplit.varIntransientStockAfterSplitOrderAgain+". Incorrect");
	    }

	    if(MethodsOrderSplit.varAvailableStockAfterSplitOrderAgain == MethodsOrderSplit.varAvailableStockAfterSplitOrder){
	        test.log(Status.PASS, "Expected Available Stock value (Available Stock value After Split Order Again = Available Stock value After Split Order) After Split Order Again is: "+MethodsOrderSplit.varAvailableStockAfterSplitOrder+" And Actual Available Stock value After Split Order Again is: "+MethodsOrderSplit.varAvailableStockAfterSplitOrderAgain+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Available Stock value (Available Stock value After Split Order Again = Available Stock value After Split Order) After Split Order Again is: "+MethodsOrderSplit.varAvailableStockAfterSplitOrder+" But Actual Available Stock value After Split Order Again is: "+MethodsOrderSplit.varAvailableStockAfterSplitOrderAgain+". Incorrect");
	        softAssert.fail("Expected Available Stock value (Available Stock value After Split Order Again = Available Stock value After Split Order) After Split Order Again is: "+MethodsOrderSplit.varAvailableStockAfterSplitOrder+" But Actual Available Stock value After Split Order Again is: "+MethodsOrderSplit.varAvailableStockAfterSplitOrderAgain+". Incorrect");
	    }

	    if(MethodsOrderSplit.varUsedQuantityAfterSplitOrderAgain == MethodsOrderSplit.varUsedQuantityAfterSplitOrder){
	        test.log(Status.PASS, "Expected Used Quantity value (Used Quantity value After Split Order Again = Used Quantity value After Split Order) After Split Order Again is: "+MethodsOrderSplit.varUsedQuantityAfterSplitOrder+" And Actual Used Quantity value After Split Order Again is: "+MethodsOrderSplit.varUsedQuantityAfterSplitOrderAgain+". Correct");
	    } else {
	        test.log(Status.FAIL, "Expected Used Quantity value (Used Quantity value After Split Order Again = Used Quantity value After Split Order) After Split Order Again is: "+MethodsOrderSplit.varUsedQuantityAfterSplitOrder+" But Actual Used Quantity value After Split Order Again is: "+MethodsOrderSplit.varUsedQuantityAfterSplitOrderAgain+". Incorrect");
	        softAssert.fail("Expected Used Quantity value (Used Quantity value After Split Order Again = Used Quantity value After Split Order) After Split Order Again is: "+MethodsOrderSplit.varUsedQuantityAfterSplitOrder+" But Actual Used Quantity value After Split Order Again is: "+MethodsOrderSplit.varUsedQuantityAfterSplitOrderAgain+". Incorrect");
	    }
	    
	    softAssert.assertAll();
	}
}