import java.io.*;
import java.util.*;

public class DiagonalDifference {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try {
            BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
            int input = Integer.parseInt(buff.readLine());
            String[][] value = new String[input][input];
            for(int a = 0; a < input; a++) {
                String inputTemp = buff.readLine();
                String[] strArrayTemp = inputTemp.split(" ");
                for(int b = 0; b < strArrayTemp.length; b++) {
                    value[a][b] = strArrayTemp[b];
                }
            }
            int baris = 0;
            int kolom = 0;
            int diagonal1 = 0;
            for(int a = 0; a < input; a++) {
                diagonal1 += Integer.parseInt(value[baris][kolom]);
                baris += 1;
                kolom += 1;
            }
            int diagonal2 = 0;
            baris = 0;
            kolom = input-1;
            for(int a = 0; a < input; a++) {
                diagonal2 += Integer.parseInt(value[baris][kolom]);
                baris += 1;
                kolom -= 1;
            }
            int output = Math.abs(diagonal1 - diagonal2);
            System.out.println(output);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}