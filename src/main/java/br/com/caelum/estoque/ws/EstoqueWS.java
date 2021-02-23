package br.com.caelum.estoque.ws;

import br.com.caelum.estoque.modelo.item.Item;
import br.com.caelum.estoque.modelo.item.ItemDao;
import jakarta.jws.WebService;

import java.util.List;

@SuppressWarnings({"FieldMayBeFinal", "CanBeFinal"})
@WebService
public class EstoqueWS {
	
	private ItemDao dao = new ItemDao();
	
	public List<Item> getItens() {
		
		System.out.println("Chamando getItens()");
		return dao.todosItens();
	}
}
