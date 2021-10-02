import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            //Complete this line
            String formatWord = String.format("%-15s", s1);
            String formatNumber = String.format("%03d", x);
            System.out.println(formatWord + "" + formatNumber);
        }
        System.out.println("================================");

    }
}



