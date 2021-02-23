package br.com.caelum.estoque.ws;

import jakarta.xml.ws.Endpoint;

public class PublicaWebService {
	
	public static void main(String[] args) {
		
		EstoqueWS service = new EstoqueWS();
		String url = "http://localhost:8080/estoquews";

		System.out.println("Service rodando " + url + "?wsdl");

		disableWarning();
		Endpoint.publish(url, service);
	}

	public static void disableWarning() {
		System.err.close();
		System.setErr(System.out);
	}
}
