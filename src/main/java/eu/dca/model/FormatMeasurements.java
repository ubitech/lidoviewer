/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: The configuration of an object / work, including
 * technical formats. Used as necessary.How to record: Example
 * values: Vignette, VHS, IMAX, and DOS
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class FormatMeasurements extends eu.dca.model.TextComplexType 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * internal content storage
     */
    private java.lang.String _content = "";

    /**
     * Definition: Assigns a priority order for online presentation
     * of the element. 
     */
    private long _sortorder;

    /**
     * keeps track of state for field: _sortorder
     */
    private boolean _has_sortorder;


      //----------------/
     //- Constructors -/
    //----------------/

    public FormatMeasurements() {
        super();
        setContent("");
    }

    public FormatMeasurements(final java.lang.String defaultValue) {
        try {
            setContent( new java.lang.String(defaultValue));
         } catch(Exception e) {
            throw new RuntimeException("Unable to cast default value for simple content!");
         } 
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteSortorder(
    ) {
        this._has_sortorder= false;
    }

    /**
     * Returns the value of field 'content'. The field 'content'
     * has the following description: internal content storage
     * 
     * @return the value of field 'Content'.
     */
    public java.lang.String getContent(
    ) {
        return this._content;
    }

    /**
     * Returns the value of field 'sortorder'. The field
     * 'sortorder' has the following description: Definition:
     * Assigns a priority order for online presentation of the
     * element. 
     * 
     * @return the value of field 'Sortorder'.
     */
    public long getSortorder(
    ) {
        return this._sortorder;
    }

    /**
     * Method hasSortorder.
     * 
     * @return true if at least one Sortorder has been added
     */
    public boolean hasSortorder(
    ) {
        return this._has_sortorder;
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
     * Sets the value of field 'content'. The field 'content' has
     * the following description: internal content storage
     * 
     * @param content the value of field 'content'.
     */
    public void setContent(
            final java.lang.String content) {
        this._content = content;
    }

    /**
     * Sets the value of field 'sortorder'. The field 'sortorder'
     * has the following description: Definition: Assigns a
     * priority order for online presentation of the element. 
     * 
     * @param sortorder the value of field 'sortorder'.
     */
    public void setSortorder(
            final long sortorder) {
        this._sortorder = sortorder;
        this._has_sortorder = true;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled eu.dca.model.FormatMeasurements
     */
    public static eu.dca.model.FormatMeasurements unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (eu.dca.model.FormatMeasurements) org.exolab.castor.xml.Unmarshaller.unmarshal(eu.dca.model.FormatMeasurements.class, reader);
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
