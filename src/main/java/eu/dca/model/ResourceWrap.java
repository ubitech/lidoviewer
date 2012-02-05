/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: A wrapper for resources that are surrogates for an
 * object / work, including digital images, videos or audio files
 * that represent it in an online service.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ResourceWrap implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: Contains sub-elements for a structured resource
     * description.
     */
    private java.util.Vector<eu.dca.model.ResourceSet> _resourceSetList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ResourceWrap() {
        super();
        this._resourceSetList = new java.util.Vector<eu.dca.model.ResourceSet>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vResourceSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addResourceSet(
            final eu.dca.model.ResourceSet vResourceSet)
    throws java.lang.IndexOutOfBoundsException {
        this._resourceSetList.addElement(vResourceSet);
    }

    /**
     * 
     * 
     * @param index
     * @param vResourceSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addResourceSet(
            final int index,
            final eu.dca.model.ResourceSet vResourceSet)
    throws java.lang.IndexOutOfBoundsException {
        this._resourceSetList.add(index, vResourceSet);
    }

    /**
     * Method enumerateResourceSet.
     * 
     * @return an Enumeration over all eu.dca.model.ResourceSet
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.ResourceSet> enumerateResourceSet(
    ) {
        return this._resourceSetList.elements();
    }

    /**
     * Method getResourceSet.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.ResourceSet at the
     * given index
     */
    public eu.dca.model.ResourceSet getResourceSet(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._resourceSetList.size()) {
            throw new IndexOutOfBoundsException("getResourceSet: Index value '" + index + "' not in range [0.." + (this._resourceSetList.size() - 1) + "]");
        }

        return (eu.dca.model.ResourceSet) _resourceSetList.get(index);
    }

    /**
     * Method getResourceSet.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.ResourceSet[] getResourceSet(
    ) {
        eu.dca.model.ResourceSet[] array = new eu.dca.model.ResourceSet[0];
        return (eu.dca.model.ResourceSet[]) this._resourceSetList.toArray(array);
    }

    /**
     * Method getResourceSetCount.
     * 
     * @return the size of this collection
     */
    public int getResourceSetCount(
    ) {
        return this._resourceSetList.size();
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
    public void removeAllResourceSet(
    ) {
        this._resourceSetList.clear();
    }

    /**
     * Method removeResourceSet.
     * 
     * @param vResourceSet
     * @return true if the object was removed from the collection.
     */
    public boolean removeResourceSet(
            final eu.dca.model.ResourceSet vResourceSet) {
        boolean removed = _resourceSetList.remove(vResourceSet);
        return removed;
    }

    /**
     * Method removeResourceSetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.ResourceSet removeResourceSetAt(
            final int index) {
        java.lang.Object obj = this._resourceSetList.remove(index);
        return (eu.dca.model.ResourceSet) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vResourceSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setResourceSet(
            final int index,
            final eu.dca.model.ResourceSet vResourceSet)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._resourceSetList.size()) {
            throw new IndexOutOfBoundsException("setResourceSet: Index value '" + index + "' not in range [0.." + (this._resourceSetList.size() - 1) + "]");
        }

        this._resourceSetList.set(index, vResourceSet);
    }

    /**
     * 
     * 
     * @param vResourceSetArray
     */
    public void setResourceSet(
            final eu.dca.model.ResourceSet[] vResourceSetArray) {
        //-- copy array
        _resourceSetList.clear();

        for (int i = 0; i < vResourceSetArray.length; i++) {
                this._resourceSetList.add(vResourceSetArray[i]);
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
     * @return the unmarshaled eu.dca.model.ResourceWrap
     */
    public static eu.dca.model.ResourceWrap unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (eu.dca.model.ResourceWrap) org.exolab.castor.xml.Unmarshaller.unmarshal(eu.dca.model.ResourceWrap.class, reader);
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
