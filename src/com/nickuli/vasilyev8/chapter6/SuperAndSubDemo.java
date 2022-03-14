package com.nickuli.vasilyev8.chapter6;

class AlphaSASD {
    String name;

    void show() {
        String txt = "Объект класса Alpha\n";
        txt += "Поле name: " + name + "\n";
        for (int k = 1; k <= 21; k++) txt += "-";
        System.out.println(txt);
    }
}

class BravoSASD extends AlphaSASD {
    int code;

    void show() {
        String txt = "Объект класса Bravo\n";
        txt += "Поле name: " + name + "\n";
        txt += "Поле code: " + code + "\n";
        for (int k = 1; k <= 21; k++) txt += "-";
        System.out.println(txt);
    }
}

public class SuperAndSubDemo {
    public static void main(String[] args) {
        AlphaSASD objA = new AlphaSASD();
        objA.name = "alpha";
        objA.show();
        BravoSASD objB = new BravoSASD();
        objB.name = "bravo";
        objB.code = 123;
        objB.show();
        objA = objB;
        objA.name = "charlie";
        objA.show();
        objB.show();
    }
}
