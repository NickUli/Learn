package com.nickuli.vasilyev8.chapter3;

class MyClassUPMA {
    private static int count = 0;
    private int number;
    private String name;

    MyClassUPMA(String n) {
        count++;
        name = n;
        number = count;
        System.out.println("Создан объект с именем " + name);
    }

    public void show() {
        System.out.println("Название объекта: " + name);
        System.out.println("Номер объекта: " + number);
        System.out.println("Количество объектов: " + count);
    }

    public void set(String n) {
        name = n;
    }
}

public class UsingPrivateMembersApplication {
    public static void main(String[] args) {
        MyClassUPMA objA = new MyClassUPMA("Alfa");
        MyClassUPMA objB = new MyClassUPMA("Bravo");
        MyClassUPMA objC = new MyClassUPMA("Charlie");
        objA.show();
        objB.show();
        objC.show();
        objB.set("Второй объект");
        objB.show();
    }
}
