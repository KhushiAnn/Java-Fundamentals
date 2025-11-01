public class Array {
    public static void main(String[] args) {
        System.out.println("=== One-Dimensional Array ===");
        int[] numbers = {10, 20, 30, 40, 50};

        // Access elements
        System.out.println("First element: " + numbers[0]);

        // Modify element
        numbers[2] = 35;

        // Print all elements
        System.out.print("All elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
    }
}
