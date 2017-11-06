package com.person;

public class Person4 {
    private String name;
    private int age;
    private Car2 car2;
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

    public Car2 getCar2() {
        return car2;
    }

    public void setCar2(Car2 car2) {
        this.car2 = car2;
    }
    @Override
    public String toString() {
        return "Person4{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car2=" + car2 +
                '}';
    }
}
