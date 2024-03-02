import java.util.ArrayList;

public class DynArray {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<Integer> dynamicArray = new ArrayList<>();

        // Adding elements to the ArrayList
        dynamicArray.add(10);
        dynamicArray.add(20);
        dynamicArray.add(30);
        
        // Accessing elements by index
        System.out.println("Element at index 0: " + dynamicArray.get(0)); // Output: 10

        // Modifying elements
        dynamicArray.set(1, 25); // Replace element at index 1 with 25

        // Removing elements
        dynamicArray.remove(2); // Remove element at index 2
        
        // Checking if the ArrayList is empty
        System.out.println("Is the ArrayList empty? " + dynamicArray.isEmpty()); // Output: false

        // Size of the ArrayList
        System.out.println("Size of the ArrayList: " + dynamicArray.size()); // Output: 2
    }
}
