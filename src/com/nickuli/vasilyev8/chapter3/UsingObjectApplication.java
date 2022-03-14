package com.nickuli.vasilyev8.chapter3;

import javax.swing.JOptionPane;

class MyClassUOA {
    int number;
    char symbol;
}

public class UsingObjectApplication {
    public static void main(String[] args) {
        MyClassUOA obj = new MyClassUOA();
        obj.number = 100;
        obj.symbol = 'A';
        String text = "Число: " + obj.number + "\n";
        text += "Символ: " + obj.symbol;
        JOptionPane.showMessageDialog(null, text);
    }
}
