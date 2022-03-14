package com.nickuli.vasilyev8.chapter1;

import javax.swing.JOptionPane;

public class InputDialogDemo {
    public static void main(String[] args) {
        String text = JOptionPane.showInputDialog("Введите текст:");
        JOptionPane.showMessageDialog(null, "Вы ввели такой текст:\n" + text);
    }
}
