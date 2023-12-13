package com.mycompany.pointofsale;

/**
 * @author Noel Cosgrave
 */
public class SaleLineItem {
    
    private int quantity;
    private ProductSpecification productspecification;
    
    public SaleLineItem(ProductSpecification productspecification, int Quantity) {     
        this.productspecification = productspecification;
        this.quantity = Quantity;
    } 
    
    public int subtotal() {
        return quantity * productspecification.getPrice();       
    }
}
