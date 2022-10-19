package org.example.linkedlist;

import java.util.ArrayList;

public class SinglyLinkedList<E> implements LinkedList<E> {

    private Node head;
    private Node tail;

    @Override
    public void addFirst(E element) {

    }

    @Override
    public void addLast(E element) {

    }

    @Override
    public E pollFirst() {
        return null;
    }

    @Override
    public E pollLast() {
        return null;
    }

    @Override
    public E peekFirst() {
        return head.element;
    }

    @Override
    public E peekLast() {
        return tail.element;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(E element) {
        return false;
    }

    private class Node{
        Node next;
        E element;

        public Node(E element, Node next) {
            this.element = element;
            this.next = next;
        }
    }
}
