package common.colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Principal {
	
	public static void main(String[] args) {
//		EntradaRegistro<String, String>entradaRegistro1=
//				new EntradaRegistro<String, String>("saludo", "definicion de saludo");
//		System.out.println(entradaRegistro1);
//		EntradaRegistro<String, String>entradaRegistro2=
//				new EntradaRegistro<String, String>("despedida", "definicion de despedida");
//		System.out.println(entradaRegistro2);
//		EntradaRegistro<Integer, String>entradaRegistro3=
//				new EntradaRegistro<Integer, String>(1, "chichote99");
//		System.out.println(entradaRegistro3);
		
		List<Integer> listaNumero =new ArrayList<>();
		Set<Integer> conjuntoNumero =new HashSet<>();
		listaNumero.add(1);
		listaNumero.add(3);
		listaNumero.add(3);
		listaNumero.add(2);
		Collections.sort(listaNumero);
		System.out.println(listaNumero);

		//coge los valores repetidos y si los cuenta
		conjuntoNumero.add(1);
		conjuntoNumero.add(3);
		conjuntoNumero.add(3);
		conjuntoNumero.add(4);
		// no coge los valores repetidos y no los cuenta

		System.out.println(listaNumero.size());
		System.out.println(listaNumero.toString());
		System.out.println(conjuntoNumero.size());
		System.out.println(conjuntoNumero.toString());
		
		
		List<String> listaNombre=new ArrayList<>();
		listaNombre.add("Jose");
		listaNombre.add("Antonio");
		listaNombre.add("Vazquez");
		listaNombre.add("Fernandez");
		Collections.sort(listaNombre);
		System.out.println(listaNombre);
		listaNombre.remove("Jose");
		System.out.println(listaNombre);
		System.out.println(listaNombre.isEmpty());

	}

}
