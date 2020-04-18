package com.test;

public class Test3 {
    public static void main(String[] args) {
        int a = 123454321;
        String s="$321aba123";
        boolean b=isPalindrome(a);
        boolean b1=isPalindrome(s);
        if (b==true) {
            System.out.println(a+"是回文数");
        } else {
            System.out.println(a+"不是回文数");
        }
        if (b1==true) {
            System.out.println(s+"是回文字符串");
        } else {
            System.out.println(s+"不是回文字符串");
        }

    }

    /**
     * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
     * 负数一定不是，0到9的数字一定是
     * @param x
     * @return
     */
    public static boolean isPalindrome(int x){
        if(x <= 9 && x >= 0){
            return true;
        }
        if(x<0){
            return false;
        }
        int sum = 0;
        int num=x;
        while (num!=0){
            sum = sum * 10 + num % 10;
            num = num / 10;
        }
        if(sum==x){
            return true;
        }else{
            return false;
        }
    }

    /**
     * 判断一个字符串是不是回文字符串
     * @param str
     * @return
     */
    public static boolean isPalindrome(String str){
        if(str.equals(""))
            return true;
        str = str.toLowerCase();//将字符串的所有大写字母转小写
        int start = 0, end = str.length() - 1;
        //从字符两端分别逐个对比字符，不同则直接返回false
        while (start < end){
            //过滤掉非字母和数字字符
            while (!(str.charAt(start) >= 'a' && str.charAt(start) <= 'z' || str.charAt(start) >= '0' && str.charAt(start) <= '9'))
                start++;
            //过滤掉非字母和数字字符
            while (!(str.charAt(end) >= 'a' && str.charAt(end) <= 'z' || str.charAt(end) >= '0' && str.charAt(end) <= '9'))
                end--;
            //若字符不同，则直接返回false
            if(str.charAt(start) != str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}
