package com.apress.springrecipes.javaconfig;

/**
 * Created by Matrix on 10.10.2014.
 */
public class Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void startLife(){
        System.out.println(name + " was born)))");
    }

    public void die(){
        System.out.println(name + " died(");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
