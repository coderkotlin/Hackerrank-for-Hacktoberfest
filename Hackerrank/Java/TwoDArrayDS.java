import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TwoDArrayDS {
    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */
    static int hourglassSum(int[][] arr) {
        int sum = -63;
  /*      00, 01, 02        01 02 03
              11               12
          20, 21, 22        21 22 23
   */
        int[] indexes1 = {0, 1, 2};
        int[] indexes2 = {1};
        int[] indexes3 = {0, 1, 2};

        int tmpSum;

        for (int j = 0; j <= 3; j++) {
            for (int i = 0; i <= 3; i++) {
                tmpSum = arr[j][i + indexes1[0]] + arr[j][i + indexes1[1]] + arr[j][i + indexes1[2]]
                        + arr[j + 1][i + indexes2[0]]
                        + arr[j + 2][i + indexes3[0]] + arr[j + 2][i + indexes3[1]] + arr[j + 2][i + indexes3[2]];
                sum = Math.max(tmpSum, sum);
            }
        }

        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
