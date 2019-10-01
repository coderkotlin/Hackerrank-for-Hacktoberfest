/**
 * https://www.hackerrank.com/challenges/plus-minus/problem
 */

import java.io.*;
import java.util.*;

public class PlusMinus {
    public static void main(String[] args) {
        try {
            BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
            int input = Integer.parseInt(buff.readLine());
            String strValue = buff.readLine();
            String[] value = strValue.split(" ");
            int countPositive = 0;
            int countNegative = 0;
            int countZero = 0;
            for (int a = 0; a < value.length; a++) {
                int temp = Integer.parseInt(value[a]);
                if (temp == 0) {
                    countZero++;
                } else if (temp > 0) {
                    countPositive++;
                } else if (temp < 0) {
                    countNegative++;
                }
            }
            double resultPositive = (double) countPositive / value.length;
            double resultNegative = (double) countNegative / value.length;
            double resultZero = (double) countZero / value.length;
            System.out.println(resultPositive);
            System.out.println(resultNegative);
            System.out.println(resultZero);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}