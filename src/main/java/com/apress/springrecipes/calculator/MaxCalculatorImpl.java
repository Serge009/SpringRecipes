package com.apress.springrecipes.calculator;

/**
 * Created by Matrix on 21.10.2014.
 */
public class MaxCalculatorImpl implements MaxCalculator {
    @Override
    public double max(double a, double b) {
        double result = (a >= b) ? a : b;
        System.out.println("max(" + a + ", " + b + ") = " + result);
        return result;
    }
}
