
public class copyarray {
    // Function to copy one array to another

    public static int[] copyArray(int[] original) {
        int[] copy = new int[original.length];
        // Copy each element from original to copy
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        return copy;
    }

    public static void main(String[] args) {
        // Original array
        int[] arr1 = {10, 20, 30, 40, 50};

        // Call function to copy array
        int[] arr2 = copyArray(arr1);

        // Display the copied array
        System.out.print("Copied Array: ");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
    }
}
