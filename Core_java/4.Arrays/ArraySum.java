
public class ArraySum {

    public static int sum(int[] array) {
        int total = 0;
        for (int num : array) {
            total += num;
        }
        return total;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};
        System.out.println("Sum = " + sum(numbers)); // Output: Sum = 100
    }
}
