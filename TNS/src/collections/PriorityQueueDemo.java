package collections;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);

        System.out.println("PriorityQueue Elements (natural order):");
        while(!pq.isEmpty()){
            System.out.println(pq.poll()); // removes in priority order
        }
    }
}