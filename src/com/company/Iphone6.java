package com.company;

public class Iphone6 extends Phone {
    private int number;
    private String quality;


    public Iphone6(int age, String name,int number, String quality) {
        super(age, name);
        this.number=number;
        this.quality=quality;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("iphone-->parametry");
    }
}
