package cn.imlxy.offer_06_从尾到头打印链表;

/**
 * @ClassName : Solution
 * @Description : 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 * @Author : LiuXinyu
 * @Site : www.imlxy.cn
 * @Date: 2020-05-02 20:53
 */

import java.util.*;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution {
    List<Integer> list = new ArrayList<>();

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        while (listNode != null) {
            list.add(0, listNode.val);
            listNode = listNode.next;
        }
        return (ArrayList<Integer>) list;
    }
}
/*public class Solution {
    List<Integer> list=new ArrayList<>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
            if (listNode!= null) {
                printListFromTailToHead(listNode.next);
                list.add(listNode.val);
            }
        return (ArrayList<Integer>) list;
    }
}*/
/*
public class Solution {
    Stack<ListNode> stack = new Stack<>();
    List<Integer> list = new ArrayList<>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        while (listNode != null) {
            stack.push(listNode);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()) {
            ListNode pop = stack.pop();
            list.add(pop.val);
        }
        return (ArrayList<Integer>) list;
    }
}*/
