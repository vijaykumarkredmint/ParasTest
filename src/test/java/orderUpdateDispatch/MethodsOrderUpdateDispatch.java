package orderUpdateDispatch;

import static io.restassured.RestAssured.given;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import allCommonData.AllCommonVariables;
import bearerTokenGenerate.VarBearerTokenGenerate;
import io.restassured.response.Response;

public class MethodsOrderUpdateDispatch {

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
	
//	InventoryDetailsAfterMarkPacked
	public static long varPendingStockAfterMarkPacked;
	public static long varTotalDemandAfterMarkPacked;
	public static long varUsedQuantityAfterMarkPacked;
	public static long varAvailableQuantityAfterMarkPacked;
	public static long varStockAfterMarkPacked;
	public static long varIntransientStockAfterMarkPacked;
	public static long varAvailableStockAfterMarkPacked;
	
//	InventoryDetailsAfterCreateShipment
	public static long varPendingStockAfterCreateShipment;
	public static long varTotalDemandAfterCreateShipment;
	public static long varUsedQuantityAfterCreateShipment;
	public static long varAvailableQuantityAfterCreateShipment;
	public static long varStockAfterCreateShipment;
	public static long varIntransientStockAfterCreateShipment;
	public static long varAvailableStockAfterCreateShipment;
	
//	Dispatch
	public static String varShipmentId;
	
//	InventoryDetailsAfterDispatch
	public static long varPendingStockAfterDispatch;
	public static long varTotalDemandAfterDispatch;
	public static long varUsedQuantityAfterDispatch;
	public static long varAvailableQuantityAfterDispatch;
	public static long varStockAfterDispatch;
	public static long varIntransientStockAfterDispatch;
	public static long varAvailableStockAfterDispatch;	
	
//	Update Order
	public static long varOrderedQuantityNew =7;
	
// InventoryDetailsAfterUpdateOrder
	public static long varPendingStockAfterUpdateOrder;
	public static long varTotalDemandAfterUpdateOrder;
	public static long varUsedQuantityAfterUpdateOrder;
	public static long varAvailableQuantityAfterUpdateOrder;
	public static long varStockAfterUpdateOrder;
	public static long varIntransientStockAfterUpdateOrder;
	public static long varAvailableStockAfterUpdateOrder;

	
	
	
	
	
	public static Response methodOrderUpdateDispatchInventoryDetailsBeforeCreateOrder() {
		Response responseOrderUpdateDispatchInventoryDetailsBeforeCreateOrder =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
		            .get("inventory?sku=SKUGH16&locationId=FT1");
		varPendingStockBeforeCreateOrder = responseOrderUpdateDispatchInventoryDetailsBeforeCreateOrder.jsonPath().getLong("payload.packTypePendingStock.PCS");
		varTotalDemandBeforeCreateOrder = responseOrderUpdateDispatchInventoryDetailsBeforeCreateOrder.jsonPath().getLong("payload.packTypeInflight.PCS");
		varStockBeforeCreateOrder=responseOrderUpdateDispatchInventoryDetailsBeforeCreateOrder.jsonPath().getLong("payload.packTypeStock.PCS");
		varIntransientStockBeforeCreateOrder=responseOrderUpdateDispatchInventoryDetailsBeforeCreateOrder.jsonPath().getLong("payload.packTypeTransient.PCS");
		varAvailableStockBeforeCreateOrder=responseOrderUpdateDispatchInventoryDetailsBeforeCreateOrder.jsonPath().getLong("payload.packTypeAvailable.PCS");
		varAvailableQuantityBeforeCreateOrder=responseOrderUpdateDispatchInventoryDetailsBeforeCreateOrder.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
		varUsedQuantityBeforeCreateOrder=responseOrderUpdateDispatchInventoryDetailsBeforeCreateOrder.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
	    return responseOrderUpdateDispatchInventoryDetailsBeforeCreateOrder;
	}
	    
	
	
	public static Response methodOrderUpdateDispatchCreateOrder() {
		Response responseOrderUpdateDispatchCreateOrder =
				given()
					.baseUri(AllCommonVariables.baseUriOrder)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            	.body(RequestPayloadsOrderUpdateDispatch.rTPCreateOrder)
	            .when()
	            	.post("orders/");
		varOrderId = responseOrderUpdateDispatchCreateOrder.jsonPath().getString("payload.id");
	    return responseOrderUpdateDispatchCreateOrder;
	}
	
	
	
	public static Response methodOrderUpdateDispatchInventoryDetailsAfterCreateOrder() {
		Response responseOrderUpdateDispatchInventoryDetailsAfterCreateOrder =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
		            .get("inventory?sku=SKUGH16&locationId=FT1");
		varPendingStockAfterCreateOrder = responseOrderUpdateDispatchInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.packTypePendingStock.PCS");
		varTotalDemandAfterCreateOrder = responseOrderUpdateDispatchInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.packTypeInflight.PCS");
		varStockAfterCreateOrder=responseOrderUpdateDispatchInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.packTypeStock.PCS");
		varIntransientStockAfterCreateOrder=responseOrderUpdateDispatchInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.packTypeTransient.PCS");
		varAvailableStockAfterCreateOrder=responseOrderUpdateDispatchInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.packTypeAvailable.PCS");
		varAvailableQuantityAfterCreateOrder=responseOrderUpdateDispatchInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
		varUsedQuantityAfterCreateOrder=responseOrderUpdateDispatchInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
		varUsedQuantityAfterCreateOrder=responseOrderUpdateDispatchInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
	    return responseOrderUpdateDispatchInventoryDetailsAfterCreateOrder;
	}
	
	

	public static Response methodOrderUpdateDispatchBatchAssign() {
		Response responseOrderUpdateDispatchBatchAssign =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
	            	.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
	            	.patch("order/"+varOrderId+"/change?status=BatchAssigned");
		if (responseOrderUpdateDispatchBatchAssign.statusCode() == 200) {
			varIbId = responseOrderUpdateDispatchBatchAssign.jsonPath().getLong("payload.items[0].itemBatchDetails[0].ibId");
	    }
	    return responseOrderUpdateDispatchBatchAssign;
	}
	
	public static Response methodOrderUpdateDispatchInventoryDetailsAfterBatchAssign() {
		Response responseOrderUpdateDispatchInventoryDetailsAfterBatchAssign =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
		            .get("inventory?sku=SKUGH16&locationId=FT1");
		varPendingStockAfterBatchAssign = responseOrderUpdateDispatchInventoryDetailsAfterBatchAssign.jsonPath().getLong("payload.packTypePendingStock.PCS");
		varTotalDemandAfterBatchAssign = responseOrderUpdateDispatchInventoryDetailsAfterBatchAssign.jsonPath().getLong("payload.packTypeInflight.PCS");
		varStockAfterBatchAssign=responseOrderUpdateDispatchInventoryDetailsAfterBatchAssign.jsonPath().getLong("payload.packTypeStock.PCS");
		varIntransientStockAfterBatchAssign=responseOrderUpdateDispatchInventoryDetailsAfterBatchAssign.jsonPath().getLong("payload.packTypeTransient.PCS");
		varAvailableStockAfterBatchAssign=responseOrderUpdateDispatchInventoryDetailsAfterBatchAssign.jsonPath().getLong("payload.packTypeAvailable.PCS");
		varAvailableQuantityAfterBatchAssign=responseOrderUpdateDispatchInventoryDetailsAfterBatchAssign.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
		varUsedQuantityAfterBatchAssign=responseOrderUpdateDispatchInventoryDetailsAfterBatchAssign.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
	    return responseOrderUpdateDispatchInventoryDetailsAfterBatchAssign;
	}

	
	
	public static Response methodOrderUpdateDispatchMarkPacked() {
		Response responseOrderUpdateDispatchMarkPacked =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
	            	.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
	            	.patch("order/"+varOrderId+"/change?status=Packed");
		return responseOrderUpdateDispatchMarkPacked;
	}
	
	
	
	public static Response methodOrderUpdateDispatchInventoryDetailsAfterMarkPacked() {
		Response responseOrderUpdateDispatchInventoryDetailsAfterMarkPacked =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
		            .get("inventory?sku=SKUGH16&locationId=FT1");
		varPendingStockAfterMarkPacked = responseOrderUpdateDispatchInventoryDetailsAfterMarkPacked.jsonPath().getLong("payload.packTypePendingStock.PCS");
		varTotalDemandAfterMarkPacked = responseOrderUpdateDispatchInventoryDetailsAfterMarkPacked.jsonPath().getLong("payload.packTypeInflight.PCS");
		varStockAfterMarkPacked=responseOrderUpdateDispatchInventoryDetailsAfterMarkPacked.jsonPath().getLong("payload.packTypeStock.PCS");
		varIntransientStockAfterMarkPacked=responseOrderUpdateDispatchInventoryDetailsAfterMarkPacked.jsonPath().getLong("payload.packTypeTransient.PCS");
		varAvailableStockAfterMarkPacked=responseOrderUpdateDispatchInventoryDetailsAfterMarkPacked.jsonPath().getLong("payload.packTypeAvailable.PCS");
		varAvailableQuantityAfterMarkPacked=responseOrderUpdateDispatchInventoryDetailsAfterMarkPacked.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
		varUsedQuantityAfterMarkPacked=responseOrderUpdateDispatchInventoryDetailsAfterMarkPacked.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
		return responseOrderUpdateDispatchInventoryDetailsAfterMarkPacked;
	}
	
	
	
	public static Response methodOrderUpdateDispatchCreateShipment() {
		Map<String, Object> rTPCreateShipment = new HashMap<>();
        String deliveryDate = LocalDate.now().toString();;
        String locationId = "FT1";
        rTPCreateShipment.put("deliveryDate", deliveryDate);
        rTPCreateShipment.put("locationId", locationId);
        List<String> orderIds = Arrays.asList(varOrderId);
        rTPCreateShipment.put("orderIds", orderIds);
        
		Response responseOrderUpdateDispatchCreateShipment = given()
					.baseUri(AllCommonVariables.baseUriOrder)
	            	.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            	.body(rTPCreateShipment)
	            .when()
	            	.post("shipment/");
	    if (responseOrderUpdateDispatchCreateShipment.statusCode() == 200) {
	    	varShipmentId = responseOrderUpdateDispatchCreateShipment.jsonPath().getString("payload.id");
	    }
	    return responseOrderUpdateDispatchCreateShipment;
	}
	
	
	
	public static Response methodOrderUpdateDispatchInventoryDetailsAfterCreateShipment() {
		Response responseOrderUpdateDispatchInventoryDetailsAfterCreateShipment =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
		            .get("inventory?sku=SKUGH16&locationId=FT1");
		varPendingStockAfterCreateShipment = responseOrderUpdateDispatchInventoryDetailsAfterCreateShipment.jsonPath().getLong("payload.packTypePendingStock.PCS");
		varTotalDemandAfterCreateShipment = responseOrderUpdateDispatchInventoryDetailsAfterCreateShipment.jsonPath().getLong("payload.packTypeInflight.PCS");
		varStockAfterCreateShipment=responseOrderUpdateDispatchInventoryDetailsAfterCreateShipment.jsonPath().getLong("payload.packTypeStock.PCS");
		varIntransientStockAfterCreateShipment=responseOrderUpdateDispatchInventoryDetailsAfterCreateShipment.jsonPath().getLong("payload.packTypeTransient.PCS");
		varAvailableStockAfterCreateShipment=responseOrderUpdateDispatchInventoryDetailsAfterCreateShipment.jsonPath().getLong("payload.packTypeAvailable.PCS");
		varAvailableQuantityAfterCreateShipment=responseOrderUpdateDispatchInventoryDetailsAfterCreateShipment.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
		varUsedQuantityAfterCreateShipment=responseOrderUpdateDispatchInventoryDetailsAfterCreateShipment.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
		return responseOrderUpdateDispatchInventoryDetailsAfterCreateShipment;
	}
	
	
	
	public static Response methodOrderUpdateDispatchDispatch() {
	    Response responseOrderUpdateDispatchDispatch = given()
	    			.baseUri(AllCommonVariables.baseUriOms)
	            	.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
	            	.patch("shipment/"+varShipmentId+"?status=Dispatched&lrNumber=LR+Number&vehicleNumber=Vehicle+Number&transporter=Name+of+Transporter");
	    return responseOrderUpdateDispatchDispatch;
	}

	
	
	public static Response methodOrderUpdateDispatchInventoryDetailsAfterDispatch() {
		Response responseOrderUpdateDispatchInventoryDetailsAfterDispatch =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
		            .get("inventory?sku=SKUGH16&locationId=FT1");
		varPendingStockAfterDispatch = responseOrderUpdateDispatchInventoryDetailsAfterDispatch.jsonPath().getLong("payload.packTypePendingStock.PCS");
		varTotalDemandAfterDispatch = responseOrderUpdateDispatchInventoryDetailsAfterDispatch.jsonPath().getLong("payload.packTypeInflight.PCS");
		varStockAfterDispatch=responseOrderUpdateDispatchInventoryDetailsAfterDispatch.jsonPath().getLong("payload.packTypeStock.PCS");
		varIntransientStockAfterDispatch=responseOrderUpdateDispatchInventoryDetailsAfterDispatch.jsonPath().getLong("payload.packTypeTransient.PCS");
		varAvailableStockAfterDispatch=responseOrderUpdateDispatchInventoryDetailsAfterDispatch.jsonPath().getLong("payload.packTypeAvailable.PCS");
		varAvailableQuantityAfterDispatch=responseOrderUpdateDispatchInventoryDetailsAfterDispatch.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
		varUsedQuantityAfterDispatch=responseOrderUpdateDispatchInventoryDetailsAfterDispatch.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
		return responseOrderUpdateDispatchInventoryDetailsAfterDispatch;
	}

	
	
	public static Response methodOrderUpdateDispatchUpdateOrder() {
		Response responseOrderUpdateDispatchUpdateOrder =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            	.body(RequestPayloadsOrderUpdateDispatch.rTPUpdateOrder)
	            .when()
	            	.patch("hub/purchaseOrder/?orderId="+varOrderId);
	    return responseOrderUpdateDispatchUpdateOrder;
	}
	
	
	
	public static Response methodOrderUpdateDispatchInventoryDetailsAfterUpdateOrder() {
		Response responseOrderUpdateDispatchInventoryDetailsAfterUpdateOrder =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
		            .get("inventory?sku=SKUGH16&locationId=FT1");
		varPendingStockAfterUpdateOrder = responseOrderUpdateDispatchInventoryDetailsAfterUpdateOrder.jsonPath().getLong("payload.packTypePendingStock.PCS");
		varTotalDemandAfterUpdateOrder = responseOrderUpdateDispatchInventoryDetailsAfterUpdateOrder.jsonPath().getLong("payload.packTypeInflight.PCS");
		varStockAfterUpdateOrder = responseOrderUpdateDispatchInventoryDetailsAfterUpdateOrder.jsonPath().getLong("payload.packTypeStock.PCS");
		varIntransientStockAfterUpdateOrder = responseOrderUpdateDispatchInventoryDetailsAfterUpdateOrder.jsonPath().getLong("payload.packTypeTransient.PCS");
		varAvailableStockAfterUpdateOrder = responseOrderUpdateDispatchInventoryDetailsAfterUpdateOrder.jsonPath().getLong("payload.packTypeAvailable.PCS");
		varAvailableQuantityAfterUpdateOrder = responseOrderUpdateDispatchInventoryDetailsAfterUpdateOrder.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
		varUsedQuantityAfterUpdateOrder = responseOrderUpdateDispatchInventoryDetailsAfterUpdateOrder.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
		return responseOrderUpdateDispatchInventoryDetailsAfterUpdateOrder;

	}
}
