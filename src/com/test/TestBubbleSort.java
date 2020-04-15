package com.test;

import java.util.Arrays;

public class TestBubbleSort {
    public static void main(String[] args) {
        int[] arr1 = new int[] {1,1,1,1,1,1,2};
        bubbleSort(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    /**
     * 冒泡排序的实现
     * @param arr 数组
     */
    public static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
