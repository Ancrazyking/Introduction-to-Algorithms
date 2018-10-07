package com.afeng.sort;

import java.util.Arrays;

/**
 * 插入排序:类似与斗地主看牌
 * 与选择排序类似,当前索引左边的所有元素都是有序的,
 * 但是由于要插入元素,它们的位置是不确定的.
 *
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
        int insertNum;//该变量用于保存要插入的元素的值
        for (i = 1; i < arr.length; i++)
        {
            insertNum = arr[i];//将a[i]赋给要插入的值
            j = i - 1;
            while (j >= 0 && insertNum < arr[j])
            {
                arr[j + 1] = arr[j];//元素后移
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
