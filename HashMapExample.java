import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        System.out.println("=== HashMap Example ===");
        HashMap<Integer, String> map = new HashMap<>();

        // Add key-value pairs
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        // Access value
        System.out.println("Value for key 2: " + map.get(2));

        // Iterate
        System.out.println("All entries:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Remove
        map.remove(1);
        System.out.println("After removal: " + map + "\n");
    }
}
