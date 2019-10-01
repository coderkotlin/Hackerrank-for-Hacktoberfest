/**
 * https://www.hackerrank.com/challenges/simple-array-sum/problem
 */

 import java.io.*;
 import java.util.*;

 public class SimpleArraySum {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int input = scanner.nextInt();
         int total = 0;
         for (int a = 1; a <= input; a++) {
             total += scanner.nextInt();
         }
         System.out.println(total);
     }
 }