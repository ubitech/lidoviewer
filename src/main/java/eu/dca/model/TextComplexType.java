/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: Simple text element with encodinganalog and label
 * attribute
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class TextComplexType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * internal content storage
     */
    private java.lang.String _content = "";

    /**
     * In due course, we should install the relevant ISO 2- and
     * 3-letter
     *  codes as the enumerated possible values . . .
     */
    private java.lang.String _lang;

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

    public TextComplexType() {
        super();
        setContent("");
    }

    public TextComplexType(final java.lang.String defaultValue) {
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
