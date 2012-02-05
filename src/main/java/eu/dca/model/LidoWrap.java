/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: Holds one or multiple object records.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class LidoWrap implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: Indicates the format of the data source from
     * which the data were migrated. For each sub-element with data
     * values then the related source data fields can be referenced
     * through the attributes encodinganalog and label.
     */
    private java.lang.String _relatedencoding;

    /**
     * Field _lidoElementList.
     */
    private java.util.Vector<eu.dca.model.LidoElement> _lidoElementList;


      //----------------/
     //- Constructors -/
    //----------------/

    public LidoWrap() {
        super();
        this._lidoElementList = new java.util.Vector<eu.dca.model.LidoElement>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vLidoElement
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addLidoElement(
            final eu.dca.model.LidoElement vLidoElement)
    throws java.lang.IndexOutOfBoundsException {
        this._lidoElementList.addElement(vLidoElement);
    }

    /**
     * 
     * 
     * @param index
     * @param vLidoElement
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addLidoElement(
            final int index,
            final eu.dca.model.LidoElement vLidoElement)
    throws java.lang.IndexOutOfBoundsException {
        this._lidoElementList.add(index, vLidoElement);
    }

    /**
     * Method enumerateLidoElement.
     * 
     * @return an Enumeration over all eu.dca.model.LidoElement
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.LidoElement> enumerateLidoElement(
    ) {
        return this._lidoElementList.elements();
    }

    /**
     * Method getLidoElement.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.LidoElement at the
     * given index
     */
    public eu.dca.model.LidoElement getLidoElement(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._lidoElementList.size()) {
            throw new IndexOutOfBoundsException("getLidoElement: Index value '" + index + "' not in range [0.." + (this._lidoElementList.size() - 1) + "]");
        }

        return (eu.dca.model.LidoElement) _lidoElementList.get(index);
    }

    /**
     * Method getLidoElement.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.LidoElement[] getLidoElement(
    ) {
        eu.dca.model.LidoElement[] array = new eu.dca.model.LidoElement[0];
        return (eu.dca.model.LidoElement[]) this._lidoElementList.toArray(array);
    }

    /**
     * Method getLidoElementCount.
     * 
     * @return the size of this collection
     */
    public int getLidoElementCount(
    ) {
        return this._lidoElementList.size();
    }

    /**
     * Returns the value of field 'relatedencoding'. The field
     * 'relatedencoding' has the following description: Definition:
     * Indicates the format of the data source from which the data
     * were migrated. For each sub-element with data values then
     * the related source data fields can be referenced through the
     * attributes encodinganalog and label.
     * 
     * @return the value of field 'Relatedencoding'.
     */
    public java.lang.String getRelatedencoding(
    ) {
        return this._relatedencoding;
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
     */
    public void removeAllLidoElement(
    ) {
        this._lidoElementList.clear();
    }

    /**
     * Method removeLidoElement.
     * 
     * @param vLidoElement
     * @return true if the object was removed from the collection.
     */
    public boolean removeLidoElement(
            final eu.dca.model.LidoElement vLidoElement) {
        boolean removed = _lidoElementList.remove(vLidoElement);
        return removed;
    }

    /**
     * Method removeLidoElementAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.LidoElement removeLidoElementAt(
            final int index) {
        java.lang.Object obj = this._lidoElementList.remove(index);
        return (eu.dca.model.LidoElement) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vLidoElement
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setLidoElement(
            final int index,
            final eu.dca.model.LidoElement vLidoElement)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._lidoElementList.size()) {
            throw new IndexOutOfBoundsException("setLidoElement: Index value '" + index + "' not in range [0.." + (this._lidoElementList.size() - 1) + "]");
        }

        this._lidoElementList.set(index, vLidoElement);
    }

    /**
     * 
     * 
     * @param vLidoElementArray
     */
    public void setLidoElement(
            final eu.dca.model.LidoElement[] vLidoElementArray) {
        //-- copy array
        _lidoElementList.clear();

        for (int i = 0; i < vLidoElementArray.length; i++) {
                this._lidoElementList.add(vLidoElementArray[i]);
        }
    }

    /**
     * Sets the value of field 'relatedencoding'. The field
     * 'relatedencoding' has the following description: Definition:
     * Indicates the format of the data source from which the data
     * were migrated. For each sub-element with data values then
     * the related source data fields can be referenced through the
     * attributes encodinganalog and label.
     * 
     * @param relatedencoding the value of field 'relatedencoding'.
     */
    public void setRelatedencoding(
            final java.lang.String relatedencoding) {
        this._relatedencoding = relatedencoding;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled eu.dca.model.LidoWrap
     */
    public static eu.dca.model.LidoWrap unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (eu.dca.model.LidoWrap) org.exolab.castor.xml.Unmarshaller.unmarshal(eu.dca.model.LidoWrap.class, reader);
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
