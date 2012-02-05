/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: Wrapper for data classifying the object /
 * work.Includes all classifying information about an object /
 * work, such as: object / work type, style, genre, form, age, sex,
 * and phase, or by how holding organization structures its
 * collection (e.g. fine art, decorative art, prints and drawings,
 * natural science, numismatics, or local history).
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ObjectClassificationWrap implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: A wrapper for Object/Work Types.
     */
    private eu.dca.model.ObjectWorkTypeWrap _objectWorkTypeWrap;

    /**
     * Definition: A wrapper for any classification used to
     * categorize an object / work by grouping it together with
     * others on the basis of similar characteristics.
     */
    private eu.dca.model.ClassificationWrap _classificationWrap;


      //----------------/
     //- Constructors -/
    //----------------/

    public ObjectClassificationWrap() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'classificationWrap'. The field
     * 'classificationWrap' has the following description:
     * Definition: A wrapper for any classification used to
     * categorize an object / work by grouping it together with
     * others on the basis of similar characteristics.
     * 
     * @return the value of field 'ClassificationWrap'.
     */
    public eu.dca.model.ClassificationWrap getClassificationWrap(
    ) {
        return this._classificationWrap;
    }

    /**
     * Returns the value of field 'objectWorkTypeWrap'. The field
     * 'objectWorkTypeWrap' has the following description:
     * Definition: A wrapper for Object/Work Types.
     * 
     * @return the value of field 'ObjectWorkTypeWrap'.
     */
    public eu.dca.model.ObjectWorkTypeWrap getObjectWorkTypeWrap(
    ) {
        return this._objectWorkTypeWrap;
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
     * Sets the value of field 'classificationWrap'. The field
     * 'classificationWrap' has the following description:
     * Definition: A wrapper for any classification used to
     * categorize an object / work by grouping it together with
     * others on the basis of similar characteristics.
     * 
     * @param classificationWrap the value of field
     * 'classificationWrap'.
     */
    public void setClassificationWrap(
            final eu.dca.model.ClassificationWrap classificationWrap) {
        this._classificationWrap = classificationWrap;
    }

    /**
     * Sets the value of field 'objectWorkTypeWrap'. The field
     * 'objectWorkTypeWrap' has the following description:
     * Definition: A wrapper for Object/Work Types.
     * 
     * @param objectWorkTypeWrap the value of field
     * 'objectWorkTypeWrap'.
     */
    public void setObjectWorkTypeWrap(
            final eu.dca.model.ObjectWorkTypeWrap objectWorkTypeWrap) {
        this._objectWorkTypeWrap = objectWorkTypeWrap;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled eu.dca.model.ObjectClassificationWrap
     */
    public static eu.dca.model.ObjectClassificationWrap unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (eu.dca.model.ObjectClassificationWrap) org.exolab.castor.xml.Unmarshaller.unmarshal(eu.dca.model.ObjectClassificationWrap.class, reader);
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
