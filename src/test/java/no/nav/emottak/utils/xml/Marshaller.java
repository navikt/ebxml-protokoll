package no.nav.emottak.utils.xml;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.StringReader;
import java.io.StringWriter;

public class Marshaller {

    private JAXBContext jaxbContext;
    private jakarta.xml.bind.Marshaller marshaller;
    private Unmarshaller unmarshaller;

    public Marshaller() {
        try {
            jaxbContext = JAXBContext.newInstance(
                    org.oasis_open.committees.ebxml_cppa.schema.cpp_cpa_2_0.ObjectFactory.class,
                    org.oasis_open.committees.ebxml_msg.schema.msg_header_2_0.ObjectFactory.class,
                    org.xmlsoap.schemas.soap.envelope.ObjectFactory.class,
                    org.w3._1999.xlink.ObjectFactory.class,
                    org.w3._2009.xmldsig11_.ObjectFactory.class);
            marshaller = jaxbContext.createMarshaller();
            unmarshaller = jaxbContext.createUnmarshaller();
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }

    public String marshal(Object any) {
        try {
            StringWriter w = new StringWriter();
            marshaller.marshal(any, w);
            return w.toString();
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }

    public <T> T unmarshall(String xml, Class<T> clazz) {
        try {
            XMLStreamReader r = XMLInputFactory.newInstance().createXMLStreamReader(new StringReader(xml));
            return unmarshaller.unmarshal(r, clazz).getValue();
        } catch (XMLStreamException | JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}
