package boletinEstructuraDatosAvanzados.model.equiposDeportivos;

public class ExcepcionEquipo extends Exception {

	public ExcepcionEquipo() {
	}

	public ExcepcionEquipo(String message) {
		super(message);
	}

	public ExcepcionEquipo(Throwable cause) {
		super(cause);
	}

	public ExcepcionEquipo(String message, Throwable cause) {
		super(message, cause);
	}

	public ExcepcionEquipo(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
