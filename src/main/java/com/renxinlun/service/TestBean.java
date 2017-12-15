package com.renxinlun.service;

import org.springframework.stereotype.Component;


import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * 开发人:renxinlun
 * <p>
 * 功能描述:
 * <p>
 * 创建日期:16/9/21.
 */
@Component
public class TestBean {
    private String name;
    private int age;

    private List<Object> integerList;

    private Set<Object> sets;
    private Map<Object, Object> maps;
    private Properties pros;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Object> getIntegerList() {
        return integerList;
    }

    public void setIntegerList(List<Object> integerList) {
        this.integerList = integerList;
    }

    public Set<Object> getSets() {
        return sets;
    }

    public void setSets(Set<Object> sets) {
        this.sets = sets;
    }

    public Map<Object, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<Object, Object> maps) {
        this.maps = maps;
    }

    public Properties getPros() {
        return pros;
    }

    public void setPros(Properties pros) {
        this.pros = pros;
    }

    @Override
    public String toString() {
        return "TestBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", integerList=" + integerList +
                ", sets=" + sets +
                ", maps=" + maps +
                ", pros=" + pros +
                '}';
    }
}
