package com.nickuli.vasilyev8.chapter9;

interface MyMethodsMGID<X> {
    X get();

    void set(X arg);
}

class AlphaMGID implements MyMethodsMGID<Integer> {
    private Integer value;

    AlphaMGID(Integer arg) {
        this.value = arg;
    }

    public Integer get() {
        return value;
    }

    public void set(Integer arg) {
        this.value = arg;
    }

    void show() {
        System.out.println("Целочисленное поле: " + get());
    }
}

class BravoMGID implements MyMethodsMGID<Character> {
    private Character value;

    BravoMGID(Character arg) {
        this.value = arg;
    }

    public Character get() {
        return value;
    }

    public void set(Character arg) {
        this.value = arg;
    }

    void show() {
        System.out.println("Символьное поле: " + get());
    }
}

public class MoreGenInterfaceDemo {
    public static void main(String[] args) {
        MyMethodsMGID ref;
        AlphaMGID A = new AlphaMGID(123);
        BravoMGID B = new BravoMGID('A');
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
