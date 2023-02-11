package backjun.atm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ATM {
    public static void solution() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bf.readLine());
        int temp;
        int[] sum = new int[count+1];

        int[] times = new int[count+1];
        String[] strings = bf.readLine().split(" ");
        for(int i=0; i<count; i++) {
            times[i+1] = Integer.parseInt(strings[i]);
        }
        System.out.println(Arrays.toString(times));
        for(int i=2; i<=count; i++) {
            int insertIndex = i;
            temp = times[i];
            for(int j=i-1; j>0; j--) {
                if(times[j] > times[i]) {
                    insertIndex = j;
                }
            }
            for(int j = i-1; j>=insertIndex; j--){
                times[j+1] = times[j];
            }
            times[insertIndex] = temp;
        }

        for(int i=1; i<=count; i++) {
            sum[i] = sum[i-1] + times[i];
        }
        System.out.println(Arrays.stream(sum).sum());
    }
}
