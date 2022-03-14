package com.nickuli.nucleotide.chap1basis;

import javax.swing.*;

/**Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
 Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].
 */
public class MaxMinAver {
    public static void main(String[] args) {
        int length=Integer.parseInt(JOptionPane.showInputDialog("Введите длину массива."));
        int range=Integer.parseInt(JOptionPane.showInputDialog("Введите диапазон чисел."));
        String text= "Ваш массив:\n";
        int[] array=new int[length];
        for (int i=0; i<array.length;i++){
            array[i]=(int)(Math.random()*range);
            text+=array[i]+" ";
            if ((i+1)%20==0){
                text+="\n";
            }
        }
        int max=0, min=range, avg=0;
        for (int i=0;i<array.length;i++) {
            if (max<array[i]) max=array[i];
            if(min>array[i]) min=array[i];
            avg+=array[i];
        }
        text+="\nMax=" + max +" Min=" + min+" Average="+(double)avg/length;
        JOptionPane.showMessageDialog(null, text);
    }
}
