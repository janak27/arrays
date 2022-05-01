package com.janak;

import java.util.Arrays;
import java.util.Scanner;

public class twod {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] arr = new int[3][3];
//        int[][] arr = {
//                {42,56,23},
//                {75,21,12},
//                {78,96,49},
//        };
//        System.out.println(Arrays.toString(arr));

        //input
        for (int row = 0; row < arr.length; row++) {
            //for each column
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = s.nextInt();;
            }
        }
        // output
//        for (int row = 0; row < arr.length; row++) {
//            //for each column
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + "  ");
//            }
//            System.out.println();
//        }

        for (int row = 0; row < arr.length; row++) {
            //for each column
            System.out.println(Arrays.toString(arr[row]));
        }

    }
}

