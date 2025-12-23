package JavaCollections;

import java.util.LinkedList;

public class LinkedLIists {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.addFirst(5);
        list.addLast(30);

        list.offer(40);
        list.offerFirst(1);
        list.offerLast(50);

        System.out.println("LinkedList: " + list);
        System.out.println("Size: " + list.size());
        System.out.println("First (getFirst): " + list.getFirst());
        System.out.println("Last  (getLast): " + list.getLast());
        System.out.println("Index 2 (get): " + list.get(2));

        System.out.println("peekFirst: " + list.peekFirst());
        System.out.println("peekLast : " + list.peekLast());

        list.removeFirst();
        list.removeLast();

        list.remove(Integer.valueOf(20));
        if (list.size() > 1) {
            list.remove(1);
        }

        System.out.println("After removals: " + list);

        Integer polled = list.poll();
        System.out.println("poll(): " + polled + " -> " + list);

        list.clear();
        System.out.println("After clear: " + list + " (isEmpty=" + list.isEmpty() + ")");
    }
}