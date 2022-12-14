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
            this.prev = prev;
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
        size++;
    }

    public void insertLast(int value) {
        Node node = new Node(value);
        node.next = null;
        Node last = head;

        if (head == null) {
            node.prev = null;
            head = node;
//            insertFirst(value);          //   we can try like this also
            size++;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;
        size++;
    }

    public void insert(int after, int value) {
       Node temp = find(after);

       if (temp == null) {
           System.out.println("Does not exit");
           return;
       }

       Node node = new Node(value);
       node.next = temp.next;
       temp.next = node;
       node.prev = temp;
       if (node.next != null) {
           node.next.prev = node;
       }
       size++;

    }

    public void deleteFirst() {
        if (head.next == null) {
            head = null;
            size--;
            return;
        }
        head = head.next;
        head.prev = null;
        size--;
    }

    public void deleteLast() {
        Node temp = head;
        if (head == null) {
            System.out.println("Node is empty");
            return;
        } else {
            Node last = null;
            while (temp.next != null) {
                last = temp;
                temp = temp.next;
            }
            if (last == null) {
                head = null;
            }else {
                last.next = null;
            }
        }
        size--;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
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

    public int showSize() {
        return size;
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

