package com.prep;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String args[]) {
        String inputStr = "{dsad((asdsada))[s]}";
        System.out.println("\n"+isValidString(inputStr));

    }

    public static boolean isValidString(String inpStr) {
        boolean isValid = false;
        Stack<Character> charStack = new Stack<Character>();
        for (int i = 0; i < inpStr.length(); i++) {
            char ch = inpStr.charAt(i);
            if (ch == '[' || ch == '{' || ch == '(') {
                charStack.push(ch);
               // System.out.print("\n1. "+charStack.toString());
            } else if (!charStack.empty() && ch == ']' && charStack.peek() == '[') {
                charStack.pop();
            } else if (!charStack.empty() && ch == '}' && charStack.peek() == '{') {
                charStack.pop();
            } else if (!charStack.empty() && ch == ')' && charStack.peek() == '(') {
                charStack.pop();
            }
           // System.out.print("\n2. "+charStack.toString());

        }
        return charStack.isEmpty();

    }
}
