package com.afeng.sort;

import java.util.Arrays;

/**
 * 冒泡排序:
 * a.比较相邻的元素,如果第一个比第二个大,就交换.
 * b.对每一个对元素进行比较,会得到最后的元素为最大的数.
 *
 * @author afeng
 * @date 2018/10/7 20:29
 **/
public class BubbleSort
{
    public static void bubbleSort(int arr[])
    {
        int i, j, temp;
        //每一次外循环后,得到的有序数(元素)都在最后
        for (i = 0; i < arr.length - 1; i++)
        {

            for (j = 0; j < arr.length - 1 - i; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    public static void main(String[] args)
    {

        int arr[] = {5, 2, 8, 9, 3, 6, 10, 7, 1, 4};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }


}
