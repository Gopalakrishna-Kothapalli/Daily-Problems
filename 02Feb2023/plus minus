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

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    Scanner scan = new Scanner(System.in);
    int len=arr.size();
    double pos=0;
    double neg=0;
    double zero=0;
    for(int i=0;i<len;i++){
        if(arr.get(i)>0){
            pos=pos+1;
        }
        else if(arr.get(i)<0){
            neg=neg+1;
        }
        else{
            zero=zero+1;
        }
    }
       System.out.printf("%.6f%n",pos/len);
       System.out.printf("%.6f%n",neg/len);
       System.out.printf("%.6f%n",zero/len);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
