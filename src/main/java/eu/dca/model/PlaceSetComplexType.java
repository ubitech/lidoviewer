/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: Wrapper for display and index elements for place
 * information.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class PlaceSetComplexType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: Display element for a place specification,
     * corresponding to the following place element.
     */
    private java.util.Vector<eu.dca.model.DisplayPlace> _displayPlaceList;

    /**
     * Definition: Contains structured identifying and indexing
     * information for a geographical entity.
     */
    private eu.dca.model.Place _place;


      //----------------/
     //- Constructors -/
    //----------------/

    public PlaceSetComplexType() {
        super();
        this._displayPlaceList = new java.util.Vector<eu.dca.model.DisplayPlace>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vDisplayPlace
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDisplayPlace(
            final eu.dca.model.DisplayPlace vDisplayPlace)
    throws java.lang.IndexOutOfBoundsException {
        this._displayPlaceList.addElement(vDisplayPlace);
    }

    /**
     * 
     * 
     * @param index
     * @param vDisplayPlace
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDisplayPlace(
            final int index,
            final eu.dca.model.DisplayPlace vDisplayPlace)
    throws java.lang.IndexOutOfBoundsException {
        this._displayPlaceList.add(index, vDisplayPlace);
    }

    /**
     * Method enumerateDisplayPlace.
     * 
     * @return an Enumeration over all eu.dca.model.DisplayPlace
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.DisplayPlace> enumerateDisplayPlace(
    ) {
        return this._displayPlaceList.elements();
    }

    /**
     * Method getDisplayPlace.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.DisplayPlace at the
     * given index
     */
    public eu.dca.model.DisplayPlace getDisplayPlace(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._displayPlaceList.size()) {
            throw new IndexOutOfBoundsException("getDisplayPlace: Index value '" + index + "' not in range [0.." + (this._displayPlaceList.size() - 1) + "]");
        }

        return (eu.dca.model.DisplayPlace) _displayPlaceList.get(index);
    }

    /**
     * Method getDisplayPlace.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.DisplayPlace[] getDisplayPlace(
    ) {
        eu.dca.model.DisplayPlace[] array = new eu.dca.model.DisplayPlace[0];
        return (eu.dca.model.DisplayPlace[]) this._displayPlaceList.toArray(array);
    }

    /**
     * Method getDisplayPlaceCount.
     * 
     * @return the size of this collection
     */
    public int getDisplayPlaceCount(
    ) {
        return this._displayPlaceList.size();
    }

    /**
     * Returns the value of field 'place'. The field 'place' has
     * the following description: Definition: Contains structured
     * identifying and indexing information for a geographical
     * entity.
     * 
     * @return the value of field 'Place'.
     */
    public eu.dca.model.Place getPlace(
    ) {
        return this._place;
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
    public void removeAllDisplayPlace(
    ) {
        this._displayPlaceList.clear();
    }

    /**
     * Method removeDisplayPlace.
     * 
     * @param vDisplayPlace
     * @return true if the object was removed from the collection.
     */
    public boolean removeDisplayPlace(
            final eu.dca.model.DisplayPlace vDisplayPlace) {
        boolean removed = _displayPlaceList.remove(vDisplayPlace);
        return removed;
    }

    /**
     * Method removeDisplayPlaceAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.DisplayPlace removeDisplayPlaceAt(
            final int index) {
        java.lang.Object obj = this._displayPlaceList.remove(index);
        return (eu.dca.model.DisplayPlace) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vDisplayPlace
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setDisplayPlace(
            final int index,
            final eu.dca.model.DisplayPlace vDisplayPlace)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._displayPlaceList.size()) {
            throw new IndexOutOfBoundsException("setDisplayPlace: Index value '" + index + "' not in range [0.." + (this._displayPlaceList.size() - 1) + "]");
        }

        this._displayPlaceList.set(index, vDisplayPlace);
    }

    /**
     * 
     * 
     * @param vDisplayPlaceArray
     */
    public void setDisplayPlace(
            final eu.dca.model.DisplayPlace[] vDisplayPlaceArray) {
        //-- copy array
        _displayPlaceList.clear();

        for (int i = 0; i < vDisplayPlaceArray.length; i++) {
                this._displayPlaceList.add(vDisplayPlaceArray[i]);
        }
    }

    /**
     * Sets the value of field 'place'. The field 'place' has the
     * following description: Definition: Contains structured
     * identifying and indexing information for a geographical
     * entity.
     * 
     * @param place the value of field 'place'.
     */
    public void setPlace(
            final eu.dca.model.Place place) {
        this._place = place;
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
