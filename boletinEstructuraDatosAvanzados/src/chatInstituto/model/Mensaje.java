package chatInstituto.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Mensaje {
	
	private Persona remitente;
	private String texto;
	private LocalDateTime fechaHora;
	
	
	@Override
	public String toString() {
		return "Mensaje [remitente=" + remitente + ", texto=" + texto + ", fechaHora=" + fechaHora + "]";
	}

	


	
	
}
