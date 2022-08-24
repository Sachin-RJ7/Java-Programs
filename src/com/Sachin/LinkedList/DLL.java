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

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

}

