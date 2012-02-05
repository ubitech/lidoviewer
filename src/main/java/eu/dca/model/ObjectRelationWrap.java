/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: Wrapper for infomation about related topics and
 * works, collections, etc.Notes: This includes visual contents and
 * all associated entities the object is about. 
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ObjectRelationWrap implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: A wrapper for Subject information. This may be
     * the visual content (e.g. the iconography of a painting) or
     * what the object is about.
     */
    private eu.dca.model.SubjectWrap _subjectWrap;

    /**
     * Definition: A wrapper for Related Works information.
     */
    private eu.dca.model.RelatedWorksWrap _relatedWorksWrap;


      //----------------/
     //- Constructors -/
    //----------------/

    public ObjectRelationWrap() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'relatedWorksWrap'. The field
     * 'relatedWorksWrap' has the following description:
     * Definition: A wrapper for Related Works information.
     * 
     * @return the value of field 'RelatedWorksWrap'.
     */
    public eu.dca.model.RelatedWorksWrap getRelatedWorksWrap(
    ) {
        return this._relatedWorksWrap;
    }

    /**
     * Returns the value of field 'subjectWrap'. The field
     * 'subjectWrap' has the following description: Definition: A
     * wrapper for Subject information. This may be the visual
     * content (e.g. the iconography of a painting) or what the
     * object is about.
     * 
     * @return the value of field 'SubjectWrap'.
     */
    public eu.dca.model.SubjectWrap getSubjectWrap(
    ) {
        return this._subjectWrap;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */
    public boolean isValid(
    ) {
        try {
            validate();
        } catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    }

    /**
     * 
     * 
     * @param out
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void marshal(
            final java.io.Writer out)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Marshaller.marshal(this, out);
    }

    /**
     * 
     * 
     * @param handler
     * @throws java.io.IOException if an IOException occurs during
     * marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     */
    public void marshal(
            final org.xml.sax.ContentHandler handler)
    throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Marshaller.marshal(this, handler);
    }

    /**
     * Sets the value of field 'relatedWorksWrap'. The field
     * 'relatedWorksWrap' has the following description:
     * Definition: A wrapper for Related Works information.
     * 
     * @param relatedWorksWrap the value of field 'relatedWorksWrap'
     */
    public void setRelatedWorksWrap(
            final eu.dca.model.RelatedWorksWrap relatedWorksWrap) {
        this._relatedWorksWrap = relatedWorksWrap;
    }

    /**
     * Sets the value of field 'subjectWrap'. The field
     * 'subjectWrap' has the following description: Definition: A
     * wrapper for Subject information. This may be the visual
     * content (e.g. the iconography of a painting) or what the
     * object is about.
     * 
     * @param subjectWrap the value of field 'subjectWrap'.
     */
    public void setSubjectWrap(
            final eu.dca.model.SubjectWrap subjectWrap) {
        this._subjectWrap = subjectWrap;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled eu.dca.model.ObjectRelationWrap
     */
    public static eu.dca.model.ObjectRelationWrap unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (eu.dca.model.ObjectRelationWrap) org.exolab.castor.xml.Unmarshaller.unmarshal(eu.dca.model.ObjectRelationWrap.class, reader);
    }

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void validate(
    )
    throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    }

}
