import java.util.Scanner;

class SumOfGivenNum{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            int val = obj.nextInt();
            sum = sum+val;
        }
        System.out.println(sum);
    }
}
