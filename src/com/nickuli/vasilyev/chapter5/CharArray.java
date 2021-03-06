package com.nickuli.vasilyev.chapter5;
//5.3. "Рваный" символьный массив

import javax.swing.*;

public class CharArray {
    public static void main(String[] args) {
        int size = 2 + (int) (Math.random() * 3);
        int n;
        char s = 'a';
        String text = "\"Рваный\" символьный массив:";
        char[][] symbs = new char[size][];
        for (int k = 0; k < size; k++) {
            n = 1 + (int) (Math.random() * 8);
            symbs[k] = new char[n];
        }
        for (int i = 0; i < symbs.length; i++) {
            text += "\n| ";
            for (int j = 0; j < symbs[i].length; j++) {
                symbs[i][j] = s;
                s++;
                text += symbs[i][j] + " | ";
            }
        }
        JOptionPane.showMessageDialog(null, text);
    }
}
