package boletinEstructuraDatosAvanzados.model.EquipoDeportivoEjercicio3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import boletinEstructuraDatosAvanzados.model.equiposDeportivos.ExcepcionEquipo;



public class Equipo2<T> {

	private String nombreEquipo;
	List<T> listaAlumno= new ArrayList<>();
	



	public Equipo2(String nombreEquipo) {
		super();
		this.nombreEquipo = nombreEquipo;
	}

	public void anadirAlumno(Alumno a) throws ExcepcionEquipo {
		if(a!=null && buscarAlumno(a)==null) {
			listaAlumno.add((T) a);
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
	
	public Equipo2<T> unionEquipo(Equipo equipoB) {
		if(equipoB!=null && !this.listaAlumno.equals(equipoB.listaAlumno)) {
			this.listaAlumno.addAll((Collection<? extends T>) equipoB.listaAlumno);
		}return this;
	}
	public Equipo2<T> interseccionEquipo(Equipo equipoB) {
		List<T> equipoNuevo = new ArrayList<>();	
		Iterator<T> it = (Iterator<T>) this.listaAlumno.iterator();
		T nuevoAlumno;
		Equipo equipoFinal;
		while(it.hasNext()) {
		nuevoAlumno = it.next();
		if(equipoB.listaAlumno.contains(nuevoAlumno)) {
		equipoNuevo.add(nuevoAlumno);
		}
		}
		if(equipoNuevo.size() > 1) {
		equipoFinal = new Equipo(this.nombreEquipo);
		equipoFinal.listaAlumno = (List<Alumno>) equipoNuevo;
		}
		return this;
	}

}
