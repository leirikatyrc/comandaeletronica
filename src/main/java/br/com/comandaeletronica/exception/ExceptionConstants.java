package br.com.comandaeletronica.exception;

import java.util.HashMap;
import java.util.Map;

public enum ExceptionConstants {

	SECURITY_EXCEPTION(5000, "Você não tem permissão de acesso, procure o administrador do sistema.");

	private final Integer code;

	private final String message;

	private static final Map<Integer, ExceptionConstants> map;

	static {
		map = new HashMap<Integer, ExceptionConstants>();

		for (ExceptionConstants value : values()) {
			map.put(value.code, value);
		}
	}

	private ExceptionConstants(Integer code, String message) {
		this.code = code;
		this.message = message;
	}

	public Integer getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

	public ExceptionConstants parser(int code) {
		return map.get(code);
	}

}
