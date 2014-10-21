package com.apress.springrecipes.calculator;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * Created by Matrix on 21.10.2014.
 */
@Aspect
public class CalculatorIntroduction {
    @DeclareParents(
            value = "com.apress.springrecipes.calculator.*CalculatorImpl",
            defaultImpl = CounterImpl.class)
    public Counter counter;

    @DeclareParents(
            value = "com.apress.springrecipes.calculator.ArithmeticCalculatorImpl",
            defaultImpl = MaxCalculatorImpl.class)
    public MaxCalculator maxCalculator;

    @DeclareParents(
            value = "com.apress.springrecipes.calculator.ArithmeticCalculatorImpl",
            defaultImpl = MinCalculatorImpl.class)
    public MinCalculator minCalculator;

    @After("execution(* com.apress.springrecipes.calculator.*Calculator.*(..))"
            + " && this(counter)")
    public void increaseCount(Counter counter) {
        counter.increase();
    }
}
