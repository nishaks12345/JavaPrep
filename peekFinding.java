package com.prep;

public class peekFinding
{
    public static void main(String args[])
    {
        int[] arr = {1, 3, 20, 4, 1, 0};
        System.out.println("The peak element is: " + findPeak(arr));
    }
    public static  int findPeak(int[] priceArr)
    {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        if(priceArr == null || priceArr.length == 0)
        {
            return 0;
        }
        else
        {
            for(int price : priceArr )
            {
                if(price<minPrice)
                {
                    minPrice=price;
                }
                else if(price-minPrice>maxProfit)
                {
                    maxProfit=price-minPrice;
                }
            }
        }
        return maxProfit;
    }
}
