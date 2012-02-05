/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: A Wrapper for information that identifies the
 * object.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ObjectIdentificationWrap implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: Wrapper for Object name / Title information. 
     */
    private eu.dca.model.TitleWrap _titleWrap;

    /**
     * Definition: A wrapper for information about inscriptions and
     * other marks.
     */
    private eu.dca.model.InscriptionsWrap _inscriptionsWrap;

    /**
     * Definition: Wrapper for Repository/ Location information.
     */
    private eu.dca.model.RepositoryWrap _repositoryWrap;

    /**
     * Definition: A wrapper for the state and edition of the
     * object / work. 
     */
    private eu.dca.model.DisplayStateEditionWrap _displayStateEditionWrap;

    /**
     * Definition: A wrapper for Description/Descriptive Note
     * information.
     */
    private eu.dca.model.ObjectDescriptionWrap _objectDescriptionWrap;

    /**
     * Definition: A wrapper for the Measurements.
     */
    private eu.dca.model.ObjectMeasurementsWrap _objectMeasurementsWrap;


      //----------------/
     //- Constructors -/
    //----------------/

    public ObjectIdentificationWrap() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'displayStateEditionWrap'. The
     * field 'displayStateEditionWrap' has the following
     * description: Definition: A wrapper for the state and edition
     * of the object / work. 
     * 
     * @return the value of field 'DisplayStateEditionWrap'.
     */
    public eu.dca.model.DisplayStateEditionWrap getDisplayStateEditionWrap(
    ) {
        return this._displayStateEditionWrap;
    }

    /**
     * Returns the value of field 'inscriptionsWrap'. The field
     * 'inscriptionsWrap' has the following description:
     * Definition: A wrapper for information about inscriptions and
     * other marks.
     * 
     * @return the value of field 'InscriptionsWrap'.
     */
    public eu.dca.model.InscriptionsWrap getInscriptionsWrap(
    ) {
        return this._inscriptionsWrap;
    }

    /**
     * Returns the value of field 'objectDescriptionWrap'. The
     * field 'objectDescriptionWrap' has the following description:
     * Definition: A wrapper for Description/Descriptive Note
     * information.
     * 
     * @return the value of field 'ObjectDescriptionWrap'.
     */
    public eu.dca.model.ObjectDescriptionWrap getObjectDescriptionWrap(
    ) {
        return this._objectDescriptionWrap;
    }

    /**
     * Returns the value of field 'objectMeasurementsWrap'. The
     * field 'objectMeasurementsWrap' has the following
     * description: Definition: A wrapper for the Measurements.
     * 
     * @return the value of field 'ObjectMeasurementsWrap'.
     */
    public eu.dca.model.ObjectMeasurementsWrap getObjectMeasurementsWrap(
    ) {
        return this._objectMeasurementsWrap;
    }

    /**
     * Returns the value of field 'repositoryWrap'. The field
     * 'repositoryWrap' has the following description: Definition:
     * Wrapper for Repository/ Location information.
     * 
     * @return the value of field 'RepositoryWrap'.
     */
    public eu.dca.model.RepositoryWrap getRepositoryWrap(
    ) {
        return this._repositoryWrap;
    }

    /**
     * Returns the value of field 'titleWrap'. The field
     * 'titleWrap' has the following description: Definition:
     * Wrapper for Object name / Title information. 
     * 
     * @return the value of field 'TitleWrap'.
     */
    public eu.dca.model.TitleWrap getTitleWrap(
    ) {
        return this._titleWrap;
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
     * Sets the value of field 'displayStateEditionWrap'. The field
     * 'displayStateEditionWrap' has the following description:
     * Definition: A wrapper for the state and edition of the
     * object / work. 
     * 
     * @param displayStateEditionWrap the value of field
     * 'displayStateEditionWrap'.
     */
    public void setDisplayStateEditionWrap(
            final eu.dca.model.DisplayStateEditionWrap displayStateEditionWrap) {
        this._displayStateEditionWrap = displayStateEditionWrap;
    }

    /**
     * Sets the value of field 'inscriptionsWrap'. The field
     * 'inscriptionsWrap' has the following description:
     * Definition: A wrapper for information about inscriptions and
     * other marks.
     * 
     * @param inscriptionsWrap the value of field 'inscriptionsWrap'
     */
    public void setInscriptionsWrap(
            final eu.dca.model.InscriptionsWrap inscriptionsWrap) {
        this._inscriptionsWrap = inscriptionsWrap;
    }

    /**
     * Sets the value of field 'objectDescriptionWrap'. The field
     * 'objectDescriptionWrap' has the following description:
     * Definition: A wrapper for Description/Descriptive Note
     * information.
     * 
     * @param objectDescriptionWrap the value of field
     * 'objectDescriptionWrap'.
     */
    public void setObjectDescriptionWrap(
            final eu.dca.model.ObjectDescriptionWrap objectDescriptionWrap) {
        this._objectDescriptionWrap = objectDescriptionWrap;
    }

    /**
     * Sets the value of field 'objectMeasurementsWrap'. The field
     * 'objectMeasurementsWrap' has the following description:
     * Definition: A wrapper for the Measurements.
     * 
     * @param objectMeasurementsWrap the value of field
     * 'objectMeasurementsWrap'.
     */
    public void setObjectMeasurementsWrap(
            final eu.dca.model.ObjectMeasurementsWrap objectMeasurementsWrap) {
        this._objectMeasurementsWrap = objectMeasurementsWrap;
    }

    /**
     * Sets the value of field 'repositoryWrap'. The field
     * 'repositoryWrap' has the following description: Definition:
     * Wrapper for Repository/ Location information.
     * 
     * @param repositoryWrap the value of field 'repositoryWrap'.
     */
    public void setRepositoryWrap(
            final eu.dca.model.RepositoryWrap repositoryWrap) {
        this._repositoryWrap = repositoryWrap;
    }

    /**
     * Sets the value of field 'titleWrap'. The field 'titleWrap'
     * has the following description: Definition: Wrapper for
     * Object name / Title information. 
     * 
     * @param titleWrap the value of field 'titleWrap'.
     */
    public void setTitleWrap(
            final eu.dca.model.TitleWrap titleWrap) {
        this._titleWrap = titleWrap;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled eu.dca.model.ObjectIdentificationWrap
     */
    public static eu.dca.model.ObjectIdentificationWrap unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (eu.dca.model.ObjectIdentificationWrap) org.exolab.castor.xml.Unmarshaller.unmarshal(eu.dca.model.ObjectIdentificationWrap.class, reader);
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
