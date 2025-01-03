package orderCancelBatchAssign;

import static io.restassured.RestAssured.given;

import allCommonData.AllCommonVariables;
import bearerTokenGenerate.VarBearerTokenGenerate;
import io.restassured.response.Response;

public class MethodsOrderCancelBatchAssign {
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
	public static long varOrderedQuantity=2;
	
//	InventoryDetailsAfterCreateOrder
	public static long varPendingStockAfterCreateOrder;
	public static long varTotalDemandAfterCreateOrder;
	public static long varStockAfterCreateOrder;
	public static long varIntransientStockAfterCreateOrder;
	public static long varAvailableStockAfterCreateOrder;
	public static long varUsedQuantityAfterCreateOrder;
	public static long varAvailableQuantityAfterCreateOrder;
	
//	InventoryDetailsAfterCancelOrder
	public static long varPendingStockAfterCancelOrder;
	public static long varTotalDemandAfterCancelOrder;
	public static long varStockAfterCancelOrder;
	public static long varIntransientStockAfterCancelOrder;
	public static long varAvailableStockAfterCancelOrder;
	public static long varUsedQuantityAfterCancelOrder;
	public static long varAvailableQuantityAfterCancelOrder;	
	
//	Batch Assign
	public static long varIbId;
	
//	InventoryDetailsAfterBatchAssign
	public static long varPendingStockAfterBatchAssign;
	public static long varTotalDemandAfterBatchAssign;
	public static long varUsedQuantityAfterBatchAssign;
	public static long varAvailableQuantityAfterBatchAssign;
	public static long varStockAfterBatchAssign;
	public static long varIntransientStockAfterBatchAssign;
	public static long varAvailableStockAfterBatchAssign;
	
	
	
	
	
	
	public static Response methodOrderCancelBatchAssignInventoryDetailsBeforeCreateOrder() {
		Response responseOrderCancelBatchAssignInventoryDetailsBeforeCreateOrder =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
		            .get("inventory?sku=SKUGH15&locationId=FT1");
		varPendingStockBeforeCreateOrder = responseOrderCancelBatchAssignInventoryDetailsBeforeCreateOrder.jsonPath().getLong("payload.packTypePendingStock.PCS");
		varTotalDemandBeforeCreateOrder = responseOrderCancelBatchAssignInventoryDetailsBeforeCreateOrder.jsonPath().getLong("payload.packTypeInflight.PCS");
		varStockBeforeCreateOrder=responseOrderCancelBatchAssignInventoryDetailsBeforeCreateOrder.jsonPath().getLong("payload.packTypeStock.PCS");
		varIntransientStockBeforeCreateOrder=responseOrderCancelBatchAssignInventoryDetailsBeforeCreateOrder.jsonPath().getLong("payload.packTypeTransient.PCS");
		varAvailableStockBeforeCreateOrder=responseOrderCancelBatchAssignInventoryDetailsBeforeCreateOrder.jsonPath().getLong("payload.packTypeAvailable.PCS");
		varAvailableQuantityBeforeCreateOrder=responseOrderCancelBatchAssignInventoryDetailsBeforeCreateOrder.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
		varUsedQuantityBeforeCreateOrder=responseOrderCancelBatchAssignInventoryDetailsBeforeCreateOrder.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
	    return responseOrderCancelBatchAssignInventoryDetailsBeforeCreateOrder;
	}
	    
	
	
	public static Response methodOrderCancelBatchAssignCreateOrder() {
		Response responseOrderCancelBatchAssignCreateOrder =
				given()
					.baseUri(AllCommonVariables.baseUriOrder)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            	.body(RequestPayloadsOrderCancelBatchAssign.rTPCreateOrder)
	            .when()
	            	.post("orders/");
		varOrderId = responseOrderCancelBatchAssignCreateOrder.jsonPath().getString("payload.id");
	    return responseOrderCancelBatchAssignCreateOrder;
	}
	
	
	
	public static Response methodOrderCancelBatchAssignInventoryDetailsAfterCreateOrder() {
		Response responseOrderCancelBatchAssignInventoryDetailsAfterCreateOrder =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
		            .get("inventory?sku=SKUGH15&locationId=FT1");
		varPendingStockAfterCreateOrder = responseOrderCancelBatchAssignInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.packTypePendingStock.PCS");
		varTotalDemandAfterCreateOrder = responseOrderCancelBatchAssignInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.packTypeInflight.PCS");
		varStockAfterCreateOrder=responseOrderCancelBatchAssignInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.packTypeStock.PCS");
		varIntransientStockAfterCreateOrder=responseOrderCancelBatchAssignInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.packTypeTransient.PCS");
		varAvailableStockAfterCreateOrder=responseOrderCancelBatchAssignInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.packTypeAvailable.PCS");
		varAvailableQuantityAfterCreateOrder=responseOrderCancelBatchAssignInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
		varUsedQuantityAfterCreateOrder=responseOrderCancelBatchAssignInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
		varUsedQuantityAfterCreateOrder=responseOrderCancelBatchAssignInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
	    return responseOrderCancelBatchAssignInventoryDetailsAfterCreateOrder;
	}
	
	
	
	public static Response methodOrderCancelBatchAssignBatchAssign() {
		Response responseOrderCancelBatchAssignBatchAssign =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
	            	.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
	            	.patch("order/"+varOrderId+"/change?status=BatchAssigned");
		if (responseOrderCancelBatchAssignBatchAssign.statusCode() == 200) {
			varIbId = responseOrderCancelBatchAssignBatchAssign.jsonPath().getLong("payload.items[0].itemBatchDetails[0].ibId");
	    }
	    return responseOrderCancelBatchAssignBatchAssign;
	}
	
	public static Response methodOrderCancelBatchAssignInventoryDetailsAfterBatchAssign() {
		Response responseOrderCancelBatchAssignInventoryDetailsAfterBatchAssign =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
		            .get("inventory?sku=SKUGH15&locationId=FT1");
		varPendingStockAfterBatchAssign = responseOrderCancelBatchAssignInventoryDetailsAfterBatchAssign.jsonPath().getLong("payload.packTypePendingStock.PCS");
		varTotalDemandAfterBatchAssign = responseOrderCancelBatchAssignInventoryDetailsAfterBatchAssign.jsonPath().getLong("payload.packTypeInflight.PCS");
		varStockAfterBatchAssign=responseOrderCancelBatchAssignInventoryDetailsAfterBatchAssign.jsonPath().getLong("payload.packTypeStock.PCS");
		varIntransientStockAfterBatchAssign=responseOrderCancelBatchAssignInventoryDetailsAfterBatchAssign.jsonPath().getLong("payload.packTypeTransient.PCS");
		varAvailableStockAfterBatchAssign=responseOrderCancelBatchAssignInventoryDetailsAfterBatchAssign.jsonPath().getLong("payload.packTypeAvailable.PCS");
		varAvailableQuantityAfterBatchAssign=responseOrderCancelBatchAssignInventoryDetailsAfterBatchAssign.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
		varUsedQuantityAfterBatchAssign=responseOrderCancelBatchAssignInventoryDetailsAfterBatchAssign.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
	    return responseOrderCancelBatchAssignInventoryDetailsAfterBatchAssign;
	}
	
	
	
	
	
	
	public static Response methodOrderCancelBatchAssignCancelOrder() {
		Response responseOrderCancelBatchAssignCreateOrder =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
	            	.delete("order/"+varOrderId+"/cancel?reason=ORDER_NOT_REQUIRED_ANYMORE");
		varOrderId = responseOrderCancelBatchAssignCreateOrder.jsonPath().getString("payload.id");
	    return responseOrderCancelBatchAssignCreateOrder;
	}
	
	
	
//	public static Response methodOrderCancelBatchAssignInventoryDetailsAfterCancelOrder() {
//		Response responseOrderCancelBatchAssignInventoryDetailsAfterCancelOrder =
//				given()
//					.baseUri(AllCommonVariables.baseUriOms)
//            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
//	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
//	            .when()
//		            .get("inventory?sku=SKUGH15&locationId=FT1");
//		varPendingStockAfterCancelOrder = responseOrderCancelBatchAssignInventoryDetailsAfterCancelOrder.jsonPath().getLong("payload.packTypePendingStock.PCS");
//		varTotalDemandAfterCancelOrder = responseOrderCancelBatchAssignInventoryDetailsAfterCancelOrder.jsonPath().getLong("payload.packTypeInflight.PCS");
//		varStockAfterCancelOrder=responseOrderCancelBatchAssignInventoryDetailsAfterCancelOrder.jsonPath().getLong("payload.packTypeStock.PCS");
//		varIntransientStockAfterCancelOrder=responseOrderCancelBatchAssignInventoryDetailsAfterCancelOrder.jsonPath().getLong("payload.packTypeTransient.PCS");
//		varAvailableStockAfterCancelOrder=responseOrderCancelBatchAssignInventoryDetailsAfterCancelOrder.jsonPath().getLong("payload.packTypeAvailable.PCS");
//		varAvailableQuantityAfterCancelOrder=responseOrderCancelBatchAssignInventoryDetailsAfterCancelOrder.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
//		varUsedQuantityAfterCancelOrder=responseOrderCancelBatchAssignInventoryDetailsAfterCancelOrder.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
//		varUsedQuantityAfterCancelOrder=responseOrderCancelBatchAssignInventoryDetailsAfterCancelOrder.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
//	    return responseOrderCancelBatchAssignInventoryDetailsAfterCancelOrder;
//	}
}
