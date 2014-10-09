package com.apress.springrecipes.shop;

/**
 * Created by Matrix on 09.10.2014.
 */
public class ProductCreator {
    public static Product createProduct(String productId){
        if("aaa".equals(productId)) {
            return new Battery("AAA", 2.5);
        } else if ("cdrw".equals(productId)) {
            return new Disc("CD-RW", 1.5);
        }

        throw new IllegalArgumentException("Unknown Product!!!");
    }
}
