package br.com.caelum.estoque.ws;

import br.com.caelum.estoque.modelo.item.*;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.util.List;

@SuppressWarnings({"FieldMayBeFinal", "CanBeFinal"})
@WebService
public class EstoqueWS {
	
	private ItemDao dao = new ItemDao();

	@WebMethod(operationName = "todosOsItens")
	@WebResult(name = "itens")
	public ListaItens getItens(@WebParam(name="filtros")Filtros filtros) {
		
		System.out.println("Chamando getItens()");
		List<Filtro> lista = filtros.getLista();
		List<Item> itensResultado = dao.todosItens(lista);
		return new ListaItens(itensResultado);
	}
}
