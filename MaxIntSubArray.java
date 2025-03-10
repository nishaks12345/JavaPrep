package com.prep;

// Java program to find the maximum for each
// and every contiguous subarray of size K
import java.util.*;

class MaxIntSubArray
{

    //Given an integer array nums, find the
    //subarray
    // with the largest sum, and return its sum.
    static int  printKMaxAlgo(int a[], int n, int k) // { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    {
    int currentMax = a[0];
    int max = a[0];
        for (int i = 0; i < n; i++)
        {
            currentMax = Math.max(a[i],currentMax+a[i]);
            if(currentMax>max)
            {
                max= currentMax;
            }
        }
        return max;
    }



    // Function to find the maximum for each
    // and every contiguous subarray of size k
    static void printKMax(int a[], int n, int k)
    {

        // If k = 1, print all elements
        if (k == 1) {
            for (int i = 0; i < n; i += 1)
                System.out.print(a[i] + " ");
            return;
        }

        // left[i] stores the maximum value to left of i in the current block
        // right[i] stores the maximum value to the right of i in the current block
        int left[] = new int[n];
        int right[] = new int[n];

        for (int i = 0; i < n; i++)
        {

            // if the element is starting element of that block
            if (i % k == 0)
                left[i] = a[i];
            else
                left[i] = Math.max(left[i - 1], a[i]);

            //System.out.println(left[i] + " left &  right " +right[i]);
            // if the element is ending element of that block
            if ((n - i) % k == 0 || i == 0)
                right[n - 1 - i] = a[n - 1 - i];
            else
                right[n - 1 - i] = Math.max(right[n - i], a[n - 1 - i]);
        }

        for (int i = 0, j = k - 1; j < n; i++, j++)
            System.out.println(Math.max(left[j], right[i]) + " ");
    }

    // Driver Code
    public static void main(String[] args)
    {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int n = a.length;
        int K = 2;

        printKMax(a, n, K);
        System.out.println("max sum -> "+printKMaxAlgo(a, n, K));
    }
}

// This code is contributed by gauravrajput1