/**
 * https://www.hackerrank.com/challenges/compare-the-triplets/problem
 */

 import java.io.*;
 import java.util.*;
 import java.text.*;
 import java.math.*;
 import java.util.regex.*;

 public class CompareTheTriplets {
     static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
         int[] a = new int[]{a0, a1, a2};
         int[] b = new int[]{b0, b1, b2};
         int aliceCount = 0;
         int bobCount = 0;
         for (int c = 0; c < 3; c++) {
             if (a[c] > b[c]) {
                 aliceCount += 1;
             } else if (a[c] < b[c]) {
                 bobCount += 1;
             }
         }
         return new int[]{aliceCount, bobCount};
     }

     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int a0 = in.nextInt();
         int a1 = in.nextInt();
         int a2 = in.nextInt();
         int b0 = in.nextInt();
         int b1 = in.nextInt();
         int b2 = in.nextInt();
         int[] result = solve(a0, a1, a2, b0, b1, b2);
         String separator = "", delimiter = " ";
         for (Integer value : result) {
             System.out.print(value + " ");
         }
     }
 }