package com.nickuli.nucleotide.chap1basis;

import javax.swing.*;

public class DelFromArray {
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
        JOptionPane.showMessageDialog(null, text);
        int num=Integer.parseInt(JOptionPane.showInputDialog("Введите удаляемое число."));

        int count=0;
        for (int i=0;i<array.length;i++){
            if (array[i]==num){
                count++;
                for (int j=i;j<array.length-1;j++){
                    array[j]=array[j+1];
                }
            }
        }
        String str="Массив с удаленным числом "+ num+": \n";
        int[] arrDel=new int[length-count];
        for (int i=0;i<arrDel.length;i++) {
            arrDel[i]=array[i];
            str+=arrDel[i]+" ";
        }


        JOptionPane.showMessageDialog(null, str);
    }
}
