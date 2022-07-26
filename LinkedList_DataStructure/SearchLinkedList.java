package com.bridgelabz.linkedList;


public class SearchLinkedList {
	
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

	    public void findNode(int data) {
	        Node currentNode = head;
	        while (currentNode != null) {
	            if (currentNode.data == data) {
	                System.out.println(data + " Element found in the list ");
	            }
	            currentNode = currentNode.next;
	        }
	    }
	        
	        public static void main(String[] args) {
	        	System.out.println("Elements added in the list are :");
	        	
	        	SearchLinkedList list = new SearchLinkedList();
	        	   list.addFirst(56);
	        	   list.addLast(30);
	        	   list.addLast(70);
	        	   list.printList();
	        	   list.findNode(30);
	        	   
	        	   
	        }
	        
}
	        	   
	        	   
	        	
	        
	        


	        	
	        	    
	

  


