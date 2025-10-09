package collections;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Banana");
        set.add("Apple");
        set.add("Mango");
        set.add("Apple"); // duplicates ignored

        System.out.println("TreeSet Elements (Sorted): " + set);

        for(String fruit : set){
            System.out.println(fruit);
        }
    }
}