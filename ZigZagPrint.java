package com.prep;

public class ZigZagPrint
{
    public static void main(String[] args) {
        double arr[] ={1.0, -9.5, 2, 3, 5.4, 6, 7};
        //-9.5, 1.0, 2.0, 3.0, 5.4, 6.0, 7.0
        //-9.5,1.0,3.0,2.0,5.4,7.0,6.0

        for (int i = 0; i < arr.length-1; i++)
        {
            double tmp=0;
            if(arr[i]>arr[i+1])
            {
                tmp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = tmp;
            }
        }
        for (int j = 1; j < arr.length-1; j=j+1)
        {
            System.out.println("---arr[j] = " + arr[j]);
            double tmp1 = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = tmp1;
        }
        for (int k = 0; k < arr.length; k++)
        {
            System.out.println("arr[k] = " + arr[k]);

        }
    }
}
