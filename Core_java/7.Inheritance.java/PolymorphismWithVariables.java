
class A2 {

    int value = 10;
}

class B2 extends A2 {

    int value = 20;
}

class C2 extends B2 {

    int value = 30;
}

public class PolymorphismWithVariables {

    public static void main(String[] args) {
        A2 obj1 = new A2();
        B2 obj2 = new B2();
        C2 obj3 = new C2();

        System.out.println("--- Direct Access ---");
        System.out.println("A2 value: " + obj1.value); // 10
        System.out.println("B2 value: " + obj2.value); // 20
        System.out.println("C2 value: " + obj3.value); // 30

        // Superclass references
        A2 ref;

        ref = new B2();
        System.out.println("\nA2 ref to B2 obj: " + ref.value); // 10 (A2's value)

        ref = new C2();
        System.out.println("A2 ref to C2 obj: " + ref.value); // 10 (A2's value)
    }
}
