
import java.util.Scanner;

public class addelement {
    // Function to insert element at a specific position

    public static int[] insertElement(int[] original, int element, int position) {
        // Create a new array with one extra size
        int[] newArray = new int[original.length + 1];
        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (i == position) {
                // Insert the new element at the specified position
                newArray[i] = element;
            } else {
                // Copy from original array
                newArray[i] = original[j];
                j++;
            }
        }

        return newArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sample array
        int[] arr = {10, 20, 30, 40, 50};

        // Taking element and position input from user
        System.out.print("Enter element to insert: ");
        int element = sc.nextInt();

        System.out.print("Enter position (0-based index): ");
        int position = sc.nextInt();

        // Check for invalid position
        if (position < 0 || position > arr.length) {
            System.out.println("Invalid position!");
            return;
        }

        // Call the function to insert element
        int[] updatedArray = insertElement(arr, element, position);

        // Display new array
        System.out.print("Updated Array: ");
        for (int num : updatedArray) {
            System.out.print(num + " ");
        }
    }
}
