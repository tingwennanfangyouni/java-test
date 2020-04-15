package com.sort;

import java.util.Arrays;

public class TestInsertSort {
    public static void main(String[] args) {
        int[] arr = new int[] {5, 4, 5,4,5};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 所谓插入排序就是不断拿后一个数和前一个比较，如果后一个数比前一个数小，就交换她俩位置，交换完位置后再
     * 和前一个比，一直把最小的移动到最左边
     * @param arr 需要排序的数组
     */
    public static void insertSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i - 1]) {
                int temp = arr[i];
                int j;
                for(j = i - 1; j >= 0 && temp < arr[j]; j--) {
                    arr[j + 1] = arr[j];
                }
                arr[j + 1] = temp;
            }
        }
    }
}
