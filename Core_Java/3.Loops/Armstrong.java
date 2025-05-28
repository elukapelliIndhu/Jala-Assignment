
import java.util.*;

public class Armstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int originalNumber = number;
        int result = 0;

        // Loop to extract digits and compute cube
        for (; number != 0; number /= 10) {
            int digit = number % 10;
            result += digit * digit * digit;
        }

        // Check if Armstrong
        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        sc.close();
    }
}
