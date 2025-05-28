
public class LogicalOperators {

    public static void main(String[] args) {
        int a = 6, b = 10;

        //  logical AND operator
        if (a > 0 && b < 12) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
// Logical OR operator

        int i = 5, j = 30;

        if (i > 10 || j > 10) {
            System.out.println("At least one condition is true.");
        } else {
            System.out.println("Both conditions are false.");
        }

        // OR operator
        boolean israiny = false;

        if (!israiny) {
            System.out.println("It's not raining. Let's go outside!");
        } else {
            System.out.println("It's raining. Better stay inside.");
        }
    }
}
