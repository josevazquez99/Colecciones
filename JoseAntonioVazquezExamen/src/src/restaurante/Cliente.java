package src.restaurante;

import java.time.LocalDate;

import excepciones.ServicioNoDisponilbleException;
import producto.Alergeno;
import producto.Producto;

public class Cliente  implements Comparable<Cliente>{
	private LocalDate fechaNacimiento;
	private String codigoCliente;
	private Alergeno alergeno;
	Producto[] productos = new Producto[10];
	private int codigo=0000;
	
	public Cliente(LocalDate fechaNacimiento, Alergeno alergeno) {
		super();
		this.fechaNacimiento = fechaNacimiento;
		this.alergeno = alergeno;
		this.codigoCliente=codigoCliente+ codigo++;
	}
	

	public boolean solicitarServicio(Producto p) throws ServicioNoDisponilbleException {
		if(p.getAlergeno()!=null && p.getFechaBajaMenu()!=null) {
			throw new ServicioNoDisponilbleException("Error");
		}
		
		return true;
	}

	@Override
	public int compareTo(Cliente o) {
		return (int) (o.alergeno==(alergeno)?o.fechaNacimiento.compareTo(fechaNacimiento):
			o.alergeno==(alergeno));
	}
	
	public double calcularImporteConsumido() {
		double precioTotal=0.0;
		return precioTotal;
	}
	
	public boolean esMayorEdad() {
		boolean esMayor=false;
		LocalDate fechaActual=LocalDate.now();
		if(fechaActual.getYear()-this.fechaNacimiento.getYear()>18) {
			esMayor=true;
			
		}return esMayor;
	}
	
	public int getEdadActual() {
		LocalDate fechaActual=LocalDate.now();
		return fechaActual.getYear()-this.fechaNacimiento.getYear();
	}
	
	public boolean esAlergicoA(Alergeno a) {
		boolean esAlergicoA=false;
		if(a!=null) {
			return esAlergicoA;

		}
		return esAlergicoA;
		}
	

	public String getCodigoCliente() {
		return codigoCliente;
	}
	
	public boolean esBebedor() {
		boolean esBebedor=false;
		
		return esBebedor;
	}
	
	
	

	

}
