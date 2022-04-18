package main;

import model.ListaDoblePortal;
import model.Nodo;

public class Main {
	
	public static void main (String...args) {
		ListaDoblePortal list= new ListaDoblePortal();
		
		list.addFirst(new Nodo (2));
		list.addFirst(new Nodo (10));
		list.addFirst(new Nodo (14));
		list.addLast(new Nodo (6));
		list.addLast(new Nodo (9));
		
		list.print();
	}

}
