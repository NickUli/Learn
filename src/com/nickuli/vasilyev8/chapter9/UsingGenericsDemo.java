package com.nickuli.vasilyev8.chapter9;

class AlphaUGD<X> {
    private X first;

    AlphaUGD(X first) {
        set(first);
    }

    void set(X first) {
        this.first = first;
    }

    X get() {
        return first;
    }
}

class BravoUGD<X, Y> {
    AlphaUGD<X> obj;
    Y second;

    BravoUGD(X first, Y second) {
        obj = new AlphaUGD<X>(first);
        this.second = second;
    }

    void show() {
        System.out.println("Значения " + obj.get() + " и " + second);
    }
}

public class UsingGenericsDemo {
    public static void main(String[] args) {
        BravoUGD<Integer, Character> A = new BravoUGD<>(100, 'A');
        A.show();
        BravoUGD<String, Double> B = new BravoUGD<>("BRAVO", 12.345);
        B.show();
    }
}
