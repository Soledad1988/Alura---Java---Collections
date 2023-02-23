package br.com.alura;

import java.util.ArrayList;
import java.util.List;

import model.Clase;
import model.Curso2;

//referencias entre listas
public class Clase7 {

public static void main(String[] args) {
		
		Curso2 curso1 = new Curso2("PHP", 30, new ArrayList<>());
		
		curso1.addClase(new Clase("ArrayList"));
		curso1.addClase(new Clase("List"));
		curso1.addClase(new Clase("LinkedList"));
		curso1.addClase(new Clase("Inmutable"));
		
		List<Clase> aulaList = curso1.getClaseList();
		//aulaList.add(new Clase("Inmutable"));
		
		ArrayList<Curso2> cursos = new ArrayList<>();
		cursos.add(curso1);
		
		System.out.println(aulaList);

	}

}
