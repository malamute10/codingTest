package backjun.rightLargeNumber_17298;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class RightLargeNumber {

    public static void solution() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(bf.readLine());
        int[] numbers = new int[size];
        int[] answer = new int[size];
        Stack<Integer> stack = new Stack<>();

        String[] str = bf.readLine().split(" ");
        for (int i=0; i<size; i++) {
            numbers[i] = Integer.parseInt(str[i]);
        }

        stack.push(0);
        for(int i=1; i<size;  i++) {
            while(!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                answer[stack.pop()] = numbers[i];
            }
            stack.push(i);
        }

        while(!stack.isEmpty()) {
            answer[stack.pop()] = -1;
        }


        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<size; i++) {
            bw.write(answer[i] + " ");
        }
        bw.write("\n");
        bw.flush();
    }
}
