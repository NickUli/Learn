package com.nickuli.vasilyev.chapter6;
//6.4. Конструктор класса

import javax.swing.*;

class MyClass4 {
    int numb;
    char symb;
    String text;

    MyClass4(int n, char s, String str) {
        set(n, s, str);
        showText();
    }

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

public class ClassDemo4 {
    public static void main(String[] args) {
        MyClass4 obj1 = new MyClass4(15, 'Ы', "Просто текст.");
    }
}
