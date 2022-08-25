package com.Sachin.LinkedList;

public class DLL {
    private class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public DLL() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node n = new Node(value);
        if (head != null) {
            head.prev = n;
        }
        n.next = head;
        n.prev = null;
        head = n;
    }

    public void insertLast(int value) {
        Node node = new Node(value);
        node.next = null;
        Node last = head;

        if (head == null) {
            node.prev = null;
            head = node;
//            insertFirst(value);          //   we can try like this also
            return;
        }

        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }

    public void displayRev() {
        System.out.println("Print in reverse");
        Node n = head;
        Node last = null;
        while (n != null) {
            last = n;
            n = n.next;
        }

        while (last != null) {
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

}

