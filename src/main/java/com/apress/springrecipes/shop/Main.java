package com.apress.springrecipes.shop;

import com.apress.springrecipes.javaconfig.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by SERGE on 02.10.2014.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("2/beans-2.12.xml");
        Cashier cashier = context.getBean("cashier1", Cashier.class);

        System.out.println(cashier);

    }
}
