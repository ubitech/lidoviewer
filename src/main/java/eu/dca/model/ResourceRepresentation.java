/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: A digital representation of a resource for online
 * presentation. How to record: Repeat this element set for
 * variants representing the same resource, e.g. different sizes of
 * the same image, or a thumbnail representing an audio or video
 * file and the digital audio or video file itself. 
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ResourceRepresentation implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: Qualifies the type of information given in the
     * holding element. 
     */
    private java.lang.String _type;

    /**
     * Definition: A url reference in the worldwide web environment.
     */
    private eu.dca.model.LinkResource _linkResource;

    /**
     * Definition: Any technical measurement information needed for
     * online presentation of the resource. 
     */
    private java.util.Vector<eu.dca.model.ResourceMeasurementsSet> _resourceMeasurementsSetList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ResourceRepresentation() {
        super();
        this._resourceMeasurementsSetList = new java.util.Vector<eu.dca.model.ResourceMeasurementsSet>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vResourceMeasurementsSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addResourceMeasurementsSet(
            final eu.dca.model.ResourceMeasurementsSet vResourceMeasurementsSet)
    throws java.lang.IndexOutOfBoundsException {
        this._resourceMeasurementsSetList.addElement(vResourceMeasurementsSet);
    }

    /**
     * 
     * 
     * @param index
     * @param vResourceMeasurementsSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addResourceMeasurementsSet(
            final int index,
            final eu.dca.model.ResourceMeasurementsSet vResourceMeasurementsSet)
    throws java.lang.IndexOutOfBoundsException {
        this._resourceMeasurementsSetList.add(index, vResourceMeasurementsSet);
    }

    /**
     * Method enumerateResourceMeasurementsSet.
     * 
     * @return an Enumeration over all
     * eu.dca.model.ResourceMeasurementsSet elements
     */
    public java.util.Enumeration<? extends eu.dca.model.ResourceMeasurementsSet> enumerateResourceMeasurementsSet(
    ) {
        return this._resourceMeasurementsSetList.elements();
    }

    /**
     * Returns the value of field 'linkResource'. The field
     * 'linkResource' has the following description: Definition: A
     * url reference in the worldwide web environment.
     * 
     * @return the value of field 'LinkResource'.
     */
    public eu.dca.model.LinkResource getLinkResource(
    ) {
        return this._linkResource;
    }

    /**
     * Method getResourceMeasurementsSet.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * eu.dca.model.ResourceMeasurementsSet at the given index
     */
    public eu.dca.model.ResourceMeasurementsSet getResourceMeasurementsSet(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._resourceMeasurementsSetList.size()) {
            throw new IndexOutOfBoundsException("getResourceMeasurementsSet: Index value '" + index + "' not in range [0.." + (this._resourceMeasurementsSetList.size() - 1) + "]");
        }

        return (eu.dca.model.ResourceMeasurementsSet) _resourceMeasurementsSetList.get(index);
    }

    /**
     * Method getResourceMeasurementsSet.Returns the contents of
     * the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.ResourceMeasurementsSet[] getResourceMeasurementsSet(
    ) {
        eu.dca.model.ResourceMeasurementsSet[] array = new eu.dca.model.ResourceMeasurementsSet[0];
        return (eu.dca.model.ResourceMeasurementsSet[]) this._resourceMeasurementsSetList.toArray(array);
    }

    /**
     * Method getResourceMeasurementsSetCount.
     * 
     * @return the size of this collection
     */
    public int getResourceMeasurementsSetCount(
    ) {
        return this._resourceMeasurementsSetList.size();
    }

    /**
     * Returns the value of field 'type'. The field 'type' has the
     * following description: Definition: Qualifies the type of
     * information given in the holding element. 
     * 
     * @return the value of field 'Type'.
     */
    public java.lang.String getType(
    ) {
        return this._type;
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
    public void removeAllResourceMeasurementsSet(
    ) {
        this._resourceMeasurementsSetList.clear();
    }

    /**
     * Method removeResourceMeasurementsSet.
     * 
     * @param vResourceMeasurementsSet
     * @return true if the object was removed from the collection.
     */
    public boolean removeResourceMeasurementsSet(
            final eu.dca.model.ResourceMeasurementsSet vResourceMeasurementsSet) {
        boolean removed = _resourceMeasurementsSetList.remove(vResourceMeasurementsSet);
        return removed;
    }

    /**
     * Method removeResourceMeasurementsSetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.ResourceMeasurementsSet removeResourceMeasurementsSetAt(
            final int index) {
        java.lang.Object obj = this._resourceMeasurementsSetList.remove(index);
        return (eu.dca.model.ResourceMeasurementsSet) obj;
    }

    /**
     * Sets the value of field 'linkResource'. The field
     * 'linkResource' has the following description: Definition: A
     * url reference in the worldwide web environment.
     * 
     * @param linkResource the value of field 'linkResource'.
     */
    public void setLinkResource(
            final eu.dca.model.LinkResource linkResource) {
        this._linkResource = linkResource;
    }

    /**
     * 
     * 
     * @param index
     * @param vResourceMeasurementsSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setResourceMeasurementsSet(
            final int index,
            final eu.dca.model.ResourceMeasurementsSet vResourceMeasurementsSet)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._resourceMeasurementsSetList.size()) {
            throw new IndexOutOfBoundsException("setResourceMeasurementsSet: Index value '" + index + "' not in range [0.." + (this._resourceMeasurementsSetList.size() - 1) + "]");
        }

        this._resourceMeasurementsSetList.set(index, vResourceMeasurementsSet);
    }

    /**
     * 
     * 
     * @param vResourceMeasurementsSetArray
     */
    public void setResourceMeasurementsSet(
            final eu.dca.model.ResourceMeasurementsSet[] vResourceMeasurementsSetArray) {
        //-- copy array
        _resourceMeasurementsSetList.clear();

        for (int i = 0; i < vResourceMeasurementsSetArray.length; i++) {
                this._resourceMeasurementsSetList.add(vResourceMeasurementsSetArray[i]);
        }
    }

    /**
     * Sets the value of field 'type'. The field 'type' has the
     * following description: Definition: Qualifies the type of
     * information given in the holding element. 
     * 
     * @param type the value of field 'type'.
     */
    public void setType(
            final java.lang.String type) {
        this._type = type;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled eu.dca.model.ResourceRepresentation
     */
    public static eu.dca.model.ResourceRepresentation unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (eu.dca.model.ResourceRepresentation) org.exolab.castor.xml.Unmarshaller.unmarshal(eu.dca.model.ResourceRepresentation.class, reader);
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
