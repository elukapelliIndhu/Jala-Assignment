
import java.util.*;

public class Evenoddcase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num:");
        int num = sc.nextInt();
        switch (num % 2) {
            case 0:
                System.out.println("Even");
                break;
            case 1:
                System.out.println("odd");
                break;

            default:
                System.out.println("Invalid");
        }

    }
}
