package com.Sachin.LinkedList;

public class CLL {
    private class Node {
        int item;
        Node next;

        public Node(int item) {
            this.item = item;
        }
    }
    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void delete(int value) {
        Node node  = head;
        if (node == null) {
            System.out.println("List is empty --");
            return;
        }
        if (node.item == value) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if (n.item == value) {
                node.next = n.next;
                break;
            }
            node = node.next;
        }while (node != head);
    }

    public void insert(int value, int data) {
        Node node = new Node(data);
        Node temp = tail;
        while (temp != null) {
            if (temp.item == value) {
                break;
            }
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("List is empty or value is not found");
        }
        else {
            node.next = temp.next;
            temp.next = node;
        }
    }

    public void insertLast(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        if (head == null) {
            node.next = node;
            head = node;
//            tail = node;
        }
        else {
            node.next = head;
            head = node;
            tail.next = node;
        }
    }

    public void display() {
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(temp.item + " -> ");
                temp = temp.next;
            }while (temp != head);
        }
        System.out.println("HEAD");
    }

}
