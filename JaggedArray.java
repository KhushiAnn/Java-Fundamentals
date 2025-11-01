public class JaggedArray {
    public static void main(String[] args) {
        System.out.println("=== Jagged Array ===");
        int[][] jagged = new int[3][];
        jagged[0] = new int[]{1, 2, 3};
        jagged[1] = new int[]{4, 5};
        jagged[2] = new int[]{6, 7, 8, 9};

        // Print the jagged array
        for (int i = 0; i < jagged.length; i++) {
            System.out.print("Row " + i + ": ");
            for (int val : jagged[i]) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
