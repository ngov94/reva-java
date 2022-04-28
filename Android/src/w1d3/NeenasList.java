package w1d3;


public class NeenasList<T> {
//	a way to store things sequentially..like an arraylist
	
	/*
	 * list are essentially sequential - they are an ordered list that
	 * we can add, remove, and get indexes from
	 * 
	 * queues are first in first out structure
	 * stacks are last in first out
	 */
	
	ListNode<T> head;
	
	/*
	 * default constructor - don't need to specify
	 * public NeenasList(){
	 * 	head = null;
	 * }
	 */
	
	public void addToFront(T w) {
		ListNode<T> newNode = new ListNode<T>(w);
		newNode.setNext(head);
		head = newNode;
		System.out.println("Added node "+ w + " to front");
		
	}
	
	public void removeFromFront() {
		if(head!=null)
			head = head.getNext();
	}
	
	public T getIndex(int index) {
		ListNode<T> current = head;
		for(int i= 0; i < index; i++) {
			current = current.getNext();
		}
		return (T) current.getData();
	}
	
	public void removeIndex(int n) {
		ListNode<T> current = head;
		ListNode<T> prev  = null;
		for(int i = 0; i < n; i++) {
			prev = current;
			current = current.getNext();
		}
		prev.setNext(current.getNext());
		//if nothing is pointing to an object in java anymore
		//it is  removed from memory automatically
		//this is called garbage collection in java
	}
	
	public String toString() {
		String out = "";
		ListNode<T> current = head;
		while(current != null) {
			out += current.toString() +", ";
			current = current.getNext();
		}
		return out;
	}
	
	
	//TASK 1
	//linkedlist add at index
	public void addAtIndex(T t, int index) {
		ListNode<T> newNode = new ListNode<T>(t);
		ListNode<T> current = head;
		ListNode<T> prev  = null;
		for(int i = 0; i < index; i++) {
			prev = current;
			current = current.getNext();
		}
		
		newNode.setNext(current);
		prev.setNext(newNode);
	}
	
	//TASK 2
	//linked list contains
	public boolean contains(T t) {
		return true;//CHANGE
	}
	
	//TASK 3
	//linked list .equals(another linked list)
	public boolean equalList(ListNode<T> otherList) {
		return true;//CHANGE
	}
	
	
}
