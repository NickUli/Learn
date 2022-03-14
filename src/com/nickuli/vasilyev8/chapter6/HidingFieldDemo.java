package com.nickuli.vasilyev8.chapter6;

class AlphaHFD {
    String name;
}

class BravoNFD extends AlphaHFD {
    String name;

    BravoNFD(String a, String b) {
        super();
        super.name = a;
        this.name = b;
    }

    void show() {
        System.out.println("Из класса Alpha: " + super.name);
        System.out.println("Из класса Bravo: " + name);
    }
}

public class HidingFieldDemo {
    public static void main(String[] args) {
        BravoNFD obj = new BravoNFD("alpha", "bravo");
        obj.show();
    }
}
