/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: Materials and techniques for retrieval.How to
 * record: If multiple parts of the object / work require separate
 * materials and techniques, or if media and support are being
 * recorded separately, repeat the materialsTechSet element
 * qualifying the extent sub-element.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class MaterialsTechComplexType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: A concept to index materials and/or technique.
     */
    private java.util.Vector<eu.dca.model.TermMaterialsTech> _termMaterialsTechList;

    /**
     * Definition: An explanation of the part of the object / work
     * to which the corresponding materials or technique are
     * applicable; included when necessary for clarity.
     */
    private java.util.Vector<eu.dca.model.ExtentMaterialsTech> _extentMaterialsTechList;

    /**
     * Definition: The source of the information about materials
     * and technique, often used when citing a published source of
     * watermarks.
     */
    private java.util.Vector<eu.dca.model.SourceMaterialsTech> _sourceMaterialsTechList;


      //----------------/
     //- Constructors -/
    //----------------/

    public MaterialsTechComplexType() {
        super();
        this._termMaterialsTechList = new java.util.Vector<eu.dca.model.TermMaterialsTech>();
        this._extentMaterialsTechList = new java.util.Vector<eu.dca.model.ExtentMaterialsTech>();
        this._sourceMaterialsTechList = new java.util.Vector<eu.dca.model.SourceMaterialsTech>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vExtentMaterialsTech
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addExtentMaterialsTech(
            final eu.dca.model.ExtentMaterialsTech vExtentMaterialsTech)
    throws java.lang.IndexOutOfBoundsException {
        this._extentMaterialsTechList.addElement(vExtentMaterialsTech);
    }

    /**
     * 
     * 
     * @param index
     * @param vExtentMaterialsTech
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addExtentMaterialsTech(
            final int index,
            final eu.dca.model.ExtentMaterialsTech vExtentMaterialsTech)
    throws java.lang.IndexOutOfBoundsException {
        this._extentMaterialsTechList.add(index, vExtentMaterialsTech);
    }

    /**
     * 
     * 
     * @param vSourceMaterialsTech
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSourceMaterialsTech(
            final eu.dca.model.SourceMaterialsTech vSourceMaterialsTech)
    throws java.lang.IndexOutOfBoundsException {
        this._sourceMaterialsTechList.addElement(vSourceMaterialsTech);
    }

    /**
     * 
     * 
     * @param index
     * @param vSourceMaterialsTech
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSourceMaterialsTech(
            final int index,
            final eu.dca.model.SourceMaterialsTech vSourceMaterialsTech)
    throws java.lang.IndexOutOfBoundsException {
        this._sourceMaterialsTechList.add(index, vSourceMaterialsTech);
    }

    /**
     * 
     * 
     * @param vTermMaterialsTech
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTermMaterialsTech(
            final eu.dca.model.TermMaterialsTech vTermMaterialsTech)
    throws java.lang.IndexOutOfBoundsException {
        this._termMaterialsTechList.addElement(vTermMaterialsTech);
    }

    /**
     * 
     * 
     * @param index
     * @param vTermMaterialsTech
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTermMaterialsTech(
            final int index,
            final eu.dca.model.TermMaterialsTech vTermMaterialsTech)
    throws java.lang.IndexOutOfBoundsException {
        this._termMaterialsTechList.add(index, vTermMaterialsTech);
    }

    /**
     * Method enumerateExtentMaterialsTech.
     * 
     * @return an Enumeration over all
     * eu.dca.model.ExtentMaterialsTech elements
     */
    public java.util.Enumeration<? extends eu.dca.model.ExtentMaterialsTech> enumerateExtentMaterialsTech(
    ) {
        return this._extentMaterialsTechList.elements();
    }

    /**
     * Method enumerateSourceMaterialsTech.
     * 
     * @return an Enumeration over all
     * eu.dca.model.SourceMaterialsTech elements
     */
    public java.util.Enumeration<? extends eu.dca.model.SourceMaterialsTech> enumerateSourceMaterialsTech(
    ) {
        return this._sourceMaterialsTechList.elements();
    }

    /**
     * Method enumerateTermMaterialsTech.
     * 
     * @return an Enumeration over all
     * eu.dca.model.TermMaterialsTech elements
     */
    public java.util.Enumeration<? extends eu.dca.model.TermMaterialsTech> enumerateTermMaterialsTech(
    ) {
        return this._termMaterialsTechList.elements();
    }

    /**
     * Method getExtentMaterialsTech.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.ExtentMaterialsTech at
     * the given index
     */
    public eu.dca.model.ExtentMaterialsTech getExtentMaterialsTech(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._extentMaterialsTechList.size()) {
            throw new IndexOutOfBoundsException("getExtentMaterialsTech: Index value '" + index + "' not in range [0.." + (this._extentMaterialsTechList.size() - 1) + "]");
        }

        return (eu.dca.model.ExtentMaterialsTech) _extentMaterialsTechList.get(index);
    }

    /**
     * Method getExtentMaterialsTech.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.ExtentMaterialsTech[] getExtentMaterialsTech(
    ) {
        eu.dca.model.ExtentMaterialsTech[] array = new eu.dca.model.ExtentMaterialsTech[0];
        return (eu.dca.model.ExtentMaterialsTech[]) this._extentMaterialsTechList.toArray(array);
    }

    /**
     * Method getExtentMaterialsTechCount.
     * 
     * @return the size of this collection
     */
    public int getExtentMaterialsTechCount(
    ) {
        return this._extentMaterialsTechList.size();
    }

    /**
     * Method getSourceMaterialsTech.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.SourceMaterialsTech at
     * the given index
     */
    public eu.dca.model.SourceMaterialsTech getSourceMaterialsTech(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._sourceMaterialsTechList.size()) {
            throw new IndexOutOfBoundsException("getSourceMaterialsTech: Index value '" + index + "' not in range [0.." + (this._sourceMaterialsTechList.size() - 1) + "]");
        }

        return (eu.dca.model.SourceMaterialsTech) _sourceMaterialsTechList.get(index);
    }

    /**
     * Method getSourceMaterialsTech.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.SourceMaterialsTech[] getSourceMaterialsTech(
    ) {
        eu.dca.model.SourceMaterialsTech[] array = new eu.dca.model.SourceMaterialsTech[0];
        return (eu.dca.model.SourceMaterialsTech[]) this._sourceMaterialsTechList.toArray(array);
    }

    /**
     * Method getSourceMaterialsTechCount.
     * 
     * @return the size of this collection
     */
    public int getSourceMaterialsTechCount(
    ) {
        return this._sourceMaterialsTechList.size();
    }

    /**
     * Method getTermMaterialsTech.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.TermMaterialsTech at
     * the given index
     */
    public eu.dca.model.TermMaterialsTech getTermMaterialsTech(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._termMaterialsTechList.size()) {
            throw new IndexOutOfBoundsException("getTermMaterialsTech: Index value '" + index + "' not in range [0.." + (this._termMaterialsTechList.size() - 1) + "]");
        }

        return (eu.dca.model.TermMaterialsTech) _termMaterialsTechList.get(index);
    }

    /**
     * Method getTermMaterialsTech.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.TermMaterialsTech[] getTermMaterialsTech(
    ) {
        eu.dca.model.TermMaterialsTech[] array = new eu.dca.model.TermMaterialsTech[0];
        return (eu.dca.model.TermMaterialsTech[]) this._termMaterialsTechList.toArray(array);
    }

    /**
     * Method getTermMaterialsTechCount.
     * 
     * @return the size of this collection
     */
    public int getTermMaterialsTechCount(
    ) {
        return this._termMaterialsTechList.size();
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
    public void removeAllExtentMaterialsTech(
    ) {
        this._extentMaterialsTechList.clear();
    }

    /**
     */
    public void removeAllSourceMaterialsTech(
    ) {
        this._sourceMaterialsTechList.clear();
    }

    /**
     */
    public void removeAllTermMaterialsTech(
    ) {
        this._termMaterialsTechList.clear();
    }

    /**
     * Method removeExtentMaterialsTech.
     * 
     * @param vExtentMaterialsTech
     * @return true if the object was removed from the collection.
     */
    public boolean removeExtentMaterialsTech(
            final eu.dca.model.ExtentMaterialsTech vExtentMaterialsTech) {
        boolean removed = _extentMaterialsTechList.remove(vExtentMaterialsTech);
        return removed;
    }

    /**
     * Method removeExtentMaterialsTechAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.ExtentMaterialsTech removeExtentMaterialsTechAt(
            final int index) {
        java.lang.Object obj = this._extentMaterialsTechList.remove(index);
        return (eu.dca.model.ExtentMaterialsTech) obj;
    }

    /**
     * Method removeSourceMaterialsTech.
     * 
     * @param vSourceMaterialsTech
     * @return true if the object was removed from the collection.
     */
    public boolean removeSourceMaterialsTech(
            final eu.dca.model.SourceMaterialsTech vSourceMaterialsTech) {
        boolean removed = _sourceMaterialsTechList.remove(vSourceMaterialsTech);
        return removed;
    }

    /**
     * Method removeSourceMaterialsTechAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.SourceMaterialsTech removeSourceMaterialsTechAt(
            final int index) {
        java.lang.Object obj = this._sourceMaterialsTechList.remove(index);
        return (eu.dca.model.SourceMaterialsTech) obj;
    }

    /**
     * Method removeTermMaterialsTech.
     * 
     * @param vTermMaterialsTech
     * @return true if the object was removed from the collection.
     */
    public boolean removeTermMaterialsTech(
            final eu.dca.model.TermMaterialsTech vTermMaterialsTech) {
        boolean removed = _termMaterialsTechList.remove(vTermMaterialsTech);
        return removed;
    }

    /**
     * Method removeTermMaterialsTechAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.TermMaterialsTech removeTermMaterialsTechAt(
            final int index) {
        java.lang.Object obj = this._termMaterialsTechList.remove(index);
        return (eu.dca.model.TermMaterialsTech) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vExtentMaterialsTech
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setExtentMaterialsTech(
            final int index,
            final eu.dca.model.ExtentMaterialsTech vExtentMaterialsTech)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._extentMaterialsTechList.size()) {
            throw new IndexOutOfBoundsException("setExtentMaterialsTech: Index value '" + index + "' not in range [0.." + (this._extentMaterialsTechList.size() - 1) + "]");
        }

        this._extentMaterialsTechList.set(index, vExtentMaterialsTech);
    }

    /**
     * 
     * 
     * @param vExtentMaterialsTechArray
     */
    public void setExtentMaterialsTech(
            final eu.dca.model.ExtentMaterialsTech[] vExtentMaterialsTechArray) {
        //-- copy array
        _extentMaterialsTechList.clear();

        for (int i = 0; i < vExtentMaterialsTechArray.length; i++) {
                this._extentMaterialsTechList.add(vExtentMaterialsTechArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vSourceMaterialsTech
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSourceMaterialsTech(
            final int index,
            final eu.dca.model.SourceMaterialsTech vSourceMaterialsTech)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._sourceMaterialsTechList.size()) {
            throw new IndexOutOfBoundsException("setSourceMaterialsTech: Index value '" + index + "' not in range [0.." + (this._sourceMaterialsTechList.size() - 1) + "]");
        }

        this._sourceMaterialsTechList.set(index, vSourceMaterialsTech);
    }

    /**
     * 
     * 
     * @param vSourceMaterialsTechArray
     */
    public void setSourceMaterialsTech(
            final eu.dca.model.SourceMaterialsTech[] vSourceMaterialsTechArray) {
        //-- copy array
        _sourceMaterialsTechList.clear();

        for (int i = 0; i < vSourceMaterialsTechArray.length; i++) {
                this._sourceMaterialsTechList.add(vSourceMaterialsTechArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vTermMaterialsTech
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setTermMaterialsTech(
            final int index,
            final eu.dca.model.TermMaterialsTech vTermMaterialsTech)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._termMaterialsTechList.size()) {
            throw new IndexOutOfBoundsException("setTermMaterialsTech: Index value '" + index + "' not in range [0.." + (this._termMaterialsTechList.size() - 1) + "]");
        }

        this._termMaterialsTechList.set(index, vTermMaterialsTech);
    }

    /**
     * 
     * 
     * @param vTermMaterialsTechArray
     */
    public void setTermMaterialsTech(
            final eu.dca.model.TermMaterialsTech[] vTermMaterialsTechArray) {
        //-- copy array
        _termMaterialsTechList.clear();

        for (int i = 0; i < vTermMaterialsTechArray.length; i++) {
                this._termMaterialsTechList.add(vTermMaterialsTechArray[i]);
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
