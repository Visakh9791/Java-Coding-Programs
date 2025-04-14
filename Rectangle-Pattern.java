import java.util.Scanner;
class Rectangle{
    public static void main(String[] args){
        Scanner obj =new Scanner(System.in);
        int row=obj.nextInt();
        int col =obj.nextInt();
        for(int i=1;i<=row;i++){
            
            for(int j=1;j<col;j++){
                System.out.print("* ");
            }
            System.out.println("* ");
        }
        
    }
}
