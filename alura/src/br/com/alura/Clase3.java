package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//lista simple
public class Clase3 {

	public static void main(String[] args) {
		String curso1 = "Geometria";
		String curso2 = "Fisica";
		String curso3 = "Quimica";
		String curso4 = "Hstoria";
		
		ArrayList<String> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		
		System.out.println(cursos);
		
		//ordenar de forma ascendente de menor a mayor
		Collections.sort(cursos);
		
		System.out.println(cursos);
		
		//ordenar de forma descendente de mayor a menor
		Collections.sort(cursos, Collections.reverseOrder());
		
		System.out.println(cursos);
		
		//sin collections
		//mayor a menor
		cursos.sort(Comparator.reverseOrder());
		System.out.println(cursos);
		
		//menor a mayor
		cursos.sort(Comparator.naturalOrder());
		System.out.println(cursos);
		
	}
}
