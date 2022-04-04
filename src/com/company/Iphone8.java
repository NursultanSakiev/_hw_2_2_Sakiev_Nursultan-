package com.company;

public class Iphone8 extends Phone {
    private  int iphone8Num;
    private  String color ;

    public Iphone8(int age, String name,int iphone8Num, String color) {
        super(age, name);
        this.iphone8Num=iphone8Num;
        this.color=color;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(" iphone8-->parametry");
    }
}
