package br.com.caelum.estoque.ws;

import br.com.caelum.estoque.modelo.item.Item;
import br.com.caelum.estoque.modelo.item.ItemDao;
import br.com.caelum.estoque.modelo.item.ListaItens;
import jakarta.jws.WebMethod;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.util.ArrayList;

@SuppressWarnings({"FieldMayBeFinal", "CanBeFinal"})
@WebService
public class EstoqueWS {
	
	private ItemDao dao = new ItemDao();

	@WebMethod(operationName = "todosOsItens")
	@WebResult(name = "itens")
	public ListaItens getItens() {
		
		System.out.println("Chamando getItens()");
		ArrayList<Item> lista = dao.todosItens();
		return new ListaItens(lista);
	}
}
