package exceptions;

public class ArrayExceptionsExample {
	 public static void main(String[] args) {
	        int[] numbers = {10, 20, 30};

	        try {
	            System.out.println(numbers[3]); // index 3 doesn't exist
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Oops! You're trying to access an index that doesn't exist.");
	        }
	    }

}
