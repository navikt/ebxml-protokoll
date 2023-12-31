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
 *         &lt;element name="NonRepudiationProtocol" type="{http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd}protocol.type"/&gt;
 *         &lt;element ref="{http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd}HashFunction"/&gt;
 *         &lt;element ref="{http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd}SignatureAlgorithm" maxOccurs="unbounded"/&gt;
 *         &lt;element name="SigningCertificateRef" type="{http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd}CertificateRef.type"/&gt;
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
    "nonRepudiationProtocol",
    "hashFunction",
    "signatureAlgorithm",
    "signingCertificateRef"
})
@XmlRootElement(name = "SenderNonRepudiation")
public class SenderNonRepudiation
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "NonRepudiationProtocol", required = true)
    @NotNull
    protected ProtocolType nonRepudiationProtocol;
    @XmlElement(name = "HashFunction", required = true)
    @NotNull
    protected String hashFunction;
    @XmlElement(name = "SignatureAlgorithm", required = true)
    @NotNull
    protected List<@NotNull SignatureAlgorithm> signatureAlgorithm;
    @XmlElement(name = "SigningCertificateRef", required = true)
    @NotNull
    protected CertificateRefType signingCertificateRef;

    /**
     * Gets the value of the nonRepudiationProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolType }
     *     
     */
    @NotNull
    public ProtocolType getNonRepudiationProtocol() {
        return nonRepudiationProtocol;
    }

    /**
     * Sets the value of the nonRepudiationProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolType }
     *     
     */
    public void setNonRepudiationProtocol(
        @NotNull
        ProtocolType value) {
        this.nonRepudiationProtocol = value;
    }

    /**
     * Gets the value of the hashFunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @NotNull
    public String getHashFunction() {
        return hashFunction;
    }

    /**
     * Sets the value of the hashFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHashFunction(
        @NotNull
        String value) {
        this.hashFunction = value;
    }

    /**
     * Gets the value of the signatureAlgorithm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signatureAlgorithm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignatureAlgorithm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SignatureAlgorithm }
     * 
     * 
     */
    @NotNull
    public List<@NotNull SignatureAlgorithm> getSignatureAlgorithm() {
        if (signatureAlgorithm == null) {
            signatureAlgorithm = new ArrayList<SignatureAlgorithm>();
        }
        return this.signatureAlgorithm;
    }

    /**
     * Gets the value of the signingCertificateRef property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateRefType }
     *     
     */
    @NotNull
    public CertificateRefType getSigningCertificateRef() {
        return signingCertificateRef;
    }

    /**
     * Sets the value of the signingCertificateRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateRefType }
     *     
     */
    public void setSigningCertificateRef(
        @NotNull
        CertificateRefType value) {
        this.signingCertificateRef = value;
    }

}
