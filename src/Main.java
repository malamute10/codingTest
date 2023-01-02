import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import programmers.lv1.CloesestLetter.ClosestLetter;
import programmers.lv1.PersonaltyTypeTest.PersonalityTypeTest;
import programmers.lv1.ReportResult.ReportResult;
import programmers.lv1.SeparatingString.SeparatingString;
import programmers.lv1.makeHamberger.MakeHamberger;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"RT", "TR", "FC", "CF", "MJ", "JM", "AN", "NA"};
        Random random = new Random();
        int i1 = random.nextInt(1000);
        String[] randomString = new String[i1];
        int[] randomInt = new int[i1];
        for(int i=0; i< i1; i++){
            randomString[i] = strings[random.nextInt(8)];
            randomInt[i] = random.nextInt(6)+1;
        }

        String result = PersonalityTypeTest.solution(randomString, randomInt);
//        String result = PersonalityTypeTest.solution(new String[]{"AN", "CF", "MJ", "RT", "NA"}, new int[]{5, 3, 2, 7, 5});
        System.out.println(result);
    }
}