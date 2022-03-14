package com.nickuli.vasilyev8.chapter6;

class AlphaOMD {
    String name;

    AlphaOMD(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Объект класса Alpha:");
        System.out.println("Поле name - " + name);
    }
}

class BravoOMD extends AlphaOMD {
    int code;

    BravoOMD(String name, int code) {
        super(name);
        this.code = code;
    }

    void show() {
        System.out.println("Объект класса Bravo:");
        System.out.println("Поле name - " + name);
        System.out.println("Поле code - " + code);
    }
}

public class OverrideMethodDemo {
    public static void main(String[] args) {
        AlphaOMD objA = new AlphaOMD("objA");
        BravoOMD objB = new BravoOMD("objB", 123);
        objA.show();
        objB.show();
    }
}
