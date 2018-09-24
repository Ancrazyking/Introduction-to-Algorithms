package com.afeng.datastructure.application;

import com.afeng.datastructure.Stack;

/**
 * @author afeng
 * @date 2018/9/24 22:07
 **/
public class ReverseByStack
{
    public static void main(String[] args)
    {
        Stack stack = new Stack(10);
        for (int i = 1; i <= 10; i++)
        {
            stack.push(i);
        }
        /**
         * 用while循环方便
         */
        while (!stack.isEmpty())
        {
            System.out.println(stack.pop());
        }
    }


}
