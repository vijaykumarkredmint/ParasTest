package orderFlowPositive;

import static io.restassured.RestAssured.given;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import allCommonData.AllCommonVariables;
import bearerTokenGenerate.VarBearerTokenGenerate;
import io.restassured.response.Response;

public class MethodsOrderFlowPositive {

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
	
//	InvoiceNumber
	public static String varInvoiceNumber="IN"+varOrderId;
	
//	InventoryDetailsAfterInvoiceNumber
	public static long varPendingStockAfterInvoiceNumber;
	public static long varTotalDemandAfterInvoiceNumber;
	public static long varUsedQuantityAfterInvoiceNumber;
	public static long varAvailableQuantityAfterInvoiceNumber;
	public static long varStockAfterInvoiceNumber;
	public static long varIntransientStockAfterInvoiceNumber;
	public static long varAvailableStockAfterInvoiceNumber;
	
//	InventoryDetailsAfterDeliver
	public static long varPendingStockAfterDeliver;
	public static long varTotalDemandAfterDeliver;
	public static long varUsedQuantityAfterDeliver;
	public static long varAvailableQuantityAfterDeliver;
	public static long varStockAfterDeliver;
	public static long varIntransientStockAfterDeliver;
	public static long varAvailableStockAfterDeliver;
	
//	InventoryDetailsAfterActionCompleteQC
	public static long varPendingStockAfterActionCompleteQC;
	public static long varTotalDemandAfterActionCompleteQC;
	public static long varUsedQuantityAfterActionCompleteQC;
	public static long varAvailableQuantityAfterActionCompleteQC;
	public static long varStockAfterActionCompleteQC;
	public static long varIntransientStockAfterActionCompleteQC;
	public static long varAvailableStockAfterActionCompleteQC;
	
//	InventoryDetailsAfterAcceptItemQC
	public static long varPendingStockAfterAcceptItemQC;
	public static long varTotalDemandAfterAcceptItemQC;
	public static long varUsedQuantityAfterAcceptItemQC;
	public static long varAvailableQuantityAfterAcceptItemQC;
	public static long varStockAfterAcceptItemQC;
	public static long varIntransientStockAfterAcceptItemQC;
	public static long varAvailableStockAfterAcceptItemQC;

// InventoryDetailsAfterCompleteQC
	public static long varPendingStockAfterCompleteQC;
	public static long varTotalDemandAfterCompleteQC;
	public static long varUsedQuantityAfterCompleteQC;
	public static long varAvailableQuantityAfterCompleteQC;
	public static long varStockAfterCompleteQC;
	public static long varIntransientStockAfterCompleteQC;
	public static long varAvailableStockAfterCompleteQC;

// InventoryDetailsAfterInventorySettlement
	public static long varPendingStockAfterInventorySettlement;
	public static long varTotalDemandAfterInventorySettlement;
	public static long varUsedQuantityAfterInventorySettlement;
	public static long varAvailableQuantityAfterInventorySettlement;
	public static long varStockAfterInventorySettlement;
	public static long varIntransientStockAfterInventorySettlement;
	public static long varAvailableStockAfterInventorySettlement;
	
	
	
	
	
	
	
	
	public static Response methodOrderFlowPositiveInventoryDetailsBeforeCreateOrder() {
		Response responseOrderFlowPositiveInventoryDetailsBeforeCreateOrder =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
		            .get("inventory?sku=SKUGH12&locationId=FT1");
		varPendingStockBeforeCreateOrder = responseOrderFlowPositiveInventoryDetailsBeforeCreateOrder.jsonPath().getLong("payload.packTypePendingStock.PCS");
		varTotalDemandBeforeCreateOrder = responseOrderFlowPositiveInventoryDetailsBeforeCreateOrder.jsonPath().getLong("payload.packTypeInflight.PCS");
		varStockBeforeCreateOrder=responseOrderFlowPositiveInventoryDetailsBeforeCreateOrder.jsonPath().getLong("payload.packTypeStock.PCS");
		varIntransientStockBeforeCreateOrder=responseOrderFlowPositiveInventoryDetailsBeforeCreateOrder.jsonPath().getLong("payload.packTypeTransient.PCS");
		varAvailableStockBeforeCreateOrder=responseOrderFlowPositiveInventoryDetailsBeforeCreateOrder.jsonPath().getLong("payload.packTypeAvailable.PCS");
		varAvailableQuantityBeforeCreateOrder=responseOrderFlowPositiveInventoryDetailsBeforeCreateOrder.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
		varUsedQuantityBeforeCreateOrder=responseOrderFlowPositiveInventoryDetailsBeforeCreateOrder.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
	    return responseOrderFlowPositiveInventoryDetailsBeforeCreateOrder;
	}
	    
	
	
	public static Response methodOrderFlowPositiveCreateOrder() {
		Response responseOrderFlowPositiveCreateOrder =
				given()
					.baseUri(AllCommonVariables.baseUriOrder)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            	.body(RequestPayloadsOrderFlowPositive.rTPCreateOrder)
	            .when()
	            	.post("orders/");
		varOrderId = responseOrderFlowPositiveCreateOrder.jsonPath().getString("payload.id");
	    return responseOrderFlowPositiveCreateOrder;
	}
	
	
	
	public static Response methodOrderFlowPositiveInventoryDetailsAfterCreateOrder() {
		Response responseOrderFlowPositiveInventoryDetailsAfterCreateOrder =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
		            .get("inventory?sku=SKUGH12&locationId=FT1");
		varPendingStockAfterCreateOrder = responseOrderFlowPositiveInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.packTypePendingStock.PCS");
		varTotalDemandAfterCreateOrder = responseOrderFlowPositiveInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.packTypeInflight.PCS");
		varStockAfterCreateOrder=responseOrderFlowPositiveInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.packTypeStock.PCS");
		varIntransientStockAfterCreateOrder=responseOrderFlowPositiveInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.packTypeTransient.PCS");
		varAvailableStockAfterCreateOrder=responseOrderFlowPositiveInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.packTypeAvailable.PCS");
		varAvailableQuantityAfterCreateOrder=responseOrderFlowPositiveInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
		varUsedQuantityAfterCreateOrder=responseOrderFlowPositiveInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
		varUsedQuantityAfterCreateOrder=responseOrderFlowPositiveInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
	    return responseOrderFlowPositiveInventoryDetailsAfterCreateOrder;
	}
	
	

	public static Response methodOrderFlowPositiveBatchAssign() {
		Response responseOrderFlowPositiveBatchAssign =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
	            	.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
	            	.patch("order/"+varOrderId+"/change?status=BatchAssigned");
		if (responseOrderFlowPositiveBatchAssign.statusCode() == 200) {
			varIbId = responseOrderFlowPositiveBatchAssign.jsonPath().getLong("payload.items[0].itemBatchDetails[0].ibId");
	    }
	    return responseOrderFlowPositiveBatchAssign;
	}
	
	public static Response methodOrderFlowPositiveInventoryDetailsAfterBatchAssign() {
		Response responseOrderFlowPositiveInventoryDetailsAfterBatchAssign =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
		            .get("inventory?sku=SKUGH12&locationId=FT1");
		varPendingStockAfterBatchAssign = responseOrderFlowPositiveInventoryDetailsAfterBatchAssign.jsonPath().getLong("payload.packTypePendingStock.PCS");
		varTotalDemandAfterBatchAssign = responseOrderFlowPositiveInventoryDetailsAfterBatchAssign.jsonPath().getLong("payload.packTypeInflight.PCS");
		varStockAfterBatchAssign=responseOrderFlowPositiveInventoryDetailsAfterBatchAssign.jsonPath().getLong("payload.packTypeStock.PCS");
		varIntransientStockAfterBatchAssign=responseOrderFlowPositiveInventoryDetailsAfterBatchAssign.jsonPath().getLong("payload.packTypeTransient.PCS");
		varAvailableStockAfterBatchAssign=responseOrderFlowPositiveInventoryDetailsAfterBatchAssign.jsonPath().getLong("payload.packTypeAvailable.PCS");
		varAvailableQuantityAfterBatchAssign=responseOrderFlowPositiveInventoryDetailsAfterBatchAssign.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
		varUsedQuantityAfterBatchAssign=responseOrderFlowPositiveInventoryDetailsAfterBatchAssign.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
	    return responseOrderFlowPositiveInventoryDetailsAfterBatchAssign;
	}

	
	
	public static Response methodOrderFlowPositiveMarkPacked() {
		Response responseOrderFlowPositiveMarkPacked =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
	            	.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
	            	.patch("order/"+varOrderId+"/change?status=Packed");
		return responseOrderFlowPositiveMarkPacked;
	}
	
	
	
	public static Response methodOrderFlowPositiveInventoryDetailsAfterMarkPacked() {
		Response responseOrderFlowPositiveInventoryDetailsAfterMarkPacked =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
		            .get("inventory?sku=SKUGH12&locationId=FT1");
		varPendingStockAfterMarkPacked = responseOrderFlowPositiveInventoryDetailsAfterMarkPacked.jsonPath().getLong("payload.packTypePendingStock.PCS");
		varTotalDemandAfterMarkPacked = responseOrderFlowPositiveInventoryDetailsAfterMarkPacked.jsonPath().getLong("payload.packTypeInflight.PCS");
		varStockAfterMarkPacked=responseOrderFlowPositiveInventoryDetailsAfterMarkPacked.jsonPath().getLong("payload.packTypeStock.PCS");
		varIntransientStockAfterMarkPacked=responseOrderFlowPositiveInventoryDetailsAfterMarkPacked.jsonPath().getLong("payload.packTypeTransient.PCS");
		varAvailableStockAfterMarkPacked=responseOrderFlowPositiveInventoryDetailsAfterMarkPacked.jsonPath().getLong("payload.packTypeAvailable.PCS");
		varAvailableQuantityAfterMarkPacked=responseOrderFlowPositiveInventoryDetailsAfterMarkPacked.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
		varUsedQuantityAfterMarkPacked=responseOrderFlowPositiveInventoryDetailsAfterMarkPacked.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
		return responseOrderFlowPositiveInventoryDetailsAfterMarkPacked;
	}
	
	
	
	public static Response methodOrderFlowPositiveCreateShipment() {
		Map<String, Object> rTPCreateShipment = new HashMap<>();
        String deliveryDate = LocalDate.now().toString();;
        String locationId = "FT1";
        rTPCreateShipment.put("deliveryDate", deliveryDate);
        rTPCreateShipment.put("locationId", locationId);
        List<String> orderIds = Arrays.asList(varOrderId);
        rTPCreateShipment.put("orderIds", orderIds);
        
		Response responseOrderFlowPositiveCreateShipment = given()
					.baseUri(AllCommonVariables.baseUriOrder)
	            	.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            	.body(rTPCreateShipment)
	            .when()
	            	.post("shipment/");
	    if (responseOrderFlowPositiveCreateShipment.statusCode() == 200) {
	    	varShipmentId = responseOrderFlowPositiveCreateShipment.jsonPath().getString("payload.id");
	    }
	    return responseOrderFlowPositiveCreateShipment;
	}
	
	
	
	public static Response methodOrderFlowPositiveInventoryDetailsAfterCreateShipment() {
		Response responseOrderFlowPositiveInventoryDetailsAfterCreateShipment =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
		            .get("inventory?sku=SKUGH12&locationId=FT1");
		varPendingStockAfterCreateShipment = responseOrderFlowPositiveInventoryDetailsAfterCreateShipment.jsonPath().getLong("payload.packTypePendingStock.PCS");
		varTotalDemandAfterCreateShipment = responseOrderFlowPositiveInventoryDetailsAfterCreateShipment.jsonPath().getLong("payload.packTypeInflight.PCS");
		varStockAfterCreateShipment=responseOrderFlowPositiveInventoryDetailsAfterCreateShipment.jsonPath().getLong("payload.packTypeStock.PCS");
		varIntransientStockAfterCreateShipment=responseOrderFlowPositiveInventoryDetailsAfterCreateShipment.jsonPath().getLong("payload.packTypeTransient.PCS");
		varAvailableStockAfterCreateShipment=responseOrderFlowPositiveInventoryDetailsAfterCreateShipment.jsonPath().getLong("payload.packTypeAvailable.PCS");
		varAvailableQuantityAfterCreateShipment=responseOrderFlowPositiveInventoryDetailsAfterCreateShipment.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
		varUsedQuantityAfterCreateShipment=responseOrderFlowPositiveInventoryDetailsAfterCreateShipment.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
		return responseOrderFlowPositiveInventoryDetailsAfterCreateShipment;
	}
	
	
	
	public static Response methodOrderFlowPositiveDispatch() {
	    Response responseOrderFlowPositiveDispatch = given()
	    			.baseUri(AllCommonVariables.baseUriOms)
	            	.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
	            	.patch("shipment/"+varShipmentId+"?status=Dispatched&lrNumber=LR+Number&vehicleNumber=Vehicle+Number&transporter=Name+of+Transporter");
	    return responseOrderFlowPositiveDispatch;
	}

	
	
	public static Response methodOrderFlowPositiveInventoryDetailsAfterDispatch() {
		Response responseOrderFlowPositiveInventoryDetailsAfterDispatch =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
		            .get("inventory?sku=SKUGH12&locationId=FT1");
		varPendingStockAfterDispatch = responseOrderFlowPositiveInventoryDetailsAfterDispatch.jsonPath().getLong("payload.packTypePendingStock.PCS");
		varTotalDemandAfterDispatch = responseOrderFlowPositiveInventoryDetailsAfterDispatch.jsonPath().getLong("payload.packTypeInflight.PCS");
		varStockAfterDispatch=responseOrderFlowPositiveInventoryDetailsAfterDispatch.jsonPath().getLong("payload.packTypeStock.PCS");
		varIntransientStockAfterDispatch=responseOrderFlowPositiveInventoryDetailsAfterDispatch.jsonPath().getLong("payload.packTypeTransient.PCS");
		varAvailableStockAfterDispatch=responseOrderFlowPositiveInventoryDetailsAfterDispatch.jsonPath().getLong("payload.packTypeAvailable.PCS");
		varAvailableQuantityAfterDispatch=responseOrderFlowPositiveInventoryDetailsAfterDispatch.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
		varUsedQuantityAfterDispatch=responseOrderFlowPositiveInventoryDetailsAfterDispatch.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
		return responseOrderFlowPositiveInventoryDetailsAfterDispatch;
	}
	
	
	
	public static Response methodOrderFlowPositiveInvoiceNumber() {
	    Response responseOrderFlowPositiveInvoiceNumber = given()
	    			.baseUri(AllCommonVariables.baseUriOms)
	            	.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
	            	.patch("https://oms-uat.kredmint.in/oms/order/"+varOrderId+"/invoice?invoice="+varInvoiceNumber);
	    return responseOrderFlowPositiveInvoiceNumber;
	}

	
	
	public static Response methodOrderFlowPositiveInventoryDetailsAfterInvoiceNumber() {
		Response responseOrderFlowPositiveInventoryDetailsAfterInvoiceNumber =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
		            .get("inventory?sku=SKUGH12&locationId=FT1");
		varPendingStockAfterInvoiceNumber = responseOrderFlowPositiveInventoryDetailsAfterInvoiceNumber.jsonPath().getLong("payload.packTypePendingStock.PCS");
		varTotalDemandAfterInvoiceNumber = responseOrderFlowPositiveInventoryDetailsAfterInvoiceNumber.jsonPath().getLong("payload.packTypeInflight.PCS");
		varStockAfterInvoiceNumber=responseOrderFlowPositiveInventoryDetailsAfterInvoiceNumber.jsonPath().getLong("payload.packTypeStock.PCS");
		varIntransientStockAfterInvoiceNumber=responseOrderFlowPositiveInventoryDetailsAfterInvoiceNumber.jsonPath().getLong("payload.packTypeTransient.PCS");
		varAvailableStockAfterInvoiceNumber=responseOrderFlowPositiveInventoryDetailsAfterInvoiceNumber.jsonPath().getLong("payload.packTypeAvailable.PCS");
		varAvailableQuantityAfterInvoiceNumber=responseOrderFlowPositiveInventoryDetailsAfterInvoiceNumber.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
		varUsedQuantityAfterInvoiceNumber=responseOrderFlowPositiveInventoryDetailsAfterInvoiceNumber.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
		return responseOrderFlowPositiveInventoryDetailsAfterInvoiceNumber;
	}
	
	
	
	public static Response methodOrderFlowPositiveDeliver() {
	    Response responseOrderFlowPositiveDeliver = given()
	    			.baseUri(AllCommonVariables.baseUriOms)
	            	.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
	            	.patch("orderStatus/"+varOrderId+"?updateStatus=Delivered");
	    return responseOrderFlowPositiveDeliver;
	}
	
	
	
	public static Response methodOrderFlowPositiveInventoryDetailsAfterDeliver() {
		Response responseOrderFlowPositiveInventoryDetailsAfterDeliver =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
		            .get("inventory?sku=SKUGH12&locationId=FT1");
		varPendingStockAfterDeliver = responseOrderFlowPositiveInventoryDetailsAfterDeliver.jsonPath().getLong("payload.packTypePendingStock.PCS");
		varTotalDemandAfterDeliver = responseOrderFlowPositiveInventoryDetailsAfterDeliver.jsonPath().getLong("payload.packTypeInflight.PCS");
		varStockAfterDeliver=responseOrderFlowPositiveInventoryDetailsAfterDeliver.jsonPath().getLong("payload.packTypeStock.PCS");
		varIntransientStockAfterDeliver=responseOrderFlowPositiveInventoryDetailsAfterDeliver.jsonPath().getLong("payload.packTypeTransient.PCS");
		varAvailableStockAfterDeliver=responseOrderFlowPositiveInventoryDetailsAfterDeliver.jsonPath().getLong("payload.packTypeAvailable.PCS");
		varAvailableQuantityAfterDeliver=responseOrderFlowPositiveInventoryDetailsAfterDeliver.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
		varUsedQuantityAfterDeliver=responseOrderFlowPositiveInventoryDetailsAfterDeliver.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
		return responseOrderFlowPositiveInventoryDetailsAfterDeliver;
	}

	
	
	public static Response methodOrderFlowPositiveActionCompleteQC() {
	    Response responseOrderFlowPositiveActionCompleteQC = given()
	    			.baseUri(AllCommonVariables.baseUriOms)
	            	.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            .when()
	            	.get("qualityCheck/"+varOrderId);
	    return responseOrderFlowPositiveActionCompleteQC;
	}
	
	
	
	public static Response methodOrderFlowPositiveInventoryDetailsAfterActionCompleteQC() {
		Response responseOrderFlowPositiveInventoryDetailsAfterActionCompleteQC =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
		            .get("inventory?sku=SKUGH12&locationId=FT1");
		varPendingStockAfterActionCompleteQC = responseOrderFlowPositiveInventoryDetailsAfterActionCompleteQC.jsonPath().getLong("payload.packTypePendingStock.PCS");
		varTotalDemandAfterActionCompleteQC = responseOrderFlowPositiveInventoryDetailsAfterActionCompleteQC.jsonPath().getLong("payload.packTypeInflight.PCS");
		varStockAfterActionCompleteQC=responseOrderFlowPositiveInventoryDetailsAfterActionCompleteQC.jsonPath().getLong("payload.packTypeStock.PCS");
		varIntransientStockAfterActionCompleteQC=responseOrderFlowPositiveInventoryDetailsAfterActionCompleteQC.jsonPath().getLong("payload.packTypeTransient.PCS");
		varAvailableStockAfterActionCompleteQC=responseOrderFlowPositiveInventoryDetailsAfterActionCompleteQC.jsonPath().getLong("payload.packTypeAvailable.PCS");
		varAvailableQuantityAfterActionCompleteQC=responseOrderFlowPositiveInventoryDetailsAfterActionCompleteQC.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
		varUsedQuantityAfterActionCompleteQC=responseOrderFlowPositiveInventoryDetailsAfterActionCompleteQC.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
		return responseOrderFlowPositiveInventoryDetailsAfterActionCompleteQC;
	}

	
	
	public static Response methodOrderFlowPositiveAcceptItemQC() {
		String varSku = "SKUGH12";
		long varIbId1 = varIbId;
		int varTotalRejectedQty = 0; 
		Integer varRejectedQty1 = null;
		boolean varFree1 = false;
		String rTPAcceptItemQC = "{\"sku\": \"" + varSku + "\", " +
			    "\"ibId\": " + varIbId1 + ", " +
			    "\"totalRejectedQty\": " + varTotalRejectedQty + ", " +
			    "\"rejectedQty\": " + varRejectedQty1 + ", " +
			    "\"free\": " + varFree1 + 
			"}";
	    Response responseOrderFlowPositiveAccept1CompleteQC =
	    		given()
	    			.baseUri(AllCommonVariables.baseUriOms)
	            	.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            	.body(rTPAcceptItemQC)
	            .when()
	            	.patch("qualityCheck/"+varOrderId);
	    return responseOrderFlowPositiveAccept1CompleteQC;
	}

	
	
	public static Response methodOrderFlowPositiveInventoryDetailsAfterAcceptItemQC() {
		Response responseOrderFlowPositiveInventoryDetailsAfterAcceptItemQC =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
		            .get("inventory?sku=SKUGH12&locationId=FT1");
		varPendingStockAfterAcceptItemQC = responseOrderFlowPositiveInventoryDetailsAfterAcceptItemQC.jsonPath().getLong("payload.packTypePendingStock.PCS");
		varTotalDemandAfterAcceptItemQC = responseOrderFlowPositiveInventoryDetailsAfterAcceptItemQC.jsonPath().getLong("payload.packTypeInflight.PCS");
		varStockAfterAcceptItemQC=responseOrderFlowPositiveInventoryDetailsAfterAcceptItemQC.jsonPath().getLong("payload.packTypeStock.PCS");
		varIntransientStockAfterAcceptItemQC=responseOrderFlowPositiveInventoryDetailsAfterAcceptItemQC.jsonPath().getLong("payload.packTypeTransient.PCS");
		varAvailableStockAfterAcceptItemQC=responseOrderFlowPositiveInventoryDetailsAfterAcceptItemQC.jsonPath().getLong("payload.packTypeAvailable.PCS");
		varAvailableQuantityAfterAcceptItemQC=responseOrderFlowPositiveInventoryDetailsAfterAcceptItemQC.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
		varUsedQuantityAfterAcceptItemQC=responseOrderFlowPositiveInventoryDetailsAfterAcceptItemQC.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
		return responseOrderFlowPositiveInventoryDetailsAfterAcceptItemQC;
	}

	
	
	public static Response methodOrderFlowPositiveCompleteQC() {
		Response responseOrderFlowPositiveCompleteQC =
	    		given()
	    			.baseUri(AllCommonVariables.baseUriOms)
	            	.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
	            	.patch("qualityCheck/"+varOrderId+"/qcCompleted");
	    return responseOrderFlowPositiveCompleteQC;
	}

	
	
	public static Response methodOrderFlowPositiveInventoryDetailsAfterCompleteQC() {
	    Response responseOrderFlowPositiveInventoryDetailsAfterCompleteQC =
	            given()
	                .baseUri(AllCommonVariables.baseUriOms)
	                .header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	                .header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
	                .get("inventory?sku=SKUGH12&locationId=FT1");

	    varPendingStockAfterCompleteQC = responseOrderFlowPositiveInventoryDetailsAfterCompleteQC.jsonPath().getLong("payload.packTypePendingStock.PCS");
	    varTotalDemandAfterCompleteQC = responseOrderFlowPositiveInventoryDetailsAfterCompleteQC.jsonPath().getLong("payload.packTypeInflight.PCS");
	    varStockAfterCompleteQC = responseOrderFlowPositiveInventoryDetailsAfterCompleteQC.jsonPath().getLong("payload.packTypeStock.PCS");
	    varIntransientStockAfterCompleteQC = responseOrderFlowPositiveInventoryDetailsAfterCompleteQC.jsonPath().getLong("payload.packTypeTransient.PCS");
	    varAvailableStockAfterCompleteQC = responseOrderFlowPositiveInventoryDetailsAfterCompleteQC.jsonPath().getLong("payload.packTypeAvailable.PCS");
	    varAvailableQuantityAfterCompleteQC = responseOrderFlowPositiveInventoryDetailsAfterCompleteQC.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
	    varUsedQuantityAfterCompleteQC = responseOrderFlowPositiveInventoryDetailsAfterCompleteQC.jsonPath().getLong("payload.batchDetailsList[0].usedQty");

	    return responseOrderFlowPositiveInventoryDetailsAfterCompleteQC;
	}

	
	
	public static Response methodOrderFlowPositiveInventorySettlement() {
		Response responseOrderFlowPositiveInventorySettlement =
	    		given()
	    			.baseUri(AllCommonVariables.baseUriOms)
	            	.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type",  AllCommonVariables.varContentTypeHeader)
	            .when()
	            	.patch("qualityCheck/"+varOrderId+"/inventorySettlement");
	    return responseOrderFlowPositiveInventorySettlement;
	}
	
	
	
	public static Response methodOrderFlowPositiveInventoryDetailsAfterInventorySettlement() {
	    Response responseOrderFlowPositiveInventoryDetailsAfterInventorySettlement =
	            given()
	                .baseUri(AllCommonVariables.baseUriOms)
	                .header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	                .header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
	                .get("inventory?sku=SKUGH12&locationId=FT1");

	    varPendingStockAfterInventorySettlement = responseOrderFlowPositiveInventoryDetailsAfterInventorySettlement.jsonPath().getLong("payload.packTypePendingStock.PCS");
	    varTotalDemandAfterInventorySettlement = responseOrderFlowPositiveInventoryDetailsAfterInventorySettlement.jsonPath().getLong("payload.packTypeInflight.PCS");
	    varStockAfterInventorySettlement = responseOrderFlowPositiveInventoryDetailsAfterInventorySettlement.jsonPath().getLong("payload.packTypeStock.PCS");
	    varIntransientStockAfterInventorySettlement = responseOrderFlowPositiveInventoryDetailsAfterInventorySettlement.jsonPath().getLong("payload.packTypeTransient.PCS");
	    varAvailableStockAfterInventorySettlement = responseOrderFlowPositiveInventoryDetailsAfterInventorySettlement.jsonPath().getLong("payload.packTypeAvailable.PCS");
	    varAvailableQuantityAfterInventorySettlement = responseOrderFlowPositiveInventoryDetailsAfterInventorySettlement.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
	    varUsedQuantityAfterInventorySettlement = responseOrderFlowPositiveInventoryDetailsAfterInventorySettlement.jsonPath().getLong("payload.batchDetailsList[0].usedQty");

	    return responseOrderFlowPositiveInventoryDetailsAfterInventorySettlement;
	}

	
	
}
