package com.apress.springrecipes.shop;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

import java.util.Date;

/**
 * Created by Matrix on 21.10.2014.
 */
public class CheckoutListener implements ApplicationListener<CheckoutEvent> {
    @Override
    public void onApplicationEvent(CheckoutEvent event) {
        double amount = event.getAmount();
        Date time = event.getTime();
        // Do anything you like with the checkout amount and time
        System.out.println("Checkout event [" + amount + ", " + time + "]");
    }
}
