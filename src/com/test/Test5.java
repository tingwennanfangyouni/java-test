package com.test;

public class Test5 {
    public static void main(String[] args) {
        String s = longestCommonPrefix02(new String[]{"aceqe","ace","ac"});
        System.out.println(s);
    }

    /**
     * 拿每个字符串与第一个字符串比较，如果包含第一个字符串，说明最长公共部分就是第一个字符串
     * 如果不包含第一个字符串就把第一个字符串最后一个字符去掉继续判断，直到第一个字符串长度为0
     * 此时说明没有公共部分
     * @param strs
     * @return
     */
    public static String longestCommonPrefix02(String[] strs) {
        if(strs.length==0){
            return "";
        }
        String ggzfc=strs[0];
        for(int a=0;a<strs.length;a++){
            while(strs[a].indexOf(ggzfc) !=0){
                ggzfc=ggzfc.substring(0,ggzfc.length()-1);
                if(ggzfc.length()==0){
                    return "";
                }
            }
        }
        return ggzfc;
    }
}
