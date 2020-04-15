package com.sort;

import java.util.Arrays;

public class TestShellSort {
    public static void main(String[] args) {
        int[] arr = new int[] {5, 7, 4, 3, 7, 3, 9, 1, 0};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        ShellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 希尔排序
     * @param arr
     */
    public static void ShellSort(int[] arr) {
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                while (j - gap >= 0 && arr[j] < arr[j - gap]) {
                    swap(arr, j, j - gap);
                    j -= gap;
                }
            }
        }
    }

    /**
     * 交换数组元素
     * @param arr
     * @param a
     * @param b
     */
    public static void swap(int []arr,int a,int b){
            arr[a] = arr[a]+arr[b];
            arr[b] = arr[a]-arr[b];
            arr[a] = arr[a]-arr[b];
          }
}
