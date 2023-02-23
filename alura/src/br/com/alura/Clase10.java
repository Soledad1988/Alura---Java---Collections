package br.com.alura;

import java.util.ArrayList;

import model.Curso;

public class Clase10 {

	public static void main(String[] args) {
		Curso curso1 = new Curso("Historia",30);
		Curso curso2 = new Curso("Algebra",10);
		Curso curso3 = new Curso("Aritmetica",20);
		Curso curso4 = new Curso("Geometria",50);
		Curso curso5 = new Curso("Fisica",60);
		Curso curso6 = new Curso("Quimica",80);
		Curso curso7 = new Curso("Geografia",70);
		Curso curso8 = new Curso("Educacion Fisica",30);
		
		
		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		cursos.add(curso5);
		cursos.add(curso6);
		cursos.add(curso7);
		cursos.add(curso8);
		
		
		//con stream
		//promedio
		System.out.println(cursos.stream().mapToInt(Curso::getTiempo).average().getAsDouble());
		
		//numero maximo
		System.out.println(cursos.stream().mapToInt(Curso::getTiempo).max().getAsInt());
		
		//numero minimo
		System.out.println(cursos.stream().mapToInt(Curso::getTiempo).min().getAsInt());
	
		//parallelStream
		System.out.println(cursos.parallelStream().mapToInt(Curso::getTiempo).sum());
	}
}
