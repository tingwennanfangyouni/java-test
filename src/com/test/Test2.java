package com.test;

public class Test2 {
    public static void main(String[] args) {
        int a=-150;
        int s = reverse(a);
        System.out.println(s);
    }

    /**
     * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
     * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。
     * 请根据这个假设，如果反转后整数溢出那么就返回 0。
     * @param x
     * @return
     */
    public static int reverse(int x){
        if(x==0){
            return 0;
        }
        if(x>(Math.pow(2, 31))-1 || x<(-1*Math.pow(2, 31))){
            return 0;
        }
        long sum = 0;
        while(x!=0){
            sum = sum*10 + x % 10;
            x=x/10;
        }
        if(sum>(Math.pow(2, 31))-1 || sum<(-1*Math.pow(2, 31))){
            return 0;
        }else {
            return (int) sum;
        }
    }
}
