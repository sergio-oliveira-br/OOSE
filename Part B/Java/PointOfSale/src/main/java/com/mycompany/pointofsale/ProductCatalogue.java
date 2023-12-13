package com.mycompany.pointofsale;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Noel Cosgrave
 */
public class ProductCatalogue {

    private List<ProductSpecification> items = new ArrayList<>();
    
    public ProductCatalogue() {
        // mimic loading items from the product catalogue database
        items.add(new ProductSpecification(1,"Bread",169));
        items.add(new ProductSpecification(2,"Milk",120));
        items.add(new ProductSpecification(3,"Butter",180));
        items.add(new ProductSpecification(4,"Biscuits",225));
        items.add(new ProductSpecification(5,"Cola",150)); 
    }
    
    public ProductSpecification productSpecification(int UPC) {
             
        for (ProductSpecification i : items) {
            if (i.getUPC() == UPC) {
                return i;
            }
        } 
        return null; 
    }
    
}
