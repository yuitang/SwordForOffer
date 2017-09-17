package com.example.problem16;

/*
 * 问题描述：定义一个函数，输入一个链表的头结点，反转该链表并输出反转后链表的头结点。
 */

class ListNode{
    int val;
    ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }
}

public class ReverseList {
    //循环遍历的方式
//    public ListNode getReverseListHead(ListNode head){
//        if (head == null||head.next ==null){  //若链表为空或只有这一个节点
//            return head;
//        }
//        ListNode current = head;    //current指针指向当前遍历的节点
//        ListNode pre = null;    //定义pre指针指向反转后的current的后继节点
//        ListNode pos = null;    //定义pos指针指向current的后继节点
//        while (head != null){
//            pos = current.next;
//            current.next = pre;
//            pre = current;
//            current = pos;
//            if (pos == null){   //当pos指向null时，此时pre指向的即是反转后的链表的头结点
//                break;
//            }
//        }
//        return pre;
//    }

    //递归的方式：翻转head.next为头结点的链表， 然后head变为尾部节点
    public ListNode getReverseListHead(ListNode head){
        if (head == null||head.next == null){
            return head;
        }
        ListNode reverseHead = getReverseListHead(head.next);
        head.next.next = head;
        head.next = null;
        return reverseHead;
    }

    //测试
    public static void main(String[] args){
        ReverseList test = new ReverseList();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;
        System.out.println(test.getReverseListHead(node1).val);
    }
}
