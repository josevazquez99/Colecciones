package boletinEstructuraDatosAvanzados.model.historialNavegacion;

import java.time.LocalDateTime;

public class PaginaWeb {

	private String url;
	private LocalDateTime fechaHora;
	


	public PaginaWeb(String url) {
		super();
		this.url = url;
		this.fechaHora = LocalDateTime.now();
	}



	@Override
	public String toString() {
		return "PaginaWeb [url=" + url + ", fechaHora=" + fechaHora + "]";
	}



	public LocalDateTime getFechaHora() {
		return fechaHora;
	}



	public String getUrl() {
		return url;
	}




	
	

	
	
}
