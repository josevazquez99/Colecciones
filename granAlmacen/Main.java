package granAlmacen;

import java.util.Scanner;

import granAlmacen.model.Almacen;
import granAlmacen.model.AlmacenException;
import granAlmacen.model.Caja;

public class Main {

	public static void main(String[] args) {
		String menu="";
		Scanner sc= new Scanner(System.in);
		
		do {
			menu="1. Abrir caja.\r\n"
					+ "2. Cerrar caja. y\r\n"
					+ "3. Nuevo cliente\r\n"
					+ "4. Atender cliente\r\n"
					+ "5. Salir .";
			System.out.println(menu);
			Almacen a = new Almacen();
			System.out.println("Que opcion deseas");
			menu=sc.nextLine();
			if(menu.equals("1")) {
				System.out.println("Introduce el numero de caja");
				int numeroCaja=Integer.valueOf(sc.nextLine());
				Caja c = new Caja();
				try {
					a.abrirCaja(numeroCaja);
				} catch (AlmacenException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			else if (menu.equals("2")) {
				System.out.println("Introduce el numero de caja");
				int numeroCaja=Integer.valueOf(sc.nextLine());
				Caja c = new Caja();
				try {
					a.cerrarCaja(numeroCaja);
				} catch (AlmacenException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else if (menu.equals("3")) {
				System.out.println(a.nuevoCliente());
				
			}else {
				System.out.println("Introduce el numero de la caja");
				int numeroCaja=Integer.valueOf(sc.nextLine());
				try {
					a.atenderCliente(numeroCaja);
				} catch (AlmacenException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} while (!menu.equals("5"));


	}
}
