package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso2 implements Comparable<Curso>{

	private String nombre;
	private int tiempo;
	private List<Clase> claseList = new ArrayList<>();//interface
	
	
	public Curso2(String nombre, int tiempo, List<Clase> claseList) {
		this.nombre = nombre;
		this.tiempo = tiempo;
		this.claseList = claseList;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTiempo() {
		return tiempo;
	}
	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
	
	public List<Clase> getClaseList() {
		return Collections.unmodifiableList(claseList);//evita modificar la lista
	}

	public void setClaseList(List<Clase> claseList) {
		this.claseList = claseList;
	}
	
	public void addClase(Clase clase) {
		this.claseList.add(clase);
	}

	@Override
	public String toString() {
		return this.nombre;
	}

	@Override
	public int compareTo(Curso o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public int compareTo(Curso2 o) {
		return this.nombre.compareTo(o.getNombre());
	}
	


}
