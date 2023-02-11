package backjun.numberSort_2750;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NumberSort {
    public static void solution() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(bf.readLine());
        int[] numbers = new int[size];

        for(int i=0; i<size; i++) {
            numbers[i] = Integer.parseInt(bf.readLine());
        }

        numbers = Arrays.stream(numbers).sorted().toArray();
        for(var number : numbers) {
            System.out.println(number);
        }
    }

}
