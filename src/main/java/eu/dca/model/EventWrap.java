/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: Wrapper for event sets.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class EventWrap implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: Wrapper for the display and index elements for
     * events (e.g. creation, find, and use), in which the object
     * participated. 
     */
    private java.util.Vector<eu.dca.model.EventSet> _eventSetList;


      //----------------/
     //- Constructors -/
    //----------------/

    public EventWrap() {
        super();
        this._eventSetList = new java.util.Vector<eu.dca.model.EventSet>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vEventSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEventSet(
            final eu.dca.model.EventSet vEventSet)
    throws java.lang.IndexOutOfBoundsException {
        this._eventSetList.addElement(vEventSet);
    }

    /**
     * 
     * 
     * @param index
     * @param vEventSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEventSet(
            final int index,
            final eu.dca.model.EventSet vEventSet)
    throws java.lang.IndexOutOfBoundsException {
        this._eventSetList.add(index, vEventSet);
    }

    /**
     * Method enumerateEventSet.
     * 
     * @return an Enumeration over all eu.dca.model.EventSet element
     */
    public java.util.Enumeration<? extends eu.dca.model.EventSet> enumerateEventSet(
    ) {
        return this._eventSetList.elements();
    }

    /**
     * Method getEventSet.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.EventSet at the given
     * index
     */
    public eu.dca.model.EventSet getEventSet(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._eventSetList.size()) {
            throw new IndexOutOfBoundsException("getEventSet: Index value '" + index + "' not in range [0.." + (this._eventSetList.size() - 1) + "]");
        }

        return (eu.dca.model.EventSet) _eventSetList.get(index);
    }

    /**
     * Method getEventSet.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.EventSet[] getEventSet(
    ) {
        eu.dca.model.EventSet[] array = new eu.dca.model.EventSet[0];
        return (eu.dca.model.EventSet[]) this._eventSetList.toArray(array);
    }

    /**
     * Method getEventSetCount.
     * 
     * @return the size of this collection
     */
    public int getEventSetCount(
    ) {
        return this._eventSetList.size();
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
    public void removeAllEventSet(
    ) {
        this._eventSetList.clear();
    }

    /**
     * Method removeEventSet.
     * 
     * @param vEventSet
     * @return true if the object was removed from the collection.
     */
    public boolean removeEventSet(
            final eu.dca.model.EventSet vEventSet) {
        boolean removed = _eventSetList.remove(vEventSet);
        return removed;
    }

    /**
     * Method removeEventSetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.EventSet removeEventSetAt(
            final int index) {
        java.lang.Object obj = this._eventSetList.remove(index);
        return (eu.dca.model.EventSet) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vEventSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setEventSet(
            final int index,
            final eu.dca.model.EventSet vEventSet)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._eventSetList.size()) {
            throw new IndexOutOfBoundsException("setEventSet: Index value '" + index + "' not in range [0.." + (this._eventSetList.size() - 1) + "]");
        }

        this._eventSetList.set(index, vEventSet);
    }

    /**
     * 
     * 
     * @param vEventSetArray
     */
    public void setEventSet(
            final eu.dca.model.EventSet[] vEventSetArray) {
        //-- copy array
        _eventSetList.clear();

        for (int i = 0; i < vEventSetArray.length; i++) {
                this._eventSetList.add(vEventSetArray[i]);
        }
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled eu.dca.model.EventWrap
     */
    public static eu.dca.model.EventWrap unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (eu.dca.model.EventWrap) org.exolab.castor.xml.Unmarshaller.unmarshal(eu.dca.model.EventWrap.class, reader);
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
