package com.test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入几个数字：");
        String s=scanner.nextLine();
        System.out.println("请输入一个数字：");
        String t=scanner.nextLine();
        int target=Integer.parseInt(t);
        String[] nums=s.split(",");
        for (int i = 0; i<nums.length;i++) {
            for (int j = i+1; j<nums.length;j++) {
                int a=Integer.parseInt(nums[j]);
                int b=Integer.parseInt(nums[i]);
                if(a==target-b){
                    System.err.println(i+"&"+j);
                }
            }
        }
    }

}
