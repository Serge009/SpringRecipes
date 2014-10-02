package com.apress.springrecipes.shop;

/**
 * Created by SERGE on 02.10.2014.
 */
public class Disk extends Product {

    private int capacity;

    public Disk() {
        super();
    }

    public Disk(String name, double price) {
        super(name, price);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
