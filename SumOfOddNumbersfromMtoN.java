import java.util.Scanner;

class SumOfOddNumfromMtoN{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int m = obj.nextInt();
        int n = obj.nextInt();
        int sum=0;
        for(int i=m;i<n+1;i++){
            if(i%2 != 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
