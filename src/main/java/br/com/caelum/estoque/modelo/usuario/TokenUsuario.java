package br.com.caelum.estoque.modelo.usuario;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

import java.util.Date;
import java.util.Objects;

@XmlAccessorType(XmlAccessType.FIELD)
public class TokenUsuario {

	@XmlElement(required=true)
	private String token;

	@XmlElement(required=true)
	private Date dataValidade;
	
	//JAX-B precisa desse construtor
	TokenUsuario() {
	}

	public TokenUsuario(String token, Date dataValidade) {
		this.token = token;
		this.dataValidade = dataValidade;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Date getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		TokenUsuario that = (TokenUsuario) o;
		return token.equals(that.token);
	}

	@Override
	public int hashCode() {
		return Objects.hash(token);
	}

	@Override
	public String toString() {
		return "TokenUsuario [token=" + token + ", dataValidade=" + dataValidade + "]";
	}
}
