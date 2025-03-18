import java.util.Scanner;
public class Maximum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();

//        int max = a;
//
//        if(b>max){
//            max =b;
//        }
//        if(c>max){
//            max =c;
//        }
//        System.out.println(max);

        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
}