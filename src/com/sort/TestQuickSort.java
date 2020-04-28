package com.sort;

import java.util.Arrays;

public class TestQuickSort {
    public static void main(String[] args) {
        int[] arr2 = new int[] {1,2,3,2,0,9};
        System.out.println("排序前的数组："+Arrays.toString(arr2));
        QuickSort(arr2, 0, arr2.length - 1);
        System.out.println("排序后的数组："+Arrays.toString(arr2));
    }

    /**
     *
     * @param arr 快速排序是一种排序执行效率很高的排序算法，它利用分治法来对待排序序列进行分治排序，
     *            它的思想主要是通过一趟排序将待排记录分隔成独立的两部分，其中的一部分比关键字小，
     *            后面一部分比关键字大，然后再对这前后的两部分分别采用这种方式进行排序，
     *            通过递归的运算最终达到整个序列有序
     * @param start
     * @param end
     */
    public static void QuickSort(int[] arr,int start, int end)
    {
        if (start<end){
            int low=start;
            int high=end;
            int standard=arr[low];
            while (low<high){
                while(low<high&&standard<arr[high]) high--;
                if(low<high) arr[low++]=arr[high];
                while (low<high&&standard>arr[low]) low++;
                if(low<high) arr[high--]=arr[low];
            }
            arr[low]=standard;
            QuickSort(arr,start,low-1);
            QuickSort(arr,low+1,end);
        }
    }
}
