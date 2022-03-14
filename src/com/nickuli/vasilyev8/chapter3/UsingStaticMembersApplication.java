package com.nickuli.vasilyev8.chapter3;

class MyClassUSMA {
    static int count = 0;

    MyClassUSMA() {
        count++;
        System.out.println("Создан обЪект номер " + count);
    }

    static void show() {
        System.out.println("Количество объектов" + count);
    }
}

public class UsingStaticMembersApplication {
    public static void main(String[] args) {
        MyClassUSMA.show();
        MyClassUSMA objA = new MyClassUSMA();
        MyClassUSMA objB = new MyClassUSMA();
        MyClassUSMA objC = new MyClassUSMA();
        MyClassUSMA.show();
        objC.show();
        objB.show();
    }
}
