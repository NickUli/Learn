package com.nickuli.vasilyev8.chapter7;

interface MyInterfaseUID {
    int NUMBER = 100;

    int getNumber(double x);

    char getSymbol(int n);
}

class MyClassUID implements MyInterfaseUID {
    public int getNumber(double x) {
        return (int) x;
    }

    public char getSymbol(int n) {
        return (char) ('A' + n);
    }
}

public class UsingInterfaceDemo {
    public static void main(String[] args) {
        MyClassUID obj = new MyClassUID();
        System.out.println("Статическая константа: " + MyClassUID.NUMBER);
        System.out.println("Целое число: " + obj.getNumber(12.5));
        System.out.println("Символ: " + obj.getSymbol(3));
    }
}
