package com.nickuli.vasilyev8.chapter6;

class AlphaUPD {
    private int code;

    AlphaUPD(int code) {
        set(code);
    }

    public void set(int code) {
        this.code = code;
    }

    public void show() {
        System.out.println("Поле code: " + code);
    }
}

class BravoUPD extends AlphaUPD {
    BravoUPD(int code) {
        super(code);
    }
}

public class UsingPrivateDemo {
    public static void main(String[] args) {
        BravoUPD obj = new BravoUPD(100);
        obj.show();
        obj.set(200);
        obj.show();
    }
}
