package cevap1;

import java.util.Iterator;

public class Linked<T> implements List<T> {

	public Node<T> first;
	public Node<T> last;
	public int size;

	private static class Node<T> {
		T item;
		Node<T> next;
		Node<T> prev;

		public Node(T item) {
			super();
			this.item = item;
			next = null;
			prev = null;
		}
	}

	//Listenin başına eleman ekleme
	public void listAddFirst(T t) {
		Node<T> newNode = new Node(t);
		if (last == null) {
			last = newNode;
			size++;
		} else {
			first.prev = newNode;
			size++;
		}
		newNode.next = first;
		first = newNode;

	}

	// Listenin eleman sayısını yazdırma
	public void sizePrint() {
		System.out.println("List element size : " + size);

	}

	// Listenin ilk elemanını silme
	public void listRemoveFirst(T t) {
		Node<T> newNode = new Node(t);
		if (first == null) {
			last = null;
		} else {

			first.prev = null;
		}
	}

	// Listenin sonuna eleman ekleme
	@Override
	public void lastAddList(T t) {
		Node<T> newNode = new Node(t);
		if (first == null) {
			first = newNode;
			size++;
		} else {
			last.next = newNode;
			size++;
		}
		newNode.prev = last;
		last = newNode;

	}

//	Listenin sonunda ki elemanı silme
	@Override
	public void lastRemoveList() {
		last = last.prev;
		if (last == null) {
			first = null;
		} else {
			last.next = null;
		}

	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
