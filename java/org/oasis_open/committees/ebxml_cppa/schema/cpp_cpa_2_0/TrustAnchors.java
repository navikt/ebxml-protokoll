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
 *         &lt;element name="AnchorCertificateRef" type="{http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd}CertificateRef.type" maxOccurs="unbounded"/&gt;
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
    "anchorCertificateRef"
})
@XmlRootElement(name = "TrustAnchors")
public class TrustAnchors
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AnchorCertificateRef", required = true)
    @NotNull
    protected List<@NotNull CertificateRefType> anchorCertificateRef;

    /**
     * Gets the value of the anchorCertificateRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anchorCertificateRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnchorCertificateRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CertificateRefType }
     * 
     * 
     */
    @NotNull
    public List<@NotNull CertificateRefType> getAnchorCertificateRef() {
        if (anchorCertificateRef == null) {
            anchorCertificateRef = new ArrayList<CertificateRefType>();
        }
        return this.anchorCertificateRef;
    }

}
