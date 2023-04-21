package common.colecciones;

public class EntradaRegistro<K,V> {

	private K clave;
	private V valor;
	
	
	public EntradaRegistro(K clave, V valor) {
		super();
		this.clave = clave;
		this.valor = valor;
	}


	@Override
	public String toString() {
		return String.format("Entrada con clave %s y con valor %s" , this.clave,this.valor);
	}
	
	
	

	
	
	
}
