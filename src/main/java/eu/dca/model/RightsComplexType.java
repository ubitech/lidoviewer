/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: Information about rights management; may include
 * copyright and other intellectual property statements.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class RightsComplexType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: The specific type of right being recorded. 
     */
    private java.util.Vector<eu.dca.model.RightsType> _rightsTypeList;

    /**
     * Definition: The date on which a right is or was current.
     */
    private eu.dca.model.RightsDate _rightsDate;

    /**
     * Definition: The holder of the right.
     */
    private java.util.Vector<eu.dca.model.RightsHolder> _rightsHolderList;

    /**
     * Definition: Acknowledgement of the rights associated with
     * the physical and/or digital object as requested.
     */
    private java.util.Vector<eu.dca.model.CreditLine> _creditLineList;


      //----------------/
     //- Constructors -/
    //----------------/

    public RightsComplexType() {
        super();
        this._rightsTypeList = new java.util.Vector<eu.dca.model.RightsType>();
        this._rightsHolderList = new java.util.Vector<eu.dca.model.RightsHolder>();
        this._creditLineList = new java.util.Vector<eu.dca.model.CreditLine>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vCreditLine
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCreditLine(
            final eu.dca.model.CreditLine vCreditLine)
    throws java.lang.IndexOutOfBoundsException {
        this._creditLineList.addElement(vCreditLine);
    }

    /**
     * 
     * 
     * @param index
     * @param vCreditLine
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCreditLine(
            final int index,
            final eu.dca.model.CreditLine vCreditLine)
    throws java.lang.IndexOutOfBoundsException {
        this._creditLineList.add(index, vCreditLine);
    }

    /**
     * 
     * 
     * @param vRightsHolder
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRightsHolder(
            final eu.dca.model.RightsHolder vRightsHolder)
    throws java.lang.IndexOutOfBoundsException {
        this._rightsHolderList.addElement(vRightsHolder);
    }

    /**
     * 
     * 
     * @param index
     * @param vRightsHolder
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRightsHolder(
            final int index,
            final eu.dca.model.RightsHolder vRightsHolder)
    throws java.lang.IndexOutOfBoundsException {
        this._rightsHolderList.add(index, vRightsHolder);
    }

    /**
     * 
     * 
     * @param vRightsType
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRightsType(
            final eu.dca.model.RightsType vRightsType)
    throws java.lang.IndexOutOfBoundsException {
        this._rightsTypeList.addElement(vRightsType);
    }

    /**
     * 
     * 
     * @param index
     * @param vRightsType
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRightsType(
            final int index,
            final eu.dca.model.RightsType vRightsType)
    throws java.lang.IndexOutOfBoundsException {
        this._rightsTypeList.add(index, vRightsType);
    }

    /**
     * Method enumerateCreditLine.
     * 
     * @return an Enumeration over all eu.dca.model.CreditLine
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.CreditLine> enumerateCreditLine(
    ) {
        return this._creditLineList.elements();
    }

    /**
     * Method enumerateRightsHolder.
     * 
     * @return an Enumeration over all eu.dca.model.RightsHolder
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.RightsHolder> enumerateRightsHolder(
    ) {
        return this._rightsHolderList.elements();
    }

    /**
     * Method enumerateRightsType.
     * 
     * @return an Enumeration over all eu.dca.model.RightsType
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.RightsType> enumerateRightsType(
    ) {
        return this._rightsTypeList.elements();
    }

    /**
     * Method getCreditLine.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.CreditLine at the
     * given index
     */
    public eu.dca.model.CreditLine getCreditLine(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._creditLineList.size()) {
            throw new IndexOutOfBoundsException("getCreditLine: Index value '" + index + "' not in range [0.." + (this._creditLineList.size() - 1) + "]");
        }

        return (eu.dca.model.CreditLine) _creditLineList.get(index);
    }

    /**
     * Method getCreditLine.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.CreditLine[] getCreditLine(
    ) {
        eu.dca.model.CreditLine[] array = new eu.dca.model.CreditLine[0];
        return (eu.dca.model.CreditLine[]) this._creditLineList.toArray(array);
    }

    /**
     * Method getCreditLineCount.
     * 
     * @return the size of this collection
     */
    public int getCreditLineCount(
    ) {
        return this._creditLineList.size();
    }

    /**
     * Returns the value of field 'rightsDate'. The field
     * 'rightsDate' has the following description: Definition: The
     * date on which a right is or was current.
     * 
     * @return the value of field 'RightsDate'.
     */
    public eu.dca.model.RightsDate getRightsDate(
    ) {
        return this._rightsDate;
    }

    /**
     * Method getRightsHolder.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.RightsHolder at the
     * given index
     */
    public eu.dca.model.RightsHolder getRightsHolder(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._rightsHolderList.size()) {
            throw new IndexOutOfBoundsException("getRightsHolder: Index value '" + index + "' not in range [0.." + (this._rightsHolderList.size() - 1) + "]");
        }

        return (eu.dca.model.RightsHolder) _rightsHolderList.get(index);
    }

    /**
     * Method getRightsHolder.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.RightsHolder[] getRightsHolder(
    ) {
        eu.dca.model.RightsHolder[] array = new eu.dca.model.RightsHolder[0];
        return (eu.dca.model.RightsHolder[]) this._rightsHolderList.toArray(array);
    }

    /**
     * Method getRightsHolderCount.
     * 
     * @return the size of this collection
     */
    public int getRightsHolderCount(
    ) {
        return this._rightsHolderList.size();
    }

    /**
     * Method getRightsType.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.RightsType at the
     * given index
     */
    public eu.dca.model.RightsType getRightsType(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._rightsTypeList.size()) {
            throw new IndexOutOfBoundsException("getRightsType: Index value '" + index + "' not in range [0.." + (this._rightsTypeList.size() - 1) + "]");
        }

        return (eu.dca.model.RightsType) _rightsTypeList.get(index);
    }

    /**
     * Method getRightsType.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.RightsType[] getRightsType(
    ) {
        eu.dca.model.RightsType[] array = new eu.dca.model.RightsType[0];
        return (eu.dca.model.RightsType[]) this._rightsTypeList.toArray(array);
    }

    /**
     * Method getRightsTypeCount.
     * 
     * @return the size of this collection
     */
    public int getRightsTypeCount(
    ) {
        return this._rightsTypeList.size();
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
    public void removeAllCreditLine(
    ) {
        this._creditLineList.clear();
    }

    /**
     */
    public void removeAllRightsHolder(
    ) {
        this._rightsHolderList.clear();
    }

    /**
     */
    public void removeAllRightsType(
    ) {
        this._rightsTypeList.clear();
    }

    /**
     * Method removeCreditLine.
     * 
     * @param vCreditLine
     * @return true if the object was removed from the collection.
     */
    public boolean removeCreditLine(
            final eu.dca.model.CreditLine vCreditLine) {
        boolean removed = _creditLineList.remove(vCreditLine);
        return removed;
    }

    /**
     * Method removeCreditLineAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.CreditLine removeCreditLineAt(
            final int index) {
        java.lang.Object obj = this._creditLineList.remove(index);
        return (eu.dca.model.CreditLine) obj;
    }

    /**
     * Method removeRightsHolder.
     * 
     * @param vRightsHolder
     * @return true if the object was removed from the collection.
     */
    public boolean removeRightsHolder(
            final eu.dca.model.RightsHolder vRightsHolder) {
        boolean removed = _rightsHolderList.remove(vRightsHolder);
        return removed;
    }

    /**
     * Method removeRightsHolderAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.RightsHolder removeRightsHolderAt(
            final int index) {
        java.lang.Object obj = this._rightsHolderList.remove(index);
        return (eu.dca.model.RightsHolder) obj;
    }

    /**
     * Method removeRightsType.
     * 
     * @param vRightsType
     * @return true if the object was removed from the collection.
     */
    public boolean removeRightsType(
            final eu.dca.model.RightsType vRightsType) {
        boolean removed = _rightsTypeList.remove(vRightsType);
        return removed;
    }

    /**
     * Method removeRightsTypeAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.RightsType removeRightsTypeAt(
            final int index) {
        java.lang.Object obj = this._rightsTypeList.remove(index);
        return (eu.dca.model.RightsType) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vCreditLine
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setCreditLine(
            final int index,
            final eu.dca.model.CreditLine vCreditLine)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._creditLineList.size()) {
            throw new IndexOutOfBoundsException("setCreditLine: Index value '" + index + "' not in range [0.." + (this._creditLineList.size() - 1) + "]");
        }

        this._creditLineList.set(index, vCreditLine);
    }

    /**
     * 
     * 
     * @param vCreditLineArray
     */
    public void setCreditLine(
            final eu.dca.model.CreditLine[] vCreditLineArray) {
        //-- copy array
        _creditLineList.clear();

        for (int i = 0; i < vCreditLineArray.length; i++) {
                this._creditLineList.add(vCreditLineArray[i]);
        }
    }

    /**
     * Sets the value of field 'rightsDate'. The field 'rightsDate'
     * has the following description: Definition: The date on which
     * a right is or was current.
     * 
     * @param rightsDate the value of field 'rightsDate'.
     */
    public void setRightsDate(
            final eu.dca.model.RightsDate rightsDate) {
        this._rightsDate = rightsDate;
    }

    /**
     * 
     * 
     * @param index
     * @param vRightsHolder
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setRightsHolder(
            final int index,
            final eu.dca.model.RightsHolder vRightsHolder)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._rightsHolderList.size()) {
            throw new IndexOutOfBoundsException("setRightsHolder: Index value '" + index + "' not in range [0.." + (this._rightsHolderList.size() - 1) + "]");
        }

        this._rightsHolderList.set(index, vRightsHolder);
    }

    /**
     * 
     * 
     * @param vRightsHolderArray
     */
    public void setRightsHolder(
            final eu.dca.model.RightsHolder[] vRightsHolderArray) {
        //-- copy array
        _rightsHolderList.clear();

        for (int i = 0; i < vRightsHolderArray.length; i++) {
                this._rightsHolderList.add(vRightsHolderArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vRightsType
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setRightsType(
            final int index,
            final eu.dca.model.RightsType vRightsType)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._rightsTypeList.size()) {
            throw new IndexOutOfBoundsException("setRightsType: Index value '" + index + "' not in range [0.." + (this._rightsTypeList.size() - 1) + "]");
        }

        this._rightsTypeList.set(index, vRightsType);
    }

    /**
     * 
     * 
     * @param vRightsTypeArray
     */
    public void setRightsType(
            final eu.dca.model.RightsType[] vRightsTypeArray) {
        //-- copy array
        _rightsTypeList.clear();

        for (int i = 0; i < vRightsTypeArray.length; i++) {
                this._rightsTypeList.add(vRightsTypeArray[i]);
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
