package com.nickuli.vasilyev.chapter7;
//7.1. Статические члены класса

import javax.swing.*;

class UsingStat {
    static int N1;
    int N2;

    UsingStat(int n1, int n2) {
        N1 = n1;
        N2 = n2;
        String text = "Создан новый объект!\n";
        text += "Статическое поле: " + N1 + "\n";
        text += "Нестатическое поле: " + N2;
        JOptionPane.showMessageDialog(null, text);
    }

    void show() {
        String text = "Поля объекта!\n";
        text += "Статическое поле: " + N1 + "\n";
        text += "Нестатическое поле: " + N2;
        JOptionPane.showMessageDialog(null, text);
    }
}

public class UsingStatDemo {
    public static void main(String[] args) {
        UsingStat A = new UsingStat(10, 200);
        UsingStat.N1 = -50;
        A.show();
        UsingStat B = new UsingStat(1, 2);
        A.show();
        B.N1 = -1;
        B.N2 = -2;
        A.show();
    }
}
