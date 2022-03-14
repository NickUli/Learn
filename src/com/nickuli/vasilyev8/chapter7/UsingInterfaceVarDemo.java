package com.nickuli.vasilyev8.chapter7;

interface BaseUIVD {
    void show();
}

class AlphaUIVD implements BaseUIVD {
    String word;

    AlphaUIVD(String txt) {
        this.word = txt;
    }

    public void show() {
        System.out.println("Объект класса Alpha");
        System.out.println("Текстовое поле: " + word);
    }
}

class BravoUIVD implements BaseUIVD {
    int number;

    BravoUIVD(int n) {
        this.number = n;
    }

    public void show() {
        System.out.println("Объект класса Bravo");
        System.out.println("Текстовое поле: " + number);
    }
}

public class UsingInterfaceVarDemo {
    public static void main(String[] args) {
        BaseUIVD ref;
        ref = new AlphaUIVD("текст");
        ref.show();
        ref = new BravoUIVD(123);
        ref.show();
    }
}
