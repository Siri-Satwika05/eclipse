package collections;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("One");
        stack.push("Two");
        stack.push("Three");

        System.out.println("Stack Elements: " + stack);

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element: " + stack.peek());

        System.out.println("Stack after pop: " + stack);
    }
}