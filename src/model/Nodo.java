package model;

public class Nodo {
	 private int value;
	  // enlaces 
	 private Nodo next;
	 private Nodo prev;
	 //enlace opcional 
	 private Nodo portal;
	 
	 
	 public Nodo(int value) {
		 this.value= value;
	 }
	 
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Nodo getNext() {
		return next;
	}
	public void setNext(Nodo next) {
		this.next = next;
	}
	public Nodo getPrev() {
		return prev;
	}
	public void setPrev(Nodo prev) {
		this.prev = prev;
	}
	public Nodo getPortal() {
		return portal;
	}
	public void setPortal(Nodo portal) {
		this.portal = portal;
	} 
	 
	 
	 
}
