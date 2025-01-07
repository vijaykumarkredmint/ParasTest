package orderFlowNegative;

import static io.restassured.RestAssured.given;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import allCommonData.AllCommonVariables;
import bearerTokenGenerate.VarBearerTokenGenerate;
import io.restassured.response.Response;

public class MethodsOrderFlowNegative {

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
	
//	InventoryDetailsAfterMarkShipped
	public static long varPendingStockAfterMarkShipped;
	public static long varTotalDemandAfterMarkShipped;
	public static long varUsedQuantityAfterMarkShipped;
	public static long varAvailableQuantityAfterMarkShipped;
	public static long varStockAfterMarkShipped;
	public static long varIntransientStockAfterMarkShipped;
	public static long varAvailableStockAfterMarkShipped;
	
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
	
//	InventoryDetailsAfterRejectItemQC
	public static long varPendingStockAfterRejectItemQC;
	public static long varTotalDemandAfterRejectItemQC;
	public static long varUsedQuantityAfterRejectItemQC;
	public static long varAvailableQuantityAfterRejectItemQC;
	public static long varStockAfterRejectItemQC;
	public static long varIntransientStockAfterRejectItemQC;
	public static long varAvailableStockAfterRejectItemQC;

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
	
//	ReturnOrder
	public static String varOrderIdReturn;
	
// InventoryDetailsAfterOrderIdReturn
	public static long varPendingStockAfterOrderIdReturn;
	public static long varTotalDemandAfterOrderIdReturn;
	public static long varUsedQuantityAfterOrderIdReturn;
	public static long varAvailableQuantityAfterOrderIdReturn;
	public static long varStockAfterOrderIdReturn;
	public static long varIntransientStockAfterOrderIdReturn;
	public static long varAvailableStockAfterOrderIdReturn;
	
// InventoryDetailsAfterActionCompleteQCReturn
	public static long varPendingStockAfterActionCompleteQCReturn;
	public static long varTotalDemandAfterActionCompleteQCReturn;
	public static long varUsedQuantityAfterActionCompleteQCReturn;
	public static long varAvailableQuantityAfterActionCompleteQCReturn;
	public static long varStockAfterActionCompleteQCReturn;
	public static long varIntransientStockAfterActionCompleteQCReturn;
	public static long varAvailableStockAfterActionCompleteQCReturn;
	
// InventoryDetailsAfterAcceptItemQCReturn
	public static long varPendingStockAfterAcceptItemQCReturn;
	public static long varTotalDemandAfterAcceptItemQCReturn;
	public static long varUsedQuantityAfterAcceptItemQCReturn;
	public static long varAvailableQuantityAfterAcceptItemQCReturn;
	public static long varStockAfterAcceptItemQCReturn;
	public static long varIntransientStockAfterAcceptItemQCReturn;
	public static long varAvailableStockAfterAcceptItemQCReturn;

// InventoryDetailsAfterCompleteQCReturn
	public static long varPendingStockAfterCompleteQCReturn;
	public static long varTotalDemandAfterCompleteQCReturn;
	public static long varUsedQuantityAfterCompleteQCReturn;
	public static long varAvailableQuantityAfterCompleteQCReturn;
	public static long varStockAfterCompleteQCReturn;
	public static long varIntransientStockAfterCompleteQCReturn;
	public static long varAvailableStockAfterCompleteQCReturn;
		
// InventoryDetailsAfterInventorySettlementReturn
	public static long varPendingStockAfterInventorySettlementReturn;
	public static long varTotalDemandAfterInventorySettlementReturn;
	public static long varUsedQuantityAfterInventorySettlementReturn;
	public static long varAvailableQuantityAfterInventorySettlementReturn;
	public static long varStockAfterInventorySettlementReturn;
	public static long varIntransientStockAfterInventorySettlementReturn;
	public static long varAvailableStockAfterInventorySettlementReturn;


		
	
	
	public static Response methodOrderFlowNegativeInventoryDetailsBeforeCreateOrder() {
		Response responseOrderFlowNegativeInventoryDetailsBeforeCreateOrder =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
		            .get("inventory?sku=SKUGH13&locationId=FT1");
		varPendingStockBeforeCreateOrder = responseOrderFlowNegativeInventoryDetailsBeforeCreateOrder.jsonPath().getLong("payload.packTypePendingStock.PCS");
		varTotalDemandBeforeCreateOrder = responseOrderFlowNegativeInventoryDetailsBeforeCreateOrder.jsonPath().getLong("payload.packTypeInflight.PCS");
		varStockBeforeCreateOrder=responseOrderFlowNegativeInventoryDetailsBeforeCreateOrder.jsonPath().getLong("payload.packTypeStock.PCS");
		varIntransientStockBeforeCreateOrder=responseOrderFlowNegativeInventoryDetailsBeforeCreateOrder.jsonPath().getLong("payload.packTypeTransient.PCS");
		varAvailableStockBeforeCreateOrder=responseOrderFlowNegativeInventoryDetailsBeforeCreateOrder.jsonPath().getLong("payload.packTypeAvailable.PCS");
		varAvailableQuantityBeforeCreateOrder=responseOrderFlowNegativeInventoryDetailsBeforeCreateOrder.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
		varUsedQuantityBeforeCreateOrder=responseOrderFlowNegativeInventoryDetailsBeforeCreateOrder.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
	    return responseOrderFlowNegativeInventoryDetailsBeforeCreateOrder;
	}
	    
	
	
	public static Response methodOrderFlowNegativeCreateOrder() {
		Response responseOrderFlowNegativeCreateOrder =
				given()
					.baseUri(AllCommonVariables.baseUriOrder)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            	.body(RequestPayloadsOrderFlowNegative.rTPCreateOrder)
	            .when()
	            	.post("orders/");
		varOrderId = responseOrderFlowNegativeCreateOrder.jsonPath().getString("payload.id");
	    return responseOrderFlowNegativeCreateOrder;
	}
	
	
	
	public static Response methodOrderFlowNegativeInventoryDetailsAfterCreateOrder() {
		Response responseOrderFlowNegativeInventoryDetailsAfterCreateOrder =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
		            .get("inventory?sku=SKUGH13&locationId=FT1");
		varPendingStockAfterCreateOrder = responseOrderFlowNegativeInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.packTypePendingStock.PCS");
		varTotalDemandAfterCreateOrder = responseOrderFlowNegativeInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.packTypeInflight.PCS");
		varStockAfterCreateOrder=responseOrderFlowNegativeInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.packTypeStock.PCS");
		varIntransientStockAfterCreateOrder=responseOrderFlowNegativeInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.packTypeTransient.PCS");
		varAvailableStockAfterCreateOrder=responseOrderFlowNegativeInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.packTypeAvailable.PCS");
		varAvailableQuantityAfterCreateOrder=responseOrderFlowNegativeInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
		varUsedQuantityAfterCreateOrder=responseOrderFlowNegativeInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
		varUsedQuantityAfterCreateOrder=responseOrderFlowNegativeInventoryDetailsAfterCreateOrder.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
	    return responseOrderFlowNegativeInventoryDetailsAfterCreateOrder;
	}
	
	

	public static Response methodOrderFlowNegativeBatchAssign() {
		Response responseOrderFlowNegativeBatchAssign =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
	            	.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
	            	.patch("order/"+varOrderId+"/change?status=BatchAssigned");
		if (responseOrderFlowNegativeBatchAssign.statusCode() == 200) {
			varIbId = responseOrderFlowNegativeBatchAssign.jsonPath().getLong("payload.items[0].itemBatchDetails[0].ibId");
	    }
	    return responseOrderFlowNegativeBatchAssign;
	}
	
	public static Response methodOrderFlowNegativeInventoryDetailsAfterBatchAssign() {
		Response responseOrderFlowNegativeInventoryDetailsAfterBatchAssign =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
		            .get("inventory?sku=SKUGH13&locationId=FT1");
		varPendingStockAfterBatchAssign = responseOrderFlowNegativeInventoryDetailsAfterBatchAssign.jsonPath().getLong("payload.packTypePendingStock.PCS");
		varTotalDemandAfterBatchAssign = responseOrderFlowNegativeInventoryDetailsAfterBatchAssign.jsonPath().getLong("payload.packTypeInflight.PCS");
		varStockAfterBatchAssign=responseOrderFlowNegativeInventoryDetailsAfterBatchAssign.jsonPath().getLong("payload.packTypeStock.PCS");
		varIntransientStockAfterBatchAssign=responseOrderFlowNegativeInventoryDetailsAfterBatchAssign.jsonPath().getLong("payload.packTypeTransient.PCS");
		varAvailableStockAfterBatchAssign=responseOrderFlowNegativeInventoryDetailsAfterBatchAssign.jsonPath().getLong("payload.packTypeAvailable.PCS");
		varAvailableQuantityAfterBatchAssign=responseOrderFlowNegativeInventoryDetailsAfterBatchAssign.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
		varUsedQuantityAfterBatchAssign=responseOrderFlowNegativeInventoryDetailsAfterBatchAssign.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
	    return responseOrderFlowNegativeInventoryDetailsAfterBatchAssign;
	}

	
	
	public static Response methodOrderFlowNegativeMarkPacked() {
		Response responseOrderFlowNegativeMarkPacked =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
	            	.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
	            	.patch("order/"+varOrderId+"/change?status=Packed");
		return responseOrderFlowNegativeMarkPacked;
	}
	
	
	
	public static Response methodOrderFlowNegativeInventoryDetailsAfterMarkPacked() {
		Response responseOrderFlowNegativeInventoryDetailsAfterMarkPacked =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
		            .get("inventory?sku=SKUGH13&locationId=FT1");
		varPendingStockAfterMarkPacked = responseOrderFlowNegativeInventoryDetailsAfterMarkPacked.jsonPath().getLong("payload.packTypePendingStock.PCS");
		varTotalDemandAfterMarkPacked = responseOrderFlowNegativeInventoryDetailsAfterMarkPacked.jsonPath().getLong("payload.packTypeInflight.PCS");
		varStockAfterMarkPacked=responseOrderFlowNegativeInventoryDetailsAfterMarkPacked.jsonPath().getLong("payload.packTypeStock.PCS");
		varIntransientStockAfterMarkPacked=responseOrderFlowNegativeInventoryDetailsAfterMarkPacked.jsonPath().getLong("payload.packTypeTransient.PCS");
		varAvailableStockAfterMarkPacked=responseOrderFlowNegativeInventoryDetailsAfterMarkPacked.jsonPath().getLong("payload.packTypeAvailable.PCS");
		varAvailableQuantityAfterMarkPacked=responseOrderFlowNegativeInventoryDetailsAfterMarkPacked.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
		varUsedQuantityAfterMarkPacked=responseOrderFlowNegativeInventoryDetailsAfterMarkPacked.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
		return responseOrderFlowNegativeInventoryDetailsAfterMarkPacked;
	}
	
	
	
	public static Response methodOrderFlowNegativeCreateShipment() {
		Map<String, Object> rTPCreateShipment = new HashMap<>();
        String deliveryDate = LocalDate.now().toString();;
        String locationId = "FT1";
        rTPCreateShipment.put("deliveryDate", deliveryDate);
        rTPCreateShipment.put("locationId", locationId);
        List<String> orderIds = Arrays.asList(varOrderId);
        rTPCreateShipment.put("orderIds", orderIds);
        
		Response responseOrderFlowNegativeCreateShipment = given()
					.baseUri(AllCommonVariables.baseUriOrder)
	            	.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            	.body(rTPCreateShipment)
	            .when()
	            	.post("shipment/");
	    if (responseOrderFlowNegativeCreateShipment.statusCode() == 200) {
	    	varShipmentId = responseOrderFlowNegativeCreateShipment.jsonPath().getString("payload.id");
	    }
	    return responseOrderFlowNegativeCreateShipment;
	}
	
	
	
	public static Response methodOrderFlowNegativeInventoryDetailsCreateShipment() {
		Response responseOrderFlowNegativeInventoryDetailsAfterCreateShipment =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
		            .get("inventory?sku=SKUGH13&locationId=FT1");
		varPendingStockAfterCreateShipment = responseOrderFlowNegativeInventoryDetailsAfterCreateShipment.jsonPath().getLong("payload.packTypePendingStock.PCS");
		varTotalDemandAfterCreateShipment = responseOrderFlowNegativeInventoryDetailsAfterCreateShipment.jsonPath().getLong("payload.packTypeInflight.PCS");
		varStockAfterCreateShipment=responseOrderFlowNegativeInventoryDetailsAfterCreateShipment.jsonPath().getLong("payload.packTypeStock.PCS");
		varIntransientStockAfterCreateShipment=responseOrderFlowNegativeInventoryDetailsAfterCreateShipment.jsonPath().getLong("payload.packTypeTransient.PCS");
		varAvailableStockAfterCreateShipment=responseOrderFlowNegativeInventoryDetailsAfterCreateShipment.jsonPath().getLong("payload.packTypeAvailable.PCS");
		varAvailableQuantityAfterCreateShipment=responseOrderFlowNegativeInventoryDetailsAfterCreateShipment.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
		varUsedQuantityAfterCreateShipment=responseOrderFlowNegativeInventoryDetailsAfterCreateShipment.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
		return responseOrderFlowNegativeInventoryDetailsAfterCreateShipment;
	}
	
	
	
	public static Response methodOrderFlowNegativeDispatch() {
	    Response responseOrderFlowNegativeDispatch = given()
	    			.baseUri(AllCommonVariables.baseUriOms)
	            	.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
	            	.patch("shipment/"+varShipmentId+"?status=Dispatched&lrNumber=LR+Number&vehicleNumber=Vehicle+Number&transporter=Name+of+Transporter");
	    return responseOrderFlowNegativeDispatch;
	}

	
	
	public static Response methodOrderFlowNegativeInventoryDetailsDispatch() {
		Response responseOrderFlowNegativeInventoryDetailsAfterDispatch =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
		            .get("inventory?sku=SKUGH13&locationId=FT1");
		varPendingStockAfterDispatch = responseOrderFlowNegativeInventoryDetailsAfterDispatch.jsonPath().getLong("payload.packTypePendingStock.PCS");
		varTotalDemandAfterDispatch = responseOrderFlowNegativeInventoryDetailsAfterDispatch.jsonPath().getLong("payload.packTypeInflight.PCS");
		varStockAfterDispatch=responseOrderFlowNegativeInventoryDetailsAfterDispatch.jsonPath().getLong("payload.packTypeStock.PCS");
		varIntransientStockAfterDispatch=responseOrderFlowNegativeInventoryDetailsAfterDispatch.jsonPath().getLong("payload.packTypeTransient.PCS");
		varAvailableStockAfterDispatch=responseOrderFlowNegativeInventoryDetailsAfterDispatch.jsonPath().getLong("payload.packTypeAvailable.PCS");
		varAvailableQuantityAfterDispatch=responseOrderFlowNegativeInventoryDetailsAfterDispatch.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
		varUsedQuantityAfterDispatch=responseOrderFlowNegativeInventoryDetailsAfterDispatch.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
		return responseOrderFlowNegativeInventoryDetailsAfterDispatch;
	}

	
	
	public static Response methodOrderFlowNegativeMarkShipped() {
	    Response responseOrderFlowNegativeMarkShipped = given()
	    			.baseUri(AllCommonVariables.baseUriOms)
	            	.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
	            	.patch("order/"+varOrderId+"/shipped?status=SHIPPED");
	    return responseOrderFlowNegativeMarkShipped;
	}
	
	
	
	public static Response methodOrderFlowNegativeInventoryDetailsAfterMarkShipped() {
		Response responseOrderFlowNegativeInventoryDetailsAfterMarkShipped =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
		            .get("inventory?sku=SKUGH13&locationId=FT1");
		varPendingStockAfterMarkShipped = responseOrderFlowNegativeInventoryDetailsAfterMarkShipped.jsonPath().getLong("payload.packTypePendingStock.PCS");
		varTotalDemandAfterMarkShipped = responseOrderFlowNegativeInventoryDetailsAfterMarkShipped.jsonPath().getLong("payload.packTypeInflight.PCS");
		varStockAfterMarkShipped=responseOrderFlowNegativeInventoryDetailsAfterMarkShipped.jsonPath().getLong("payload.packTypeStock.PCS");
		varIntransientStockAfterMarkShipped=responseOrderFlowNegativeInventoryDetailsAfterMarkShipped.jsonPath().getLong("payload.packTypeTransient.PCS");
		varAvailableStockAfterMarkShipped=responseOrderFlowNegativeInventoryDetailsAfterMarkShipped.jsonPath().getLong("payload.packTypeAvailable.PCS");
		varAvailableQuantityAfterMarkShipped=responseOrderFlowNegativeInventoryDetailsAfterMarkShipped.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
		varUsedQuantityAfterMarkShipped=responseOrderFlowNegativeInventoryDetailsAfterMarkShipped.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
		return responseOrderFlowNegativeInventoryDetailsAfterMarkShipped;
	}

	
	
	public static Response methodOrderFlowNegativeInvoiceNumber() {
	    Response responseOrderFlowNegativeInvoiceNumber = given()
	    			.baseUri(AllCommonVariables.baseUriOms)
	            	.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
	            	.patch("order/"+varOrderId+"/invoice?invoice="+varInvoiceNumber);
	    return responseOrderFlowNegativeInvoiceNumber;
	}

	
	
	public static Response methodOrderFlowNegativeInventoryDetailsAfterInvoiceNumber() {
		Response responseOrderFlowNegativeInventoryDetailsAfterInvoiceNumber =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
		            .get("inventory?sku=SKUGH13&locationId=FT1");
		varPendingStockAfterInvoiceNumber = responseOrderFlowNegativeInventoryDetailsAfterInvoiceNumber.jsonPath().getLong("payload.packTypePendingStock.PCS");
		varTotalDemandAfterInvoiceNumber = responseOrderFlowNegativeInventoryDetailsAfterInvoiceNumber.jsonPath().getLong("payload.packTypeInflight.PCS");
		varStockAfterInvoiceNumber=responseOrderFlowNegativeInventoryDetailsAfterInvoiceNumber.jsonPath().getLong("payload.packTypeStock.PCS");
		varIntransientStockAfterInvoiceNumber=responseOrderFlowNegativeInventoryDetailsAfterInvoiceNumber.jsonPath().getLong("payload.packTypeTransient.PCS");
		varAvailableStockAfterInvoiceNumber=responseOrderFlowNegativeInventoryDetailsAfterInvoiceNumber.jsonPath().getLong("payload.packTypeAvailable.PCS");
		varAvailableQuantityAfterInvoiceNumber=responseOrderFlowNegativeInventoryDetailsAfterInvoiceNumber.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
		varUsedQuantityAfterInvoiceNumber=responseOrderFlowNegativeInventoryDetailsAfterInvoiceNumber.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
		return responseOrderFlowNegativeInventoryDetailsAfterInvoiceNumber;
	}

	
	
	public static Response methodOrderFlowNegativeDeliver() {
	    Response responseOrderFlowNegativeDeliver = given()
	    			.baseUri(AllCommonVariables.baseUriOms)
	            	.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
	            	.patch("orderStatus/"+varOrderId+"?updateStatus=Delivered");
	    return responseOrderFlowNegativeDeliver;
	}
	
	
	
	public static Response methodOrderFlowNegativeInventoryDetailsDeliver() {
		Response responseOrderFlowNegativeInventoryDetailsAfterDeliver =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
		            .get("inventory?sku=SKUGH13&locationId=FT1");
		varPendingStockAfterDeliver = responseOrderFlowNegativeInventoryDetailsAfterDeliver.jsonPath().getLong("payload.packTypePendingStock.PCS");
		varTotalDemandAfterDeliver = responseOrderFlowNegativeInventoryDetailsAfterDeliver.jsonPath().getLong("payload.packTypeInflight.PCS");
		varStockAfterDeliver=responseOrderFlowNegativeInventoryDetailsAfterDeliver.jsonPath().getLong("payload.packTypeStock.PCS");
		varIntransientStockAfterDeliver=responseOrderFlowNegativeInventoryDetailsAfterDeliver.jsonPath().getLong("payload.packTypeTransient.PCS");
		varAvailableStockAfterDeliver=responseOrderFlowNegativeInventoryDetailsAfterDeliver.jsonPath().getLong("payload.packTypeAvailable.PCS");
		varAvailableQuantityAfterDeliver=responseOrderFlowNegativeInventoryDetailsAfterDeliver.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
		varUsedQuantityAfterDeliver=responseOrderFlowNegativeInventoryDetailsAfterDeliver.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
		return responseOrderFlowNegativeInventoryDetailsAfterDeliver;
	}

	
	
	public static Response methodOrderFlowNegativeActionCompleteQC() {
	    Response responseOrderFlowNegativeActionCompleteQC = given()
	    			.baseUri(AllCommonVariables.baseUriOms)
	            	.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            .when()
	            	.get("qualityCheck/"+varOrderId);
	    return responseOrderFlowNegativeActionCompleteQC;
	}
	
	
	
	public static Response methodOrderFlowNegativeInventoryDetailsActionCompleteQC() {
		Response responseOrderFlowNegativeInventoryDetailsAfterActionCompleteQC =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
		            .get("inventory?sku=SKUGH13&locationId=FT1");
		varPendingStockAfterActionCompleteQC = responseOrderFlowNegativeInventoryDetailsAfterActionCompleteQC.jsonPath().getLong("payload.packTypePendingStock.PCS");
		varTotalDemandAfterActionCompleteQC = responseOrderFlowNegativeInventoryDetailsAfterActionCompleteQC.jsonPath().getLong("payload.packTypeInflight.PCS");
		varStockAfterActionCompleteQC=responseOrderFlowNegativeInventoryDetailsAfterActionCompleteQC.jsonPath().getLong("payload.packTypeStock.PCS");
		varIntransientStockAfterActionCompleteQC=responseOrderFlowNegativeInventoryDetailsAfterActionCompleteQC.jsonPath().getLong("payload.packTypeTransient.PCS");
		varAvailableStockAfterActionCompleteQC=responseOrderFlowNegativeInventoryDetailsAfterActionCompleteQC.jsonPath().getLong("payload.packTypeAvailable.PCS");
		varAvailableQuantityAfterActionCompleteQC=responseOrderFlowNegativeInventoryDetailsAfterActionCompleteQC.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
		varUsedQuantityAfterActionCompleteQC=responseOrderFlowNegativeInventoryDetailsAfterActionCompleteQC.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
		return responseOrderFlowNegativeInventoryDetailsAfterActionCompleteQC;
	}

	
	
	public static Response methodOrderFlowNegativeRejectItemQC() {
		// Variables
        String varSku = "SKUGH13";
        long varIbId1 = varIbId;
        long varTotalRejectedQty = varOrderedQuantity;
        
        // Variables for rejectedQty details
        String varQty = String.valueOf(varOrderedQuantity);
        String varReason = "DAMAGE_PRODUCT";
        String varCustomReason = "NA";
        String varProof = "null";

        // Constructing the rejectedQty JSON string
        String varRejectedQty1 = "["
            + "{\"qty\": \"" + varQty + "\", "
            + "\"reason\": \"" + varReason + "\", "
            + "\"customReason\": \"" + varCustomReason + "\", "
            + "\"proof\": " + varProof + "}"
            + "]";
        
        boolean varFree1 = false;

        // Final JSON String construction
        String rTPRejectItemQC = "{\"sku\": \"" + varSku + "\", " +
                "\"ibId\": " + varIbId1 + ", " +
                "\"totalRejectedQty\": " + varTotalRejectedQty + ", " +
                "\"rejectedQty\": " + varRejectedQty1 + ", " +
                "\"free\": " + varFree1 + 
            "}";
	    Response responseOrderFlowNegativeAccept1CompleteQC =
	    		given()
	    			.baseUri(AllCommonVariables.baseUriOms)
	            	.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            	.body(rTPRejectItemQC)
	            .when()
	            	.patch("qualityCheck/"+varOrderId);
	    return responseOrderFlowNegativeAccept1CompleteQC;
	}

	
	
	public static Response methodOrderFlowNegativeInventoryDetailsRejectItemQC() {
		Response responseOrderFlowNegativeInventoryDetailsAfterRejectItemQC =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
		            .get("inventory?sku=SKUGH13&locationId=FT1");
		varPendingStockAfterRejectItemQC = responseOrderFlowNegativeInventoryDetailsAfterRejectItemQC.jsonPath().getLong("payload.packTypePendingStock.PCS");
		varTotalDemandAfterRejectItemQC = responseOrderFlowNegativeInventoryDetailsAfterRejectItemQC.jsonPath().getLong("payload.packTypeInflight.PCS");
		varStockAfterRejectItemQC=responseOrderFlowNegativeInventoryDetailsAfterRejectItemQC.jsonPath().getLong("payload.packTypeStock.PCS");
		varIntransientStockAfterRejectItemQC=responseOrderFlowNegativeInventoryDetailsAfterRejectItemQC.jsonPath().getLong("payload.packTypeTransient.PCS");
		varAvailableStockAfterRejectItemQC=responseOrderFlowNegativeInventoryDetailsAfterRejectItemQC.jsonPath().getLong("payload.packTypeAvailable.PCS");
		varAvailableQuantityAfterRejectItemQC=responseOrderFlowNegativeInventoryDetailsAfterRejectItemQC.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
		varUsedQuantityAfterRejectItemQC=responseOrderFlowNegativeInventoryDetailsAfterRejectItemQC.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
		return responseOrderFlowNegativeInventoryDetailsAfterRejectItemQC;
	}

	
	
	public static Response methodOrderFlowNegativeCompleteQC() {
		Response responseOrderFlowNegativeCompleteQC =
	    		given()
	    			.baseUri(AllCommonVariables.baseUriOms)
	            	.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
	            	.patch("qualityCheck/"+varOrderId+"/qcCompleted");
	    return responseOrderFlowNegativeCompleteQC;
	}

	
	
	public static Response methodOrderFlowNegativeInventoryDetailsCompleteQC() {
	    Response responseOrderFlowNegativeInventoryDetailsAfterCompleteQC =
	            given()
	                .baseUri(AllCommonVariables.baseUriOms)
	                .header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	                .header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
	                .get("inventory?sku=SKUGH13&locationId=FT1");

	    varPendingStockAfterCompleteQC = responseOrderFlowNegativeInventoryDetailsAfterCompleteQC.jsonPath().getLong("payload.packTypePendingStock.PCS");
	    varTotalDemandAfterCompleteQC = responseOrderFlowNegativeInventoryDetailsAfterCompleteQC.jsonPath().getLong("payload.packTypeInflight.PCS");
	    varStockAfterCompleteQC = responseOrderFlowNegativeInventoryDetailsAfterCompleteQC.jsonPath().getLong("payload.packTypeStock.PCS");
	    varIntransientStockAfterCompleteQC = responseOrderFlowNegativeInventoryDetailsAfterCompleteQC.jsonPath().getLong("payload.packTypeTransient.PCS");
	    varAvailableStockAfterCompleteQC = responseOrderFlowNegativeInventoryDetailsAfterCompleteQC.jsonPath().getLong("payload.packTypeAvailable.PCS");
	    varAvailableQuantityAfterCompleteQC = responseOrderFlowNegativeInventoryDetailsAfterCompleteQC.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
	    varUsedQuantityAfterCompleteQC = responseOrderFlowNegativeInventoryDetailsAfterCompleteQC.jsonPath().getLong("payload.batchDetailsList[0].usedQty");

	    return responseOrderFlowNegativeInventoryDetailsAfterCompleteQC;
	}

	
	
	public static Response methodOrderFlowNegativeInventorySettlement() {
		Response responseOrderFlowNegativeInventorySettlement =
	    		given()
	    			.baseUri(AllCommonVariables.baseUriOms)
	            	.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type",  AllCommonVariables.varContentTypeHeader)
	            .when()
	            	.patch("qualityCheck/"+varOrderId+"/inventorySettlement");
	    return responseOrderFlowNegativeInventorySettlement;
	}
	
	
	
	public static Response methodOrderFlowNegativeInventoryDetailsInventorySettlement() {
	    Response responseOrderFlowNegativeInventoryDetailsAfterInventorySettlement =
	            given()
	                .baseUri(AllCommonVariables.baseUriOms)
	                .header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	                .header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
	                .get("inventory?sku=SKUGH13&locationId=FT1");

	    varPendingStockAfterInventorySettlement = responseOrderFlowNegativeInventoryDetailsAfterInventorySettlement.jsonPath().getLong("payload.packTypePendingStock.PCS");
	    varTotalDemandAfterInventorySettlement = responseOrderFlowNegativeInventoryDetailsAfterInventorySettlement.jsonPath().getLong("payload.packTypeInflight.PCS");
	    varStockAfterInventorySettlement = responseOrderFlowNegativeInventoryDetailsAfterInventorySettlement.jsonPath().getLong("payload.packTypeStock.PCS");
	    varIntransientStockAfterInventorySettlement = responseOrderFlowNegativeInventoryDetailsAfterInventorySettlement.jsonPath().getLong("payload.packTypeTransient.PCS");
	    varAvailableStockAfterInventorySettlement = responseOrderFlowNegativeInventoryDetailsAfterInventorySettlement.jsonPath().getLong("payload.packTypeAvailable.PCS");
	    varAvailableQuantityAfterInventorySettlement = responseOrderFlowNegativeInventoryDetailsAfterInventorySettlement.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
	    varUsedQuantityAfterInventorySettlement = responseOrderFlowNegativeInventoryDetailsAfterInventorySettlement.jsonPath().getLong("payload.batchDetailsList[0].usedQty");

	    return responseOrderFlowNegativeInventoryDetailsAfterInventorySettlement;
	}
	
	public static Response methodOrderFlowNegativeOrderIdReturn() {
		Response responseOrderFlowNegativeOrderIdReturn =
	    		given()
	    			.baseUri(AllCommonVariables.baseUriOms)
	            	.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type",  AllCommonVariables.varContentTypeHeader)
	            .when()
	            	.get("order/"+varOrderId+"/child");
		varOrderIdReturn = responseOrderFlowNegativeOrderIdReturn.jsonPath().getString("payload.childOrderId");
	    
	    return responseOrderFlowNegativeOrderIdReturn;
	}
	
	
	
	public static Response methodOrderFlowNegativeInventoryDetailsOrderIdReturn() {
	    Response responseOrderFlowNegativeInventoryDetailsAfterOrderIdReturn =
	            given()
	                .baseUri(AllCommonVariables.baseUriOms)
	                .header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	                .header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
	                .get("inventory?sku=SKUGH13&locationId=FT1");

	    varPendingStockAfterOrderIdReturn = responseOrderFlowNegativeInventoryDetailsAfterOrderIdReturn.jsonPath().getLong("payload.packTypePendingStock.PCS");
	    varTotalDemandAfterOrderIdReturn = responseOrderFlowNegativeInventoryDetailsAfterOrderIdReturn.jsonPath().getLong("payload.packTypeInflight.PCS");
	    varStockAfterOrderIdReturn = responseOrderFlowNegativeInventoryDetailsAfterOrderIdReturn.jsonPath().getLong("payload.packTypeStock.PCS");
	    varIntransientStockAfterOrderIdReturn = responseOrderFlowNegativeInventoryDetailsAfterOrderIdReturn.jsonPath().getLong("payload.packTypeTransient.PCS");
	    varAvailableStockAfterOrderIdReturn = responseOrderFlowNegativeInventoryDetailsAfterOrderIdReturn.jsonPath().getLong("payload.packTypeAvailable.PCS");
	    varAvailableQuantityAfterOrderIdReturn = responseOrderFlowNegativeInventoryDetailsAfterOrderIdReturn.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
	    varUsedQuantityAfterOrderIdReturn = responseOrderFlowNegativeInventoryDetailsAfterOrderIdReturn.jsonPath().getLong("payload.batchDetailsList[0].usedQty");

	    return responseOrderFlowNegativeInventoryDetailsAfterOrderIdReturn;
	}
	
	
	
	public static Response methodOrderFlowNegativeActionCompleteQCReturn() {
	    Response responseOrderFlowNegativeActionCompleteQCReturn = given()
	    			.baseUri(AllCommonVariables.baseUriOms)
	            	.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            .when()
	            	.get("qualityCheck/"+varOrderIdReturn);
	    return responseOrderFlowNegativeActionCompleteQCReturn;
	}
	
	
	
	public static Response methodOrderFlowNegativeInventoryDetailsActionCompleteQCReturn() {
	    Response responseOrderFlowNegativeInventoryDetailsAfterActionCompleteQCReturn =
	            given()
	                .baseUri(AllCommonVariables.baseUriOms)
	                .header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	                .header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
	                .get("inventory?sku=SKUGH13&locationId=FT1");

	    varPendingStockAfterActionCompleteQCReturn = responseOrderFlowNegativeInventoryDetailsAfterActionCompleteQCReturn.jsonPath().getLong("payload.packTypePendingStock.PCS");
	    varTotalDemandAfterActionCompleteQCReturn = responseOrderFlowNegativeInventoryDetailsAfterActionCompleteQCReturn.jsonPath().getLong("payload.packTypeInflight.PCS");
	    varStockAfterActionCompleteQCReturn = responseOrderFlowNegativeInventoryDetailsAfterActionCompleteQCReturn.jsonPath().getLong("payload.packTypeStock.PCS");
	    varIntransientStockAfterActionCompleteQCReturn = responseOrderFlowNegativeInventoryDetailsAfterActionCompleteQCReturn.jsonPath().getLong("payload.packTypeTransient.PCS");
	    varAvailableStockAfterActionCompleteQCReturn = responseOrderFlowNegativeInventoryDetailsAfterActionCompleteQCReturn.jsonPath().getLong("payload.packTypeAvailable.PCS");
	    varAvailableQuantityAfterActionCompleteQCReturn = responseOrderFlowNegativeInventoryDetailsAfterActionCompleteQCReturn.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
	    varUsedQuantityAfterActionCompleteQCReturn = responseOrderFlowNegativeInventoryDetailsAfterActionCompleteQCReturn.jsonPath().getLong("payload.batchDetailsList[0].usedQty");

	    return responseOrderFlowNegativeInventoryDetailsAfterActionCompleteQCReturn;
	}
	
	
	
	public static Response methodOrderFlowNegativeAcceptItemQCReturn() {
		String varSku = "SKUGH13";
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
	    Response responseOrderFlowNegativeAccept1CompleteQC =
	    		given()
	    			.baseUri(AllCommonVariables.baseUriOms)
	            	.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            	.body(rTPAcceptItemQC)
	            .when()
	            	.patch("qualityCheck/"+varOrderIdReturn);
	    return responseOrderFlowNegativeAccept1CompleteQC;
	}
	
	
	
	public static Response methodOrderFlowNegativeInventoryDetailsAcceptItemQCReturn() {
		Response responseOrderFlowNegativeInventoryDetailsAfterAcceptItemQCReturn =
				given()
					.baseUri(AllCommonVariables.baseUriOms)
            		.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
		            .get("inventory?sku=SKUGH13&locationId=FT1");
		
		varPendingStockAfterAcceptItemQCReturn = responseOrderFlowNegativeInventoryDetailsAfterAcceptItemQCReturn.jsonPath().getLong("payload.packTypePendingStock.PCS");
		varTotalDemandAfterAcceptItemQCReturn = responseOrderFlowNegativeInventoryDetailsAfterAcceptItemQCReturn.jsonPath().getLong("payload.packTypeInflight.PCS");
		varStockAfterAcceptItemQCReturn=responseOrderFlowNegativeInventoryDetailsAfterAcceptItemQCReturn.jsonPath().getLong("payload.packTypeStock.PCS");
		varIntransientStockAfterAcceptItemQCReturn=responseOrderFlowNegativeInventoryDetailsAfterAcceptItemQCReturn.jsonPath().getLong("payload.packTypeTransient.PCS");
		varAvailableStockAfterAcceptItemQCReturn=responseOrderFlowNegativeInventoryDetailsAfterAcceptItemQCReturn.jsonPath().getLong("payload.packTypeAvailable.PCS");
		varAvailableQuantityAfterAcceptItemQCReturn=responseOrderFlowNegativeInventoryDetailsAfterAcceptItemQCReturn.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
		varUsedQuantityAfterAcceptItemQCReturn=responseOrderFlowNegativeInventoryDetailsAfterAcceptItemQCReturn.jsonPath().getLong("payload.batchDetailsList[0].usedQty");
		return responseOrderFlowNegativeInventoryDetailsAfterAcceptItemQCReturn;
	}

	
	
	public static Response methodOrderFlowNegativeCompleteQCReturn() {
		Response responseOrderFlowNegativeCompleteQCReturn =
	    		given()
	    			.baseUri(AllCommonVariables.baseUriOms)
	            	.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
	            	.patch("qualityCheck/"+varOrderIdReturn+"/qcCompleted");
	    return responseOrderFlowNegativeCompleteQCReturn;
	}

	
	
	public static Response methodOrderFlowNegativeInventoryDetailsCompleteQCReturn() {
	    Response responseOrderFlowNegativeInventoryDetailsAfterCompleteQCReturn =
	            given()
	                .baseUri(AllCommonVariables.baseUriOms)
	                .header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	                .header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
	                .get("inventory?sku=SKUGH13&locationId=FT1");

	    varPendingStockAfterCompleteQCReturn = responseOrderFlowNegativeInventoryDetailsAfterCompleteQCReturn.jsonPath().getLong("payload.packTypePendingStock.PCS");
	    varTotalDemandAfterCompleteQCReturn = responseOrderFlowNegativeInventoryDetailsAfterCompleteQCReturn.jsonPath().getLong("payload.packTypeInflight.PCS");
	    varStockAfterCompleteQCReturn = responseOrderFlowNegativeInventoryDetailsAfterCompleteQCReturn.jsonPath().getLong("payload.packTypeStock.PCS");
	    varIntransientStockAfterCompleteQCReturn = responseOrderFlowNegativeInventoryDetailsAfterCompleteQCReturn.jsonPath().getLong("payload.packTypeTransient.PCS");
	    varAvailableStockAfterCompleteQCReturn = responseOrderFlowNegativeInventoryDetailsAfterCompleteQCReturn.jsonPath().getLong("payload.packTypeAvailable.PCS");
	    varAvailableQuantityAfterCompleteQCReturn = responseOrderFlowNegativeInventoryDetailsAfterCompleteQCReturn.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
	    varUsedQuantityAfterCompleteQCReturn = responseOrderFlowNegativeInventoryDetailsAfterCompleteQCReturn.jsonPath().getLong("payload.batchDetailsList[0].usedQty");

	    return responseOrderFlowNegativeInventoryDetailsAfterCompleteQCReturn;
	}

	
	
	public static Response methodOrderFlowNegativeInventorySettlementReturn() {
		Response responseOrderFlowNegativeInventorySettlementReturn =
	    		given()
	    			.baseUri(AllCommonVariables.baseUriOms)
	            	.header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	            	.header("Content-Type",  AllCommonVariables.varContentTypeHeader)
	            .when()
	            	.patch("qualityCheck/"+varOrderIdReturn+"/inventorySettlement");
	    return responseOrderFlowNegativeInventorySettlementReturn;
	}
	
	
	
	public static Response methodOrderFlowNegativeInventoryDetailsInventorySettlementReturn() {
	    Response responseOrderFlowNegativeInventoryDetailsAfterInventorySettlementReturn =
	            given()
	                .baseUri(AllCommonVariables.baseUriOms)
	                .header("Authorization", VarBearerTokenGenerate.varBearerTokenValue)
	                .header("Content-Type", AllCommonVariables.varContentTypeHeader)
	            .when()
	                .get("inventory?sku=SKUGH13&locationId=FT1");

	    varPendingStockAfterInventorySettlementReturn = responseOrderFlowNegativeInventoryDetailsAfterInventorySettlementReturn.jsonPath().getLong("payload.packTypePendingStock.PCS");
	    varTotalDemandAfterInventorySettlementReturn = responseOrderFlowNegativeInventoryDetailsAfterInventorySettlementReturn.jsonPath().getLong("payload.packTypeInflight.PCS");
	    varStockAfterInventorySettlementReturn = responseOrderFlowNegativeInventoryDetailsAfterInventorySettlementReturn.jsonPath().getLong("payload.packTypeStock.PCS");
	    varIntransientStockAfterInventorySettlementReturn = responseOrderFlowNegativeInventoryDetailsAfterInventorySettlementReturn.jsonPath().getLong("payload.packTypeTransient.PCS");
	    varAvailableStockAfterInventorySettlementReturn = responseOrderFlowNegativeInventoryDetailsAfterInventorySettlementReturn.jsonPath().getLong("payload.packTypeAvailable.PCS");
	    varAvailableQuantityAfterInventorySettlementReturn = responseOrderFlowNegativeInventoryDetailsAfterInventorySettlementReturn.jsonPath().getLong("payload.batchDetailsList[0].availableQuantity");
	    varUsedQuantityAfterInventorySettlementReturn = responseOrderFlowNegativeInventoryDetailsAfterInventorySettlementReturn.jsonPath().getLong("payload.batchDetailsList[0].usedQty");

	    return responseOrderFlowNegativeInventoryDetailsAfterInventorySettlementReturn;
	}
	
}
