//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-09/29/2005 11:56 AM(valikov)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.16 at 12:18:25 AM PDT 
//


package org.uniprot.uniprot;


/**
 * Describes different types of citations.
 * Equivalent to the flat file RX-, RG-, RA-, RT- and RL-lines.
 * Java content class for citationType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/Users/dondi/Documents/Main/Eclipse/research/xmlpipedb-uniprotdb/xsd//uniprot.xsd line 288)
 * <p>
 * <pre>
 * &lt;complexType name="citationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="editorList" type="{http://uniprot.org/uniprot}nameListType" minOccurs="0"/>
 *         &lt;element name="authorList" type="{http://uniprot.org/uniprot}nameListType" minOccurs="0"/>
 *         &lt;element name="locator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dbReference" type="{http://uniprot.org/uniprot}dbReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="city" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="country" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="date">
 *         &lt;simpleType>
 *           &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}date {http://www.w3.org/2001/XMLSchema}gYearMonth {http://www.w3.org/2001/XMLSchema}gYear">
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="db" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="first" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="institute" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="last" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="publisher" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="book"/>
 *             &lt;enumeration value="journal article"/>
 *             &lt;enumeration value="online journal article"/>
 *             &lt;enumeration value="patent"/>
 *             &lt;enumeration value="submission"/>
 *             &lt;enumeration value="thesis"/>
 *             &lt;enumeration value="unpublished observations"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="volume" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface CitationType {


    /**
     * Describes the editors of a book (only used for books).
     * Equivalent to part of the flat file RL-line of books.
     * 
     * @return
     *     possible object is
     *     {@link org.uniprot.uniprot.NameListType}
     */
    org.uniprot.uniprot.NameListType getEditorList();

    /**
     * Describes the editors of a book (only used for books).
     * Equivalent to part of the flat file RL-line of books.
     * 
     * @param value
     *     allowed object is
     *     {@link org.uniprot.uniprot.NameListType}
     */
    void setEditorList(org.uniprot.uniprot.NameListType value);

    /**
     * Describes cross-references to bibliography databases (MEDLINE, PubMed, AGRICOLA) or other online resources (DOI).
     * Equivalent to the flat file RX-line.Gets the value of the DbReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the DbReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDbReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link org.uniprot.uniprot.DbReferenceType}
     * 
     */
    java.util.List getDbReference();

    /**
     * Describes the title of a citation.
     * Equivalent to the flat file RT-line.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getTitle();

    /**
     * Describes the title of a citation.
     * Equivalent to the flat file RT-line.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setTitle(java.lang.String value);

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getCity();

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setCity(java.lang.String value);

    /**
     * Gets the value of the publisher property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getPublisher();

    /**
     * Sets the value of the publisher property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setPublisher(java.lang.String value);

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Calendar}
     *     {@link java.lang.String}
     *     {@link java.lang.String}
     */
    java.lang.String getDate();

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Calendar}
     *     {@link java.lang.String}
     *     {@link java.lang.String}
     */
    void setDate(java.lang.String value);

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getName();

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setName(java.lang.String value);

    /**
     * Gets the value of the last property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getLast();

    /**
     * Sets the value of the last property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setLast(java.lang.String value);

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
     * Describes the location (URL) of an online journal article.
     * No flat file equivalent.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getLocator();

    /**
     * Describes the location (URL) of an online journal article.
     * No flat file equivalent.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setLocator(java.lang.String value);

    /**
     * Gets the value of the institute property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getInstitute();

    /**
     * Sets the value of the institute property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setInstitute(java.lang.String value);

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getNumber();

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setNumber(java.lang.String value);

    /**
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getVolume();

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setVolume(java.lang.String value);

    /**
     * Describes the authors of a citation.
     * Equivalent to the flat file RA-line.
     * 
     * @return
     *     possible object is
     *     {@link org.uniprot.uniprot.NameListType}
     */
    org.uniprot.uniprot.NameListType getAuthorList();

    /**
     * Describes the authors of a citation.
     * Equivalent to the flat file RA-line.
     * 
     * @param value
     *     allowed object is
     *     {@link org.uniprot.uniprot.NameListType}
     */
    void setAuthorList(org.uniprot.uniprot.NameListType value);

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getCountry();

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setCountry(java.lang.String value);

    /**
     * Gets the value of the first property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getFirst();

    /**
     * Sets the value of the first property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setFirst(java.lang.String value);

    /**
     * Gets the value of the db property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getDb();

    /**
     * Sets the value of the db property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setDb(java.lang.String value);

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
