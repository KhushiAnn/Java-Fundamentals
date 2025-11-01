public class ArrayOperation {
    public static void main(String[] args) {
        System.out.println("=== Array Operations ===");
        int[] original = {10, 20, 30, 40};
        System.out.print("Original Array: ");
        printArray(original);

        // Append element
        int[] appended = appendElement(original, 50);
        System.out.print("After Append: ");
        printArray(appended);

        // Insert element at index
        int[] inserted = insertElement(original, 2, 25);
        System.out.print("After Insert at index 2: ");
        printArray(inserted);

        // Delete element at index
        int[] deleted = deleteElement(original, 1);
        System.out.print("After Delete at index 1: ");
        printArray(deleted);

        System.out.println();
    }

    // Helper method to print array
    static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // Append element at end
    static int[] appendElement(int[] arr, int newElement) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = newElement;
        return newArr;
    }

    // Insert element at index
    static int[] insertElement(int[] arr, int index, int newElement) {
        if (index < 0 || index > arr.length) {
            System.out.println("Invalid index!");
            return arr;
        }
        int[] newArr = new int[arr.length + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == index) {
                newArr[i] = newElement;
            } else {
                newArr[i] = arr[j++];
            }
        }
        return newArr;
    }

    // Delete element at index
    static int[] deleteElement(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid index!");
            return arr;
        }
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }
}
