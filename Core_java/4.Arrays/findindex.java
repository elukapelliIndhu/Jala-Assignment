
public class findindex {

    public static void main(String[] args) {
        int arr[] = {100, 220, 350, 400, 500};
        int value = 220;

        // boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println("Index of value " + value + " is: " + i);
                // found = true;
                break; // optional: exit after first match
            }
        }

//         if (!found) {
//             System.out.println("Value not found in array.");
//         }
    }
}
