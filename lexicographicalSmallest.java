package com.prep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class lexicographicalSmallest 
{
	//find the smallest alphabetically ordered string
	/* Problem Statement  :

Given a string, obtain the alphabetically smallest string possible by swapping either
adjacent ‘a’ and ‘b’ characters or adjacent ‘b’ and ‘c’ characters, any number of times.

Note: A string x is alphabetically smaller
than a string y if, for the first index i where x
and y differs, x[i] <y[i].

Example :
s=”abaacbac”

The alphabetically smallest possible string is
obtained by applying the following
operations:

‘c’at index 5 is swapped with ‘b’at index 6. So “abaacbac” becomes “abaabcac”
Then,’b’at index 2 is swapped with ‘a’at index 3. So “abaabcac” becomes “aababcac”.
Finally, ‘b’at index 3 is swapped with ‘a’at index 4 to obtain the final.
answer:  “aaabbcac”.

Function Description :
Complete the function smallestString in the
editor below.

smallestString has the following
parameter(s):

string s: the given string
Returns:
string: the lexicographically smallest string obtained after swapping

Constraints :

1 <_ length of s<_ 10^5 s only contains the characters ‘a’, ‘b’, and ‘c’.*/
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//abaacbac
		String input = br.readLine();
		input = "abaacbac";
		
		System.out.println("input - "+input);	
		System.out.println("output - "+convert(input));	
	    }
		
	
	
	private static String convert(String input) 
	{
		char[] arr= input.toCharArray();
		int n= arr.length;
		int count=0;
		for (int i = 0; i < arr.length; i++)
		{
			count=0;
			for (int j = 0; j < arr.length - 1; j++) 
			{
				if ((arr[j] - arr[j + 1]) == 1) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count++;
                }
			}
			
			if(count==0)
			{
				break;
			}
		}
		return Arrays.toString(arr);
		
		
	}


}
