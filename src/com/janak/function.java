package com.janak;

import java.util.Arrays;
import java.util.Scanner;

public class function {
    public static void main(String[] args) {
//        Scanner s  = new Scanner(System.in);

        int[] arr = { 56,35,32,12,38,75};
        System.out.print(Arrays.toString(arr));
        System.out.println();
        change(arr);
        System.out.print(Arrays.toString(arr));


    }


    static void change(int[] arr){
        arr[0] = 156;
    }
}
