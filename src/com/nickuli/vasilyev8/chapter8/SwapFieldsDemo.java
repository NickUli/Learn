package com.nickuli.vasilyev8.chapter8;

class MyClassSFD {
    int number;

    MyClassSFD(int n) {
        this.number = n;
    }
}

public class SwapFieldsDemo {
    static void swap(MyClassSFD A, MyClassSFD B) {
        System.out.println("Выполняется метод swap()");
        System.out.println("Объект A: " + A.number);
        System.out.println("Объект B: " + B.number);
        int number = B.number;
        B.number = A.number;
        A.number = number;
        System.out.println("Значение полей измененны");
        System.out.println("Объект A: " + A.number);
        System.out.println("Объект B: " + B.number);
        System.out.println("Завершено выполнение метода swap()");
    }

    public static void main(String[] args) {
        MyClassSFD A = new MyClassSFD(100);
        MyClassSFD B = new MyClassSFD(200);
        System.out.println("До вызова метода swap(): A.number=" + A.number + " и B.number=" + B.number);
        swap(A, B);
        System.out.println("После вызова метода swap(): A.number=" + A.number + " и B.number=" + B.number);
    }
}
