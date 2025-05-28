
public class evennumberwhile {

    public static void main(String[] args) {
        int i = 10;

        System.out.println("Even numbers between 10 and 100:");

        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
