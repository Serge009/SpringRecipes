package com.apress.springrecipes.calculator;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by Matrix on 21.10.2014.
 */
@Aspect
public class CalculatorPointcuts {
    @Pointcut("execution(* *.*(..))")
    public void loggingOperation() {}
}
