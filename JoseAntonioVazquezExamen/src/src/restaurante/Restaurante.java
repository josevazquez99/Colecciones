package src.restaurante;

import java.time.LocalDate;

import excepciones.ClienteNoExistenteException;
import producto.Alergeno;
import producto.Producto;

public class Restaurante {
	private Producto[] cartaProducto = new Producto[NUM_MAXIMO_PRODUCTOS];
	private int ultimoProductoCarta;
	private static final int NUM_MAXIMO_PRODUCTOS = 100;
	private Cliente[] clientes = new Cliente[NUM_MAXIMO_CLIENTES];
	private int ultimoCliente;
	private static final int NUM_MAXIMO_CLIENTES = 20;
	private static int secuenciaGlobal;

	public Restaurante() {
		super();
	}

	public boolean darAltaCliente(Cliente c) throws ClienteNoExistenteException {
		boolean encontrado=false;
		if(ultimoCliente== NUM_MAXIMO_PRODUCTOS) {
			clientes[0]=new Cliente(c);
		}
		for(int i=0;i<clientes.length;i++) {
			if(clientes[i]!=null && clientes[i].getCodigoCliente().equals(c.getCodigoCliente())) {
				encontrado=true;
			}
		}if(!encontrado) {
			throw new ClienteNoExistenteException("Error");
		}
		
		return encontrado;
}
		


	

	public boolean darAltaProducto(Producto p) {
		boolean encontrado = false;
		for (int i = 0; i < cartaProducto.length; i++) {
			if (cartaProducto[i].getCodigoProducto().equals(p.getCodigoProducto())) {
				encontrado = true;
			}
		}
		if (!encontrado) {
			cartaProducto[ultimoProductoCarta++] = new Producto(p);
		}
		return true;

	}

	public boolean darBajaProducto(Producto p) {
	}

	private int obtenerPosicionCliente(String codigoCliente) {
		int posicion=0;
		for(int i=0;i<clientes.length;i++) {
			if(clientes[i]!=null && clientes[i].getCodigoCliente().equals(codigoCliente)) {
				posicion=i;
			}
		}
		return posicion;}
	
	private int obtenerPosicionProducto(String codigoProducto) {
		int posicion=0;
		for(int i=0;i<cartaProducto.length;i++) {
			if(cartaProducto[i]!=null && cartaProducto[i].getCodigoProducto().equals(codigoProducto)) {
				posicion=i;
			}
		}
		return posicion;}
	
	public String obtenerProductosPorAlergenos() {}

	
	public String obtenerClientesPorAlergiaEdad() {}
	
	public String obtenerClientesNoBebedores() {
		StringBuilder sb= new StringBuilder();
		
	}
	
	public String obtenerClientesPorConsumo() {
		StringBuilder sb= new StringBuilder();
		for(Producto p: cartaProducto) {
			if(p!=null && p instanceof )
		}
		
	}

	
	
	
	
	
	
	
	
}

	

	
	
	
	
	
	


