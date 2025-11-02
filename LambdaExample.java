@FunctionalInterface
interface Calculator {
    int operate(int a, int b);
}

public class LambdaExample {
    public static void main(String[] args) {
        // Lambda for addition
        Calculator add = (a, b) -> a + b;

        // Lambda for multiplication
        Calculator multiply = (a, b) -> a * b;

        System.out.println("Addition: " + add.operate(5, 3));
        System.out.println("Multiplication: " + multiply.operate(5, 3));
    }
}
