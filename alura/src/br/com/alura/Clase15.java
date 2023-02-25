package br.com.alura;

//import java.util.HashSet;
//import java.util.Set;

import model.Alumno;
import model.Curso2;

public class Clase15 {

	public static void main(String[] args) {
		
		Curso2 curso1 = new Curso2("Historia", 30, null);
		
		Alumno alumno1 = new Alumno("Luis Miguel","001");
		Alumno alumno2 = new Alumno("Pepito los palotes","002");
		Alumno alumno3 = new Alumno("Juan Carlos","003");
		Alumno alumno4 = new Alumno("Pedro Pedrito","004");
		Alumno alumno5 = new Alumno("Gustavo Sanchez","005");
		Alumno alumno6 = new Alumno("Marcia Maria","006");
		Alumno alumno7 = new Alumno("Claudia Patricia","007");
		
		//Set<Alumno>listaAlumnos = new HashSet<>();
		
		curso1.addAlumno(alumno1);
		curso1.addAlumno(alumno2);
		curso1.addAlumno(alumno3);
		curso1.addAlumno(alumno4);
		curso1.addAlumno(alumno5);
		curso1.addAlumno(alumno6);
		curso1.addAlumno(alumno7);
		
		
		curso1.addAlumno(alumno1);
		
		Alumno alumnoNuevo = new Alumno("Luis Miguel","001");
		
		System.out.println(alumno1.equals(alumnoNuevo));
		System.out.println(curso1.verificaAlumno(alumnoNuevo));
		
		
	}
}
