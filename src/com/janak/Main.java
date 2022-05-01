package com.janak;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // store roll no
        //
        //        int a= 1;
        //        System.out.println(a);
        // syntax
        //        int[] arr = new int[5]; // declaration of array
        //        int[] arr2 = {23,5,6,4,3};
        //       System.out.println(arr2);
        //        System.out.println(arr2[2]);

        Scanner sc = new Scanner(System.in);

//        int[] arr = new int[5];
//        arr[0] = 23;
//        arr[1] = 73;
//        arr[2] = 83;
//        arr[3] = 43;
//        System.out.println(arr[2]);
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

//        System.out.println(Arrays.toString(arr));



        // arrays of objects
        String[] strarr = new String[6];
        for (int i = 0; i < strarr.length; i++) {
            strarr[i] = sc.next();
        }

        System.out.println(Arrays.toString(strarr));

    }
}
