
public class methodoverriding {
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

}
