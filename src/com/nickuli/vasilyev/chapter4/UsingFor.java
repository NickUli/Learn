package com.nickuli.vasilyev.chapter4;
//4.4. Операторы цикла for

import javax.swing.*;

public class UsingFor {
    public static void main(String[] args) {
        int count, i, s = 0;
        count = Integer.parseInt(JOptionPane.showInputDialog("Введите границу суммы"));
        String text = "Сумма натуральных чисел от 1 до " + count + ": ";
        for (i = 1; i <= count; i++) {
            s += i;
        }
        JOptionPane.showMessageDialog(null, text + s);
    }
}
