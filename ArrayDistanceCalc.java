package com.prep;

import java.util.Arrays;
import java.util.Collections;

public class ArrayDistanceCalc
{
	
	public static void main(String args[])
	{
	int length = 5; 
	int k= 3;//how many numbers to sum up
	int x=10; //distance from which elemtn
	int sum=0;
	int[] arr = {1, 15, 20, 5, 12,30};
	int[] distanceArr = new int[arr.length];
	
	for(int i=0;i<arr.length;i++)
	{
		distanceArr[i]=Math.abs(x-arr[i]); //o(n)
	}
	
	System.out.println(Arrays.toString(distanceArr));
	int[] distanceArrcpy = distanceArr.clone();
	
	Arrays.sort(distanceArrcpy);
	System.out.println(Arrays.toString(distanceArrcpy));
	int count=distanceArrcpy.length-k;
	for(int i=count;i<distanceArrcpy.length;i++)
	{
		System.out.println(arr[i] +"-arr[i]"); //o(n)
		sum=sum+arr[i];
	}
	System.out.println(sum);
	
	}

}
