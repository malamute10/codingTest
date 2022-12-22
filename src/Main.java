import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import programmers.lv1.CloesestLetter.ClosestLetter;
import programmers.lv1.ReportResult.ReportResult;
import programmers.lv1.makeHamberger.MakeHamberger;

public class Main {
    public static void main(String[] args) {
//        String[] idList = new String[]{"muzi", "frodo", "apeach", "neo"};
//        String[] report = new String[]{"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
//        int k = 2;
//
//        ReportResult reportResult = new ReportResult();
//        reportResult.solution(idList, report, k);

//        String s = "foobar";
//        System.out.println("result = " + Arrays.toString(ClosestLetter.solution(s)));

        int[] ingredient = new int[1000000];
        int[] num = new int[]{1, 2, 3, 1};

        for(int i=0; i<1000000; i++){
            ingredient[i] = num[i%4];
        }

        long start = System.currentTimeMillis();
//        MakeHamberger.solution(new int[]{1,2,1,2,3,1,3,1,2,3,1,2,3,1});
        MakeHamberger.solution(ingredient);
        long end = System.currentTimeMillis();
        System.out.printf("time : %dms", (end-start));
    }
}