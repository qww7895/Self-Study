
public class Node<T> {
	private T t;
	private Node<T> next;
	public Node() {//������ �����ε�
		t=null;
		next=null;
	}
	public Node(T t) {
		t=t;
		this.next=null;
	}
	public void push(T t) {//push�޼ҵ� �����ε�
		this.t=t;
	}	
	public void push(Node<T> next) {
		this.next=next;
	}
	public void pop(){
		this.t=null;
		this.next=null;
	}
	
	
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}

	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	
	
}
