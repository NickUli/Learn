package com.nickuli.nucleotide.chap1basis;

import javax.swing.*;

public class SimpleNumbers {
    public static void main(String[] args) {
        int range = Integer.parseInt(JOptionPane.showInputDialog("Введите дипазон для вывода простых чисел."));
        String text= "Простые числа данного диапазона:\n";
        for (int i=2; i<=range; i++){
            int count=0;
            for (int j=1; j<=i;j++){
                if(i%j==0) count++;
            }
            if (count<3) text+=i+" ";
        }
        JOptionPane.showMessageDialog(null,text);
    }
}
