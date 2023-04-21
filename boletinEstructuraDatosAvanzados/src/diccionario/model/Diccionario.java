package diccionario.model;

import java.util.Iterator;
import java.util.Set;

public class Diccionario {
	
	private Set<Palabra> palabras;
	public Diccionario() {
		super();
	}
	
	public void anadirPalabra(Palabra p) throws ExcepcionDiccionario {
		if(this.palabras.contains(p)) {
			throw new ExcepcionDiccionario("La palabra ya existe");
		}this.palabras.add(p);
	}
	
	public String buscarPalabra(Palabra p) {
		StringBuilder sb= new StringBuilder();
		Iterator<Palabra> it= this.palabras.iterator();
		while(it.hasNext()) {
			if(it.next().equals(p)) {
				sb.append(it);
			}
		}return sb.toString();
			
		}
	public void borrarPalabra(Palabra p) throws ExcepcionDiccionario {
		if(this.palabras.contains(p)) {
			this.palabras.remove(p);
		}throw new ExcepcionDiccionario("La palabra no existe");
	}

	}

	
	
	

