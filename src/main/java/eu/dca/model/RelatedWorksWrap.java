/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: A wrapper for Related Works information.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class RelatedWorksWrap implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: A wrapper for a object / work, group,
     * collection, or series that is directly related to the object
     * / work being recorded.
     */
    private java.util.Vector<eu.dca.model.RelatedWorkSet> _relatedWorkSetList;


      //----------------/
     //- Constructors -/
    //----------------/

    public RelatedWorksWrap() {
        super();
        this._relatedWorkSetList = new java.util.Vector<eu.dca.model.RelatedWorkSet>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vRelatedWorkSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRelatedWorkSet(
            final eu.dca.model.RelatedWorkSet vRelatedWorkSet)
    throws java.lang.IndexOutOfBoundsException {
        this._relatedWorkSetList.addElement(vRelatedWorkSet);
    }

    /**
     * 
     * 
     * @param index
     * @param vRelatedWorkSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRelatedWorkSet(
            final int index,
            final eu.dca.model.RelatedWorkSet vRelatedWorkSet)
    throws java.lang.IndexOutOfBoundsException {
        this._relatedWorkSetList.add(index, vRelatedWorkSet);
    }

    /**
     * Method enumerateRelatedWorkSet.
     * 
     * @return an Enumeration over all eu.dca.model.RelatedWorkSet
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.RelatedWorkSet> enumerateRelatedWorkSet(
    ) {
        return this._relatedWorkSetList.elements();
    }

    /**
     * Method getRelatedWorkSet.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.RelatedWorkSet at the
     * given index
     */
    public eu.dca.model.RelatedWorkSet getRelatedWorkSet(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._relatedWorkSetList.size()) {
            throw new IndexOutOfBoundsException("getRelatedWorkSet: Index value '" + index + "' not in range [0.." + (this._relatedWorkSetList.size() - 1) + "]");
        }

        return (eu.dca.model.RelatedWorkSet) _relatedWorkSetList.get(index);
    }

    /**
     * Method getRelatedWorkSet.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.RelatedWorkSet[] getRelatedWorkSet(
    ) {
        eu.dca.model.RelatedWorkSet[] array = new eu.dca.model.RelatedWorkSet[0];
        return (eu.dca.model.RelatedWorkSet[]) this._relatedWorkSetList.toArray(array);
    }

    /**
     * Method getRelatedWorkSetCount.
     * 
     * @return the size of this collection
     */
    public int getRelatedWorkSetCount(
    ) {
        return this._relatedWorkSetList.size();
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
    public void removeAllRelatedWorkSet(
    ) {
        this._relatedWorkSetList.clear();
    }

    /**
     * Method removeRelatedWorkSet.
     * 
     * @param vRelatedWorkSet
     * @return true if the object was removed from the collection.
     */
    public boolean removeRelatedWorkSet(
            final eu.dca.model.RelatedWorkSet vRelatedWorkSet) {
        boolean removed = _relatedWorkSetList.remove(vRelatedWorkSet);
        return removed;
    }

    /**
     * Method removeRelatedWorkSetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.RelatedWorkSet removeRelatedWorkSetAt(
            final int index) {
        java.lang.Object obj = this._relatedWorkSetList.remove(index);
        return (eu.dca.model.RelatedWorkSet) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vRelatedWorkSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setRelatedWorkSet(
            final int index,
            final eu.dca.model.RelatedWorkSet vRelatedWorkSet)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._relatedWorkSetList.size()) {
            throw new IndexOutOfBoundsException("setRelatedWorkSet: Index value '" + index + "' not in range [0.." + (this._relatedWorkSetList.size() - 1) + "]");
        }

        this._relatedWorkSetList.set(index, vRelatedWorkSet);
    }

    /**
     * 
     * 
     * @param vRelatedWorkSetArray
     */
    public void setRelatedWorkSet(
            final eu.dca.model.RelatedWorkSet[] vRelatedWorkSetArray) {
        //-- copy array
        _relatedWorkSetList.clear();

        for (int i = 0; i < vRelatedWorkSetArray.length; i++) {
                this._relatedWorkSetList.add(vRelatedWorkSetArray[i]);
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
     * @return the unmarshaled eu.dca.model.RelatedWorksWrap
     */
    public static eu.dca.model.RelatedWorksWrap unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (eu.dca.model.RelatedWorksWrap) org.exolab.castor.xml.Unmarshaller.unmarshal(eu.dca.model.RelatedWorksWrap.class, reader);
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
