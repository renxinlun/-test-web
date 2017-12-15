package com.renxinlun.service;

import org.springframework.stereotype.Component;

/**
 * 开发人:renxinlun
 * <p>
 * 功能描述:
 * <p>
 * 创建日期:16/10/5.
 */

@Component
public class Person {

    private String name;
    private String address;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
