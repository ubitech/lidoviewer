/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: Wrapper for a name of an entity, and its related
 * information.How to record: If there is more than one name,
 * repeat the appellation element.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class AppellationComplexType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: Appellations, e.g. titles, identifying phrases,
     * or names given to an item, but also name of a person or
     * corporation, also place name etc. 
     */
    private java.util.Vector<eu.dca.model.AppellationValue> _appellationValueList;

    /**
     * Definition: The source for the appellation, generally a
     * published source.
     */
    private java.util.Vector<eu.dca.model.SourceAppellation> _sourceAppellationList;


      //----------------/
     //- Constructors -/
    //----------------/

    public AppellationComplexType() {
        super();
        this._appellationValueList = new java.util.Vector<eu.dca.model.AppellationValue>();
        this._sourceAppellationList = new java.util.Vector<eu.dca.model.SourceAppellation>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vAppellationValue
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAppellationValue(
            final eu.dca.model.AppellationValue vAppellationValue)
    throws java.lang.IndexOutOfBoundsException {
        this._appellationValueList.addElement(vAppellationValue);
    }

    /**
     * 
     * 
     * @param index
     * @param vAppellationValue
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAppellationValue(
            final int index,
            final eu.dca.model.AppellationValue vAppellationValue)
    throws java.lang.IndexOutOfBoundsException {
        this._appellationValueList.add(index, vAppellationValue);
    }

    /**
     * 
     * 
     * @param vSourceAppellation
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSourceAppellation(
            final eu.dca.model.SourceAppellation vSourceAppellation)
    throws java.lang.IndexOutOfBoundsException {
        this._sourceAppellationList.addElement(vSourceAppellation);
    }

    /**
     * 
     * 
     * @param index
     * @param vSourceAppellation
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSourceAppellation(
            final int index,
            final eu.dca.model.SourceAppellation vSourceAppellation)
    throws java.lang.IndexOutOfBoundsException {
        this._sourceAppellationList.add(index, vSourceAppellation);
    }

    /**
     * Method enumerateAppellationValue.
     * 
     * @return an Enumeration over all
     * eu.dca.model.AppellationValue elements
     */
    public java.util.Enumeration<? extends eu.dca.model.AppellationValue> enumerateAppellationValue(
    ) {
        return this._appellationValueList.elements();
    }

    /**
     * Method enumerateSourceAppellation.
     * 
     * @return an Enumeration over all
     * eu.dca.model.SourceAppellation elements
     */
    public java.util.Enumeration<? extends eu.dca.model.SourceAppellation> enumerateSourceAppellation(
    ) {
        return this._sourceAppellationList.elements();
    }

    /**
     * Method getAppellationValue.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.AppellationValue at
     * the given index
     */
    public eu.dca.model.AppellationValue getAppellationValue(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._appellationValueList.size()) {
            throw new IndexOutOfBoundsException("getAppellationValue: Index value '" + index + "' not in range [0.." + (this._appellationValueList.size() - 1) + "]");
        }

        return (eu.dca.model.AppellationValue) _appellationValueList.get(index);
    }

    /**
     * Method getAppellationValue.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.AppellationValue[] getAppellationValue(
    ) {
        eu.dca.model.AppellationValue[] array = new eu.dca.model.AppellationValue[0];
        return (eu.dca.model.AppellationValue[]) this._appellationValueList.toArray(array);
    }

    /**
     * Method getAppellationValueCount.
     * 
     * @return the size of this collection
     */
    public int getAppellationValueCount(
    ) {
        return this._appellationValueList.size();
    }

    /**
     * Method getSourceAppellation.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.SourceAppellation at
     * the given index
     */
    public eu.dca.model.SourceAppellation getSourceAppellation(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._sourceAppellationList.size()) {
            throw new IndexOutOfBoundsException("getSourceAppellation: Index value '" + index + "' not in range [0.." + (this._sourceAppellationList.size() - 1) + "]");
        }

        return (eu.dca.model.SourceAppellation) _sourceAppellationList.get(index);
    }

    /**
     * Method getSourceAppellation.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.SourceAppellation[] getSourceAppellation(
    ) {
        eu.dca.model.SourceAppellation[] array = new eu.dca.model.SourceAppellation[0];
        return (eu.dca.model.SourceAppellation[]) this._sourceAppellationList.toArray(array);
    }

    /**
     * Method getSourceAppellationCount.
     * 
     * @return the size of this collection
     */
    public int getSourceAppellationCount(
    ) {
        return this._sourceAppellationList.size();
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
    public void removeAllAppellationValue(
    ) {
        this._appellationValueList.clear();
    }

    /**
     */
    public void removeAllSourceAppellation(
    ) {
        this._sourceAppellationList.clear();
    }

    /**
     * Method removeAppellationValue.
     * 
     * @param vAppellationValue
     * @return true if the object was removed from the collection.
     */
    public boolean removeAppellationValue(
            final eu.dca.model.AppellationValue vAppellationValue) {
        boolean removed = _appellationValueList.remove(vAppellationValue);
        return removed;
    }

    /**
     * Method removeAppellationValueAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.AppellationValue removeAppellationValueAt(
            final int index) {
        java.lang.Object obj = this._appellationValueList.remove(index);
        return (eu.dca.model.AppellationValue) obj;
    }

    /**
     * Method removeSourceAppellation.
     * 
     * @param vSourceAppellation
     * @return true if the object was removed from the collection.
     */
    public boolean removeSourceAppellation(
            final eu.dca.model.SourceAppellation vSourceAppellation) {
        boolean removed = _sourceAppellationList.remove(vSourceAppellation);
        return removed;
    }

    /**
     * Method removeSourceAppellationAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.SourceAppellation removeSourceAppellationAt(
            final int index) {
        java.lang.Object obj = this._sourceAppellationList.remove(index);
        return (eu.dca.model.SourceAppellation) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vAppellationValue
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAppellationValue(
            final int index,
            final eu.dca.model.AppellationValue vAppellationValue)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._appellationValueList.size()) {
            throw new IndexOutOfBoundsException("setAppellationValue: Index value '" + index + "' not in range [0.." + (this._appellationValueList.size() - 1) + "]");
        }

        this._appellationValueList.set(index, vAppellationValue);
    }

    /**
     * 
     * 
     * @param vAppellationValueArray
     */
    public void setAppellationValue(
            final eu.dca.model.AppellationValue[] vAppellationValueArray) {
        //-- copy array
        _appellationValueList.clear();

        for (int i = 0; i < vAppellationValueArray.length; i++) {
                this._appellationValueList.add(vAppellationValueArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vSourceAppellation
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSourceAppellation(
            final int index,
            final eu.dca.model.SourceAppellation vSourceAppellation)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._sourceAppellationList.size()) {
            throw new IndexOutOfBoundsException("setSourceAppellation: Index value '" + index + "' not in range [0.." + (this._sourceAppellationList.size() - 1) + "]");
        }

        this._sourceAppellationList.set(index, vSourceAppellation);
    }

    /**
     * 
     * 
     * @param vSourceAppellationArray
     */
    public void setSourceAppellation(
            final eu.dca.model.SourceAppellation[] vSourceAppellationArray) {
        //-- copy array
        _sourceAppellationList.clear();

        for (int i = 0; i < vSourceAppellationArray.length; i++) {
                this._sourceAppellationList.add(vSourceAppellationArray[i]);
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
