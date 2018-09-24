package com.afeng.recursion;

/**
 * @author afeng
 * @date 2018/9/23 21:18
 * <p>
 * 斐波那契数列
 * 递归问题
 **/
public class Fibonacci
{
    public static int fibonacci(int n)
    {
        if (n == 0)
        {
            return 0;
        } else if (n < 0)
        {
            return -1;
        } else
        {
            return n + fibonacci(n - 1);
        }
    }

    public static void main(String[] args)
    {
        System.out.println(fibonacci(0));
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(2));
        System.out.println(fibonacci(-1));
    }

}
