package programmers.lv2.MagicElevator;

public class MagicElevator {
    public static int solution(int storey) {
        int answer = 0;

        System.out.printf("storey = %d\n", storey);

        while(storey>0){
            int one = storey % 10;
            boolean plus = isPlus(storey);
            System.out.printf("plus = %b\n", plus);

            if(one >= 5 && plus) {
                storey = storey + (10 - one);
                answer += (10 - one);
            } else if(one > 0){
                storey = storey - one;
                answer += one;
            }
            storey = storey / 10;
            System.out.printf("storey = %d answer = %d\n", storey, answer);
        }
        return answer;
    }

    private static boolean isPlus(int storey) {
        int number = 5;
        char[] findFive = String.valueOf(storey).toCharArray();
        for(int i=findFive.length-1; (i>=0 && number == 5); i--) {
            number = findFive[i] - '0';
        }

        System.out.printf("number = %d\n ", number);

        return number > 5 || (number == 5 && storey >= 10);
    }
}
