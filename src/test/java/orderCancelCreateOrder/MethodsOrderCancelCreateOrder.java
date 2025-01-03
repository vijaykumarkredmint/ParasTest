package orderCancelCreateOrder;

import static io.restassured.RestAssured.given;

import allCommonData.AllCommonVariables;
import bearerTokenGenerate.VarBearerTokenGenerate;
import io.restassured.response.Response;

public class MethodsOrderCancelCreateOrder {
	
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
	
	
	
	
	
	
	public static Response methodOrderCancelCreateOrderInventoryDetailsBeforeCreateOrder() {
		Response responseOrderCancelCreateOrderInventoryDetailsBeforeCreateOrder =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
		            .get("inventory?sku=SKUGH15&locationId=FT1");
		varPendingStockBeforeCreateOrder = responseOrderCancelCreateOrderInventoryDetailsBeforeCreateOrder.jsonPath().getLong("payload.packTypePendingStock.PCS");
		varTotalDemandBeforeCreateOrder = responseOrderCancelCreateOrderInventoryDetailsBeforeCreateOrder.jsonPath().getLong("payload.packTypeInflight.PCS");
		varStockBeforeCreateOrder=responseOrderCancelCreateOrderInventoryDetailsBeforeCreateOrder.jsonPath().getLong("payload.packTypeStock.PCS");
		varIntransientStockBeforeCreateOrder=responseOrderCancelCreateOrderInventoryDetailsBeforeCreateOrder.jsonPath().getLong("payload.packTypeTransient.PCS");
		varAvailableStockBeforeCreateOrder=responseOrderCancelCreateOrderInventoryDetailsBeforeCreateOrder.jsonPath().getLong("payload.packTypeAvailable.PCS");
		varAvailableQuantityBeforeCreateOrder=responseOrderCancelCreateOrderInventoryDetailsBeforeCreateOrder.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
		varUsedQuantityBeforeCreateOrder=responseOrderCancelCreateOrderInventoryDetailsBeforeCreateOrder.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
	    return responseOrderCancelCreateOrderInventoryDetailsBeforeCreateOrder;
	}
	    
	
	
	public static Response methodOrderCancelCreateOrderCreateOrder() {
		Response responseOrderCancelCreateOrderCreateOrder =
				given()
					.baseUri(AllCommonVariables.baseUriOrder)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            	.body(RequestPayloadsOrderCancelCreateOrder.rTPCreateOrder)
	            .when()
	            	.post("orders/");
		varOrderId = responseOrderCancelCreateOrderCreateOrder.jsonPath().getString("payload.id");
	    return responseOrderCancelCreateOrderCreateOrder;
	}
	
	
	
	public static Response methodOrderCancelCreateOrderInventoryDetailsAfterCreateOrder() {
		Response responseOrderCancelCreateOrderInventoryDetailsAfterCreateOrder =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
		            .get("inventory?sku=SKUGH15&locationId=FT1");
		varPendingStockAfterCreateOrder = responseOrderCancelCreateOrderInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.packTypePendingStock.PCS");
		varTotalDemandAfterCreateOrder = responseOrderCancelCreateOrderInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.packTypeInflight.PCS");
		varStockAfterCreateOrder=responseOrderCancelCreateOrderInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.packTypeStock.PCS");
		varIntransientStockAfterCreateOrder=responseOrderCancelCreateOrderInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.packTypeTransient.PCS");
		varAvailableStockAfterCreateOrder=responseOrderCancelCreateOrderInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.packTypeAvailable.PCS");
		varAvailableQuantityAfterCreateOrder=responseOrderCancelCreateOrderInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
		varUsedQuantityAfterCreateOrder=responseOrderCancelCreateOrderInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
		varUsedQuantityAfterCreateOrder=responseOrderCancelCreateOrderInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
	    return responseOrderCancelCreateOrderInventoryDetailsAfterCreateOrder;
	}
	
	public static Response methodOrderCancelCreateOrderCancelOrder() {
		Response responseOrderCancelCreateOrderCreateOrder =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
	            	.delete("order/"+varOrderId+"/cancel?reason=ORDER_NOT_REQUIRED_ANYMORE");
		varOrderId = responseOrderCancelCreateOrderCreateOrder.jsonPath().getString("payload.id");
	    return responseOrderCancelCreateOrderCreateOrder;
	}
	
	
	
	public static Response methodOrderCancelCreateOrderInventoryDetailsAfterCancelOrder() {
		Response responseOrderCancelCreateOrderInventoryDetailsAfterCancelOrder =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
		            .get("inventory?sku=SKUGH15&locationId=FT1");
		varPendingStockAfterCancelOrder = responseOrderCancelCreateOrderInventoryDetailsAfterCancelOrder.jsonPath().getLong("payload.packTypePendingStock.PCS");
		varTotalDemandAfterCancelOrder = responseOrderCancelCreateOrderInventoryDetailsAfterCancelOrder.jsonPath().getLong("payload.packTypeInflight.PCS");
		varStockAfterCancelOrder=responseOrderCancelCreateOrderInventoryDetailsAfterCancelOrder.jsonPath().getLong("payload.packTypeStock.PCS");
		varIntransientStockAfterCancelOrder=responseOrderCancelCreateOrderInventoryDetailsAfterCancelOrder.jsonPath().getLong("payload.packTypeTransient.PCS");
		varAvailableStockAfterCancelOrder=responseOrderCancelCreateOrderInventoryDetailsAfterCancelOrder.jsonPath().getLong("payload.packTypeAvailable.PCS");
		varAvailableQuantityAfterCancelOrder=responseOrderCancelCreateOrderInventoryDetailsAfterCancelOrder.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
		varUsedQuantityAfterCancelOrder=responseOrderCancelCreateOrderInventoryDetailsAfterCancelOrder.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
		varUsedQuantityAfterCancelOrder=responseOrderCancelCreateOrderInventoryDetailsAfterCancelOrder.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
	    return responseOrderCancelCreateOrderInventoryDetailsAfterCancelOrder;
	}
}
