package com.nickuli.vasilyev8.chapter7;

interface FirstEAID {
    String getFirst();

    default void show() {
        System.out.println("Интерфейс First: метод show()");
    }
}

interface SecondEAID {
    String getSecond();

    default void show() {
        System.out.println("Интерфейс Second: метод show()");
    }
}

class BaseEAID {
    String getBase() {
        return "Класс Base";
    }

    void show() {
        System.out.println("Класс Base: метод show()");
    }
}

class MyClassEAID extends BaseEAID implements FirstEAID, SecondEAID {
    public String getFirst() {
        return "Интерфейс First";
    }

    public String getSecond() {
        return "Интерфейс Second";
    }

    public void show() {
        System.out.println("Мы используем:");
        System.out.println(getFirst());
        System.out.println(getSecond());
        System.out.println(getBase());
        FirstEAID.super.show();
        SecondEAID.super.show();
        super.show();
    }
}

public class ExtendingAndImplementingDemo {
    public static void main(String[] args) {
        MyClassEAID obj = new MyClassEAID();
        obj.show();
    }
}
