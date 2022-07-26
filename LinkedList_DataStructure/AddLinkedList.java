package com.bridgelabz.linkedList;


public class AddLinkedList {	
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
	
	public void printList() {
		if (head == null) {
			System.out.println("List is Empty");
			return;
			
		}
		Node currentNode = head;
		while (currentNode != null)  {
			System.out.print(currentNode.data +"->" );
			currentNode = currentNode.next;
		}
		System.out.println("null");

	}

	public static void main(String[] args) {
		System.out.println("Elements added in the list are :");
		
		AddLinkedList list=new AddLinkedList();
		list.addFirst(70);
		list.addFirst(30);
		list.addFirst(56);
		list.printList();

	}

}

	
	        