package com.nickuli.vasilyev.chapter6;
//6.5. Перегрузка методов и конструкторов

import javax.swing.*;

class MyClass5 {
    int numb;
    char symb;
    String text;

    MyClass5() {
        set();
        showText();
    }

    MyClass5(int n) {
        set(n);
        showText();
    }

    MyClass5(char s) {
        set(s);
        showText();
    }

    MyClass5(int n, char s, String str) {
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

    void set() {
        numb = 0;
        symb = 'a';
        text = "Нет аргументов.";
    }

    void set(int n) {
        numb = n;
        symb = 'b';
        text = "Целочисленный аргумент.";
    }

    void set(char s) {
        numb = 1;
        symb = s;
        text = "Символьный аргумент.";
    }

    void set(int n, char s, String str) {
        numb = n;
        symb = s;
        text = str;
    }
}

public class ClassDemo5 {
    public static void main(String[] args) {
        MyClass5 obj1 = new MyClass5();
        MyClass5 obj2 = new MyClass5(2);
        MyClass5 obj3 = new MyClass5('Z');
        MyClass5 obj4 = new MyClass5(3, 'A', "Три аргумента.");
    }
}
