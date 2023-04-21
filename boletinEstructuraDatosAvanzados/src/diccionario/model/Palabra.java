package diccionario.model;

import java.util.Objects;

public class Palabra {
	
	private String palabra;
	private String significado;
	
	
	
	
	
	public Palabra(String palabra, String significado) {
		super();
		this.palabra = palabra;
		this.significado = significado;
	}





	@Override
	public int hashCode() {
		return Objects.hash(palabra);
	}





	@Override
	public boolean equals(Object obj) {
		boolean iguales=false;
		if (this == obj)
			iguales= true;
		if (obj == null)
			iguales= false;
		if (getClass() != obj.getClass())
			iguales= false;
		Palabra other = (Palabra) obj;
		iguales= Objects.equals(palabra, other.palabra);
		return iguales;
	}





	@Override
	public String toString() {
		return "Palabra [significado=" + significado + "]";
	}






	
	
	

}
