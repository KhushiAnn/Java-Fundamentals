import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        System.out.println("=== ArrayList Example ===");
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Access & modify
        System.out.println("First fruit: " + fruits.get(0));
        fruits.set(1, "Blueberry");

        // Iterate
        System.out.println("All fruits:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }

        // Remove
        fruits.remove("Apple");
        System.out.println("After removal: " + fruits + "\n");
    }
}
