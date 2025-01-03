package orderUpdateDispatch;

import java.time.LocalDate;

public class RequestPayloadsOrderUpdateDispatch {
	// Payload Create Order
		public static String varFromLocationId = "FT1"; 
		public static String varToLocationId = "HB2"; 
		public static String varItemSku = "SKUGH16"; 
		public static int varItemQuantity = 2; 
		public static double varItemDistributorPrice = 4.0; 
		public static double varItemSsPrice = 2.0; 
		public static String varItemPackType = "PCS"; 
		public static int varItemPackOf = 1; 
		public static double varItemMrp = 16.0; 
		public static int varItemDiscount = 12; 
		public static String varOrderSource = "SUPER_ADMIN"; 
		public static String varOrderSlotStart = LocalDate.now().toString(); 
		public static String varOrderSlotEnd = null;
		public static String varPoNumber = "123456789"; 
		public static String varCouponId = null; 

		
		public static final String rTPCreateOrder = "{\"fromLocationId\": \"" + varFromLocationId + "\", " +
			    "\"toLocationId\": \"" + varToLocationId + "\", " +
			    "\"items\": [{" +
			        "\"sku\": \"" + varItemSku + "\", " +
			        "\"quantity\": " + varItemQuantity + ", " +
			        "\"distributorPrice\": " + varItemDistributorPrice + ", " +
			        "\"ssPrice\": " + varItemSsPrice + ", " +
			        "\"packType\": \"" + varItemPackType + "\", " +
			        "\"packOf\": " + varItemPackOf + ", " +
			        "\"mrp\": " + varItemMrp + ", " +
			        "\"discount\": " + varItemDiscount +
			    "}], " +
			    "\"orderSource\": \"" + varOrderSource + "\", " +
			    "\"orderSlot\": {" +
			        "\"start\": \"" + varOrderSlotStart + "\", " +
			        "\"end\": " + varOrderSlotEnd + 
			    "}, " +
			    "\"poNumber\": \"" + varPoNumber + "\", " +
			    "\"couponId\": null, " + 
			    "\"freeItems\": null" + 
			"}";
		
		
// Payload Update Order
		
		public static String varFromLocationId1 = "FT1"; 
		public static String varToLocationId1 = "HB2"; 
		public static String varItemSku1 = "SKUGH16"; 
		public static int varItemQuantity1 = 7; 
		public static double varItemDistributorPrice1 = 5.0; 
		public static double varItemSsPrice1 = 4.0; 
		public static String varItemPackType1 = "PCS"; 
		public static int varItemPackOf1 = 1; 
		public static double varItemMrp1 = 16.0; 
		public static int varItemDiscount1 = 8; 
		public static String varOrderSource1 = "SUPER_ADMIN"; 
		public static String varOrderSlotStart1 = LocalDate.now().toString(); 
		public static String varOrderSlotEnd1 = null;
		public static String varPoNumber1 = "123456789"; 
		public static String varCouponId1 = null;

		// Batch Details
		public static String varBatchId1 = "OUDTestProduct"; 
		public static int varIbId1 = 249; 
		public static String varBatchCreationDate1 = "2025-01-02T09:28:57.805+0000"; 
		public static String varBatchExpiryDate1 = "2028-01-02"; 
		public static String varManufacturingDate1 = "2025-01-02"; 
		public static double varBatchMrp1 = 16.0; 
		public static double varBatchSsPrice1 = 2.0; 
		public static int varBatchSsDiscount1 = 14; 
		public static double varBatchDistPrice1 = 4.0; 
		public static int varBatchDistDiscount1 = 12; 
		public static double varBatchRetailerPrice1 = 8.0; 
		public static int varBatchRetailerDiscount1 = 8; 
		public static int varBatchPriority1 = 2147483647; 
		public static int varBatchQcPassQty1 = 0; 
		public static int varBatchQcFailQty1 = 0;

		// Thumbnail Details
		public static String varThumbnailId1 = "67765be590fc8d000916bf29";
		public static String varThumbnailCreatedBy1 = "USR-00";
		public static String varThumbnailUrl1 = "https://storage.googleapis.com/paras-prod/USR-00/vnJNo5-test1.jpg";
		public static String varThumbnailName1 = "test1.jpg";
		public static String varThumbnailRelativeUrl1 = "USR-00/vnJNo5-test1.jpg";

		// Tax and Price Details
		public static String varHsnNumber1 = "12345"; 
		public static double varTotalTaxAmount1 = 0.0; 
		public static int varCess1 = 18; 
		public static double varCessAmt1 = 0.0; 
		public static int varGst1 = 12; 
		public static double varGstAmt1 = 0.0; 
		public static boolean varIsNonDiscountable1 = false; 
		public static String varItemType1 = "FOOD"; 
		public static double varBasicAmount1 = 0.0; 
		public static double varTaxableAmount1 = 0.0; 
		public static double varRateAmount1 = 0.0; 
		public static int varOriginalQuantity1 = 2; 
		public static int varSno1 = 0; 
		public static boolean varFree1 = false; 
		public static int varDeliveredQuantity1 = 2; 
		public static double varIgstAmt1 = 0.0; 
		public static double varSgstAmt1 = 0.0; 
		public static double varCgstAmt1 = 0.0; 
		public static double varSgst1 = 0.0; 
		public static double varCgst1 = 0.0; 
		public static double varIgst1 = 0.0;

		// Final JSON Payload
		public static final String rTPUpdateOrder = "{\"fromLocationId\": \"" + varFromLocationId1 + "\", " +
		        "\"toLocationId\": \"" + varToLocationId1 + "\", " +
		        "\"items\": [{" +
		            "\"sku\": \"" + varItemSku1 + "\", " +
		            "\"quantity\": " + varItemQuantity1 + ", " +
		            "\"distributorPrice\": " + varItemDistributorPrice1 + ", " +
		            "\"ssPrice\": " + varItemSsPrice1 + ", " +
		            "\"packType\": \"" + varItemPackType1 + "\", " +
		            "\"packOf\": " + varItemPackOf1 + ", " +
		            "\"mrp\": " + varItemMrp1 + ", " +
		            "\"discount\": " + varItemDiscount1 + ", " +
		            "\"itemBatchDetails\": [{" +
		                "\"batchId\": \"" + varBatchId1 + "\", " +
		                "\"ibId\": " + varIbId1 + ", " +
		                "\"sku\": \"" + varItemSku1 + "\", " +
		                "\"quantity\": 2, " +
		                "\"batchCreationDate\": \"" + varBatchCreationDate1 + "\", " +
		                "\"expiryDate\": \"" + varBatchExpiryDate1 + "\", " +
		                "\"manufacturingDate\": \"" + varManufacturingDate1 + "\", " +
		                "\"mrp\": " + varBatchMrp1 + ", " +
		                "\"ssPrice\": " + varBatchSsPrice1 + ", " +
		                "\"ssDiscount\": " + varBatchSsDiscount1 + ", " +
		                "\"distPrice\": " + varBatchDistPrice1 + ", " +
		                "\"distDiscount\": " + varBatchDistDiscount1 + ", " +
		                "\"retailerPrice\": " + varBatchRetailerPrice1 + ", " +
		                "\"retailerDiscount\": " + varBatchRetailerDiscount1 + ", " +
		                "\"priority\": " + varBatchPriority1 + ", " +
		                "\"qcPassQty\": " + varBatchQcPassQty1 + ", " +
		                "\"qcFailQty\": " + varBatchQcFailQty1 + 
		            "}], " +
		            "\"retailerDiscount\": 0, " +
		            "\"thumbnail\": {" +
		                "\"id\": \"" + varThumbnailId1 + "\", " +
		                "\"createdBy\": \"" + varThumbnailCreatedBy1 + "\", " +
		                "\"url\": \"" + varThumbnailUrl1 + "\", " +
		                "\"name\": \"" + varThumbnailName1 + "\", " +
		                "\"relativeUrl\": \"" + varThumbnailRelativeUrl1 + "\"" +
		            "}, " +
		            "\"hsnNumber\": \"" + varHsnNumber1 + "\", " +
		            "\"totalTaxAmount\": " + varTotalTaxAmount1 + ", " +
		            "\"cess\": " + varCess1 + ", " +
		            "\"cessAmt\": " + varCessAmt1 + ", " +
		            "\"gst\": " + varGst1 + ", " +
		            "\"gstAmt\": " + varGstAmt1 + ", " +
		            "\"isNonDiscountable\": " + varIsNonDiscountable1 + ", " +
		            "\"itemType\": \"" + varItemType1 + "\", " +
		            "\"basicAmount\": " + varBasicAmount1 + ", " +
		            "\"taxableAmount\": " + varTaxableAmount1 + ", " +
		            "\"rateAmount\": " + varRateAmount1 + ", " +
		            "\"originalQuantity\": " + varOriginalQuantity1 + ", " +
		            "\"sno\": " + varSno1 + ", " +
		            "\"free\": " + varFree1 + ", " +
		            "\"deliveredQuantity\": " + varDeliveredQuantity1 + ", " +
		            "\"igstAmt\": " + varIgstAmt1 + ", " +
		            "\"sgstAmt\": " + varSgstAmt1 + ", " +
		            "\"cgstAmt\": " + varCgstAmt1 + ", " +
		            "\"sgst\": " + varSgst1 + ", " +
		            "\"cgst\": " + varCgst1 + ", " +
		            "\"igst\": " + varIgst1 + ", " +
		            "\"ssPrice\": " + varItemSsPrice1 + ", " +
		            "\"poNumber\": \"" + varPoNumber1 + "\"" +
		        "}], " +
		        "\"poNumber\": \"" + varPoNumber1 + "\", " +
		        "\"couponId\": null, " + 
		        "\"freeItems\": null" + 
		"}";

				
}
