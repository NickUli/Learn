package com.nickuli.vasilyev8.chapter9;

class BaseEGCD<X> {
    X data;

    BaseEGCD(X data) {
        this.data = data;
    }

    void show() {
        System.out.println(data);
    }
}

class AlphaEGCD extends BaseEGCD<Integer> {
    AlphaEGCD(Integer n) {
        super(n);
    }

    void show() {
        System.out.print("Целочисленное поле: ");
        super.show();
    }
}

class BravoEGCD extends BaseEGCD<String> {
    BravoEGCD(String txt) {
        super(txt);
    }

    void show() {
        System.out.print("Текстовое поле: ");
        super.show();
    }
}

class CharlieEGCD extends BaseEGCD<Character> {
    CharlieEGCD(Character s) {
        super(s);
    }

    void show() {
        System.out.print("Символьное поле: ");
        super.show();
    }
}

public class ExtendingGenClassDemo {
    public static void main(String[] args) {
        AlphaEGCD A = new AlphaEGCD(123);
        BravoEGCD B = new BravoEGCD("объект B");
        CharlieEGCD C = new CharlieEGCD('C');
        A.show();
        B.show();
        C.show();
    }
}
