package com.nickuli.vasilyev8.chapter9;

class MyClassUWD<T> {
    T value;

    MyClassUWD(T val) {
        this.value = val;
    }
}

public class UsingWildcardDemo {
    static <T> void show(MyClassUWD<T> obj) {
        System.out.println("Вызов метода show():");
        System.out.println(obj.value);
    }

    static void display(MyClassUWD<?> obj) {
        System.out.println("Вызов метода display():");
        System.out.println(obj.value);
    }

    public static void main(String[] args) {
        MyClassUWD<Integer> A = new MyClassUWD<>(100);
        MyClassUWD B = new MyClassUWD<>('B');
        MyClassUWD<?> C = new MyClassUWD<>("Объект C");
        show(A);
        display(A);
        show(B);
        display(B);
        show(C);
        display(C);
    }
}
