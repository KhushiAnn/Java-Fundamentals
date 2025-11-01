import java.util.*;
public class LinkedListExample{
    public static void main(String[] args) {
        System.out.println("=== LinkedList Example ===");
        LinkedList<Integer> numbers = new LinkedList<>();

        // Add elements
        numbers.add(10);
        numbers.add(20);
        numbers.addFirst(5);
        numbers.addLast(30);

        System.out.println("Numbers: " + numbers);

        // Remove
        numbers.removeFirst();
        System.out.println("After removing first: " + numbers + "\n");
    }
}