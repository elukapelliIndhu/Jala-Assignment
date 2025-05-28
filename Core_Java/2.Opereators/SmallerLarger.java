
import java.util.*;

public class SmallerLarger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1 = sc.nextInt();
        System.out.println("Enter num2:");
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println("greatest number is:" + num1);
            System.out.println("smallest number is:" + num2);
        } else if (num1 < num2) {
            System.out.println("smallest number is:" + num1);
            System.out.println("greatest number is:" + num2);
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
}
