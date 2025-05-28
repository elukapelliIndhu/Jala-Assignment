
public class EqualnotEqual {

    public void showoperators(int a, int b) {
        if (a == b) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }

    public static void main(String[] args) {
        EqualnotEqual obj = new EqualnotEqual();
        obj.showoperators(5, 5);
        obj.showoperators(5, 10);
    }
}
