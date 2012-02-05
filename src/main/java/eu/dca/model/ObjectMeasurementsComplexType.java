/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: The dimensions, size, shape, scale, format, or
 * storage configuration of the object / work, including volume,
 * weight, area or running time.How to record: Measurements are
 * formatted to allow retrieval; preferably in metric units where
 * applicable.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class ObjectMeasurementsComplexType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: The dimensions or other measurements for one
     * aspect of an object / work (e.g., width).
     */
    private java.util.Vector<eu.dca.model.MeasurementsSet> _measurementsSetList;

    /**
     * Definition: An explanation of the part of the object / work
     * being measured included, when necessary, for clarity.
     */
    private java.util.Vector<eu.dca.model.ExtentMeasurements> _extentMeasurementsList;

    /**
     * Definition: A word or phrase that elaborates on the nature
     * of the measurements of the object / work when necessary,
     * e.g. when the measurements are approximate.
     */
    private java.util.Vector<eu.dca.model.QualifierMeasurements> _qualifierMeasurementsList;

    /**
     * Definition: The configuration of an object / work, including
     * technical formats. Used as necessary.
     */
    private java.util.Vector<eu.dca.model.FormatMeasurements> _formatMeasurementsList;

    /**
     * Definition: The shape of an object / work. Used for unusual
     * shapes (e.g., an oval painting).
     */
    private java.util.Vector<eu.dca.model.ShapeMeasurements> _shapeMeasurementsList;

    /**
     * Definition: An expression of the ratio between the size of
     * the representation of something and that thing (e.g., the
     * size of the drawn structure and the actual built work). 
     */
    private java.util.Vector<eu.dca.model.ScaleMeasurements> _scaleMeasurementsList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ObjectMeasurementsComplexType() {
        super();
        this._measurementsSetList = new java.util.Vector<eu.dca.model.MeasurementsSet>();
        this._extentMeasurementsList = new java.util.Vector<eu.dca.model.ExtentMeasurements>();
        this._qualifierMeasurementsList = new java.util.Vector<eu.dca.model.QualifierMeasurements>();
        this._formatMeasurementsList = new java.util.Vector<eu.dca.model.FormatMeasurements>();
        this._shapeMeasurementsList = new java.util.Vector<eu.dca.model.ShapeMeasurements>();
        this._scaleMeasurementsList = new java.util.Vector<eu.dca.model.ScaleMeasurements>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vExtentMeasurements
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addExtentMeasurements(
            final eu.dca.model.ExtentMeasurements vExtentMeasurements)
    throws java.lang.IndexOutOfBoundsException {
        this._extentMeasurementsList.addElement(vExtentMeasurements);
    }

    /**
     * 
     * 
     * @param index
     * @param vExtentMeasurements
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addExtentMeasurements(
            final int index,
            final eu.dca.model.ExtentMeasurements vExtentMeasurements)
    throws java.lang.IndexOutOfBoundsException {
        this._extentMeasurementsList.add(index, vExtentMeasurements);
    }

    /**
     * 
     * 
     * @param vFormatMeasurements
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addFormatMeasurements(
            final eu.dca.model.FormatMeasurements vFormatMeasurements)
    throws java.lang.IndexOutOfBoundsException {
        this._formatMeasurementsList.addElement(vFormatMeasurements);
    }

    /**
     * 
     * 
     * @param index
     * @param vFormatMeasurements
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addFormatMeasurements(
            final int index,
            final eu.dca.model.FormatMeasurements vFormatMeasurements)
    throws java.lang.IndexOutOfBoundsException {
        this._formatMeasurementsList.add(index, vFormatMeasurements);
    }

    /**
     * 
     * 
     * @param vMeasurementsSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addMeasurementsSet(
            final eu.dca.model.MeasurementsSet vMeasurementsSet)
    throws java.lang.IndexOutOfBoundsException {
        this._measurementsSetList.addElement(vMeasurementsSet);
    }

    /**
     * 
     * 
     * @param index
     * @param vMeasurementsSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addMeasurementsSet(
            final int index,
            final eu.dca.model.MeasurementsSet vMeasurementsSet)
    throws java.lang.IndexOutOfBoundsException {
        this._measurementsSetList.add(index, vMeasurementsSet);
    }

    /**
     * 
     * 
     * @param vQualifierMeasurements
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addQualifierMeasurements(
            final eu.dca.model.QualifierMeasurements vQualifierMeasurements)
    throws java.lang.IndexOutOfBoundsException {
        this._qualifierMeasurementsList.addElement(vQualifierMeasurements);
    }

    /**
     * 
     * 
     * @param index
     * @param vQualifierMeasurements
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addQualifierMeasurements(
            final int index,
            final eu.dca.model.QualifierMeasurements vQualifierMeasurements)
    throws java.lang.IndexOutOfBoundsException {
        this._qualifierMeasurementsList.add(index, vQualifierMeasurements);
    }

    /**
     * 
     * 
     * @param vScaleMeasurements
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addScaleMeasurements(
            final eu.dca.model.ScaleMeasurements vScaleMeasurements)
    throws java.lang.IndexOutOfBoundsException {
        this._scaleMeasurementsList.addElement(vScaleMeasurements);
    }

    /**
     * 
     * 
     * @param index
     * @param vScaleMeasurements
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addScaleMeasurements(
            final int index,
            final eu.dca.model.ScaleMeasurements vScaleMeasurements)
    throws java.lang.IndexOutOfBoundsException {
        this._scaleMeasurementsList.add(index, vScaleMeasurements);
    }

    /**
     * 
     * 
     * @param vShapeMeasurements
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addShapeMeasurements(
            final eu.dca.model.ShapeMeasurements vShapeMeasurements)
    throws java.lang.IndexOutOfBoundsException {
        this._shapeMeasurementsList.addElement(vShapeMeasurements);
    }

    /**
     * 
     * 
     * @param index
     * @param vShapeMeasurements
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addShapeMeasurements(
            final int index,
            final eu.dca.model.ShapeMeasurements vShapeMeasurements)
    throws java.lang.IndexOutOfBoundsException {
        this._shapeMeasurementsList.add(index, vShapeMeasurements);
    }

    /**
     * Method enumerateExtentMeasurements.
     * 
     * @return an Enumeration over all
     * eu.dca.model.ExtentMeasurements elements
     */
    public java.util.Enumeration<? extends eu.dca.model.ExtentMeasurements> enumerateExtentMeasurements(
    ) {
        return this._extentMeasurementsList.elements();
    }

    /**
     * Method enumerateFormatMeasurements.
     * 
     * @return an Enumeration over all
     * eu.dca.model.FormatMeasurements elements
     */
    public java.util.Enumeration<? extends eu.dca.model.FormatMeasurements> enumerateFormatMeasurements(
    ) {
        return this._formatMeasurementsList.elements();
    }

    /**
     * Method enumerateMeasurementsSet.
     * 
     * @return an Enumeration over all eu.dca.model.MeasurementsSet
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.MeasurementsSet> enumerateMeasurementsSet(
    ) {
        return this._measurementsSetList.elements();
    }

    /**
     * Method enumerateQualifierMeasurements.
     * 
     * @return an Enumeration over all
     * eu.dca.model.QualifierMeasurements elements
     */
    public java.util.Enumeration<? extends eu.dca.model.QualifierMeasurements> enumerateQualifierMeasurements(
    ) {
        return this._qualifierMeasurementsList.elements();
    }

    /**
     * Method enumerateScaleMeasurements.
     * 
     * @return an Enumeration over all
     * eu.dca.model.ScaleMeasurements elements
     */
    public java.util.Enumeration<? extends eu.dca.model.ScaleMeasurements> enumerateScaleMeasurements(
    ) {
        return this._scaleMeasurementsList.elements();
    }

    /**
     * Method enumerateShapeMeasurements.
     * 
     * @return an Enumeration over all
     * eu.dca.model.ShapeMeasurements elements
     */
    public java.util.Enumeration<? extends eu.dca.model.ShapeMeasurements> enumerateShapeMeasurements(
    ) {
        return this._shapeMeasurementsList.elements();
    }

    /**
     * Method getExtentMeasurements.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.ExtentMeasurements at
     * the given index
     */
    public eu.dca.model.ExtentMeasurements getExtentMeasurements(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._extentMeasurementsList.size()) {
            throw new IndexOutOfBoundsException("getExtentMeasurements: Index value '" + index + "' not in range [0.." + (this._extentMeasurementsList.size() - 1) + "]");
        }

        return (eu.dca.model.ExtentMeasurements) _extentMeasurementsList.get(index);
    }

    /**
     * Method getExtentMeasurements.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.ExtentMeasurements[] getExtentMeasurements(
    ) {
        eu.dca.model.ExtentMeasurements[] array = new eu.dca.model.ExtentMeasurements[0];
        return (eu.dca.model.ExtentMeasurements[]) this._extentMeasurementsList.toArray(array);
    }

    /**
     * Method getExtentMeasurementsCount.
     * 
     * @return the size of this collection
     */
    public int getExtentMeasurementsCount(
    ) {
        return this._extentMeasurementsList.size();
    }

    /**
     * Method getFormatMeasurements.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.FormatMeasurements at
     * the given index
     */
    public eu.dca.model.FormatMeasurements getFormatMeasurements(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._formatMeasurementsList.size()) {
            throw new IndexOutOfBoundsException("getFormatMeasurements: Index value '" + index + "' not in range [0.." + (this._formatMeasurementsList.size() - 1) + "]");
        }

        return (eu.dca.model.FormatMeasurements) _formatMeasurementsList.get(index);
    }

    /**
     * Method getFormatMeasurements.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.FormatMeasurements[] getFormatMeasurements(
    ) {
        eu.dca.model.FormatMeasurements[] array = new eu.dca.model.FormatMeasurements[0];
        return (eu.dca.model.FormatMeasurements[]) this._formatMeasurementsList.toArray(array);
    }

    /**
     * Method getFormatMeasurementsCount.
     * 
     * @return the size of this collection
     */
    public int getFormatMeasurementsCount(
    ) {
        return this._formatMeasurementsList.size();
    }

    /**
     * Method getMeasurementsSet.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.MeasurementsSet at the
     * given index
     */
    public eu.dca.model.MeasurementsSet getMeasurementsSet(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._measurementsSetList.size()) {
            throw new IndexOutOfBoundsException("getMeasurementsSet: Index value '" + index + "' not in range [0.." + (this._measurementsSetList.size() - 1) + "]");
        }

        return (eu.dca.model.MeasurementsSet) _measurementsSetList.get(index);
    }

    /**
     * Method getMeasurementsSet.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.MeasurementsSet[] getMeasurementsSet(
    ) {
        eu.dca.model.MeasurementsSet[] array = new eu.dca.model.MeasurementsSet[0];
        return (eu.dca.model.MeasurementsSet[]) this._measurementsSetList.toArray(array);
    }

    /**
     * Method getMeasurementsSetCount.
     * 
     * @return the size of this collection
     */
    public int getMeasurementsSetCount(
    ) {
        return this._measurementsSetList.size();
    }

    /**
     * Method getQualifierMeasurements.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.QualifierMeasurements
     * at the given index
     */
    public eu.dca.model.QualifierMeasurements getQualifierMeasurements(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._qualifierMeasurementsList.size()) {
            throw new IndexOutOfBoundsException("getQualifierMeasurements: Index value '" + index + "' not in range [0.." + (this._qualifierMeasurementsList.size() - 1) + "]");
        }

        return (eu.dca.model.QualifierMeasurements) _qualifierMeasurementsList.get(index);
    }

    /**
     * Method getQualifierMeasurements.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.QualifierMeasurements[] getQualifierMeasurements(
    ) {
        eu.dca.model.QualifierMeasurements[] array = new eu.dca.model.QualifierMeasurements[0];
        return (eu.dca.model.QualifierMeasurements[]) this._qualifierMeasurementsList.toArray(array);
    }

    /**
     * Method getQualifierMeasurementsCount.
     * 
     * @return the size of this collection
     */
    public int getQualifierMeasurementsCount(
    ) {
        return this._qualifierMeasurementsList.size();
    }

    /**
     * Method getScaleMeasurements.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.ScaleMeasurements at
     * the given index
     */
    public eu.dca.model.ScaleMeasurements getScaleMeasurements(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._scaleMeasurementsList.size()) {
            throw new IndexOutOfBoundsException("getScaleMeasurements: Index value '" + index + "' not in range [0.." + (this._scaleMeasurementsList.size() - 1) + "]");
        }

        return (eu.dca.model.ScaleMeasurements) _scaleMeasurementsList.get(index);
    }

    /**
     * Method getScaleMeasurements.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.ScaleMeasurements[] getScaleMeasurements(
    ) {
        eu.dca.model.ScaleMeasurements[] array = new eu.dca.model.ScaleMeasurements[0];
        return (eu.dca.model.ScaleMeasurements[]) this._scaleMeasurementsList.toArray(array);
    }

    /**
     * Method getScaleMeasurementsCount.
     * 
     * @return the size of this collection
     */
    public int getScaleMeasurementsCount(
    ) {
        return this._scaleMeasurementsList.size();
    }

    /**
     * Method getShapeMeasurements.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.ShapeMeasurements at
     * the given index
     */
    public eu.dca.model.ShapeMeasurements getShapeMeasurements(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._shapeMeasurementsList.size()) {
            throw new IndexOutOfBoundsException("getShapeMeasurements: Index value '" + index + "' not in range [0.." + (this._shapeMeasurementsList.size() - 1) + "]");
        }

        return (eu.dca.model.ShapeMeasurements) _shapeMeasurementsList.get(index);
    }

    /**
     * Method getShapeMeasurements.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.ShapeMeasurements[] getShapeMeasurements(
    ) {
        eu.dca.model.ShapeMeasurements[] array = new eu.dca.model.ShapeMeasurements[0];
        return (eu.dca.model.ShapeMeasurements[]) this._shapeMeasurementsList.toArray(array);
    }

    /**
     * Method getShapeMeasurementsCount.
     * 
     * @return the size of this collection
     */
    public int getShapeMeasurementsCount(
    ) {
        return this._shapeMeasurementsList.size();
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
    public void removeAllExtentMeasurements(
    ) {
        this._extentMeasurementsList.clear();
    }

    /**
     */
    public void removeAllFormatMeasurements(
    ) {
        this._formatMeasurementsList.clear();
    }

    /**
     */
    public void removeAllMeasurementsSet(
    ) {
        this._measurementsSetList.clear();
    }

    /**
     */
    public void removeAllQualifierMeasurements(
    ) {
        this._qualifierMeasurementsList.clear();
    }

    /**
     */
    public void removeAllScaleMeasurements(
    ) {
        this._scaleMeasurementsList.clear();
    }

    /**
     */
    public void removeAllShapeMeasurements(
    ) {
        this._shapeMeasurementsList.clear();
    }

    /**
     * Method removeExtentMeasurements.
     * 
     * @param vExtentMeasurements
     * @return true if the object was removed from the collection.
     */
    public boolean removeExtentMeasurements(
            final eu.dca.model.ExtentMeasurements vExtentMeasurements) {
        boolean removed = _extentMeasurementsList.remove(vExtentMeasurements);
        return removed;
    }

    /**
     * Method removeExtentMeasurementsAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.ExtentMeasurements removeExtentMeasurementsAt(
            final int index) {
        java.lang.Object obj = this._extentMeasurementsList.remove(index);
        return (eu.dca.model.ExtentMeasurements) obj;
    }

    /**
     * Method removeFormatMeasurements.
     * 
     * @param vFormatMeasurements
     * @return true if the object was removed from the collection.
     */
    public boolean removeFormatMeasurements(
            final eu.dca.model.FormatMeasurements vFormatMeasurements) {
        boolean removed = _formatMeasurementsList.remove(vFormatMeasurements);
        return removed;
    }

    /**
     * Method removeFormatMeasurementsAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.FormatMeasurements removeFormatMeasurementsAt(
            final int index) {
        java.lang.Object obj = this._formatMeasurementsList.remove(index);
        return (eu.dca.model.FormatMeasurements) obj;
    }

    /**
     * Method removeMeasurementsSet.
     * 
     * @param vMeasurementsSet
     * @return true if the object was removed from the collection.
     */
    public boolean removeMeasurementsSet(
            final eu.dca.model.MeasurementsSet vMeasurementsSet) {
        boolean removed = _measurementsSetList.remove(vMeasurementsSet);
        return removed;
    }

    /**
     * Method removeMeasurementsSetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.MeasurementsSet removeMeasurementsSetAt(
            final int index) {
        java.lang.Object obj = this._measurementsSetList.remove(index);
        return (eu.dca.model.MeasurementsSet) obj;
    }

    /**
     * Method removeQualifierMeasurements.
     * 
     * @param vQualifierMeasurements
     * @return true if the object was removed from the collection.
     */
    public boolean removeQualifierMeasurements(
            final eu.dca.model.QualifierMeasurements vQualifierMeasurements) {
        boolean removed = _qualifierMeasurementsList.remove(vQualifierMeasurements);
        return removed;
    }

    /**
     * Method removeQualifierMeasurementsAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.QualifierMeasurements removeQualifierMeasurementsAt(
            final int index) {
        java.lang.Object obj = this._qualifierMeasurementsList.remove(index);
        return (eu.dca.model.QualifierMeasurements) obj;
    }

    /**
     * Method removeScaleMeasurements.
     * 
     * @param vScaleMeasurements
     * @return true if the object was removed from the collection.
     */
    public boolean removeScaleMeasurements(
            final eu.dca.model.ScaleMeasurements vScaleMeasurements) {
        boolean removed = _scaleMeasurementsList.remove(vScaleMeasurements);
        return removed;
    }

    /**
     * Method removeScaleMeasurementsAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.ScaleMeasurements removeScaleMeasurementsAt(
            final int index) {
        java.lang.Object obj = this._scaleMeasurementsList.remove(index);
        return (eu.dca.model.ScaleMeasurements) obj;
    }

    /**
     * Method removeShapeMeasurements.
     * 
     * @param vShapeMeasurements
     * @return true if the object was removed from the collection.
     */
    public boolean removeShapeMeasurements(
            final eu.dca.model.ShapeMeasurements vShapeMeasurements) {
        boolean removed = _shapeMeasurementsList.remove(vShapeMeasurements);
        return removed;
    }

    /**
     * Method removeShapeMeasurementsAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.ShapeMeasurements removeShapeMeasurementsAt(
            final int index) {
        java.lang.Object obj = this._shapeMeasurementsList.remove(index);
        return (eu.dca.model.ShapeMeasurements) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vExtentMeasurements
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setExtentMeasurements(
            final int index,
            final eu.dca.model.ExtentMeasurements vExtentMeasurements)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._extentMeasurementsList.size()) {
            throw new IndexOutOfBoundsException("setExtentMeasurements: Index value '" + index + "' not in range [0.." + (this._extentMeasurementsList.size() - 1) + "]");
        }

        this._extentMeasurementsList.set(index, vExtentMeasurements);
    }

    /**
     * 
     * 
     * @param vExtentMeasurementsArray
     */
    public void setExtentMeasurements(
            final eu.dca.model.ExtentMeasurements[] vExtentMeasurementsArray) {
        //-- copy array
        _extentMeasurementsList.clear();

        for (int i = 0; i < vExtentMeasurementsArray.length; i++) {
                this._extentMeasurementsList.add(vExtentMeasurementsArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vFormatMeasurements
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setFormatMeasurements(
            final int index,
            final eu.dca.model.FormatMeasurements vFormatMeasurements)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._formatMeasurementsList.size()) {
            throw new IndexOutOfBoundsException("setFormatMeasurements: Index value '" + index + "' not in range [0.." + (this._formatMeasurementsList.size() - 1) + "]");
        }

        this._formatMeasurementsList.set(index, vFormatMeasurements);
    }

    /**
     * 
     * 
     * @param vFormatMeasurementsArray
     */
    public void setFormatMeasurements(
            final eu.dca.model.FormatMeasurements[] vFormatMeasurementsArray) {
        //-- copy array
        _formatMeasurementsList.clear();

        for (int i = 0; i < vFormatMeasurementsArray.length; i++) {
                this._formatMeasurementsList.add(vFormatMeasurementsArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vMeasurementsSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setMeasurementsSet(
            final int index,
            final eu.dca.model.MeasurementsSet vMeasurementsSet)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._measurementsSetList.size()) {
            throw new IndexOutOfBoundsException("setMeasurementsSet: Index value '" + index + "' not in range [0.." + (this._measurementsSetList.size() - 1) + "]");
        }

        this._measurementsSetList.set(index, vMeasurementsSet);
    }

    /**
     * 
     * 
     * @param vMeasurementsSetArray
     */
    public void setMeasurementsSet(
            final eu.dca.model.MeasurementsSet[] vMeasurementsSetArray) {
        //-- copy array
        _measurementsSetList.clear();

        for (int i = 0; i < vMeasurementsSetArray.length; i++) {
                this._measurementsSetList.add(vMeasurementsSetArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vQualifierMeasurements
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setQualifierMeasurements(
            final int index,
            final eu.dca.model.QualifierMeasurements vQualifierMeasurements)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._qualifierMeasurementsList.size()) {
            throw new IndexOutOfBoundsException("setQualifierMeasurements: Index value '" + index + "' not in range [0.." + (this._qualifierMeasurementsList.size() - 1) + "]");
        }

        this._qualifierMeasurementsList.set(index, vQualifierMeasurements);
    }

    /**
     * 
     * 
     * @param vQualifierMeasurementsArray
     */
    public void setQualifierMeasurements(
            final eu.dca.model.QualifierMeasurements[] vQualifierMeasurementsArray) {
        //-- copy array
        _qualifierMeasurementsList.clear();

        for (int i = 0; i < vQualifierMeasurementsArray.length; i++) {
                this._qualifierMeasurementsList.add(vQualifierMeasurementsArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vScaleMeasurements
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setScaleMeasurements(
            final int index,
            final eu.dca.model.ScaleMeasurements vScaleMeasurements)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._scaleMeasurementsList.size()) {
            throw new IndexOutOfBoundsException("setScaleMeasurements: Index value '" + index + "' not in range [0.." + (this._scaleMeasurementsList.size() - 1) + "]");
        }

        this._scaleMeasurementsList.set(index, vScaleMeasurements);
    }

    /**
     * 
     * 
     * @param vScaleMeasurementsArray
     */
    public void setScaleMeasurements(
            final eu.dca.model.ScaleMeasurements[] vScaleMeasurementsArray) {
        //-- copy array
        _scaleMeasurementsList.clear();

        for (int i = 0; i < vScaleMeasurementsArray.length; i++) {
                this._scaleMeasurementsList.add(vScaleMeasurementsArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vShapeMeasurements
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setShapeMeasurements(
            final int index,
            final eu.dca.model.ShapeMeasurements vShapeMeasurements)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._shapeMeasurementsList.size()) {
            throw new IndexOutOfBoundsException("setShapeMeasurements: Index value '" + index + "' not in range [0.." + (this._shapeMeasurementsList.size() - 1) + "]");
        }

        this._shapeMeasurementsList.set(index, vShapeMeasurements);
    }

    /**
     * 
     * 
     * @param vShapeMeasurementsArray
     */
    public void setShapeMeasurements(
            final eu.dca.model.ShapeMeasurements[] vShapeMeasurementsArray) {
        //-- copy array
        _shapeMeasurementsList.clear();

        for (int i = 0; i < vShapeMeasurementsArray.length; i++) {
                this._shapeMeasurementsList.add(vShapeMeasurementsArray[i]);
        }
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
