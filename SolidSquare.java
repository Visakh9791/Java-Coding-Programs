import java.util.Scanner;

class SolidSquare{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n= obj.nextInt();
        for(int i=1;i<n+1;i++){
            for(int j=1;j<n;j++){
                System.out.print("* ");
            }
            System.out.println("* ");
        }
    }
}
