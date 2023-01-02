package programmers.lv1.PersonaltyTypeTest;

import java.util.Arrays;

public class PersonalityTypeTest {
    public static String solution(String[] survey, int[] choices) {
        Integer[] scores = {0, 0, 0, 0, 0, 0, 0, 0};

        for(int i=0; i< survey.length; i++){
            int choice = choices[i];
            if(choice < 4){
                scores[personalityType.valueOf(survey[i].substring(0,1)).getIndex()] += (4-choice);
            } else if( choice > 4){
                scores[personalityType.valueOf(survey[i].substring(1)).getIndex()] += (choice - 4);
            }
        }
        System.out.println(Arrays.toString(scores));
        return judgePersonalityType(scores);
    }

    private static String judgePersonalityType(Integer[] scores){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<8; i+=2){
            if(scores[i] >= scores[i+1]){
                sb.append(personalityType.getString(i));
            } else {
                sb.append(personalityType.getString(i+1));
            }
        }
        return sb.toString();
    }

    public enum personalityType {
        R(0), T(1), C(2), F(3), J(4), M(5), A(6), N(7);

        private Integer index;
        personalityType(Integer index){
            this.index = index;
        }

        public Integer getIndex(){
            return index;
        }

        public static String getString(Integer index){
            return switch (index){
                case 0 -> personalityType.R.name();
                case 1 -> personalityType.T.name();
                case 2 -> personalityType.C.name();
                case 3 -> personalityType.F.name();
                case 4 -> personalityType.J.name();
                case 5 -> personalityType.M.name();
                case 6 -> personalityType.A.name();
                case 7 -> personalityType.N.name();
                default -> "";
            };
        }
    }
}
