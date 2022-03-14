package com.nickuli.vasilyev.chapter7;
//7.2. Статические методы

import javax.swing.*;

class MyMath {
    final static double PI = 3.14159265;

    static double sin(double x, int n) {
        double s = 0, q = x;
        int i;
        for (i = 1; i <= n; i++) {
            s += q;
            q *= (-1) * x * x / (2 * i) / (2 * i + 1);
        }
        return s + q;
    }
}

public class StatMethDemo {
    public static void main(String[] args) {
        String text = "Значения ряда Тейлора для синуса.";
        for (int k = 0; k < 5; k++) {
            text += "\nСлагаемых " + (k + 1) + ": ";
            text += "sin(pi/4)=" + MyMath.sin(MyMath.PI / 4, k);
        }
        JOptionPane.showMessageDialog(null, text);
    }
}
