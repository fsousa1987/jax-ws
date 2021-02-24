package br.com.caelum.estoque.adapter;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

import java.text.SimpleDateFormat;
import java.util.Date;

@SuppressWarnings({"FieldMayBeFinal", "CanBeFinal"})
public class DateAdapter extends XmlAdapter<String, Date> {

    private String pattern = "MM/dd/yyyy";

    @Override
    public Date unmarshal(String dateString) throws Exception {

        System.out.println(dateString);
        return new SimpleDateFormat(pattern).parse(dateString);
    }

    @Override
    public String marshal(Date date) {

        return new SimpleDateFormat(pattern).format(date);
    }
}
