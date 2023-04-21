package boletinEstructuraDatosAvanzados.model;

import java.util.Arrays;

public class ejercicio1 {
	
	protected static <T> T[] reverse(T[] arrayOriginal) {
		T[] inverso=arrayOriginal.clone();
		for(int i=0;i<arrayOriginal.length;i++) {
			inverso[i]=arrayOriginal[arrayOriginal.length-i-1];
		}return inverso;
		
	}
	
	public static <T> void main(String[] args) {
		
		Integer[] numeros = {1,2,3,4,5};
		T[] reverse=(T[]) reverse(numeros);
		System.out.println(Arrays.toString(reverse));


	}

}
