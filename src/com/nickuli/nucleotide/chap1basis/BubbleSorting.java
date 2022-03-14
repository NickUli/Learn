package com.nickuli.nucleotide.chap1basis;

import javax.swing.*;

/**Реализуйте алгоритм сортировки пузырьком для сортировки массива
 */
public class BubbleSorting {
    public static void main(String[] args) {
        int length = Integer.parseInt(JOptionPane.showInputDialog("Введите длину массива."));
        int range = Integer.parseInt(JOptionPane.showInputDialog("Введите диапазон чисел."));
        String text = "Ваш массив:\n";
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * range);
            text += array[i] + " ";
            if ((i + 1) % 20 == 0) {
                text += "\n";
            }
        }
        for (int i = 0; i < array.length; i++) {
            int tmp;
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }
        JOptionPane.showMessageDialog(null, text);
        String sort="Отсортированный массив:\n";
        for (int ar : array) {
            sort += ar + " ";
        }
        JOptionPane.showMessageDialog(null,sort);
    }
}
