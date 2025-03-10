package com.prep;

public class MaximumSubarray
{
    public int maxSubArray(int[] nums) //[-2,1,-3,4,-1,2,1,-5,4]
    {
        int res=nums[0]; //[-2]
        for(int i=0;i<nums.length;i++)
        {
            int currentSum = 0;
            for(int j=i;j<nums.length;j++)
            {
                currentSum = currentSum+nums[j];
                res=Math.max(res,currentSum);
            }
        }
        System.out.println(res);
        return res;
    }
     public static void main(String[] args)
    {
        MaximumSubarray obj = new MaximumSubarray();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        obj.maxSubArray(nums);
    }}
