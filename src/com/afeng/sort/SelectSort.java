package com.afeng.sort;

import java.util.Arrays;

/**
 * 选择排序:
 * a.找出数组中最小的元素
 * b.将它和数组的第一个元素交换位置
 * c.在剩下的元素中找到最小的元素,与数组的第二个元素交换位置,以此类推
 *
 * @author afeng
 * @date 2018/10/6 18:03
 **/
public class SelectSort
{

    public static void selectSort(int a[])
    {
        //千万得记得min用于保存数组的下标
        int min, temp;
        for (int i = 0; i < a.length; i++)
        {
            min = i;
            for (int j = i + 1; j < a.length; j++)
            {
                if (a[j] < a[min])
                {
                    min = j;
                }
            }
            if (min != i)
            {
                temp = a[min];
                a[min] = a[i];
                a[i] = temp;
            }
        }
    }

    public static void main(String[] args)
    {
        int a[] = {3, 2, 5, 4};
        selectSort(a);
        System.out.println(Arrays.toString(a));
    }

}
