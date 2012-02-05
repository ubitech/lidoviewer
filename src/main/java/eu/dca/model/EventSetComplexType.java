/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: Wrapper for display and index elements for events
 * (e.g. creation, find, use etc.), in which the described object
 * participated. How to record: For multiple events repeat the
 * element.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class EventSetComplexType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: Display element for an event, corresponding to
     * the following event element.
     */
    private java.util.Vector<eu.dca.model.DisplayEvent> _displayEventList;

    /**
     * Definition: Identifying, descriptive and indexing
     * information for the events in which the object participated
     * or was present at, e.g. creation, excavation, collection,
     * and use.
     */
    private eu.dca.model.Event _event;


      //----------------/
     //- Constructors -/
    //----------------/

    public EventSetComplexType() {
        super();
        this._displayEventList = new java.util.Vector<eu.dca.model.DisplayEvent>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vDisplayEvent
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDisplayEvent(
            final eu.dca.model.DisplayEvent vDisplayEvent)
    throws java.lang.IndexOutOfBoundsException {
        this._displayEventList.addElement(vDisplayEvent);
    }

    /**
     * 
     * 
     * @param index
     * @param vDisplayEvent
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDisplayEvent(
            final int index,
            final eu.dca.model.DisplayEvent vDisplayEvent)
    throws java.lang.IndexOutOfBoundsException {
        this._displayEventList.add(index, vDisplayEvent);
    }

    /**
     * Method enumerateDisplayEvent.
     * 
     * @return an Enumeration over all eu.dca.model.DisplayEvent
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.DisplayEvent> enumerateDisplayEvent(
    ) {
        return this._displayEventList.elements();
    }

    /**
     * Method getDisplayEvent.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.DisplayEvent at the
     * given index
     */
    public eu.dca.model.DisplayEvent getDisplayEvent(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._displayEventList.size()) {
            throw new IndexOutOfBoundsException("getDisplayEvent: Index value '" + index + "' not in range [0.." + (this._displayEventList.size() - 1) + "]");
        }

        return (eu.dca.model.DisplayEvent) _displayEventList.get(index);
    }

    /**
     * Method getDisplayEvent.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.DisplayEvent[] getDisplayEvent(
    ) {
        eu.dca.model.DisplayEvent[] array = new eu.dca.model.DisplayEvent[0];
        return (eu.dca.model.DisplayEvent[]) this._displayEventList.toArray(array);
    }

    /**
     * Method getDisplayEventCount.
     * 
     * @return the size of this collection
     */
    public int getDisplayEventCount(
    ) {
        return this._displayEventList.size();
    }

    /**
     * Returns the value of field 'event'. The field 'event' has
     * the following description: Definition: Identifying,
     * descriptive and indexing information for the events in which
     * the object participated or was present at, e.g. creation,
     * excavation, collection, and use.
     * 
     * @return the value of field 'Event'.
     */
    public eu.dca.model.Event getEvent(
    ) {
        return this._event;
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
    public void removeAllDisplayEvent(
    ) {
        this._displayEventList.clear();
    }

    /**
     * Method removeDisplayEvent.
     * 
     * @param vDisplayEvent
     * @return true if the object was removed from the collection.
     */
    public boolean removeDisplayEvent(
            final eu.dca.model.DisplayEvent vDisplayEvent) {
        boolean removed = _displayEventList.remove(vDisplayEvent);
        return removed;
    }

    /**
     * Method removeDisplayEventAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.DisplayEvent removeDisplayEventAt(
            final int index) {
        java.lang.Object obj = this._displayEventList.remove(index);
        return (eu.dca.model.DisplayEvent) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vDisplayEvent
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setDisplayEvent(
            final int index,
            final eu.dca.model.DisplayEvent vDisplayEvent)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._displayEventList.size()) {
            throw new IndexOutOfBoundsException("setDisplayEvent: Index value '" + index + "' not in range [0.." + (this._displayEventList.size() - 1) + "]");
        }

        this._displayEventList.set(index, vDisplayEvent);
    }

    /**
     * 
     * 
     * @param vDisplayEventArray
     */
    public void setDisplayEvent(
            final eu.dca.model.DisplayEvent[] vDisplayEventArray) {
        //-- copy array
        _displayEventList.clear();

        for (int i = 0; i < vDisplayEventArray.length; i++) {
                this._displayEventList.add(vDisplayEventArray[i]);
        }
    }

    /**
     * Sets the value of field 'event'. The field 'event' has the
     * following description: Definition: Identifying, descriptive
     * and indexing information for the events in which the object
     * participated or was present at, e.g. creation, excavation,
     * collection, and use.
     * 
     * @param event the value of field 'event'.
     */
    public void setEvent(
            final eu.dca.model.Event event) {
        this._event = event;
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
