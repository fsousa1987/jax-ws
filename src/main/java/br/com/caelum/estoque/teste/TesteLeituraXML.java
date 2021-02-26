package br.com.caelum.estoque.teste;

import br.com.caelum.estoque.modelo.item.Item;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

public class TesteLeituraXML {

    public static void main(String[] args) throws JAXBException {

        JAXBContext context = JAXBContext.newInstance(Item.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        System.out.println(unmarshaller.unmarshal(new File("item.xml"))); //ou marshaller.marshal(item, System.out);
    }
}
