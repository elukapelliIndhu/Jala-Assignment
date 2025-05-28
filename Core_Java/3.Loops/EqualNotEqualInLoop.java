
public class EqualNotEqualInLoop {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            // Check if number is equal to 5
            if (i == 5) {
                System.out.println(i + " is equal to 5.");
            }

            // Check if number is not equal to 5
            if (i != 5) {
                System.out.println(i + " is not equal to 5.");
            }
        }
    }
}
