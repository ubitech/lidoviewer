/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: Wrapper for display and reference elements for an
 * other object.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class ObjectSetComplexType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: A free-text description of the object,
     * corresponding to the following object element
     */
    private java.util.Vector<eu.dca.model.DisplayObject> _displayObjectList;

    /**
     * Definition: Contains identifying information and links to
     * another object.
     */
    private eu.dca.model.Object _object;


      //----------------/
     //- Constructors -/
    //----------------/

    public ObjectSetComplexType() {
        super();
        this._displayObjectList = new java.util.Vector<eu.dca.model.DisplayObject>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vDisplayObject
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDisplayObject(
            final eu.dca.model.DisplayObject vDisplayObject)
    throws java.lang.IndexOutOfBoundsException {
        this._displayObjectList.addElement(vDisplayObject);
    }

    /**
     * 
     * 
     * @param index
     * @param vDisplayObject
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDisplayObject(
            final int index,
            final eu.dca.model.DisplayObject vDisplayObject)
    throws java.lang.IndexOutOfBoundsException {
        this._displayObjectList.add(index, vDisplayObject);
    }

    /**
     * Method enumerateDisplayObject.
     * 
     * @return an Enumeration over all eu.dca.model.DisplayObject
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.DisplayObject> enumerateDisplayObject(
    ) {
        return this._displayObjectList.elements();
    }

    /**
     * Method getDisplayObject.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.DisplayObject at the
     * given index
     */
    public eu.dca.model.DisplayObject getDisplayObject(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._displayObjectList.size()) {
            throw new IndexOutOfBoundsException("getDisplayObject: Index value '" + index + "' not in range [0.." + (this._displayObjectList.size() - 1) + "]");
        }

        return (eu.dca.model.DisplayObject) _displayObjectList.get(index);
    }

    /**
     * Method getDisplayObject.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.DisplayObject[] getDisplayObject(
    ) {
        eu.dca.model.DisplayObject[] array = new eu.dca.model.DisplayObject[0];
        return (eu.dca.model.DisplayObject[]) this._displayObjectList.toArray(array);
    }

    /**
     * Method getDisplayObjectCount.
     * 
     * @return the size of this collection
     */
    public int getDisplayObjectCount(
    ) {
        return this._displayObjectList.size();
    }

    /**
     * Returns the value of field 'object'. The field 'object' has
     * the following description: Definition: Contains identifying
     * information and links to another object.
     * 
     * @return the value of field 'Object'.
     */
    public eu.dca.model.Object getObject(
    ) {
        return this._object;
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
     */
    public void removeAllDisplayObject(
    ) {
        this._displayObjectList.clear();
    }

    /**
     * Method removeDisplayObject.
     * 
     * @param vDisplayObject
     * @return true if the object was removed from the collection.
     */
    public boolean removeDisplayObject(
            final eu.dca.model.DisplayObject vDisplayObject) {
        boolean removed = _displayObjectList.remove(vDisplayObject);
        return removed;
    }

    /**
     * Method removeDisplayObjectAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.DisplayObject removeDisplayObjectAt(
            final int index) {
        java.lang.Object obj = this._displayObjectList.remove(index);
        return (eu.dca.model.DisplayObject) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vDisplayObject
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setDisplayObject(
            final int index,
            final eu.dca.model.DisplayObject vDisplayObject)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._displayObjectList.size()) {
            throw new IndexOutOfBoundsException("setDisplayObject: Index value '" + index + "' not in range [0.." + (this._displayObjectList.size() - 1) + "]");
        }

        this._displayObjectList.set(index, vDisplayObject);
    }

    /**
     * 
     * 
     * @param vDisplayObjectArray
     */
    public void setDisplayObject(
            final eu.dca.model.DisplayObject[] vDisplayObjectArray) {
        //-- copy array
        _displayObjectList.clear();

        for (int i = 0; i < vDisplayObjectArray.length; i++) {
                this._displayObjectList.add(vDisplayObjectArray[i]);
        }
    }

    /**
     * Sets the value of field 'object'. The field 'object' has the
     * following description: Definition: Contains identifying
     * information and links to another object.
     * 
     * @param object the value of field 'object'.
     */
    public void setObject(
            final eu.dca.model.Object object) {
        this._object = object;
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
