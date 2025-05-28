
import java.util.Scanner;

public class isprimenum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int num = sc.nextInt();

        boolean isprimenum = true;

        if (num <= 1) {
            isprimenum = false;
        } else {
            int i;
            for (i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.println("false");
                }
            }

            if (isprimenum) {
                System.out.println(num + " is prime.");
            } else {
                System.out.println(num + " is not prime.");
            }
        }
    }
}
