// Super class demonstrating various constructors with access modifiers
class SuperClass {
    // Public constructor
    public SuperClass() {
        System.out.println("SuperClass: Public default constructor called");
    }

    // Protected constructor
    protected SuperClass(int a) {
        System.out.println("SuperClass: Protected constructor with int: " + a);
    }

    // Default/package-private constructor
    SuperClass(String s) {
        System.out.println("SuperClass: Default (package-private) constructor with String: " + s);
    }

    // Private constructor (not accessible outside this class)
    private SuperClass(double d) {
        System.out.println("SuperClass: Private constructor with double: " + d);
    }

    // Method to use private constructor internally
    public static SuperClass createUsingPrivateConstructor() {
        return new SuperClass(3.14);
    }
}

// Child class demonstrating constructor chaining and calling superclass constructors
class SubClass extends SuperClass {

    // Default constructor calls SuperClass default constructor
    public SubClass() {
        super();
        System.out.println("SubClass: Default constructor");
    }

    // One-arg constructor calls SuperClass one-arg constructor
    public SubClass(int x) {
        super(x);
        System.out.println("SubClass: Constructor with int: " + x);
    }

    // Two-arg constructor calls SuperClass String constructor
    public SubClass(String a, int b) {
        super(a);
        System.out.println("SubClass: Constructor with String and int: " + a + ", " + b);
    }
}

// Class with a method named like a constructor with return type (just a method, NOT a constructor)
class ReturnTypeExample {
    public int ReturnTypeExample() {
        System.out.println("This is a method, not a constructor (returning int)");
        return 100;
    }

    public String ReturnTypeExample(String name) {
        System.out.println("This is a method, not a constructor (returning String)");
        return "Hello " + name;
    }
}

// Main class to run all tasks
public class Main {
    public static void main(String[] args) {

        // 1. Instantiate class to call default, one-arg, and two-arg constructors
        System.out.println("\n--- Task 1: Instantiate SubClass with various constructors ---");
        SubClass obj1 = new SubClass();              // Default
        SubClass obj2 = new SubClass(10);            // One-arg
        SubClass obj3 = new SubClass("Hi", 20);      // Two-arg

        // 2. Call SuperClass constructors from SubClass (already done above)

        // 3. Access modifiers applied to constructors (already shown in SuperClass)

        // 4. Constructor-like methods with return types
        System.out.println("\n--- Task 4: Methods named like constructors with return types ---");
        ReturnTypeExample r = new ReturnTypeExample();
        int resultInt = r.ReturnTypeExample();              // Method with return type int
        String resultStr = r.ReturnTypeExample("World");    // Method with return type String
        System.out.println("Returned int: " + resultInt);
        System.out.println("Returned String: " + resultStr);

        // 5. Try calling constructor multiple times on the same object (Not possible)
        System.out.println("\n--- Task 5: Constructor called once per object ---");
        SubClass obj4 = new SubClass();
        // obj4.SubClass();  // ❌ ERROR: You can't call constructor again on same object

        System.out.println("You cannot call a constructor manually again on the same object.");
    }
}

