import java.util.Arrays;
import programmers.lv1.CloesestLetter.ClosestLetter;
import programmers.lv1.ReportResult.ReportResult;

public class Main {
    public static void main(String[] args) {
//        String[] idList = new String[]{"muzi", "frodo", "apeach", "neo"};
//        String[] report = new String[]{"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
//        int k = 2;
//
//        ReportResult reportResult = new ReportResult();
//        reportResult.solution(idList, report, k);

        String s = "foobar";
        System.out.println("result = " + Arrays.toString(ClosestLetter.solution(s)));
    }
}