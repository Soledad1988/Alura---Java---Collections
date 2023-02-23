package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import model.Curso;

public class Clase5 {

	public static void main(String[] args) {
		Curso curso1 = new Curso("Ruby",30);
		Curso curso2 = new Curso("PHP",10);
		Curso curso3 = new Curso("JavaScrypt",20);
		Curso curso4 = new Curso("Java",50);
		
		
		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		
		
		System.out.println(cursos);
		//ordenar
		Collections.sort(cursos);
		System.out.println(cursos);
		
		//orden inverso
		Collections.sort(cursos, Collections.reverseOrder());
		System.out.println(cursos);
		
		//sin implementarCompareTo
		cursos.sort(Comparator.comparing(Curso::getNombre));
		System.out.println(cursos);
		
		//con collection
		Collections.sort(cursos,Comparator.comparing(Curso::getNombre));
		System.out.println(cursos);
		
		//orden invertido
		Collections.sort(cursos,Comparator.comparing(Curso::getNombre).reversed());
		System.out.println(cursos);
		
	
	}
}
