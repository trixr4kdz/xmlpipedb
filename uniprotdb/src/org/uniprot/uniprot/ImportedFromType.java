//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-09/29/2005 11:56 AM(valikov)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.29 at 11:27:53 PM PDT 
//


package org.uniprot.uniprot;


/**
 * Describes the source of the evidence, when it is not assigned by UniProt, but imported from an external database.
 * Java content class for importedFromType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/Users/dondi/Downloads/xsd2db/db-gen/xsd//uniprot.xsd line 1003)
 * <p>
 * <pre>
 * &lt;complexType name="importedFromType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dbReference" type="{http://uniprot.org/uniprot}dbReferenceType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface ImportedFromType {


    /**
     * Gets the value of the dbReference property.
     * 
     * @return
     *     possible object is
     *     {@link org.uniprot.uniprot.DbReferenceType}
     */
    org.uniprot.uniprot.DbReferenceType getDbReference();

    /**
     * Sets the value of the dbReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.uniprot.uniprot.DbReferenceType}
     */
    void setDbReference(org.uniprot.uniprot.DbReferenceType value);

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