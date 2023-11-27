package Prgm;

public class Main {
	 public static void main(String[] args) {
	     // Create a new doubly linked list
	     DoublyLinkedList dll = new DoublyLinkedList();

	     // Insert some elements into the list
	     dll.insertAtEnd(1);
	     dll.insertAtEnd(2);
	     dll.insertAtEnd(3);

	     // Display the elements of the list
	     System.out.print("Doubly Linked List: ");
	     dll.display();
	 }
	}