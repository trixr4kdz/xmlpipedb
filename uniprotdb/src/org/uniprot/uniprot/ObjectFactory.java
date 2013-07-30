//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-09/29/2005 11:56 AM(valikov)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.29 at 11:27:53 PM PDT 
//


package org.uniprot.uniprot;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.uniprot.uniprot package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
public class ObjectFactory
    extends org.uniprot.uniprot.impl.runtime.DefaultJAXBContextImpl
{

    private static java.util.HashMap defaultImplementations = new java.util.HashMap(81, 0.75F);
    private static java.util.HashMap rootTagMap = new java.util.HashMap();
    public final static org.uniprot.uniprot.impl.runtime.GrammarInfo grammarInfo = new org.uniprot.uniprot.impl.runtime.GrammarInfoImpl(rootTagMap, defaultImplementations, (org.uniprot.uniprot.ObjectFactory.class));
    public final static java.lang.Class version = (org.uniprot.uniprot.impl.JAXBVersion.class);

    static {
        defaultImplementations.put((org.uniprot.uniprot.GeneType.class), "org.uniprot.uniprot.impl.GeneTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.LocationType.class), "org.uniprot.uniprot.impl.LocationTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.SequenceType.class), "org.uniprot.uniprot.impl.SequenceTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.EvidenceType.class), "org.uniprot.uniprot.impl.EvidenceTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.ProteinType.class), "org.uniprot.uniprot.impl.ProteinTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.SourceDataType.Tissue.class), "org.uniprot.uniprot.impl.SourceDataTypeImpl$TissueImpl");
        defaultImplementations.put((org.uniprot.uniprot.PositionType.class), "org.uniprot.uniprot.impl.PositionTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.SubcellularLocationType.class), "org.uniprot.uniprot.impl.SubcellularLocationTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.NameListType.class), "org.uniprot.uniprot.impl.NameListTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.GeneNameType.class), "org.uniprot.uniprot.impl.GeneNameTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.ConsortiumType.class), "org.uniprot.uniprot.impl.ConsortiumTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.SourceDataType.StrainType.class), "org.uniprot.uniprot.impl.SourceDataTypeImpl$StrainTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.ImportedFromType.class), "org.uniprot.uniprot.impl.ImportedFromTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.Uniprot.class), "org.uniprot.uniprot.impl.UniprotImpl");
        defaultImplementations.put((org.uniprot.uniprot.CommentType.DiseaseType.class), "org.uniprot.uniprot.impl.CommentTypeImpl$DiseaseTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.IsoformType.NameType.class), "org.uniprot.uniprot.impl.IsoformTypeImpl$NameTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.ProteinNameGroupSubmittedNameType.class), "org.uniprot.uniprot.impl.ProteinNameGroupSubmittedNameTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.SourceDataType.class), "org.uniprot.uniprot.impl.SourceDataTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.EntryType.class), "org.uniprot.uniprot.impl.EntryTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.SourceDataType.Plasmid.class), "org.uniprot.uniprot.impl.SourceDataTypeImpl$PlasmidImpl");
        defaultImplementations.put((org.uniprot.uniprot.ProteinType.DomainType.class), "org.uniprot.uniprot.impl.ProteinTypeImpl$DomainTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.ReferenceType.class), "org.uniprot.uniprot.impl.ReferenceTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.CommentType.ConflictType.SequenceType.class), "org.uniprot.uniprot.impl.CommentTypeImpl$ConflictTypeImpl$SequenceTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.ProteinNameGroupAlternativeNameType.class), "org.uniprot.uniprot.impl.ProteinNameGroupAlternativeNameTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.IsoformType.SequenceType.class), "org.uniprot.uniprot.impl.IsoformTypeImpl$SequenceTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.CommentType.LinkType.class), "org.uniprot.uniprot.impl.CommentTypeImpl$LinkTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.StatusType.class), "org.uniprot.uniprot.impl.StatusTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.ProteinExistenceType.class), "org.uniprot.uniprot.impl.ProteinExistenceTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.SourceDataType.TissueType.class), "org.uniprot.uniprot.impl.SourceDataTypeImpl$TissueTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.ProteinNameGroupRecommendedNameType.class), "org.uniprot.uniprot.impl.ProteinNameGroupRecommendedNameTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.DbReferenceType.class), "org.uniprot.uniprot.impl.DbReferenceTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.Entry.class), "org.uniprot.uniprot.impl.EntryImpl");
        defaultImplementations.put((org.uniprot.uniprot.GeneLocationType.class), "org.uniprot.uniprot.impl.GeneLocationTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.PropertyType.class), "org.uniprot.uniprot.impl.PropertyTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.IsoformType.NoteType.class), "org.uniprot.uniprot.impl.IsoformTypeImpl$NoteTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.SourceType.class), "org.uniprot.uniprot.impl.SourceTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.OrganismNameType.class), "org.uniprot.uniprot.impl.OrganismNameTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.EvidencedStringType.class), "org.uniprot.uniprot.impl.EvidencedStringTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.EventType.class), "org.uniprot.uniprot.impl.EventTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.BpcCommentGroupAbsorptionType.class), "org.uniprot.uniprot.impl.BpcCommentGroupAbsorptionTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.SourceDataType.Strain.class), "org.uniprot.uniprot.impl.SourceDataTypeImpl$StrainImpl");
        defaultImplementations.put((org.uniprot.uniprot.NameListType.Consortium.class), "org.uniprot.uniprot.impl.NameListTypeImpl$ConsortiumImpl");
        defaultImplementations.put((org.uniprot.uniprot.ProteinType.ComponentType.class), "org.uniprot.uniprot.impl.ProteinTypeImpl$ComponentTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.CitationType.class), "org.uniprot.uniprot.impl.CitationTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.BpcCommentGroupKineticsType.class), "org.uniprot.uniprot.impl.BpcCommentGroupKineticsTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.UniprotType.class), "org.uniprot.uniprot.impl.UniprotTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.OrganismType.class), "org.uniprot.uniprot.impl.OrganismTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.SourceDataType.PlasmidType.class), "org.uniprot.uniprot.impl.SourceDataTypeImpl$PlasmidTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.IsoformType.class), "org.uniprot.uniprot.impl.IsoformTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.FeatureType.class), "org.uniprot.uniprot.impl.FeatureTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.PersonType.class), "org.uniprot.uniprot.impl.PersonTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.SourceDataType.Transposon.class), "org.uniprot.uniprot.impl.SourceDataTypeImpl$TransposonImpl");
        defaultImplementations.put((org.uniprot.uniprot.CommentType.ConflictType.class), "org.uniprot.uniprot.impl.CommentTypeImpl$ConflictTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.CommentType.class), "org.uniprot.uniprot.impl.CommentTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.InteractantType.class), "org.uniprot.uniprot.impl.InteractantTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.Copyright.class), "org.uniprot.uniprot.impl.CopyrightImpl");
        defaultImplementations.put((org.uniprot.uniprot.SourceDataType.TransposonType.class), "org.uniprot.uniprot.impl.SourceDataTypeImpl$TransposonTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.OrganismType.LineageType.class), "org.uniprot.uniprot.impl.OrganismTypeImpl$LineageTypeImpl");
        defaultImplementations.put((org.uniprot.uniprot.NameListType.Person.class), "org.uniprot.uniprot.impl.NameListTypeImpl$PersonImpl");
        defaultImplementations.put((org.uniprot.uniprot.KeywordType.class), "org.uniprot.uniprot.impl.KeywordTypeImpl");
        rootTagMap.put(new javax.xml.namespace.QName("http://uniprot.org/uniprot", "entry"), (org.uniprot.uniprot.Entry.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://uniprot.org/uniprot", "uniprot"), (org.uniprot.uniprot.Uniprot.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://uniprot.org/uniprot", "copyright"), (org.uniprot.uniprot.Copyright.class));
    }

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.uniprot.uniprot
     * 
     */
    public ObjectFactory() {
        super(grammarInfo);
    }

    /**
     * Create an instance of the specified Java content interface.
     * 
     * @param javaContentInterface
     *     the Class object of the javacontent interface to instantiate
     * @return
     *     a new instance
     * @throws JAXBException
     *     if an error occurs
     */
    public java.lang.Object newInstance(java.lang.Class javaContentInterface)
        throws javax.xml.bind.JAXBException
    {
        return super.newInstance(javaContentInterface);
    }

    /**
     * Get the specified property. This method can only be
     * used to get provider specific properties.
     * Attempting to get an undefined property will result
     * in a PropertyException being thrown.
     * 
     * @param name
     *     the name of the property to retrieve
     * @return
     *     the value of the requested property
     * @throws PropertyException
     *     when there is an error retrieving the given property or value
     */
    public java.lang.Object getProperty(java.lang.String name)
        throws javax.xml.bind.PropertyException
    {
        return super.getProperty(name);
    }

    /**
     * Set the specified property. This method can only be
     * used to set provider specific properties.
     * Attempting to set an undefined property will result
     * in a PropertyException being thrown.
     * 
     * @param name
     *     the name of the property to retrieve
     * @param value
     *     the value of the property to be set
     * @throws PropertyException
     *     when there is an error processing the given property or value
     */
    public void setProperty(java.lang.String name, java.lang.Object value)
        throws javax.xml.bind.PropertyException
    {
        super.setProperty(name, value);
    }

    /**
     * Create an instance of GeneType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.GeneType createGeneType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.GeneTypeImpl();
    }

    /**
     * Create an instance of LocationType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.LocationType createLocationType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.LocationTypeImpl();
    }

    /**
     * Create an instance of SequenceType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.SequenceType createSequenceType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.SequenceTypeImpl();
    }

    /**
     * Create an instance of EvidenceType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.EvidenceType createEvidenceType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.EvidenceTypeImpl();
    }

    /**
     * Create an instance of ProteinType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.ProteinType createProteinType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.ProteinTypeImpl();
    }

    /**
     * Create an instance of SourceDataTypeTissue
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.SourceDataType.Tissue createSourceDataTypeTissue()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.SourceDataTypeImpl.TissueImpl();
    }

    /**
     * Create an instance of PositionType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.PositionType createPositionType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.PositionTypeImpl();
    }

    /**
     * Create an instance of SubcellularLocationType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.SubcellularLocationType createSubcellularLocationType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.SubcellularLocationTypeImpl();
    }

    /**
     * Create an instance of NameListType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.NameListType createNameListType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.NameListTypeImpl();
    }

    /**
     * Create an instance of GeneNameType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.GeneNameType createGeneNameType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.GeneNameTypeImpl();
    }

    /**
     * Create an instance of ConsortiumType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.ConsortiumType createConsortiumType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.ConsortiumTypeImpl();
    }

    /**
     * Create an instance of SourceDataTypeStrainType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.SourceDataType.StrainType createSourceDataTypeStrainType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.SourceDataTypeImpl.StrainTypeImpl();
    }

    /**
     * Create an instance of ImportedFromType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.ImportedFromType createImportedFromType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.ImportedFromTypeImpl();
    }

    /**
     * Create an instance of Uniprot
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.Uniprot createUniprot()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.UniprotImpl();
    }

    /**
     * Create an instance of CommentTypeDiseaseType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.CommentType.DiseaseType createCommentTypeDiseaseType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.CommentTypeImpl.DiseaseTypeImpl();
    }

    /**
     * Create an instance of IsoformTypeNameType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.IsoformType.NameType createIsoformTypeNameType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.IsoformTypeImpl.NameTypeImpl();
    }

    /**
     * Create an instance of ProteinNameGroupSubmittedNameType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.ProteinNameGroupSubmittedNameType createProteinNameGroupSubmittedNameType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.ProteinNameGroupSubmittedNameTypeImpl();
    }

    /**
     * Create an instance of SourceDataType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.SourceDataType createSourceDataType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.SourceDataTypeImpl();
    }

    /**
     * Create an instance of EntryType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.EntryType createEntryType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.EntryTypeImpl();
    }

    /**
     * Create an instance of SourceDataTypePlasmid
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.SourceDataType.Plasmid createSourceDataTypePlasmid()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.SourceDataTypeImpl.PlasmidImpl();
    }

    /**
     * Create an instance of ProteinTypeDomainType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.ProteinType.DomainType createProteinTypeDomainType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.ProteinTypeImpl.DomainTypeImpl();
    }

    /**
     * Create an instance of ReferenceType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.ReferenceType createReferenceType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.ReferenceTypeImpl();
    }

    /**
     * Create an instance of CommentTypeConflictTypeSequenceType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.CommentType.ConflictType.SequenceType createCommentTypeConflictTypeSequenceType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.CommentTypeImpl.ConflictTypeImpl.SequenceTypeImpl();
    }

    /**
     * Create an instance of ProteinNameGroupAlternativeNameType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.ProteinNameGroupAlternativeNameType createProteinNameGroupAlternativeNameType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.ProteinNameGroupAlternativeNameTypeImpl();
    }

    /**
     * Create an instance of IsoformTypeSequenceType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.IsoformType.SequenceType createIsoformTypeSequenceType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.IsoformTypeImpl.SequenceTypeImpl();
    }

    /**
     * Create an instance of CommentTypeLinkType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.CommentType.LinkType createCommentTypeLinkType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.CommentTypeImpl.LinkTypeImpl();
    }

    /**
     * Create an instance of StatusType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.StatusType createStatusType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.StatusTypeImpl();
    }

    /**
     * Create an instance of ProteinExistenceType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.ProteinExistenceType createProteinExistenceType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.ProteinExistenceTypeImpl();
    }

    /**
     * Create an instance of SourceDataTypeTissueType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.SourceDataType.TissueType createSourceDataTypeTissueType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.SourceDataTypeImpl.TissueTypeImpl();
    }

    /**
     * Create an instance of ProteinNameGroupRecommendedNameType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.ProteinNameGroupRecommendedNameType createProteinNameGroupRecommendedNameType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.ProteinNameGroupRecommendedNameTypeImpl();
    }

    /**
     * Create an instance of DbReferenceType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.DbReferenceType createDbReferenceType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.DbReferenceTypeImpl();
    }

    /**
     * Create an instance of Entry
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.Entry createEntry()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.EntryImpl();
    }

    /**
     * Create an instance of GeneLocationType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.GeneLocationType createGeneLocationType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.GeneLocationTypeImpl();
    }

    /**
     * Create an instance of PropertyType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.PropertyType createPropertyType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.PropertyTypeImpl();
    }

    /**
     * Create an instance of IsoformTypeNoteType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.IsoformType.NoteType createIsoformTypeNoteType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.IsoformTypeImpl.NoteTypeImpl();
    }

    /**
     * Create an instance of SourceType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.SourceType createSourceType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.SourceTypeImpl();
    }

    /**
     * Create an instance of OrganismNameType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.OrganismNameType createOrganismNameType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.OrganismNameTypeImpl();
    }

    /**
     * Create an instance of EvidencedStringType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.EvidencedStringType createEvidencedStringType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.EvidencedStringTypeImpl();
    }

    /**
     * Create an instance of EventType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.EventType createEventType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.EventTypeImpl();
    }

    /**
     * Create an instance of BpcCommentGroupAbsorptionType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.BpcCommentGroupAbsorptionType createBpcCommentGroupAbsorptionType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.BpcCommentGroupAbsorptionTypeImpl();
    }

    /**
     * Create an instance of SourceDataTypeStrain
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.SourceDataType.Strain createSourceDataTypeStrain()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.SourceDataTypeImpl.StrainImpl();
    }

    /**
     * Create an instance of NameListTypeConsortium
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.NameListType.Consortium createNameListTypeConsortium()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.NameListTypeImpl.ConsortiumImpl();
    }

    /**
     * Create an instance of ProteinTypeComponentType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.ProteinType.ComponentType createProteinTypeComponentType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.ProteinTypeImpl.ComponentTypeImpl();
    }

    /**
     * Create an instance of CitationType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.CitationType createCitationType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.CitationTypeImpl();
    }

    /**
     * Create an instance of BpcCommentGroupKineticsType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.BpcCommentGroupKineticsType createBpcCommentGroupKineticsType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.BpcCommentGroupKineticsTypeImpl();
    }

    /**
     * Create an instance of UniprotType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.UniprotType createUniprotType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.UniprotTypeImpl();
    }

    /**
     * Create an instance of OrganismType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.OrganismType createOrganismType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.OrganismTypeImpl();
    }

    /**
     * Create an instance of SourceDataTypePlasmidType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.SourceDataType.PlasmidType createSourceDataTypePlasmidType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.SourceDataTypeImpl.PlasmidTypeImpl();
    }

    /**
     * Create an instance of IsoformType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.IsoformType createIsoformType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.IsoformTypeImpl();
    }

    /**
     * Create an instance of FeatureType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.FeatureType createFeatureType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.FeatureTypeImpl();
    }

    /**
     * Create an instance of PersonType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.PersonType createPersonType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.PersonTypeImpl();
    }

    /**
     * Create an instance of SourceDataTypeTransposon
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.SourceDataType.Transposon createSourceDataTypeTransposon()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.SourceDataTypeImpl.TransposonImpl();
    }

    /**
     * Create an instance of CommentTypeConflictType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.CommentType.ConflictType createCommentTypeConflictType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.CommentTypeImpl.ConflictTypeImpl();
    }

    /**
     * Create an instance of CommentType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.CommentType createCommentType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.CommentTypeImpl();
    }

    /**
     * Create an instance of InteractantType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.InteractantType createInteractantType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.InteractantTypeImpl();
    }

    /**
     * Create an instance of Copyright
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.Copyright createCopyright()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.CopyrightImpl();
    }

    /**
     * Create an instance of Copyright
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.Copyright createCopyright(java.lang.String value)
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.CopyrightImpl(value);
    }

    /**
     * Create an instance of SourceDataTypeTransposonType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.SourceDataType.TransposonType createSourceDataTypeTransposonType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.SourceDataTypeImpl.TransposonTypeImpl();
    }

    /**
     * Create an instance of OrganismTypeLineageType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.OrganismType.LineageType createOrganismTypeLineageType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.OrganismTypeImpl.LineageTypeImpl();
    }

    /**
     * Create an instance of NameListTypePerson
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.NameListType.Person createNameListTypePerson()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.NameListTypeImpl.PersonImpl();
    }

    /**
     * Create an instance of KeywordType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public org.uniprot.uniprot.KeywordType createKeywordType()
        throws javax.xml.bind.JAXBException
    {
        return new org.uniprot.uniprot.impl.KeywordTypeImpl();
    }

}
