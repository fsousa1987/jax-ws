package br.com.caelum.estoque.ws;

import br.com.caelum.estoque.modelo.item.*;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;

import java.util.List;

@SuppressWarnings({"FieldMayBeFinal", "CanBeFinal"})
@WebService
public class EstoqueWS {
	
	private ItemDao dao = new ItemDao();

	@WebMethod(operationName = "todosOsItens")
	@ResponseWrapper(localName="itens")
	@WebResult(name = "item")
	@RequestWrapper(localName = "listaitens")
	public ListaItens getItens(@WebParam(name="filtros")Filtros filtros) {

		List<Filtro> lista = filtros.getLista();
		List<Item> result = dao.todosItens(lista);

		return new ListaItens(result);
	}
}
