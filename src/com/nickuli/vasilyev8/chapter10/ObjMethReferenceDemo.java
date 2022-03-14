package com.nickuli.vasilyev8.chapter10;

interface MyGetterOMRD {
    int myGet();
}

interface MySetterOMRD {
    void mySet(int n);
}

class MyClassOMRD {
    private int number;

    MyClassOMRD(int n) {
        this.number = n;
    }

    void set(int n) {
        this.number = n;
    }

    int get() {
        return number;
    }
}

public class ObjMethReferenceDemo {
    public static void main(String[] args) {
        MyClassOMRD obj = new MyClassOMRD(100);
        System.out.println("Создан объект с полем 100");
        MyGetterOMRD A = obj::get;
        MySetterOMRD B = obj::set;
        System.out.println("Переменная A: " + A.myGet());
        System.out.println("Переменная obj: " + obj.get());
        obj.set(200);
        System.out.println("Полю присвоено значение 200");
        System.out.println("Переменная A: " + A.myGet());
        B.mySet(300);
        System.out.println("Выполнена команда B.mySet(300)");
        System.out.println("Переменная A: " + A.myGet());
        System.out.println("Переменная obj: " + obj.get());
        obj = new MyClassOMRD(400);
        System.out.println("Создан объект с полем 400");
        System.out.println("Переменная A: " + A.myGet());
        System.out.println("Переменная obj: " + obj.get());
        B.mySet(500);
        System.out.println("Выполнена команда B.mySet(500)");
        System.out.println("Переменная A: " + A.myGet());
        System.out.println("Переменная obj: " + obj.get());
    }
}
