/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: Wrapper for metadata information about this
 * record.Notes: The metadata information contains the reference to
 * the "lido"-metadata set but may also be constituted by reference
 * to an "object data sheet" in an online database.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class RecordInfoSetComplexType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: Qualifies the type of information given in the
     * holding element. 
     */
    private java.lang.String _type;

    /**
     * Definition: Unique ID of the metadata. 
     */
    private java.util.Vector<eu.dca.model.RecordInfoID> _recordInfoIDList;

    /**
     * Definition: Link of the metadata, e.g., to the object data
     * sheet (not the same as link of the object).
     */
    private java.util.Vector<eu.dca.model.RecordInfoLink> _recordInfoLinkList;

    /**
     * Definition: Creation date or date modified of the metadata
     * record. Format will vary depending upon implementation.
     */
    private java.util.Vector<eu.dca.model.RecordMetadataDate> _recordMetadataDateList;


      //----------------/
     //- Constructors -/
    //----------------/

    public RecordInfoSetComplexType() {
        super();
        this._recordInfoIDList = new java.util.Vector<eu.dca.model.RecordInfoID>();
        this._recordInfoLinkList = new java.util.Vector<eu.dca.model.RecordInfoLink>();
        this._recordMetadataDateList = new java.util.Vector<eu.dca.model.RecordMetadataDate>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vRecordInfoID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRecordInfoID(
            final eu.dca.model.RecordInfoID vRecordInfoID)
    throws java.lang.IndexOutOfBoundsException {
        this._recordInfoIDList.addElement(vRecordInfoID);
    }

    /**
     * 
     * 
     * @param index
     * @param vRecordInfoID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRecordInfoID(
            final int index,
            final eu.dca.model.RecordInfoID vRecordInfoID)
    throws java.lang.IndexOutOfBoundsException {
        this._recordInfoIDList.add(index, vRecordInfoID);
    }

    /**
     * 
     * 
     * @param vRecordInfoLink
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRecordInfoLink(
            final eu.dca.model.RecordInfoLink vRecordInfoLink)
    throws java.lang.IndexOutOfBoundsException {
        this._recordInfoLinkList.addElement(vRecordInfoLink);
    }

    /**
     * 
     * 
     * @param index
     * @param vRecordInfoLink
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRecordInfoLink(
            final int index,
            final eu.dca.model.RecordInfoLink vRecordInfoLink)
    throws java.lang.IndexOutOfBoundsException {
        this._recordInfoLinkList.add(index, vRecordInfoLink);
    }

    /**
     * 
     * 
     * @param vRecordMetadataDate
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRecordMetadataDate(
            final eu.dca.model.RecordMetadataDate vRecordMetadataDate)
    throws java.lang.IndexOutOfBoundsException {
        this._recordMetadataDateList.addElement(vRecordMetadataDate);
    }

    /**
     * 
     * 
     * @param index
     * @param vRecordMetadataDate
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRecordMetadataDate(
            final int index,
            final eu.dca.model.RecordMetadataDate vRecordMetadataDate)
    throws java.lang.IndexOutOfBoundsException {
        this._recordMetadataDateList.add(index, vRecordMetadataDate);
    }

    /**
     * Method enumerateRecordInfoID.
     * 
     * @return an Enumeration over all eu.dca.model.RecordInfoID
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.RecordInfoID> enumerateRecordInfoID(
    ) {
        return this._recordInfoIDList.elements();
    }

    /**
     * Method enumerateRecordInfoLink.
     * 
     * @return an Enumeration over all eu.dca.model.RecordInfoLink
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.RecordInfoLink> enumerateRecordInfoLink(
    ) {
        return this._recordInfoLinkList.elements();
    }

    /**
     * Method enumerateRecordMetadataDate.
     * 
     * @return an Enumeration over all
     * eu.dca.model.RecordMetadataDate elements
     */
    public java.util.Enumeration<? extends eu.dca.model.RecordMetadataDate> enumerateRecordMetadataDate(
    ) {
        return this._recordMetadataDateList.elements();
    }

    /**
     * Method getRecordInfoID.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.RecordInfoID at the
     * given index
     */
    public eu.dca.model.RecordInfoID getRecordInfoID(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._recordInfoIDList.size()) {
            throw new IndexOutOfBoundsException("getRecordInfoID: Index value '" + index + "' not in range [0.." + (this._recordInfoIDList.size() - 1) + "]");
        }

        return (eu.dca.model.RecordInfoID) _recordInfoIDList.get(index);
    }

    /**
     * Method getRecordInfoID.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.RecordInfoID[] getRecordInfoID(
    ) {
        eu.dca.model.RecordInfoID[] array = new eu.dca.model.RecordInfoID[0];
        return (eu.dca.model.RecordInfoID[]) this._recordInfoIDList.toArray(array);
    }

    /**
     * Method getRecordInfoIDCount.
     * 
     * @return the size of this collection
     */
    public int getRecordInfoIDCount(
    ) {
        return this._recordInfoIDList.size();
    }

    /**
     * Method getRecordInfoLink.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.RecordInfoLink at the
     * given index
     */
    public eu.dca.model.RecordInfoLink getRecordInfoLink(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._recordInfoLinkList.size()) {
            throw new IndexOutOfBoundsException("getRecordInfoLink: Index value '" + index + "' not in range [0.." + (this._recordInfoLinkList.size() - 1) + "]");
        }

        return (eu.dca.model.RecordInfoLink) _recordInfoLinkList.get(index);
    }

    /**
     * Method getRecordInfoLink.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.RecordInfoLink[] getRecordInfoLink(
    ) {
        eu.dca.model.RecordInfoLink[] array = new eu.dca.model.RecordInfoLink[0];
        return (eu.dca.model.RecordInfoLink[]) this._recordInfoLinkList.toArray(array);
    }

    /**
     * Method getRecordInfoLinkCount.
     * 
     * @return the size of this collection
     */
    public int getRecordInfoLinkCount(
    ) {
        return this._recordInfoLinkList.size();
    }

    /**
     * Method getRecordMetadataDate.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.RecordMetadataDate at
     * the given index
     */
    public eu.dca.model.RecordMetadataDate getRecordMetadataDate(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._recordMetadataDateList.size()) {
            throw new IndexOutOfBoundsException("getRecordMetadataDate: Index value '" + index + "' not in range [0.." + (this._recordMetadataDateList.size() - 1) + "]");
        }

        return (eu.dca.model.RecordMetadataDate) _recordMetadataDateList.get(index);
    }

    /**
     * Method getRecordMetadataDate.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.RecordMetadataDate[] getRecordMetadataDate(
    ) {
        eu.dca.model.RecordMetadataDate[] array = new eu.dca.model.RecordMetadataDate[0];
        return (eu.dca.model.RecordMetadataDate[]) this._recordMetadataDateList.toArray(array);
    }

    /**
     * Method getRecordMetadataDateCount.
     * 
     * @return the size of this collection
     */
    public int getRecordMetadataDateCount(
    ) {
        return this._recordMetadataDateList.size();
    }

    /**
     * Returns the value of field 'type'. The field 'type' has the
     * following description: Definition: Qualifies the type of
     * information given in the holding element. 
     * 
     * @return the value of field 'Type'.
     */
    public java.lang.String getType(
    ) {
        return this._type;
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
    public void removeAllRecordInfoID(
    ) {
        this._recordInfoIDList.clear();
    }

    /**
     */
    public void removeAllRecordInfoLink(
    ) {
        this._recordInfoLinkList.clear();
    }

    /**
     */
    public void removeAllRecordMetadataDate(
    ) {
        this._recordMetadataDateList.clear();
    }

    /**
     * Method removeRecordInfoID.
     * 
     * @param vRecordInfoID
     * @return true if the object was removed from the collection.
     */
    public boolean removeRecordInfoID(
            final eu.dca.model.RecordInfoID vRecordInfoID) {
        boolean removed = _recordInfoIDList.remove(vRecordInfoID);
        return removed;
    }

    /**
     * Method removeRecordInfoIDAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.RecordInfoID removeRecordInfoIDAt(
            final int index) {
        java.lang.Object obj = this._recordInfoIDList.remove(index);
        return (eu.dca.model.RecordInfoID) obj;
    }

    /**
     * Method removeRecordInfoLink.
     * 
     * @param vRecordInfoLink
     * @return true if the object was removed from the collection.
     */
    public boolean removeRecordInfoLink(
            final eu.dca.model.RecordInfoLink vRecordInfoLink) {
        boolean removed = _recordInfoLinkList.remove(vRecordInfoLink);
        return removed;
    }

    /**
     * Method removeRecordInfoLinkAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.RecordInfoLink removeRecordInfoLinkAt(
            final int index) {
        java.lang.Object obj = this._recordInfoLinkList.remove(index);
        return (eu.dca.model.RecordInfoLink) obj;
    }

    /**
     * Method removeRecordMetadataDate.
     * 
     * @param vRecordMetadataDate
     * @return true if the object was removed from the collection.
     */
    public boolean removeRecordMetadataDate(
            final eu.dca.model.RecordMetadataDate vRecordMetadataDate) {
        boolean removed = _recordMetadataDateList.remove(vRecordMetadataDate);
        return removed;
    }

    /**
     * Method removeRecordMetadataDateAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.RecordMetadataDate removeRecordMetadataDateAt(
            final int index) {
        java.lang.Object obj = this._recordMetadataDateList.remove(index);
        return (eu.dca.model.RecordMetadataDate) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vRecordInfoID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setRecordInfoID(
            final int index,
            final eu.dca.model.RecordInfoID vRecordInfoID)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._recordInfoIDList.size()) {
            throw new IndexOutOfBoundsException("setRecordInfoID: Index value '" + index + "' not in range [0.." + (this._recordInfoIDList.size() - 1) + "]");
        }

        this._recordInfoIDList.set(index, vRecordInfoID);
    }

    /**
     * 
     * 
     * @param vRecordInfoIDArray
     */
    public void setRecordInfoID(
            final eu.dca.model.RecordInfoID[] vRecordInfoIDArray) {
        //-- copy array
        _recordInfoIDList.clear();

        for (int i = 0; i < vRecordInfoIDArray.length; i++) {
                this._recordInfoIDList.add(vRecordInfoIDArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vRecordInfoLink
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setRecordInfoLink(
            final int index,
            final eu.dca.model.RecordInfoLink vRecordInfoLink)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._recordInfoLinkList.size()) {
            throw new IndexOutOfBoundsException("setRecordInfoLink: Index value '" + index + "' not in range [0.." + (this._recordInfoLinkList.size() - 1) + "]");
        }

        this._recordInfoLinkList.set(index, vRecordInfoLink);
    }

    /**
     * 
     * 
     * @param vRecordInfoLinkArray
     */
    public void setRecordInfoLink(
            final eu.dca.model.RecordInfoLink[] vRecordInfoLinkArray) {
        //-- copy array
        _recordInfoLinkList.clear();

        for (int i = 0; i < vRecordInfoLinkArray.length; i++) {
                this._recordInfoLinkList.add(vRecordInfoLinkArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vRecordMetadataDate
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setRecordMetadataDate(
            final int index,
            final eu.dca.model.RecordMetadataDate vRecordMetadataDate)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._recordMetadataDateList.size()) {
            throw new IndexOutOfBoundsException("setRecordMetadataDate: Index value '" + index + "' not in range [0.." + (this._recordMetadataDateList.size() - 1) + "]");
        }

        this._recordMetadataDateList.set(index, vRecordMetadataDate);
    }

    /**
     * 
     * 
     * @param vRecordMetadataDateArray
     */
    public void setRecordMetadataDate(
            final eu.dca.model.RecordMetadataDate[] vRecordMetadataDateArray) {
        //-- copy array
        _recordMetadataDateList.clear();

        for (int i = 0; i < vRecordMetadataDateArray.length; i++) {
                this._recordMetadataDateList.add(vRecordMetadataDateArray[i]);
        }
    }

    /**
     * Sets the value of field 'type'. The field 'type' has the
     * following description: Definition: Qualifies the type of
     * information given in the holding element. 
     * 
     * @param type the value of field 'type'.
     */
    public void setType(
            final java.lang.String type) {
        this._type = type;
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
