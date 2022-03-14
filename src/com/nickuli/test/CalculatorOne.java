package com.nickuli.test;

public class CalculatorOne implements Calculable{
    @Override
    public int sum(int a, int b) {
        return a + b + b;
    }

    @Override
    public int minus(int a, int b) {
        return b - a - a;
    }
}
