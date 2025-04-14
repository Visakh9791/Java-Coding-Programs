import java.util.Scanner;

class ReadInputs{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        for(int i=0;i<n;i++){
            int val = obj.nextInt();
            System.out.println(val);
        }
        
    }
}
