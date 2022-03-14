package com.nickuli.vasilyev8.chapter8;

interface BaseMACD {
    default void show() {
        System.out.println("Интерфейс Base");
    }

    void hello();
}

public class MoreAnonymousClassDemo {
    public static void main(String[] args) {
        BaseMACD obj = new BaseMACD() {
            public void hello() {
                System.out.println("Объект анонимного класса");
            }
        };
        obj.show();
        obj.hello();
        new BaseMACD() {
            public void hello() {
                System.out.println("Анонимный объект");
            }

            void showAll() {
                hello();
                show();
            }
        }.showAll();
    }
}
