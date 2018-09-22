package com.afeng.sort;

import java.util.Arrays;

/**
 * @author afeng
 * @date 2018/9/22 21:17
 **/
public class InserSort
{
    /**
     * 插入排序
     *
     * @param arr
     */
    public static void insertSort(int arr[])
    {
        int i, j;
        int insertNum;
        for (i = 1; i < arr.length; i++)
        {
            /**
             * insertNum是每次要排序的数
             * 共有n个数,则要排n-1次(外循环)
             */
            insertNum = arr[i];
            j = i - 1;
            while (j >= 0 && insertNum < arr[j])
            {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = insertNum;
        }
    }


    public static void main(String[] args)
    {
        int a[] = {5, 2, 8, 9, 3, 6, 10, 7, 1, 4};
        insertSort(a);
        System.out.println(Arrays.toString(a));
    }


}
