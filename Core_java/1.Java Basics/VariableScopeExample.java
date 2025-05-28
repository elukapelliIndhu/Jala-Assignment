
public class VariableScopeExample {

    // Global (Instance) variable
    int number = 100;

    public void showNumber() {
        // Local variable (same name as instance variable)
        int number = 50;

        // Accessing the local variable
        System.out.println("Local variable: " + number);

        // Accessing the global (instance) variable using 'this' keyword
        System.out.println("Global (instance) variable: " + this.number);
    }

    public static void main(String[] args) {
        VariableScopeExample obj = new VariableScopeExample();
        obj.showNumber();
    }
}
