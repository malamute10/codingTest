import backjun.atm.ATM;
import backjun.kthNumber_11004.KthNumber;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        KthNumber.solution();
        long end = System.currentTimeMillis();
        System.out.println("time:" + (end-start) +"ms");
    }
}