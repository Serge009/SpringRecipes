package com.apress.springrecipes.shop;

import com.apress.springrecipes.javaconfig.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.Date;
import java.util.Locale;

/**
 * Created by SERGE on 02.10.2014.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("2/beans-2.15.xml");

        ProductRanking productRanking =
                (ProductRanking) context.getBean("productRanking");
        System.out.println(
                "Product ranking from " + productRanking.getFromDate() +
                        " to " + productRanking.getToDate());

    }
}
