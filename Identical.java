package Arrays;

import java.util.Scanner;

public class Identical {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);


        int m = obj.nextInt();
        int n = obj.nextInt();
        int[][] arr1 = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j] = obj.nextInt();
            }
        }

        int k = obj.nextInt();
        int l = obj.nextInt();

        if (m != k || n != l) {
            System.out.println("Non Identical");
            return;
        }

        int[][] arr2 = new int[k][l];

        for(int i=0;i<k;i++){
            for(int j=0;j<l;j++){
                arr2[i][j] = obj.nextInt();
            }
        }

        boolean identical = false;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(arr1[i][j] == arr2[i][j]){
                    identical =  true;
                    break;
                }
            }
        }

        if(identical){
            System.out.println("Identical");
        }
        else{
            System.out.println("Not Identical");
        }
    }
}
