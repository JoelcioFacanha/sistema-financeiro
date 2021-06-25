package br.com.javaparaweb.financeiro.util;

public class DAOException extends Exception {
	private static final long serialVersionUID = 1L;

	public DAOException() {

	}

	public DAOException(String msg) {
		super(msg);
	}

	public DAOException(Throwable cause) {
		super(cause);

	}

	public DAOException(String msg, Throwable cause) {
		super(msg, cause);

	}

	public DAOException(String msg, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(msg, cause, enableSuppression, writableStackTrace);

	}

}
