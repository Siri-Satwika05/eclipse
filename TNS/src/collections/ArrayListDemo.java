package collections;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Apple"); // duplicates allowed

        System.out.println("ArrayList Elements: " + list);

        // Iterate
        for(String fruit : list){
            System.out.println(fruit);
        }
    }
}