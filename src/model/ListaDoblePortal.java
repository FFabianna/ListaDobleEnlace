package model;

public class ListaDoblePortal {
	
	private Nodo head;
	private Nodo tail;
	
	public void addFirst (Nodo nodo) {
		if (head== null) {
			head= nodo;
			tail=nodo;
			
		}else {
			nodo.setNext(head);
			head.setPrev(nodo);
			
			head= nodo;
		}
	}
	
	public void addLast (Nodo nodo) {
		if (tail==null) {
			tail = nodo;
			head= nodo;
		}else {
			tail.setNext(nodo);
			nodo.setPrev(tail);
			tail= nodo;
		}
	}
	
	private void print (Nodo nodo) {
		//condicion de parada
		if(nodo==null) {
			return;
		}
		//metodo recursivo 
		System.out.println(nodo.getValue());
		print(nodo.getPrev());
	}
	
	public void print() {
		print(tail); //imprimir en reversa
	}
	
	public void delete( Nodo current, int value) {
		//condicion de parada
		if (current==null) {
			return;
		}
		
		//eliminar la cabeza
		if(value==head.getValue()&& current==head) {
			head.getNext().setPrev(null);
			//referenciar la nueva cabeza
			head= current.getNext();
			return;
		}
		//eliminar la cola 
		if(value==tail.getValue()&& current==tail) {
			tail.getPrev().setNext(null);
			//referenciar la nueva cabeza
			tail= current.getPrev();
			return;
		}
		
		if (current.getValue()==value) {
			current.getPrev().setNext(current.getNext());
			current.getNext().setPrev(current.getPrev());
			return;
			
		}
		//metodo recursivo 
		delete(current.getNext(),value);
	}
	
	public void delete (int value) {
		delete(head, value);
	}
	
	
}
