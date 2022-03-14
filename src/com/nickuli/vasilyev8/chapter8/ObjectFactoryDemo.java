package com.nickuli.vasilyev8.chapter8;

abstract class BaseOFD {
    abstract void show();
}

class AlphaOFD extends BaseOFD {
    void show() {
        System.out.println("Объект класса Alpha");
    }
}

class BravoOFD extends BaseOFD {
    void show() {
        System.out.println("Объект класса Bravo");
    }
}

class CharlieOFD extends BaseOFD {
    void show() {
        System.out.println("Объект класса Charlie");
    }
}

public class ObjectFactoryDemo {
    static BaseOFD createObject(int n) {
        if (n == 1) return new AlphaOFD();
        if (n == 2) return new BravoOFD();
        return new CharlieOFD();
    }

    public static void main(String[] args) {
        BaseOFD obj;
        for (int k = 1; k <= 3; k++) {
            obj = createObject(k);
            obj.show();
        }
    }
}
