package com.nickuli.vasilyev8.chapter7;

interface FirstUID2 {
    void hello();
}

interface SecondUID2 {
    void hi();
}

class MyClassUID2 implements FirstUID2, SecondUID2 {
    public void hello() {
        System.out.println("Метод из интерфейса First");
    }

    public void hi() {
        System.out.println("Метод из интерфейса Second");
    }
}

public class UsingInterfacesDemo {
    public static void main(String[] args) {
        MyClassUID2 obj = new MyClassUID2();
        obj.hello();
        obj.hi();
    }
}
