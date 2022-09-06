package com.Sachin.Stack;

public class QueueMain {
    public static void main(String[] args) throws Exception {
//        CustomQueue queue = new CustomQueue(5);
//        queue.insert(3);
//        queue.insert(4);
//        queue.insert(5);
//        queue.insert(6);
//        queue.insert(7);
//
//        queue.display();
//        System.out.println(queue.remove());
//        queue.display();

//        CircularQueue queue = new CircularQueue(5);
//        queue.insert(3);
//        queue.insert(4);
//        queue.insert(5);
//        queue.insert(6);
//        queue.insert(7);
//
//        queue.display();
//        System.out.println(queue.remove());
//        queue.remove();
//        queue.insert(77);
//        queue.display();

        DynamicQueue queue = new DynamicQueue(5);
        queue.insert(11);
        queue.insert(22);
        queue.insert(33);
        queue.insert(44);
        queue.insert(55);
        queue.insert(66);
        queue.display();
        queue.insert(99);
        queue.display();
    }
}
