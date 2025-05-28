
public class DemoClass {

    // 1. Static variables
    static int staticVar1 = 10;
    static String staticVar2 = "Static";

    // 2. Instance variables
    int instanceVar1 = 100;
    String instanceVar2 = "Instance";

    // 3. Static method 1
    public static void staticMethod1() {
        System.out.println("Inside staticMethod1");

        // 2. Print instance variables in static methods using an object
        DemoClass obj = new DemoClass(); // create object to access instance variables
        System.out.println("InstanceVar1: " + obj.instanceVar1);
        System.out.println("InstanceVar2: " + obj.instanceVar2);

        // 4. Call instance method in static method
        obj.instanceMethod1();
    }

    // 4. Static method 2
    public static void staticMethod2() {
        System.out.println("Inside staticMethod2");

        DemoClass obj = new DemoClass();
        obj.instanceMethod2();  // Call instance method
    }

    // 5. Instance method 1
    public void instanceMethod1() {
        System.out.println("Inside instanceMethod1");

        // 3. Print static variables in instance method
        System.out.println("StaticVar1: " + staticVar1);
        System.out.println("StaticVar2: " + staticVar2);

        // 5. Call static method from instance method
        staticMethod2();
    }

    // 5. Instance method 2
    public void instanceMethod2() {
        System.out.println("Inside instanceMethod2");

        System.out.println("StaticVar1: " + staticVar1);
        System.out.println("InstanceVar1: " + instanceVar1);
    }

    // 6. Main method
    public static void main(String[] args) {

        // Create an object to access instance members
        DemoClass obj = new DemoClass();

        // 6. Print static and instance variables
        System.out.println("StaticVar1: " + staticVar1);
        System.out.println("StaticVar2: " + staticVar2);

        System.out.println("InstanceVar1: " + obj.instanceVar1);
        System.out.println("InstanceVar2: " + obj.instanceVar2);

        // 7. Call static methods
        staticMethod1();
        staticMethod2();

        // 7. Call instance methods
        obj.instanceMethod1();
        obj.instanceMethod2();
    }
}
