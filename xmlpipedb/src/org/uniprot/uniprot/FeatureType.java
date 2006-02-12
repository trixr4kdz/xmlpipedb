//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-09/29/2005 11:56 AM(valikov)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.03.05 at 01:26:07 PM PST 
//


package org.uniprot.uniprot;


/**
 * Currently there is only one basic feature type, but this will change in future with enhancement of the FT line parsers.
 * Java content class for featureType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/C:/Documents%20and%20Settings/Joey%20J%20Barrett/Desktop/workspace/xmlpipedb/schema/uniprot.xsd line 628)
 * <p>
 * <pre>
 * &lt;complexType name="featureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="original" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="variation" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="location" type="{http://uniprot.org/uniprot}locationType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="evidence" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ref" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="active site"/>
 *             &lt;enumeration value="binding site"/>
 *             &lt;enumeration value="calcium-binding region"/>
 *             &lt;enumeration value="chain"/>
 *             &lt;enumeration value="coiled-coil region"/>
 *             &lt;enumeration value="compositionally biased region"/>
 *             &lt;enumeration value="cross-link"/>
 *             &lt;enumeration value="disulfide bond"/>
 *             &lt;enumeration value="DNA-binding region"/>
 *             &lt;enumeration value="domain"/>
 *             &lt;enumeration value="glycosylation site"/>
 *             &lt;enumeration value="helix"/>
 *             &lt;enumeration value="initiator methionine"/>
 *             &lt;enumeration value="lipid moiety-binding region"/>
 *             &lt;enumeration value="metal ion-binding site"/>
 *             &lt;enumeration value="modified residue"/>
 *             &lt;enumeration value="mutagenesis site"/>
 *             &lt;enumeration value="non-consecutive residues"/>
 *             &lt;enumeration value="non-terminal residue"/>
 *             &lt;enumeration value="nucleotide phosphate-binding region"/>
 *             &lt;enumeration value="peptide"/>
 *             &lt;enumeration value="propeptide"/>
 *             &lt;enumeration value="region of interest"/>
 *             &lt;enumeration value="repeat"/>
 *             &lt;enumeration value="selenocysteine"/>
 *             &lt;enumeration value="sequence conflict"/>
 *             &lt;enumeration value="sequence variant"/>
 *             &lt;enumeration value="short sequence motif"/>
 *             &lt;enumeration value="signal peptide"/>
 *             &lt;enumeration value="site"/>
 *             &lt;enumeration value="splice variant"/>
 *             &lt;enumeration value="strand"/>
 *             &lt;enumeration value="topological domain"/>
 *             &lt;enumeration value="transit peptide"/>
 *             &lt;enumeration value="transmembrane region"/>
 *             &lt;enumeration value="turn"/>
 *             &lt;enumeration value="unsure residue"/>
 *             &lt;enumeration value="zinc finger region"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface FeatureType {


    /**
     * Gets the value of the original property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getOriginal();

    /**
     * Sets the value of the original property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setOriginal(java.lang.String value);

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getType();

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setType(java.lang.String value);

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getStatus();

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setStatus(java.lang.String value);

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getRef();

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setRef(java.lang.String value);

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getDescription();

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setDescription(java.lang.String value);

    /**
     * Gets the value of the Variation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Variation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String}
     * 
     */
    java.util.List getVariation();

    /**
     * Gets the value of the evidence property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getEvidence();

    /**
     * Sets the value of the evidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setEvidence(java.lang.String value);

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link org.uniprot.uniprot.LocationType}
     */
    org.uniprot.uniprot.LocationType getLocation();

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.uniprot.uniprot.LocationType}
     */
    void setLocation(org.uniprot.uniprot.LocationType value);

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getId();

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setId(java.lang.String value);

    /**
     * Gets the value of the hjid property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Long}
     */
    java.lang.Long getHjid();

    /**
     * Sets the value of the hjid property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Long}
     */
    void setHjid(java.lang.Long value);

    /**
     * Gets the value of the hjversion property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Long}
     */
    java.lang.Long getHjversion();

    /**
     * Sets the value of the hjversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Long}
     */
    void setHjversion(java.lang.Long value);

}
