package com.nickuli.nucleotide.chap1basis;

import java.util.Arrays;

public class del2 {
    public static void main(String[] args) {
        int[] test_array = {0, 1, 2, 2, 3, 0, 4, 2};
        int offset = 0;
        for (int i = 0; i < test_array.length; i++) {
            if (test_array[i] == 3) {
                offset++;
            } else {
                test_array[i - offset] = test_array[i];
            }
        }
        int[] new_array = Arrays.copyOf(test_array, test_array.length - offset);
        System.out.println(Arrays.toString(new_array));
    }
}
