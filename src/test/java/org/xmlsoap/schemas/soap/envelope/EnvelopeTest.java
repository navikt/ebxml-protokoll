package org.xmlsoap.schemas.soap.envelope;

import no.nav.emottak.utils.xml.Marshaller;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EnvelopeTest {

    private String ENVELOPE = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><ns5:Envelope xmlns:ns6=\"http://www.w3.org/2000/09/xmldsig#\" xmlns:ns5=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ns7=\"http://www.w3.org/2009/xmldsig11#\" xmlns:ns2=\"http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd\" xmlns:ns4=\"http://www.oasis-open.org/committees/ebxml-msg/schema/msg-header-2_0.xsd\" xmlns:ns3=\"http://www.w3.org/1999/xlink\"><ns5:Header/></ns5:Envelope>";

    @Test
    void marshal() {
        Envelope env = new Envelope();
        Marshaller m = new Marshaller();
        env.setHeader(new Header());
        String xml = m.marshal(env);
        assertTrue(xml.contains("Envelope "));
    }

    @Test
    void unmarshal() {
        Marshaller m = new Marshaller();
        Envelope env = m.unmarshall(ENVELOPE, Envelope.class);
        assertEquals(env.getClass(), Envelope.class);
    }

}
