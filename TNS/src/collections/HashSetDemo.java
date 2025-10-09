package collections;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Blue");
        set.add("Red"); // duplicates ignored

        System.out.println("HashSet Elements: " + set);

        // Iterate
        for(String color : set){
            System.out.println(color);
        }
    }
}