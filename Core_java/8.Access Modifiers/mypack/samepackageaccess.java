package mypack;

public class samepackageaccess {

    public static void main(String[] args) {
        protectedExample obj = new protectedExample();
        System.out.println("Name: " + obj.name);
        obj.display();
    }
}
