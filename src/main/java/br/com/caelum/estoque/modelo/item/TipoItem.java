package br.com.caelum.estoque.modelo.item;

import jakarta.xml.bind.annotation.XmlEnumValue;

@SuppressWarnings({"FieldMayBeFinal", "CanBeFinal"})
public enum TipoItem {

	@XmlEnumValue("Livro")
	LIVRO("Livro"), 
	@XmlEnumValue("Celular")
	CELULAR("Celular"),
	@XmlEnumValue("Tablet")
	TABLET("Tablet");
	
	private String nome;

	TipoItem(String nome) { 
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public static boolean existe(String valor) {
		try{
			//joga IllegalArgumentException caso nao exista
			TipoItem.valueOf(valor.toUpperCase());
		}catch(IllegalArgumentException e) {
			return false;
		}
		return true;
	}
}
