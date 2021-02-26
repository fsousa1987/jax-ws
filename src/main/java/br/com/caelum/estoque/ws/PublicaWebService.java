package br.com.caelum.estoque.ws;

import br.com.caelum.estoque.service.RelatorioService;
import jakarta.xml.ws.Endpoint;

public class PublicaWebService {
	
	public static void main(String[] args) {

		EstoqueWS estoqueService = new EstoqueWS();
		RelatorioService relatorioService = new RelatorioService();

		String urlEstoque = "http://localhost:8080/estoquews";
		String urlRelatorio = "http://localhost:8080/relatorioservice";

		System.out.println("Service rodando " + urlEstoque + "?wsdl");
		System.out.println("Service rodando " + urlRelatorio + "?wsdl");

		disableWarning();
		Endpoint.publish(urlEstoque, estoqueService);
		Endpoint.publish(urlRelatorio, relatorioService);
	}

	public static void disableWarning() {
		System.err.close();
		System.setErr(System.out);
	}
}
