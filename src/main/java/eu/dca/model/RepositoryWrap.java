/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: Wrapper for Repository/ Location information.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class RepositoryWrap implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: Wrapper for designation and identification of
     * the institution of custody, and possibly an indication of
     * the exact location of the object.
     */
    private java.util.Vector<eu.dca.model.RepositorySet> _repositorySetList;


      //----------------/
     //- Constructors -/
    //----------------/

    public RepositoryWrap() {
        super();
        this._repositorySetList = new java.util.Vector<eu.dca.model.RepositorySet>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vRepositorySet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRepositorySet(
            final eu.dca.model.RepositorySet vRepositorySet)
    throws java.lang.IndexOutOfBoundsException {
        this._repositorySetList.addElement(vRepositorySet);
    }

    /**
     * 
     * 
     * @param index
     * @param vRepositorySet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRepositorySet(
            final int index,
            final eu.dca.model.RepositorySet vRepositorySet)
    throws java.lang.IndexOutOfBoundsException {
        this._repositorySetList.add(index, vRepositorySet);
    }

    /**
     * Method enumerateRepositorySet.
     * 
     * @return an Enumeration over all eu.dca.model.RepositorySet
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.RepositorySet> enumerateRepositorySet(
    ) {
        return this._repositorySetList.elements();
    }

    /**
     * Method getRepositorySet.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.RepositorySet at the
     * given index
     */
    public eu.dca.model.RepositorySet getRepositorySet(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._repositorySetList.size()) {
            throw new IndexOutOfBoundsException("getRepositorySet: Index value '" + index + "' not in range [0.." + (this._repositorySetList.size() - 1) + "]");
        }

        return (eu.dca.model.RepositorySet) _repositorySetList.get(index);
    }

    /**
     * Method getRepositorySet.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.RepositorySet[] getRepositorySet(
    ) {
        eu.dca.model.RepositorySet[] array = new eu.dca.model.RepositorySet[0];
        return (eu.dca.model.RepositorySet[]) this._repositorySetList.toArray(array);
    }

    /**
     * Method getRepositorySetCount.
     * 
     * @return the size of this collection
     */
    public int getRepositorySetCount(
    ) {
        return this._repositorySetList.size();
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
    public void removeAllRepositorySet(
    ) {
        this._repositorySetList.clear();
    }

    /**
     * Method removeRepositorySet.
     * 
     * @param vRepositorySet
     * @return true if the object was removed from the collection.
     */
    public boolean removeRepositorySet(
            final eu.dca.model.RepositorySet vRepositorySet) {
        boolean removed = _repositorySetList.remove(vRepositorySet);
        return removed;
    }

    /**
     * Method removeRepositorySetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.RepositorySet removeRepositorySetAt(
            final int index) {
        java.lang.Object obj = this._repositorySetList.remove(index);
        return (eu.dca.model.RepositorySet) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vRepositorySet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setRepositorySet(
            final int index,
            final eu.dca.model.RepositorySet vRepositorySet)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._repositorySetList.size()) {
            throw new IndexOutOfBoundsException("setRepositorySet: Index value '" + index + "' not in range [0.." + (this._repositorySetList.size() - 1) + "]");
        }

        this._repositorySetList.set(index, vRepositorySet);
    }

    /**
     * 
     * 
     * @param vRepositorySetArray
     */
    public void setRepositorySet(
            final eu.dca.model.RepositorySet[] vRepositorySetArray) {
        //-- copy array
        _repositorySetList.clear();

        for (int i = 0; i < vRepositorySetArray.length; i++) {
                this._repositorySetList.add(vRepositorySetArray[i]);
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
     * @return the unmarshaled eu.dca.model.RepositoryWrap
     */
    public static eu.dca.model.RepositoryWrap unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (eu.dca.model.RepositoryWrap) org.exolab.castor.xml.Unmarshaller.unmarshal(eu.dca.model.RepositoryWrap.class, reader);
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
