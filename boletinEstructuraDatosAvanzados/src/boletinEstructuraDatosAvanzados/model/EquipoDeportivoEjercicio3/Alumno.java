package boletinEstructuraDatosAvanzados.model.EquipoDeportivoEjercicio3;

import java.util.Objects;


public class Alumno {

	private String nombre;
	private String dni;
	
	public Alumno(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", dni=" + dni + "]";
	}

	@Override
	public boolean equals(Object obj) {
		boolean iguales=this==obj;
		if (this == obj && obj!=null && obj instanceof Alumno) {
		Alumno other = (Alumno) obj;
		iguales= Objects.equals(dni, other.dni);}
		return iguales;
	}
}
