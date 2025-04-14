import java.util.Scanner;

class RightAngleTriangle{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        for(int r=1;r<n+1;r++){
            for(int c=1;c<r;c++){
                System.out.print("* ");
            }
            System.out.println("* ");
        }
    }
}
