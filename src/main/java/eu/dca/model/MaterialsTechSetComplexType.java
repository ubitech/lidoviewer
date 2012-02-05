/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: Wrapper for display and index elements for materials
 * and technique information.Notes: Indicates the substances or
 * materials used, as well as any implements, production or
 * manufacturing techniques, processes, or methods incorporated.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class MaterialsTechSetComplexType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: Display element for materials/technique,
     * corresponding to the following materialsTech element.
     */
    private java.util.Vector<eu.dca.model.DisplayMaterialsTech> _displayMaterialsTechList;

    /**
     * Definition: Materials and techniques data used for indexing.
     */
    private eu.dca.model.MaterialsTech _materialsTech;


      //----------------/
     //- Constructors -/
    //----------------/

    public MaterialsTechSetComplexType() {
        super();
        this._displayMaterialsTechList = new java.util.Vector<eu.dca.model.DisplayMaterialsTech>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vDisplayMaterialsTech
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDisplayMaterialsTech(
            final eu.dca.model.DisplayMaterialsTech vDisplayMaterialsTech)
    throws java.lang.IndexOutOfBoundsException {
        this._displayMaterialsTechList.addElement(vDisplayMaterialsTech);
    }

    /**
     * 
     * 
     * @param index
     * @param vDisplayMaterialsTech
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDisplayMaterialsTech(
            final int index,
            final eu.dca.model.DisplayMaterialsTech vDisplayMaterialsTech)
    throws java.lang.IndexOutOfBoundsException {
        this._displayMaterialsTechList.add(index, vDisplayMaterialsTech);
    }

    /**
     * Method enumerateDisplayMaterialsTech.
     * 
     * @return an Enumeration over all
     * eu.dca.model.DisplayMaterialsTech elements
     */
    public java.util.Enumeration<? extends eu.dca.model.DisplayMaterialsTech> enumerateDisplayMaterialsTech(
    ) {
        return this._displayMaterialsTechList.elements();
    }

    /**
     * Method getDisplayMaterialsTech.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.DisplayMaterialsTech
     * at the given index
     */
    public eu.dca.model.DisplayMaterialsTech getDisplayMaterialsTech(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._displayMaterialsTechList.size()) {
            throw new IndexOutOfBoundsException("getDisplayMaterialsTech: Index value '" + index + "' not in range [0.." + (this._displayMaterialsTechList.size() - 1) + "]");
        }

        return (eu.dca.model.DisplayMaterialsTech) _displayMaterialsTechList.get(index);
    }

    /**
     * Method getDisplayMaterialsTech.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.DisplayMaterialsTech[] getDisplayMaterialsTech(
    ) {
        eu.dca.model.DisplayMaterialsTech[] array = new eu.dca.model.DisplayMaterialsTech[0];
        return (eu.dca.model.DisplayMaterialsTech[]) this._displayMaterialsTechList.toArray(array);
    }

    /**
     * Method getDisplayMaterialsTechCount.
     * 
     * @return the size of this collection
     */
    public int getDisplayMaterialsTechCount(
    ) {
        return this._displayMaterialsTechList.size();
    }

    /**
     * Returns the value of field 'materialsTech'. The field
     * 'materialsTech' has the following description: Definition:
     * Materials and techniques data used for indexing.
     * 
     * @return the value of field 'MaterialsTech'.
     */
    public eu.dca.model.MaterialsTech getMaterialsTech(
    ) {
        return this._materialsTech;
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
    public void removeAllDisplayMaterialsTech(
    ) {
        this._displayMaterialsTechList.clear();
    }

    /**
     * Method removeDisplayMaterialsTech.
     * 
     * @param vDisplayMaterialsTech
     * @return true if the object was removed from the collection.
     */
    public boolean removeDisplayMaterialsTech(
            final eu.dca.model.DisplayMaterialsTech vDisplayMaterialsTech) {
        boolean removed = _displayMaterialsTechList.remove(vDisplayMaterialsTech);
        return removed;
    }

    /**
     * Method removeDisplayMaterialsTechAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.DisplayMaterialsTech removeDisplayMaterialsTechAt(
            final int index) {
        java.lang.Object obj = this._displayMaterialsTechList.remove(index);
        return (eu.dca.model.DisplayMaterialsTech) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vDisplayMaterialsTech
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setDisplayMaterialsTech(
            final int index,
            final eu.dca.model.DisplayMaterialsTech vDisplayMaterialsTech)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._displayMaterialsTechList.size()) {
            throw new IndexOutOfBoundsException("setDisplayMaterialsTech: Index value '" + index + "' not in range [0.." + (this._displayMaterialsTechList.size() - 1) + "]");
        }

        this._displayMaterialsTechList.set(index, vDisplayMaterialsTech);
    }

    /**
     * 
     * 
     * @param vDisplayMaterialsTechArray
     */
    public void setDisplayMaterialsTech(
            final eu.dca.model.DisplayMaterialsTech[] vDisplayMaterialsTechArray) {
        //-- copy array
        _displayMaterialsTechList.clear();

        for (int i = 0; i < vDisplayMaterialsTechArray.length; i++) {
                this._displayMaterialsTechList.add(vDisplayMaterialsTechArray[i]);
        }
    }

    /**
     * Sets the value of field 'materialsTech'. The field
     * 'materialsTech' has the following description: Definition:
     * Materials and techniques data used for indexing.
     * 
     * @param materialsTech the value of field 'materialsTech'.
     */
    public void setMaterialsTech(
            final eu.dca.model.MaterialsTech materialsTech) {
        this._materialsTech = materialsTech;
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
