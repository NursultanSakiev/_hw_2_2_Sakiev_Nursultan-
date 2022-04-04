package com.company;

public class Iphone11 extends Phone {
private   int iphone11number;
private String corpus;

    public Iphone11(int age, String name ,int iphone11number, String corpus ) {
        super(age, name);
        this.corpus=corpus;
        this.iphone11number=iphone11number;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("iphone11 -- parametry-->");
    }
}
