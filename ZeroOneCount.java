package Arrays;

import java.util.Scanner;

public class ZeroOneCount {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();
        int zerocount = 0;
        int onecount=0;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = obj.nextInt();
            if(arr[i] == 0) {
                zerocount++;
            } else if (arr[i] == 1) {
                onecount++;
            }
        }

        System.out.println("ZC:" + zerocount);
        System.out.println("OC:" + onecount);


    }
}
