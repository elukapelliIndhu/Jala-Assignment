
import java.util.Arrays;
import java.util.Scanner;

public class deletelement {

    public static int[] removeElement(int[] arr, int value) {
        int count = 0;
        for (int num : arr) {
            if (num != value) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num != value) {
                result[index++] = num;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Enter number to delete: ");
        int value = sc.nextInt();

        int[] updatedArray = removeElement(arr, value);
        System.out.println("Updated array: " + Arrays.toString(updatedArray));
    }
}
