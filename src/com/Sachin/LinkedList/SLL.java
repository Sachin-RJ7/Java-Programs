package com.Sachin.LinkedList;

public class SLL {

    private class Node {
        private int item;
        private Node next;

        public Node(int item) {
            this.item = item;
        }

//        public Node(int value, Node next) {
//            this.value = value;
//            this.next = next;
//        }
    }

    private Node start;
    private Node end ;
    private int size;

    public SLL() {
        this.size = 0;
    }

    public void insertFirst(int item) {
        Node n = new Node(item);
        n.next = start;
        start = n;

        if (end == null) {
            end = start;
        }
        size += 1;
    }

    public void display() {
        Node temp = start;
        while (temp != null) {
            System.out.print(temp.item + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

}