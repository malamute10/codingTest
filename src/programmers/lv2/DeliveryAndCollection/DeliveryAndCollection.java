package programmers.lv2.DeliveryAndCollection;

import java.util.*;

public class DeliveryAndCollection {

    public static long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = 0;
        boolean isMaxDistance = false;
        int returnDistance = 0;
        int loadedPackage = cap;
        int ableLoad = cap;
        int existDelivery = 0;
        int existPickups = 0;

        int i = n;
        while(i > 0){

            if(deliveries[i] > 0 && loadedPackage > 0){
                returnDistance = Math.max(returnDistance, i + 1);
                if (loadedPackage > deliveries[i]) {
                    loadedPackage -= deliveries[i];
                    deliveries[i] = 0;
                } else if (loadedPackage < deliveries[i]) {
                    deliveries[i] -= loadedPackage;
                    loadedPackage = 0;
                } else {
                    deliveries[i] = 0;
                    loadedPackage = 0;
                }

                if(loadedPackage == 0){
                    existDelivery = i;
                }
            }

            if (pickups[i] > 0 && ableLoad > 0) {
                returnDistance = Math.max(returnDistance, i + 1);
                if (ableLoad > pickups[i]) {
                    ableLoad -= pickups[i];
                    pickups[i] = 0;
                } else if (ableLoad < pickups[i]) {
                    pickups[i] -= ableLoad;
                    ableLoad = 0;
                } else {
                    pickups[i] = 0;
                    ableLoad = 0;
                }

                if(ableLoad == 0){
                    existPickups = i;
                }
            }

            if((loadedPackage == 0 && ableLoad == 0) || i == 0){
                answer += returnDistance*2L;
                returnDistance = 0;
                loadedPackage = cap;
                ableLoad = cap;
                System.out.println("i:" + i);
                System.out.println("existDelivery:" + existDelivery + "  existPickups:" + existPickups);
                if(Arrays.stream(deliveries).sum() + Arrays.stream(pickups).sum() > 0) {
                    i = Math.max(existDelivery, existPickups) + 1;
                }
                existDelivery = 0;
                existPickups = 0;
                System.out.println("i:" + i);
                System.out.println();
            }

            if(isMaxDistance){
                answer += returnDistance*2L;
            }
            System.out.println("i:" + i + "  returnDistance:" + returnDistance);
            System.out.println("existDelivery:" + existDelivery + "  existPickups:" + existPickups);
            System.out.println("deliveries:" + Arrays.toString(deliveries) + "  pickups:" + Arrays.toString(pickups));
            System.out.println("loadedPackage:" + loadedPackage + " ableLoad:" + ableLoad +"  answer:"+ answer);
            System.out.println();
        }
        return answer;
    }
}
