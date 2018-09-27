package com.afeng.datastructure.complexitydemoanalysis;

/**
 * @author afeng
 * @date 2018/9/26 9:21
 **/
public class timecomplexity
{
    public int cal(int n)
    {
        int sum = 0;
        int i = 1;
        for (; i <= n; i++)
        {
            sum = sum + i;
        }
        return sum;
    }


}
