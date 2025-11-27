package interview;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Problem4 {
    public static void main(String[] args) {
        List<Integer> inputNumbers = Arrays.asList(1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30);
  
        Map<Integer, Integer> counts = new LinkedHashMap<>();

        for (int i = 1; i <= 9; i++) {
            int count = 0;
           
            for (int num : inputNumbers) {
                if (num % i == 0) {
                    count++;
                }
            }
            counts.put(i, count);
        }

        System.out.println("Input: " + inputNumbers);
        System.out.println("Output: " + counts);
    }
}