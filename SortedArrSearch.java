package com.prep;

public class SortedArrSearch
{

    public static void main(String[] args)
    {
        int[] arr1 = { 4, 5, 6, 7, 0, 1, 2 };
        int target1 = 0;
        int result1 = search(arr1, target1);
        System.out.println(result1); // Output: 4

        int[] arr2 = { 4, 5, 6, 7, 0, 1, 2 };
        int target2 = 3;
        int result2 = search(arr2, target2);
        System.out.println(result2); // Output: -1

        int[] arr3 = { 3,1 };
         target2 = 3;
         result2 = search(arr3, target2);
        System.out.println(result2); // Output: -1

        int[] arr4 = { 5,1,2,3,4};
         target2 = 3;
         result2 = search(arr4, target2);
        System.out.println(result2); // Output: -1
    }

    private static int search(int[] arr, int target)
    {
        int left = 0;
        int right = arr.length - 1;
        int mid = 0;
        while(left<=right)
        {
            mid = left + (right-left)/2;
            if(arr[mid] == target)
            {
                return mid;
            }
            if(arr[left]<arr[mid]) // first half is sorted
            {
                if(target>=arr[left] && target<arr[mid])
                {
                    right = mid-1;
                }
                else
                {
                    left = mid+1;
                }
            }
            else // second half is sorted
            {
                if(target>arr[mid] && target<=arr[right])
                {
                    left = mid+1;
                }
                else
                {
                    right = mid-1;
                }
            }
        }
        return -1;
    }

}


