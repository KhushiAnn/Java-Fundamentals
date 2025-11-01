import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        System.out.println("=== PriorityQueue Example ===");
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(50);
        pq.add(10);
        pq.add(30);

        System.out.println("PriorityQueue: " + pq);
        System.out.println("Polling (removing smallest): " + pq.poll());
        System.out.println("After poll: " + pq + "\n");
    }
}
