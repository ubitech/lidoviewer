/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: A wrapper for the Measurements.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ObjectMeasurementsWrap implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: Wrapper for display and index elements for
     * object / work measurements.
     */
    private java.util.Vector<eu.dca.model.ObjectMeasurementsSet> _objectMeasurementsSetList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ObjectMeasurementsWrap() {
        super();
        this._objectMeasurementsSetList = new java.util.Vector<eu.dca.model.ObjectMeasurementsSet>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vObjectMeasurementsSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addObjectMeasurementsSet(
            final eu.dca.model.ObjectMeasurementsSet vObjectMeasurementsSet)
    throws java.lang.IndexOutOfBoundsException {
        this._objectMeasurementsSetList.addElement(vObjectMeasurementsSet);
    }

    /**
     * 
     * 
     * @param index
     * @param vObjectMeasurementsSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addObjectMeasurementsSet(
            final int index,
            final eu.dca.model.ObjectMeasurementsSet vObjectMeasurementsSet)
    throws java.lang.IndexOutOfBoundsException {
        this._objectMeasurementsSetList.add(index, vObjectMeasurementsSet);
    }

    /**
     * Method enumerateObjectMeasurementsSet.
     * 
     * @return an Enumeration over all
     * eu.dca.model.ObjectMeasurementsSet elements
     */
    public java.util.Enumeration<? extends eu.dca.model.ObjectMeasurementsSet> enumerateObjectMeasurementsSet(
    ) {
        return this._objectMeasurementsSetList.elements();
    }

    /**
     * Method getObjectMeasurementsSet.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.ObjectMeasurementsSet
     * at the given index
     */
    public eu.dca.model.ObjectMeasurementsSet getObjectMeasurementsSet(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._objectMeasurementsSetList.size()) {
            throw new IndexOutOfBoundsException("getObjectMeasurementsSet: Index value '" + index + "' not in range [0.." + (this._objectMeasurementsSetList.size() - 1) + "]");
        }

        return (eu.dca.model.ObjectMeasurementsSet) _objectMeasurementsSetList.get(index);
    }

    /**
     * Method getObjectMeasurementsSet.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.ObjectMeasurementsSet[] getObjectMeasurementsSet(
    ) {
        eu.dca.model.ObjectMeasurementsSet[] array = new eu.dca.model.ObjectMeasurementsSet[0];
        return (eu.dca.model.ObjectMeasurementsSet[]) this._objectMeasurementsSetList.toArray(array);
    }

    /**
     * Method getObjectMeasurementsSetCount.
     * 
     * @return the size of this collection
     */
    public int getObjectMeasurementsSetCount(
    ) {
        return this._objectMeasurementsSetList.size();
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
    public void removeAllObjectMeasurementsSet(
    ) {
        this._objectMeasurementsSetList.clear();
    }

    /**
     * Method removeObjectMeasurementsSet.
     * 
     * @param vObjectMeasurementsSet
     * @return true if the object was removed from the collection.
     */
    public boolean removeObjectMeasurementsSet(
            final eu.dca.model.ObjectMeasurementsSet vObjectMeasurementsSet) {
        boolean removed = _objectMeasurementsSetList.remove(vObjectMeasurementsSet);
        return removed;
    }

    /**
     * Method removeObjectMeasurementsSetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.ObjectMeasurementsSet removeObjectMeasurementsSetAt(
            final int index) {
        java.lang.Object obj = this._objectMeasurementsSetList.remove(index);
        return (eu.dca.model.ObjectMeasurementsSet) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vObjectMeasurementsSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setObjectMeasurementsSet(
            final int index,
            final eu.dca.model.ObjectMeasurementsSet vObjectMeasurementsSet)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._objectMeasurementsSetList.size()) {
            throw new IndexOutOfBoundsException("setObjectMeasurementsSet: Index value '" + index + "' not in range [0.." + (this._objectMeasurementsSetList.size() - 1) + "]");
        }

        this._objectMeasurementsSetList.set(index, vObjectMeasurementsSet);
    }

    /**
     * 
     * 
     * @param vObjectMeasurementsSetArray
     */
    public void setObjectMeasurementsSet(
            final eu.dca.model.ObjectMeasurementsSet[] vObjectMeasurementsSetArray) {
        //-- copy array
        _objectMeasurementsSetList.clear();

        for (int i = 0; i < vObjectMeasurementsSetArray.length; i++) {
                this._objectMeasurementsSetList.add(vObjectMeasurementsSetArray[i]);
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
     * @return the unmarshaled eu.dca.model.ObjectMeasurementsWrap
     */
    public static eu.dca.model.ObjectMeasurementsWrap unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (eu.dca.model.ObjectMeasurementsWrap) org.exolab.castor.xml.Unmarshaller.unmarshal(eu.dca.model.ObjectMeasurementsWrap.class, reader);
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
