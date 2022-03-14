package com.nickuli.vasilyev8.chapter7;

interface FirstMEID {
    default void alpha() {
        System.out.println("Интерфейс First: метод alpha()");
    }
}

interface SecondMEID extends FirstMEID {
    default void alpha() {
        FirstMEID.super.alpha();
        System.out.println("Интерфейс Second: метод alpha()");
    }

    default void bravo() {
        System.out.println("Интерфейс Second: метод bravo()");
    }
}

class MyClassMEID implements SecondMEID {
    public void bravo() {
        SecondMEID.super.bravo();
        System.out.println("Класс MyClass: метод bravo()");
    }
}

public class MoreExtendingInterfaceDemo {
    public static void main(String[] args) {
        MyClassMEID obj = new MyClassMEID();
        obj.alpha();
        obj.bravo();
    }
}
