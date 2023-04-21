package src.producto;

import java.time.LocalDate;

public class Plato extends Producto {
	
	protected LocalDate fechaConsumoPreferente;

	public Plato(String nombre, String descripcion, Alergeno alergeno, double precioBase) {
		super(nombre, descripcion, alergeno, precioBase);
	}
	
	public double getPrecioProducto() {
		return super.getPrecioProducto();

	}

	public LocalDate getFechaConsumoPreferente() {
		return fechaConsumoPreferente;
	}

	public void setFechaConsumoPreferente(LocalDate fechaConsumoPreferente) {
		this.fechaConsumoPreferente = fechaConsumoPreferente;
	}

	@Override
	public boolean estaCaducado() {
		boolean estaCaducado=false;
		if(this.fechaConsumoPreferente.compareTo(fechaAltaMenu)>15) {
			estaCaducado=true;
		}
		return estaCaducado;
	}
	@Override
	public String toString() {
		return "Plato:< " + nombre+ ">\n" + "Precio:<" + getPrecioProducto() + ">\n" +
	"Presenta alergenos:<" + getAlergeno()  + "Fecha de consumo preferente:<" 
				+ getFechaConsumoPreferente() + ">\n" + "Ingredientes:<" + descripcion + ">\n";
	}
	
	

}
