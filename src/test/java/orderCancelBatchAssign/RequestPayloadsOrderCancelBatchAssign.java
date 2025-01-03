package orderCancelBatchAssign;

import java.time.LocalDate;

public class RequestPayloadsOrderCancelBatchAssign {
	// Payload Create Order
			public static String varFromLocationId = "FT1"; 
			public static String varToLocationId = "HB2"; 
			public static String varItemSku = "SKUGH15"; 
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
}
