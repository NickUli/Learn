package com.nickuli.vasilyev8.chapter4;

import javax.swing.*;

public class UsingMultiIfDemo {
    public static void main(String[] args) {
        ImageIcon img;
        String animal;
        String file = "C:/Learn/img/";
        String wolf = "Волк";
        String fox = "Лиса";
        String bear = "Медведь";
        String raccoon = "Енот";
        animal = JOptionPane.showInputDialog(null, wolf + " , " + fox + " , " + bear + " ?",
                "Укажите название животного", JOptionPane.QUESTION_MESSAGE);
        if (animal == null) {
            System.exit(0);
        } else if (animal.equalsIgnoreCase(wolf)) {
            file += "wolf.png";
            animal = wolf;
        } else if (animal.equalsIgnoreCase(fox)) {
            file += "fox.png";
            animal = fox;
        } else if (animal.equalsIgnoreCase(bear)) {
            file += "bear.png";
            animal = bear;
        } else {
            file += "raccoon.png";
            animal = raccoon;
        }
        img = new ImageIcon(file);
        JOptionPane.showMessageDialog(null, img, animal, JOptionPane.PLAIN_MESSAGE);
    }
}
