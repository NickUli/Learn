package com.nickuli.vasilyev8.chapter8;

class MyClassSOD {
    int number;

    MyClassSOD(int n) {
        this.number = n;
    }
}

public class SwapObjectsDemo {
    static void swap(MyClassSOD A, MyClassSOD B) {
        System.out.println("Выполняется метод swap()");
        System.out.println("Объект A: " + A.number);
        System.out.println("Объект B: " + B.number);
        MyClassSOD X = B;
        B = A;
        A = X;
        System.out.println("Значение аргументов измененны");
        System.out.println("Объект A: " + A.number);
        System.out.println("Объект B: " + B.number);
        System.out.println("Завершено выполнение метода swap()");
    }

    public static void main(String[] args) {
        MyClassSOD A = new MyClassSOD(100);
        MyClassSOD B = new MyClassSOD(200);
        System.out.println("До вызова метода swap(): A.number=" + A.number + " и B.number=" + B.number);
        swap(A, B);
        System.out.println("После вызова метода swap(): A.number=" + A.number + " и B.number=" + B.number);
    }
}
