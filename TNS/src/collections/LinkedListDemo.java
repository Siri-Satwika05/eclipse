package collections;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.addFirst(5);  // Add at beginning
        list.addLast(40);  // Add at end

        System.out.println("LinkedList Elements: " + list);

        // Iterate
        for(int num : list){
            System.out.println(num);
        }
    }
}