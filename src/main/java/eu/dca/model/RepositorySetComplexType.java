/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: Wrapper for designation and identification of the
 * institution of custody and, possibly, indication of the exact
 * location of the object. How to record: If there are several
 * designations known, e.g., a current one and former ones (see:
 * type attribute), repeat the element.Data values of the type
 * attribute: current, former.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class RepositorySetComplexType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: Qualifies the repository as a former or the
     * current repository. 
     */
    private java.lang.String _type;

    /**
     * Definition: Assigns a priority order for online presentation
     * of the element. 
     */
    private long _sortorder;

    /**
     * keeps track of state for field: _sortorder
     */
    private boolean _has_sortorder;

    /**
     * Definition: Unambiguous identification, designation and
     * weblink of the institution of custody.
     */
    private eu.dca.model.RepositoryName _repositoryName;

    /**
     * Definition: An unambiguous numeric or alphanumeric
     * identification number, assigned to the object by the
     * institution of custody.
     */
    private java.util.Vector<eu.dca.model.WorkID> _workIDList;

    /**
     * Definition: Location of the object, especially relevant for
     * architecture and archaeological sites. 
     */
    private eu.dca.model.RepositoryLocation _repositoryLocation;


      //----------------/
     //- Constructors -/
    //----------------/

    public RepositorySetComplexType() {
        super();
        this._workIDList = new java.util.Vector<eu.dca.model.WorkID>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vWorkID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addWorkID(
            final eu.dca.model.WorkID vWorkID)
    throws java.lang.IndexOutOfBoundsException {
        this._workIDList.addElement(vWorkID);
    }

    /**
     * 
     * 
     * @param index
     * @param vWorkID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addWorkID(
            final int index,
            final eu.dca.model.WorkID vWorkID)
    throws java.lang.IndexOutOfBoundsException {
        this._workIDList.add(index, vWorkID);
    }

    /**
     */
    public void deleteSortorder(
    ) {
        this._has_sortorder= false;
    }

    /**
     * Method enumerateWorkID.
     * 
     * @return an Enumeration over all eu.dca.model.WorkID elements
     */
    public java.util.Enumeration<? extends eu.dca.model.WorkID> enumerateWorkID(
    ) {
        return this._workIDList.elements();
    }

    /**
     * Returns the value of field 'repositoryLocation'. The field
     * 'repositoryLocation' has the following description:
     * Definition: Location of the object, especially relevant for
     * architecture and archaeological sites. 
     * 
     * @return the value of field 'RepositoryLocation'.
     */
    public eu.dca.model.RepositoryLocation getRepositoryLocation(
    ) {
        return this._repositoryLocation;
    }

    /**
     * Returns the value of field 'repositoryName'. The field
     * 'repositoryName' has the following description: Definition:
     * Unambiguous identification, designation and weblink of the
     * institution of custody.
     * 
     * @return the value of field 'RepositoryName'.
     */
    public eu.dca.model.RepositoryName getRepositoryName(
    ) {
        return this._repositoryName;
    }

    /**
     * Returns the value of field 'sortorder'. The field
     * 'sortorder' has the following description: Definition:
     * Assigns a priority order for online presentation of the
     * element. 
     * 
     * @return the value of field 'Sortorder'.
     */
    public long getSortorder(
    ) {
        return this._sortorder;
    }

    /**
     * Returns the value of field 'type'. The field 'type' has the
     * following description: Definition: Qualifies the repository
     * as a former or the current repository. 
     * 
     * @return the value of field 'Type'.
     */
    public java.lang.String getType(
    ) {
        return this._type;
    }

    /**
     * Method getWorkID.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.WorkID at the given
     * index
     */
    public eu.dca.model.WorkID getWorkID(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._workIDList.size()) {
            throw new IndexOutOfBoundsException("getWorkID: Index value '" + index + "' not in range [0.." + (this._workIDList.size() - 1) + "]");
        }

        return (eu.dca.model.WorkID) _workIDList.get(index);
    }

    /**
     * Method getWorkID.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.WorkID[] getWorkID(
    ) {
        eu.dca.model.WorkID[] array = new eu.dca.model.WorkID[0];
        return (eu.dca.model.WorkID[]) this._workIDList.toArray(array);
    }

    /**
     * Method getWorkIDCount.
     * 
     * @return the size of this collection
     */
    public int getWorkIDCount(
    ) {
        return this._workIDList.size();
    }

    /**
     * Method hasSortorder.
     * 
     * @return true if at least one Sortorder has been added
     */
    public boolean hasSortorder(
    ) {
        return this._has_sortorder;
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
    public void removeAllWorkID(
    ) {
        this._workIDList.clear();
    }

    /**
     * Method removeWorkID.
     * 
     * @param vWorkID
     * @return true if the object was removed from the collection.
     */
    public boolean removeWorkID(
            final eu.dca.model.WorkID vWorkID) {
        boolean removed = _workIDList.remove(vWorkID);
        return removed;
    }

    /**
     * Method removeWorkIDAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.WorkID removeWorkIDAt(
            final int index) {
        java.lang.Object obj = this._workIDList.remove(index);
        return (eu.dca.model.WorkID) obj;
    }

    /**
     * Sets the value of field 'repositoryLocation'. The field
     * 'repositoryLocation' has the following description:
     * Definition: Location of the object, especially relevant for
     * architecture and archaeological sites. 
     * 
     * @param repositoryLocation the value of field
     * 'repositoryLocation'.
     */
    public void setRepositoryLocation(
            final eu.dca.model.RepositoryLocation repositoryLocation) {
        this._repositoryLocation = repositoryLocation;
    }

    /**
     * Sets the value of field 'repositoryName'. The field
     * 'repositoryName' has the following description: Definition:
     * Unambiguous identification, designation and weblink of the
     * institution of custody.
     * 
     * @param repositoryName the value of field 'repositoryName'.
     */
    public void setRepositoryName(
            final eu.dca.model.RepositoryName repositoryName) {
        this._repositoryName = repositoryName;
    }

    /**
     * Sets the value of field 'sortorder'. The field 'sortorder'
     * has the following description: Definition: Assigns a
     * priority order for online presentation of the element. 
     * 
     * @param sortorder the value of field 'sortorder'.
     */
    public void setSortorder(
            final long sortorder) {
        this._sortorder = sortorder;
        this._has_sortorder = true;
    }

    /**
     * Sets the value of field 'type'. The field 'type' has the
     * following description: Definition: Qualifies the repository
     * as a former or the current repository. 
     * 
     * @param type the value of field 'type'.
     */
    public void setType(
            final java.lang.String type) {
        this._type = type;
    }

    /**
     * 
     * 
     * @param index
     * @param vWorkID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setWorkID(
            final int index,
            final eu.dca.model.WorkID vWorkID)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._workIDList.size()) {
            throw new IndexOutOfBoundsException("setWorkID: Index value '" + index + "' not in range [0.." + (this._workIDList.size() - 1) + "]");
        }

        this._workIDList.set(index, vWorkID);
    }

    /**
     * 
     * 
     * @param vWorkIDArray
     */
    public void setWorkID(
            final eu.dca.model.WorkID[] vWorkIDArray) {
        //-- copy array
        _workIDList.clear();

        for (int i = 0; i < vWorkIDArray.length; i++) {
                this._workIDList.add(vWorkIDArray[i]);
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
