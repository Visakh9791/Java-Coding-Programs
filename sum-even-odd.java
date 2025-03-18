
import java.util.Scanner;
public class even {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num1 = obj.nextInt();
        int num2 = obj.nextInt();

        int sum = num1 + num2;
        if (sum %2 == 0) {
            System.out.println("Sum is Even");
        }
        else{
            System.out.println("Sum is Odd.");
        }
    }
}
