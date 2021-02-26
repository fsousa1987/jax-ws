package br.com.caelum.estoque.service;

import jakarta.jws.Oneway;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class RelatorioService {

    @Oneway
    @WebMethod(operationName="GerarRelatorio")
    public void gerarRelatorio() {
        // código omitido
    }
}
