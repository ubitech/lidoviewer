/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: Reference to an object / work.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class ObjectComplexType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: A URL-Reference to a description of the object /
     * work in the worldwide web environment.
     */
    private java.util.Vector<eu.dca.model.ObjectWebResource> _objectWebResourceList;

    /**
     * Definition: Unique identifier of the referenced object / work
     */
    private java.util.Vector<eu.dca.model.ObjectID> _objectIDList;

    /**
     * Definition: A descriptive identification of the object /
     * work that will be meaningful to end-users, including some or
     * all of the following information, as necessary for clarity
     * and if known: title, object/work type, important actor, date
     * and/or place information, potentially location of the object
     * / work.
     */
    private java.util.Vector<eu.dca.model.ObjectNote> _objectNoteList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ObjectComplexType() {
        super();
        this._objectWebResourceList = new java.util.Vector<eu.dca.model.ObjectWebResource>();
        this._objectIDList = new java.util.Vector<eu.dca.model.ObjectID>();
        this._objectNoteList = new java.util.Vector<eu.dca.model.ObjectNote>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vObjectID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addObjectID(
            final eu.dca.model.ObjectID vObjectID)
    throws java.lang.IndexOutOfBoundsException {
        this._objectIDList.addElement(vObjectID);
    }

    /**
     * 
     * 
     * @param index
     * @param vObjectID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addObjectID(
            final int index,
            final eu.dca.model.ObjectID vObjectID)
    throws java.lang.IndexOutOfBoundsException {
        this._objectIDList.add(index, vObjectID);
    }

    /**
     * 
     * 
     * @param vObjectNote
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addObjectNote(
            final eu.dca.model.ObjectNote vObjectNote)
    throws java.lang.IndexOutOfBoundsException {
        this._objectNoteList.addElement(vObjectNote);
    }

    /**
     * 
     * 
     * @param index
     * @param vObjectNote
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addObjectNote(
            final int index,
            final eu.dca.model.ObjectNote vObjectNote)
    throws java.lang.IndexOutOfBoundsException {
        this._objectNoteList.add(index, vObjectNote);
    }

    /**
     * 
     * 
     * @param vObjectWebResource
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addObjectWebResource(
            final eu.dca.model.ObjectWebResource vObjectWebResource)
    throws java.lang.IndexOutOfBoundsException {
        this._objectWebResourceList.addElement(vObjectWebResource);
    }

    /**
     * 
     * 
     * @param index
     * @param vObjectWebResource
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addObjectWebResource(
            final int index,
            final eu.dca.model.ObjectWebResource vObjectWebResource)
    throws java.lang.IndexOutOfBoundsException {
        this._objectWebResourceList.add(index, vObjectWebResource);
    }

    /**
     * Method enumerateObjectID.
     * 
     * @return an Enumeration over all eu.dca.model.ObjectID element
     */
    public java.util.Enumeration<? extends eu.dca.model.ObjectID> enumerateObjectID(
    ) {
        return this._objectIDList.elements();
    }

    /**
     * Method enumerateObjectNote.
     * 
     * @return an Enumeration over all eu.dca.model.ObjectNote
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.ObjectNote> enumerateObjectNote(
    ) {
        return this._objectNoteList.elements();
    }

    /**
     * Method enumerateObjectWebResource.
     * 
     * @return an Enumeration over all
     * eu.dca.model.ObjectWebResource elements
     */
    public java.util.Enumeration<? extends eu.dca.model.ObjectWebResource> enumerateObjectWebResource(
    ) {
        return this._objectWebResourceList.elements();
    }

    /**
     * Method getObjectID.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.ObjectID at the given
     * index
     */
    public eu.dca.model.ObjectID getObjectID(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._objectIDList.size()) {
            throw new IndexOutOfBoundsException("getObjectID: Index value '" + index + "' not in range [0.." + (this._objectIDList.size() - 1) + "]");
        }

        return (eu.dca.model.ObjectID) _objectIDList.get(index);
    }

    /**
     * Method getObjectID.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.ObjectID[] getObjectID(
    ) {
        eu.dca.model.ObjectID[] array = new eu.dca.model.ObjectID[0];
        return (eu.dca.model.ObjectID[]) this._objectIDList.toArray(array);
    }

    /**
     * Method getObjectIDCount.
     * 
     * @return the size of this collection
     */
    public int getObjectIDCount(
    ) {
        return this._objectIDList.size();
    }

    /**
     * Method getObjectNote.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.ObjectNote at the
     * given index
     */
    public eu.dca.model.ObjectNote getObjectNote(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._objectNoteList.size()) {
            throw new IndexOutOfBoundsException("getObjectNote: Index value '" + index + "' not in range [0.." + (this._objectNoteList.size() - 1) + "]");
        }

        return (eu.dca.model.ObjectNote) _objectNoteList.get(index);
    }

    /**
     * Method getObjectNote.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.ObjectNote[] getObjectNote(
    ) {
        eu.dca.model.ObjectNote[] array = new eu.dca.model.ObjectNote[0];
        return (eu.dca.model.ObjectNote[]) this._objectNoteList.toArray(array);
    }

    /**
     * Method getObjectNoteCount.
     * 
     * @return the size of this collection
     */
    public int getObjectNoteCount(
    ) {
        return this._objectNoteList.size();
    }

    /**
     * Method getObjectWebResource.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.ObjectWebResource at
     * the given index
     */
    public eu.dca.model.ObjectWebResource getObjectWebResource(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._objectWebResourceList.size()) {
            throw new IndexOutOfBoundsException("getObjectWebResource: Index value '" + index + "' not in range [0.." + (this._objectWebResourceList.size() - 1) + "]");
        }

        return (eu.dca.model.ObjectWebResource) _objectWebResourceList.get(index);
    }

    /**
     * Method getObjectWebResource.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.ObjectWebResource[] getObjectWebResource(
    ) {
        eu.dca.model.ObjectWebResource[] array = new eu.dca.model.ObjectWebResource[0];
        return (eu.dca.model.ObjectWebResource[]) this._objectWebResourceList.toArray(array);
    }

    /**
     * Method getObjectWebResourceCount.
     * 
     * @return the size of this collection
     */
    public int getObjectWebResourceCount(
    ) {
        return this._objectWebResourceList.size();
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
    public void removeAllObjectID(
    ) {
        this._objectIDList.clear();
    }

    /**
     */
    public void removeAllObjectNote(
    ) {
        this._objectNoteList.clear();
    }

    /**
     */
    public void removeAllObjectWebResource(
    ) {
        this._objectWebResourceList.clear();
    }

    /**
     * Method removeObjectID.
     * 
     * @param vObjectID
     * @return true if the object was removed from the collection.
     */
    public boolean removeObjectID(
            final eu.dca.model.ObjectID vObjectID) {
        boolean removed = _objectIDList.remove(vObjectID);
        return removed;
    }

    /**
     * Method removeObjectIDAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.ObjectID removeObjectIDAt(
            final int index) {
        java.lang.Object obj = this._objectIDList.remove(index);
        return (eu.dca.model.ObjectID) obj;
    }

    /**
     * Method removeObjectNote.
     * 
     * @param vObjectNote
     * @return true if the object was removed from the collection.
     */
    public boolean removeObjectNote(
            final eu.dca.model.ObjectNote vObjectNote) {
        boolean removed = _objectNoteList.remove(vObjectNote);
        return removed;
    }

    /**
     * Method removeObjectNoteAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.ObjectNote removeObjectNoteAt(
            final int index) {
        java.lang.Object obj = this._objectNoteList.remove(index);
        return (eu.dca.model.ObjectNote) obj;
    }

    /**
     * Method removeObjectWebResource.
     * 
     * @param vObjectWebResource
     * @return true if the object was removed from the collection.
     */
    public boolean removeObjectWebResource(
            final eu.dca.model.ObjectWebResource vObjectWebResource) {
        boolean removed = _objectWebResourceList.remove(vObjectWebResource);
        return removed;
    }

    /**
     * Method removeObjectWebResourceAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.ObjectWebResource removeObjectWebResourceAt(
            final int index) {
        java.lang.Object obj = this._objectWebResourceList.remove(index);
        return (eu.dca.model.ObjectWebResource) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vObjectID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setObjectID(
            final int index,
            final eu.dca.model.ObjectID vObjectID)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._objectIDList.size()) {
            throw new IndexOutOfBoundsException("setObjectID: Index value '" + index + "' not in range [0.." + (this._objectIDList.size() - 1) + "]");
        }

        this._objectIDList.set(index, vObjectID);
    }

    /**
     * 
     * 
     * @param vObjectIDArray
     */
    public void setObjectID(
            final eu.dca.model.ObjectID[] vObjectIDArray) {
        //-- copy array
        _objectIDList.clear();

        for (int i = 0; i < vObjectIDArray.length; i++) {
                this._objectIDList.add(vObjectIDArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vObjectNote
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setObjectNote(
            final int index,
            final eu.dca.model.ObjectNote vObjectNote)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._objectNoteList.size()) {
            throw new IndexOutOfBoundsException("setObjectNote: Index value '" + index + "' not in range [0.." + (this._objectNoteList.size() - 1) + "]");
        }

        this._objectNoteList.set(index, vObjectNote);
    }

    /**
     * 
     * 
     * @param vObjectNoteArray
     */
    public void setObjectNote(
            final eu.dca.model.ObjectNote[] vObjectNoteArray) {
        //-- copy array
        _objectNoteList.clear();

        for (int i = 0; i < vObjectNoteArray.length; i++) {
                this._objectNoteList.add(vObjectNoteArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vObjectWebResource
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setObjectWebResource(
            final int index,
            final eu.dca.model.ObjectWebResource vObjectWebResource)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._objectWebResourceList.size()) {
            throw new IndexOutOfBoundsException("setObjectWebResource: Index value '" + index + "' not in range [0.." + (this._objectWebResourceList.size() - 1) + "]");
        }

        this._objectWebResourceList.set(index, vObjectWebResource);
    }

    /**
     * 
     * 
     * @param vObjectWebResourceArray
     */
    public void setObjectWebResource(
            final eu.dca.model.ObjectWebResource[] vObjectWebResourceArray) {
        //-- copy array
        _objectWebResourceList.clear();

        for (int i = 0; i < vObjectWebResourceArray.length; i++) {
                this._objectWebResourceList.add(vObjectWebResourceArray[i]);
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
