package programmers.lv3.binaryTree;

import java.util.ArrayList;

public class BinaryTree {
    public static int solution(long[] numbers) {
        int answer = 0;

        for(long number : numbers) {
            byte byteNumber = (byte) number;

            System.out.println(Long.toBinaryString(number));
        }
        return answer;
    }

    private boolean isMakeBinaryTree(byte[] byteNumber) {
        return true;
    }
}
