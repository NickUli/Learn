package com.nickuli.vasilyev8.chapter8;

class BaseCCD {
    String name;

    BaseCCD(String txt) {
        this.name = txt;
    }

    BaseCCD(BaseCCD obj) {
        this.name = obj.name;
    }
}

class MyClassCCD extends BaseCCD {
    int code;

    MyClassCCD(String txt, int n) {
        super(txt);
        this.code = n;
    }

    MyClassCCD(MyClassCCD obj) {
        super(obj);
        this.code = obj.code;
    }

    void show() {
        System.out.println("Текстовое поле: " + name);
        System.out.println("Целочисленное поле: " + code);
    }
}

public class CopyConstructorDemo {
    public static void main(String[] args) {
        MyClassCCD A = new MyClassCCD("Желтый", 200);
        MyClassCCD B = new MyClassCCD(A);
        A.name = "Красный";
        A.code = 100;
        MyClassCCD C = new MyClassCCD(new MyClassCCD("Зеленый", 300));
        System.out.println("Объект A");
        A.show();
        System.out.println("Объект B");
        B.show();
        System.out.println("Объект C");
        C.show();
    }
}
