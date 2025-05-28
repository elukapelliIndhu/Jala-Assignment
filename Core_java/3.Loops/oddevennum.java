
import java.util.*;

public class oddevennum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter i value:");
        int i = sc.nextInt();
        if (i % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }
}
