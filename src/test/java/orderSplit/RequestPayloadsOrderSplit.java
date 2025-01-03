package orderSplit;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

public class RequestPayloadsOrderSplit {

// Payload Create Order
    public static String varFromLocationId = "FT1"; 
    public static String varToLocationId = "HB2"; 
    public static String varItemSku = "SKUGH14"; 
    public static int varItemQuantity = 5; 
    public static double varItemDistributorPrice = 4.0; 
    public static double varItemSsPrice = 2.0; 
    public static String varItemPackType = "PCS"; 
    public static int varItemPackOf = 2; 
    public static double varItemMrp = 16.0; 
    public static int varItemDiscount = 6; 
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
    
    
    
// Payload Split Order
    public static String varItemSku1 = "SKUGH14"; 
    public static int varItemQuantity1 = 3; 
    public static String varItemPackType1 = "PCS"; 
    public static int varItemPackOf1 = 1; 
    public static String varOrderSource1 = "SUPER_ADMIN"; 

    public static String varOrderSlotStart1;
    public static String varOrderSlotEnd1 = null;

    static {
        ZonedDateTime now = ZonedDateTime.now(TimeZone.getTimeZone("UTC").toZoneId());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        varOrderSlotStart1 = now.format(formatter);
    }

    public static final String rTPSplitOrder = "{\"items\": [{" +
            "\"sku\": \"" + varItemSku1 + "\", " +
            "\"quantity\": " + varItemQuantity1 + ", " +
            "\"packType\": \"" + varItemPackType1 + "\", " +
            "\"packOf\": " + varItemPackOf1 + 
        "}], " +
        "\"orderSource\": \"" + varOrderSource1 + "\", " +
        "\"orderSlot\": {" +
            "\"start\": \"" + varOrderSlotStart1 + "\", " +
            "\"end\": " + varOrderSlotEnd1 + 
        "}}";
    
    
    
 // Payload Split Order Again
    public static String varItemSku2 = "SKUGH14"; 
    public static int varItemQuantity2 = 1; 
    public static String varItemPackType2 = "PCS"; 
    public static int varItemPackOf2 = 1; 
    public static String varOrderSource2 = "SUPER_ADMIN"; 

    public static String varOrderSlotStart2;
    public static String varOrderSlotEnd2 = null;

    static {
        ZonedDateTime now = ZonedDateTime.now(TimeZone.getTimeZone("UTC").toZoneId());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        varOrderSlotStart2 = now.format(formatter);
    }

    public static final String rTPSplitOrderAgain = "{\"items\": [{" +
            "\"sku\": \"" + varItemSku2 + "\", " +
            "\"quantity\": " + varItemQuantity2 + ", " +
            "\"packType\": \"" + varItemPackType2 + "\", " +
            "\"packOf\": " + varItemPackOf2 + 
        "}], " +
        "\"orderSource\": \"" + varOrderSource2 + "\", " +
        "\"orderSlot\": {" +
            "\"start\": \"" + varOrderSlotStart2 + "\", " +
            "\"end\": " + varOrderSlotEnd2 + 
        "}}";
    
    
    
    
 // Payload Split New Order
    public static String varItemSku3 = "SKUGH14"; 
    public static int varItemQuantity3 = 1; 
    public static String varItemPackType3 = "PCS"; 
    public static int varItemPackOf3 = 1; 
    public static String varOrderSource3 = "SUPER_ADMIN"; 

    public static String varOrderSlotStart3;
    public static String varOrderSlotEnd3 = null;

    static {
        ZonedDateTime now = ZonedDateTime.now(TimeZone.getTimeZone("UTC").toZoneId());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        varOrderSlotStart3 = now.format(formatter);
    }

    public static final String rTPSplitNewOrder = "{\"items\": [{" +
            "\"sku\": \"" + varItemSku3 + "\", " +
            "\"quantity\": " + varItemQuantity3 + ", " +
            "\"packType\": \"" + varItemPackType3 + "\", " +
            "\"packOf\": " + varItemPackOf3 + 
        "}], " +
        "\"orderSource\": \"" + varOrderSource3 + "\", " +
        "\"orderSlot\": {" +
            "\"start\": \"" + varOrderSlotStart3 + "\", " +
            "\"end\": " + varOrderSlotEnd3 + 
        "}}";
}
