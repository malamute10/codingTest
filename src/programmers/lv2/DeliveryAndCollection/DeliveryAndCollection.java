package programmers.lv2.DeliveryAndCollection;

import java.util.*;

public class DeliveryAndCollection {

    public static long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = 0;
        int returnDistance = 0;
        int loadedPackage = 0;
        int ableLoad = 0;
        int existDelivery = -1;
        int existPickups = -1;

        System.out.println("cap:" + cap + "  n:" + n);
        System.out.println("deliveries:" + Arrays.toString(deliveries) + "  pickups:" + Arrays.toString(pickups));
        System.out.println();

        int i = n -1;
        while(i >= 0){
            if((deliveries[i] > 0 && loadedPackage == 0) ) {
                loadedPackage = cap;
            }
            if((pickups[i] > 0 && ableLoad == 0)) {
                ableLoad = cap;
            }

            if(deliveries[i] > 0 && loadedPackage > 0){
                returnDistance = Math.max(returnDistance, i + 1);
                if (loadedPackage >= deliveries[i]) {
                    loadedPackage -= deliveries[i];
                    deliveries[i] = 0;
                } else {
                    deliveries[i] -= loadedPackage;
                    loadedPackage = 0;
                }

                if(loadedPackage == 0){
                    existDelivery = i+1;
                }
            }

            if (pickups[i] > 0 && ableLoad > 0) {
                returnDistance = Math.max(returnDistance, i + 1);
                if (ableLoad > pickups[i]) {
                    ableLoad -= pickups[i];
                    pickups[i] = 0;
                } else {
                    pickups[i] -= ableLoad;
                    ableLoad = 0;
                }

                if(ableLoad == 0){
                    existPickups = i+1;
                }
            }
            System.out.println("i:" + i + "  returnDistance:" + returnDistance);
            System.out.println("existDelivery:" + existDelivery + "  existPickups:" + existPickups);
            System.out.println("deliveries:" + Arrays.toString(deliveries) + "  pickups:" + Arrays.toString(pickups));
            System.out.println("loadedPackage:" + loadedPackage + " ableLoad:" + ableLoad);

            if((loadedPackage == 0 && ableLoad == 0) || i == 0){
                answer += returnDistance*2L;
                returnDistance = 0;

                System.out.println("i:" + i);
                System.out.println("existDelivery:" + existDelivery + "  existPickups:" + existPickups);

                if(existDelivery != -1 || existPickups != -1) {
                    i = Math.max(existDelivery, existPickups);
                }

                if(existDelivery != -1) {
                    existDelivery = 0;
                    loadedPackage = cap;
                }
                if(existPickups != -1) {
                    existPickups = 0;
                    ableLoad = cap;
                }
                System.out.println("i:" + i);
                System.out.println();
            }
            i--;
            System.out.println("answer:"+ answer);
            System.out.println();
        }
        return answer;
    }
}
