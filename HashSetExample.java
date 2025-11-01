import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        System.out.println("=== HashSet Example ===");
        HashSet<String> set = new HashSet<>();

        set.add("Red");
        set.add("Green");
        set.add("Blue");
        set.add("Red"); // duplicate, ignored

        System.out.println("HashSet: " + set);
        System.out.println("Contains 'Green'? " + set.contains("Green"));
        set.remove("Blue");
        System.out.println("After removal: " + set + "\n");
    }
}
