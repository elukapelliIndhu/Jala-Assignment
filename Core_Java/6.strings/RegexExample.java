
public class RegexExample {

    public static void main(String[] args) {
        String str = "Hello123";

        // Match only alphabets
        boolean result1 = str.matches("[A-Za-z]+");
        System.out.println("Only alphabets: " + result1); // false

        // Match only digits
        boolean result2 = str.matches("[0-9]+");
        System.out.println("Only digits: " + result2); // false

        // Match alphanumeric (letters and numbers)
        boolean result3 = str.matches("[A-Za-z0-9]+");
        System.out.println("Alphanumeric: " + result3); // true

        // Match string starting with Hello
        boolean result4 = str.matches("Hello.*");
        System.out.println("Starts with 'Hello': " + result4); // true
    }
}
