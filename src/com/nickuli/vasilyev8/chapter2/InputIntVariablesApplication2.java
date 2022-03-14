package com.nickuli.vasilyev8.chapter2;

import javax.swing.*;

public class InputIntVariablesApplication2 {
    public static void main(String[] args) {
        int year = Integer.parseInt(JOptionPane.showInputDialog("Какой сейчас год?"));
        int age = Integer.parseInt(JOptionPane.showInputDialog("Сколько Вам лет?"));
        JOptionPane.showMessageDialog(null, "Вы родились в " + (year - age) + " году!");
    }
}
