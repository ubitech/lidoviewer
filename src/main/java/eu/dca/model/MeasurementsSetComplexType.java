/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: The dimensions or other measurements for one aspect
 * of the item. 
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class MeasurementsSetComplexType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: Indicates what kind of measurement is taken. 
     */
    private java.util.Vector<eu.dca.model.MeasurementType> _measurementTypeList;

    /**
     * Definition: The unit of the measurement.
     */
    private java.util.Vector<eu.dca.model.MeasurementUnit> _measurementUnitList;

    /**
     * Definition: The value of the measurement.
     */
    private eu.dca.model.MeasurementValue _measurementValue;


      //----------------/
     //- Constructors -/
    //----------------/

    public MeasurementsSetComplexType() {
        super();
        this._measurementTypeList = new java.util.Vector<eu.dca.model.MeasurementType>();
        this._measurementUnitList = new java.util.Vector<eu.dca.model.MeasurementUnit>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vMeasurementType
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addMeasurementType(
            final eu.dca.model.MeasurementType vMeasurementType)
    throws java.lang.IndexOutOfBoundsException {
        this._measurementTypeList.addElement(vMeasurementType);
    }

    /**
     * 
     * 
     * @param index
     * @param vMeasurementType
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addMeasurementType(
            final int index,
            final eu.dca.model.MeasurementType vMeasurementType)
    throws java.lang.IndexOutOfBoundsException {
        this._measurementTypeList.add(index, vMeasurementType);
    }

    /**
     * 
     * 
     * @param vMeasurementUnit
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addMeasurementUnit(
            final eu.dca.model.MeasurementUnit vMeasurementUnit)
    throws java.lang.IndexOutOfBoundsException {
        this._measurementUnitList.addElement(vMeasurementUnit);
    }

    /**
     * 
     * 
     * @param index
     * @param vMeasurementUnit
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addMeasurementUnit(
            final int index,
            final eu.dca.model.MeasurementUnit vMeasurementUnit)
    throws java.lang.IndexOutOfBoundsException {
        this._measurementUnitList.add(index, vMeasurementUnit);
    }

    /**
     * Method enumerateMeasurementType.
     * 
     * @return an Enumeration over all eu.dca.model.MeasurementType
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.MeasurementType> enumerateMeasurementType(
    ) {
        return this._measurementTypeList.elements();
    }

    /**
     * Method enumerateMeasurementUnit.
     * 
     * @return an Enumeration over all eu.dca.model.MeasurementUnit
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.MeasurementUnit> enumerateMeasurementUnit(
    ) {
        return this._measurementUnitList.elements();
    }

    /**
     * Method getMeasurementType.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.MeasurementType at the
     * given index
     */
    public eu.dca.model.MeasurementType getMeasurementType(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._measurementTypeList.size()) {
            throw new IndexOutOfBoundsException("getMeasurementType: Index value '" + index + "' not in range [0.." + (this._measurementTypeList.size() - 1) + "]");
        }

        return (eu.dca.model.MeasurementType) _measurementTypeList.get(index);
    }

    /**
     * Method getMeasurementType.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.MeasurementType[] getMeasurementType(
    ) {
        eu.dca.model.MeasurementType[] array = new eu.dca.model.MeasurementType[0];
        return (eu.dca.model.MeasurementType[]) this._measurementTypeList.toArray(array);
    }

    /**
     * Method getMeasurementTypeCount.
     * 
     * @return the size of this collection
     */
    public int getMeasurementTypeCount(
    ) {
        return this._measurementTypeList.size();
    }

    /**
     * Method getMeasurementUnit.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.MeasurementUnit at the
     * given index
     */
    public eu.dca.model.MeasurementUnit getMeasurementUnit(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._measurementUnitList.size()) {
            throw new IndexOutOfBoundsException("getMeasurementUnit: Index value '" + index + "' not in range [0.." + (this._measurementUnitList.size() - 1) + "]");
        }

        return (eu.dca.model.MeasurementUnit) _measurementUnitList.get(index);
    }

    /**
     * Method getMeasurementUnit.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.MeasurementUnit[] getMeasurementUnit(
    ) {
        eu.dca.model.MeasurementUnit[] array = new eu.dca.model.MeasurementUnit[0];
        return (eu.dca.model.MeasurementUnit[]) this._measurementUnitList.toArray(array);
    }

    /**
     * Method getMeasurementUnitCount.
     * 
     * @return the size of this collection
     */
    public int getMeasurementUnitCount(
    ) {
        return this._measurementUnitList.size();
    }

    /**
     * Returns the value of field 'measurementValue'. The field
     * 'measurementValue' has the following description:
     * Definition: The value of the measurement.
     * 
     * @return the value of field 'MeasurementValue'.
     */
    public eu.dca.model.MeasurementValue getMeasurementValue(
    ) {
        return this._measurementValue;
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
    public void removeAllMeasurementType(
    ) {
        this._measurementTypeList.clear();
    }

    /**
     */
    public void removeAllMeasurementUnit(
    ) {
        this._measurementUnitList.clear();
    }

    /**
     * Method removeMeasurementType.
     * 
     * @param vMeasurementType
     * @return true if the object was removed from the collection.
     */
    public boolean removeMeasurementType(
            final eu.dca.model.MeasurementType vMeasurementType) {
        boolean removed = _measurementTypeList.remove(vMeasurementType);
        return removed;
    }

    /**
     * Method removeMeasurementTypeAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.MeasurementType removeMeasurementTypeAt(
            final int index) {
        java.lang.Object obj = this._measurementTypeList.remove(index);
        return (eu.dca.model.MeasurementType) obj;
    }

    /**
     * Method removeMeasurementUnit.
     * 
     * @param vMeasurementUnit
     * @return true if the object was removed from the collection.
     */
    public boolean removeMeasurementUnit(
            final eu.dca.model.MeasurementUnit vMeasurementUnit) {
        boolean removed = _measurementUnitList.remove(vMeasurementUnit);
        return removed;
    }

    /**
     * Method removeMeasurementUnitAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.MeasurementUnit removeMeasurementUnitAt(
            final int index) {
        java.lang.Object obj = this._measurementUnitList.remove(index);
        return (eu.dca.model.MeasurementUnit) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vMeasurementType
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setMeasurementType(
            final int index,
            final eu.dca.model.MeasurementType vMeasurementType)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._measurementTypeList.size()) {
            throw new IndexOutOfBoundsException("setMeasurementType: Index value '" + index + "' not in range [0.." + (this._measurementTypeList.size() - 1) + "]");
        }

        this._measurementTypeList.set(index, vMeasurementType);
    }

    /**
     * 
     * 
     * @param vMeasurementTypeArray
     */
    public void setMeasurementType(
            final eu.dca.model.MeasurementType[] vMeasurementTypeArray) {
        //-- copy array
        _measurementTypeList.clear();

        for (int i = 0; i < vMeasurementTypeArray.length; i++) {
                this._measurementTypeList.add(vMeasurementTypeArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vMeasurementUnit
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setMeasurementUnit(
            final int index,
            final eu.dca.model.MeasurementUnit vMeasurementUnit)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._measurementUnitList.size()) {
            throw new IndexOutOfBoundsException("setMeasurementUnit: Index value '" + index + "' not in range [0.." + (this._measurementUnitList.size() - 1) + "]");
        }

        this._measurementUnitList.set(index, vMeasurementUnit);
    }

    /**
     * 
     * 
     * @param vMeasurementUnitArray
     */
    public void setMeasurementUnit(
            final eu.dca.model.MeasurementUnit[] vMeasurementUnitArray) {
        //-- copy array
        _measurementUnitList.clear();

        for (int i = 0; i < vMeasurementUnitArray.length; i++) {
                this._measurementUnitList.add(vMeasurementUnitArray[i]);
        }
    }

    /**
     * Sets the value of field 'measurementValue'. The field
     * 'measurementValue' has the following description:
     * Definition: The value of the measurement.
     * 
     * @param measurementValue the value of field 'measurementValue'
     */
    public void setMeasurementValue(
            final eu.dca.model.MeasurementValue measurementValue) {
        this._measurementValue = measurementValue;
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
