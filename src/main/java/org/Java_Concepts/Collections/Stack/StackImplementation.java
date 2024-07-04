package org.Java_Concepts.Collections.Stack;

public class StackImplementation {

    int size;
    int[] arr ;
    int top;

    StackImplementation(int n) {
        this.size = n;
        this.arr = new int[this.size];
        this.top = -1;
    }

    boolean isEmpty() {
       if (top==-1){
           System.out.println("Stack is empty");
           return true;
       }
       else{
           System.out.println("Stack is not empty");
           return false;
       }

    }

    boolean isFull() {
        if (top == (size - 1)) {
            System.out.println("Stack is Full");
            return true;
        } else {
            System.out.println("Stack is not Full");
            return false;
        }
    }

    void peek(){
       if(!isEmpty()) {
           System.out.println(arr[top]);
       }
       else
           System.out.println("Stack is Empty, no Item found");
    }

    void push(int item){
       if(!isFull()){//top=-1 => ++top :0
           arr[++top] = item;  //++i for=>i++
           System.out.println(arr[top]);
       }
       else
           System.out.println("Stack is full");
    }

    void pop(){
        if(!isEmpty()){
            //top=top-1;
            System.out.println("Poping out Item: "+arr[top]);
            top--;
        }
        else
            System.out.println("Stack is Empty, can't pop out Item");
    }


    public static void main(String[] args) {
        StackImplementation s = new StackImplementation(3);
        s.isEmpty();
        s.isFull();
        s.peek();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.pop();


    }

}