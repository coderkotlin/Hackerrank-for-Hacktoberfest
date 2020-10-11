import java.io.*;
import java.util.*;

public class TimeConversion {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try {
            BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
            String input = buff.readLine();
            String[] time = input.split(":");
            String formatTime = time[2].substring(2, 4);
            String output = "";
            if(formatTime.equalsIgnoreCase("PM")) {
                if(time[0].equals("12")) {
                    output += "12:";
                } else {                                    
                    output += (24 / 2) + Integer.parseInt(time[0]) + ":";                    
                }
            } else {
                if(time[0].equals("12")) {                                    
                    output += "00:";
                } else {
                    output += time[0] + ":";
                }
            }
            output += time[1] + ":" + time[2].substring(0, 2);
            System.out.println(output);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}