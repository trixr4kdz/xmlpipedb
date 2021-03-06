//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-09/29/2005 11:56 AM(valikov)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.16 at 12:18:25 AM PDT 
//


package org.uniprot.uniprot;


/**
 * Describes a citation and a summary of its content.
 * Equivalent to the flat file RN-, RP-, RC-, RX-, RG-, RA-, RT- and RL-lines.
 * Java content class for referenceType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/Users/dondi/Documents/Main/Eclipse/research/xmlpipedb-uniprotdb/xsd//uniprot.xsd line 273)
 * <p>
 * <pre>
 * &lt;complexType name="referenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="citation" type="{http://uniprot.org/uniprot}citationType"/>
 *         &lt;group ref="{http://uniprot.org/uniprot}sptrCitationGroup"/>
 *       &lt;/sequence>
 *       &lt;attribute name="evidence" type="{http://uniprot.org/uniprot}intListType" />
 *       &lt;attribute name="key" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface ReferenceType {


    /**
     * Describes the scope of a citation.
     * Equivalent to the flat file RP-line.Gets the value of the Scope property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Scope property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScope().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String}
     * 
     */
    java.util.List getScope();

    /**
     * Gets the value of the Evidence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Evidence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvidence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * int
     * 
     */
    java.util.List getEvidence();

    /**
     * Gets the value of the citation property.
     * 
     * @return
     *     possible object is
     *     {@link org.uniprot.uniprot.CitationType}
     */
    org.uniprot.uniprot.CitationType getCitation();

    /**
     * Sets the value of the citation property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.uniprot.uniprot.CitationType}
     */
    void setCitation(org.uniprot.uniprot.CitationType value);

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getKey();

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setKey(java.lang.String value);

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link org.uniprot.uniprot.SourceDataType}
     */
    org.uniprot.uniprot.SourceDataType getSource();

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.uniprot.uniprot.SourceDataType}
     */
    void setSource(org.uniprot.uniprot.SourceDataType value);

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
