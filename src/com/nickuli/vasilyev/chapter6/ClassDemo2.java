package com.nickuli.vasilyev.chapter6;
//6.2. Класс с методом

import javax.swing.*;

class MyClass2 {
    int numb;
    char symb;
    String text;

    String showText() {
        String str = "Значения полей объекта:\n";
        str += "numb=" + numb + "\n";
        str += "symb=" + symb + "\n";
        str += "text=" + text;
        return str;
    }
}

public class ClassDemo2 {
    public static void main(String[] args) {
        MyClass2 obj = new MyClass2();
        obj.numb = 12;
        obj.symb = 'A';
        obj.text = "Текстовое поле";
        JOptionPane.showMessageDialog(null, obj.showText());
    }
}
