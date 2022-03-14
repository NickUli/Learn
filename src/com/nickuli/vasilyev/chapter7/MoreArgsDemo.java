package com.nickuli.vasilyev.chapter7;
//7.4. Использование ссылочного аргумента

class MoreArgs {
    String name;

    MoreArgs(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Объект с именем \"" + name + "\".");
    }
}

public class MoreArgsDemo {
    static void changeRef(MoreArgs obj) {
        MoreArgs tmp = new MoreArgs("Локальный Объект");
        obj = tmp;
        obj.show();
    }

    public static void main(String[] args) {
        MoreArgs obj = new MoreArgs("Основной Объект");
        obj.show();
        changeRef(obj);
        obj.show();
    }
}
