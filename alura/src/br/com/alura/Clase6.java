package br.com.alura;

import java.util.ArrayList;

import model.Clase;
import model.Curso2;

public class Clase6 {
	
	public static void main(String[] args) {
		
		Curso2 curso1 = new Curso2("PHP", 30, new ArrayList<>());
		
		curso1.addClase(new Clase("ArrayList"));
		curso1.addClase(new Clase("List"));
		curso1.addClase(new Clase("LinkedList"));
		
		
		ArrayList<Curso2> cursos = new ArrayList<>();
		cursos.add(curso1);
		
		System.out.println(cursos.get(0).getClaseList());

	}

		
}
