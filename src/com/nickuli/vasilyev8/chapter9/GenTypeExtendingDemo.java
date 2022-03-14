package com.nickuli.vasilyev8.chapter9;

class BaseGTED {
    String name;

    BaseGTED(String txt) {
        this.name = txt;
    }

    void show() {
        System.out.println("Текстовое поле: " + name);
    }
}

class AlphaGTED extends BaseGTED {
    int number;

    AlphaGTED(String txt, int n) {
        super(txt);
        this.number = n;
    }

    void show() {
        super.show();
        System.out.println("Целочисленное поле: " + number);
    }
}

class BravoGTED extends AlphaGTED {
    char symbol;

    BravoGTED(String txt, int n, char s) {
        super(txt, n);
        this.symbol = s;
    }

    void show() {
        super.show();
        System.out.println("Символьное поле: " + symbol);
    }
}

class MyClassGTED<X extends BaseGTED> {
    X obj;

    MyClassGTED(X obj) {
        this.obj = obj;
    }

    void show() {
        System.out.println("Объект класса MyClass");
        obj.show();
    }
}

public class GenTypeExtendingDemo {
    public static void main(String[] args) {
        MyClassGTED<AlphaGTED> A = new MyClassGTED<>(new AlphaGTED("Alpha", 123));
        MyClassGTED<BravoGTED> B = new MyClassGTED<>(new BravoGTED("Bravo", 321, 'B'));
        A.show();
        B.show();
    }
}
