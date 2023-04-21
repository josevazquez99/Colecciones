package granAlmacen.model;

import java.util.Set;

public class Cliente {
	
	
	private static  int numero=0;
	private int codigo;
	private int numeroCaja;

	public Cliente() {
		super();
		this.codigo = numero++;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setAsignarCaja(int numero) {
		this.numeroCaja = numero;
	}

	

	
	
	

}
