package com.nickuli.vasilyev.chapter4;
//4.1. Условный оператор

import javax.swing.*;

public class UsingIf {
    public static void main(String[] args) {
        double x, y;
        String title = "Деление чисел";
        String text = "Результат деления: ";
        int type;
        x = Double.parseDouble(JOptionPane.showInputDialog("Числитель: "));
        y = Double.parseDouble(JOptionPane.showInputDialog("Знаменатель: "));
        if (y != 0) {
            type = JOptionPane.PLAIN_MESSAGE;
            text = text + x + "/" + y + "=" + x / y;
        } else {
            type = JOptionPane.ERROR_MESSAGE;
            text = text + "деление на ноль!";
        }
        JOptionPane.showMessageDialog(null, text, title, type);
    }
}