import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.*;
import java.util.stream.*;

class Result {

    /*
     * Complete the 'sockMerchant' function below.
     * https://www.hackerrank.com/challenges/sock-merchant/problem
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        Map<Integer, Long> counted = ar.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        AtomicInteger pairs = new AtomicInteger();
        counted.forEach((k, v) -> {
            if (v.intValue() / 2 >= 1) {
                pairs.getAndAdd(v.intValue() / 2);
            }
        });
        return pairs.get();
    }

}

public class SockMerchant {
    public static void main(String[] args) throws IOException {
        int n = 9;
        List<Integer> ar = List.of(10, 20, 20, 10, 10, 30, 50, 10, 20);
        int result = Result.sockMerchant(n, ar);
        System.out.println(result);
    }
}
