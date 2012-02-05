/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: Wrapper for rights information about the object /
 * work described.Notes: Rights information for the record and for
 * resources is recorded in the respective rights elements
 * recordRights and rightsResource. 
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class RightsWorkWrap implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: Information about rights management; may include
     * copyright and other intellectual property statements about
     * the object / work.
     */
    private java.util.Vector<eu.dca.model.RightsWorkSet> _rightsWorkSetList;


      //----------------/
     //- Constructors -/
    //----------------/

    public RightsWorkWrap() {
        super();
        this._rightsWorkSetList = new java.util.Vector<eu.dca.model.RightsWorkSet>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vRightsWorkSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRightsWorkSet(
            final eu.dca.model.RightsWorkSet vRightsWorkSet)
    throws java.lang.IndexOutOfBoundsException {
        this._rightsWorkSetList.addElement(vRightsWorkSet);
    }

    /**
     * 
     * 
     * @param index
     * @param vRightsWorkSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRightsWorkSet(
            final int index,
            final eu.dca.model.RightsWorkSet vRightsWorkSet)
    throws java.lang.IndexOutOfBoundsException {
        this._rightsWorkSetList.add(index, vRightsWorkSet);
    }

    /**
     * Method enumerateRightsWorkSet.
     * 
     * @return an Enumeration over all eu.dca.model.RightsWorkSet
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.RightsWorkSet> enumerateRightsWorkSet(
    ) {
        return this._rightsWorkSetList.elements();
    }

    /**
     * Method getRightsWorkSet.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.RightsWorkSet at the
     * given index
     */
    public eu.dca.model.RightsWorkSet getRightsWorkSet(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._rightsWorkSetList.size()) {
            throw new IndexOutOfBoundsException("getRightsWorkSet: Index value '" + index + "' not in range [0.." + (this._rightsWorkSetList.size() - 1) + "]");
        }

        return (eu.dca.model.RightsWorkSet) _rightsWorkSetList.get(index);
    }

    /**
     * Method getRightsWorkSet.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.RightsWorkSet[] getRightsWorkSet(
    ) {
        eu.dca.model.RightsWorkSet[] array = new eu.dca.model.RightsWorkSet[0];
        return (eu.dca.model.RightsWorkSet[]) this._rightsWorkSetList.toArray(array);
    }

    /**
     * Method getRightsWorkSetCount.
     * 
     * @return the size of this collection
     */
    public int getRightsWorkSetCount(
    ) {
        return this._rightsWorkSetList.size();
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
    public void removeAllRightsWorkSet(
    ) {
        this._rightsWorkSetList.clear();
    }

    /**
     * Method removeRightsWorkSet.
     * 
     * @param vRightsWorkSet
     * @return true if the object was removed from the collection.
     */
    public boolean removeRightsWorkSet(
            final eu.dca.model.RightsWorkSet vRightsWorkSet) {
        boolean removed = _rightsWorkSetList.remove(vRightsWorkSet);
        return removed;
    }

    /**
     * Method removeRightsWorkSetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.RightsWorkSet removeRightsWorkSetAt(
            final int index) {
        java.lang.Object obj = this._rightsWorkSetList.remove(index);
        return (eu.dca.model.RightsWorkSet) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vRightsWorkSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setRightsWorkSet(
            final int index,
            final eu.dca.model.RightsWorkSet vRightsWorkSet)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._rightsWorkSetList.size()) {
            throw new IndexOutOfBoundsException("setRightsWorkSet: Index value '" + index + "' not in range [0.." + (this._rightsWorkSetList.size() - 1) + "]");
        }

        this._rightsWorkSetList.set(index, vRightsWorkSet);
    }

    /**
     * 
     * 
     * @param vRightsWorkSetArray
     */
    public void setRightsWorkSet(
            final eu.dca.model.RightsWorkSet[] vRightsWorkSetArray) {
        //-- copy array
        _rightsWorkSetList.clear();

        for (int i = 0; i < vRightsWorkSetArray.length; i++) {
                this._rightsWorkSetList.add(vRightsWorkSetArray[i]);
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
     * @return the unmarshaled eu.dca.model.RightsWorkWrap
     */
    public static eu.dca.model.RightsWorkWrap unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (eu.dca.model.RightsWorkWrap) org.exolab.castor.xml.Unmarshaller.unmarshal(eu.dca.model.RightsWorkWrap.class, reader);
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
