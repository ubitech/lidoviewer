/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: A wrapper for information about the record that
 * contains the cataloguing information.Notes: Note that this
 * section does not refer to any object or resource information,
 * but only to the source record. 
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class RecordWrap implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: A unique record identification in the
     * contributor's (local) system.
     */
    private java.util.Vector<eu.dca.model.RecordID> _recordIDList;

    /**
     * Definition: Term establishing whether the record represents
     * an individual item or a collection, series, or group of works
     */
    private eu.dca.model.RecordType _recordType;

    /**
     * Definition: The source of information in this record,
     * generally the repository or other institution.
     */
    private java.util.Vector<eu.dca.model.RecordSource> _recordSourceList;

    /**
     * Definition: Information about rights regarding the content
     * provided in this LIDO record.
     */
    private java.util.Vector<eu.dca.model.RecordRights> _recordRightsList;

    /**
     * Definition: Wrapper for metadata information about this
     * record.
     */
    private java.util.Vector<eu.dca.model.RecordInfoSet> _recordInfoSetList;


      //----------------/
     //- Constructors -/
    //----------------/

    public RecordWrap() {
        super();
        this._recordIDList = new java.util.Vector<eu.dca.model.RecordID>();
        this._recordSourceList = new java.util.Vector<eu.dca.model.RecordSource>();
        this._recordRightsList = new java.util.Vector<eu.dca.model.RecordRights>();
        this._recordInfoSetList = new java.util.Vector<eu.dca.model.RecordInfoSet>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vRecordID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRecordID(
            final eu.dca.model.RecordID vRecordID)
    throws java.lang.IndexOutOfBoundsException {
        this._recordIDList.addElement(vRecordID);
    }

    /**
     * 
     * 
     * @param index
     * @param vRecordID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRecordID(
            final int index,
            final eu.dca.model.RecordID vRecordID)
    throws java.lang.IndexOutOfBoundsException {
        this._recordIDList.add(index, vRecordID);
    }

    /**
     * 
     * 
     * @param vRecordInfoSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRecordInfoSet(
            final eu.dca.model.RecordInfoSet vRecordInfoSet)
    throws java.lang.IndexOutOfBoundsException {
        this._recordInfoSetList.addElement(vRecordInfoSet);
    }

    /**
     * 
     * 
     * @param index
     * @param vRecordInfoSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRecordInfoSet(
            final int index,
            final eu.dca.model.RecordInfoSet vRecordInfoSet)
    throws java.lang.IndexOutOfBoundsException {
        this._recordInfoSetList.add(index, vRecordInfoSet);
    }

    /**
     * 
     * 
     * @param vRecordRights
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRecordRights(
            final eu.dca.model.RecordRights vRecordRights)
    throws java.lang.IndexOutOfBoundsException {
        this._recordRightsList.addElement(vRecordRights);
    }

    /**
     * 
     * 
     * @param index
     * @param vRecordRights
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRecordRights(
            final int index,
            final eu.dca.model.RecordRights vRecordRights)
    throws java.lang.IndexOutOfBoundsException {
        this._recordRightsList.add(index, vRecordRights);
    }

    /**
     * 
     * 
     * @param vRecordSource
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRecordSource(
            final eu.dca.model.RecordSource vRecordSource)
    throws java.lang.IndexOutOfBoundsException {
        this._recordSourceList.addElement(vRecordSource);
    }

    /**
     * 
     * 
     * @param index
     * @param vRecordSource
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRecordSource(
            final int index,
            final eu.dca.model.RecordSource vRecordSource)
    throws java.lang.IndexOutOfBoundsException {
        this._recordSourceList.add(index, vRecordSource);
    }

    /**
     * Method enumerateRecordID.
     * 
     * @return an Enumeration over all eu.dca.model.RecordID element
     */
    public java.util.Enumeration<? extends eu.dca.model.RecordID> enumerateRecordID(
    ) {
        return this._recordIDList.elements();
    }

    /**
     * Method enumerateRecordInfoSet.
     * 
     * @return an Enumeration over all eu.dca.model.RecordInfoSet
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.RecordInfoSet> enumerateRecordInfoSet(
    ) {
        return this._recordInfoSetList.elements();
    }

    /**
     * Method enumerateRecordRights.
     * 
     * @return an Enumeration over all eu.dca.model.RecordRights
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.RecordRights> enumerateRecordRights(
    ) {
        return this._recordRightsList.elements();
    }

    /**
     * Method enumerateRecordSource.
     * 
     * @return an Enumeration over all eu.dca.model.RecordSource
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.RecordSource> enumerateRecordSource(
    ) {
        return this._recordSourceList.elements();
    }

    /**
     * Method getRecordID.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.RecordID at the given
     * index
     */
    public eu.dca.model.RecordID getRecordID(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._recordIDList.size()) {
            throw new IndexOutOfBoundsException("getRecordID: Index value '" + index + "' not in range [0.." + (this._recordIDList.size() - 1) + "]");
        }

        return (eu.dca.model.RecordID) _recordIDList.get(index);
    }

    /**
     * Method getRecordID.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.RecordID[] getRecordID(
    ) {
        eu.dca.model.RecordID[] array = new eu.dca.model.RecordID[0];
        return (eu.dca.model.RecordID[]) this._recordIDList.toArray(array);
    }

    /**
     * Method getRecordIDCount.
     * 
     * @return the size of this collection
     */
    public int getRecordIDCount(
    ) {
        return this._recordIDList.size();
    }

    /**
     * Method getRecordInfoSet.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.RecordInfoSet at the
     * given index
     */
    public eu.dca.model.RecordInfoSet getRecordInfoSet(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._recordInfoSetList.size()) {
            throw new IndexOutOfBoundsException("getRecordInfoSet: Index value '" + index + "' not in range [0.." + (this._recordInfoSetList.size() - 1) + "]");
        }

        return (eu.dca.model.RecordInfoSet) _recordInfoSetList.get(index);
    }

    /**
     * Method getRecordInfoSet.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.RecordInfoSet[] getRecordInfoSet(
    ) {
        eu.dca.model.RecordInfoSet[] array = new eu.dca.model.RecordInfoSet[0];
        return (eu.dca.model.RecordInfoSet[]) this._recordInfoSetList.toArray(array);
    }

    /**
     * Method getRecordInfoSetCount.
     * 
     * @return the size of this collection
     */
    public int getRecordInfoSetCount(
    ) {
        return this._recordInfoSetList.size();
    }

    /**
     * Method getRecordRights.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.RecordRights at the
     * given index
     */
    public eu.dca.model.RecordRights getRecordRights(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._recordRightsList.size()) {
            throw new IndexOutOfBoundsException("getRecordRights: Index value '" + index + "' not in range [0.." + (this._recordRightsList.size() - 1) + "]");
        }

        return (eu.dca.model.RecordRights) _recordRightsList.get(index);
    }

    /**
     * Method getRecordRights.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.RecordRights[] getRecordRights(
    ) {
        eu.dca.model.RecordRights[] array = new eu.dca.model.RecordRights[0];
        return (eu.dca.model.RecordRights[]) this._recordRightsList.toArray(array);
    }

    /**
     * Method getRecordRightsCount.
     * 
     * @return the size of this collection
     */
    public int getRecordRightsCount(
    ) {
        return this._recordRightsList.size();
    }

    /**
     * Method getRecordSource.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.RecordSource at the
     * given index
     */
    public eu.dca.model.RecordSource getRecordSource(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._recordSourceList.size()) {
            throw new IndexOutOfBoundsException("getRecordSource: Index value '" + index + "' not in range [0.." + (this._recordSourceList.size() - 1) + "]");
        }

        return (eu.dca.model.RecordSource) _recordSourceList.get(index);
    }

    /**
     * Method getRecordSource.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.RecordSource[] getRecordSource(
    ) {
        eu.dca.model.RecordSource[] array = new eu.dca.model.RecordSource[0];
        return (eu.dca.model.RecordSource[]) this._recordSourceList.toArray(array);
    }

    /**
     * Method getRecordSourceCount.
     * 
     * @return the size of this collection
     */
    public int getRecordSourceCount(
    ) {
        return this._recordSourceList.size();
    }

    /**
     * Returns the value of field 'recordType'. The field
     * 'recordType' has the following description: Definition: Term
     * establishing whether the record represents an individual
     * item or a collection, series, or group of works.
     * 
     * @return the value of field 'RecordType'.
     */
    public eu.dca.model.RecordType getRecordType(
    ) {
        return this._recordType;
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
    public void removeAllRecordID(
    ) {
        this._recordIDList.clear();
    }

    /**
     */
    public void removeAllRecordInfoSet(
    ) {
        this._recordInfoSetList.clear();
    }

    /**
     */
    public void removeAllRecordRights(
    ) {
        this._recordRightsList.clear();
    }

    /**
     */
    public void removeAllRecordSource(
    ) {
        this._recordSourceList.clear();
    }

    /**
     * Method removeRecordID.
     * 
     * @param vRecordID
     * @return true if the object was removed from the collection.
     */
    public boolean removeRecordID(
            final eu.dca.model.RecordID vRecordID) {
        boolean removed = _recordIDList.remove(vRecordID);
        return removed;
    }

    /**
     * Method removeRecordIDAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.RecordID removeRecordIDAt(
            final int index) {
        java.lang.Object obj = this._recordIDList.remove(index);
        return (eu.dca.model.RecordID) obj;
    }

    /**
     * Method removeRecordInfoSet.
     * 
     * @param vRecordInfoSet
     * @return true if the object was removed from the collection.
     */
    public boolean removeRecordInfoSet(
            final eu.dca.model.RecordInfoSet vRecordInfoSet) {
        boolean removed = _recordInfoSetList.remove(vRecordInfoSet);
        return removed;
    }

    /**
     * Method removeRecordInfoSetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.RecordInfoSet removeRecordInfoSetAt(
            final int index) {
        java.lang.Object obj = this._recordInfoSetList.remove(index);
        return (eu.dca.model.RecordInfoSet) obj;
    }

    /**
     * Method removeRecordRights.
     * 
     * @param vRecordRights
     * @return true if the object was removed from the collection.
     */
    public boolean removeRecordRights(
            final eu.dca.model.RecordRights vRecordRights) {
        boolean removed = _recordRightsList.remove(vRecordRights);
        return removed;
    }

    /**
     * Method removeRecordRightsAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.RecordRights removeRecordRightsAt(
            final int index) {
        java.lang.Object obj = this._recordRightsList.remove(index);
        return (eu.dca.model.RecordRights) obj;
    }

    /**
     * Method removeRecordSource.
     * 
     * @param vRecordSource
     * @return true if the object was removed from the collection.
     */
    public boolean removeRecordSource(
            final eu.dca.model.RecordSource vRecordSource) {
        boolean removed = _recordSourceList.remove(vRecordSource);
        return removed;
    }

    /**
     * Method removeRecordSourceAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.RecordSource removeRecordSourceAt(
            final int index) {
        java.lang.Object obj = this._recordSourceList.remove(index);
        return (eu.dca.model.RecordSource) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vRecordID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setRecordID(
            final int index,
            final eu.dca.model.RecordID vRecordID)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._recordIDList.size()) {
            throw new IndexOutOfBoundsException("setRecordID: Index value '" + index + "' not in range [0.." + (this._recordIDList.size() - 1) + "]");
        }

        this._recordIDList.set(index, vRecordID);
    }

    /**
     * 
     * 
     * @param vRecordIDArray
     */
    public void setRecordID(
            final eu.dca.model.RecordID[] vRecordIDArray) {
        //-- copy array
        _recordIDList.clear();

        for (int i = 0; i < vRecordIDArray.length; i++) {
                this._recordIDList.add(vRecordIDArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vRecordInfoSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setRecordInfoSet(
            final int index,
            final eu.dca.model.RecordInfoSet vRecordInfoSet)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._recordInfoSetList.size()) {
            throw new IndexOutOfBoundsException("setRecordInfoSet: Index value '" + index + "' not in range [0.." + (this._recordInfoSetList.size() - 1) + "]");
        }

        this._recordInfoSetList.set(index, vRecordInfoSet);
    }

    /**
     * 
     * 
     * @param vRecordInfoSetArray
     */
    public void setRecordInfoSet(
            final eu.dca.model.RecordInfoSet[] vRecordInfoSetArray) {
        //-- copy array
        _recordInfoSetList.clear();

        for (int i = 0; i < vRecordInfoSetArray.length; i++) {
                this._recordInfoSetList.add(vRecordInfoSetArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vRecordRights
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setRecordRights(
            final int index,
            final eu.dca.model.RecordRights vRecordRights)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._recordRightsList.size()) {
            throw new IndexOutOfBoundsException("setRecordRights: Index value '" + index + "' not in range [0.." + (this._recordRightsList.size() - 1) + "]");
        }

        this._recordRightsList.set(index, vRecordRights);
    }

    /**
     * 
     * 
     * @param vRecordRightsArray
     */
    public void setRecordRights(
            final eu.dca.model.RecordRights[] vRecordRightsArray) {
        //-- copy array
        _recordRightsList.clear();

        for (int i = 0; i < vRecordRightsArray.length; i++) {
                this._recordRightsList.add(vRecordRightsArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vRecordSource
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setRecordSource(
            final int index,
            final eu.dca.model.RecordSource vRecordSource)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._recordSourceList.size()) {
            throw new IndexOutOfBoundsException("setRecordSource: Index value '" + index + "' not in range [0.." + (this._recordSourceList.size() - 1) + "]");
        }

        this._recordSourceList.set(index, vRecordSource);
    }

    /**
     * 
     * 
     * @param vRecordSourceArray
     */
    public void setRecordSource(
            final eu.dca.model.RecordSource[] vRecordSourceArray) {
        //-- copy array
        _recordSourceList.clear();

        for (int i = 0; i < vRecordSourceArray.length; i++) {
                this._recordSourceList.add(vRecordSourceArray[i]);
        }
    }

    /**
     * Sets the value of field 'recordType'. The field 'recordType'
     * has the following description: Definition: Term establishing
     * whether the record represents an individual item or a
     * collection, series, or group of works.
     * 
     * @param recordType the value of field 'recordType'.
     */
    public void setRecordType(
            final eu.dca.model.RecordType recordType) {
        this._recordType = recordType;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled eu.dca.model.RecordWrap
     */
    public static eu.dca.model.RecordWrap unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (eu.dca.model.RecordWrap) org.exolab.castor.xml.Unmarshaller.unmarshal(eu.dca.model.RecordWrap.class, reader);
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
