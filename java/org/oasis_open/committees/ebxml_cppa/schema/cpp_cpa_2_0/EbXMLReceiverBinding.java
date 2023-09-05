//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.04 at 02:30:27 PM CEST 
//


package org.oasis_open.committees.ebxml_cppa.schema.cpp_cpa_2_0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
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
 *         &lt;element ref="{http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd}ReliableMessaging" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd}PersistDuration" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd}ReceiverNonRepudiation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd}ReceiverDigitalEnvelope" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd}NamespaceSupported" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute ref="{http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd}version use="required""/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "reliableMessaging",
    "persistDuration",
    "receiverNonRepudiation",
    "receiverDigitalEnvelope",
    "namespaceSupported"
})
@XmlRootElement(name = "ebXMLReceiverBinding")
public class EbXMLReceiverBinding
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ReliableMessaging")
    protected ReliableMessaging reliableMessaging;
    @XmlElement(name = "PersistDuration")
    protected Duration persistDuration;
    @XmlElement(name = "ReceiverNonRepudiation")
    protected ReceiverNonRepudiation receiverNonRepudiation;
    @XmlElement(name = "ReceiverDigitalEnvelope")
    protected ReceiverDigitalEnvelope receiverDigitalEnvelope;
    @XmlElement(name = "NamespaceSupported")
    @NotNull
    protected List<@NotNull NamespaceSupported> namespaceSupported;
    @XmlAttribute(name = "version", namespace = "http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd", required = true)
    @NotNull
    protected String version;

    /**
     * Gets the value of the reliableMessaging property.
     * 
     * @return
     *     possible object is
     *     {@link ReliableMessaging }
     *     
     */
    public ReliableMessaging getReliableMessaging() {
        return reliableMessaging;
    }

    /**
     * Sets the value of the reliableMessaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReliableMessaging }
     *     
     */
    public void setReliableMessaging(ReliableMessaging value) {
        this.reliableMessaging = value;
    }

    /**
     * Gets the value of the persistDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPersistDuration() {
        return persistDuration;
    }

    /**
     * Sets the value of the persistDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPersistDuration(Duration value) {
        this.persistDuration = value;
    }

    /**
     * Gets the value of the receiverNonRepudiation property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiverNonRepudiation }
     *     
     */
    public ReceiverNonRepudiation getReceiverNonRepudiation() {
        return receiverNonRepudiation;
    }

    /**
     * Sets the value of the receiverNonRepudiation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiverNonRepudiation }
     *     
     */
    public void setReceiverNonRepudiation(ReceiverNonRepudiation value) {
        this.receiverNonRepudiation = value;
    }

    /**
     * Gets the value of the receiverDigitalEnvelope property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiverDigitalEnvelope }
     *     
     */
    public ReceiverDigitalEnvelope getReceiverDigitalEnvelope() {
        return receiverDigitalEnvelope;
    }

    /**
     * Sets the value of the receiverDigitalEnvelope property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiverDigitalEnvelope }
     *     
     */
    public void setReceiverDigitalEnvelope(ReceiverDigitalEnvelope value) {
        this.receiverDigitalEnvelope = value;
    }

    /**
     * Gets the value of the namespaceSupported property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the namespaceSupported property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNamespaceSupported().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NamespaceSupported }
     * 
     * 
     */
    @NotNull
    public List<@NotNull NamespaceSupported> getNamespaceSupported() {
        if (namespaceSupported == null) {
            namespaceSupported = new ArrayList<NamespaceSupported>();
        }
        return this.namespaceSupported;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @NotNull
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(
        @NotNull
        String value) {
        this.version = value;
    }

}