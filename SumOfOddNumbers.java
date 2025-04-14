import java.util.Scanner;

class SumOfOddNum{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int sum=0;
        for(int i=1;i<n+1;i++){
            if(i%2 != 0){
                sum = sum+i;                
            }
        }
        System.out.println(sum);
    }
}
