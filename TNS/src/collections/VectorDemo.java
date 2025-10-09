package collections;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(100);
        vector.add(200);
        vector.add(300);

        System.out.println("Vector Elements: " + vector);

        vector.remove(1); // remove element at index 1
        System.out.println("After removing index 1: " + vector);

        vector.add(1, 150); // insert at index 1
        System.out.println("After adding 150 at index 1: " + vector);
    }
}