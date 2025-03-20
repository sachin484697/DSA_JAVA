package org.example.Stack;

class Stack {
    private int[] arr; // Array to store stack elements
    private int top; // Top of stack
    private int capacity; // Maximum capacity of the stack

    // Constructor to initialize the stack
    public Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1; // Stack is initially empty
    }

    // Push operation
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + value);
            return;
        }
        arr[++top] = value;
    }

    // Pop operation
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! No elements to pop.");
            return -1;
        }
        return arr[top--];
    }

    // Peek operation (get top element)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return arr[top];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Display stack elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main method to test the stack
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println("Popped: " + stack.pop());
        System.out.println("Peek: " + stack.peek());

        stack.display();
    }
}
