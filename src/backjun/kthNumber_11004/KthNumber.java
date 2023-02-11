package backjun.kthNumber_11004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class KthNumber {
    public static void solution() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = bf.readLine().split(" ");
        int count = Integer.parseInt(firstLine[0]);
        int index = Integer.parseInt(firstLine[1]);

        String[] SecondLine = bf.readLine().split(" ");

        int[] numbers = new int[count];
        for(int i=0; i<count; i++) {
            numbers[i] = Integer.parseInt(SecondLine[i]);
        }
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[index-1]);
    }
}
