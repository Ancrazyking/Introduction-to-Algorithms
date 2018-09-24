package com.afeng.datastructure;

/**
 * @author afeng
 * @date 2018/9/24 21:53
 **/
public class Stack
{
    private int maxSize;//栈的大小
    private int top;//栈指针指向新插入的元素
    private int arr[];//栈的数组存储空间


    /**
     * 构造函数,初始化时构造一个大小为maxSize的栈数组
     * 栈指针指向索引-1
     *
     * @param maxSize
     */
    public Stack(int maxSize)
    {
        this.maxSize = maxSize;
        top = -1;
        arr = new int[maxSize];
    }

    public static void main(String[] args)
    {
        Stack stack = new Stack(10);
        for (int i = 1; i <= 10; i++)
        {
            stack.push(i);
        }
        System.out.println(stack.top);
        System.out.println(stack.peek());
        System.out.println(stack.isFull());
    }

    public void push(int value)
    {
        arr[++top] = value;
    }

    public int pop()
    {
        return arr[top--];
    }

    /**
     * 访问栈顶元素
     *
     * @return
     */
    public int peek()
    {
        return arr[top];
    }

    public boolean isFull()
    {
        return top == maxSize - 1;
    }

    public boolean isEmpty()
    {
        return top == -1;
    }


}
