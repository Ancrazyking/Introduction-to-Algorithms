package com.afeng.datastructure;

import java.util.LinkedList;

/**
 * 栈的链表实现
 * 用LinkedList实现
 * @author afeng
 * @date 2018/9/25 10:42
 **/
public class StackByList
{
    private LinkedList<Object> listStack = new LinkedList<>();

    public void push(Object obj)
    {
        listStack.add(obj);
    }


    public Object pop(Object obj)
    {
        return listStack.removeFirst();
    }


    public Object peek()
    {
        return listStack.getFirst();
    }


    public boolean isEmpty()
    {
        return listStack.isEmpty();
    }

}
