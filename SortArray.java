package com.prep;

public class SortArray {
    public static void main(String[] args) {
//defining an array of integer type
        int[] a = new int[]{90, 23, 5, 109, 12, 22, 67, 34};
        int tmp=0;
        for(int i=0;i< a.length-1;i++)
        {
            for(int j=i+1;j< a.length;j++)
            {
                if(a[i]>a[j])
                {
                    tmp=a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }
            }
        }
        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }

    }
}