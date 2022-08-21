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

//  inserting new node at the last place
    public void insertLast(int item) {
        if (end == null) {
            insertFirst(item);
            size++;
        }

        Node n = new Node(item) ;
        end.next = n;
        end = n;
    }

//  inserting new node at the first place
    public void insertFirst(int item) {
        Node n = new Node(item);
        n.next = start;
        start = n;

        if (end == null) {
            end = start;
        }
        size += 1;
    }

//  function for displaying the values of the nodes
    public void display() {
        Node temp = start;
        while (temp != null) {
            System.out.print(temp.item + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

}