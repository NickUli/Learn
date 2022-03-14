package com.nickuli.vasilyev8.chapter6;

class AlphaMOD {
    String name;

    AlphaMOD(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Объект " + name);
    }
}

class BravoMOD extends AlphaMOD {
    int code;

    BravoMOD(String name, int code) {
        super(name);
        this.code = code;
    }

    void show() {
        super.show();
        System.out.println("Числовое поле " + code);
    }
}

public class MoreOverridingDemo {
    public static void main(String[] args) {
        AlphaMOD objA = new AlphaMOD("objA");
        BravoMOD objB = new BravoMOD("objB", 123);
        objA.show();
        objB.show();
    }
}
