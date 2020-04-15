package com.sort;

import java.util.Arrays;

public class TestQuickSort {
    public static void main(String[] args) {
        int[] arr2 = new int[] {1,2,3};
        System.out.println("排序前的数组："+Arrays.toString(arr2));
        QuickSort(arr2, 0, arr2.length - 1);
        System.out.println("排序后的数组："+Arrays.toString(arr2));
    }

    /**
     *
     * @param arr
     * @param start
     * @param end
     */
    public static void QuickSort(int[] arr,int start, int end){
        if(start < end){
            int low = start;
            int high = end;
            int standard = arr[low];
            while(low < high){
                while(low < high && standard < arr[high])high--;
                if(low < high) arr[low++] = arr[high];
                while(low < high && standard > arr[low])low++;
                if(low < high) arr[high--] = arr[low];
            }
            arr[low] = standard;
            QuickSort(arr, start, low - 1);
            QuickSort(arr, low + 1, end);
        }
    }
}
