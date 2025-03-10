package com.prep;

public class SearchIn2dArray
{
    /*Search a 2D Matrix
        Medium
        Topics
        Companies
        You are given an m x n integer matrix matrix with the following two properties:

        Each row is sorted in non-decreasing order.
        The first integer of each row is greater than the last integer of the previous row.
        Given an integer target, return true if target is in matrix or false otherwise.

        You must write a solution in O(log(m * n)) time complexity.*/
    static boolean  targetExist(int[][] matrix, int target)
    {

        int i= 0;
        System.out.println("matrix.length - "+matrix.length);
        int j = matrix.length-1;
        while(i < matrix.length && j>=0) {
            if (target == matrix[i][j]) {
                return true;
            } else if (target < matrix[i][j]) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
    public static boolean searchMatrix(int[][] matrix, int target)
    {

        int i= 0;
        //System.out.println("matrix.length - "+matrix.length);//[[1,3,5,7],[10,11,16,20],[23,30,34,60]]

        int j = matrix.length-1;


        for(int k=0;k<matrix.length;k++)
        {
            for(int p=0;p<matrix[k].length;p++)
            {
                // System.out.println("matrix[k][p] -> "+matrix[k][p]);
                if(target == matrix[k][p])
                {
                    return true;
                }
            }

        }
        return false;
    }
    // Driver code
    public static void main(String[] args)
    {
        int mat[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        // Function call
        System.out.println(searchMatrix(mat, 29));
        System.out.println(targetExist(mat, 29));

    }
}
