package com.nickuli.vasilyev.chapter6;
//6.1. Создание класса и объекта

import javax.swing.*;

class MyClass {
    int numb;
    char symb;
    String text;
}

public class ClassDemo {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.numb = 12;
        obj.symb = 'A';
        obj.text = "Текстовое поле";
        String str = "Значения полей объекта:\n";
        str += "numb=" + obj.numb + "\n";
        str += "symb=" + obj.symb + "\n";
        str += "text=" + obj.text;
        JOptionPane.showMessageDialog(null, str);
    }
}
