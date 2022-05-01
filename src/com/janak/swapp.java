package com.janak;

import java.lang.reflect.Array;
import java.util.Arrays;

public class swapp {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,5,8,9,7};
//        swap(arr,7 , 5);
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr [index2];
        arr[index2] = temp;
    }
    static  void reverse(int arr[]){
        int start = 0;
        int end = arr.length -1;
        while (start < end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
