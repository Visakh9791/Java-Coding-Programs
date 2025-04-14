import java.util.Scanner;

class Integers{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int m=obj.nextInt();
        int n=obj.nextInt();
        for(int i=m;i<n+1;i++){
            System.out.println(i);
        }
    }
}
