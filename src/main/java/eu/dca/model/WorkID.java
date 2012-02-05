/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: An unambiguous numeric or alphanumeric
 * identification number, assigned to the object by the institution
 * of custody.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class WorkID implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * internal content storage
     */
    private java.lang.String _content = "";

    /**
     * Definition: Qualifies the type of information given in the
     * holding element. 
     */
    private java.lang.String _type;

    /**
     * Definition: Assigns a priority order for online presentation
     * of the element. 
     */
    private long _sortorder;

    /**
     * keeps track of state for field: _sortorder
     */
    private boolean _has_sortorder;

    /**
     * How to record: Elements with data values are accompanied by
     * the attributes encodinganalog and label to indicate the
     * format of the data source from which the data were migrated.
     * The attribute encodinganalog refers to the internal field
     * label of the source database. The source format is indicated
     * in the attribute relatedencoding of the lidoWrap 
     */
    private java.lang.String _encodinganalog;

    /**
     * How to record: Elements with data values are accompanied by
     * the attributes encodinganalog and label, to indicate the
     * format of the data source from which the data were migrated.
     * The attribute label refers to the external label of a data
     * field at the visible user interface. The source format is
     * indicated in the attribute 
     */
    private java.lang.String _label;


      //----------------/
     //- Constructors -/
    //----------------/

    public WorkID() {
        super();
        setContent("");
    }

    public WorkID(final java.lang.String defaultValue) {
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
     * Returns the value of field 'encodinganalog'. The field
     * 'encodinganalog' has the following description: How to
     * record: Elements with data values are accompanied by the
     * attributes encodinganalog and label to indicate the format
     * of the data source from which the data were migrated. The
     * attribute encodinganalog refers to the internal field label
     * of the source database. The source format is indicated in
     * the attribute relatedencoding of the lidoWrap 
     * 
     * @return the value of field 'Encodinganalog'.
     */
    public java.lang.String getEncodinganalog(
    ) {
        return this._encodinganalog;
    }

    /**
     * Returns the value of field 'label'. The field 'label' has
     * the following description: How to record: Elements with data
     * values are accompanied by the attributes encodinganalog and
     * label, to indicate the format of the data source from which
     * the data were migrated. The attribute label refers to the
     * external label of a data field at the visible user
     * interface. The source format is indicated in the attribute 
     * 
     * @return the value of field 'Label'.
     */
    public java.lang.String getLabel(
    ) {
        return this._label;
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
     * Returns the value of field 'type'. The field 'type' has the
     * following description: Definition: Qualifies the type of
     * information given in the holding element. 
     * 
     * @return the value of field 'Type'.
     */
    public java.lang.String getType(
    ) {
        return this._type;
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
     * Sets the value of field 'encodinganalog'. The field
     * 'encodinganalog' has the following description: How to
     * record: Elements with data values are accompanied by the
     * attributes encodinganalog and label to indicate the format
     * of the data source from which the data were migrated. The
     * attribute encodinganalog refers to the internal field label
     * of the source database. The source format is indicated in
     * the attribute relatedencoding of the lidoWrap 
     * 
     * @param encodinganalog the value of field 'encodinganalog'.
     */
    public void setEncodinganalog(
            final java.lang.String encodinganalog) {
        this._encodinganalog = encodinganalog;
    }

    /**
     * Sets the value of field 'label'. The field 'label' has the
     * following description: How to record: Elements with data
     * values are accompanied by the attributes encodinganalog and
     * label, to indicate the format of the data source from which
     * the data were migrated. The attribute label refers to the
     * external label of a data field at the visible user
     * interface. The source format is indicated in the attribute 
     * 
     * @param label the value of field 'label'.
     */
    public void setLabel(
            final java.lang.String label) {
        this._label = label;
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
     * Sets the value of field 'type'. The field 'type' has the
     * following description: Definition: Qualifies the type of
     * information given in the holding element. 
     * 
     * @param type the value of field 'type'.
     */
    public void setType(
            final java.lang.String type) {
        this._type = type;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled eu.dca.model.WorkID
     */
    public static eu.dca.model.WorkID unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (eu.dca.model.WorkID) org.exolab.castor.xml.Unmarshaller.unmarshal(eu.dca.model.WorkID.class, reader);
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
