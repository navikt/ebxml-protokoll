//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.04 at 02:30:27 PM CEST 
//


package org.w3._2001.xmlschema;

import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, Date>
{


    public Date unmarshal(String value) {
        return (nl.clockwork.ebms.jaxb.EbMSDateTimeConverter.parseDateTime(value));
    }

    public String marshal(Date value) {
        return (nl.clockwork.ebms.jaxb.EbMSDateTimeConverter.printDateTime(value));
    }

}