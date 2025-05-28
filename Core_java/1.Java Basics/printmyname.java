
public class printmyname {

    // Method to print your name
    public void printName() {
        System.out.println("My name is Indhu");
    }

    public static void main(String[] args) {
        // Create an object to call the non-static method
        printmyname obj = new printmyname();
        obj.printName();  // Calling the method
    }
}
