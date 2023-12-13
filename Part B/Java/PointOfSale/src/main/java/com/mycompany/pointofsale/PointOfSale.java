package com.mycompany.pointofsale;

/**
 * @author Noel Cosgrave
 */
public class PointOfSale {
    
    Sale sale;
    static ProductCatalogue productCatalogue;

    public PointOfSale() {
        productCatalogue = new ProductCatalogue();
    }

    public void StartSale() {
        sale = new Sale();
    }
    
    public int BuyItem(int UPC, int quantity) {
        
        if (sale != null) { 
            ProductSpecification productSpecification = productCatalogue.productSpecification(UPC);
            if (productSpecification != null) {
                sale.addItem(new SaleLineItem(productSpecification,quantity));
                return UPC;
            } else {
                return -1;
            }
        } else {
            return -2;
        }
    }
    
    public void EndSale() {
        sale = null;
    }
}
