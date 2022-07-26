package com.bridgelabz.linkedList;


public class DeleteLastLinkedList {
	
	Node head;

	class Node {
		int data;
		Node next;

		 public Node (int data) {    
			this.data = data;
			this.next = null;
		}
	}
	
	 public void addFirst(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	        newNode.next = head;
	        head = newNode;

	    }

	    public void addLast(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	        Node currentNode = head;
	        while (currentNode.next != null) {
	            currentNode = currentNode.next;
	        }
	        currentNode.next = newNode;
	    }
	    

	    public void printList() {
	        if (head == null) {
	            System.out.println("List is empty");
	            return;
	        }
	        Node currentNode = head;
	        while (currentNode != null) {
	            System.out.print(currentNode.data + " -> ");
	            currentNode = currentNode.next;
	        }
	        System.out.println("null");
	    }

	   

	    public void deleteLast() {
	        if (head == null) {
	            System.out.println("This list is empty");
	            return;
	        }
	        if (head.next == null) {
	            head = null;
	            return;
	        }

	        Node secondLast = head;
	        Node lastNode = head.next;
	        while (lastNode.next != null) {
	            lastNode = lastNode.next;
	            secondLast = secondLast.next;
	        }
	        secondLast.next = null;

	    }
	public static void main(String[] args) {
	System.out.println("After Deleting Last Element in the list :");
	
	   DeleteLastLinkedList list = new DeleteLastLinkedList();
	   list.addFirst(56);
	   list.addLast(70);
	   list.addLast(70);
	   list.printList();
	   list.deleteLast();
	   list.printList();
	   
	}
	
}
	
	
	






