package com.example.problem5;

/*
 * 我们想到解决这个问题肯定要遍历链表。遍历的顺序是从头到尾的顺序，可输出的顺序却是从尾到头。
 * 也就是说第一个遍历到的结点最后一个输出，而最后一个遍历到的结点第一个输出。这就是典型的“ 后进先出”，
 * 可以用栈实现这种顺序。每经过一个结点的时候，把该结点放到一个栈中。当遍历完整个链表后，再从栈顶开
 * 始逐个输出结点的值，此时输出的结点的顺序已经反转过来了。
 */

import java.util.Stack;

class ListNode{
    ListNode next = null;
    int val;

    public ListNode(int val) {
        this.val = val;
    }
}


public class PrintListReverse {
    //循环遍历写法
    public static void printListReverse(ListNode head){
        if (head == null){return;}
        Stack<ListNode> stack = new Stack<ListNode>();
        while (head != null){
            stack.push(head);
            head = head.next;
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop().val);
        }
    }
    //递归写法
    /*
     * 既然想到了用栈实现这个函数，而递归在本质上就是一个栈结构，于是很自然地用想到了用递归来实现。
     * 要实现反过来输出链表，我们每访问到一个结点的时候，先递归输出它后面的结点，再输出该结点本身。
     */
    public static void printListReverse2(ListNode head){
        if (head == null){return;}
        printListReverse(head.next);
        System.out.println(head.val);
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        printListReverse2(node1);
    }

}
