package boletinEstructuraDatosAvanzados.model.historialNavegacion;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Historial {

	List<PaginaWeb> listaPaginas = new ArrayList<>();

	public Historial() {
		super();
	}

	public void añadirPagina(PaginaWeb p) throws ExcepcionPaginaWeb {
		if (this.listaPaginas.isEmpty()) {
			listaPaginas.add(p);
		} else if (this.listaPaginas.get(this.listaPaginas.size() - 1).getFechaHora().isBefore(p.getFechaHora())) {
			listaPaginas.add(p);
		} else {
			throw new ExcepcionPaginaWeb("Error");
		}

	}

	public void borrarHistorial() {
		listaPaginas.clear();
	}

	public Historial consultarHistorialCompleto() {
		return this;
	}

	public Historial consultarHistorialporunDia(int dia) throws ExcepcionPaginaWeb {
		Historial historialDia = new Historial();
		for (PaginaWeb p : this.listaPaginas) {
			if (p != null && p.getFechaHora().getDayOfMonth() == dia) {
				historialDia.añadirPagina(p);
			}
		}
		return historialDia;
	}

	public void borrarVisitasPagina(PaginaWeb p) {
		Iterator<PaginaWeb> iWebs = this.listaPaginas.iterator();
		while (p != null && iWebs.hasNext()) {
			if (iWebs.next().getUrl().equals(p.getUrl())) {
				iWebs.remove();
			}
		}
	}

	@Override
	public String toString() {
		return "Historial [listaPaginas=" + listaPaginas + "]";
	}
	

}
