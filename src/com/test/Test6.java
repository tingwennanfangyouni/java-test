package com.test;

import java.util.Stack;

public class Test6 {
    public static void main(String[] args) {
        String s="{()}";
        Boolean b=isValid(s);
        System.out.println(b);
    }

    /** 判断括号是否是对称的
     *  利用栈先进后出的特点进行判断，先进后出刚好符合对称性
     *  empty（）：判断栈是否为空栈
     *  pop():查看栈顶的数据，返回值为栈顶元素，底层数组中最后一个元素，同时把栈中的该元素删除。
     *  peek():查看栈顶的数据，返回值为栈顶元素，底层数组中最后一个元素，但是不会删除该元素
     *  push(item):把数据压入栈
     * @param s
     * @return
     */
    public static boolean isValid(String s) {
        Stack<Character> stack= new Stack();
        for(char c:s.toCharArray()){
            if(c=='(') {
                stack.push(')');
            }
            else if(c=='[') {
                stack.push(']');
            }
            else if(c=='{') {
                stack.push('}');
            }
            else if(stack.isEmpty()||stack.pop()!=c) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
