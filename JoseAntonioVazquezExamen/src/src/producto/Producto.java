package src.producto;

import java.time.LocalDate;

public abstract class Producto {
	
	protected static final double IVA_GENERAL=7;
	protected LocalDate fechaAltaMenu;
	protected LocalDate fechaBajaMenu;
	protected String nombre;
	protected String descripcion;
	protected Alergeno alergeno;
	protected double precioBase;
	protected String codigoProducto;
	private int codigo=0000;
	
	public Producto(String nombre, String descripcion, Alergeno alergeno, double precioBase) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.alergeno = alergeno;
		this.precioBase = precioBase;
		this.codigoProducto=codigoProducto+codigo++;
	}
	
	public Producto(Producto p) {}

	public LocalDate getFechaBajaMenu() {
		return fechaBajaMenu;
	}

	public void setFechaBajaMenu(LocalDate fechaBajaMenu) {
		this.fechaBajaMenu = fechaBajaMenu;
	}

	public Alergeno getAlergeno() {
		return alergeno;
	}

	public double getPrecioProducto() {
		double precioFinal=0.0;
		precioFinal=this.precioBase*((100+IVA_GENERAL)/100);
		return precioFinal;
	}
	
	public abstract boolean estaCaducado();

	public String getCodigoProducto() {
		return codigoProducto;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", descripcion=" + descripcion + ", alergeno=" + alergeno
				+ ", precioBase=" + precioBase + "]";
	}
	
	
	
	

}
