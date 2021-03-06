//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-09/29/2005 11:56 AM(valikov)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.16 at 12:18:25 AM PDT 
//


package org.uniprot.uniprot;


/**
 * Java content class for anonymous complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/Users/dondi/Documents/Main/Eclipse/research/xmlpipedb-uniprotdb/xsd//uniprot.xsd line 37)
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accession" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="protein" type="{http://uniprot.org/uniprot}proteinType"/>
 *         &lt;element name="gene" type="{http://uniprot.org/uniprot}geneType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="organism" type="{http://uniprot.org/uniprot}organismType"/>
 *         &lt;element name="organismHost" type="{http://uniprot.org/uniprot}organismType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="geneLocation" type="{http://uniprot.org/uniprot}geneLocationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reference" type="{http://uniprot.org/uniprot}referenceType" maxOccurs="unbounded"/>
 *         &lt;element name="comment" type="{http://uniprot.org/uniprot}commentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dbReference" type="{http://uniprot.org/uniprot}dbReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="proteinExistence" type="{http://uniprot.org/uniprot}proteinExistenceType"/>
 *         &lt;element name="keyword" type="{http://uniprot.org/uniprot}keywordType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="feature" type="{http://uniprot.org/uniprot}featureType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="evidence" type="{http://uniprot.org/uniprot}evidenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sequence" type="{http://uniprot.org/uniprot}sequenceType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="created" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="dataset" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Swiss-Prot"/>
 *             &lt;enumeration value="TrEMBL"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="modified" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface EntryType {


    /**
     * Gets the value of the Comment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Comment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link null}
     * {@link org.uniprot.uniprot.CommentType}
     * 
     */
    java.util.List getComment();

    /**
     * Gets the value of the organism property.
     * 
     * @return
     *     possible object is
     *     {@link org.uniprot.uniprot.OrganismType}
     */
    org.uniprot.uniprot.OrganismType getOrganism();

    /**
     * Sets the value of the organism property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.uniprot.uniprot.OrganismType}
     */
    void setOrganism(org.uniprot.uniprot.OrganismType value);

    /**
     * Gets the value of the modified property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Calendar}
     */
    java.util.Calendar getModified();

    /**
     * Sets the value of the modified property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Calendar}
     */
    void setModified(java.util.Calendar value);

    /**
     * Gets the value of the Keyword property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Keyword property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyword().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link org.uniprot.uniprot.KeywordType}
     * 
     */
    java.util.List getKeyword();

    /**
     * Gets the value of the Accession property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Accession property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccession().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String}
     * 
     */
    java.util.List getAccession();

    /**
     * Gets the value of the dataset property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getDataset();

    /**
     * Sets the value of the dataset property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setDataset(java.lang.String value);

    /**
     * Gets the value of the Reference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Reference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link org.uniprot.uniprot.ReferenceType}
     * 
     */
    java.util.List getReference();

    /**
     * Gets the value of the DbReference property.
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
     * Gets the value of the OrganismHost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the OrganismHost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganismHost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link org.uniprot.uniprot.OrganismType}
     * 
     */
    java.util.List getOrganismHost();

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link org.uniprot.uniprot.SequenceType}
     */
    org.uniprot.uniprot.SequenceType getSequence();

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.uniprot.uniprot.SequenceType}
     */
    void setSequence(org.uniprot.uniprot.SequenceType value);

    /**
     * Gets the value of the Feature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Feature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link org.uniprot.uniprot.FeatureType}
     * 
     */
    java.util.List getFeature();

    /**
     * Gets the value of the protein property.
     * 
     * @return
     *     possible object is
     *     {@link org.uniprot.uniprot.ProteinType}
     */
    org.uniprot.uniprot.ProteinType getProtein();

    /**
     * Sets the value of the protein property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.uniprot.uniprot.ProteinType}
     */
    void setProtein(org.uniprot.uniprot.ProteinType value);

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Calendar}
     */
    java.util.Calendar getCreated();

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Calendar}
     */
    void setCreated(java.util.Calendar value);

    /**
     * Gets the value of the Name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String}
     * 
     */
    java.util.List getName();

    /**
     * Gets the value of the Gene property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Gene property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGene().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link org.uniprot.uniprot.GeneType}
     * 
     */
    java.util.List getGene();

    /**
     * Gets the value of the version property.
     * 
     */
    int getVersion();

    /**
     * Sets the value of the version property.
     * 
     */
    void setVersion(int value);

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
     * {@link org.uniprot.uniprot.EvidenceType}
     * 
     */
    java.util.List getEvidence();

    /**
     * Gets the value of the GeneLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the GeneLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link org.uniprot.uniprot.GeneLocationType}
     * 
     */
    java.util.List getGeneLocation();

    /**
     * Gets the value of the proteinExistence property.
     * 
     * @return
     *     possible object is
     *     {@link org.uniprot.uniprot.ProteinExistenceType}
     */
    org.uniprot.uniprot.ProteinExistenceType getProteinExistence();

    /**
     * Sets the value of the proteinExistence property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.uniprot.uniprot.ProteinExistenceType}
     */
    void setProteinExistence(org.uniprot.uniprot.ProteinExistenceType value);

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
