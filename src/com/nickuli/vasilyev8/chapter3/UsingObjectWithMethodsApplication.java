package com.nickuli.vasilyev8.chapter3;

import javax.swing.*;

class MyClassUOWMA{
    int number;
    char symbol;
    void set(int n,char s){
        number=n;
        symbol=s;
    }
    String getInfo(){
        String text="Число: "+number+"\n";
        text+="Символ: " +symbol;
        return text;
    }
}
public class UsingObjectWithMethodsApplication {
    public static void main(String[] args) {
        MyClassUOWMA objA=new MyClassUOWMA();
        MyClassUOWMA objB=new MyClassUOWMA();
        objA.set(100,'A');
        objB.set(200,'B');
        JOptionPane.showMessageDialog(null,objA.getInfo(),"Первый объект",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,objB.getInfo(),"Первый объект",JOptionPane.INFORMATION_MESSAGE);
    }
}
