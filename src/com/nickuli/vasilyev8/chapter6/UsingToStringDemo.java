package com.nickuli.vasilyev8.chapter6;

class MyClassUTSD {
    String name;
    int code;

    MyClassUTSD(String txt, int num) {
        this.name = txt;
        this.code = num;
    }

    public String toString() {
        String txt = "Объект класса MyClass\n";
        txt += "Поле name: " + name + "\n";
        txt += "Поле code: " + code + "\n";
        for (int k = 1; k <= 21; k++) {
            txt += "-";
        }
        return txt;
    }
}

public class UsingToStringDemo {
    public static void main(String[] args) {
        MyClassUTSD obj = new MyClassUTSD("объект obj", 123);
        System.out.println(obj);
    }
}
