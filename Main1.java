package com.prep;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 2;

        List<String> inputLines = new ArrayList<String>();
        inputLines.add(" sdasdas dhewqewqev 3");
        inputLines.add("sadsad sdasdas dsadsa dasrfs drewr ew 1");
        inputLines.add("sadsad sdasdas wdwqerwrewfdscd 2");
        inputLines.add("sad dh 4");
        //Collections.sort(inputLines);
        inputLines.sort(Comparator.comparingInt(String::length).reversed());
        for (int i=0;i<2;i++) {
            System.out.println((String)inputLines.get(i));
        }
//        PriorityQueue<String> queue = new PriorityQueue<>(N, Comparator.comparingInt(String::length));
//
//        while (scanner.hasNextLine()) {
//            String line = scanner.nextLine().trim();
//            if (!line.isEmpty()) {
//                queue.offer(line);
//                if (queue.size() > N) {
//                    queue.poll(); // remove the shortest line
//                }
//            }
//        }
//
//        List<String> longestLines = new ArrayList<>(queue);
//        longestLines.sort(Comparator.comparingInt(String::length).reversed());
//
//        for (String line : longestLines) {
//            System.out.println(line);
//        }
    }

//    public static void main(String[] args) {
//        int N = 10; // replace with your starting number
//        int M = 20; // replace with your ending number
//        int count = 0;
//
//        for (int i = N; i <= M; i++) {
//            if (isPrime(i)) {
//                count++;
//            }
//        }
//
//        System.out.println("The number of prime numbers between " + N + " and " + M + " is " + count);
//    }
//
//    public static boolean isPrime(int num) {
//        if (num <= 1) {
//            return false;
//        }
//        for (int i = 2;  i < num; i++)
//        {
//            if (num % i == 0) {
//                return false;
//            }
//        }
//        System.out.println("The number t " +num);
//        return true;
//    }
//    public static void main(String[] args) {
//
//       /* System.out.println("Return unique values from a list !!!");
//        int a[] = new int[] {1,2,3,2,5,4,1,6,7,8};
//        for(int i=0;i<a.length;i++)
//        {
//            int tmp = a[i];
//            if(tmp!=-1) {
//                System.out.println(tmp);
//                for (int j = i + 1; j < a.length - 1; j++) {
//                    if (tmp == a[j]) {
//                        a[j] = -1;
//                    }
//                }
//            }
//        }
//       // List<Integer> listWithoutDuplicates = new ArrayList<>(new HashSet<>(Arrays.asList(1,2,3,2,5,4,1,6,7,8)));
//        List<Integer> arr = new ArrayList<>(new HashSet<>(Arrays.asList(1,2,3,2,5,4,1,6,7,8)));
//        System.out.println(arr);*/
//
//        //reverse integer
////        Integer intgr = new Integer(1234567);
////        String str = intgr.toString();
////        for(int i =  str.length(); i>=1; i--)
////        {
////            System.out.println(intgr%10);
////            intgr=intgr/10;
////            str = intgr.toString();
////
////        }
//
//        //finding min and max in a list
//        int a[] = new int[] {1,2,3,2,5,4,1,6,7,8};
//        int min =a[0]; int max=a[0];
//
//        for(int i=0;i<a.length;i++)
//        {
//            if(a[i]<min)
//            {
//                min=a[i];
//            } else if (a[i]>max) {
//                max=a[i];
//            }
////            int tmp = a[i];
////            if(tmp!=-1) {
////                System.out.println(tmp);
////                for (int j = i + 1; j < a.length - 1; j++) {
////                    if (tmp == a[j]) {
////                        a[j] = -1;
////                    }
////                }
////            }
//        }
//        System.out.println(min + " " + max);
//    }
}