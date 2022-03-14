package com.nickuli.vasilyev.chapter5;
//5.4. Сортировка символьного массива методом пузырька

import javax.swing.*;

public class CharArraySorting {
    public static void main(String[] args) {
        String text = "Исходный массив:\n";
        int size, i, j;
        size = Integer.parseInt(JOptionPane.showInputDialog("Размер массива:"));
        char[] symbs = new char[size];
        char s = 'a';
        for (i = 0; i < size; i++) {
            symbs[i] = (char) (s + (byte) (Math.random() * 26));
            text += symbs[i] + " ";
        }
        text += "\nПосле сортировки:\n";
        for (i = 0; i < size; i++) {
            for (j = 0; j < size - i - 1; j++) {
                if (symbs[j] > symbs[j + 1]) {
                    s = symbs[j + 1];
                    symbs[j + 1] = symbs[j];
                    symbs[j] = s;
                }
            }
        }
        for (i = 0; i < size; i++) {
            text += symbs[i] + " ";
        }
        JOptionPane.showMessageDialog(null, text);
    }
}
