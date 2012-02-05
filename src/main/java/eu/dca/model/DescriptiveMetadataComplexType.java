/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: Holds the descriptive metadata of an object record.
 * How to record: The attribute xml:lang is mandatory and specifies
 * the language of the descriptive metadata.For fully multi-lingual
 * resources, repeat this element once for each language
 * represented.If only a few data fields (e.g. title) are provided
 * in more than one language, the respective text elements may be
 * repeated specifying the lang attribute on the text level.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class DescriptiveMetadataComplexType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * In due course, we should install the relevant ISO 2- and
     * 3-letter
     *  codes as the enumerated possible values . . .
     */
    private java.lang.String _lang;

    /**
     * Definition: Wrapper for all classifying information about an
     * object / work including the object's / work type and other
     * classifications. 
     */
    private eu.dca.model.ObjectClassificationWrap _objectClassificationWrap;

    /**
     * Definition: A Wrapper for information that identifies the
     * object.
     */
    private eu.dca.model.ObjectIdentificationWrap _objectIdentificationWrap;

    /**
     * Definition: Wrapper for event sets.
     */
    private eu.dca.model.EventWrap _eventWrap;

    /**
     * Definition: Wrapper for infomation about related topics and
     * works, collections, etc.
     */
    private eu.dca.model.ObjectRelationWrap _objectRelationWrap;


      //----------------/
     //- Constructors -/
    //----------------/

    public DescriptiveMetadataComplexType() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'eventWrap'. The field
     * 'eventWrap' has the following description: Definition:
     * Wrapper for event sets.
     * 
     * @return the value of field 'EventWrap'.
     */
    public eu.dca.model.EventWrap getEventWrap(
    ) {
        return this._eventWrap;
    }

    /**
     * Returns the value of field 'lang'. The field 'lang' has the
     * following description: In due course, we should install the
     * relevant ISO 2- and 3-letter
     *  codes as the enumerated possible values . . .
     * 
     * @return the value of field 'Lang'.
     */
    public java.lang.String getLang(
    ) {
        return this._lang;
    }

    /**
     * Returns the value of field 'objectClassificationWrap'. The
     * field 'objectClassificationWrap' has the following
     * description: Definition: Wrapper for all classifying
     * information about an object / work including the object's /
     * work type and other classifications. 
     * 
     * @return the value of field 'ObjectClassificationWrap'.
     */
    public eu.dca.model.ObjectClassificationWrap getObjectClassificationWrap(
    ) {
        return this._objectClassificationWrap;
    }

    /**
     * Returns the value of field 'objectIdentificationWrap'. The
     * field 'objectIdentificationWrap' has the following
     * description: Definition: A Wrapper for information that
     * identifies the object.
     * 
     * @return the value of field 'ObjectIdentificationWrap'.
     */
    public eu.dca.model.ObjectIdentificationWrap getObjectIdentificationWrap(
    ) {
        return this._objectIdentificationWrap;
    }

    /**
     * Returns the value of field 'objectRelationWrap'. The field
     * 'objectRelationWrap' has the following description:
     * Definition: Wrapper for infomation about related topics and
     * works, collections, etc.
     * 
     * @return the value of field 'ObjectRelationWrap'.
     */
    public eu.dca.model.ObjectRelationWrap getObjectRelationWrap(
    ) {
        return this._objectRelationWrap;
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
     * Sets the value of field 'eventWrap'. The field 'eventWrap'
     * has the following description: Definition: Wrapper for event
     * sets.
     * 
     * @param eventWrap the value of field 'eventWrap'.
     */
    public void setEventWrap(
            final eu.dca.model.EventWrap eventWrap) {
        this._eventWrap = eventWrap;
    }

    /**
     * Sets the value of field 'lang'. The field 'lang' has the
     * following description: In due course, we should install the
     * relevant ISO 2- and 3-letter
     *  codes as the enumerated possible values . . .
     * 
     * @param lang the value of field 'lang'.
     */
    public void setLang(
            final java.lang.String lang) {
        this._lang = lang;
    }

    /**
     * Sets the value of field 'objectClassificationWrap'. The
     * field 'objectClassificationWrap' has the following
     * description: Definition: Wrapper for all classifying
     * information about an object / work including the object's /
     * work type and other classifications. 
     * 
     * @param objectClassificationWrap the value of field
     * 'objectClassificationWrap'.
     */
    public void setObjectClassificationWrap(
            final eu.dca.model.ObjectClassificationWrap objectClassificationWrap) {
        this._objectClassificationWrap = objectClassificationWrap;
    }

    /**
     * Sets the value of field 'objectIdentificationWrap'. The
     * field 'objectIdentificationWrap' has the following
     * description: Definition: A Wrapper for information that
     * identifies the object.
     * 
     * @param objectIdentificationWrap the value of field
     * 'objectIdentificationWrap'.
     */
    public void setObjectIdentificationWrap(
            final eu.dca.model.ObjectIdentificationWrap objectIdentificationWrap) {
        this._objectIdentificationWrap = objectIdentificationWrap;
    }

    /**
     * Sets the value of field 'objectRelationWrap'. The field
     * 'objectRelationWrap' has the following description:
     * Definition: Wrapper for infomation about related topics and
     * works, collections, etc.
     * 
     * @param objectRelationWrap the value of field
     * 'objectRelationWrap'.
     */
    public void setObjectRelationWrap(
            final eu.dca.model.ObjectRelationWrap objectRelationWrap) {
        this._objectRelationWrap = objectRelationWrap;
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
