package programmers.lv1.makeHamberger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MakeHamberger {
    public static int solution(int[] ingredient) {
        String s = Arrays.toString(ingredient).replaceAll("[^0-9]", "");
        int ingredientCount = s.length();
        StringBuffer sb = new StringBuffer(s);
        int index = sb.indexOf("1231");

        while(index >= 0){
            sb.delete(index, index+4);
            index = sb.indexOf("1231");
        }

        return (ingredientCount - sb.length())/4;
    }
}
