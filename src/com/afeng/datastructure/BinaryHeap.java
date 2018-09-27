package com.afeng.datastructure;

import java.util.Arrays;

/**
 * 二叉堆,数组实现的类似于完全二叉树
 * 实现最小堆,min_heap
 * <p>
 * 二叉堆是一个很有用的数据结构,可以用来实现堆排序或优先级队列
 *
 * @author afeng
 * @date 2018/9/25 9:13
 **/
public class BinaryHeap
{
    /**
     * 上浮调整,插入结点
     * 与父节点比较,满足规则则上浮
     * @param array 待调整的堆
     */
    public static void upAdjust(int[] array)
    {
        int childIndex = array.length - 1;
        int parentIndex = (childIndex - 1) / 2;
        //temp用来保存插入的叶子节点的值,用于最后的赋值
        int temp = array[childIndex];
        while (childIndex > 0 && temp < array[parentIndex])
        {
            array[childIndex] = array[parentIndex];
            childIndex = parentIndex;
            parentIndex = (parentIndex - 1) / 2;
        }
        array[childIndex] = temp;
    }

    /**
     * 下沉调整,用于删除节点
     *
     * @param array       待调整的堆
     * @param parentIndex 要下沉的父节点
     * @param length      堆的有效大小
     */
    public static void downAdjust(int array[], int parentIndex, int length)
    {
        //temp保存父节点的值,用于最好的赋值
        int temp = array[parentIndex];
        int childIndex = 2 * parentIndex + 1;//左孩子节点索引
        while (childIndex < length)
        {
            /**
             * 如果有右孩子,且右孩子的值小于左孩子的值,则定位到右孩子
             */
            if (childIndex + 1 < length && array[childIndex + 1] < array[childIndex])
            {
                childIndex++;
            }
            /**
             * 如果父节点的值小于任何一个孩子的值,直接跳出
             */
            if (temp < array[childIndex])
                break;
            array[parentIndex] = array[childIndex];
            parentIndex = childIndex;
            childIndex = 2 * childIndex + 1;
        }
        array[parentIndex] = temp;
    }

    /**
     * 构建堆
     *
     * @param array 待调整的堆
     */
    public static void buildBHeap(int array[])
    {
        for (int i = array.length / 2; i >= 0; i--)
        {
            downAdjust(array, i, array.length - 1);
        }
    }

    public static void main(String[] args)
    {
        int array[] = {1, 3, 2, 6, 5, 7, 8, 9, 10, 0};
        upAdjust(array);
        System.out.println(Arrays.toString(array));

        array = new int[]{7, 1, 3, 10, 5, 2, 8, 9, 6};
        buildBHeap(array);
        System.out.println(Arrays.toString(array));
    }
}
