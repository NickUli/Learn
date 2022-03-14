package com.nickuli.vasilyev.chapter7;
//7.6. Анонимные объекты

import javax.swing.*;

class AObj {
    int[] nums;

    AObj(int n) {
        nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }
    }

    void show() {
        String text = "Натуральные числа:\n";
        for (int i = 0; i < nums.length; i++) {
            text += nums[i] + " ";
        }
        JOptionPane.showMessageDialog(null, text);
    }
}

public class AObjDemo {
    static void show(AObj obj) {
        String text = "Элементы массива:\n";
        int n = (int) Math.ceil(Math.sqrt(obj.nums.length));
        for (int i = 0; i < obj.nums.length - 1; i++) {
            text += obj.nums[i] + ((i + 1) % n == 0 ? " >> дальше\n" : " : ");
        }
        text += obj.nums[obj.nums.length - 1] + ". конец";
        JOptionPane.showMessageDialog(null, text);
    }

    public static void main(String[] args) {
        new AObj(12).show();
        show(new AObj(24));
    }
}
