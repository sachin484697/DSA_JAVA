package org.example.Linked_List;

public class Linked_List {
    public static void main(String[] args) {
        // Node class to represent each node in the Linked List
        class Node {
            int data;
            Node next;

            // Constructor to initialize node with data
            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        // LinkedList class with various operations
        class LinkedList {
            private Node head;

            // Insert at the beginning - O(1)
            public void insertAtBeginning(int data) {
                Node newNode = new Node(data);
                newNode.next = head;
                head = newNode;
            }

            // Insert at the end - O(n)
            public void insertAtEnd(int data) {
                Node newNode = new Node(data);
                if (head == null) {
                    head = newNode;
                    return;
                }
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }

            // Insert at a specific position - O(n)
            public void insertAtPosition(int data, int position) {
                if (position < 1) {
                    System.out.println("Invalid position!");
                    return;
                }

                Node newNode = new Node(data);

                if (position == 1) {
                    newNode.next = head;
                    head = newNode;
                    return;
                }

                Node temp = head;
                for (int i = 1; i < position - 1 && temp != null; i++) {
                    temp = temp.next;
                }

                if (temp == null) {
                    System.out.println("Position out of bounds!");
                    return;
                }

                newNode.next = temp.next;
                temp.next = newNode;
            }

            // Delete from the beginning - O(1)
            public void deleteFromBeginning() {
                if (head == null) {
                    System.out.println("List is empty!");
                    return;
                }
                head = head.next;
            }

            // Delete from the end - O(n)
            public void deleteFromEnd() {
                if (head == null) {
                    System.out.println("List is empty!");
                    return;
                }

                if (head.next == null) {
                    head = null;
                    return;
                }

                Node temp = head;
                while (temp.next.next != null) {
                    temp = temp.next;
                }
                temp.next = null;
            }

            // Delete from a specific position - O(n)
            public void deleteAtPosition(int position) {
                if (position < 1 || head == null) {
                    System.out.println("Invalid position or list is empty!");
                    return;
                }

                if (position == 1) {
                    head = head.next;
                    return;
                }

                Node temp = head;
                for (int i = 1; i < position - 1 && temp.next != null; i++) {
                    temp = temp.next;
                }

                if (temp.next == null) {
                    System.out.println("Position out of bounds!");
                    return;
                }

                temp.next = temp.next.next;
            }

            // Search an element - O(n)
            public boolean search(int key) {
                Node temp = head;
                while (temp != null) {
                    if (temp.data == key) {
                        return true;
                    }
                    temp = temp.next;
                }
                return false;
            }

            // Display the linked list - O(n)
            public void display() {
                if (head == null) {
                    System.out.println("List is empty!");
                    return;
                }
                Node temp = head;
                while (temp != null) {
                    System.out.print(temp.data + " -> ");
                    temp = temp.next;
                }
                System.out.println("NULL");
            }

            // Get the size of the linked list - O(n)
            public int getSize() {
                int count = 0;
                Node temp = head;
                while (temp != null) {
                    count++;
                    temp = temp.next;
                }
                return count;
            }
        }
    }
}


