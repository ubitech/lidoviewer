/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: A wrapper for Description/Descriptive Note
 * information.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ObjectDescriptionWrap implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: Wrapper for a description of the object,
     * including description identifer, descriptive note and sources
     */
    private java.util.Vector<eu.dca.model.ObjectDescriptionSet> _objectDescriptionSetList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ObjectDescriptionWrap() {
        super();
        this._objectDescriptionSetList = new java.util.Vector<eu.dca.model.ObjectDescriptionSet>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vObjectDescriptionSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addObjectDescriptionSet(
            final eu.dca.model.ObjectDescriptionSet vObjectDescriptionSet)
    throws java.lang.IndexOutOfBoundsException {
        this._objectDescriptionSetList.addElement(vObjectDescriptionSet);
    }

    /**
     * 
     * 
     * @param index
     * @param vObjectDescriptionSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addObjectDescriptionSet(
            final int index,
            final eu.dca.model.ObjectDescriptionSet vObjectDescriptionSet)
    throws java.lang.IndexOutOfBoundsException {
        this._objectDescriptionSetList.add(index, vObjectDescriptionSet);
    }

    /**
     * Method enumerateObjectDescriptionSet.
     * 
     * @return an Enumeration over all
     * eu.dca.model.ObjectDescriptionSet elements
     */
    public java.util.Enumeration<? extends eu.dca.model.ObjectDescriptionSet> enumerateObjectDescriptionSet(
    ) {
        return this._objectDescriptionSetList.elements();
    }

    /**
     * Method getObjectDescriptionSet.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.ObjectDescriptionSet
     * at the given index
     */
    public eu.dca.model.ObjectDescriptionSet getObjectDescriptionSet(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._objectDescriptionSetList.size()) {
            throw new IndexOutOfBoundsException("getObjectDescriptionSet: Index value '" + index + "' not in range [0.." + (this._objectDescriptionSetList.size() - 1) + "]");
        }

        return (eu.dca.model.ObjectDescriptionSet) _objectDescriptionSetList.get(index);
    }

    /**
     * Method getObjectDescriptionSet.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.ObjectDescriptionSet[] getObjectDescriptionSet(
    ) {
        eu.dca.model.ObjectDescriptionSet[] array = new eu.dca.model.ObjectDescriptionSet[0];
        return (eu.dca.model.ObjectDescriptionSet[]) this._objectDescriptionSetList.toArray(array);
    }

    /**
     * Method getObjectDescriptionSetCount.
     * 
     * @return the size of this collection
     */
    public int getObjectDescriptionSetCount(
    ) {
        return this._objectDescriptionSetList.size();
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
    public void removeAllObjectDescriptionSet(
    ) {
        this._objectDescriptionSetList.clear();
    }

    /**
     * Method removeObjectDescriptionSet.
     * 
     * @param vObjectDescriptionSet
     * @return true if the object was removed from the collection.
     */
    public boolean removeObjectDescriptionSet(
            final eu.dca.model.ObjectDescriptionSet vObjectDescriptionSet) {
        boolean removed = _objectDescriptionSetList.remove(vObjectDescriptionSet);
        return removed;
    }

    /**
     * Method removeObjectDescriptionSetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.ObjectDescriptionSet removeObjectDescriptionSetAt(
            final int index) {
        java.lang.Object obj = this._objectDescriptionSetList.remove(index);
        return (eu.dca.model.ObjectDescriptionSet) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vObjectDescriptionSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setObjectDescriptionSet(
            final int index,
            final eu.dca.model.ObjectDescriptionSet vObjectDescriptionSet)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._objectDescriptionSetList.size()) {
            throw new IndexOutOfBoundsException("setObjectDescriptionSet: Index value '" + index + "' not in range [0.." + (this._objectDescriptionSetList.size() - 1) + "]");
        }

        this._objectDescriptionSetList.set(index, vObjectDescriptionSet);
    }

    /**
     * 
     * 
     * @param vObjectDescriptionSetArray
     */
    public void setObjectDescriptionSet(
            final eu.dca.model.ObjectDescriptionSet[] vObjectDescriptionSetArray) {
        //-- copy array
        _objectDescriptionSetList.clear();

        for (int i = 0; i < vObjectDescriptionSetArray.length; i++) {
                this._objectDescriptionSetList.add(vObjectDescriptionSetArray[i]);
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
     * @return the unmarshaled eu.dca.model.ObjectDescriptionWrap
     */
    public static eu.dca.model.ObjectDescriptionWrap unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (eu.dca.model.ObjectDescriptionWrap) org.exolab.castor.xml.Unmarshaller.unmarshal(eu.dca.model.ObjectDescriptionWrap.class, reader);
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
