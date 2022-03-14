package com.nickuli.vasilyev8.chapter3;

class MyClassMOA {
    int number;
    char symbol;

    void set(int n) {
        number = n;
    }

    void set(char s) {
        symbol = s;
    }

    void set(int n, char s) {
        set(n);
        set(s);
    }

    void set() {
        set(0, 'Z');
    }

    void show() {
        System.out.println(" значение полей " + number + " и " + symbol);
    }

    void show(String txt) {
        System.out.println(txt + " значение полей " + number + " и " + symbol);
    }

    void show(String txt1, String txt2) {
        System.out.println(txt1 + ":" + number);
        System.out.println(txt2 + ":" + symbol);
    }
}

public class MethodOverloadingApplication {
    public static void main(String[] args) {
        MyClassMOA objA, objB;
        objA = new MyClassMOA();
        objB = new MyClassMOA();
        objA.set(100);
        objA.set('A');
        System.out.print("Объект objA:");
        objA.show();
        objB.set();
        objB.show("Объект objB:");
        objB.set(200, 'B');
        System.out.println("Объект objB после изменения:");
        objB.show("Число", "Символ");
    }
}
