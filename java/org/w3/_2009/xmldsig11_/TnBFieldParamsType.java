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
 * <p>Java class for TnBFieldParamsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TnBFieldParamsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.w3.org/2009/xmldsig11#}CharTwoFieldParamsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="K" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TnBFieldParamsType", propOrder = {
    "k"
})
public class TnBFieldParamsType
    extends CharTwoFieldParamsType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "K", required = true)
    @XmlSchemaType(name = "positiveInteger")
    @NotNull
    protected BigInteger k;

    /**
     * Gets the value of the k property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @NotNull
    public BigInteger getK() {
        return k;
    }

    /**
     * Sets the value of the k property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setK(
        @NotNull
        BigInteger value) {
        this.k = value;
    }

}
