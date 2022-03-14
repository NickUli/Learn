package com.nickuli.vasilyev8.chapter9;

class MyClassUGMD {
    String name;

    MyClassUGMD(String txt) {
        this.name = txt;
    }

    <X> void show(X arg) {
        System.out.println(name + ": " + arg);
    }
}

public class UsingGenMethodsDemo {
    public static void main(String[] args) {
        MyClassUGMD A = new MyClassUGMD("Объект A");
        MyClassUGMD B = new MyClassUGMD("Объект B");
        A.show(123);
        A.show("Alpha");
        A.show('A');
        B.show(123);
        B.show("Bravo");
        B.show('B');
    }
}
