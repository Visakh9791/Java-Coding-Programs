import java.util.Scanner;

class SumOfEvenNum{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        int sum=0;
        for(int i=2;i<=n;i++){
            if(i%2==0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
