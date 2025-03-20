package org.example.Stack;

public class Stack_using_linkedList {

     static class StackLinkedList {

         //creation of stack as linkedlist
        private class Node {
            int data;
            Node next;
        }

        private Node top;

        // Constructor
        public StackLinkedList() {
            top = null;
        }

        // Push operation
        public void push(int x) {
            Node newNode = new Node();
            newNode.data = x;
            newNode.next = top;
            top = newNode;
        }

        // Pop operation
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow");
                return -1;
            }
            int data = top.data;
            top = top.next;
            return data;
        }

        // Peek operation
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return top.data;
        }

        // isEmpty check
        public boolean isEmpty() {
            return top == null;
        }

        // Size of stack
        public int size() {
            int count = 0;
            Node temp = top;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }


        public static void main(String[] args) {
            StackLinkedList stack = new StackLinkedList();

            stack.push(10);
            stack.push(20);
            stack.push(30);

            System.out.println("Top element: " + stack.peek());
            System.out.println("Stack size: " + stack.size());

            stack.pop();
            System.out.println("Top element after pop: " + stack.peek());




            // Push elements
            stack.push(10);
            stack.push(20);
            stack.push(30);

            // Peek top element
            System.out.println("Top element: " + stack.peek());

            // Pop element
            stack.pop();
            System.out.println("Top element after pop: " + stack.peek());

            // Check if stack is empty
            System.out.println("Is stack empty? " + stack.isEmpty());

            // Stack size
            System.out.println("Stack size: " + stack.size());

        }
    }
}
