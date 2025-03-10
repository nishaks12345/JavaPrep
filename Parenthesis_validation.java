package com.prep;

import java.util.Stack;

public class Parenthesis_validation
{

        //Function to check if brackets are balanced or not.
        static boolean ispar(String x)
        {
            Stack<Character> stk = new Stack<Character>();
            for(int i=0;i<x.length(); i++)
            {
                char c = x.charAt(i);
                if(c =='{' || c =='(' || c=='[')
                {
                    stk.push(c);
                }
                else if((!stk.empty() ) && (c == '}') && (stk.peek() == '{'))
                {
                    stk.pop();
                }
                else if(!(stk.empty()) && (c==']') && (stk.peek()=='['))
                {
                    stk.pop();
                }else if(!(stk.empty()) && (c==')') && (stk.peek()=='('))
                {
                    stk.pop();
                }
                else{return false;}
            }

            return stk.empty();

        }

    public static void main(String args[])

    {
        String s = "{([])}";
        if(ispar(s))
        {
            System.out.println("Balanced");
        }
        else
        {
            System.out.println("Not Balanced");
        }
    }
}
