package com.Sachin.LinkedList;

//                   InterviewQuestion Question

class MergeSort {
    static class ListNode {

        int data;
        ListNode next;

        ListNode() {
        }


        ListNode(int d) {
            data = d;
            next = null;
        }

        public int getData() {
            return data;
        }
    }

    static ListNode head;
    static ListNode tail;

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left, right);
    }

    public ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;
        while (list1 != null && list2 != null) {
            if (list1.data < list2.data) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1 != null) ? list1 : list2;
        return dummyHead.next;
    }

    public ListNode getMid(ListNode head) {
        ListNode midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }

    // recursion reverse
    private void reverse(ListNode node) {
        if (node == tail) {
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    public void printList(ListNode headref) {
        while (headref != null) {
            System.out.print(headref.data + " ");
            headref = headref.next;
        }
    }

    public static void main(String[] args) {
        MergeSort list = new MergeSort();
        head = new ListNode(50);
        head.next = new ListNode(20);
        head.next.next = new ListNode(15);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(10);

        list.printList(list.sortList(head));


    }
}