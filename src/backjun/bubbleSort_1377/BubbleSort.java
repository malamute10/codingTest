package backjun.bubbleSort_1377;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BubbleSort {
    public static void solution() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(bf.readLine());
        NumberIndex[] numbers = new NumberIndex[size];
        int maximum = 0;

        for(int i=0; i<size; i++) {
            numbers[i] = new NumberIndex(i, Integer.parseInt(bf.readLine()));
        }

        Arrays.sort(numbers);

        for(int i=0; i<size; i++) {
            int distance = numbers[i].index - i;
            if(maximum < distance) {
                maximum = distance;
            }
        }
        System.out.println();
        System.out.println(maximum+1);
    }

    static class NumberIndex implements Comparable<NumberIndex> {

        int index;
        int value;

        NumberIndex(int index, int value) {
            this.index = index;
            this.value = value;
        }

        @Override
        public int compareTo(NumberIndex numberIndex) {
            return this.value - numberIndex.value;
        }
    }
}
