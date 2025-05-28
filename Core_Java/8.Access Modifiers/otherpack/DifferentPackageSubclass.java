package otherpack;

import mypack.protectedExample;

public class DifferentPackageSubclass extends protectedExample {

    public void test() {
        System.out.println("Accessing in subclass from other package: " + name);
        display();
    }

    public static void main(String[] args) {
        DifferentPackageSubclass obj = new DifferentPackageSubclass();
        obj.test();
    }
}
