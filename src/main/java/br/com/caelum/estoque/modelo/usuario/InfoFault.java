package br.com.caelum.estoque.modelo.usuario;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

import java.util.Date;

@SuppressWarnings("FieldCanBeLocal")
@XmlAccessorType(XmlAccessType.FIELD)
public class InfoFault {

    private Date dataErro;
    private String mensagem;

    public InfoFault(String mensagem, Date dataErro) {
        this.mensagem = mensagem;
        this.dataErro = dataErro;
    }

    //JAX-B precisa
    InfoFault() {
    }
}
