import java.util.*;

public class JavaLoops1 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int a = 1; a <= 10; a++) {
            int output = n * a;
            System.out.println(n + " x " + a + " = " + output);
        }
    }
}