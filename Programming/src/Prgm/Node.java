package Prgm;

class Node {
 int data;
 Node next;
 Node prev;

 // Constructor to initialize a node with given data
 public Node(int data) {
     this.data = data;
     this.next = null;
     this.prev = null;
 }
}

//DoublyLinkedList class to represent the doubly linked list
class DoublyLinkedList {
 Node head;

 // Constructor to initialize an empty doubly linked list
 public DoublyLinkedList() {
     this.head = null;
 }

 // Method to insert a new node at the end of the list
 public void insertAtEnd(int data) {
     Node newNode = new Node(data);

     if (head == null) {
         // If the list is empty, make the new node the head
         head = newNode;
     } else {
         // Traverse to the end of the list
         Node current = head;
         while (current.next != null) {
             current = current.next;
         }

         // Insert the new node at the end
         current.next = newNode;
         newNode.prev = current;
     }
 }

 // Method to print the elements of the doubly linked list
 public void display() {
     Node current = head;

     // Traverse and print each node's data
     while (current != null) {
         System.out.print(current.data + " ");
         current = current.next;
     }
     System.out.println();
 }
}




