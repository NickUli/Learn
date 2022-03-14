package com.nickuli.vasilyev8.chapter8;

class MyClassOARD {
    private int code;
    private String name;

    MyClassOARD(int n, String s) {
        System.out.println("Создание объекта:");
        set(n, s).show();
    }

    MyClassOARD set(int n) {
        this.code = n;
        return this;
    }

    MyClassOARD set(String s) {
        this.name = s;
        return this;
    }

    MyClassOARD set(int n, String s) {
        return set(n).set(s);
    }

    void show() {
        System.out.println("Поле code=" + code);
        System.out.println("Поле name=" + name);
        System.out.println("----------------");
    }
}

public class ObjectAsResultDemo {
    static MyClassOARD createObject(int n, String s) {
        return new MyClassOARD(n, s);
    }

    public static void main(String[] args) {
        MyClassOARD obj = createObject(100, "alpha");
        obj.set(200).show();
        obj.set("bravo").show();
        obj.show();
        createObject(300, "charlie").set(400, "delta").show();
    }
}
