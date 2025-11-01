import java.util.Stack;
import java.util.Vector;

public class VectorAndStackExample {
    public static void main(String[] args) {
        System.out.println("=== Vector & Stack Example ===");

        // Vector (like ArrayList but synchronized)
        Vector<String> v = new Vector<>();
        v.add("A");
        v.add("B");
        v.add("C");
        System.out.println("Vector: " + v);

        // Stack (LIFO)
        Stack<Integer> stack = new Stack<>();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        System.out.println("Stack: " + stack);
        stack.pop();
        System.out.println("After pop: " + stack + "\n");
    }
}
