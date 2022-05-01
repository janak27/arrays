package com.janak;

public class maxitem {
    public static void main(String[] args) {
        int[] arr = {5,4,6,9,7,5,1,3,1};
        System.out.println(maxrange(arr, 4, 5));

    }

    static int max(int[] arr){
        int maxval = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }

    static int maxrange(int[] arr, int start, int end){
        int maxval = arr[0];
        for (int i = start; i < end ; i++) {
            if (arr[i] > maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }
}
