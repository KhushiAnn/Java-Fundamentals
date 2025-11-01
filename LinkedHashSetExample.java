import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        System.out.println("=== LinkedHashSet Example ===");
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(1);
        lhs.add(3);
        lhs.add(2);
        lhs.add(1); // duplicate ignored

        System.out.println("LinkedHashSet (insertion order): " + lhs + "\n");
    }
}
