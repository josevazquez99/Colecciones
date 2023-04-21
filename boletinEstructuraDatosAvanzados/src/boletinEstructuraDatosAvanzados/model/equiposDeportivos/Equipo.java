package boletinEstructuraDatosAvanzados.model.equiposDeportivos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Equipo {

	private String nombreEquipo;
	List<Alumno> listaAlumno= new ArrayList<>();
	

	
	public Equipo(String nombreEquipo) {
		super();
		this.nombreEquipo = nombreEquipo;
	}


	public void anadirAlumno(Alumno a) throws ExcepcionEquipo {
		if(a!=null && buscarAlumno(a)==null) {
			listaAlumno.add(a);
		}else {
			throw new ExcepcionEquipo("El alumno ya esta en el equipo");
		}
	}
	
	public void borrarAlumno(Alumno a) throws ExcepcionEquipo {
		if(buscarAlumno(a)!=null) {
			listaAlumno.remove(a);
		}else {
			throw new ExcepcionEquipo("El alumno no esta en el equipo");
		}
	}
	

	@Override
	public String toString() {
		return "Equipo [nombreEquipo=" + nombreEquipo + ", listaAlumno=" + listaAlumno + "]";
	}


	public Alumno buscarAlumno(Alumno a) {
		Alumno alumno=null;
		if(a!=null && this.listaAlumno.indexOf(a) !=-1 ) {
			alumno=a;
		}return alumno;
		}
	
	public Equipo unionEquipo(Equipo equipoB) {
		if(equipoB!=null && !this.listaAlumno.equals(equipoB.listaAlumno)) {
			this.listaAlumno.addAll(equipoB.listaAlumno);
		}return this;
	}
	public Equipo interseccionEquipo(Equipo equipoB) {
		List<Alumno> equipoNuevo = new ArrayList<>();	
		Iterator<Alumno> it = this.listaAlumno.iterator();
		Alumno nuevoAlumno;
		Equipo equipoFinal;
		while(it.hasNext()) {
		nuevoAlumno = it.next();
		if(equipoB.listaAlumno.contains(nuevoAlumno)) {
		equipoNuevo.add(nuevoAlumno);
		}
		}
		if(equipoNuevo.size() > 1) {
		equipoFinal = new Equipo(this.nombreEquipo);
		equipoFinal.listaAlumno = equipoNuevo;
		}
		return this;
	}
		
	
	
	
}