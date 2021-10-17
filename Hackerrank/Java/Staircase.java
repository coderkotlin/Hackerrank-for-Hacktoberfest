import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Staircase {
    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());
            stairCase(n);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        
    }
    static void stairCase(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < n; j++) {
                if((i+j)>=n){
                    System.out.print("#");
                }else{
                     System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
