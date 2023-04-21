package mockExam.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Historial {

	Map<LocalDate, Combinacion> sorteos = new HashMap<>();

	public Historial() {
		super();
	}

	public boolean addSorteo(LocalDate fecha, Combinacion c) throws HistorialException {
		boolean anadida = false;
		if (this.sorteos.containsKey(fecha)) {
			throw new HistorialException("Error ,ya existe");
		} else {
			this.sorteos.put(fecha, c);
			anadida = true;
		}
		return anadida;
	}
	public boolean addSorteo(int dia,int mes,int anno, Combinacion c) throws HistorialException {
		boolean anadida = false;
		if (this.sorteos.containsKey(LocalDate.of(anno, mes, dia))) {
			throw new HistorialException("Error ,ya existe");
		} else {
			this.sorteos.put(LocalDate.of(anno, mes, dia), c);
			anadida = true;
		}
		return anadida;
	}
	
	public boolean actualizarSorteo(int dia,int mes,int anno, Combinacion c) {
		return this.sorteos.replace(LocalDate.of(anno, mes, dia),this.sorteos.get(LocalDate.of(anno, mes, dia)),c);
	}
	
	public boolean actualizarSorteo(LocalDate fecha, Combinacion c) {
		return this.sorteos.replace(fecha,this.sorteos.get(fecha),c);
	}
	
	public boolean borrarSorteo(LocalDate fecha) {
		return this.sorteos.remove(fecha)!=null;
	}
	
	
	public List<String> listarSorteosDesdeFecha(LocalDate fecha){
		List<String> obtenerSorteso= new ArrayList<>();
		for(LocalDate l : this.sorteos.keySet()) {
			if(l.isAfter(fecha)) {
				obtenerSorteso.add(this.sorteos.get(l).toString());
			}
		}return obtenerSorteso;
	}
	
	public List<String> mostrarHistorico(LocalDate fecha){
		List<String> mostrarHistorico= new ArrayList<>();
		for(LocalDate l : this.sorteos.keySet()) {
			mostrarHistorico.add(this.sorteos.get(l).toString());
			
		}return mostrarHistorico;
	}
	
}
