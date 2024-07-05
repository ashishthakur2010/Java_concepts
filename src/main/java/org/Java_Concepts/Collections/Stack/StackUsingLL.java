package org.Java_Concepts.Collections.Stack;

import org.Java_Concepts.Collections.LinkedList.MyLinkedList;

public class StackUsingLL {
       Node top = null;
     static class Node {
         int data;
         Node next;

         Node(int data){
             this.data=data;
             this.next=null;
         }
     }

     public void push(int data){
         System.out.println("insert a data: "+data);
         Node new_node = new Node(data);
         if(top==null){
             top=new_node;
         }
         else{
             new_node.next=top;
             top=new_node;
         }
     }

     public void pop(){
         if(top==null){
             System.out.println("Stack is Empty");
         }
         else{
             System.out.println("poped a data: "+top.data);
             top = top.next;
         }
     }
    public void PrintStack() {
        StackUsingLL.Node n = top;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String[] args) {
         StackUsingLL stack = new StackUsingLL();
         stack.push(10);
         stack.push(20);
         stack.push(30);
         stack.pop();
         stack.PrintStack();
    }


}
