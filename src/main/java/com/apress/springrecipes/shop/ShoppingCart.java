package com.apress.springrecipes.shop;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Matrix on 09.10.2014.
 */
public class ShoppingCart {
    private List<Product> items = new ArrayList<Product>();

    public void addItem(Product item){
        items.add(item);
    }

    public List<Product> getItems() {
        return items;
    }
}
