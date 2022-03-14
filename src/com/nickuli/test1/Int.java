package com.nickuli.test1;

public class Int {
    int row=5;
    public static void main(String[] args) {
        Adp<Data> array=new Adp<>(new Data());
        Data ar = array.data;
        System.out.println(ar.get());
        ar.get();

    }
    public int get(){
        return row;

    }
}
