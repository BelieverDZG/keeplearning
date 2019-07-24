package com.dzg.test;

public class DemoReload {
    public static void main(String[] args) {
        byte a = 1;
        byte b = 2;
        short c = 1;
        short d = 2;
        int e = 1;
        int f = 2;
        System.out.println(compare(a,b));
        System.out.println(compare(c,d));
        System.out.println(compare(e,f));

    }
    public static boolean compare(byte a,byte b){
        return a==b;
    }
    public static boolean compare(short a,short b){
        return a==b;
    }
    public static boolean compare(int a,int b){
        return a==b;
    }
}
