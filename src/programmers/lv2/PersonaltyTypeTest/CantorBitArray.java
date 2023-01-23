package programmers.lv2.PersonaltyTypeTest;

import java.util.Arrays;

public class CantorBitArray {
    public static int solution(int n, long l, long r) {

        String cantorBitArray = "11011";
        StringBuilder sb = new StringBuilder("11011");
        System.out.printf("%d : %s \n", 1, sb);

        int beginIndex = (int) (l / Math.pow(5, n - 1));
        int endIndex = (int) (r / Math.pow(5, n - 1)+1);

        cantorBitArray = cantorBitArray.substring(beginIndex, endIndex);

        long start = System.currentTimeMillis();
        for(int i=1; i<n; i++){
            sb.append(cantorBitArray);
//            System.out.printf("cantorBitArray = %s \n", cantorBitArray);
            sb.append(cantorBitArray.replaceAll("1", "0"));
            sb.append(cantorBitArray);
//            System.out.printf("cantorBitArray = %s \n", cantorBitArray);
            sb.append(cantorBitArray);
//            System.out.printf("cantorBitArray = %s \n", cantorBitArray);
            cantorBitArray = sb.toString();
//            System.out.printf("cantorBitArray = %s \n", cantorBitArray);
//            System.out.printf("%d : %s \n", i+1, sb);
//            System.out.println("\n\n\n");
        }
        long end = System.currentTimeMillis();

        System.out.printf("time = %dms \n", end- start);
        return 0;
    }
}
