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
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="ThisPartyActionBinding" type="{http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd}ActionBinding.type"/&gt;
 *         &lt;element name="OtherPartyActionBinding" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd}CanReceive" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "thisPartyActionBinding",
    "otherPartyActionBinding",
    "canReceive"
})
@XmlRootElement(name = "CanSend")
public class CanSend
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ThisPartyActionBinding", required = true)
    @NotNull
    protected ActionBindingType thisPartyActionBinding;
    @XmlElement(name = "OtherPartyActionBinding")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object otherPartyActionBinding;
    @XmlElement(name = "CanReceive")
    @NotNull
    protected List<@NotNull CanReceive> canReceive;

    /**
     * Gets the value of the thisPartyActionBinding property.
     * 
     * @return
     *     possible object is
     *     {@link ActionBindingType }
     *     
     */
    @NotNull
    public ActionBindingType getThisPartyActionBinding() {
        return thisPartyActionBinding;
    }

    /**
     * Sets the value of the thisPartyActionBinding property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionBindingType }
     *     
     */
    public void setThisPartyActionBinding(
        @NotNull
        ActionBindingType value) {
        this.thisPartyActionBinding = value;
    }

    /**
     * Gets the value of the otherPartyActionBinding property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOtherPartyActionBinding() {
        return otherPartyActionBinding;
    }

    /**
     * Sets the value of the otherPartyActionBinding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOtherPartyActionBinding(Object value) {
        this.otherPartyActionBinding = value;
    }

    /**
     * Gets the value of the canReceive property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the canReceive property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCanReceive().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CanReceive }
     * 
     * 
     */
    @NotNull
    public List<@NotNull CanReceive> getCanReceive() {
        if (canReceive == null) {
            canReceive = new ArrayList<CanReceive>();
        }
        return this.canReceive;
    }

}
