package com.sort;

import java.util.Arrays;

public class TestSelectSort {
    public static void main(String[] args) {
        int[] arr = new int[] {5, 7, 4, 3, 7, 3, 9, 1, 0};
        System.out.println(Arrays.toString(arr));
        SelectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 选择排序
     * @param arr
     */
    public static void SelectSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int min = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[min] > arr[j]) {
                    min = j;
                }
            }
            if(i != min) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }
}
