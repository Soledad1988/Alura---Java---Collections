package br.com.alura;

import java.util.ArrayList;

//ArrayList
public class Clase1 {
	
	public static void main(String[] args) {
		
		String variable1 = "Ejemplo1";
		String variable2 = "Ejemplo2";
		String variable3 = "Ejemplo3";
		String variable4 = "Ejemplo4";
		
		// tipo de lista  nombre   nueva lista vacia de String
		ArrayList<String> lista = new ArrayList<>();
		lista.add(variable1);
		lista.add(variable2);
		lista.add(variable3);
		lista.add(variable4);
		
		System.out.println(lista);
		
		//remover
		lista.remove(2);
		
		System.out.println(lista);
		
		//modificar

		lista.set(0, "Ejemplo alterado");
		
		System.out.println(lista);
		
		System.out.println(lista.size());//devuelve el tamaño de mi lista
	}

	
}
