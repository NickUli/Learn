package com.nickuli.vasilyev8.chapter9;

interface MyMethodsGID<X> {
    X get();

    void set(X arg);
}

class MyClassGID<X> implements MyMethodsGID<X> {
    private X value;

    MyClassGID(X arg) {
        this.value = arg;
    }

    public X get() {
        return value;
    }

    public void set(X arg) {
        this.value = arg;
    }

    void show() {
        System.out.println("Значение поля: " + get());
    }
}

public class GenInterfaceDemo {
    public static void main(String[] args) {
        MyMethodsGID ref;
        MyClassGID<Integer> A = new MyClassGID<>(123);
        MyClassGID<Character> B = new MyClassGID<>('A');
        A.show();
        ref = A;
        ref.set(321);
        A.show();
        B.show();
        ref = B;
        ref.set('B');
        B.show();
    }
}
