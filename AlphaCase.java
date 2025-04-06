import java.util.Scanner;
public class AlphaCase {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        char letter = obj.next().charAt(0);
        if (Character.isUpperCase(letter)) {
            System.out.println("Upper Case");
        }
        else{
            System.out.println("Lower Case");
        }

    }
}
