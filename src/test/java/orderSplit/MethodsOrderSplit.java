package orderSplit;

import static io.restassured.RestAssured.given;

import allCommonData.AllCommonVariables;
import bearerTokenGenerate.VarBearerTokenGenerate;
import io.restassured.response.Response;

public class MethodsOrderSplit {
	
//	InventoryDetailsBeforeCreateOrder
	public static long varPendingStockBeforeCreateOrder;
	public static long varTotalDemandBeforeCreateOrder;
	public static long varStockBeforeCreateOrder;
	public static long varIntransientStockBeforeCreateOrder;
	public static long varAvailableStockBeforeCreateOrder;
	public static long varUsedQuantityBeforeCreateOrder;
	public static long varAvailableQuantityBeforeCreateOrder;
	
//	Create Order
	public static String varOrderId;
	public static long varOrderedQuantity=5;
	
//	InventoryDetailsAfterCreateOrder
	public static long varPendingStockAfterCreateOrder;
	public static long varTotalDemandAfterCreateOrder;
	public static long varStockAfterCreateOrder;
	public static long varIntransientStockAfterCreateOrder;
	public static long varAvailableStockAfterCreateOrder;
	public static long varUsedQuantityAfterCreateOrder;
	public static long varAvailableQuantityAfterCreateOrder;
	
//	Split Order
	public static String varOrderIdNew;
	public static long varTotalQuantityNew;
	
//	InventoryDetailsAfterSplitOrder
	public static long varPendingStockAfterSplitOrder;
	public static long varTotalDemandAfterSplitOrder;
	public static long varStockAfterSplitOrder;
	public static long varIntransientStockAfterSplitOrder;
	public static long varAvailableStockAfterSplitOrder;
	public static long varUsedQuantityAfterSplitOrder;
	public static long varAvailableQuantityAfterSplitOrder;
	
//	Split New Order
	public static String varOrderIdNewAgain;
	public static long varTotalQuantityNewAgain;
	
//	InventoryDetailsAfterSplitNewOrder
	public static long varPendingStockAfterSplitNewOrder;
	public static long varTotalDemandAfterSplitNewOrder;
	public static long varStockAfterSplitNewOrder;
	public static long varIntransientStockAfterSplitNewOrder;
	public static long varAvailableStockAfterSplitNewOrder;
	public static long varUsedQuantityAfterSplitNewOrder;
	public static long varAvailableQuantityAfterSplitNewOrder;
	
//	InventoryDetailsAfterSplitOrderAgain
	public static long varPendingStockAfterSplitOrderAgain;
	public static long varTotalDemandAfterSplitOrderAgain;
	public static long varStockAfterSplitOrderAgain;
	public static long varIntransientStockAfterSplitOrderAgain;
	public static long varAvailableStockAfterSplitOrderAgain;
	public static long varUsedQuantityAfterSplitOrderAgain;
	public static long varAvailableQuantityAfterSplitOrderAgain;
	

	
	
	
	
	public static Response methodOrderSplitInventoryDetailsBeforeCreateOrder() {
		Response responseOrderSplitInventoryDetailsBeforeCreateOrder =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
		            .get("inventory?sku=SKUGH14&locationId=FT1");
		varPendingStockBeforeCreateOrder = responseOrderSplitInventoryDetailsBeforeCreateOrder.jsonPath().getLong("payload.packTypePendingStock.PCS");
		varTotalDemandBeforeCreateOrder = responseOrderSplitInventoryDetailsBeforeCreateOrder.jsonPath().getLong("payload.packTypeInflight.PCS");
		varStockBeforeCreateOrder=responseOrderSplitInventoryDetailsBeforeCreateOrder.jsonPath().getLong("payload.packTypeStock.PCS");
		varIntransientStockBeforeCreateOrder=responseOrderSplitInventoryDetailsBeforeCreateOrder.jsonPath().getLong("payload.packTypeTransient.PCS");
		varAvailableStockBeforeCreateOrder=responseOrderSplitInventoryDetailsBeforeCreateOrder.jsonPath().getLong("payload.packTypeAvailable.PCS");
		varAvailableQuantityBeforeCreateOrder=responseOrderSplitInventoryDetailsBeforeCreateOrder.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
		varUsedQuantityBeforeCreateOrder=responseOrderSplitInventoryDetailsBeforeCreateOrder.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
	    return responseOrderSplitInventoryDetailsBeforeCreateOrder;
	}
	    
	
	
	public static Response methodOrderSplitCreateOrder() {
		Response responseOrderSplitCreateOrder =
				given()
					.baseUri(AllCommonVariables.baseUriOrder)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            	.body(RequestPayloadsOrderSplit.rTPCreateOrder)
	            .when()
	            	.post("orders/");
		varOrderId = responseOrderSplitCreateOrder.jsonPath().getString("payload.id");
	    return responseOrderSplitCreateOrder;
	}
	
	
	
	public static Response methodOrderSplitInventoryDetailsAfterCreateOrder() {
		Response responseOrderSplitInventoryDetailsAfterCreateOrder =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
		            .get("inventory?sku=SKUGH14&locationId=FT1");
		varPendingStockAfterCreateOrder = responseOrderSplitInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.packTypePendingStock.PCS");
		varTotalDemandAfterCreateOrder = responseOrderSplitInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.packTypeInflight.PCS");
		varStockAfterCreateOrder=responseOrderSplitInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.packTypeStock.PCS");
		varIntransientStockAfterCreateOrder=responseOrderSplitInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.packTypeTransient.PCS");
		varAvailableStockAfterCreateOrder=responseOrderSplitInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.packTypeAvailable.PCS");
		varAvailableQuantityAfterCreateOrder=responseOrderSplitInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
		varUsedQuantityAfterCreateOrder=responseOrderSplitInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
		varUsedQuantityAfterCreateOrder=responseOrderSplitInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
	    return responseOrderSplitInventoryDetailsAfterCreateOrder;
	}
	
	
	
	public static Response methodOrderSplitSplitOrder() {
		Response responseOrderSplitSplitOrder =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            	.body(RequestPayloadsOrderSplit.rTPSplitOrder)
	            .when()
	            	.patch("https://oms-uat.kredmint.in/oms/order/split?orderId="+varOrderId);
		varOrderIdNew = responseOrderSplitSplitOrder.jsonPath().getString("payload.id");
		varTotalQuantityNew = responseOrderSplitSplitOrder.jsonPath().getLong("payload.totalQuantity");
	    return responseOrderSplitSplitOrder;
	}
	
	
	
	public static Response methodOrderSplitInventoryDetailsAfterSplitOrder() {
		Response responseOrderSplitInventoryDetailsAfterSplitOrder =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
		            .get("inventory?sku=SKUGH14&locationId=FT1");
		varPendingStockAfterSplitOrder = responseOrderSplitInventoryDetailsAfterSplitOrder.jsonPath().getLong("payload.packTypePendingStock.PCS");
		varTotalDemandAfterSplitOrder = responseOrderSplitInventoryDetailsAfterSplitOrder.jsonPath().getLong("payload.packTypeInflight.PCS");
		varStockAfterSplitOrder=responseOrderSplitInventoryDetailsAfterSplitOrder.jsonPath().getLong("payload.packTypeStock.PCS");
		varIntransientStockAfterSplitOrder=responseOrderSplitInventoryDetailsAfterSplitOrder.jsonPath().getLong("payload.packTypeTransient.PCS");
		varAvailableStockAfterSplitOrder=responseOrderSplitInventoryDetailsAfterSplitOrder.jsonPath().getLong("payload.packTypeAvailable.PCS");
		varAvailableQuantityAfterSplitOrder=responseOrderSplitInventoryDetailsAfterSplitOrder.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
		varUsedQuantityAfterSplitOrder=responseOrderSplitInventoryDetailsAfterSplitOrder.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
		varUsedQuantityAfterSplitOrder=responseOrderSplitInventoryDetailsAfterSplitOrder.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
	    return responseOrderSplitInventoryDetailsAfterSplitOrder;
	}

	
	
	public static Response methodOrderSplitSplitNewOrder() {
		Response responseOrderSplitSplitNewOrder =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            	.body(RequestPayloadsOrderSplit.rTPSplitNewOrder)
	            .when()
	            	.patch("https://oms-uat.kredmint.in/oms/order/split?orderId="+varOrderIdNew);
	    return responseOrderSplitSplitNewOrder;
	}
	
	public static Response methodOrderSplitInventoryDetailsAfterSplitNewOrder() {
	    Response responseOrderSplitInventoryDetailsAfterSplitNewOrder =
	            given()
	                .baseUri(AllCommonVariables.baseUriOms)
	                .header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	                .header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
	                .get("inventory?sku=SKUGH14&locationId=FT1");
	    varPendingStockAfterSplitNewOrder = responseOrderSplitInventoryDetailsAfterSplitNewOrder.jsonPath().getLong("payload.packTypePendingStock.PCS");
	    varTotalDemandAfterSplitNewOrder = responseOrderSplitInventoryDetailsAfterSplitNewOrder.jsonPath().getLong("payload.packTypeInflight.PCS");
	    varStockAfterSplitNewOrder = responseOrderSplitInventoryDetailsAfterSplitNewOrder.jsonPath().getLong("payload.packTypeStock.PCS");
	    varIntransientStockAfterSplitNewOrder = responseOrderSplitInventoryDetailsAfterSplitNewOrder.jsonPath().getLong("payload.packTypeTransient.PCS");
	    varAvailableStockAfterSplitNewOrder = responseOrderSplitInventoryDetailsAfterSplitNewOrder.jsonPath().getLong("payload.packTypeAvailable.PCS");
	    varAvailableQuantityAfterSplitNewOrder = responseOrderSplitInventoryDetailsAfterSplitNewOrder.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
	    varUsedQuantityAfterSplitNewOrder = responseOrderSplitInventoryDetailsAfterSplitNewOrder.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
	    varUsedQuantityAfterSplitNewOrder = responseOrderSplitInventoryDetailsAfterSplitNewOrder.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
	    return responseOrderSplitInventoryDetailsAfterSplitNewOrder;
	}


	
	public static Response methodOrderSplitSplitOrderAgain() {
		Response responseOrderSplitSplitOrderAgain =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            	.body(RequestPayloadsOrderSplit.rTPSplitOrderAgain)
	            .when()
	            	.patch("https://oms-uat.kredmint.in/oms/order/split?orderId="+varOrderId);
	    return responseOrderSplitSplitOrderAgain;
	}
	
	
	
	public static Response methodOrderSplitInventoryDetailsAfterSplitOrderAgain() {
		Response responseOrderSplitInventoryDetailsAfterSplitOrderAgain =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
		            .get("inventory?sku=SKUGH14&locationId=FT1");
		varPendingStockAfterSplitOrderAgain = responseOrderSplitInventoryDetailsAfterSplitOrderAgain.jsonPath().getLong("payload.packTypePendingStock.PCS");
		varTotalDemandAfterSplitOrderAgain = responseOrderSplitInventoryDetailsAfterSplitOrderAgain.jsonPath().getLong("payload.packTypeInflight.PCS");
		varStockAfterSplitOrderAgain=responseOrderSplitInventoryDetailsAfterSplitOrderAgain.jsonPath().getLong("payload.packTypeStock.PCS");
		varIntransientStockAfterSplitOrderAgain=responseOrderSplitInventoryDetailsAfterSplitOrderAgain.jsonPath().getLong("payload.packTypeTransient.PCS");
		varAvailableStockAfterSplitOrderAgain=responseOrderSplitInventoryDetailsAfterSplitOrderAgain.jsonPath().getLong("payload.packTypeAvailable.PCS");
		varAvailableQuantityAfterSplitOrderAgain=responseOrderSplitInventoryDetailsAfterSplitOrderAgain.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
		varUsedQuantityAfterSplitOrderAgain=responseOrderSplitInventoryDetailsAfterSplitOrderAgain.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
		varUsedQuantityAfterSplitOrderAgain=responseOrderSplitInventoryDetailsAfterSplitOrderAgain.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
	    return responseOrderSplitInventoryDetailsAfterSplitOrderAgain;
	}
}
