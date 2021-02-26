package br.com.caelum.estoque.ws;

import br.com.caelum.estoque.modelo.item.*;
import br.com.caelum.estoque.modelo.usuario.AutorizacaoException;
import br.com.caelum.estoque.modelo.usuario.TokenDao;
import br.com.caelum.estoque.modelo.usuario.TokenUsuario;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

import java.util.List;

import static jakarta.jws.soap.SOAPBinding.*;

@SuppressWarnings({"FieldMayBeFinal", "CanBeFinal", "NonJaxWsWebServices"})
@WebService
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL, parameterStyle = ParameterStyle.WRAPPED)
public class EstoqueWS {
	
	private ItemDao dao = new ItemDao();

	@WebMethod(operationName = "TodosOsItens")
	@WebResult(name = "item")
	public ListaItens getItens(@WebParam(name="filtros")Filtros filtros) {

		System.out.println("Chamando getItens()");
		List<Filtro> listaFiltros = filtros.getLista();
		List<Item> lista = dao.todosItens(listaFiltros);

		return new ListaItens(lista);
	}

	@WebMethod(action = "CadastrarItem", operationName = "CadastrarItem")
	@WebResult(name = "item")
	public Item cadastrarItem(@WebParam(name = "tokenUsuario", header = true) TokenUsuario token,
							  @WebParam(name="item")Item item) throws AutorizacaoException {

		System.out.println("cadastrando item " + item + ", Token: " + token);

		boolean valido = new TokenDao().ehValido(token);

		if (!valido) {
			throw new AutorizacaoException("Autorização falhou");
		}

		new ItemValidador(item).validate();

		this.dao.cadastrar(item);
		return item;
	}

	@WebMethod(operationName = "CadastrarItem2")
	@WebResult(name = "item")
	public Item cadastrarItem2(@WebParam(name = "tokenUsuario", header = true) TokenUsuario token,
							  @WebParam(name="item")Item item) throws AutorizacaoException {

		boolean valido = new TokenDao().ehValido(token);

		if (!valido) {
			throw new AutorizacaoException("Autorização falhou");
		}

		new ItemValidador(item).validate();

		this.dao.cadastrar(item);
		return item;
	}
}
