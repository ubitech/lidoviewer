/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: Wrapper for display and index elements for date
 * information.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class DateSetComplexType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: Display element for a date specification,
     * corresponding to the following date element.
     */
    private java.util.Vector<eu.dca.model.DisplayDate> _displayDateList;

    /**
     * Definition: Contains a date specification by providing a set
     * of years as earliest and latest date delimiting the
     * respective span of time.This may be a period or a set of
     * years in the proleptic Gregorian calendar delimiting the
     * span of time. If it is an exact date, possibly with time,
     * repeat the same date (and time) in earliest and latest date. 
     */
    private eu.dca.model.Date _date;


      //----------------/
     //- Constructors -/
    //----------------/

    public DateSetComplexType() {
        super();
        this._displayDateList = new java.util.Vector<eu.dca.model.DisplayDate>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vDisplayDate
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDisplayDate(
            final eu.dca.model.DisplayDate vDisplayDate)
    throws java.lang.IndexOutOfBoundsException {
        this._displayDateList.addElement(vDisplayDate);
    }

    /**
     * 
     * 
     * @param index
     * @param vDisplayDate
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDisplayDate(
            final int index,
            final eu.dca.model.DisplayDate vDisplayDate)
    throws java.lang.IndexOutOfBoundsException {
        this._displayDateList.add(index, vDisplayDate);
    }

    /**
     * Method enumerateDisplayDate.
     * 
     * @return an Enumeration over all eu.dca.model.DisplayDate
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.DisplayDate> enumerateDisplayDate(
    ) {
        return this._displayDateList.elements();
    }

    /**
     * Returns the value of field 'date'. The field 'date' has the
     * following description: Definition: Contains a date
     * specification by providing a set of years as earliest and
     * latest date delimiting the respective span of time.This may
     * be a period or a set of years in the proleptic Gregorian
     * calendar delimiting the span of time. If it is an exact
     * date, possibly with time, repeat the same date (and time) in
     * earliest and latest date. 
     * 
     * @return the value of field 'Date'.
     */
    public eu.dca.model.Date getDate(
    ) {
        return this._date;
    }

    /**
     * Method getDisplayDate.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.DisplayDate at the
     * given index
     */
    public eu.dca.model.DisplayDate getDisplayDate(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._displayDateList.size()) {
            throw new IndexOutOfBoundsException("getDisplayDate: Index value '" + index + "' not in range [0.." + (this._displayDateList.size() - 1) + "]");
        }

        return (eu.dca.model.DisplayDate) _displayDateList.get(index);
    }

    /**
     * Method getDisplayDate.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.DisplayDate[] getDisplayDate(
    ) {
        eu.dca.model.DisplayDate[] array = new eu.dca.model.DisplayDate[0];
        return (eu.dca.model.DisplayDate[]) this._displayDateList.toArray(array);
    }

    /**
     * Method getDisplayDateCount.
     * 
     * @return the size of this collection
     */
    public int getDisplayDateCount(
    ) {
        return this._displayDateList.size();
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
    public void removeAllDisplayDate(
    ) {
        this._displayDateList.clear();
    }

    /**
     * Method removeDisplayDate.
     * 
     * @param vDisplayDate
     * @return true if the object was removed from the collection.
     */
    public boolean removeDisplayDate(
            final eu.dca.model.DisplayDate vDisplayDate) {
        boolean removed = _displayDateList.remove(vDisplayDate);
        return removed;
    }

    /**
     * Method removeDisplayDateAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.DisplayDate removeDisplayDateAt(
            final int index) {
        java.lang.Object obj = this._displayDateList.remove(index);
        return (eu.dca.model.DisplayDate) obj;
    }

    /**
     * Sets the value of field 'date'. The field 'date' has the
     * following description: Definition: Contains a date
     * specification by providing a set of years as earliest and
     * latest date delimiting the respective span of time.This may
     * be a period or a set of years in the proleptic Gregorian
     * calendar delimiting the span of time. If it is an exact
     * date, possibly with time, repeat the same date (and time) in
     * earliest and latest date. 
     * 
     * @param date the value of field 'date'.
     */
    public void setDate(
            final eu.dca.model.Date date) {
        this._date = date;
    }

    /**
     * 
     * 
     * @param index
     * @param vDisplayDate
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setDisplayDate(
            final int index,
            final eu.dca.model.DisplayDate vDisplayDate)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._displayDateList.size()) {
            throw new IndexOutOfBoundsException("setDisplayDate: Index value '" + index + "' not in range [0.." + (this._displayDateList.size() - 1) + "]");
        }

        this._displayDateList.set(index, vDisplayDate);
    }

    /**
     * 
     * 
     * @param vDisplayDateArray
     */
    public void setDisplayDate(
            final eu.dca.model.DisplayDate[] vDisplayDateArray) {
        //-- copy array
        _displayDateList.clear();

        for (int i = 0; i < vDisplayDateArray.length; i++) {
                this._displayDateList.add(vDisplayDateArray[i]);
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
