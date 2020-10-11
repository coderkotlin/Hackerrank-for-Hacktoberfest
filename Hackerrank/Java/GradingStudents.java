import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GradingStudents {

    static int[] solve(int[] grades){
        // Complete this function
        int[] output = new int[grades.length];
        for(int a = 0; a < grades.length; a++) {
            int multipleFive = grades[a] / 5 + 1;
            int difference = Math.abs(grades[a] - (5 * multipleFive));
            if(grades[a] < 38) {
                output[a] = grades[a];
            } else if(difference < 3) {
                output[a] = grades[a] + difference;
            } else {
                output[a] = grades[a];
            }            
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }
}