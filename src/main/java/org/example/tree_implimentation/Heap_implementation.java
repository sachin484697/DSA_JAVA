package org.example.tree_implimentation;

//Complete Binary Tree
//All levels are completely filled except possibly the last level.
//The last level is filled from left to right without any gaps.

//max-heap
//A complete binary tree where the value of each parent node is greater than or equal to its child nodes.
//The maximum element is always at the root.

//min -heap
//A complete binary tree where the value of each parent node is less than or equal to its child nodes.
//The minimum element is always at the root.
//Insert operation ensures the smallest element stays at the root using heapifyUp.
//Delete operation removes the smallest element and maintains order using heapifyDown.



//Steps for Heapify Up(used in insertion)

//Insert the element at the end of the heap.
//Compare it with its parent.
//If it violates the heap order, swap it with its parent.
//Repeat the process until the root or until it satisfies the heap property.


//Steps for Heapify Down(used in deletion)

//Remove the root node.
//Move the last element to the root.
//Compare it with its larger (or smaller for Min Heap) child.
//Swap if necessary and repeat the process until the heap property is restored.



//import java.util.Arrays;
//// Node class for Heap
//class Node {
//    int value;
//    Node left, right, parent;
//
//    public Node(int value) {
//        this.value = value;
//        left = right = parent = null;
//    }
//}
//

/// / Max Heap Class using Node-based Tree Structure

//class MaxHeap {
//    Node root;
//
//    public MaxHeap() {
//        root = null;
//    }
//
//    // Insert into Max Heap
//    public void insert(int value) {
//        Node newNode = new Node(value);
//        if (root == null) {
//            root = newNode;
//        } else {
//            Node parent = findParent();
//            if (parent.left == null)
//                parent.left = newNode;
//            else
//                parent.right = newNode;
//            newNode.parent = parent;
//            heapifyUp(newNode);
//        }
//    }
//
//    // Heapify Up (Bubble Up for Max Heap)
//    private void heapifyUp(Node node) {
//        while (node.parent != null && node.value > node.parent.value) {
//            int temp = node.value;
//            node.value = node.parent.value;
//            node.parent.value = temp;
//            node = node.parent;
//        }
//    }
//
//    // Find the correct parent for the next inserted node (using BFS)
//    private Node findParent() {
//        Queue<Node> queue = new LinkedList<>();
//        queue.add(root);
//        while (!queue.isEmpty()) {
//            Node node = queue.poll();
//            if (node.left == null || node.right == null) {
//                return node;
//            }
//            queue.add(node.left);
//            queue.add(node.right);
//        }
//        return null;
//    }
//
//    // Print Heap (In-order Traversal)
//    public void printHeap(Node node) {
//        if (node != null) {
//            printHeap(node.left);
//            System.out.print(node.value + " ");
//            printHeap(node.right);
//        }
//    }
//}
//

//// Min Heap Class using Node-based Tree Structure

//class MinHeap {
//    Node root;
//
//    public MinHeap() {
//        root = null;
//    }
//
//    // Insert into Min Heap
//    public void insert(int value) {
//        Node newNode = new Node(value);
//        if (root == null) {
//            root = newNode;
//        } else {
//            Node parent = findParent();
//            if (parent.left == null)
//                parent.left = newNode;
//            else
//                parent.right = newNode;
//            newNode.parent = parent;
//            heapifyUp(newNode);
//        }
//    }
//
//    // Heapify Up (Bubble Up for Min Heap)
//    private void heapifyUp(Node node) {
//        while (node.parent != null && node.value < node.parent.value) {
//            int temp = node.value;
//            node.value = node.parent.value;
//            node.parent.value = temp;
//            node = node.parent;
//        }
//    }
//
//    // Find the correct parent for the next inserted node (using BFS)
//    private Node findParent() {
//        java.util.Queue<Node> queue = new java.util.LinkedList<>();
//        queue.add(root);
//        while (!queue.isEmpty()) {
//            Node node = queue.poll();
//            if (node.left == null || node.right == null) {
//                return node;
//            }
//            queue.add(node.left);
//            queue.add(node.right);
//        }
//        return null;
//    }
//
//    // Print Heap (In-order Traversal)
//    public void printHeap(Node node) {
//        if (node != null) {
//            printHeap(node.left);
//            System.out.print(node.value + " ");
//            printHeap(node.right);
//        }
//    }
//}
//
//// Main class to test MaxHeap and MinHeap
//public class HeapTreeImplementation {
//    public static void main(String[] args) {
//        System.out.println("Max Heap:");
//        MaxHeap maxHeap = new MaxHeap();
//        maxHeap.insert(10);
//        maxHeap.insert(20);
//        maxHeap.insert(5);
//        maxHeap.insert(30);
//        maxHeap.insert(15);
//        maxHeap.printHeap(maxHeap.root);
//
//        System.out.println("\n\nMin Heap:");
//        MinHeap minHeap = new MinHeap();
//        minHeap.insert(10);
//        minHeap.insert(20);
//        minHeap.insert(5);
//        minHeap.insert(30);
//        minHeap.insert(15);
//        minHeap.printHeap(minHeap.root);
//    }
//}








// converting an unsorted array to min and max heap

//class MaxHeap {
//    int[] heap;
//    int size;
//
//    public MaxHeap(int capacity) {
//        heap = new int[capacity];
//        size = 0;
//    }
//
//    // Insert into Max Heap
//    public void insert(int value) {
//        if (size == heap.length)
//        return; // Heap  is full
//        heap[size] = value;
//        int current = size;
//        size++;
//
//        // Heapify Up (Bubble Up)
//        while (current > 0 && heap[current] > heap[(current - 1) / 2]) {
//            int temp = heap[current];
//            heap[current] = heap[(current - 1) / 2];
//            heap[(current - 1) / 2] = temp;
//            current = (current - 1) / 2;
//        }
//    }
//
//    public void printHeap() {
//        System.out.println(Arrays.toString(Arrays.copyOf(heap, size)));
//    }
//}
//
//class MinHeap {
//    int[] heap;
//    int size;
//
//    public MinHeap(int capacity) {
//        heap = new int[capacity];
//        size = 0;
//    }
//
//    // Insert into Min Heap
//    public void insert(int value) {
//        if (size == heap.length) return; // Heap full
//        heap[size] = value;
//        int current = size;
//        size++;
//
//        // Heapify Up (Bubble Up)
//        while (current > 0 && heap[current] < heap[(current - 1) / 2]) {
//            int temp = heap[current];
//            heap[current] = heap[(current - 1) / 2];
//            heap[(current - 1) / 2] = temp;
//            current = (current - 1) / 2;
//        }
//    }
//
//    public void printHeap() {
//        System.out.println(Arrays.toString(Arrays.copyOf(heap, size)));
//    }
//}
//
//public class HeapInsertion {
//    public static void main(String[] args) {
//        System.out.println("Max Heap:");
//        MaxHeap maxHeap = new MaxHeap(10);
//        maxHeap.insert(10);
//        maxHeap.insert(20);
//        maxHeap.insert(5);
//        maxHeap.insert(30);
//        maxHeap.insert(15);
//        maxHeap.printHeap();
//
//        System.out.println("\nMin Heap:");
//        MinHeap minHeap = new MinHeap(10);
//        minHeap.insert(10);
//        minHeap.insert(20);
//        minHeap.insert(5);
//        minHeap.insert(30);
//        minHeap.insert(15);
//        minHeap.printHeap();
//    }
//}

//  Insert 10:
//      10
//
//   Insert 20:
//      20
//      /
//  10
//
//  Insert 5:
//      20
//      /  \
//     10   5
//
//  Insert 30:
//       30
//      /  \
//     20   5
//    /
//  10
//
//      Insert 15:
//         30
//       /  \
//      20   5
//      /  \
//      10  15

