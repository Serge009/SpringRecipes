package com.apress.springrecipes.calculator;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by Matrix on 21.10.2014.
 */
@Aspect
public class CalculatorPointcuts {
    @Pointcut("execution(* *.*(..)) && target(target) && args(a,b)")
    public void parameterPointcut(Object target, double a, double b) {}

    @Pointcut("within(ArithmeticCalculator+)")
    public void arithmeticOperation() {    }

    @Pointcut("within(UnitCalculator+)")
    public void unitOperation() {    }

    @Pointcut("arithmeticOperation() || unitOperation()")
    public void loggingOperation() {    }
}
