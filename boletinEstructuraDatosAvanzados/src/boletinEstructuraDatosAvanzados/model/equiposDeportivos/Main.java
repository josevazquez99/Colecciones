package boletinEstructuraDatosAvanzados.model.equiposDeportivos;

public class Main {
	
	
	public static void main(String[] args) {
		Alumno a = new Alumno("Jose", "47545311X");
		Alumno a1 = new Alumno("Josema", "47545311D");
		Alumno a2 = new Alumno("Joselito", "47545311F");
		Equipo e = new Equipo("UltraShisha");
		
		try {
			e.anadirAlumno(a);
			e.anadirAlumno(a1);
		} catch (ExcepcionEquipo e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		try {
			e.borrarAlumno(a);
		} catch (ExcepcionEquipo e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println(e.toString());	
}

	
	
	



}
