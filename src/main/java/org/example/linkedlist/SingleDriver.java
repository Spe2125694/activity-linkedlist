package org.example.linkedlist;

public class SingleDriver {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new SinglyLinkedList<>();

        linkedList.addFirst("First");
        linkedList.addFirst("Second");
        linkedList.addFirst("Third");
        linkedList.addFirst("Fourth");
        linkedList.addFirst("Fifth");

        System.out.println(linkedList);

        linkedList.addLast("Sixth");
        linkedList.addLast("Seventh");
        linkedList.addLast("Eighth");

        System.out.println(linkedList);

        linkedList.pollFirst();
        linkedList.pollFirst();

        System.out.println(linkedList);

        linkedList.pollLast();
        linkedList.pollLast();

        System.out.println(linkedList);
    }
}
