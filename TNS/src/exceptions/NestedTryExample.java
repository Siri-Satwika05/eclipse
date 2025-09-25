package exceptions;

public class NestedTryExample {
    public static void main(String[] args) {
        try {
            // Outer try block
            int[] numbers = {1, 2, 3};

            try {
                // Inner try block
                System.out.println("Accessing element: " + numbers[5]); // ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: Invalid array index.");
            }
            

            int result = 10 / 0; // ArithmeticException
            

        } catch (ArithmeticException e) {
            System.out.println("Outer catch: Cannot divide by zero.");
        }

        System.out.println("Program continues...");
    }
}
