package org.example.queue;

public class Queue {

    //Enqueue (O(1)) → Add element to the rear.
    //Dequeue (O(1)) → Remove element from the front.
    //Peek (O(1)) → Get front element without removing it.
    //isEmpty (O(1)) → Check if queue is empty.
    //isFull (O(1)) → Check if queue is full.
    //Display (O(n)) → Print queue elements.

    private int front;
    int rear;
    int size;
    int capacity;
    private int[] queue;

    // Constructor to initialize the queue
    public Queue(int capacity) {
        this.capacity = capacity;// dynamically assigning  the capacity
        this.front = this.size = 0;
        this.rear = capacity - 1;
        this.queue = new int[capacity];
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Enqueue operation (Insert element at rear)
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + item);
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        size++;
        System.out.println(item + " enqueued to the queue.");
    }

    // Dequeue operation (Remove element from front)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return Integer.MIN_VALUE;
        }
        int item = queue[front];
        front = (front + 1) % capacity;
        size--;
        System.out.println(item + " dequeued from the queue.");
        return item;
    }

    // Peek operation (Get front element)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return Integer.MIN_VALUE;
        }
        return queue[front];
    }

    // Get the size of the queue
    public int getSize() {
        return size;
    }

    // Display the queue elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.display();

        q.dequeue();
        q.dequeue();

        q.display();

        System.out.println("Front element is: " + q.peek());
        System.out.println("Queue size is: " + q.getSize());

        q.enqueue(60);
        q.enqueue(70);

        q.display();

    }
}
