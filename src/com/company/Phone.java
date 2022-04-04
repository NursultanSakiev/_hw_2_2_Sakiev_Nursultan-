package com.company;

public class Phone implements Printable {
    private int age;
    private String name;

    public Phone(int age, String name) {
        this.name = name;
    }


    @Override
    public void print() {
        System.out.println("телефоны");
    }
}
