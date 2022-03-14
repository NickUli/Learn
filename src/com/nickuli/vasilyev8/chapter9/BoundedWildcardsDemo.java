package com.nickuli.vasilyev8.chapter9;

class AlphaBWD {
    private String name;

    AlphaBWD(String txt) {
        this.name = txt;
    }

    public String toString() {
        return name;
    }
}

class BravoBWD extends AlphaBWD {
    BravoBWD(String txt) {
        super(txt);
    }
}

class CharlieBWD extends BravoBWD {
    CharlieBWD(String txt) {
        super(txt);
    }
}

class DeltaBWD extends CharlieBWD {
    DeltaBWD(String txt) {
        super(txt);
    }
}

class EchoBWD extends DeltaBWD {
    EchoBWD(String txt) {
        super(txt);
    }
}

class MyClassBWD<T> {
    private T obj;

    MyClassBWD(T arg) {
        this.obj = arg;
    }

    public String toString() {
        return obj.toString();
    }
}

public class BoundedWildcardsDemo {
    static void show(MyClassBWD<? extends CharlieBWD> obj) {
        System.out.println(obj);
    }

    static void display(MyClassBWD<? super CharlieBWD> obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) {
        MyClassBWD<AlphaBWD> A = new MyClassBWD<>(new AlphaBWD("Объект A"));
        MyClassBWD<BravoBWD> B = new MyClassBWD<>(new BravoBWD("Объект B"));
        MyClassBWD<CharlieBWD> C = new MyClassBWD<>(new CharlieBWD("Объект C"));
        MyClassBWD<DeltaBWD> D = new MyClassBWD<>(new DeltaBWD("Объект D"));
        MyClassBWD<EchoBWD> E = new MyClassBWD<>(new EchoBWD("Объект E"));
        display(A);
        display(B);
        display(C);
        show(C);
        show(D);
        show(E);
    }
}
