//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.04 at 02:30:27 PM CEST 
//


package org.w3._2009.xmldsig11_;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.github.labai.jsr305x.api.NotNull;


/**
 * <p>Java class for PnBFieldParamsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PnBFieldParamsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.w3.org/2009/xmldsig11#}CharTwoFieldParamsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="K1" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="K2" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="K3" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PnBFieldParamsType", propOrder = {
    "k1",
    "k2",
    "k3"
})
public class PnBFieldParamsType
    extends CharTwoFieldParamsType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "K1", required = true)
    @XmlSchemaType(name = "positiveInteger")
    @NotNull
    protected BigInteger k1;
    @XmlElement(name = "K2", required = true)
    @XmlSchemaType(name = "positiveInteger")
    @NotNull
    protected BigInteger k2;
    @XmlElement(name = "K3", required = true)
    @XmlSchemaType(name = "positiveInteger")
    @NotNull
    protected BigInteger k3;

    /**
     * Gets the value of the k1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @NotNull
    public BigInteger getK1() {
        return k1;
    }

    /**
     * Sets the value of the k1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setK1(
        @NotNull
        BigInteger value) {
        this.k1 = value;
    }

    /**
     * Gets the value of the k2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @NotNull
    public BigInteger getK2() {
        return k2;
    }

    /**
     * Sets the value of the k2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setK2(
        @NotNull
        BigInteger value) {
        this.k2 = value;
    }

    /**
     * Gets the value of the k3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @NotNull
    public BigInteger getK3() {
        return k3;
    }

    /**
     * Sets the value of the k3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setK3(
        @NotNull
        BigInteger value) {
        this.k3 = value;
    }

}
