package com.prep;

import java.util.Arrays;

public class BubbleSort
{
    public static void main(String ars[])
    {

        int[] nums = { 9,4,7,1,8,1, 2, 3 };
        System.out.println("input"+ Arrays.toString(nums));
        int n=nums.length;
        for(int i=1;i<n;i++)
        {
            int key = nums[i];
            int j= i-1;

            while(j>=0 && nums[j]>key)
            {
                nums[j+1] = nums[j];
                j=j-1;
            }
            nums[j+1] = key;
        }
        System.out.println("output"+ Arrays.toString(nums));

    }
    public void insertionSort()
    {
        int[] nums = { 9,4,7,1,8,1, 2, 3 };
        System.out.println("input"+ Arrays.toString(nums));
        int n=nums.length;
        for(int i=1;i<n;i++)
        {
            int key = nums[i];
            int j= i-1;

            while(j>=0 && nums[j]>key)
            {
                nums[j+1] = nums[j];
                j=j-1;
            }
            nums[j+1] = key;
        }
        System.out.println("output"+ Arrays.toString(nums));
    }
    public void selectSort()
    {

        int[] nums = { 9,4,7,1,8,1, 2, 3 };
        System.out.println("input"+ Arrays.toString(nums));
        int n=nums.length; int minIndex=0;
        for(int i=0;i<n-1;i++)
        {
            minIndex=i;
            for(int j=minIndex+1;j<n;j++)
            {
                if(nums[j]<nums[minIndex])
                {
                    minIndex=j;
                }
            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
        System.out.println("output"+ Arrays.toString(nums));

    }
    public void bubbleSort()
    {
        int[] nums = { 9,4,7,1,8,1, 2, 3 };
        System.out.println("input"+ Arrays.toString(nums));

        int n = nums.length;
        for(int i=n-1;i>1;i--)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[j]>nums[j+1])
                {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
            {

            }
        }
        System.out.println("output"+ Arrays.toString(nums));
    }
}
