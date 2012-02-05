/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: Reference information to a legal body.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class LegalBodyRefComplexType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: Unambiguous identification of the institution or
     * person referred to as legal body.
     */
    private java.util.Vector<eu.dca.model.LegalBodyID> _legalBodyIDList;

    /**
     * Definition: Appellation of the institution or person.
     */
    private java.util.Vector<eu.dca.model.LegalBodyName> _legalBodyNameList;

    /**
     * Definition: Weblink of the institution or person referred to
     * as legal body. 
     */
    private java.util.Vector<eu.dca.model.LegalBodyWeblink> _legalBodyWeblinkList;


      //----------------/
     //- Constructors -/
    //----------------/

    public LegalBodyRefComplexType() {
        super();
        this._legalBodyIDList = new java.util.Vector<eu.dca.model.LegalBodyID>();
        this._legalBodyNameList = new java.util.Vector<eu.dca.model.LegalBodyName>();
        this._legalBodyWeblinkList = new java.util.Vector<eu.dca.model.LegalBodyWeblink>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vLegalBodyID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addLegalBodyID(
            final eu.dca.model.LegalBodyID vLegalBodyID)
    throws java.lang.IndexOutOfBoundsException {
        this._legalBodyIDList.addElement(vLegalBodyID);
    }

    /**
     * 
     * 
     * @param index
     * @param vLegalBodyID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addLegalBodyID(
            final int index,
            final eu.dca.model.LegalBodyID vLegalBodyID)
    throws java.lang.IndexOutOfBoundsException {
        this._legalBodyIDList.add(index, vLegalBodyID);
    }

    /**
     * 
     * 
     * @param vLegalBodyName
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addLegalBodyName(
            final eu.dca.model.LegalBodyName vLegalBodyName)
    throws java.lang.IndexOutOfBoundsException {
        this._legalBodyNameList.addElement(vLegalBodyName);
    }

    /**
     * 
     * 
     * @param index
     * @param vLegalBodyName
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addLegalBodyName(
            final int index,
            final eu.dca.model.LegalBodyName vLegalBodyName)
    throws java.lang.IndexOutOfBoundsException {
        this._legalBodyNameList.add(index, vLegalBodyName);
    }

    /**
     * 
     * 
     * @param vLegalBodyWeblink
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addLegalBodyWeblink(
            final eu.dca.model.LegalBodyWeblink vLegalBodyWeblink)
    throws java.lang.IndexOutOfBoundsException {
        this._legalBodyWeblinkList.addElement(vLegalBodyWeblink);
    }

    /**
     * 
     * 
     * @param index
     * @param vLegalBodyWeblink
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addLegalBodyWeblink(
            final int index,
            final eu.dca.model.LegalBodyWeblink vLegalBodyWeblink)
    throws java.lang.IndexOutOfBoundsException {
        this._legalBodyWeblinkList.add(index, vLegalBodyWeblink);
    }

    /**
     * Method enumerateLegalBodyID.
     * 
     * @return an Enumeration over all eu.dca.model.LegalBodyID
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.LegalBodyID> enumerateLegalBodyID(
    ) {
        return this._legalBodyIDList.elements();
    }

    /**
     * Method enumerateLegalBodyName.
     * 
     * @return an Enumeration over all eu.dca.model.LegalBodyName
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.LegalBodyName> enumerateLegalBodyName(
    ) {
        return this._legalBodyNameList.elements();
    }

    /**
     * Method enumerateLegalBodyWeblink.
     * 
     * @return an Enumeration over all
     * eu.dca.model.LegalBodyWeblink elements
     */
    public java.util.Enumeration<? extends eu.dca.model.LegalBodyWeblink> enumerateLegalBodyWeblink(
    ) {
        return this._legalBodyWeblinkList.elements();
    }

    /**
     * Method getLegalBodyID.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.LegalBodyID at the
     * given index
     */
    public eu.dca.model.LegalBodyID getLegalBodyID(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._legalBodyIDList.size()) {
            throw new IndexOutOfBoundsException("getLegalBodyID: Index value '" + index + "' not in range [0.." + (this._legalBodyIDList.size() - 1) + "]");
        }

        return (eu.dca.model.LegalBodyID) _legalBodyIDList.get(index);
    }

    /**
     * Method getLegalBodyID.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.LegalBodyID[] getLegalBodyID(
    ) {
        eu.dca.model.LegalBodyID[] array = new eu.dca.model.LegalBodyID[0];
        return (eu.dca.model.LegalBodyID[]) this._legalBodyIDList.toArray(array);
    }

    /**
     * Method getLegalBodyIDCount.
     * 
     * @return the size of this collection
     */
    public int getLegalBodyIDCount(
    ) {
        return this._legalBodyIDList.size();
    }

    /**
     * Method getLegalBodyName.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.LegalBodyName at the
     * given index
     */
    public eu.dca.model.LegalBodyName getLegalBodyName(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._legalBodyNameList.size()) {
            throw new IndexOutOfBoundsException("getLegalBodyName: Index value '" + index + "' not in range [0.." + (this._legalBodyNameList.size() - 1) + "]");
        }

        return (eu.dca.model.LegalBodyName) _legalBodyNameList.get(index);
    }

    /**
     * Method getLegalBodyName.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.LegalBodyName[] getLegalBodyName(
    ) {
        eu.dca.model.LegalBodyName[] array = new eu.dca.model.LegalBodyName[0];
        return (eu.dca.model.LegalBodyName[]) this._legalBodyNameList.toArray(array);
    }

    /**
     * Method getLegalBodyNameCount.
     * 
     * @return the size of this collection
     */
    public int getLegalBodyNameCount(
    ) {
        return this._legalBodyNameList.size();
    }

    /**
     * Method getLegalBodyWeblink.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.LegalBodyWeblink at
     * the given index
     */
    public eu.dca.model.LegalBodyWeblink getLegalBodyWeblink(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._legalBodyWeblinkList.size()) {
            throw new IndexOutOfBoundsException("getLegalBodyWeblink: Index value '" + index + "' not in range [0.." + (this._legalBodyWeblinkList.size() - 1) + "]");
        }

        return (eu.dca.model.LegalBodyWeblink) _legalBodyWeblinkList.get(index);
    }

    /**
     * Method getLegalBodyWeblink.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.LegalBodyWeblink[] getLegalBodyWeblink(
    ) {
        eu.dca.model.LegalBodyWeblink[] array = new eu.dca.model.LegalBodyWeblink[0];
        return (eu.dca.model.LegalBodyWeblink[]) this._legalBodyWeblinkList.toArray(array);
    }

    /**
     * Method getLegalBodyWeblinkCount.
     * 
     * @return the size of this collection
     */
    public int getLegalBodyWeblinkCount(
    ) {
        return this._legalBodyWeblinkList.size();
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
    public void removeAllLegalBodyID(
    ) {
        this._legalBodyIDList.clear();
    }

    /**
     */
    public void removeAllLegalBodyName(
    ) {
        this._legalBodyNameList.clear();
    }

    /**
     */
    public void removeAllLegalBodyWeblink(
    ) {
        this._legalBodyWeblinkList.clear();
    }

    /**
     * Method removeLegalBodyID.
     * 
     * @param vLegalBodyID
     * @return true if the object was removed from the collection.
     */
    public boolean removeLegalBodyID(
            final eu.dca.model.LegalBodyID vLegalBodyID) {
        boolean removed = _legalBodyIDList.remove(vLegalBodyID);
        return removed;
    }

    /**
     * Method removeLegalBodyIDAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.LegalBodyID removeLegalBodyIDAt(
            final int index) {
        java.lang.Object obj = this._legalBodyIDList.remove(index);
        return (eu.dca.model.LegalBodyID) obj;
    }

    /**
     * Method removeLegalBodyName.
     * 
     * @param vLegalBodyName
     * @return true if the object was removed from the collection.
     */
    public boolean removeLegalBodyName(
            final eu.dca.model.LegalBodyName vLegalBodyName) {
        boolean removed = _legalBodyNameList.remove(vLegalBodyName);
        return removed;
    }

    /**
     * Method removeLegalBodyNameAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.LegalBodyName removeLegalBodyNameAt(
            final int index) {
        java.lang.Object obj = this._legalBodyNameList.remove(index);
        return (eu.dca.model.LegalBodyName) obj;
    }

    /**
     * Method removeLegalBodyWeblink.
     * 
     * @param vLegalBodyWeblink
     * @return true if the object was removed from the collection.
     */
    public boolean removeLegalBodyWeblink(
            final eu.dca.model.LegalBodyWeblink vLegalBodyWeblink) {
        boolean removed = _legalBodyWeblinkList.remove(vLegalBodyWeblink);
        return removed;
    }

    /**
     * Method removeLegalBodyWeblinkAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.LegalBodyWeblink removeLegalBodyWeblinkAt(
            final int index) {
        java.lang.Object obj = this._legalBodyWeblinkList.remove(index);
        return (eu.dca.model.LegalBodyWeblink) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vLegalBodyID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setLegalBodyID(
            final int index,
            final eu.dca.model.LegalBodyID vLegalBodyID)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._legalBodyIDList.size()) {
            throw new IndexOutOfBoundsException("setLegalBodyID: Index value '" + index + "' not in range [0.." + (this._legalBodyIDList.size() - 1) + "]");
        }

        this._legalBodyIDList.set(index, vLegalBodyID);
    }

    /**
     * 
     * 
     * @param vLegalBodyIDArray
     */
    public void setLegalBodyID(
            final eu.dca.model.LegalBodyID[] vLegalBodyIDArray) {
        //-- copy array
        _legalBodyIDList.clear();

        for (int i = 0; i < vLegalBodyIDArray.length; i++) {
                this._legalBodyIDList.add(vLegalBodyIDArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vLegalBodyName
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setLegalBodyName(
            final int index,
            final eu.dca.model.LegalBodyName vLegalBodyName)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._legalBodyNameList.size()) {
            throw new IndexOutOfBoundsException("setLegalBodyName: Index value '" + index + "' not in range [0.." + (this._legalBodyNameList.size() - 1) + "]");
        }

        this._legalBodyNameList.set(index, vLegalBodyName);
    }

    /**
     * 
     * 
     * @param vLegalBodyNameArray
     */
    public void setLegalBodyName(
            final eu.dca.model.LegalBodyName[] vLegalBodyNameArray) {
        //-- copy array
        _legalBodyNameList.clear();

        for (int i = 0; i < vLegalBodyNameArray.length; i++) {
                this._legalBodyNameList.add(vLegalBodyNameArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vLegalBodyWeblink
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setLegalBodyWeblink(
            final int index,
            final eu.dca.model.LegalBodyWeblink vLegalBodyWeblink)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._legalBodyWeblinkList.size()) {
            throw new IndexOutOfBoundsException("setLegalBodyWeblink: Index value '" + index + "' not in range [0.." + (this._legalBodyWeblinkList.size() - 1) + "]");
        }

        this._legalBodyWeblinkList.set(index, vLegalBodyWeblink);
    }

    /**
     * 
     * 
     * @param vLegalBodyWeblinkArray
     */
    public void setLegalBodyWeblink(
            final eu.dca.model.LegalBodyWeblink[] vLegalBodyWeblinkArray) {
        //-- copy array
        _legalBodyWeblinkList.clear();

        for (int i = 0; i < vLegalBodyWeblinkArray.length; i++) {
                this._legalBodyWeblinkList.add(vLegalBodyWeblinkArray[i]);
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
