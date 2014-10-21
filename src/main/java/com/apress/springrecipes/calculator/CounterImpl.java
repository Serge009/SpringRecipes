package com.apress.springrecipes.calculator;

/**
 * Created by Matrix on 21.10.2014.
 */
public class CounterImpl implements Counter {
    private int count;

    @Override
    public void increase() {
        this.count++;
    }

    @Override
    public int getCount() {
        return this.count;
    }
}
