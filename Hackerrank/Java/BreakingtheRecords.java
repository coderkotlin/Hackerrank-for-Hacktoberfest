import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static List<Integer> breakingRecords(List<Integer> scores) {
    int min = scores.get(0);
        int max = scores.get(0);
        int minCount = 0;
        int maxCount = 0;

        for(int i = 0; i < scores.size(); i++) {
            if(scores.get(i) > max) {
                max = scores.get(i);
                maxCount++;
            }
            else if(scores.get(i) < min) {
                min = scores.get(i);
                minCount++;
            }
        }
        List<Integer> finalScores =  new ArrayList<Integer>();
        finalScores.add(maxCount);
        finalScores.add(minCount);
        return finalScores;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.breakingRecords(scores);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}