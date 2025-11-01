import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        System.out.println("=== TreeSet Example ===");
        TreeSet<String> tree = new TreeSet<>();
        tree.add("Orange");
        tree.add("Apple");
        tree.add("Banana");

        System.out.println("Sorted TreeSet: " + tree);
        System.out.println("First element: " + tree.first());
        System.out.println("Last element: " + tree.last() + "\n");
    }
}
