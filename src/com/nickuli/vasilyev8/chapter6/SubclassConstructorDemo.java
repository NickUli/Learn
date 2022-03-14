package com.nickuli.vasilyev8.chapter6;

class AlphaSCD {
    String name;
    int code;

    AlphaSCD(String name, int code) {
        this.name = name;
        this.code = code;
        System.out.println("Класс Альфа:");
        System.out.println("Поле name - " + this.name);
        System.out.println("Поле code - " + this.code);
    }

    AlphaSCD(String name) {
        this(name, 0);
    }

    AlphaSCD(int code) {
        this("Белый", code);
    }

    AlphaSCD() {
        this(":Желтый", 1);
    }
}

class BravoSCD extends AlphaSCD {
    char symbol;

    BravoSCD(String name, int code, char symbol) {
        super(name, code);
        this.symbol = symbol;
        show();
    }

    BravoSCD(char symbol) {
        super();
        this.symbol = symbol;
        show();
    }

    BravoSCD(String name) {
        super(name);
        this.symbol = 'A';
        show();
    }

    BravoSCD(int code) {
        super(code);
        this.symbol = 'B';
        show();
    }

    BravoSCD() {
        this.symbol = 'C';
        show();
    }

    BravoSCD(String name, int code) {
        this(name, code, 'D');
    }

    private void show() {
        System.out.println("Класс Bravo:");
        System.out.println("Поле symbol - " + this.symbol);
        for (int k = 1; k <= 18; k++) System.out.print("-");
        System.out.println("");
    }
}

public class SubclassConstructorDemo {
    public static void main(String[] args) {
        BravoSCD obj;
        obj = new BravoSCD();
        obj = new BravoSCD("Красный");
        obj = new BravoSCD(100);
        obj = new BravoSCD("Зеленый", 200);
        obj = new BravoSCD('Y');
        obj = new BravoSCD("Синий", 300, 'Z');
    }
}
