//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-09/29/2005 11:56 AM(valikov)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.16 at 12:18:25 AM PDT 
//


package org.uniprot.uniprot;


/**
 * Describes a sequence location as either a range with a begin and end or as a position. The 'sequence' attribute is only used when the location is not on the canonical sequence displayed in the current entry.
 * Java content class for locationType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/Users/dondi/Documents/Main/Eclipse/research/xmlpipedb-uniprotdb/xsd//uniprot.xsd line 947)
 * <p>
 * <pre>
 * &lt;complexType name="locationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="begin" type="{http://uniprot.org/uniprot}positionType"/>
 *           &lt;element name="end" type="{http://uniprot.org/uniprot}positionType"/>
 *         &lt;/sequence>
 *         &lt;element name="position" type="{http://uniprot.org/uniprot}positionType"/>
 *       &lt;/choice>
 *       &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface LocationType {


    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link org.uniprot.uniprot.PositionType}
     */
    org.uniprot.uniprot.PositionType getPosition();

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.uniprot.uniprot.PositionType}
     */
    void setPosition(org.uniprot.uniprot.PositionType value);

    /**
     * Gets the value of the begin property.
     * 
     * @return
     *     possible object is
     *     {@link org.uniprot.uniprot.PositionType}
     */
    org.uniprot.uniprot.PositionType getBegin();

    /**
     * Sets the value of the begin property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.uniprot.uniprot.PositionType}
     */
    void setBegin(org.uniprot.uniprot.PositionType value);

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link org.uniprot.uniprot.PositionType}
     */
    org.uniprot.uniprot.PositionType getEnd();

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.uniprot.uniprot.PositionType}
     */
    void setEnd(org.uniprot.uniprot.PositionType value);

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getSequence();

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setSequence(java.lang.String value);

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
