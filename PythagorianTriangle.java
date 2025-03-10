package com.prep;

public class PythagorianTriangle 
{
public static void main(String args[])
{
	int in=10; int tmp=0;
	System.out.println("output - "+triangle(in));
}

private static int triangle(int n) {
if(n==1)
{
	System.out.println("-"+n);
	return 1;
}
else
{
	System.out.println("---"+n);

	n=n+triangle(n-1);
}
return n;
}
}
