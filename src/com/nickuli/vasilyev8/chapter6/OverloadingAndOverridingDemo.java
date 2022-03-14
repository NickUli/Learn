package com.nickuli.vasilyev8.chapter6;

class AlphaOAOD {
    void show() {
        System.out.println("Класс Alpha");
    }

    void show(String txt) {
        System.out.println(txt);
    }
}

class BravoAOAD extends AlphaOAOD {
    void show() {
        System.out.println("Класс Bravo");
    }

    void show(int num) {
        System.out.println("Число " + num);
    }
}

public class OverloadingAndOverridingDemo {
    public static void main(String[] args) {
        AlphaOAOD objA = new AlphaOAOD();
        objA.show();
        objA.show("Объект objA");
        BravoAOAD objB = new BravoAOAD();
        objB.show();
        objB.show("Объект objB");
        objB.show(123);
    }
}
