import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        System.out.println("=== Queue Example ===");
        Queue<String> queue = new LinkedList<>();

        queue.add("A");
        queue.add("B");
        queue.add("C");

        System.out.println("Queue: " + queue);
        System.out.println("Peek: " + queue.peek());
        queue.remove();
        System.out.println("After remove: " + queue + "\n");
    }
}
