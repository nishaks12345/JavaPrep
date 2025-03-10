package com.prep;

public class MissingArray {
    public static int missingNumber(int n, int[] arr)
    {
        // Create hash array of size n+1
        int[] hash = new int[n + 1];

        // Store frequencies of elements
        //hash[000000] - [011101]
        for (int i = 0; i < n - 1; i++) {
            hash[arr[i]]++;//hash[1]
        }

        // Find the missing number
        for (int i = 1; i <= n; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }

        // Edge case handling (though problem guarantees a
        // solution)
        return -1;
    }

    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 3, 5 };
        int n = 5;
        System.out.println(missingNumber(n, arr));
    }
}
