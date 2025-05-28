package otherpack;

import mypack.protectedExample;

public class NotASubclass {

    public static void main(String[] args) {
        protectedExample obj = new protectedExample();
        // obj.display(); // ❌ Will not work as it's protected and NotASubclass is not a subclass
    }
}
