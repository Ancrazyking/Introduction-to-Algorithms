package com.afeng.datastructure.linkedlist;

/**
 * @author afeng
 * @date 2018/9/26 8:49
 **/
public class LinkedList
{
    private int size;
    private Node head;


    public static void main(String[] args)
    {

        LinkedList list = new LinkedList();
        list.insertNode(1);
        list.insertNode(2);
        list.insertNode(3);
        list.ergodicList();
        System.out.println("删除3和2后..");
        list.delteNode();
        list.delteNode();
        list.ergodicList();
    }

    /**
     * 将头指针指向新插入的节点
     *
     * @param obj
     */
    public void insertNode(Object obj)
    {
        Node newNode = new Node(obj);
        newNode.next = head;
        head = newNode;
    }

    /**
     * 删除头指针指向的节点
     */
    public void delteNode()
    {
        head = head.next;
    }


    /**
     * 遍历链表
     */
    public void ergodicList()
    {
        Node cur = head;
        while (cur != null)
        {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }

    private class Node
    {
        private Object data;
        private Node next = null;

        public Node(Object data)
        {
            this.data = data;
        }
    }


}
