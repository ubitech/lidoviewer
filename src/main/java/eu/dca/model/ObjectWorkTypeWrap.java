/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: A wrapper for Object/Work Types.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ObjectWorkTypeWrap implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: The specific kind of object / work being
     * described. 
     */
    private java.util.Vector<eu.dca.model.ObjectWorkType> _objectWorkTypeList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ObjectWorkTypeWrap() {
        super();
        this._objectWorkTypeList = new java.util.Vector<eu.dca.model.ObjectWorkType>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vObjectWorkType
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addObjectWorkType(
            final eu.dca.model.ObjectWorkType vObjectWorkType)
    throws java.lang.IndexOutOfBoundsException {
        this._objectWorkTypeList.addElement(vObjectWorkType);
    }

    /**
     * 
     * 
     * @param index
     * @param vObjectWorkType
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addObjectWorkType(
            final int index,
            final eu.dca.model.ObjectWorkType vObjectWorkType)
    throws java.lang.IndexOutOfBoundsException {
        this._objectWorkTypeList.add(index, vObjectWorkType);
    }

    /**
     * Method enumerateObjectWorkType.
     * 
     * @return an Enumeration over all eu.dca.model.ObjectWorkType
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.ObjectWorkType> enumerateObjectWorkType(
    ) {
        return this._objectWorkTypeList.elements();
    }

    /**
     * Method getObjectWorkType.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.ObjectWorkType at the
     * given index
     */
    public eu.dca.model.ObjectWorkType getObjectWorkType(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._objectWorkTypeList.size()) {
            throw new IndexOutOfBoundsException("getObjectWorkType: Index value '" + index + "' not in range [0.." + (this._objectWorkTypeList.size() - 1) + "]");
        }

        return (eu.dca.model.ObjectWorkType) _objectWorkTypeList.get(index);
    }

    /**
     * Method getObjectWorkType.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.ObjectWorkType[] getObjectWorkType(
    ) {
        eu.dca.model.ObjectWorkType[] array = new eu.dca.model.ObjectWorkType[0];
        return (eu.dca.model.ObjectWorkType[]) this._objectWorkTypeList.toArray(array);
    }

    /**
     * Method getObjectWorkTypeCount.
     * 
     * @return the size of this collection
     */
    public int getObjectWorkTypeCount(
    ) {
        return this._objectWorkTypeList.size();
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
    public void removeAllObjectWorkType(
    ) {
        this._objectWorkTypeList.clear();
    }

    /**
     * Method removeObjectWorkType.
     * 
     * @param vObjectWorkType
     * @return true if the object was removed from the collection.
     */
    public boolean removeObjectWorkType(
            final eu.dca.model.ObjectWorkType vObjectWorkType) {
        boolean removed = _objectWorkTypeList.remove(vObjectWorkType);
        return removed;
    }

    /**
     * Method removeObjectWorkTypeAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.ObjectWorkType removeObjectWorkTypeAt(
            final int index) {
        java.lang.Object obj = this._objectWorkTypeList.remove(index);
        return (eu.dca.model.ObjectWorkType) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vObjectWorkType
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setObjectWorkType(
            final int index,
            final eu.dca.model.ObjectWorkType vObjectWorkType)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._objectWorkTypeList.size()) {
            throw new IndexOutOfBoundsException("setObjectWorkType: Index value '" + index + "' not in range [0.." + (this._objectWorkTypeList.size() - 1) + "]");
        }

        this._objectWorkTypeList.set(index, vObjectWorkType);
    }

    /**
     * 
     * 
     * @param vObjectWorkTypeArray
     */
    public void setObjectWorkType(
            final eu.dca.model.ObjectWorkType[] vObjectWorkTypeArray) {
        //-- copy array
        _objectWorkTypeList.clear();

        for (int i = 0; i < vObjectWorkTypeArray.length; i++) {
                this._objectWorkTypeList.add(vObjectWorkTypeArray[i]);
        }
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled eu.dca.model.ObjectWorkTypeWrap
     */
    public static eu.dca.model.ObjectWorkTypeWrap unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (eu.dca.model.ObjectWorkTypeWrap) org.exolab.castor.xml.Unmarshaller.unmarshal(eu.dca.model.ObjectWorkTypeWrap.class, reader);
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
