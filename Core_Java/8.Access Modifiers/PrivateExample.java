
public class PrivateExample {

    private int age = 25;

    private void showMessage() {
        System.out.println("Private method called!");
    }

    public static void main(String[] args) {
        PrivateExample obj = new PrivateExample();
        System.out.println("Age: " + obj.age); // Accessing private field
        obj.showMessage();                     // Calling private method
    }
}
