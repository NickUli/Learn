package com.nickuli.vasilyev.chapter6;

//6.7. Создание копии объекта
class MakeObjCopy {
    String name;
    int number;

    MakeObjCopy(String str, int num) {
        name = str;
        number = num;
    }

    MakeObjCopy(MakeObjCopy obj) {
        name = obj.name;
        number = obj.number;
    }

    MakeObjCopy copy() {
        MakeObjCopy tmp = new MakeObjCopy(name, number);
        return tmp;
    }

    void show() {
        String text = "Поля объекта:\n";
        text += "name: " + name + "\nnumber: " + number;
        System.out.println(text);
    }
}

public class MakeObjCopyDemo {
    public static void main(String[] args) {
        MakeObjCopy objA = new MakeObjCopy("Первый объект", 100);
        MakeObjCopy objB = new MakeObjCopy(objA);
        objA.show();
        objB.show();
        objB.name = "Второй объект";
        objB.number = 200;
        objA.show();
        objB.show();
        objA = objB.copy();
        objA.show();
        objB.name = "Второй объект изменен!";
        objB.number = 300;
        objA.show();
        objB.show();
    }
}
