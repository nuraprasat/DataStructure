package com.circularlinkedlist;


public class App {
	
	public static void main(String[] args) {
		CircularLinkedList cl = new CircularLinkedList();
		cl.insertFirst(5);
		cl.insertFirst(6);
		cl.insertFirst(10);
		cl.insertLast(999);
		cl.insertFirst(111);
		cl.removeFirst();
		cl.removeLast();
		
		cl.display();
	}
	
}
