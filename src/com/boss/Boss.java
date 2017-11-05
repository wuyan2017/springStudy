package com.boss;
import org.springframework.beans.factory.annotation.*;
public class Boss {
    @Autowired
    private Car car;
    @Autowired
    private Office office;
    @Override
    public String toString() {
        return "Boss{" +
                "car=" + car +
                ", office=" + office +
                '}';
    }
}
