package Arrays;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int m=obj.nextInt();
        int n=obj.nextInt();
        int[][] arr = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = obj.nextInt();
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }




    }
}
