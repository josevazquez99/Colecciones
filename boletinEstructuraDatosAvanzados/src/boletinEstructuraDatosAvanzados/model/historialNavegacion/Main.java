package boletinEstructuraDatosAvanzados.model.historialNavegacion;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		String menu="";
		Scanner sc = new Scanner (System.in);
		Historial h= new Historial();
		
		do {
			System.out.println("1.Nueva pagina\n2.Consultar Historial completo\n"
					+"3.Consultar Historial de un dia\n4.Borrar todo el historial\n"
					+"5.Borrar visitas a una pagina\n6.Salir");
			 System.out.println("Que opcion deseas");
			 menu=sc.nextLine();
			 if(menu.equals("1")) {
				 System.out.println("Introduce la url");
				 String url=sc.nextLine();
				 PaginaWeb p = new PaginaWeb(url);
				 try {
					h.añadirPagina(p);
				} catch (ExcepcionPaginaWeb e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }else if(menu.equals("2")) {
				System.out.println(h.consultarHistorialCompleto());
			 }else if(menu.equals("3")) {
				 System.out.println("Introduce el dia");
				 int dia=sc.nextInt();
				 try {
					System.out.println(h.consultarHistorialporunDia(dia));
				} catch (ExcepcionPaginaWeb e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				};
			 }else if(menu.equals("4")) {
				 h.borrarHistorial();
			 }else {
				 System.out.println("Introduce la url");
				 String url=sc.nextLine();
				 PaginaWeb p = new PaginaWeb(url);
				 h.borrarVisitasPagina(p);
			 }
			
			
		} while (!menu.equals("6"));

	}

}
