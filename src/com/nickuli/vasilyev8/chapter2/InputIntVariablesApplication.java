package com.nickuli.vasilyev8.chapter2;

import javax.swing.JOptionPane;

public class InputIntVariablesApplication {
    public static void main(String[] args) {
        int age, year, birth;
        String result;
        result = JOptionPane.showInputDialog("Какой сейчас год?");
        year = Integer.parseInt(result);
        result = JOptionPane.showInputDialog("Сколько Вам лет?");
        age = Integer.parseInt(result);
        birth = year - age;
        JOptionPane.showMessageDialog(null, "Вы родились в " + birth + " году!");
    }
}
