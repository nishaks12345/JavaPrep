package com.prep;

import java.util.HashSet;
import java.util.Set;

public class AnagramRecursion 
{
	public static void main(String args[])
	{
		Set<String> anagrams  = new HashSet<>();
		String newInput="cat";
		anagram("",newInput,anagrams);
		 // Print all anagrams
        for (String anagram : anagrams) {
            System.out.println("--"+anagram);
        }
	}

	private static void anagram(String prefix, String newInput, Set<String> anagrams) 
	{
		if(newInput.isEmpty())
		
		{
			anagrams.add(prefix);
		}
		else
		{
			for(int i=0;i<newInput.length();i++)
			{
				char currentChar=newInput.charAt(i);//c
				String newPrefix = prefix+currentChar;
				String newInputr = newInput.substring(0,i)+newInput.substring(i+1);
				anagram(newPrefix, newInputr, anagrams) ;
				
			}
		}
	}

}
