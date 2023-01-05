package programmers.lv2.TableHashFunction;

import java.util.Arrays;
import java.util.Comparator;

public class TableHashFunction {
    public static int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;

        Arrays.sort(data, Comparator.comparingInt((int[] num) -> num[0]).reversed());
        Arrays.sort(data, Comparator.comparingInt((int[] num) -> num[col-1]));

        int[] S_i = new int[row_end - row_begin + 1];

        for(int i = row_begin; i<=row_end; i++){
            for(int num : data[i-1]){
                S_i[i-row_begin] += (num % i);
            }
            answer ^= S_i[i-row_begin];
        }
        return answer;
    }
}
