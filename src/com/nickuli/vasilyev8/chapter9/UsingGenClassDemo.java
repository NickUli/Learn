package com.nickuli.vasilyev8.chapter9;

class MyClassUGCD<X> {
    X data;

    MyClassUGCD(X data) {
        this.data = data;
    }

    void show() {
        System.out.println("Значение поля: " + data);
    }
}

public class UsingGenClassDemo {
    public static void main(String[] args) {
        MyClassUGCD<Integer> A = new MyClassUGCD<>(100);
        MyClassUGCD<Character> B = new MyClassUGCD<>('B');
        MyClassUGCD<String> C = new MyClassUGCD<>("Зеленый");
        A.show();
        B.show();
        C.show();
    }
}
