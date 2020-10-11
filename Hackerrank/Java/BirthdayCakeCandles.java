import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BirthdayCakeCandles {

    public static void main(String[] args) {
        try {
            BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
            int input = Integer.parseInt(buff.readLine());
            String strTemp = buff.readLine();
            String[] strValueArr = strTemp.split(" ");
            int max = 0;
            String strMax = "0";
            for(int a = 0; a < input; a++) {
                int maxTemp = Integer.parseInt(strValueArr[a]);
                if(max < maxTemp) {
                    max = maxTemp;
                    strMax = String.valueOf(max);
                }
            }
            int count = 0;
            for(int a = 0; a < input; a++) {
                if(strValueArr[a].equals(strMax)) {
                    count++;
                }
            }
            System.out.println(count);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}