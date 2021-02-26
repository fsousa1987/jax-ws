package br.com.caelum.estoque.teste;

import br.com.caelum.estoque.modelo.item.Item;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;

public class TesteItemParaXML {

    public static void main(String[] args) throws JAXBException {

        Item item = new Item.Builder().comCodigo("MEA").comNome("MEAN").comQuantidade(4).comTipo("Livro").build();

        JAXBContext context = JAXBContext.newInstance(Item.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.marshal(item, new File("item.xml")); //ou marshaller.marshal(item, System.out);
    }
}
