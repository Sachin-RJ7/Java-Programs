package com.Sachin.LinkedList;

public class Main {
    public static void main(String[] args) {
//        SLL list = new SLL();
//        list.insertFirst(3);
//        list.insertFirst(5);
//        list.insertFirst(8);
//        list.display();
//        list.insertLast(100);
//        list.insertLast(200);
//        list.display();
//        list.insert(9,3);
//        list.display();
//        list.deleteFirst();
//        list.display();
//        list.insert(10,8);
//        list.display();
//        list.deleteLast();
//        list.display();

//      Double Linked list
        DLL list = new DLL();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertLast(5);
        list.insert(6,55);

        list.display();
        list.displayRev();

    }
}
