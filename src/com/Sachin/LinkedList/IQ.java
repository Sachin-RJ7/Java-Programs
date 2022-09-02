package com.Sachin.LinkedList;

//                   InterviewQuestion Question

class IQ {

    static Node head;
    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }

        public int getData() {
            return data;
        }
    }

    // Function that detects loop in the list
    public boolean hasCycle(Node node) {
        if (head == null) {
            return false;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }



//  find length of the cycle
    public int lengthCycle() {
        if (head == null) {
            return 0;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
//                calculate the length
                Node temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow) ;
                return length;
            }
        }
        return 0;
    }

    public boolean isHappy ( int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (slow != fast );

        if (slow == 1)  {
            return true;
        }
        return false;
    }

    private int findSquare(int number) {
        int ans = 0;
        while (number > 0 ) {
            int rem = number % 10;
            ans  += rem *rem;
            number /= 10;
        }
        return ans;
    }

//    find middle value from the list
    public Node middleNode(Node head) {
        Node s = head;
        Node f = head;

        while(f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
//        System.out.println("Middle Value: " + s.data);
    }


    public static void main(String[] args) {
        IQ list = new IQ();
        head = new Node(50);
        head.next = new Node(20);
        head.next.next = new Node(15);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(10);

        // Creating a loop for testing
//        head.next.next.next.next.next = head.next.next;

        System.out.println(list.hasCycle(head));
        System.out.println("Length of cycle: " + list.lengthCycle());

        System.out.println("isHappy: " + list.isHappy(89));

        System.out.println(list.middleNode(head).getData());;

    }
}