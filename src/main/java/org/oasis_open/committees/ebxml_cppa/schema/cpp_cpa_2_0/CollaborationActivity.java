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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd}CollaborationActivity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" type="{http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd}non-empty-string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "collaborationActivity"
})
@XmlRootElement(name = "CollaborationActivity")
public class CollaborationActivity
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CollaborationActivity")
    protected CollaborationActivity collaborationActivity;
    @XmlAttribute(name = "name", namespace = "http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd")
    protected String name;

    /**
     * Gets the value of the collaborationActivity property.
     * 
     * @return
     *     possible object is
     *     {@link CollaborationActivity }
     *     
     */
    public CollaborationActivity getCollaborationActivity() {
        return collaborationActivity;
    }

    /**
     * Sets the value of the collaborationActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollaborationActivity }
     *     
     */
    public void setCollaborationActivity(CollaborationActivity value) {
        this.collaborationActivity = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
