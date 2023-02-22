package br.com.alura;

import java.util.ArrayList;

public class Clase2 {

	
	public static void main(String[] args) {
		String variable1 = "Clase1";
		String variable2 = "Clase2";
		String variable3 = "Clase3";
		String variable4 = "Clase4";
		
		ArrayList<String> lista = new ArrayList<>();
		lista.add(variable1);
		lista.add(variable2);
		lista.add(variable3);
		lista.add(variable4);
		
		System.out.println(lista);
		
		//leer un array
		//for tradicional
		for(int i = 0; i<lista.size();i++) {
			System.out.println(lista.get(i));
		}
		
		//utilizando un for tipo forEach
		for(String clase:lista) {
			System.out.println(clase);
		}
		
		//lambda a partir de java8
		lista.forEach(clase->{
			System.out.println(clase);
		});
	}
}
