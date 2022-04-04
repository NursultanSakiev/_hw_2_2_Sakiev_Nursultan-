package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Phone[] phones = new Phone[]{createObject("Iphone6"), createObject("Iphone8"), createObject("Iphone11")};
        for (int i = 0; i < phones.length; i++) {
            phones[i].print();
        }

    }

    public static Phone createObject(String className) {
        switch (className) {
            case "Iphone6":
                Iphone6 iphone6 = new Iphone6(2010, "iphone6", 30, "superquality");
                return iphone6;
            case "Iphone8":
                Iphone8 iphone8 = new Iphone8(2017, "iphone8", 23, "Black");
                return iphone8;
            case "Iphone11":
                Iphone11 iphone11 = new Iphone11(2020, "Iphone11", 45, "metal");
                return iphone11;
        }
        return null;
    }
}