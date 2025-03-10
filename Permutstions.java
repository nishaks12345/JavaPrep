package com.prep;

import java.util.ArrayList;
import java.util.List;

public class Permutstions
{
    //Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.

    static ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();

    public static List<List<Integer>> permute(int[] nums, int l, int h)
    {
        ArrayList<Integer> intLis = new ArrayList<Integer>();
        if(l==h)
        {
            for (int i = 0; i < nums.length; i++)
            { intLis.add(new Integer(nums[i]));}
            res.add(intLis);
            return res;
        }
        for(int i=l;i<nums.length;i++)
        {
            swap(nums,l,i);
            permute(nums, l + 1, h);
            swap(nums,l,i);
        }
        return res;
    }
    // Function for swapping two numbers
    static void swap(int nums[], int l, int i)
    {
        int temp = nums[l];
        nums[l] = nums[i];
        nums[i] = temp;
    }
    // Driver Code
     public static void main(String[] args)
     {
         int[] nums = { 1, 2, 3 };
         int h = nums.length-1;
         int l=0;
         List<List<Integer>> re = permute(nums, l, h);

         for(List<Integer> intarr: re )
         {
             System.out.print( "\n");
             for(Integer x: intarr)
             {
                 System.out.print(x + " , ");
             }
         }
         // printing result
//         for (ArrayList x : re) {
//             for (Integer y : x)
//             {
//                 System.out.print(y + " ");
//             }
//             System.out.println();
        // }
     }
}
