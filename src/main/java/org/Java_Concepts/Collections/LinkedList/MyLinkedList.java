package org.Java_Concepts.Collections.LinkedList;

public class MyLinkedList {

    Node head;
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void PrintMyLinkedList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static void main (String[] args) {
        MyLinkedList list = new MyLinkedList();
             Node node1 = list.new Node(10);
             list.head = node1;
             Node node2 = list.new Node(20);
             node1.next = node2;
             Node node3 = list.new Node(30);
             node2.next = node3;

             list.PrintMyLinkedList();
    }
}
