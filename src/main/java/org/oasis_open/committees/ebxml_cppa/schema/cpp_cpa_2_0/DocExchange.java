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
 *         &lt;element ref="{http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd}ebXMLSenderBinding" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd}ebXMLReceiverBinding" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="docExchangeId" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ebXMLSenderBinding",
    "ebXMLReceiverBinding"
})
@XmlRootElement(name = "DocExchange")
public class DocExchange
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected EbXMLSenderBinding ebXMLSenderBinding;
    protected EbXMLReceiverBinding ebXMLReceiverBinding;
    @XmlAttribute(name = "docExchangeId", namespace = "http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    @NotNull
    protected String docExchangeId;

    /**
     * Gets the value of the ebXMLSenderBinding property.
     * 
     * @return
     *     possible object is
     *     {@link EbXMLSenderBinding }
     *     
     */
    public EbXMLSenderBinding getEbXMLSenderBinding() {
        return ebXMLSenderBinding;
    }

    /**
     * Sets the value of the ebXMLSenderBinding property.
     * 
     * @param value
     *     allowed object is
     *     {@link EbXMLSenderBinding }
     *     
     */
    public void setEbXMLSenderBinding(EbXMLSenderBinding value) {
        this.ebXMLSenderBinding = value;
    }

    /**
     * Gets the value of the ebXMLReceiverBinding property.
     * 
     * @return
     *     possible object is
     *     {@link EbXMLReceiverBinding }
     *     
     */
    public EbXMLReceiverBinding getEbXMLReceiverBinding() {
        return ebXMLReceiverBinding;
    }

    /**
     * Sets the value of the ebXMLReceiverBinding property.
     * 
     * @param value
     *     allowed object is
     *     {@link EbXMLReceiverBinding }
     *     
     */
    public void setEbXMLReceiverBinding(EbXMLReceiverBinding value) {
        this.ebXMLReceiverBinding = value;
    }

    /**
     * Gets the value of the docExchangeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @NotNull
    public String getDocExchangeId() {
        return docExchangeId;
    }

    /**
     * Sets the value of the docExchangeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocExchangeId(
        @NotNull
        String value) {
        this.docExchangeId = value;
    }

}
