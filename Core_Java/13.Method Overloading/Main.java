class MethodOverloading {

    // 1. Same name, same type, different number of parameters
    public void display(int a) {
        System.out.println("display(int a): " + a);
    }

    public void display(int a, int b) {
        System.out.println("display(int a, int b): " + a + ", " + b);
    }

    // 2. Same name, different number of parameters, different data type
    public void print(String s) {
        System.out.println("print(String s): " + s);
    }

    public void print(String s, double d) {
        System.out.println("print(String s, double d): " + s + ", " + d);
    }

    // 3. Same name, same number, same type
    public void compute(int x, int y) {
        System.out.println("compute(int, int): sum = " + (x + y));
    }

    // (This is not overloading; redefining same method in the same class will cause compile error)
    // public void compute(int a, int b) {
    //     System.out.println("Another compute");
    // }

    // 4. Same name, same number of parameters, different type
    public void show(int x, double y) {
        System.out.println("show(int, double): " + x + ", " + y);
    }

    public void show(double x, int y) {
        System.out.println("show(double, int): " + x + ", " + y);
    }

    // 5. Same name, same parameters, different return type (Not allowed in Java)
    // The following is invalid and will cause a compile-time error
    /*
    public int test(int a) {
        return a;
    }

    public String test(int a) {
        return "Value: " + a;
    }
    */

    // To demonstrate similar behavior, use method overloading with different parameter types
    public int test(int a, int b) {
        return a + b;
    }

    public String test(String a, String b) {
        return a + " " + b;
    }
}

public class Main {
    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();

        // Task 1
        System.out.println("\n--- Task 1: Same name, same type, different number of parameters ---");
        obj.display(10);
        obj.display(10, 20);

        // Task 2
        System.out.println("\n--- Task 2: Same name, different number of parameters, different data type ---");
        obj.print("Hello");
        obj.print("Hello", 99.9);

        // Task 3
        System.out.println("\n--- Task 3: Same name, same number and type of parameters ---");
        obj.compute(5, 10);  // Only one method allowed for (int, int)

        // Task 4
        System.out.println("\n--- Task 4: Same name, same number of parameters, different type ---");
        obj.show(5, 3.14);
        obj.show(3.14, 5);

        // Task 5
        System.out.println("\n--- Task 5: Same name, number, and type, different return type (invalid in Java) ---");
        int resultInt = obj.test(5, 10);
        String resultStr = obj.test("Hello", "World");

        System.out.println("test(int, int) returns: " + resultInt);
        System.out.println("test(String, String) returns: " + resultStr);
    }
}

