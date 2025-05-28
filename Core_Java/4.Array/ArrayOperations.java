import java.util.*;

public class ArrayOperations {

    // 1. Sum of array elements
    public static int sum(int[] arr) {
        int total = 0;
        for (int v : arr) total += v;
        return total;
    }

    // 2. Average value of array
    public static double average(int[] arr) {
        return arr.length == 0 ? 0 : (double) sum(arr) / arr.length;
    }

    // 3. Find index of element (-1 if not found)
    public static int findIndex(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == val) return i;
        return -1;
    }

    // 4. Check if array contains a specific value
    public static boolean contains(int[] arr, int val) {
        return findIndex(arr, val) != -1;
    }

    // 5. Remove specific element from array (returns new array)
    public static int[] removeElement(int[] arr, int val) {
        return Arrays.stream(arr).filter(x -> x != val).toArray();
    }

    // 6. Copy array to another array
    public static int[] copyArray(int[] arr) {
        return Arrays.copyOf(arr, arr.length);
    }

    // 7. Insert element at specific position (returns new array)
    public static int[] insertAt(int[] arr, int pos, int val) {
        if (pos < 0 || pos > arr.length) throw new IndexOutOfBoundsException();
        int[] result = new int[arr.length + 1];
        for (int i = 0, j = 0; i < result.length; i++) {
            if (i == pos) result[i] = val;
            else result[i] = arr[j++];
        }
        return result;
    }

    // 8. Find min and max values
    public static int[] minMax(int[] arr) {
        if (arr.length == 0) throw new IllegalArgumentException("Empty array");
        int min = arr[0], max = arr[0];
        for (int v : arr) {
            if (v < min) min = v;
            if (v > max) max = v;
        }
        return new int[]{min, max};
    }

    // 9. Reverse array (in-place)
    public static void reverse(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
            i++; j--;
        }
    }

    // 10. Find duplicate values in array (returns a set)
    public static Set<Integer> findDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int v : arr) {
            if (!seen.add(v)) duplicates.add(v);
        }
        return duplicates;
    }

    // 11. Find common values between two arrays (returns set)
    public static Set<Integer> findCommon(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        for (int v : arr1) set1.add(v);
        Set<Integer> common = new HashSet<>();
        for (int v : arr2) if (set1.contains(v)) common.add(v);
        return common;
    }

    // 12. Remove duplicates (returns new array)
    public static int[] removeDuplicates(int[] arr) {
        return Arrays.stream(arr).distinct().toArray();
    }

    // 13 & 14. Find second largest number in array
    public static int secondLargest(int[] arr) {
        if (arr.length < 2) throw new IllegalArgumentException("Array too small");
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int v : arr) {
            if (v > largest) {
                second = largest;
                largest = v;
            } else if (v > second && v < largest) {
                second = v;
            }
        }
        if (second == Integer.MIN_VALUE) throw new IllegalArgumentException("No second largest element");
        return second;
    }

    // 15. Count even and odd numbers in array
    public static Map<String, Integer> countEvenOdd(int[] arr) {
        int even = 0, odd = 0;
        for (int v : arr) {
            if (v % 2 == 0) even++;
            else odd++;
        }
        Map<String, Integer> result = new HashMap<>();
        result.put("Even", even);
        result.put("Odd", odd);
        return result;
    }

    // 16. Difference of largest and smallest value
    public static int differenceMaxMin(int[] arr) {
        int[] mm = minMax(arr);
        return mm[1] - mm[0];
    }

    // 17. Verify if array contains two specified elements (12, 23)
    public static boolean containsBoth(int[] arr, int val1, int val2) {
        boolean found1 = false, found2 = false;
        for (int v : arr) {
            if (v == val1) found1 = true;
            if (v == val2) found2 = true;
        }
        return found1 && found2;
    }

    // 18. Remove duplicates and return new array (same as 12)
    // (implemented above as removeDuplicates)

    // 19. Find missing number in sorted array from 1 to 100
    public static int findMissingNumber(int[] arr) {
        // Assuming array contains numbers 1 to 100 with exactly one missing
        int expectedSum = 100 * 101 / 2; // sum 1..100
        int actualSum = sum(arr);
        return expectedSum - actualSum;
    }


    // Testing all methods in main()
    public static void main(String[] args) {
        int[] array = {10, 12, 23, 12, 35, 46, 23, 57, 68, 10, 89};
        System.out.println("Array: " + Arrays.toString(array));

        System.out.println("1. Sum: " + sum(array));
        System.out.println("2. Average: " + average(array));
        System.out.println("3. Index of 23: " + findIndex(array, 23));
        System.out.println("4. Contains 35? " + contains(array, 35));
        System.out.println("5. Remove 12: " + Arrays.toString(removeElement(array, 12)));
        System.out.println("6. Copy array: " + Arrays.toString(copyArray(array)));
        System.out.println("7. Insert 99 at index 3: " + Arrays.toString(insertAt(array, 3, 99)));

        int[] minMax = minMax(array);
        System.out.println("8. Min: " + minMax[0] + ", Max: " + minMax[1]);

        int[] revArray = copyArray(array);
        reverse(revArray);
        System.out.println("9. Reversed: " + Arrays.toString(revArray));

        System.out.println("10. Duplicates: " + findDuplicates(array));
        int[] arr2 = {23, 35, 100, 10, 57, 77, 89};
        System.out.println("11. Common elements with " + Arrays.toString(arr2) + ": " + findCommon(array, arr2));

        System.out.println("12. Remove duplicates: " + Arrays.toString(removeDuplicates(array)));
        System.out.println("13. Second largest: " + secondLargest(array));
        System.out.println("15. Even and Odd count: " + countEvenOdd(array));
        System.out.println("16. Difference Max-Min: " + differenceMaxMin(array));
        System.out.println("17. Contains 12 and 23? " + containsBoth(array, 12, 23));

        int[] arrayWithMissing = new int[99];
        int missingNum = 73;
        int idx = 0;
        for (int i = 1; i <= 100; i++) {
            if (i != missingNum) {
                arrayWithMissing[idx++] = i;
            }
        }
        System.out.println("19. Missing number: " + findMissingNumber(arrayWithMissing));
    }
}

