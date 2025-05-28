
public class ArithmeticOperations {

    // Method to perform arithmetic operations
    public void performOperations(int a, int b) {
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));

        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Division: Cannot divide by zero");
        }
    }

    public static void main(String[] args) {
        ArithmeticOperations obj = new ArithmeticOperations();

        // Call the method with two numbers
        obj.performOperations(20, 5);
    }
}
