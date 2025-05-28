package anypack;

import mypack1.PublicExample1;

public class PublicTest {

    public static void main(String[] args) {
        PublicExample1 obj = new PublicExample1();
        System.out.println("ID: " + obj.id);
        obj.show();
    }
}
