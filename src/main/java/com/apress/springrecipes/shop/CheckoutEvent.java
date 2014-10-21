package com.apress.springrecipes.shop;

import org.springframework.context.ApplicationEvent;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by Matrix on 20.10.2014.
 */
public class CheckoutEvent extends ApplicationEvent {

    private double amount;
    private Date time;

    public CheckoutEvent(Object source, double amount, Date time) {
        super(source);
        this.amount = amount;
        this.time = time;
    }

    public double getAmount() {
        return amount;
    }

    public Date getTime() {
        return time;
    }
}
