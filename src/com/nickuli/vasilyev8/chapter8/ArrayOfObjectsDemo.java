package com.nickuli.vasilyev8.chapter8;

class MyClassAOOD {
    private int number;

    MyClassAOOD(int n) {
        this.number = n;
    }

    int get() {
        return number;
    }
}

public class ArrayOfObjectsDemo {
    static MyClassAOOD[] createBinoms(int n) {
        MyClassAOOD[] bins = new MyClassAOOD[n + 1];
        bins[0] = new MyClassAOOD(1);
        for (int k = 1; k <= n; k++) {
            bins[k] = new MyClassAOOD(bins[k - 1].get() * (n - k + 1) / k);
        }
        return bins;
    }

    static void show(MyClassAOOD[] objs) {
        String txt = "| ";
        for (int k = 0; k < objs.length; k++) {
            txt += objs[k].get() + " | ";
        }
        System.out.println(txt);
    }

    public static void main(String[] args) {
        MyClassAOOD[] A = createBinoms(5);
        MyClassAOOD[] B = createBinoms(10);
        show(A);
        show(B);
    }
}
