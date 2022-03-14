package com.nickuli.vasilyev.chapter2;
//2.2. Использование класса-оболочки

import javax.swing.*;

public class UsingInteger {
    public static void main(String[] args) {
        int number = 321;
        String notANumber = "123";
        int aNumber = Integer.parseInt(notANumber);
        String title1 = "Команда Number+notANumber";
        String title2 = "Команда Number+aNumber";
        int type1 = JOptionPane.ERROR_MESSAGE;
        int type2 = JOptionPane.WARNING_MESSAGE;
        JOptionPane.showMessageDialog(null, number + notANumber, title1, type1);
        JOptionPane.showMessageDialog(null, number + aNumber, title2, type2);
    }
}
