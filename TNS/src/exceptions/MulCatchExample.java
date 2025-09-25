package exceptions;

public class MulCatchExample {
	public static void main(String[] args) {
        String input = "abc";  // Try changing to "100"
        int divisor = 0;

        try {
            int number = Integer.parseInt(input);  // May throw NumberFormatException
            int result = number / divisor;         // May throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Input is not a number.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
    }

}
