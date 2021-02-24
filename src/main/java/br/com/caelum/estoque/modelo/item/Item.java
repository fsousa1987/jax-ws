package br.com.caelum.estoque.modelo.item;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.Objects;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Item {

	@XmlElement(required=true)
	private String codigo;

	@XmlElement(required=true)
	private String nome;

	@XmlElement(required=true)
	private String tipo;

	@XmlElement(required=true)
	private int quantidade;

	Item() {
		super();
	}

	public Item(String codigo, String nome, String tipo, int quantidade) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.tipo = tipo;
		this.quantidade = quantidade;
	}

	Item(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Item item = (Item) o;
		return codigo.equals(item.codigo);
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public String toString() {
		return "Item [codigo=" + codigo + ", nome=" + nome + ", tipo=" + tipo + ", quantidade="
				+ quantidade + "]";
	}

	public static class Builder {
		
		private String codigo;
		private String nome;
		private String tipo;
		private int quantidade;
		
		public Builder comNome(String nome) {
			this.nome = nome;
			return this;
		}
		
		public Builder comTipo(String tipo) {
			this.tipo = tipo;
			return this;
		}
		
		public Builder comCodigo(String codigo) {
			this.codigo = codigo;
			return this;
		}
		
		public Builder comQuantidade(int quantidade) {
			this.quantidade = quantidade;
			return this;
		}
		
		public Item build() {
			return new Item(this.codigo,this.nome,this.tipo,this.quantidade);
		}
		
	}
	
}
