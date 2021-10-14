//https://www.hackerrank.com/challenges/new-year-chaos

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) 
    {
        int count=0;
        int a[]= new int[q.length];
        for(int i=0;i<q.length;i++)
        {
            a[i]=i+1;
        }
        for(int i=0;i<q.length;i++)
        {
            if(a[i]!=q[i])
            {
                if(q[i]>(i+3))
                {
                    count=-1;
                    break;
                }
                else if(q[i]==(i+3))
                {
                    count+=2;
                    int t=a[i],y=a[i+1];
                    a[i]=a[i+2];
                    a[i+1]=t;
                    a[i+2]=y;
                }
                else
                {
                    count+=1;
                    int t=a[i];
                    a[i]=a[i+1];
                    a[i+1]=t;
                }
                
            }
        }
        if(count==(-1))
            System.out.println("Too chaotic");
        else
            System.out.println(count);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
