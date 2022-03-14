package com.nickuli.vasilyev8.chapter7;

interface FirstEID {
    default void alpha() {
        System.out.println("Интерфейс First: метод alpha()");
    }

    default void bravo() {
        System.out.println("Интерфейс First: метод alpha()");
    }

    default void charlie() {
        System.out.println("Интерфейс First: метод charlie()");
    }

    void delta();
}

interface SecondEID extends FirstEID {
    void bravo();

    default void charlie() {
        System.out.println("Интерфейс Second: метод charlie()");
    }

    void echo();
}

class MyClassEID implements SecondEID {
    public void bravo() {
        System.out.println("Класс MyClass: метод bravo()");
    }

    public void delta() {
        System.out.println("Класс MyClass: метод delta()");
    }

    public void echo() {
        System.out.println("Класс MyClass: метод echo()");
    }
}

public class ExtendingInterfaceDemo {
    public static void main(String[] args) {
        MyClassEID obj = new MyClassEID();
        obj.alpha();
        obj.bravo();
        obj.charlie();
        obj.delta();
        obj.echo();
    }
}
