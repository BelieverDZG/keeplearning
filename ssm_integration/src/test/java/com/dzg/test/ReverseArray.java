package com.dzg.test;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        /*int []arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));
        int res = Arrays.binarySearch(arr,3);
        System.out.println(res);
        int len = Array.getLength(arr);
        System.out.println(len);*/
        Scanner sc = new Scanner(System.in);
        System.out.println(sc);
        System.out.println(new Scanner(System.in));
     /*   int a = 1;
        int b = 2;
        System.out.println(a);
        System.out.println(b);
        change(a, b);
        System.out.println(a);
        System.out.println(b);*/

    }

    public static void change(int a, int b) {
        a = a + b;
        b = a + b;
    }
}
