package com.nickuli.test;

import java.util.Arrays;
import java.util.Random;

public class RandomCount {
    public static void main(String[] args) {
        Random rnd=new Random();
        int[] cnt=new int[10];
        int num;
        for (int i=0;i<100000;i++){
            num=rnd.nextInt(10);
            cnt[num]+=1;
        }
        System.out.println(Arrays.toString(cnt));
    }
}
