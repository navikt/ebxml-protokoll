//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.04 at 02:30:27 PM CEST 
//


package org.oasis_open.committees.ebxml_cppa.schema.cpp_cpa_2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for endpointType.type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="endpointType.type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="login"/&gt;
 *     &lt;enumeration value="request"/&gt;
 *     &lt;enumeration value="response"/&gt;
 *     &lt;enumeration value="error"/&gt;
 *     &lt;enumeration value="allPurpose"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "endpointType.type")
@XmlEnum
public enum EndpointTypeType {

    @XmlEnumValue("login")
    LOGIN("login"),
    @XmlEnumValue("request")
    REQUEST("request"),
    @XmlEnumValue("response")
    RESPONSE("response"),
    @XmlEnumValue("error")
    ERROR("error"),
    @XmlEnumValue("allPurpose")
    ALL_PURPOSE("allPurpose");
    private final String value;

    EndpointTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EndpointTypeType fromValue(String v) {
        for (EndpointTypeType c: EndpointTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
