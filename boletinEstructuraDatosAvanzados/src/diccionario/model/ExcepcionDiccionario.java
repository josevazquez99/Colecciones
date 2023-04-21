package diccionario.model;

public class ExcepcionDiccionario extends Exception {

	public ExcepcionDiccionario() {
	}

	public ExcepcionDiccionario(String message) {
		super(message);
	}

	public ExcepcionDiccionario(Throwable cause) {
		super(cause);
	}

	public ExcepcionDiccionario(String message, Throwable cause) {
		super(message, cause);
	}

	public ExcepcionDiccionario(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
