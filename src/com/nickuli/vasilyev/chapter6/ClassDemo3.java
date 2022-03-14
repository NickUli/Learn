package com.nickuli.vasilyev.chapter6;
//6.3. Несколько объектов

import javax.swing.*;

class MyClass3 {
    int numb;
    char symb;
    String text;

    void showText() {
        String str = "Значения полей объекта:\n";
        str += "numb=" + numb + "\n";
        str += "symb=" + symb + "\n";
        str += "text=" + text;
        JOptionPane.showMessageDialog(null, str);
    }

    void set(int n, char s, String str) {
        numb = n;
        symb = s;
        text = str;
    }
}

public class ClassDemo3 {
    public static void main(String[] args) {
        MyClass3 obj1 = new MyClass3();
        MyClass3 obj2 = new MyClass3();
        obj1.set(10, 'A', "Всем привет!");
        obj2.set(200, 'b', "Еще раз, привет!");
        obj1.showText();
        obj2.showText();
    }
}
