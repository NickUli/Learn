package com.nickuli.vasilyev8.chapter7;

interface FirstMDMD {
    default void hello() {
        System.out.println("Метод из интерфейса First");
    }
}

interface SecondMDMD {
    default void hello() {
        System.out.println("Метод из интерфейса Second");
    }
}

class MyClassMDMD implements FirstMDMD, SecondMDMD {
    public void hello() {
        FirstMDMD.super.hello();
        SecondMDMD.super.hello();
    }
}

public class MoreDefaultMethodsDemo {
    public static void main(String[] args) {
        MyClassMDMD obj = new MyClassMDMD();
        obj.hello();
    }
}
