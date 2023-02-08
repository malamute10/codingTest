import backjun.absoluteHeap_11286.AbsoluteHeap;
import backjun.cardGame_2164.CardGame;
import backjun.rightLargeNumber_17298.RightLargeNumber;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        AbsoluteHeap.solution();
        long end = System.currentTimeMillis();
        System.out.println("time:" + (end-start) +"ms");
    }
}