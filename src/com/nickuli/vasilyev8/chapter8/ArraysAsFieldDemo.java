package com.nickuli.vasilyev8.chapter8;

class BinomialAAFD {
    private int[] binoms;

    BinomialAAFD(int n) {
        binoms = new int[n + 1];
        binoms[0] = 1;
        for (int k = 1; k <= n; k++) {
            binoms[k] = binoms[k - 1] * (n - k + 1) / k;
        }
    }

    public String toString() {
        String txt = "| ";
        for (int k = 0; k < binoms.length; k++) {
            txt += binoms[k] + " | ";
        }
        return txt;
    }
}

public class ArraysAsFieldDemo {
    public static void main(String[] args) {
        BinomialAAFD A = new BinomialAAFD(5);
        BinomialAAFD B = new BinomialAAFD(10);
        System.out.println(A);
        System.out.println(B);
    }
}
