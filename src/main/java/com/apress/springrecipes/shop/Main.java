package com.apress.springrecipes.shop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by SERGE on 02.10.2014.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-1.3.xml");
        Battery aaa = context.getBean("aaa", Battery.class);
        Disk cdrw = context.getBean("cdrw", Disk.class);

        System.out.println(aaa);
        System.out.println(cdrw);
    }
}
