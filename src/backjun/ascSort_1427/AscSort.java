package backjun.ascSort_1427;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AscSort {
    public static void solution() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String numberString = bf.readLine();

        String[] strings = numberString.split("");
        int[] numbers = new int[numberString.length()];
        for(int i=0; i<strings.length; i++) {
            numbers[i] = Integer.parseInt(strings[i]);
        }

        for(int i=0; i<numbers.length; i++) {
            int maximum = numbers[i];
            int maximumIndex = i;
            for(int j = i+1; j<numbers.length; j++){
                if(numbers[j] > maximum) {
                    maximum = numbers[j];
                    maximumIndex = j;
                }
            }
            numbers[maximumIndex] = numbers[i];
            numbers[i] = maximum;
        }

        for(var number : numbers) {
            System.out.print(number);
        }
    }
}
