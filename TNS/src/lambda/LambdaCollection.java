package lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaCollection {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("All Fruits:");
        // Lambda to print each fruit
        fruits.forEach(fruit -> System.out.println(fruit));

        System.out.println("\nFruits starting with 'M':");
        // Lambda + Stream to filter
        fruits.stream()
              .filter(fruit -> fruit.startsWith("M"))
              .forEach(fruit -> System.out.println(fruit));
    }
}