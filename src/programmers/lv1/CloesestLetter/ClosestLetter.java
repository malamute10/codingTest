package programmers.lv1.CloesestLetter;

import java.util.ArrayList;
import java.util.List;

public class ClosestLetter {
    public static int[] solution(String s) {
        char[] chars = s.toCharArray();
        List<Character> seemChar = new ArrayList<>();
        int[] result = new int[chars.length];

        for(int i=0; i<chars.length; i++){
            int beforeLetterIndex = seemChar.lastIndexOf(chars[i]);
            seemChar.add(chars[i]);
            int afterLetterIndex = seemChar.lastIndexOf(chars[i]);
            result[i] = afterLetterIndex - beforeLetterIndex;
            if(beforeLetterIndex < 0){
                result[i] = beforeLetterIndex;
            }
        }
        return result;
    }
}
