/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: Wrapper for display and index elements for object
 * measurements. If multiple parts of the object / work are
 * measured, repeat the elementHow to record: Holds information
 * about the dimensions, size, or scale of the object / work. It
 * may also include the number of parts in a complex object / work,
 * series, or collection.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class ObjectMeasurementsSetComplexType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: Display element for one object measurement,
     * corresponding to the following objectMeasurement element.
     */
    private java.util.Vector<eu.dca.model.DisplayObjectMeasurements> _displayObjectMeasurementsList;

    /**
     * Definition: Structured measurement information about the
     * dimensions, size, or scale of the object / work. 
     */
    private eu.dca.model.ObjectMeasurements _objectMeasurements;


      //----------------/
     //- Constructors -/
    //----------------/

    public ObjectMeasurementsSetComplexType() {
        super();
        this._displayObjectMeasurementsList = new java.util.Vector<eu.dca.model.DisplayObjectMeasurements>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vDisplayObjectMeasurements
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDisplayObjectMeasurements(
            final eu.dca.model.DisplayObjectMeasurements vDisplayObjectMeasurements)
    throws java.lang.IndexOutOfBoundsException {
        this._displayObjectMeasurementsList.addElement(vDisplayObjectMeasurements);
    }

    /**
     * 
     * 
     * @param index
     * @param vDisplayObjectMeasurements
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDisplayObjectMeasurements(
            final int index,
            final eu.dca.model.DisplayObjectMeasurements vDisplayObjectMeasurements)
    throws java.lang.IndexOutOfBoundsException {
        this._displayObjectMeasurementsList.add(index, vDisplayObjectMeasurements);
    }

    /**
     * Method enumerateDisplayObjectMeasurements.
     * 
     * @return an Enumeration over all
     * eu.dca.model.DisplayObjectMeasurements elements
     */
    public java.util.Enumeration<? extends eu.dca.model.DisplayObjectMeasurements> enumerateDisplayObjectMeasurements(
    ) {
        return this._displayObjectMeasurementsList.elements();
    }

    /**
     * Method getDisplayObjectMeasurements.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * eu.dca.model.DisplayObjectMeasurements at the given index
     */
    public eu.dca.model.DisplayObjectMeasurements getDisplayObjectMeasurements(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._displayObjectMeasurementsList.size()) {
            throw new IndexOutOfBoundsException("getDisplayObjectMeasurements: Index value '" + index + "' not in range [0.." + (this._displayObjectMeasurementsList.size() - 1) + "]");
        }

        return (eu.dca.model.DisplayObjectMeasurements) _displayObjectMeasurementsList.get(index);
    }

    /**
     * Method getDisplayObjectMeasurements.Returns the contents of
     * the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.DisplayObjectMeasurements[] getDisplayObjectMeasurements(
    ) {
        eu.dca.model.DisplayObjectMeasurements[] array = new eu.dca.model.DisplayObjectMeasurements[0];
        return (eu.dca.model.DisplayObjectMeasurements[]) this._displayObjectMeasurementsList.toArray(array);
    }

    /**
     * Method getDisplayObjectMeasurementsCount.
     * 
     * @return the size of this collection
     */
    public int getDisplayObjectMeasurementsCount(
    ) {
        return this._displayObjectMeasurementsList.size();
    }

    /**
     * Returns the value of field 'objectMeasurements'. The field
     * 'objectMeasurements' has the following description:
     * Definition: Structured measurement information about the
     * dimensions, size, or scale of the object / work. 
     * 
     * @return the value of field 'ObjectMeasurements'.
     */
    public eu.dca.model.ObjectMeasurements getObjectMeasurements(
    ) {
        return this._objectMeasurements;
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
    public void removeAllDisplayObjectMeasurements(
    ) {
        this._displayObjectMeasurementsList.clear();
    }

    /**
     * Method removeDisplayObjectMeasurements.
     * 
     * @param vDisplayObjectMeasurements
     * @return true if the object was removed from the collection.
     */
    public boolean removeDisplayObjectMeasurements(
            final eu.dca.model.DisplayObjectMeasurements vDisplayObjectMeasurements) {
        boolean removed = _displayObjectMeasurementsList.remove(vDisplayObjectMeasurements);
        return removed;
    }

    /**
     * Method removeDisplayObjectMeasurementsAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.DisplayObjectMeasurements removeDisplayObjectMeasurementsAt(
            final int index) {
        java.lang.Object obj = this._displayObjectMeasurementsList.remove(index);
        return (eu.dca.model.DisplayObjectMeasurements) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vDisplayObjectMeasurements
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setDisplayObjectMeasurements(
            final int index,
            final eu.dca.model.DisplayObjectMeasurements vDisplayObjectMeasurements)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._displayObjectMeasurementsList.size()) {
            throw new IndexOutOfBoundsException("setDisplayObjectMeasurements: Index value '" + index + "' not in range [0.." + (this._displayObjectMeasurementsList.size() - 1) + "]");
        }

        this._displayObjectMeasurementsList.set(index, vDisplayObjectMeasurements);
    }

    /**
     * 
     * 
     * @param vDisplayObjectMeasurementsArray
     */
    public void setDisplayObjectMeasurements(
            final eu.dca.model.DisplayObjectMeasurements[] vDisplayObjectMeasurementsArray) {
        //-- copy array
        _displayObjectMeasurementsList.clear();

        for (int i = 0; i < vDisplayObjectMeasurementsArray.length; i++) {
                this._displayObjectMeasurementsList.add(vDisplayObjectMeasurementsArray[i]);
        }
    }

    /**
     * Sets the value of field 'objectMeasurements'. The field
     * 'objectMeasurements' has the following description:
     * Definition: Structured measurement information about the
     * dimensions, size, or scale of the object / work. 
     * 
     * @param objectMeasurements the value of field
     * 'objectMeasurements'.
     */
    public void setObjectMeasurements(
            final eu.dca.model.ObjectMeasurements objectMeasurements) {
        this._objectMeasurements = objectMeasurements;
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
