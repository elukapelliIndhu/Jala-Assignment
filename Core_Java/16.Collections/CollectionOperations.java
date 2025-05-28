import java.util.*;

public class CollectionOperations {
    public static void main(String[] args) {
        // -------- 1. ArrayList Operations --------
        System.out.println("----- ArrayList Operations -----");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(
            "Apple", "Banana", "Cherry", "Date", "Elderberry",
            "Fig", "Grape", "Honeydew", "Indian Fig", "Jackfruit"));

        list.add("Kiwi");  // Add element
        System.out.println("After adding 'Kiwi': " + list);

        System.out.println("Iterate with Iterator:");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        list.add(2, "Blueberry");  // Add at index 2
        System.out.println("After adding 'Blueberry' at index 2: " + list);

        list.remove("Date");  // Remove by value
        System.out.println("After removing 'Date': " + list);

        list.remove(4);  // Remove at index 4
        System.out.println("After removing element at index 4: " + list);

        list.set(0, "Apricot");  // Update element at index 0
        System.out.println("After updating index 0 to 'Apricot': " + list);

        System.out.println("Element at index 3: " + list.get(3));

        System.out.println("Size of ArrayList: " + list.size());

        System.out.println("Is 'Kiwi' present? " + list.contains("Kiwi"));

        list.clear();  // Remove all elements
        System.out.println("After clear(), size: " + list.size());

        System.out.println();

        // -------- 2. HashMap Operations --------
        System.out.println("----- HashMap Operations -----");
        HashMap<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");
        studentMap.put(104, "David");
        studentMap.put(105, "Eva");
        studentMap.put(106, "Frank");
        studentMap.put(107, "Grace");
        studentMap.put(108, "Hannah");
        studentMap.put(109, "Ivan");
        studentMap.put(110, "Jack");

        studentMap.put(111, "Karen");  // Insert new pair
        System.out.println("Map after adding key 111: " + studentMap);

        System.out.println("Value for key 105: " + studentMap.get(105));

        HashMap<Integer, String> cloneMap = (HashMap<Integer, String>) studentMap.clone();
        System.out.println("Cloned Map: " + cloneMap);

        System.out.println("Contains key 108? " + studentMap.containsKey(108));
        System.out.println("Contains value 'Grace'? " + studentMap.containsValue("Grace"));
        System.out.println("Is map empty? " + studentMap.isEmpty());
        System.out.println("Size of map: " + studentMap.size());

        System.out.println("Keys: " + studentMap.keySet());
        System.out.println("Values: " + studentMap.values());

        studentMap.remove(110);  // Remove a key-value pair
        System.out.println("After removing key 110: " + studentMap);

        HashMap<Integer, String> anotherMap = new HashMap<>();
        anotherMap.putAll(studentMap);
        System.out.println("Copied map: " + anotherMap);

        System.out.println();

        // -------- 3. HashSet Operations --------
        System.out.println("----- HashSet Operations -----");
        HashSet<String> set = new HashSet<>(Arrays.asList(
            "Red", "Blue", "Green", "Yellow", "Black",
            "White", "Pink", "Orange", "Purple", "Brown"));

        set.add("Cyan");  // Add element
        System.out.println("After adding 'Cyan': " + set);

        set.remove("Black");  // Remove element
        System.out.println("After removing 'Black': " + set);

        System.out.println("Contains 'Red'? " + set.contains("Red"));

        System.out.println("Iterate HashSet:");
        for (String color : set) {
            System.out.print(color + " ");
        }
        System.out.println();

        System.out.println("Size of HashSet: " + set.size());

        set.clear();  // Remove all elements
        System.out.println("Set empty after clear()? " + set.isEmpty());
    }
}
