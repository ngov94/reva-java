package w1d3;

public class ListNode<T> {
	
	private T data;
	private ListNode<T> next;

	public ListNode(T t) {
		data = t;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public ListNode<T> getNext() {
		return next;
	}
	public void setNext(ListNode<T> next) {
		this.next = next;
	}
	
	public String toString() {
		return data.toString();
	}
}
