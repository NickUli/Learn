package com.nickuli.vasilyev8.chapter7;

interface BaseUDMD {
    default void show(String txt) {
        System.out.println("Интерфейс Base: " + txt);
    }

    void hello();
}

class AlphaUDMD implements BaseUDMD {
    public void hello() {
        System.out.println("Объект класса Alpha");
    }

    public void show(String txt) {
        System.out.println("Класс Alpha: " + txt);
    }

}

class BravoUDMD implements BaseUDMD {
    public void hello() {
        System.out.println("Объект класса Bravo");
    }
}

public class UsingDefaultMethodsDemo {
    public static void main(String[] args) {
        BaseUDMD ref;
        AlphaUDMD objA = new AlphaUDMD();
        objA.hello();
        objA.show("объектная переменная objA");
        ref = objA;
        ref.show("интерфейсная переменная ref");
        BravoUDMD objB = new BravoUDMD();
        objB.hello();
        objB.show("объектная переменная objB");
        ref = objB;
        ref.show("интерфейсная переменная ref");
    }
}
