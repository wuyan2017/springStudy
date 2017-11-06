package com.person;

import java.util.Map;

public class Person3 {
    private String name;
    private int age;
    private Map<Integer,Car> map;
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

    public Map<Integer, Car> getMap() {
        return map;
    }

    public void setMap(Map<Integer, Car> map) {
        this.map = map;
    }
    @Override
    public String toString() {
        return "Person3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", map=" + map +
                '}';
    }
}
