package com.nickuli.vasilyev.chapter6;
//6.6. Присваивание объектов

import javax.swing.*;

class AssignObj {
    String text;

    AssignObj() {
        text = "Новый объект!";
    }

    AssignObj(String str) {
        text = str;
    }

    void show() {
        JOptionPane.showMessageDialog(null, text);
    }
}

public class AssignObjDemo {
    public static void main(String[] args) {
        AssignObj objA = new AssignObj();
        AssignObj objB = new AssignObj("Второй объект!");
        objA.show();
        objB.show();
        objA = objB;
        objA.show();
        objB.text = "Изменен второй объект!";
        objA.show();
    }
}
