package com.prep;

public class palindromeSubString {

            static String printSubStr(String str, int low, int high)
            {
                String x= "";
                for (int i = low; i <= high; ++i)
                    x = x+(str.charAt(i));

                return x;
            }

            public static String longestPalindrome(String s) //saacaasfdfdsf3r34rergfd
            {
                // Get length of input String
                int n = s.length();

                // All subStrings of length 1
                // are palindromes
                int maxLength = 1, start = 0;

                for(int i=0;i<s.length();i++) //s
                {
                    for(int j=i;j<s.length();j++) //s
                    {
                        int flag=1;

                        // Check palindrome
                        for (int k = 0; k < (j - i + 1) / 2; k++) {
                            if (s.charAt(i + k) != s.charAt(j - k)) {
                                flag = 0;
                            }
                        }
                        // Palindrome
                        if (flag != 0 && (j - i + 1) > maxLength) {
                            start = i;
                            maxLength = j - i + 1;
                        }
                    }
                }

                System.out.print("Longest palindrome substring is: ");
                String cc=  printSubStr(s, start, start + maxLength - 1);

                // Return length of LPS
                return cc;
            }
            public static void main(String args[])
            {
//                String x= longestPalindrome("saacaasfdfdsf3r34rergfd");
//                System.out.println(x);
                
                String xx = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"
                		+ "<OrdSubmtDTCFnclMstr xmlns=\"http://xmlns.int.nike.com/orders/xsd/v1\">\n"
                		+ "    <OrdSubmtDTCFnclHdr/>\n"
                		+ "</OrdSubmtDTCFnclMstr>\n"
                		+ "";
                xx.substring(13, -1);
            }



}
/*
* Complexity Analysis:

Time complexity: O(N3). Three nested loops are needed to find the longest palindromic substring in this approach.
Auxiliary/Space complexity: O(1). As no extra space is needed.
*/