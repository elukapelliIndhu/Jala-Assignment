
public class methodcalls {

    public static void main(String[] args) {
        // Class A (Superclass)

        class A {

            public void aMethod1() {
                System.out.println("A: Method 1");
            }

            public void aMethod2() {
                System.out.println("A: Method 2");
            }

            public void show() {
                System.out.println("A: Overridden show method");
            }
        }

// Class B (Subclass of A)
        class B extends A {

            public void bMethod1() {
                System.out.println("B: Method 1");
            }

            public void bMethod2() {
                System.out.println("B: Method 2");
            }

            @Override
            public void show() {
                System.out.println("B: Overridden show method");
            }
        }

// Class C (Subclass of B)
        class C extends B {

            public void cMethod1() {
                System.out.println("C: Method 1");
            }

            public void cMethod2() {
                System.out.println("C: Method 2");
            }

            @Override
            public void show() {
                System.out.println("C: Overridden show method");
            }
        }

        // Own object calls
        A objA = new A();
        B objB = new B();
        C objC = new C();

        System.out.println("--- A Object ---");
        objA.aMethod1();
        objA.aMethod2();
        objA.show();

        System.out.println("\n--- B Object ---");
        objB.aMethod1(); // inherited
        objB.aMethod2(); // inherited
        objB.bMethod1();
        objB.bMethod2();
        objB.show();     // overridden

        System.out.println("\n--- C Object ---");
        objC.aMethod1(); // inherited
        objC.bMethod1(); // inherited
        objC.cMethod1();
        objC.cMethod2();
        objC.show();     // overridden

        // Polymorphism with superclass reference
        A ref;

        System.out.println("\n--- Superclass Ref to B Object ---");
        ref = new B();
        ref.show(); // Executes B's show()

        System.out.println("\n--- Superclass Ref to C Object ---");
        ref = new C();
        ref.show(); // Executes C's show()
    }
}
