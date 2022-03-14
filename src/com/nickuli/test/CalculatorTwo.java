package com.nickuli.test;

public class CalculatorTwo implements Calculable {
    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int minus(int a, int b) {
        return a - b;
    }
}
