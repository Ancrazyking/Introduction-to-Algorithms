package com.afeng.sort;

/**
 * @author afeng
 * @date 2018/9/23 16:43
 **/
public class MergeSort
{
    /**
     * @param arr   要排序的数组
     * @param start
     * @param end
     */
    public static void mergeSort(int arr[], int start, int end)
    {
        if (start >= end)
        {
            return;
        }
        int mid = (start + end) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);


        int copyArr[] = new int[end - start + 1];//创建一个要处理的数组副本
        for (int i = start; i <= end; i++)
        {
            copyArr[i - start] = copyArr[start];
        }

        int i = start, j = mid + 1;
        for (int k = start; k <= end; k++)
        {
            if (i > mid)
            {
                arr[k] = copyArr[j - 1];
                j++;
            } else if (j > end)
            {
                arr[k] = copyArr[i - 1];
                i++;
            } else if (copyArr[i - 1] > copyArr[j - 1])
            {
                arr[k] = copyArr[i - 1];
                i++;
            } else
            {
                arr[k] = copyArr[j - 1];
            }
        }
    }

    public static void main(String[] args)
    {
        int arr[]={5, 2, 8, 9, 3, 6, 10, 7, 1, 4};
        mergeSort(arr,0,9);
        System.out.println(arr);
    }

}
