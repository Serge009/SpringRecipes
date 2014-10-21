package com.apress.springrecipes.calculator;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;

/**
 * Created by Matrix on 21.10.2014.
 */
@Aspect
@Order(0)
public class CalculatorValidationAspect {

    private static final Logger log = LoggerFactory.getLogger(CalculatorValidationAspect.class);

    @Before("execution(* *.*(double, double))")
    public void validateBefore(JoinPoint joinPoint){
        log.info("{}", "Validation!");
        for (Object arg : joinPoint.getArgs()) {
            validate((Double) arg);
        }
    }

    private void validate(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("Positive numbers only");
        }
    }
}
