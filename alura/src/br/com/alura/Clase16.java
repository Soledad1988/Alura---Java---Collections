package br.com.alura;

import java.util.Iterator;

import model.Alumno;
import model.Curso2;

//Otros tipos de Sets e Iteratots
public class Clase16 {

public static void main(String[] args) {
		
		Curso2 curso1 = new Curso2("Historia", 30, null);
		
		Alumno alumno1 = new Alumno("Luis Miguel","001");
		Alumno alumno2 = new Alumno("Pepito los palotes","002");
		Alumno alumno3 = new Alumno("Juan Carlos","003");
		Alumno alumno4 = new Alumno("Pedro Pedrito","004");
		Alumno alumno5 = new Alumno("Gustavo Sanchez","005");
		Alumno alumno6 = new Alumno("Marcia Maria","006");
		Alumno alumno7 = new Alumno("Claudia Patricia","007");
		
		
		curso1.addAlumno(alumno1);
		curso1.addAlumno(alumno2);
		curso1.addAlumno(alumno3);
		curso1.addAlumno(alumno4);
		curso1.addAlumno(alumno5);
		curso1.addAlumno(alumno6);
		curso1.addAlumno(alumno7);
		
		
		//curso1.getAlumnos().forEach(alumno ->System.out.println(alumno));
		
		//Iterator: forma de leer la lsita
		Iterator<Alumno>alumnoIterator = curso1.getAlumnos().iterator();
		
		while (alumnoIterator.hasNext()){
			System.out.println(alumnoIterator.next());
		}
		
	}

}
