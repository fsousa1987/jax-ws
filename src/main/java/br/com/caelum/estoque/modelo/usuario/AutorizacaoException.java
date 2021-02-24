package br.com.caelum.estoque.modelo.usuario;

import jakarta.xml.ws.WebFault;

@SuppressWarnings("SameReturnValue")
@WebFault(name = "AutorizacaoFault")
public class AutorizacaoException extends Exception {

    public AutorizacaoException(String mensagem) {
        super(mensagem);
    }

    public String getFaultInfo() {
        return "Token inválido";
    }
}
