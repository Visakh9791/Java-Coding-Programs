
import java.util.Scanner;
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int units = obj.nextInt();
        double bill = 0;

        if (units < 50) {
            bill = (0.5 * units);
        }

        else if(units < 150) {
            bill = (50 * 0.5) + ((units - 50) * 0.75) ;
        }

        else if (units < 250) {
            bill = (50 * 0.5) + (100 * 0.75) + ((units - 150) * 1.20);
        }

        else if (units > 250) {
            bill = (50 * 0.5) + (100 * 0.75) + (100 * 1.20) + ((units - 250) * 1.50);
        }

        double add_charge = bill * 0.20;
        double total_bill = bill + add_charge;

        System.out.println(total_bill);


    }
}
