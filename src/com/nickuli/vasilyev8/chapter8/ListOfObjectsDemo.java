package com.nickuli.vasilyev8.chapter8;

class MyClassLOOD {
    int number;
    MyClassLOOD next;
}

public class ListOfObjectsDemo {
    static MyClassLOOD createList(int n) {
        MyClassLOOD obj = new MyClassLOOD();
        obj.number = 1;
        MyClassLOOD t = obj;
        for (int k = 1; k <= n; k++) {
            t.next = new MyClassLOOD();
            t.next.number = t.number * (n - k + 1) / k;
            t = t.next;
        }
        t.next = null;
        return obj;
    }

    static void showList(MyClassLOOD obj) {
        String txt = "| ";
        MyClassLOOD t = obj;
        do {
            txt += t.number + " | ";
            t = t.next;
        } while (t != null);
        System.out.println(txt);
    }

    public static void main(String[] args) {
        MyClassLOOD A = createList(5);
        MyClassLOOD B = createList(10);
        showList(A);
        showList(B);
    }
}
