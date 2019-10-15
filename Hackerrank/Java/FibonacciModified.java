/**
https://www.hackerrank.com/challenges/fibonacci-modified/problem
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FibonacciModified {

    
    static BigInteger fibonacciModified(int t1, int t2, int n) {

        BigInteger xBig = new BigInteger("0");

        if(n == 1) {
            return xBig.add(BigInteger.valueOf(t1));
        } else if(n == 2) {
            return xBig.add(BigInteger.valueOf(t2));
        } else {

            BigInteger t1Big = new BigInteger(Integer.toString(t1));
            BigInteger t2Big = new BigInteger(Integer.toString(t2));

            for (int i = 2; i < n; i++) {
                xBig = t1Big.add((t2Big.multiply(t2Big)));
                t1Big = t2Big;
                t2Big = xBig;
            }
            return xBig;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] t1T2n = scanner.nextLine().split(" ");

        int t1 = Integer.parseInt(t1T2n[0]);

        int t2 = Integer.parseInt(t1T2n[1]);

        int n = Integer.parseInt(t1T2n[2]);

        BigInteger result = fibonacciModified(t1, t2, n);
         
        bufferedWriter.write(String.valueOf(result.toString()));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}