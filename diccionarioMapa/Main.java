package diccionarioMapa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Map<String, Collection<String>> diccionario = new HashMap<>();

		String menu = "";
		Scanner sc = new Scanner(System.in);
		do {
			menu = "1. Añadir palabra\r\n" + "2. Buscar palabra en diccionario\r\n"
					+ "3. Borrar una palabra del diccionario:\r\n" + "4. Listado de palabras que empiecen por ... \r\n"
					+ "un listado de palabras ordenadas alfabéticamente que comiencen por esa cadena.\r\n" + "5. Salir";
			System.out.println(menu);
			System.out.println("Que opcion deseas");
			menu = sc.nextLine();
			if (menu.equals("1")) {
				String palabra = "Introduce la palabra";
				System.out.println(palabra);
				palabra = sc.nextLine();
				String significado = "Introduce el significado";
				System.out.println(significado);
				significado = sc.nextLine();
				diccionario.put(palabra, new ArrayList<String>());
				diccionario.get(palabra).add(significado);

			} else if (menu.equals("2")) {
				String palabra = "Introduce la palabra";
				System.out.println(palabra);
				palabra = sc.nextLine();
				System.out.println(diccionario.get(palabra));

			}else if(menu.equals("3")){
				String palabra = "Introduce la palabra";
				System.out.println(palabra);
				palabra = sc.nextLine();
				diccionario.remove(palabra);
			}else {
				String cadena="Intorudce la cadena por la que empieca";
				System.out.println(cadena);
				cadena=sc.nextLine();
			
				
			}

		} while (!menu.equals("5"));
	}

}
