package com.circularlinkedlist;

public class CircularLinkedList {
	private Node first;
	private Node last;

	public CircularLinkedList() {
		this.first = null;
		this.last = null;
	}

	public void insertLast(int n) {
		Node newNode = new Node();
		newNode.data = n;

		if (first == null) {
			first = newNode;
		}
		last.next = newNode;
		last = newNode;
	}

	public void insertFirst(int n) {
		Node newNode = new Node();
		newNode.data = n;

		if (last == null) {
			last = newNode;
		}
		newNode.next = first;
		first = newNode;
	}

	public int removeLast() {
		Node currentNode = first;
		int n = last.data;
		while (currentNode.next.data != n) {
			currentNode = currentNode.next;
		}

		currentNode.next = null;
		last = currentNode;

		return n;
	}

	public int removeFirst() {
		int n = first.data;
		first = first.next;
		return n;
	}

	public int getFirst() {
		return first.data;
	}

	public int getLast() {
		return last.data;
	}

	public void display() {
		Node currentNode = first;

		while (currentNode != null) {
			currentNode.display();
			currentNode = currentNode.next;
		}
	}

}
