package src.producto;

public class Bebida extends Producto {
	
	private static final double IVA_BEBIDAS_ALC=15;
	private double graduacion;
	
	public Bebida(String nombre, String descripcion, Alergeno alergeno, double precioBase, double graduacion) {
		super(nombre, descripcion, alergeno, precioBase);
		this.graduacion = graduacion;
	}
	
	public double getPrecioProducto() {
		double precioFinal=0.0;
		precioFinal=this.precioBase*((100+IVA_BEBIDAS_ALC)/100);
		return precioFinal;
	}
	public boolean esBebidaAlcoholica() {
		boolean esBebidaAlcoholica=false;
		if(this.graduacion>0) {
			esBebidaAlcoholica=true;
		}return esBebidaAlcoholica;
		
	}

	@Override
	public boolean estaCaducado() {
		return false;}


	@Override
	public String toString() {
		return "Bebida:< " + nombre+ ">\n" + "Precio:<" + getPrecioProducto() + ">\n" +
	"Presenta alergenos:<" + getAlergeno()  + ">\n" + "Graduacion:<" + this.graduacion + ">\n";
	}
	
	
	
	
	

}
