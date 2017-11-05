package com.person;

public class Person {
    private String name;
    private int age;
    private Car car;
    public com.person.Car getCar() {
        return car;
    }

    public void setCar(com.person.Car car) {
        this.car = car;
    }
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }
}
