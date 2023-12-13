package com.mycompany.pointofsale;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Noel Cosgrave
 */
public class Sale {
    
    private List<SaleLineItem> items = new ArrayList<>();


    public List<SaleLineItem> getItems() {
        return items;
    }
    
    public void addItem(SaleLineItem item) {
        this.items.add(item);
    }
}
