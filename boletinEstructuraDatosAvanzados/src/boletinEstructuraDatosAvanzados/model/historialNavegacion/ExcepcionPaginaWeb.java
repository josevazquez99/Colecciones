package boletinEstructuraDatosAvanzados.model.historialNavegacion;

public class ExcepcionPaginaWeb extends Exception {

	public ExcepcionPaginaWeb() {
	}

	public ExcepcionPaginaWeb(String message) {
		super(message);
	}

	public ExcepcionPaginaWeb(Throwable cause) {
		super(cause);
	}

	public ExcepcionPaginaWeb(String message, Throwable cause) {
		super(message, cause);
	}

	public ExcepcionPaginaWeb(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
