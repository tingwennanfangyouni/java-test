package com.test;

public class Test1 {

    public static void main(String[] args) {
        //创建一个链表
        ListNode listNode1=new ListNode(2);
        ListNode listNode2=new ListNode(4);
        ListNode listNode3=new ListNode(3);
        ListNode listNode4=new ListNode(3);
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;

        ListNode listNode5=new ListNode(5);
        ListNode listNode6=new ListNode(6);
        ListNode listNode7=new ListNode(4);
        ListNode listNode8=new ListNode(4);
        listNode5.next=listNode6;
        listNode6.next=listNode7;
        listNode7.next=listNode8;

        ListNode listNode=new ListNode(0);
        //计算两个数之和
        listNode.addTwoNumbers(listNode1,listNode5);
        //在链表头添加新元素
        ListNode node=new ListNode(666);
        node.next = listNode1;
        listNode1 = node;
        //在链表中间位置添加元素
        ListNode prev = listNode1;
        //表示在第四个元素前面添加一个元素
        for (int i = 0; i < 4 - 1; i++) {
            //获取到需要添加元素位置的前一个元素
            prev = prev.next;
        }
        ListNode node1 = new ListNode(888);
        node1.next = prev.next;
        prev.next = node1;
        System.err.println("原始链表结构：");
        listNode.otputListNode(listNode1);
        //链表移除指定数据
        ListNode a = listNode.removeElement(listNode1,3);
        System.err.println("修改之后的链表：");
        listNode.otputListNode(a);
    }

}

/**
 * 链表节点类
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    /**
     * 给出两个非空的链表用来表示两个非负的整数。其中，它们各自的位数是按照逆序的方式存储的，并且它们的每个节点只能存储一位数字。
     * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
     * 您可以假设除了数字 0 之外，这两个数都不会以 0?开头。
     * @param l1 第一个链表的表头
     * @param l2 第二个链表的表头
     * @return 返回相加后的链表每个val
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    /**
     * 通过递归方式删除链表指定元素
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElement(ListNode head,int val){
        if (null==head){
            return head;
        }
        if (head.val==val){
            return removeElement(head.next,val);
        }else {
            ListNode afterRemoveList = removeElement(head.next,val);
            head.next = afterRemoveList;
            return head;
        }
    }

    /**
     * 输出链表结果
     * @param node
     */
    public void otputListNode(ListNode node){
        if (null == node){
            return;
        }
        ListNode tmp = node;
        while (null != tmp){
            System.out.print(tmp.val);
            if (null != tmp.next){
                System.out.print("->");
            }
            tmp = tmp.next;
        }
        System.out.println();
    }

}


