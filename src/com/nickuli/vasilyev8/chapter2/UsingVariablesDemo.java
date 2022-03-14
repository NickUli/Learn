package com.nickuli.vasilyev8.chapter2;

import javax.swing.JOptionPane;

public class UsingVariablesDemo {
    public static void main(String[] args) {
        int number = 123;
        double x = 32.1;
        char symbol = 'A';
        boolean state = true;
        String text = "Используемые переменные:\n";
        text = text + "Целое число: " + number + "\n";
        text = text + "Действительное число: " + x + "\n";
        text = text + "Символ: " + symbol + "\n";
        text = text + "Логическое значение: " + state;
        JOptionPane.showMessageDialog(null, text);
    }
}
