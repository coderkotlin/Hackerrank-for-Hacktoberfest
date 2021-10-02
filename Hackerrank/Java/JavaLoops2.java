import java.util.Scanner;

class JavaLoops2 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int output = a;
            for (int j = 0; j < n; j++) {
                output += Math.pow(2, j) * b;
                System.out.print(output + ((j == n - 1) ? "\n" : " "));
            }
        }
        in.close();
    }
}
