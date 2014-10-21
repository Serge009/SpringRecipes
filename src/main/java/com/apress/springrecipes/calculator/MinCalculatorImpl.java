package com.apress.springrecipes.calculator;

/**
 * Created by Matrix on 21.10.2014.
 */
public class MinCalculatorImpl implements MinCalculator {
    @Override
    public double min(double a, double b) {
        double result = (a <= b) ? a : b;
        System.out.println("min(" + a + ", " + b + ") = " + result);
        return result;
    }
}
