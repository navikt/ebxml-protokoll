//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.04 at 02:30:27 PM CEST 
//


package org.oasis_open.committees.ebxml_cppa.schema.cpp_cpa_2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.github.labai.jsr305x.api.NotNull;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd}TrustAnchors" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd}SecurityPolicy" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="securityId" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "trustAnchors",
    "securityPolicy"
})
@XmlRootElement(name = "SecurityDetails")
public class SecurityDetails
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TrustAnchors")
    protected TrustAnchors trustAnchors;
    @XmlElement(name = "SecurityPolicy")
    protected SecurityPolicy securityPolicy;
    @XmlAttribute(name = "securityId", namespace = "http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    @NotNull
    protected String securityId;

    /**
     * Gets the value of the trustAnchors property.
     * 
     * @return
     *     possible object is
     *     {@link TrustAnchors }
     *     
     */
    public TrustAnchors getTrustAnchors() {
        return trustAnchors;
    }

    /**
     * Sets the value of the trustAnchors property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrustAnchors }
     *     
     */
    public void setTrustAnchors(TrustAnchors value) {
        this.trustAnchors = value;
    }

    /**
     * Gets the value of the securityPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityPolicy }
     *     
     */
    public SecurityPolicy getSecurityPolicy() {
        return securityPolicy;
    }

    /**
     * Sets the value of the securityPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityPolicy }
     *     
     */
    public void setSecurityPolicy(SecurityPolicy value) {
        this.securityPolicy = value;
    }

    /**
     * Gets the value of the securityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @NotNull
    public String getSecurityId() {
        return securityId;
    }

    /**
     * Sets the value of the securityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityId(
        @NotNull
        String value) {
        this.securityId = value;
    }

}
