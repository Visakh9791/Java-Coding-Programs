
import java.util.Scanner;
public class CheckValidDate {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
//        int dd = obj.nextInt();
//        int mm = obj.nextInt();
//        int yy = obj.nextInt();
        String date = obj.next();
        String[] arr = new String[3];
        arr = date.split("/");

        int dd = Integer.parseInt(arr[0]);
        int mm = Integer.parseInt(arr[1]);
        int yy = Integer.parseInt(arr[2]);

        if (yy >= 1900 && yy <= 9999) {
            if (mm >= 1 && mm <= 12) {
                if ((dd >= 1 && dd <= 31) && (mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12)) {
                    System.out.println("Valid");
                }

                else if ((dd >= 1 && dd <= 30) && (mm == 4 || mm == 6 || mm == 9 || mm == 11 )) {
                    System.out.println("Valid");
                }

                else if ((dd >= 1 && dd <= 28) && (mm == 2)) {
                    System.out.println("Valid");
                }

                else if ((dd >= 1 && dd <= 29) && (mm==2) && (((yy % 4 == 0) && (yy % 100 != 0 )) || (yy % 400 == 0 ))){
                    System.out.println("Leap Year and Valid Year");
                }

                else{
                    System.out.println("Invalid");
                }
            }
            else{
                System.out.println("Invalid");
            }
        }
        else {
            System.out.println("Invalid");
        }
    }
}
