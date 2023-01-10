package programmers.lv1.InfoDueDate;

import java.time.LocalDate;
import java.util.*;

public class InfoDueDate {
    public static int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> result = new ArrayList<>();
        Map<String, Integer> termMap = new HashMap<>();
        LocalDate now = LocalDate.parse(today.replaceAll("\\.", "-"));

        for(String term : terms){
            String[] split = term.split(" ");
            termMap.put(split[0], Integer.parseInt(split[1]));
        }

        for(int i=0; i< privacies.length; i++){
            String[] split = privacies[i].split(" ");
            Integer period = termMap.get(split[1]);

            LocalDate expiredDate = LocalDate.parse(split[0].replaceAll("\\.", "-")).plusMonths(period);

            if(!expiredDate.isAfter(now)){
                result.add(i+1);
            }
        }

        int[] answer = new int[result.size()];
        for (int i = 0 ; i < result.size() ; i++) {
            answer[i] = result.get(i);
        }

        System.out.println(result);
        return answer;
    }
}
