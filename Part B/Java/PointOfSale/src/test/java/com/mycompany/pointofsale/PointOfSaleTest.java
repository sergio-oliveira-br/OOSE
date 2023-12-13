package com.mycompany.pointofsale;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Noel Cosgrave
 */
public class PointOfSaleTest {
    
    PointOfSale pointOfSale;
    
    public PointOfSaleTest() {
        pointOfSale = new PointOfSale();
        pointOfSale.StartSale();
    }
    

    /**
     * Test of BuyItem method of class PointOfSale with valid item
     */
    @Test
    public void testBuyItemWithValidItem1() {
        int expectedValue = 1;
        int result = pointOfSale.BuyItem(1,2);
        assertEquals(expectedValue,result);  
    }
    
    @Test
    public void testBuyItemWithValidItem2() {
        int expectedValue = 2;
        int result = pointOfSale.BuyItem(2,3);
        assertEquals(expectedValue,result);  
    }
    
    @Test
    public void testBuyItemWithInvalidItem() {
        int expectedValue = -1;
        int result = pointOfSale.BuyItem(7,2);
        assertEquals(expectedValue,result);  
    }

}
