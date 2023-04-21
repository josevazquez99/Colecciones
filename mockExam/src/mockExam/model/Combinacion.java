package mockExam.model;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public abstract class Combinacion {

	protected static final int VALOR_MINIMO = 1;
	protected static final int VALOR_MAXIMO_NUMEROS = 50;
	protected static final int VALOR_MAXIMO_ESTRELLAS = 12;
	protected static final int TOTAL_NUMERO = 5;
	protected static final int TOTAL_ESTRELLA = 2;

	private Set<Integer> numeros;
	private Set<Integer> estrellas;

	public Combinacion(int numero1, int numero2, int numero3, int numero4, int numero5, int estrella1, int estrella2)
			throws CombinacionException {
		this(arrayEnteros(numero1, numero2, numero3, numero4, numero5), arrayEnteros(estrella1, estrella2));
	}

	public Combinacion(int[] numeros, int[] estrellas) throws CombinacionException {

		super();
		this.numeros= new TreeSet<>();
		this.estrellas= new TreeSet<>();

		for (int i : numeros) {
			this.numeros.add(i);
		}

		for (int e : estrellas) {
			this.estrellas.add(e);
		}

		if (this.numeros.size() != TOTAL_NUMERO) {
			throw new CombinacionException("No se puede numeros repetidos");
		}
		if (this.estrellas.size() != TOTAL_ESTRELLA) {
			throw new CombinacionException("No se puede estrellas repetidos");
		}

		for (int i : this.numeros) {
			if (i < VALOR_MINIMO || i > VALOR_MAXIMO_NUMEROS) {
				throw new CombinacionException("Fuera de rango");
			}
		}

		for (int e : this.estrellas) {
			if (e < VALOR_MINIMO || e > VALOR_MAXIMO_ESTRELLAS) {
				throw new CombinacionException("Fuera de rango");
			}
		}
	}

	public static int[] arrayEnteros(int... enteros) {
		return enteros;
	}

	public Set<Integer> getNumeros() {
		return numeros;
	}

	public Set<Integer> getEstrellas() {
		return estrellas;
	}

	public abstract int comprobarCombinacion(Combinacion c);

	@Override
	public int hashCode() {
		return Objects.hash(estrellas, numeros);
	}

	@Override
	public boolean equals(Object obj) {
		boolean iguales = false;
		if (this == obj)
			iguales = true;
		if (obj == null)
			iguales = false;
		if (getClass() != obj.getClass())
			iguales = false;
		Combinacion other = (Combinacion) obj;
		iguales = Objects.equals(estrellas, other.estrellas) && Objects.equals(numeros, other.numeros);
		return iguales;
	}

	@Override
	public String toString() {
		return "Combinacion [numeros=" + numeros + ", estrellas=" + estrellas + "]";
	}
	
	

}
