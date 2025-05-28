public class ClassMethodObject {
    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Main method
    public static void main(String[] args) {
        // Create an object to call the non-static add method
        ClassMethodObject obj = new ClassMethodObject();
        int result = obj.add(5, 3);
        System.out.println("The sum is: " + result);
    }
}
