/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: Wrapper for a description, including description
 * identifer, descriptive note and sources.How to record: If there
 * is more than one descriptive note, repeat this set.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class DescriptiveNoteComplexType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: Qualifies the type of information given in the
     * holding element. 
     */
    private java.lang.String _type;

    /**
     * Definition: Assigns a priority order for online presentation
     * of the element. 
     */
    private long _sortorder;

    /**
     * keeps track of state for field: _sortorder
     */
    private boolean _has_sortorder;

    /**
     * Definition: Identifier for an external resource describing
     * the entity. 
     */
    private java.util.Vector<eu.dca.model.DescriptiveNoteID> _descriptiveNoteIDList;

    /**
     * Definition: Usually a relatively brief essay-like text that
     * describes the entity.
     */
    private java.util.Vector<eu.dca.model.DescriptiveNoteValue> _descriptiveNoteValueList;

    /**
     * Definition: The source for the descriptive note, generally a
     * published source.
     */
    private java.util.Vector<eu.dca.model.SourceDescriptiveNote> _sourceDescriptiveNoteList;


      //----------------/
     //- Constructors -/
    //----------------/

    public DescriptiveNoteComplexType() {
        super();
        this._descriptiveNoteIDList = new java.util.Vector<eu.dca.model.DescriptiveNoteID>();
        this._descriptiveNoteValueList = new java.util.Vector<eu.dca.model.DescriptiveNoteValue>();
        this._sourceDescriptiveNoteList = new java.util.Vector<eu.dca.model.SourceDescriptiveNote>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vDescriptiveNoteID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDescriptiveNoteID(
            final eu.dca.model.DescriptiveNoteID vDescriptiveNoteID)
    throws java.lang.IndexOutOfBoundsException {
        this._descriptiveNoteIDList.addElement(vDescriptiveNoteID);
    }

    /**
     * 
     * 
     * @param index
     * @param vDescriptiveNoteID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDescriptiveNoteID(
            final int index,
            final eu.dca.model.DescriptiveNoteID vDescriptiveNoteID)
    throws java.lang.IndexOutOfBoundsException {
        this._descriptiveNoteIDList.add(index, vDescriptiveNoteID);
    }

    /**
     * 
     * 
     * @param vDescriptiveNoteValue
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDescriptiveNoteValue(
            final eu.dca.model.DescriptiveNoteValue vDescriptiveNoteValue)
    throws java.lang.IndexOutOfBoundsException {
        this._descriptiveNoteValueList.addElement(vDescriptiveNoteValue);
    }

    /**
     * 
     * 
     * @param index
     * @param vDescriptiveNoteValue
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDescriptiveNoteValue(
            final int index,
            final eu.dca.model.DescriptiveNoteValue vDescriptiveNoteValue)
    throws java.lang.IndexOutOfBoundsException {
        this._descriptiveNoteValueList.add(index, vDescriptiveNoteValue);
    }

    /**
     * 
     * 
     * @param vSourceDescriptiveNote
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSourceDescriptiveNote(
            final eu.dca.model.SourceDescriptiveNote vSourceDescriptiveNote)
    throws java.lang.IndexOutOfBoundsException {
        this._sourceDescriptiveNoteList.addElement(vSourceDescriptiveNote);
    }

    /**
     * 
     * 
     * @param index
     * @param vSourceDescriptiveNote
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSourceDescriptiveNote(
            final int index,
            final eu.dca.model.SourceDescriptiveNote vSourceDescriptiveNote)
    throws java.lang.IndexOutOfBoundsException {
        this._sourceDescriptiveNoteList.add(index, vSourceDescriptiveNote);
    }

    /**
     */
    public void deleteSortorder(
    ) {
        this._has_sortorder= false;
    }

    /**
     * Method enumerateDescriptiveNoteID.
     * 
     * @return an Enumeration over all
     * eu.dca.model.DescriptiveNoteID elements
     */
    public java.util.Enumeration<? extends eu.dca.model.DescriptiveNoteID> enumerateDescriptiveNoteID(
    ) {
        return this._descriptiveNoteIDList.elements();
    }

    /**
     * Method enumerateDescriptiveNoteValue.
     * 
     * @return an Enumeration over all
     * eu.dca.model.DescriptiveNoteValue elements
     */
    public java.util.Enumeration<? extends eu.dca.model.DescriptiveNoteValue> enumerateDescriptiveNoteValue(
    ) {
        return this._descriptiveNoteValueList.elements();
    }

    /**
     * Method enumerateSourceDescriptiveNote.
     * 
     * @return an Enumeration over all
     * eu.dca.model.SourceDescriptiveNote elements
     */
    public java.util.Enumeration<? extends eu.dca.model.SourceDescriptiveNote> enumerateSourceDescriptiveNote(
    ) {
        return this._sourceDescriptiveNoteList.elements();
    }

    /**
     * Method getDescriptiveNoteID.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.DescriptiveNoteID at
     * the given index
     */
    public eu.dca.model.DescriptiveNoteID getDescriptiveNoteID(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._descriptiveNoteIDList.size()) {
            throw new IndexOutOfBoundsException("getDescriptiveNoteID: Index value '" + index + "' not in range [0.." + (this._descriptiveNoteIDList.size() - 1) + "]");
        }

        return (eu.dca.model.DescriptiveNoteID) _descriptiveNoteIDList.get(index);
    }

    /**
     * Method getDescriptiveNoteID.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.DescriptiveNoteID[] getDescriptiveNoteID(
    ) {
        eu.dca.model.DescriptiveNoteID[] array = new eu.dca.model.DescriptiveNoteID[0];
        return (eu.dca.model.DescriptiveNoteID[]) this._descriptiveNoteIDList.toArray(array);
    }

    /**
     * Method getDescriptiveNoteIDCount.
     * 
     * @return the size of this collection
     */
    public int getDescriptiveNoteIDCount(
    ) {
        return this._descriptiveNoteIDList.size();
    }

    /**
     * Method getDescriptiveNoteValue.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.DescriptiveNoteValue
     * at the given index
     */
    public eu.dca.model.DescriptiveNoteValue getDescriptiveNoteValue(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._descriptiveNoteValueList.size()) {
            throw new IndexOutOfBoundsException("getDescriptiveNoteValue: Index value '" + index + "' not in range [0.." + (this._descriptiveNoteValueList.size() - 1) + "]");
        }

        return (eu.dca.model.DescriptiveNoteValue) _descriptiveNoteValueList.get(index);
    }

    /**
     * Method getDescriptiveNoteValue.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.DescriptiveNoteValue[] getDescriptiveNoteValue(
    ) {
        eu.dca.model.DescriptiveNoteValue[] array = new eu.dca.model.DescriptiveNoteValue[0];
        return (eu.dca.model.DescriptiveNoteValue[]) this._descriptiveNoteValueList.toArray(array);
    }

    /**
     * Method getDescriptiveNoteValueCount.
     * 
     * @return the size of this collection
     */
    public int getDescriptiveNoteValueCount(
    ) {
        return this._descriptiveNoteValueList.size();
    }

    /**
     * Returns the value of field 'sortorder'. The field
     * 'sortorder' has the following description: Definition:
     * Assigns a priority order for online presentation of the
     * element. 
     * 
     * @return the value of field 'Sortorder'.
     */
    public long getSortorder(
    ) {
        return this._sortorder;
    }

    /**
     * Method getSourceDescriptiveNote.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.SourceDescriptiveNote
     * at the given index
     */
    public eu.dca.model.SourceDescriptiveNote getSourceDescriptiveNote(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._sourceDescriptiveNoteList.size()) {
            throw new IndexOutOfBoundsException("getSourceDescriptiveNote: Index value '" + index + "' not in range [0.." + (this._sourceDescriptiveNoteList.size() - 1) + "]");
        }

        return (eu.dca.model.SourceDescriptiveNote) _sourceDescriptiveNoteList.get(index);
    }

    /**
     * Method getSourceDescriptiveNote.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.SourceDescriptiveNote[] getSourceDescriptiveNote(
    ) {
        eu.dca.model.SourceDescriptiveNote[] array = new eu.dca.model.SourceDescriptiveNote[0];
        return (eu.dca.model.SourceDescriptiveNote[]) this._sourceDescriptiveNoteList.toArray(array);
    }

    /**
     * Method getSourceDescriptiveNoteCount.
     * 
     * @return the size of this collection
     */
    public int getSourceDescriptiveNoteCount(
    ) {
        return this._sourceDescriptiveNoteList.size();
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
     * Method hasSortorder.
     * 
     * @return true if at least one Sortorder has been added
     */
    public boolean hasSortorder(
    ) {
        return this._has_sortorder;
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
    public void removeAllDescriptiveNoteID(
    ) {
        this._descriptiveNoteIDList.clear();
    }

    /**
     */
    public void removeAllDescriptiveNoteValue(
    ) {
        this._descriptiveNoteValueList.clear();
    }

    /**
     */
    public void removeAllSourceDescriptiveNote(
    ) {
        this._sourceDescriptiveNoteList.clear();
    }

    /**
     * Method removeDescriptiveNoteID.
     * 
     * @param vDescriptiveNoteID
     * @return true if the object was removed from the collection.
     */
    public boolean removeDescriptiveNoteID(
            final eu.dca.model.DescriptiveNoteID vDescriptiveNoteID) {
        boolean removed = _descriptiveNoteIDList.remove(vDescriptiveNoteID);
        return removed;
    }

    /**
     * Method removeDescriptiveNoteIDAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.DescriptiveNoteID removeDescriptiveNoteIDAt(
            final int index) {
        java.lang.Object obj = this._descriptiveNoteIDList.remove(index);
        return (eu.dca.model.DescriptiveNoteID) obj;
    }

    /**
     * Method removeDescriptiveNoteValue.
     * 
     * @param vDescriptiveNoteValue
     * @return true if the object was removed from the collection.
     */
    public boolean removeDescriptiveNoteValue(
            final eu.dca.model.DescriptiveNoteValue vDescriptiveNoteValue) {
        boolean removed = _descriptiveNoteValueList.remove(vDescriptiveNoteValue);
        return removed;
    }

    /**
     * Method removeDescriptiveNoteValueAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.DescriptiveNoteValue removeDescriptiveNoteValueAt(
            final int index) {
        java.lang.Object obj = this._descriptiveNoteValueList.remove(index);
        return (eu.dca.model.DescriptiveNoteValue) obj;
    }

    /**
     * Method removeSourceDescriptiveNote.
     * 
     * @param vSourceDescriptiveNote
     * @return true if the object was removed from the collection.
     */
    public boolean removeSourceDescriptiveNote(
            final eu.dca.model.SourceDescriptiveNote vSourceDescriptiveNote) {
        boolean removed = _sourceDescriptiveNoteList.remove(vSourceDescriptiveNote);
        return removed;
    }

    /**
     * Method removeSourceDescriptiveNoteAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.SourceDescriptiveNote removeSourceDescriptiveNoteAt(
            final int index) {
        java.lang.Object obj = this._sourceDescriptiveNoteList.remove(index);
        return (eu.dca.model.SourceDescriptiveNote) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vDescriptiveNoteID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setDescriptiveNoteID(
            final int index,
            final eu.dca.model.DescriptiveNoteID vDescriptiveNoteID)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._descriptiveNoteIDList.size()) {
            throw new IndexOutOfBoundsException("setDescriptiveNoteID: Index value '" + index + "' not in range [0.." + (this._descriptiveNoteIDList.size() - 1) + "]");
        }

        this._descriptiveNoteIDList.set(index, vDescriptiveNoteID);
    }

    /**
     * 
     * 
     * @param vDescriptiveNoteIDArray
     */
    public void setDescriptiveNoteID(
            final eu.dca.model.DescriptiveNoteID[] vDescriptiveNoteIDArray) {
        //-- copy array
        _descriptiveNoteIDList.clear();

        for (int i = 0; i < vDescriptiveNoteIDArray.length; i++) {
                this._descriptiveNoteIDList.add(vDescriptiveNoteIDArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vDescriptiveNoteValue
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setDescriptiveNoteValue(
            final int index,
            final eu.dca.model.DescriptiveNoteValue vDescriptiveNoteValue)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._descriptiveNoteValueList.size()) {
            throw new IndexOutOfBoundsException("setDescriptiveNoteValue: Index value '" + index + "' not in range [0.." + (this._descriptiveNoteValueList.size() - 1) + "]");
        }

        this._descriptiveNoteValueList.set(index, vDescriptiveNoteValue);
    }

    /**
     * 
     * 
     * @param vDescriptiveNoteValueArray
     */
    public void setDescriptiveNoteValue(
            final eu.dca.model.DescriptiveNoteValue[] vDescriptiveNoteValueArray) {
        //-- copy array
        _descriptiveNoteValueList.clear();

        for (int i = 0; i < vDescriptiveNoteValueArray.length; i++) {
                this._descriptiveNoteValueList.add(vDescriptiveNoteValueArray[i]);
        }
    }

    /**
     * Sets the value of field 'sortorder'. The field 'sortorder'
     * has the following description: Definition: Assigns a
     * priority order for online presentation of the element. 
     * 
     * @param sortorder the value of field 'sortorder'.
     */
    public void setSortorder(
            final long sortorder) {
        this._sortorder = sortorder;
        this._has_sortorder = true;
    }

    /**
     * 
     * 
     * @param index
     * @param vSourceDescriptiveNote
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSourceDescriptiveNote(
            final int index,
            final eu.dca.model.SourceDescriptiveNote vSourceDescriptiveNote)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._sourceDescriptiveNoteList.size()) {
            throw new IndexOutOfBoundsException("setSourceDescriptiveNote: Index value '" + index + "' not in range [0.." + (this._sourceDescriptiveNoteList.size() - 1) + "]");
        }

        this._sourceDescriptiveNoteList.set(index, vSourceDescriptiveNote);
    }

    /**
     * 
     * 
     * @param vSourceDescriptiveNoteArray
     */
    public void setSourceDescriptiveNote(
            final eu.dca.model.SourceDescriptiveNote[] vSourceDescriptiveNoteArray) {
        //-- copy array
        _sourceDescriptiveNoteList.clear();

        for (int i = 0; i < vSourceDescriptiveNoteArray.length; i++) {
                this._sourceDescriptiveNoteList.add(vSourceDescriptiveNoteArray[i]);
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
