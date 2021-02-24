package br.com.caelum.estoque.modelo.usuario;

import jakarta.xml.ws.WebFault;

import java.util.Date;

@SuppressWarnings("SameReturnValue")
@WebFault(name="AutorizacaoFault", messageName="AutorizacaoFault")
public class AutorizacaoException extends Exception {

    public AutorizacaoException(String mensagem) {
        super(mensagem);
    }

    public InfoFault getFaultInfo() {
        return new InfoFault("Token invalido" , new Date());
    }
}
