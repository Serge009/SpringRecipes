package com.apress.springrecipes.calculator;

import java.lang.annotation.*;

/**
 * Created by Matrix on 21.10.2014.
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LoggingRequired {
}
