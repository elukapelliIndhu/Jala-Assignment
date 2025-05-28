
public class averagevalue {

    public static int Average(int[] array) {
        int total = 0;
        for (int num : array) {
            total += num;
        }
        return total;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};
        System.out.println("Average = " + Average(numbers) / 2); // Output: Sum = 100
    }
}
