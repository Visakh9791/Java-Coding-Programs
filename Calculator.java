
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num1 = obj.nextInt();
        int num2 = obj.nextInt();
        char op = obj.next().charAt(0);

        switch(op) {
            case '+': {
                int sum = num1 + num2;
                System.out.println(sum);
            }
            break;

            case '-': {
                int diff = num1 - num2;
                System.out.println(diff);
            }
            break;

            case '*': {
                int mul = num1 * num2;
                System.out.println(mul);
            }
            break;

            case '/': {
                int div = num1/num2;
                System.out.println(div);
            }
            break;

            case '%': {
                int mod = num1 % num2;
                System.out.println(mod);
            }
            break;


            default:
                System.out.println("Invalid Input");
        }
    }
}
