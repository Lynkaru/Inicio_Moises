package com.ceinmark.listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EjemploListas {

	public static void main(String[] args) {
		
		//Crear la lista, pero que no permita duplicados (hashset / .contains)
		List<String> libros = new ArrayList<String>();
		
		//HOLA HE HECHO UN CAMBIO EN ESTE PROYECTO
		//SOY RODRIGO ALMENDARIZ
		
		//Hola Rodrigo, gracias por hacer el cambio
		//Soy Moisés Algendones Calderón

		libros.add("Harry Potter");
		libros.add("Crepúsculo");
		libros.add("El Señor de los anillos");

		System.out.println(libros.size());
		System.out.println(libros);

		libros.add("Harry Potter");
		System.out.println(libros.size());
		System.out.println(libros);
		
//		Iterator<String> it = libros.iterator();
//		while (it.hasNext()) {
//			String libro = it.next();
//			if (libro.equals("Crepúsculo")) {
//				libros.remove(libro);
//			}//fin if
//		} // fin while

//		libros.removeIf(l -> l.equals("Crepúsculo"));

//		System.out.println(libros.size());
//		System.out.println(libros);

	}// fin main

}
