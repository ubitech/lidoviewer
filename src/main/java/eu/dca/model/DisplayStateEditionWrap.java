/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: A wrapper for the state and edition of the object /
 * work. 
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class DisplayStateEditionWrap implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: A description of the state of the object / work.
     * Used primarily for prints and other multiples
     */
    private java.util.Vector<eu.dca.model.DisplayState> _displayStateList;

    /**
     * Definition: A description of the edition of the object /
     * work. Used primarily for prints and other multiples.
     */
    private java.util.Vector<eu.dca.model.DisplayEdition> _displayEditionList;

    /**
     * Definition: The published source of the state or edition
     * information.
     */
    private java.util.Vector<eu.dca.model.SourceStateEdition> _sourceStateEditionList;


      //----------------/
     //- Constructors -/
    //----------------/

    public DisplayStateEditionWrap() {
        super();
        this._displayStateList = new java.util.Vector<eu.dca.model.DisplayState>();
        this._displayEditionList = new java.util.Vector<eu.dca.model.DisplayEdition>();
        this._sourceStateEditionList = new java.util.Vector<eu.dca.model.SourceStateEdition>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vDisplayEdition
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDisplayEdition(
            final eu.dca.model.DisplayEdition vDisplayEdition)
    throws java.lang.IndexOutOfBoundsException {
        this._displayEditionList.addElement(vDisplayEdition);
    }

    /**
     * 
     * 
     * @param index
     * @param vDisplayEdition
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDisplayEdition(
            final int index,
            final eu.dca.model.DisplayEdition vDisplayEdition)
    throws java.lang.IndexOutOfBoundsException {
        this._displayEditionList.add(index, vDisplayEdition);
    }

    /**
     * 
     * 
     * @param vDisplayState
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDisplayState(
            final eu.dca.model.DisplayState vDisplayState)
    throws java.lang.IndexOutOfBoundsException {
        this._displayStateList.addElement(vDisplayState);
    }

    /**
     * 
     * 
     * @param index
     * @param vDisplayState
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDisplayState(
            final int index,
            final eu.dca.model.DisplayState vDisplayState)
    throws java.lang.IndexOutOfBoundsException {
        this._displayStateList.add(index, vDisplayState);
    }

    /**
     * 
     * 
     * @param vSourceStateEdition
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSourceStateEdition(
            final eu.dca.model.SourceStateEdition vSourceStateEdition)
    throws java.lang.IndexOutOfBoundsException {
        this._sourceStateEditionList.addElement(vSourceStateEdition);
    }

    /**
     * 
     * 
     * @param index
     * @param vSourceStateEdition
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSourceStateEdition(
            final int index,
            final eu.dca.model.SourceStateEdition vSourceStateEdition)
    throws java.lang.IndexOutOfBoundsException {
        this._sourceStateEditionList.add(index, vSourceStateEdition);
    }

    /**
     * Method enumerateDisplayEdition.
     * 
     * @return an Enumeration over all eu.dca.model.DisplayEdition
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.DisplayEdition> enumerateDisplayEdition(
    ) {
        return this._displayEditionList.elements();
    }

    /**
     * Method enumerateDisplayState.
     * 
     * @return an Enumeration over all eu.dca.model.DisplayState
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.DisplayState> enumerateDisplayState(
    ) {
        return this._displayStateList.elements();
    }

    /**
     * Method enumerateSourceStateEdition.
     * 
     * @return an Enumeration over all
     * eu.dca.model.SourceStateEdition elements
     */
    public java.util.Enumeration<? extends eu.dca.model.SourceStateEdition> enumerateSourceStateEdition(
    ) {
        return this._sourceStateEditionList.elements();
    }

    /**
     * Method getDisplayEdition.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.DisplayEdition at the
     * given index
     */
    public eu.dca.model.DisplayEdition getDisplayEdition(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._displayEditionList.size()) {
            throw new IndexOutOfBoundsException("getDisplayEdition: Index value '" + index + "' not in range [0.." + (this._displayEditionList.size() - 1) + "]");
        }

        return (eu.dca.model.DisplayEdition) _displayEditionList.get(index);
    }

    /**
     * Method getDisplayEdition.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.DisplayEdition[] getDisplayEdition(
    ) {
        eu.dca.model.DisplayEdition[] array = new eu.dca.model.DisplayEdition[0];
        return (eu.dca.model.DisplayEdition[]) this._displayEditionList.toArray(array);
    }

    /**
     * Method getDisplayEditionCount.
     * 
     * @return the size of this collection
     */
    public int getDisplayEditionCount(
    ) {
        return this._displayEditionList.size();
    }

    /**
     * Method getDisplayState.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.DisplayState at the
     * given index
     */
    public eu.dca.model.DisplayState getDisplayState(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._displayStateList.size()) {
            throw new IndexOutOfBoundsException("getDisplayState: Index value '" + index + "' not in range [0.." + (this._displayStateList.size() - 1) + "]");
        }

        return (eu.dca.model.DisplayState) _displayStateList.get(index);
    }

    /**
     * Method getDisplayState.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.DisplayState[] getDisplayState(
    ) {
        eu.dca.model.DisplayState[] array = new eu.dca.model.DisplayState[0];
        return (eu.dca.model.DisplayState[]) this._displayStateList.toArray(array);
    }

    /**
     * Method getDisplayStateCount.
     * 
     * @return the size of this collection
     */
    public int getDisplayStateCount(
    ) {
        return this._displayStateList.size();
    }

    /**
     * Method getSourceStateEdition.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.SourceStateEdition at
     * the given index
     */
    public eu.dca.model.SourceStateEdition getSourceStateEdition(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._sourceStateEditionList.size()) {
            throw new IndexOutOfBoundsException("getSourceStateEdition: Index value '" + index + "' not in range [0.." + (this._sourceStateEditionList.size() - 1) + "]");
        }

        return (eu.dca.model.SourceStateEdition) _sourceStateEditionList.get(index);
    }

    /**
     * Method getSourceStateEdition.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.SourceStateEdition[] getSourceStateEdition(
    ) {
        eu.dca.model.SourceStateEdition[] array = new eu.dca.model.SourceStateEdition[0];
        return (eu.dca.model.SourceStateEdition[]) this._sourceStateEditionList.toArray(array);
    }

    /**
     * Method getSourceStateEditionCount.
     * 
     * @return the size of this collection
     */
    public int getSourceStateEditionCount(
    ) {
        return this._sourceStateEditionList.size();
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
    public void removeAllDisplayEdition(
    ) {
        this._displayEditionList.clear();
    }

    /**
     */
    public void removeAllDisplayState(
    ) {
        this._displayStateList.clear();
    }

    /**
     */
    public void removeAllSourceStateEdition(
    ) {
        this._sourceStateEditionList.clear();
    }

    /**
     * Method removeDisplayEdition.
     * 
     * @param vDisplayEdition
     * @return true if the object was removed from the collection.
     */
    public boolean removeDisplayEdition(
            final eu.dca.model.DisplayEdition vDisplayEdition) {
        boolean removed = _displayEditionList.remove(vDisplayEdition);
        return removed;
    }

    /**
     * Method removeDisplayEditionAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.DisplayEdition removeDisplayEditionAt(
            final int index) {
        java.lang.Object obj = this._displayEditionList.remove(index);
        return (eu.dca.model.DisplayEdition) obj;
    }

    /**
     * Method removeDisplayState.
     * 
     * @param vDisplayState
     * @return true if the object was removed from the collection.
     */
    public boolean removeDisplayState(
            final eu.dca.model.DisplayState vDisplayState) {
        boolean removed = _displayStateList.remove(vDisplayState);
        return removed;
    }

    /**
     * Method removeDisplayStateAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.DisplayState removeDisplayStateAt(
            final int index) {
        java.lang.Object obj = this._displayStateList.remove(index);
        return (eu.dca.model.DisplayState) obj;
    }

    /**
     * Method removeSourceStateEdition.
     * 
     * @param vSourceStateEdition
     * @return true if the object was removed from the collection.
     */
    public boolean removeSourceStateEdition(
            final eu.dca.model.SourceStateEdition vSourceStateEdition) {
        boolean removed = _sourceStateEditionList.remove(vSourceStateEdition);
        return removed;
    }

    /**
     * Method removeSourceStateEditionAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.SourceStateEdition removeSourceStateEditionAt(
            final int index) {
        java.lang.Object obj = this._sourceStateEditionList.remove(index);
        return (eu.dca.model.SourceStateEdition) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vDisplayEdition
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setDisplayEdition(
            final int index,
            final eu.dca.model.DisplayEdition vDisplayEdition)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._displayEditionList.size()) {
            throw new IndexOutOfBoundsException("setDisplayEdition: Index value '" + index + "' not in range [0.." + (this._displayEditionList.size() - 1) + "]");
        }

        this._displayEditionList.set(index, vDisplayEdition);
    }

    /**
     * 
     * 
     * @param vDisplayEditionArray
     */
    public void setDisplayEdition(
            final eu.dca.model.DisplayEdition[] vDisplayEditionArray) {
        //-- copy array
        _displayEditionList.clear();

        for (int i = 0; i < vDisplayEditionArray.length; i++) {
                this._displayEditionList.add(vDisplayEditionArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vDisplayState
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setDisplayState(
            final int index,
            final eu.dca.model.DisplayState vDisplayState)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._displayStateList.size()) {
            throw new IndexOutOfBoundsException("setDisplayState: Index value '" + index + "' not in range [0.." + (this._displayStateList.size() - 1) + "]");
        }

        this._displayStateList.set(index, vDisplayState);
    }

    /**
     * 
     * 
     * @param vDisplayStateArray
     */
    public void setDisplayState(
            final eu.dca.model.DisplayState[] vDisplayStateArray) {
        //-- copy array
        _displayStateList.clear();

        for (int i = 0; i < vDisplayStateArray.length; i++) {
                this._displayStateList.add(vDisplayStateArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vSourceStateEdition
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSourceStateEdition(
            final int index,
            final eu.dca.model.SourceStateEdition vSourceStateEdition)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._sourceStateEditionList.size()) {
            throw new IndexOutOfBoundsException("setSourceStateEdition: Index value '" + index + "' not in range [0.." + (this._sourceStateEditionList.size() - 1) + "]");
        }

        this._sourceStateEditionList.set(index, vSourceStateEdition);
    }

    /**
     * 
     * 
     * @param vSourceStateEditionArray
     */
    public void setSourceStateEdition(
            final eu.dca.model.SourceStateEdition[] vSourceStateEditionArray) {
        //-- copy array
        _sourceStateEditionList.clear();

        for (int i = 0; i < vSourceStateEditionArray.length; i++) {
                this._sourceStateEditionList.add(vSourceStateEditionArray[i]);
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
     * @return the unmarshaled eu.dca.model.DisplayStateEditionWrap
     */
    public static eu.dca.model.DisplayStateEditionWrap unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (eu.dca.model.DisplayStateEditionWrap) org.exolab.castor.xml.Unmarshaller.unmarshal(eu.dca.model.DisplayStateEditionWrap.class, reader);
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
