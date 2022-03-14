package com.nickuli.vasilyev.chapter5;
//5.1. Одномерный массив из нечетных чисел

import javax.swing.*;

public class SimpleArray {
    public static void main(String[] args) {
        int i, size;
        String text = "Массив из нечетных чисел:\n";
        size = Integer.parseInt(JOptionPane.showInputDialog("Укажите размер массива:"));
        int[] nums = new int[size];
        for (i = 0; i < size; i++) {
            nums[i] = i * 2 + 1;
            text += nums[i] + " ";
        }
        JOptionPane.showMessageDialog(null, text);
    }
}
