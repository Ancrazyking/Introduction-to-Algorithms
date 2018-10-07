package com.afeng.sort;

import java.util.Arrays;

/**
 * 希尔排序:插入排序的一种,希尔排序就是设定一个增量.
 *
 * @author afeng
 * @date 2018/10/6 19:39
 **/
public class ShellSort
{
    public static void shellSort(int arr[])
    {

        int incrementNum = arr.length / 2;
        while (incrementNum >= 1)
        {
            for (int i = 0; i < arr.length; i++)
            {
                //进行插入排序
                for (int j = i; j < arr.length - incrementNum; j = j + incrementNum)
                {
                    if (arr[j] > arr[j + incrementNum])
                    {
                        int temp = arr[j];
                        arr[j] = arr[j + incrementNum];
                        arr[j + incrementNum] = temp;
                    }
                }
            }

            //设置新的增量
            incrementNum = incrementNum / 2;
        }
    }

    public static void main(String[] args)
    {
        int a[]={2,1,3,6,8,9,7,10,4,5};
        shellSort(a);
        System.out.println(Arrays.toString(a));
    }

}
