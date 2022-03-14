package com.nickuli.vasilyev.chapter7;
//7.3. Передача аргументом объекта

class Args {
    int number;
    char symb;

    Args(int number, char symb) {
        this.number = number;
        this.symb = symb;
    }

    void show() {
        System.out.println("Поля объекта: " + number + " и " + symb);
    }
}

public class ArgsDemo {
    static void MakeChange(Args obj) {
        obj.number++;
        obj.symb++;
        String text = "Аргумент-объект: поля " + obj.number + " и " + obj.symb;
        System.out.println(text);
    }

    static void MakeChange(int number, char symb) {
        number++;
        symb++;
        String text = "Аргументы базовых типов: значения " + number + " и " + symb;
        System.out.println(text);
    }

    public static void main(String[] args) {
        Args obj = new Args(1, 'a');
        obj.show();
        MakeChange(obj);
        obj.show();
        MakeChange(obj.number, obj.symb);
        obj.show();
    }
}
