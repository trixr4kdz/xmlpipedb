//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-09/29/2005 11:56 AM(valikov)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.16 at 12:18:25 AM PDT 
//


package org.uniprot.uniprot.impl;

public class BpcCommentGroupKineticsTypeImpl implements org.uniprot.uniprot.BpcCommentGroupKineticsType, com.sun.xml.bind.JAXBObject, org.uniprot.uniprot.impl.runtime.UnmarshallableObject, org.uniprot.uniprot.impl.runtime.XMLSerializable, org.uniprot.uniprot.impl.runtime.ValidatableObject
{

    protected com.sun.xml.bind.util.ListImpl _KM;
    protected com.sun.xml.bind.util.ListImpl _Vmax;
    protected com.sun.xml.bind.util.ListImpl _Text;
    public final static java.lang.Class version = (org.uniprot.uniprot.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;
    protected java.lang.Long _Hjid;
    protected java.lang.Long _Hjversion;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (org.uniprot.uniprot.BpcCommentGroupKineticsType.class);
    }

    protected com.sun.xml.bind.util.ListImpl _getKM() {
        if (_KM == null) {
            _KM = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
        }
        return _KM;
    }

    public java.util.List getKM() {
        return _getKM();
    }

    protected com.sun.xml.bind.util.ListImpl _getVmax() {
        if (_Vmax == null) {
            _Vmax = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
        }
        return _Vmax;
    }

    public java.util.List getVmax() {
        return _getVmax();
    }

    protected com.sun.xml.bind.util.ListImpl _getText() {
        if (_Text == null) {
            _Text = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
        }
        return _Text;
    }

    public java.util.List getText() {
        return _getText();
    }

    public org.uniprot.uniprot.impl.runtime.UnmarshallingEventHandler createUnmarshaller(org.uniprot.uniprot.impl.runtime.UnmarshallingContext context) {
        return new org.uniprot.uniprot.impl.BpcCommentGroupKineticsTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(org.uniprot.uniprot.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_KM == null)? 0 :_KM.size());
        int idx2 = 0;
        final int len2 = ((_Vmax == null)? 0 :_Vmax.size());
        int idx3 = 0;
        final int len3 = ((_Text == null)? 0 :_Text.size());
        while (idx1 != len1) {
            context.startElement("http://uniprot.org/uniprot", "KM");
            int idx_0 = idx1;
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _KM.get(idx_0 ++)), "KM");
            context.endNamespaceDecls();
            int idx_1 = idx1;
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _KM.get(idx_1 ++)), "KM");
            context.endAttributes();
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _KM.get(idx1 ++)), "KM");
            context.endElement();
        }
        while (idx2 != len2) {
            context.startElement("http://uniprot.org/uniprot", "Vmax");
            int idx_2 = idx2;
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Vmax.get(idx_2 ++)), "Vmax");
            context.endNamespaceDecls();
            int idx_3 = idx2;
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Vmax.get(idx_3 ++)), "Vmax");
            context.endAttributes();
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _Vmax.get(idx2 ++)), "Vmax");
            context.endElement();
        }
        while (idx3 != len3) {
            context.startElement("http://uniprot.org/uniprot", "text");
            int idx_4 = idx3;
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Text.get(idx_4 ++)), "Text");
            context.endNamespaceDecls();
            int idx_5 = idx3;
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Text.get(idx_5 ++)), "Text");
            context.endAttributes();
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _Text.get(idx3 ++)), "Text");
            context.endElement();
        }
    }

    public void serializeAttributes(org.uniprot.uniprot.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_KM == null)? 0 :_KM.size());
        int idx2 = 0;
        final int len2 = ((_Vmax == null)? 0 :_Vmax.size());
        int idx3 = 0;
        final int len3 = ((_Text == null)? 0 :_Text.size());
        while (idx1 != len1) {
            idx1 += 1;
        }
        while (idx2 != len2) {
            idx2 += 1;
        }
        while (idx3 != len3) {
            idx3 += 1;
        }
    }

    public void serializeURIs(org.uniprot.uniprot.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_KM == null)? 0 :_KM.size());
        int idx2 = 0;
        final int len2 = ((_Vmax == null)? 0 :_Vmax.size());
        int idx3 = 0;
        final int len3 = ((_Text == null)? 0 :_Text.size());
        while (idx1 != len1) {
            idx1 += 1;
        }
        while (idx2 != len2) {
            idx2 += 1;
        }
        while (idx3 != len3) {
            idx3 += 1;
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (org.uniprot.uniprot.BpcCommentGroupKineticsType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsr\u0000\u001dcom.sun.msv.grammar.ChoiceEx"
+"p\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000"
+"\u0002xq\u0000~\u0000\u0003sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000\'com.s"
+"un.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001f"
+"Lcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv.grammar.Eleme"
+"ntExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fcontentModel"
+"q\u0000~\u0000\u0002xq\u0000~\u0000\u0003q\u0000~\u0000\rp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u000epp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\tq\u0000~\u0000\rpsr\u0000 c"
+"om.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tname"
+"Classq\u0000~\u0000\u000fxq\u0000~\u0000\u0003q\u0000~\u0000\rpsr\u00002com.sun.msv.grammar.Expression$Any"
+"StringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000\f\u0001q\u0000~\u0000\u0019sr\u0000 com.sun.msv"
+".grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.Name"
+"Class\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$Epsilon"
+"Expression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u001aq\u0000~\u0000\u001fsr\u0000#com.sun.msv.grammar"
+".SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;"
+"L\u0000\fnamespaceURIq\u0000~\u0000!xq\u0000~\u0000\u001ct\u0000\'org.uniprot.uniprot.EvidencedSt"
+"ringTypet\u0000+http://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u0007"
+"ppsq\u0000~\u0000\u0016q\u0000~\u0000\rpsr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002d"
+"tt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dL"
+"com/sun/msv/util/StringPair;xq\u0000~\u0000\u0003ppsr\u0000\"com.sun.msv.datatype"
+".xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.Builti"
+"nAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteT"
+"ype\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000!L\u0000\btypeNameq\u0000~\u0000!L\u0000\nwhiteSpacet\u0000."
+"Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http://ww"
+"w.w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd."
+"WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datat"
+"ype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.gram"
+"mar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003ppsr\u0000\u001bcom.s"
+"un.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000!L\u0000\fnamespa"
+"ceURIq\u0000~\u0000!xpq\u0000~\u00002q\u0000~\u00001sq\u0000~\u0000 t\u0000\u0004typet\u0000)http://www.w3.org/2001"
+"/XMLSchema-instanceq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000\u0002KMt\u0000\u001ahttp://uniprot.org/uni"
+"protq\u0000~\u0000\u001fsq\u0000~\u0000\u0007ppsq\u0000~\u0000\tq\u0000~\u0000\rpsq\u0000~\u0000\u000eq\u0000~\u0000\rp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u000epp\u0000s"
+"q\u0000~\u0000\u0007ppsq\u0000~\u0000\tq\u0000~\u0000\rpsq\u0000~\u0000\u0016q\u0000~\u0000\rpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000#q\u0000~"
+"\u0000$sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0016q\u0000~\u0000\rpq\u0000~\u0000*q\u0000~\u0000:q\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000\u0004Vmaxq\u0000~\u0000?q\u0000~\u0000\u001f"
+"sq\u0000~\u0000\u0007ppsq\u0000~\u0000\tq\u0000~\u0000\rpsq\u0000~\u0000\u000eq\u0000~\u0000\rp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u000epp\u0000sq\u0000~\u0000\u0007ppsq"
+"\u0000~\u0000\tq\u0000~\u0000\rpsq\u0000~\u0000\u0016q\u0000~\u0000\rpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000#q\u0000~\u0000$sq\u0000~\u0000\u0007p"
+"psq\u0000~\u0000\u0016q\u0000~\u0000\rpq\u0000~\u0000*q\u0000~\u0000:q\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000\u0004textq\u0000~\u0000?q\u0000~\u0000\u001fsr\u0000\"com.s"
+"un.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/s"
+"un/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.g"
+"rammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstream"
+"VersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/ExpressionPool;xp\u0000\u0000\u0000"
+"\u0014\u0001pq\u0000~\u0000\u0012q\u0000~\u0000Cq\u0000~\u0000Pq\u0000~\u0000\u0005q\u0000~\u0000\bq\u0000~\u0000@q\u0000~\u0000Mq\u0000~\u0000\u000bq\u0000~\u0000Aq\u0000~\u0000Nq\u0000~\u0000\u0015q\u0000"
+"~\u0000Fq\u0000~\u0000Sq\u0000~\u0000\u0006q\u0000~\u0000\u0014q\u0000~\u0000Eq\u0000~\u0000Rq\u0000~\u0000%q\u0000~\u0000Iq\u0000~\u0000Vx"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if ((null == obj)||(!(obj instanceof org.uniprot.uniprot.BpcCommentGroupKineticsType))) {
            return false;
        }
        org.uniprot.uniprot.impl.BpcCommentGroupKineticsTypeImpl target = ((org.uniprot.uniprot.impl.BpcCommentGroupKineticsTypeImpl) obj);
        {
            java.util.List value = this.getKM();
            java.util.List targetValue = target.getKM();
            if (!((value == targetValue)||((value!= null)&&value.equals(targetValue)))) {
                return false;
            }
        }
        {
            java.util.List value = this.getVmax();
            java.util.List targetValue = target.getVmax();
            if (!((value == targetValue)||((value!= null)&&value.equals(targetValue)))) {
                return false;
            }
        }
        {
            java.util.List value = this.getText();
            java.util.List targetValue = target.getText();
            if (!((value == targetValue)||((value!= null)&&value.equals(targetValue)))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int hash = 7;
        {
            java.util.List value = this.getKM();
            hash = ((31 *hash)+((null == value)? 0 :value.hashCode()));
        }
        {
            java.util.List value = this.getVmax();
            hash = ((31 *hash)+((null == value)? 0 :value.hashCode()));
        }
        {
            java.util.List value = this.getText();
            hash = ((31 *hash)+((null == value)? 0 :value.hashCode()));
        }
        return hash;
    }

    public java.lang.Long getHjid() {
        return _Hjid;
    }

    public void setHjid(java.lang.Long value) {
        _Hjid = value;
    }

    public java.lang.Long getHjversion() {
        return _Hjversion;
    }

    public void setHjversion(java.lang.Long value) {
        _Hjversion = value;
    }

    public class Unmarshaller
        extends org.uniprot.uniprot.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(org.uniprot.uniprot.impl.runtime.UnmarshallingContext context) {
            super(context, "----------");
        }

        protected Unmarshaller(org.uniprot.uniprot.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return org.uniprot.uniprot.impl.BpcCommentGroupKineticsTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
                        attIdx = context.getAttribute("", "evidence");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("", "status");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  6 :
                        if (("Vmax" == ___local)&&("http://uniprot.org/uniprot" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 4;
                            return ;
                        }
                        if (("text" == ___local)&&("http://uniprot.org/uniprot" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 7;
                            return ;
                        }
                        state = 9;
                        continue outer;
                    case  9 :
                        if (("text" == ___local)&&("http://uniprot.org/uniprot" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 7;
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        if (("KM" == ___local)&&("http://uniprot.org/uniprot" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 1;
                            return ;
                        }
                        state = 3;
                        continue outer;
                    case  7 :
                        attIdx = context.getAttribute("", "evidence");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("", "status");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  4 :
                        attIdx = context.getAttribute("", "evidence");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("", "status");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  3 :
                        if (("KM" == ___local)&&("http://uniprot.org/uniprot" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 1;
                            return ;
                        }
                        if (("Vmax" == ___local)&&("http://uniprot.org/uniprot" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 4;
                            return ;
                        }
                        state = 6;
                        continue outer;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
                        attIdx = context.getAttribute("", "evidence");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "status");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  5 :
                        if (("Vmax" == ___local)&&("http://uniprot.org/uniprot" == ___uri)) {
                            context.popAttributes();
                            state = 6;
                            return ;
                        }
                        break;
                    case  6 :
                        state = 9;
                        continue outer;
                    case  8 :
                        if (("text" == ___local)&&("http://uniprot.org/uniprot" == ___uri)) {
                            context.popAttributes();
                            state = 9;
                            return ;
                        }
                        break;
                    case  2 :
                        if (("KM" == ___local)&&("http://uniprot.org/uniprot" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  9 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        state = 3;
                        continue outer;
                    case  7 :
                        attIdx = context.getAttribute("", "evidence");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "status");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  4 :
                        attIdx = context.getAttribute("", "evidence");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "status");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  3 :
                        state = 6;
                        continue outer;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
                        if (("evidence" == ___local)&&("" == ___uri)) {
                            _getKM().add(((org.uniprot.uniprot.impl.EvidencedStringTypeImpl) spawnChildFromEnterAttribute((org.uniprot.uniprot.impl.EvidencedStringTypeImpl.class), 2, ___uri, ___local, ___qname)));
                            return ;
                        }
                        if (("status" == ___local)&&("" == ___uri)) {
                            _getKM().add(((org.uniprot.uniprot.impl.EvidencedStringTypeImpl) spawnChildFromEnterAttribute((org.uniprot.uniprot.impl.EvidencedStringTypeImpl.class), 2, ___uri, ___local, ___qname)));
                            return ;
                        }
                        break;
                    case  6 :
                        state = 9;
                        continue outer;
                    case  9 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        state = 3;
                        continue outer;
                    case  7 :
                        if (("evidence" == ___local)&&("" == ___uri)) {
                            _getText().add(((org.uniprot.uniprot.impl.EvidencedStringTypeImpl) spawnChildFromEnterAttribute((org.uniprot.uniprot.impl.EvidencedStringTypeImpl.class), 8, ___uri, ___local, ___qname)));
                            return ;
                        }
                        if (("status" == ___local)&&("" == ___uri)) {
                            _getText().add(((org.uniprot.uniprot.impl.EvidencedStringTypeImpl) spawnChildFromEnterAttribute((org.uniprot.uniprot.impl.EvidencedStringTypeImpl.class), 8, ___uri, ___local, ___qname)));
                            return ;
                        }
                        break;
                    case  4 :
                        if (("evidence" == ___local)&&("" == ___uri)) {
                            _getVmax().add(((org.uniprot.uniprot.impl.EvidencedStringTypeImpl) spawnChildFromEnterAttribute((org.uniprot.uniprot.impl.EvidencedStringTypeImpl.class), 5, ___uri, ___local, ___qname)));
                            return ;
                        }
                        if (("status" == ___local)&&("" == ___uri)) {
                            _getVmax().add(((org.uniprot.uniprot.impl.EvidencedStringTypeImpl) spawnChildFromEnterAttribute((org.uniprot.uniprot.impl.EvidencedStringTypeImpl.class), 5, ___uri, ___local, ___qname)));
                            return ;
                        }
                        break;
                    case  3 :
                        state = 6;
                        continue outer;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
                        attIdx = context.getAttribute("", "evidence");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "status");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  6 :
                        state = 9;
                        continue outer;
                    case  9 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        state = 3;
                        continue outer;
                    case  7 :
                        attIdx = context.getAttribute("", "evidence");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "status");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  4 :
                        attIdx = context.getAttribute("", "evidence");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "status");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  3 :
                        state = 6;
                        continue outer;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  1 :
                            attIdx = context.getAttribute("", "evidence");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("", "status");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            _getKM().add(((org.uniprot.uniprot.impl.EvidencedStringTypeImpl) spawnChildFromText((org.uniprot.uniprot.impl.EvidencedStringTypeImpl.class), 2, value)));
                            return ;
                        case  6 :
                            state = 9;
                            continue outer;
                        case  9 :
                            revertToParentFromText(value);
                            return ;
                        case  0 :
                            state = 3;
                            continue outer;
                        case  7 :
                            attIdx = context.getAttribute("", "evidence");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("", "status");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            _getText().add(((org.uniprot.uniprot.impl.EvidencedStringTypeImpl) spawnChildFromText((org.uniprot.uniprot.impl.EvidencedStringTypeImpl.class), 8, value)));
                            return ;
                        case  4 :
                            attIdx = context.getAttribute("", "evidence");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("", "status");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            _getVmax().add(((org.uniprot.uniprot.impl.EvidencedStringTypeImpl) spawnChildFromText((org.uniprot.uniprot.impl.EvidencedStringTypeImpl.class), 5, value)));
                            return ;
                        case  3 :
                            state = 6;
                            continue outer;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}
