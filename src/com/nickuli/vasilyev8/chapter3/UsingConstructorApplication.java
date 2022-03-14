package com.nickuli.vasilyev8.chapter3;

class MyClassUCA {
    int number;
    char symbol;

    MyClassUCA() {
        number = 100;
        symbol = 'A';
    }

    MyClassUCA(int n, char s) {
        number = n;
        symbol = s;
    }

    void show() {
        System.out.println("Значение полей " + number + " и " + symbol);
    }
}

public class UsingConstructorApplication {
    public static void main(String[] args) {
        MyClassUCA objA = new MyClassUCA();
        MyClassUCA objB = new MyClassUCA(200, 'B');
        System.out.println("Объект objA:");
        objA.show();
        System.out.println("Объект objB:");
        objB.show();
    }
}
