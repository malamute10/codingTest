package backjun.absoluteHeap_11286;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class AbsoluteHeap {
    public static void solution() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(bf.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>((x, y) -> {
            int absX = Math.abs(x);
            int absY = Math.abs(y);

            if(absX == absY) {
                return x > y ? 1 : -1;
            } else {
                return absX - absY;
            }
        });

        for(int i=0; i<size; i++) {
            int number = Integer.parseInt(bf.readLine());
            if(number != 0) {
                queue.add(number);
            } else {
                if(!queue.isEmpty()) {
                    System.out.println(queue.poll());
                } else {
                    System.out.println("0");
                }
            }
        }
    }
}
