package com.nickuli.vasilyev8.chapter10;

interface MyNumsULD {
    default void show(int n) {
        System.out.println("Аргумент: " + n);
        System.out.println("Результат: " + get(n));
    }

    int get(int n);
}

public class UsingLambdaDemo {
    public static void main(String[] args) {
        MyNumsULD A = (int n) -> {
            int k, s = 0;
            for (k = 1; k <= n; k++) {
                s += k;
            }
            return s;
        };
        System.out.println("Используем лямбда-выражение:");
        A.show(10);
        System.out.println("Проверка: " + A.get(10));
        MyNumsULD B = A;
        System.out.println("Новое лямбда-выражение:");
        A = n -> n * n;
        System.out.println("Вызов метода show() из A:");
        A.show(10);
        System.out.println("Вызов метода show() из B:");
        B.show(10);
    }
}
