import java.util.Scanner;

class SumOfNaturalNum{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        long sum=0;
        for(int i=0;i<=n;i++){
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
