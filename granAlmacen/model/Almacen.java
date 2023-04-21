package granAlmacen.model;

import java.util.ArrayList;
import java.util.List;

public class Almacen {

private List<Caja> listaCajas;
	
	public Almacen() {
		super();
		this.listaCajas = new ArrayList<>();
	}
	
	public void abrirCaja(int numeroCaja) throws AlmacenException {
		for(Caja c : this.listaCajas) {
			if(c.getNumeroCaja() == numeroCaja) {
				c.abrirCaja();
			}
		}
	}
	
	public void cerrarCaja(int numeroCaja) throws AlmacenException {
		for(Caja c : this.listaCajas) {
			if(c.getNumeroCaja() == numeroCaja) {
				c.cerrarCaja();
			}
		}
	}
	
	public String nuevoCliente() {
		Cliente c = new Cliente();
		Caja cajaMenor = new Caja();
		for(Caja c1: this.listaCajas) {
			if(c1.isEstado() && c1.getClientesEnCaja() < cajaMenor.getClientesEnCaja()) {
				cajaMenor = c1;
			}else if(c1.isEstado() && c1.getNumeroCaja() < cajaMenor.getNumeroCaja()) {
				cajaMenor = c1;
			}
		}
		c.setAsignarCaja(cajaMenor.getNumeroCaja());
		cajaMenor.asignarCliente(c);
		return String.format("Es usted el cliente número %s, y de debe ir a la"
							+ "	caja número %s", c.getCodigo(),cajaMenor.getNumeroCaja());
	}
	
	public String atenderCliente(int numeroCaja) throws AlmacenException {
		String resultado = "";
		for(Caja c : this.listaCajas) {
			if(c.getNumeroCaja() == numeroCaja) {
				if(c.isEstado() && c.getClientesEnCaja() > 0) {
					resultado = c.atenderCliente();
				}else {
					throw new AlmacenException("Error no hay clientes en la caja, o caja está cerrada.") ;
				}
			}
		}
		return resultado;
			
	}
	
	public void anniadirCaja(Caja caja) {
		this.listaCajas.add(caja);
	}
	
	

}
