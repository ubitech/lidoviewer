/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: Holds the administrative metadata for an object /
 * work record. How to record: The attribute xml:lang is mandatory
 * and specifies the language of the administrative metadata.For
 * fully multi-lingual resources, repeat this element once for each
 * language represented.If only a few data fields (e.g. title,
 * creditline) are provided in more than one language, the
 * respective text elements may be repeated specifying the lang
 * attribute on the text level.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class AdministrativeMetadataComplexType implements java.io.Serializable {


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
     * Definition: Wrapper for rights information about the object
     * / work described.
     */
    private eu.dca.model.RightsWorkWrap _rightsWorkWrap;

    /**
     * Definition: A wrapper for information about the record that
     * contains the cataloguing information.
     */
    private eu.dca.model.RecordWrap _recordWrap;

    /**
     * Definition: A wrapper for resources that are surrogates for
     * an object / work, including digital images, videos or audio
     * files that represent it in an online service.
     */
    private eu.dca.model.ResourceWrap _resourceWrap;


      //----------------/
     //- Constructors -/
    //----------------/

    public AdministrativeMetadataComplexType() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

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
     * Returns the value of field 'recordWrap'. The field
     * 'recordWrap' has the following description: Definition: A
     * wrapper for information about the record that contains the
     * cataloguing information.
     * 
     * @return the value of field 'RecordWrap'.
     */
    public eu.dca.model.RecordWrap getRecordWrap(
    ) {
        return this._recordWrap;
    }

    /**
     * Returns the value of field 'resourceWrap'. The field
     * 'resourceWrap' has the following description: Definition: A
     * wrapper for resources that are surrogates for an object /
     * work, including digital images, videos or audio files that
     * represent it in an online service.
     * 
     * @return the value of field 'ResourceWrap'.
     */
    public eu.dca.model.ResourceWrap getResourceWrap(
    ) {
        return this._resourceWrap;
    }

    /**
     * Returns the value of field 'rightsWorkWrap'. The field
     * 'rightsWorkWrap' has the following description: Definition:
     * Wrapper for rights information about the object / work
     * described.
     * 
     * @return the value of field 'RightsWorkWrap'.
     */
    public eu.dca.model.RightsWorkWrap getRightsWorkWrap(
    ) {
        return this._rightsWorkWrap;
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
     * Sets the value of field 'recordWrap'. The field 'recordWrap'
     * has the following description: Definition: A wrapper for
     * information about the record that contains the cataloguing
     * information.
     * 
     * @param recordWrap the value of field 'recordWrap'.
     */
    public void setRecordWrap(
            final eu.dca.model.RecordWrap recordWrap) {
        this._recordWrap = recordWrap;
    }

    /**
     * Sets the value of field 'resourceWrap'. The field
     * 'resourceWrap' has the following description: Definition: A
     * wrapper for resources that are surrogates for an object /
     * work, including digital images, videos or audio files that
     * represent it in an online service.
     * 
     * @param resourceWrap the value of field 'resourceWrap'.
     */
    public void setResourceWrap(
            final eu.dca.model.ResourceWrap resourceWrap) {
        this._resourceWrap = resourceWrap;
    }

    /**
     * Sets the value of field 'rightsWorkWrap'. The field
     * 'rightsWorkWrap' has the following description: Definition:
     * Wrapper for rights information about the object / work
     * described.
     * 
     * @param rightsWorkWrap the value of field 'rightsWorkWrap'.
     */
    public void setRightsWorkWrap(
            final eu.dca.model.RightsWorkWrap rightsWorkWrap) {
        this._rightsWorkWrap = rightsWorkWrap;
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
