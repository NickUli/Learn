package com.nickuli.vasilyev8.chapter10;

interface AlphaLAID {
    void showA();
}

interface BravoLAID {
    void showB();
}

interface CharlieLAID {
    void showC();
}

public class LambdaAndInterfaceDemo {
    public static void main(String[] args) {
        AlphaLAID A = () -> System.out.println("Используем лямбда-выражение");
        A.showA();
        BravoLAID B = () -> System.out.println("Используем лямбда-выражение");
        B.showB();
        CharlieLAID C = A::showA;
        C.showC();
    }
}
