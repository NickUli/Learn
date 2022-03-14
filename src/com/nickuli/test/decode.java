package com.nickuli.test;

import java.util.Base64;

public class decode {
    public static void main(String[] args) {
        byte[] decodedBytes = Base64.getDecoder().decode("SmF2YSDQvdC1INGC0L7RgNC80L7Qt9C40YIhCg==");
        String txt=new String(decodedBytes);
        System.out.println(txt);
    }
}
