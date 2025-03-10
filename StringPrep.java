package com.prep;

import java.util.HashMap;

public class StringPrep
{
    public static boolean areOccurrencesEqual(String s)
    {
        HashMap<Character,Integer> hmp = new HashMap();
        for(char c : s.toCharArray())
        {
            hmp.put(c,hmp.getOrDefault(c,0)+1);
        }
        int count = hmp.get(s.charAt(0));
        for(char c : hmp.keySet())
        {
            if(hmp.get(c)!=count)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        String s = "aabbccdd";

            System.out.println(""+areOccurrencesEqual(s));

    }
}
