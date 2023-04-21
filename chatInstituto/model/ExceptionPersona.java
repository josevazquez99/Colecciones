package chatInstituto.model;

public class ExceptionPersona extends Exception {

	public ExceptionPersona() {
	}

	public ExceptionPersona(String message) {
		super(message);
	}

	public ExceptionPersona(Throwable cause) {
		super(cause);
	}

	public ExceptionPersona(String message, Throwable cause) {
		super(message, cause);
	}

	public ExceptionPersona(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
