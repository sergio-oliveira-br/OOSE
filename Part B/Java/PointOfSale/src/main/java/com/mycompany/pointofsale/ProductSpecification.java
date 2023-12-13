package com.mycompany.pointofsale;

/**
 * @author Noel Cosgrave
 */
public class ProductSpecification {
    
    private int UPC;
    private String Description;
    private int Price;

    
    ProductSpecification(int UPC, String Description, int Price) {
        this.UPC = UPC;
        this.Description = Description;
        this.Price = Price;
    }
    
    public int getUPC() {
        return UPC;
    }

    public void setUPC(int UPC) {
        this.UPC = UPC;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }
    
}
