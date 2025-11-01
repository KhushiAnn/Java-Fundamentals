public class TwodArray {
    public static void main(String[] args) {
        System.out.println("=== Multi-Dimensional Array (Matrix) ===");
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Access an element
        System.out.println("Element at [1][2]: " + matrix[1][2]);

        // Print the matrix
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
