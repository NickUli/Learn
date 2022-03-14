package com.nickuli.vasilyev8.chapter8;

abstract class BaseACD {
    private String name;

    BaseACD(String txt) {
        this.name = txt;
    }

    void show() {
        System.out.println("Имя объекта: " + name);
    }

    abstract void hello();
}

public class AnonymousClassDemo {
    public static void main(String[] args) {
        BaseACD obj = new BaseACD("Красный") {
            void hello() {
                System.out.println("Объект анонимного класса");
            }
        };
        obj.show();
        obj.hello();
        new BaseACD("Зеленый") {
            void hello() {
                System.out.println("Анонимный объект");
            }

            void showAll() {
                hello();
                show();
            }
        }.showAll();
    }
}
