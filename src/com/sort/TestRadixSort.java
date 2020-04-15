package com.sort;

import java.util.Arrays;

public class TestRadixSort {
    public static void main(String[] args) {
        int[] arr = new int[] {53, 3, 542, 748, 14, 214, 154, 63, 616};
        RadixSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 基数排序
     * @param arr
     */
    public static void RadixSort(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        int maxlength = (max + "").length();
        int[][] temp = new int[10][arr.length];
        int[] count = new int[10] ;
        for(int i = 0, n = 1; i < maxlength; i++, n*=10) {
            for(int j = 0; j < arr.length; j++) {
                int ys = (arr[j]/n)%10;
                temp[ys][count[ys]] = arr[j];
                count[ys]++;
            }
            int index = 0;
            for(int k = 0; k < count.length; k++) {
                if(count[k] != 0) {
                    for(int o = 0; o < count[k]; o++) {
                        arr[index] = temp[k][o];
                        index++;
                    }
                    count[k] = 0;
                }
            }
        }

    }
}
