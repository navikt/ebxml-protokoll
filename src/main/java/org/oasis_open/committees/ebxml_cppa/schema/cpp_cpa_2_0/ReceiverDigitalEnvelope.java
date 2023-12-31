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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="DigitalEnvelopeProtocol" type="{http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd}protocol.type"/&gt;
 *         &lt;element ref="{http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd}EncryptionAlgorithm" maxOccurs="unbounded"/&gt;
 *         &lt;element name="EncryptionCertificateRef" type="{http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd}CertificateRef.type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "digitalEnvelopeProtocol",
    "encryptionAlgorithm",
    "encryptionCertificateRef"
})
@XmlRootElement(name = "ReceiverDigitalEnvelope")
public class ReceiverDigitalEnvelope
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DigitalEnvelopeProtocol", required = true)
    @NotNull
    protected ProtocolType digitalEnvelopeProtocol;
    @XmlElement(name = "EncryptionAlgorithm", required = true)
    @NotNull
    protected List<@NotNull EncryptionAlgorithm> encryptionAlgorithm;
    @XmlElement(name = "EncryptionCertificateRef", required = true)
    @NotNull
    protected CertificateRefType encryptionCertificateRef;

    /**
     * Gets the value of the digitalEnvelopeProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolType }
     *     
     */
    @NotNull
    public ProtocolType getDigitalEnvelopeProtocol() {
        return digitalEnvelopeProtocol;
    }

    /**
     * Sets the value of the digitalEnvelopeProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolType }
     *     
     */
    public void setDigitalEnvelopeProtocol(
        @NotNull
        ProtocolType value) {
        this.digitalEnvelopeProtocol = value;
    }

    /**
     * Gets the value of the encryptionAlgorithm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the encryptionAlgorithm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEncryptionAlgorithm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EncryptionAlgorithm }
     * 
     * 
     */
    @NotNull
    public List<@NotNull EncryptionAlgorithm> getEncryptionAlgorithm() {
        if (encryptionAlgorithm == null) {
            encryptionAlgorithm = new ArrayList<EncryptionAlgorithm>();
        }
        return this.encryptionAlgorithm;
    }

    /**
     * Gets the value of the encryptionCertificateRef property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateRefType }
     *     
     */
    @NotNull
    public CertificateRefType getEncryptionCertificateRef() {
        return encryptionCertificateRef;
    }

    /**
     * Sets the value of the encryptionCertificateRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateRefType }
     *     
     */
    public void setEncryptionCertificateRef(
        @NotNull
        CertificateRefType value) {
        this.encryptionCertificateRef = value;
    }

}
