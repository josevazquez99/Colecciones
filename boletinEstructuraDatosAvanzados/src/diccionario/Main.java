package diccionario;

import diccionario.model.Diccionario;
import diccionario.model.ExcepcionDiccionario;
import diccionario.model.Palabra;

public class Main {
	public static void main(String[] args) {
		
		Diccionario d= new Diccionario();
		Palabra p = new Palabra("saludo" , " saludar a alguien");
		try {
			d.anadirPalabra(p);
		} catch (ExcepcionDiccionario e) {
		}
		
		System.out.println(d.buscarPalabra(p));

	}
}
