package com.prep;

public class Factorial 
{
	public static void main(String args[])
	{
		int in=5; 
		System.out.println("output - "+factorial(in));
	}

	private static int factorial(int n) {
	if(n==1)
	{
		System.out.println("-"+n);
		return 1;
	}
	else
	{
		System.out.println("---"+n);

		n=n*factorial(n-1);
	}
	return n;
	}

}
