package br.com.alura;

import java.util.HashSet;
import java.util.Set;

import model.Alumno;

//Porque usar equals o hashCode
public class Clase14 {

	public static void main(String[] args) {
		Alumno alumno1 = new Alumno("Luis Miguel","001");
		Alumno alumno2 = new Alumno("Pepito los palotes","002");
		Alumno alumno3 = new Alumno("Juan Carlos","003");
		Alumno alumno4 = new Alumno("Pedro Pedrito","004");
		Alumno alumno5 = new Alumno("Gustavo Sanchez","005");
		Alumno alumno6 = new Alumno("Marcia Maria","006");
		Alumno alumno7 = new Alumno("Claudia Patricia","007");
		
		Set<Alumno>listaAlumnos = new HashSet<>();
		
		listaAlumnos.add(alumno1);
		listaAlumnos.add(alumno2);
		listaAlumnos.add(alumno3);
		listaAlumnos.add(alumno4);
		listaAlumnos.add(alumno5);
		listaAlumnos.add(alumno6);
		listaAlumnos.add(alumno7);
		
		//se encuentra alumnio1 en la lista
		System.out.println(listaAlumnos.contains(alumno1));
		
		//se puede agregar el mismo objeto?
		Alumno alumnoNuevo = new Alumno("Luis Miguel","001");
		
		System.out.println(alumno1.equals(alumnoNuevo));
		System.out.println(listaAlumnos.contains(alumnoNuevo));
		
		
	}
}
