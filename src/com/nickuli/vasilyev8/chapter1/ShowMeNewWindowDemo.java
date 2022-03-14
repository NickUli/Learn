package com.nickuli.vasilyev8.chapter1;

import javax.swing.JOptionPane;

public class ShowMeNewWindowDemo {
    public static void main(String[] args) {
        String message = "Продолжаем изучать Java.";
        String title = "Сообщение";
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.WARNING_MESSAGE);
    }
}
