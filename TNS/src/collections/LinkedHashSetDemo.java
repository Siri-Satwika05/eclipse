package collections;


import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Dog");
        set.add("Cat");
        set.add("Elephant");
        set.add("Dog"); // duplicates ignored

        System.out.println("LinkedHashSet Elements (Insertion Order Maintained): " + set);

        for(String animal : set){
            System.out.println(animal);
        }
    }
}