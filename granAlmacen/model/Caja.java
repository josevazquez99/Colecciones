package granAlmacen.model;

import java.util.ArrayList;
import java.util.List;

public class Caja {

	private int numeroCaja;
	private static int codigo=0;
	private List<Cliente> listaClientes;
	private boolean estado;

	public Caja() {
		super();
		this.numeroCaja = codigo++;
		this.estado = false;
		this.listaClientes= new ArrayList<>();
	}

	@Override
	public String toString() {
		return "Caja [numeroCaja=" + numeroCaja + "]";
	}

	public boolean isEstado() {
		return estado;
	}
	
	
	public void asignarCliente(Cliente c) {
		this.listaClientes.add(c);
	}
	
	public int getClientesEnCaja() {
		return this.listaClientes.size();
	}

	public int getNumeroCaja() {
		return numeroCaja;
	}

	public void abrirCaja() throws AlmacenException {
		if (this.estado) {
			throw new AlmacenException("Ya esta abierta");
		}

		this.estado = true;
	}

	public void cerrarCaja() throws AlmacenException {
		if(!this.estado || this.listaClientes.size()>0) {
			throw new AlmacenException("La caja ya esta cerrada o tiene clientes");

		}this.estado=false;

	}
	
	public String atenderCliente() throws AlmacenException {
		String resultado = "";
		if(!isEstado() || this.listaClientes.isEmpty()) {
			throw new AlmacenException("Error no hay clientes en la caja o la caja está cerrada.");
		}
		resultado = String.format("Se ha atentido al cliente con número %s", this.listaClientes.get(0).getCodigo());
		
		this.listaClientes.remove(this.listaClientes.get(0));
		return resultado;
	}
	
	

}
