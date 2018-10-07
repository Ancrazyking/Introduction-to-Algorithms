package com.afeng.datastructure;

/**
 * @author afeng
 * @date 2018/10/6 20:25
 **/
public class LinkedList
{
    //链表的长度
    private int size;
    //链表的头指针,会指向链表的头结点(第一个结点)
    private Node head;

    public static void main(String[] args)
    {
        LinkedList myList = new LinkedList();
        myList.insertHead("wang");
        myList.insertHead("a");
        myList.insertHead("feng");
        //feng a wang
        myList.printList();
        System.out.println(myList.size);
        //a wang
        myList.deleteHead();
        myList.printList();
        System.out.println(myList.size);
    }

    //头结点插入,也是先进后出,类似于栈
    public void insertHead(Object data)
    {
        Node newNode = new Node();
        newNode.data = data;
        //注意步骤
        newNode.next = head;
        head = newNode;
        size++;
    }

    //头结点删除
    public void deleteHead()
    {
        head = head.next;
        size--;
    }

    //尾结点插入
    public void printList()
    {
        Node current = head;
        while (current != null)
        {
            System.out.println(current.data);
            current = current.next;
        }

    }

    //链表的结点
    private class Node
    {
        Object data;
        Node next;
    }

}
