package com.nickuli.vasilyev8.chapter10;

interface MyNumsUACD {
    default void show(int n) {
        System.out.println("Аргумент: " + n);
        System.out.println("Результат: " + get(n));
    }

    int get(int n);
}

public class UsingAnonymousClassDemo {
    public static void main(String[] args) {
        MyNumsUACD A = new MyNumsUACD() {
            public int get(int n) {
                int k, s = 0;
                for (k = 1; k <= n; k++) {
                    s += k;
                }
                return s;
            }
        };
        System.out.println("Используем анонимный класс:");
        A.show(10);
        System.out.println("Проверка: " + A.get(10));
        MyNumsUACD B = A;
        System.out.println("Новый анонимный класс:");
        A = new MyNumsUACD() {
            public int get(int n) {
                return n * n;
            }
        };
        System.out.println("Вызов метода show() из A:");
        A.show(10);
        System.out.println("Вызов метода show() из B:");
        B.show(10);
    }
}
