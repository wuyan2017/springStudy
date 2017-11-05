package com.boss;

public class Office {
    public String no;
    public String getNo() {
        return no;
    }
    public void setNo(String no) {
        this.no = no;
    }
    @Override
    public String toString() {
        return "Office{" +
                "no='" + no + '\'' +
                '}';
    }
}
