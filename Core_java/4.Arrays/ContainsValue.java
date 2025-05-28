
public class ContainsValue {

    public static boolean contains(int[] array, int value) {
        for (int num : array) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 6, 9, 12};
        System.out.println("Contains 6: " + contains(numbers, 6)); // true
    }
}
