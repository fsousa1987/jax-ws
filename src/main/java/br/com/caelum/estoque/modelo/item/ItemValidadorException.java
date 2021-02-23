package br.com.caelum.estoque.modelo.item;

import java.io.Serial;
import java.util.List;

public class ItemValidadorException extends RuntimeException {

	@Serial
	private static final long serialVersionUID = 1L;

	public ItemValidadorException(List<String> erros) {
		super(erros.toString());
	}
	
}
