package src.mainPrincipal;

import java.time.LocalDate;

import producto.Alergeno;
import producto.Producto;
import restaurante.Cliente;

public class Main {

	public static void main(String[] args) {
		LocalDate fechaNacimiento;
		Cliente c= new Cliente(LocalDate.of(1999, 12, 12),Alergeno.HUEVOS);
		System.out.println(c.esMayorEdad());
		System.out.println(c.getEdadActual());
		//Producto p=new Producto("Ron","Alcohol",Alergeno.CACAHUETES,13.0);
		
		System.out.println(c.esAlergicoA(Alergeno.CACAHUETES));

	}

}
