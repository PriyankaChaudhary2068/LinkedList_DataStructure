package com.bridgelabz.linkedList;


public class AppendLinkedList {
	

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

    public void appendingNode(int before, int data) {
        Node currentNode = head;
        while (currentNode.data != before) {
            currentNode = currentNode.next;
        }
        Node node = new Node(data);
        node.next = currentNode.next;
        currentNode.next = node;

    }


      public static void main(String[] args) {
		System.out.println("Elements Appending in the list are :");
		
		AppendLinkedList list = new AppendLinkedList();
		list.addFirst(56);
		list.appendingNode(56,30);
		list.appendingNode(30,70);
		list.printList();
		
    }

}



