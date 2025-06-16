import java.util.Scanner;

public class Fibonacciseries32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0;
        int b=1;
        int c=a+b;

        for(int i=0;i<n;i++){
            System.out.print(c+" ");
            a=b;
            b=c;
            c=a+b;
        }



    }
}
