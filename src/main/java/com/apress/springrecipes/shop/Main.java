package com.apress.springrecipes.shop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by SERGE on 02.10.2014.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("2/beans-2.7.xml");
        Product aaa = (Product) context.getBean("aaa");
        Product cdrw = (Product) context.getBean("cdrw");
        Product dvdrw = (Product) context.getBean("dvdrw");
        ShoppingCart cart1 = new ShoppingCart();
        cart1.addItem(aaa);
        cart1.addItem(cdrw);
        cart1.addItem(dvdrw);
        System.out.println("Shopping cart 1 contains " + cart1.getItems());

        Cashier cashier1 = (Cashier) context.getBean("cashier1");
        cashier1.checkout(cart1);
    }
}
