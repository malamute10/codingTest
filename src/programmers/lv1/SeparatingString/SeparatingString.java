package programmers.lv1.SeparatingString;

import java.util.*;

public class SeparatingString {
    public static int solution(String s) {
        Integer[] count = new Integer[]{0, 0};
        char character = 0;
        int result = 0;

        for(int i=0; i<s.length(); i++){
            if(i == 0) {
                character = s.charAt(i);
            }
            if(character == s.charAt(i)){
                count[0]++;
            } else {
                count[1]++;
            }

            if(count[0].equals(count[1])){
                s = s.substring(i+1);
                i = -1;
                result++;
                count[0] = 0;
                count[1] = 0;
            }
        }

        if(s.length() > 0 ){
            result++;
        }
        return result;
    }
}
