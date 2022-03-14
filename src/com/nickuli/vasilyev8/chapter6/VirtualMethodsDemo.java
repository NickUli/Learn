package com.nickuli.vasilyev8.chapter6;

class AlphaVMD {
    String name;

    AlphaVMD(String txt) {
        objectCreated();
        this.name = txt;
    }

    void objectCreated() {
        System.out.println("Создан объект класса Alpha");
    }

    void hello() {
        System.out.println("Объект класса Alpha");
    }

    void show() {
        hello();
        System.out.println("Поле name: " + name);
    }
}

class BravoVMD extends AlphaVMD {
    BravoVMD(String txt) {
        super(txt);
    }

    void objectCreated() {
        System.out.println("Создан объект класса Bravo");
    }

    void hello() {
        System.out.println("Объект класса Bravo");
    }
}

public class VirtualMethodsDemo {
    public static void main(String[] args) {
        AlphaVMD objA = new AlphaVMD("alpha");
        objA.show();
        BravoVMD objB = new BravoVMD("bravo");
        objB.show();
    }
}
