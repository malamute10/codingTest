package programmers.lv2.SelectTangerine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SelectTangerine {
    public static int solution(int k, int[] tangerine) {
        int answer = 0;

        int[] tangerineCount = new int[10000001];

        for(int i=0; i<tangerine.length; i++){
            tangerineCount[tangerine[i]]++;
        }

        List<Integer> tangerineCountList = new ArrayList<>();
        for(int count : tangerineCount){
            if(count>0){
                tangerineCountList.add(count);
            }
        }
        tangerineCountList.sort(Collections.reverseOrder());

        for(int i=0; k>0; i++) {
            int max = tangerineCountList.get(i);
            k = k - max;
            answer++;
        }
        return answer;
    }
}
