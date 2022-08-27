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
//        DLL list = new DLL();
//        list.insertFirst(3);
//        list.insertFirst(4);
//        list.insertLast(5);
//        list.insert(4,55);
//        list.display();
//        list.deleteFirst();
//        list.deleteLast();
//
//        list.display();
//        list.displayRev();
//        System.out.println("size: " + list.showSize());

        CLL list = new CLL();
        list.insertLast(33);
        list.insertLast(45);
        list.insertFirst(11);
        list.insertLast(55);
        list.insert(33,77);
        list.insertLast(99);
        list.insertFirst(1);

        list.display();
    }
}
