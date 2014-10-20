package com.apress.springrecipes.shop;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.*;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Matrix on 09.10.2014.
 */
public class Cashier implements InitializingBean, DisposableBean,
        BeanNameAware, StorageConfig, MessageSourceAware {
    private String name;
    private String path;
    private BufferedWriter writer;
    private MessageSource messageSource;

    public void setName(String name) {
        this.name = name;
    }
    public void setPath(String path) {
        this.path = path;
    }

    @PostConstruct
    public void openFile() throws IOException {
        File logFile = new File(path, name + ".txt");
        writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(logFile, true)));
    }
    public void checkout(ShoppingCart cart) throws IOException {
        double total = 0;
        for (Product product : cart.getItems()) {
            total += product.getPrice();
        }
        writer.write(new Date() + "\t" + total + "\r\n");
        writer.flush();

        String alert = messageSource.getMessage("alert.checkout",
                new Object[] { total, new Date() }, Locale.US);
        System.out.println(alert);
    }

    @PreDestroy
    public void closeFile() throws IOException {
        writer.close();
    }

    @Override
    public void destroy() throws Exception {
        //closeFile();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //openFile();
    }

    @Override
    public void setBeanName(String name) {
        this.name = name;
    }

    @Override
    public String getPath() {
        return path;
    }

    @Override
    public String toString() {
        return "Cashier{" +
                "path='" + path + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
}
