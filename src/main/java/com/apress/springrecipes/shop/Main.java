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
        ApplicationContext context = new ClassPathXmlApplicationContext("2/beans-2.8.xml");
        Person person = context.getBean("theArtistFormerlyKnownAsJosh", Person.class);
        System.out.println(person);
    }
}
