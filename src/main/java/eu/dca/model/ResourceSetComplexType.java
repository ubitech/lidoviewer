/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: A wrapper for sets of resource information. How to
 * record: If there are multiple, distinct resources associated
 * with the object / work, repeat the Resource Set element. For
 * variants representing the same resource repeat the Resource
 * Representation sub-element. 
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class ResourceSetComplexType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: The unique numeric or alphanumeric
     * identification of the original (digital or analogue) resource
     */
    private eu.dca.model.ResourceID _resourceID;

    /**
     * Definition: A digital representation of a resource for
     * online presentation. 
     */
    private java.util.Vector<eu.dca.model.ResourceRepresentation> _resourceRepresentationList;

    /**
     * Definition: The generic identification of the medium of the
     * image or other resource.
     */
    private eu.dca.model.ResourceType _resourceType;

    /**
     * Definition: The relationship of the resource to the object /
     * work being described.
     */
    private java.util.Vector<eu.dca.model.ResourceRelType> _resourceRelTypeList;

    /**
     * Definition: The specific vantage point or perspective of the
     * view.
     */
    private java.util.Vector<eu.dca.model.ResourcePerspective> _resourcePerspectiveList;

    /**
     * Definition: A description of the spatial, chronological, or
     * contextual aspects of the object / work as captured in this
     * particular resource.
     */
    private java.util.Vector<eu.dca.model.ResourceDescription> _resourceDescriptionList;

    /**
     * Definition: A date or range of dates associated with the
     * creation or production of the original resource, e.g. the
     * image or recording. 
     */
    private eu.dca.model.ResourceDateTaken _resourceDateTaken;

    /**
     * Definition: Identification of the agency, individual, or
     * repository from which the image or other resource was
     * obtained. 
     */
    private java.util.Vector<eu.dca.model.ResourceSource> _resourceSourceList;

    /**
     * Definition: Information about rights regarding the image or
     * other resource. 
     */
    private java.util.Vector<eu.dca.model.RightsResource> _rightsResourceList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ResourceSetComplexType() {
        super();
        this._resourceRepresentationList = new java.util.Vector<eu.dca.model.ResourceRepresentation>();
        this._resourceRelTypeList = new java.util.Vector<eu.dca.model.ResourceRelType>();
        this._resourcePerspectiveList = new java.util.Vector<eu.dca.model.ResourcePerspective>();
        this._resourceDescriptionList = new java.util.Vector<eu.dca.model.ResourceDescription>();
        this._resourceSourceList = new java.util.Vector<eu.dca.model.ResourceSource>();
        this._rightsResourceList = new java.util.Vector<eu.dca.model.RightsResource>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vResourceDescription
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addResourceDescription(
            final eu.dca.model.ResourceDescription vResourceDescription)
    throws java.lang.IndexOutOfBoundsException {
        this._resourceDescriptionList.addElement(vResourceDescription);
    }

    /**
     * 
     * 
     * @param index
     * @param vResourceDescription
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addResourceDescription(
            final int index,
            final eu.dca.model.ResourceDescription vResourceDescription)
    throws java.lang.IndexOutOfBoundsException {
        this._resourceDescriptionList.add(index, vResourceDescription);
    }

    /**
     * 
     * 
     * @param vResourcePerspective
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addResourcePerspective(
            final eu.dca.model.ResourcePerspective vResourcePerspective)
    throws java.lang.IndexOutOfBoundsException {
        this._resourcePerspectiveList.addElement(vResourcePerspective);
    }

    /**
     * 
     * 
     * @param index
     * @param vResourcePerspective
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addResourcePerspective(
            final int index,
            final eu.dca.model.ResourcePerspective vResourcePerspective)
    throws java.lang.IndexOutOfBoundsException {
        this._resourcePerspectiveList.add(index, vResourcePerspective);
    }

    /**
     * 
     * 
     * @param vResourceRelType
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addResourceRelType(
            final eu.dca.model.ResourceRelType vResourceRelType)
    throws java.lang.IndexOutOfBoundsException {
        this._resourceRelTypeList.addElement(vResourceRelType);
    }

    /**
     * 
     * 
     * @param index
     * @param vResourceRelType
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addResourceRelType(
            final int index,
            final eu.dca.model.ResourceRelType vResourceRelType)
    throws java.lang.IndexOutOfBoundsException {
        this._resourceRelTypeList.add(index, vResourceRelType);
    }

    /**
     * 
     * 
     * @param vResourceRepresentation
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addResourceRepresentation(
            final eu.dca.model.ResourceRepresentation vResourceRepresentation)
    throws java.lang.IndexOutOfBoundsException {
        this._resourceRepresentationList.addElement(vResourceRepresentation);
    }

    /**
     * 
     * 
     * @param index
     * @param vResourceRepresentation
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addResourceRepresentation(
            final int index,
            final eu.dca.model.ResourceRepresentation vResourceRepresentation)
    throws java.lang.IndexOutOfBoundsException {
        this._resourceRepresentationList.add(index, vResourceRepresentation);
    }

    /**
     * 
     * 
     * @param vResourceSource
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addResourceSource(
            final eu.dca.model.ResourceSource vResourceSource)
    throws java.lang.IndexOutOfBoundsException {
        this._resourceSourceList.addElement(vResourceSource);
    }

    /**
     * 
     * 
     * @param index
     * @param vResourceSource
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addResourceSource(
            final int index,
            final eu.dca.model.ResourceSource vResourceSource)
    throws java.lang.IndexOutOfBoundsException {
        this._resourceSourceList.add(index, vResourceSource);
    }

    /**
     * 
     * 
     * @param vRightsResource
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRightsResource(
            final eu.dca.model.RightsResource vRightsResource)
    throws java.lang.IndexOutOfBoundsException {
        this._rightsResourceList.addElement(vRightsResource);
    }

    /**
     * 
     * 
     * @param index
     * @param vRightsResource
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRightsResource(
            final int index,
            final eu.dca.model.RightsResource vRightsResource)
    throws java.lang.IndexOutOfBoundsException {
        this._rightsResourceList.add(index, vRightsResource);
    }

    /**
     * Method enumerateResourceDescription.
     * 
     * @return an Enumeration over all
     * eu.dca.model.ResourceDescription elements
     */
    public java.util.Enumeration<? extends eu.dca.model.ResourceDescription> enumerateResourceDescription(
    ) {
        return this._resourceDescriptionList.elements();
    }

    /**
     * Method enumerateResourcePerspective.
     * 
     * @return an Enumeration over all
     * eu.dca.model.ResourcePerspective elements
     */
    public java.util.Enumeration<? extends eu.dca.model.ResourcePerspective> enumerateResourcePerspective(
    ) {
        return this._resourcePerspectiveList.elements();
    }

    /**
     * Method enumerateResourceRelType.
     * 
     * @return an Enumeration over all eu.dca.model.ResourceRelType
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.ResourceRelType> enumerateResourceRelType(
    ) {
        return this._resourceRelTypeList.elements();
    }

    /**
     * Method enumerateResourceRepresentation.
     * 
     * @return an Enumeration over all
     * eu.dca.model.ResourceRepresentation elements
     */
    public java.util.Enumeration<? extends eu.dca.model.ResourceRepresentation> enumerateResourceRepresentation(
    ) {
        return this._resourceRepresentationList.elements();
    }

    /**
     * Method enumerateResourceSource.
     * 
     * @return an Enumeration over all eu.dca.model.ResourceSource
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.ResourceSource> enumerateResourceSource(
    ) {
        return this._resourceSourceList.elements();
    }

    /**
     * Method enumerateRightsResource.
     * 
     * @return an Enumeration over all eu.dca.model.RightsResource
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.RightsResource> enumerateRightsResource(
    ) {
        return this._rightsResourceList.elements();
    }

    /**
     * Returns the value of field 'resourceDateTaken'. The field
     * 'resourceDateTaken' has the following description:
     * Definition: A date or range of dates associated with the
     * creation or production of the original resource, e.g. the
     * image or recording. 
     * 
     * @return the value of field 'ResourceDateTaken'.
     */
    public eu.dca.model.ResourceDateTaken getResourceDateTaken(
    ) {
        return this._resourceDateTaken;
    }

    /**
     * Method getResourceDescription.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.ResourceDescription at
     * the given index
     */
    public eu.dca.model.ResourceDescription getResourceDescription(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._resourceDescriptionList.size()) {
            throw new IndexOutOfBoundsException("getResourceDescription: Index value '" + index + "' not in range [0.." + (this._resourceDescriptionList.size() - 1) + "]");
        }

        return (eu.dca.model.ResourceDescription) _resourceDescriptionList.get(index);
    }

    /**
     * Method getResourceDescription.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.ResourceDescription[] getResourceDescription(
    ) {
        eu.dca.model.ResourceDescription[] array = new eu.dca.model.ResourceDescription[0];
        return (eu.dca.model.ResourceDescription[]) this._resourceDescriptionList.toArray(array);
    }

    /**
     * Method getResourceDescriptionCount.
     * 
     * @return the size of this collection
     */
    public int getResourceDescriptionCount(
    ) {
        return this._resourceDescriptionList.size();
    }

    /**
     * Returns the value of field 'resourceID'. The field
     * 'resourceID' has the following description: Definition: The
     * unique numeric or alphanumeric identification of the
     * original (digital or analogue) resource.
     * 
     * @return the value of field 'ResourceID'.
     */
    public eu.dca.model.ResourceID getResourceID(
    ) {
        return this._resourceID;
    }

    /**
     * Method getResourcePerspective.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.ResourcePerspective at
     * the given index
     */
    public eu.dca.model.ResourcePerspective getResourcePerspective(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._resourcePerspectiveList.size()) {
            throw new IndexOutOfBoundsException("getResourcePerspective: Index value '" + index + "' not in range [0.." + (this._resourcePerspectiveList.size() - 1) + "]");
        }

        return (eu.dca.model.ResourcePerspective) _resourcePerspectiveList.get(index);
    }

    /**
     * Method getResourcePerspective.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.ResourcePerspective[] getResourcePerspective(
    ) {
        eu.dca.model.ResourcePerspective[] array = new eu.dca.model.ResourcePerspective[0];
        return (eu.dca.model.ResourcePerspective[]) this._resourcePerspectiveList.toArray(array);
    }

    /**
     * Method getResourcePerspectiveCount.
     * 
     * @return the size of this collection
     */
    public int getResourcePerspectiveCount(
    ) {
        return this._resourcePerspectiveList.size();
    }

    /**
     * Method getResourceRelType.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.ResourceRelType at the
     * given index
     */
    public eu.dca.model.ResourceRelType getResourceRelType(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._resourceRelTypeList.size()) {
            throw new IndexOutOfBoundsException("getResourceRelType: Index value '" + index + "' not in range [0.." + (this._resourceRelTypeList.size() - 1) + "]");
        }

        return (eu.dca.model.ResourceRelType) _resourceRelTypeList.get(index);
    }

    /**
     * Method getResourceRelType.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.ResourceRelType[] getResourceRelType(
    ) {
        eu.dca.model.ResourceRelType[] array = new eu.dca.model.ResourceRelType[0];
        return (eu.dca.model.ResourceRelType[]) this._resourceRelTypeList.toArray(array);
    }

    /**
     * Method getResourceRelTypeCount.
     * 
     * @return the size of this collection
     */
    public int getResourceRelTypeCount(
    ) {
        return this._resourceRelTypeList.size();
    }

    /**
     * Method getResourceRepresentation.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.ResourceRepresentation
     * at the given index
     */
    public eu.dca.model.ResourceRepresentation getResourceRepresentation(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._resourceRepresentationList.size()) {
            throw new IndexOutOfBoundsException("getResourceRepresentation: Index value '" + index + "' not in range [0.." + (this._resourceRepresentationList.size() - 1) + "]");
        }

        return (eu.dca.model.ResourceRepresentation) _resourceRepresentationList.get(index);
    }

    /**
     * Method getResourceRepresentation.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.ResourceRepresentation[] getResourceRepresentation(
    ) {
        eu.dca.model.ResourceRepresentation[] array = new eu.dca.model.ResourceRepresentation[0];
        return (eu.dca.model.ResourceRepresentation[]) this._resourceRepresentationList.toArray(array);
    }

    /**
     * Method getResourceRepresentationCount.
     * 
     * @return the size of this collection
     */
    public int getResourceRepresentationCount(
    ) {
        return this._resourceRepresentationList.size();
    }

    /**
     * Method getResourceSource.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.ResourceSource at the
     * given index
     */
    public eu.dca.model.ResourceSource getResourceSource(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._resourceSourceList.size()) {
            throw new IndexOutOfBoundsException("getResourceSource: Index value '" + index + "' not in range [0.." + (this._resourceSourceList.size() - 1) + "]");
        }

        return (eu.dca.model.ResourceSource) _resourceSourceList.get(index);
    }

    /**
     * Method getResourceSource.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.ResourceSource[] getResourceSource(
    ) {
        eu.dca.model.ResourceSource[] array = new eu.dca.model.ResourceSource[0];
        return (eu.dca.model.ResourceSource[]) this._resourceSourceList.toArray(array);
    }

    /**
     * Method getResourceSourceCount.
     * 
     * @return the size of this collection
     */
    public int getResourceSourceCount(
    ) {
        return this._resourceSourceList.size();
    }

    /**
     * Returns the value of field 'resourceType'. The field
     * 'resourceType' has the following description: Definition:
     * The generic identification of the medium of the image or
     * other resource.
     * 
     * @return the value of field 'ResourceType'.
     */
    public eu.dca.model.ResourceType getResourceType(
    ) {
        return this._resourceType;
    }

    /**
     * Method getRightsResource.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.RightsResource at the
     * given index
     */
    public eu.dca.model.RightsResource getRightsResource(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._rightsResourceList.size()) {
            throw new IndexOutOfBoundsException("getRightsResource: Index value '" + index + "' not in range [0.." + (this._rightsResourceList.size() - 1) + "]");
        }

        return (eu.dca.model.RightsResource) _rightsResourceList.get(index);
    }

    /**
     * Method getRightsResource.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.RightsResource[] getRightsResource(
    ) {
        eu.dca.model.RightsResource[] array = new eu.dca.model.RightsResource[0];
        return (eu.dca.model.RightsResource[]) this._rightsResourceList.toArray(array);
    }

    /**
     * Method getRightsResourceCount.
     * 
     * @return the size of this collection
     */
    public int getRightsResourceCount(
    ) {
        return this._rightsResourceList.size();
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
    public void removeAllResourceDescription(
    ) {
        this._resourceDescriptionList.clear();
    }

    /**
     */
    public void removeAllResourcePerspective(
    ) {
        this._resourcePerspectiveList.clear();
    }

    /**
     */
    public void removeAllResourceRelType(
    ) {
        this._resourceRelTypeList.clear();
    }

    /**
     */
    public void removeAllResourceRepresentation(
    ) {
        this._resourceRepresentationList.clear();
    }

    /**
     */
    public void removeAllResourceSource(
    ) {
        this._resourceSourceList.clear();
    }

    /**
     */
    public void removeAllRightsResource(
    ) {
        this._rightsResourceList.clear();
    }

    /**
     * Method removeResourceDescription.
     * 
     * @param vResourceDescription
     * @return true if the object was removed from the collection.
     */
    public boolean removeResourceDescription(
            final eu.dca.model.ResourceDescription vResourceDescription) {
        boolean removed = _resourceDescriptionList.remove(vResourceDescription);
        return removed;
    }

    /**
     * Method removeResourceDescriptionAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.ResourceDescription removeResourceDescriptionAt(
            final int index) {
        java.lang.Object obj = this._resourceDescriptionList.remove(index);
        return (eu.dca.model.ResourceDescription) obj;
    }

    /**
     * Method removeResourcePerspective.
     * 
     * @param vResourcePerspective
     * @return true if the object was removed from the collection.
     */
    public boolean removeResourcePerspective(
            final eu.dca.model.ResourcePerspective vResourcePerspective) {
        boolean removed = _resourcePerspectiveList.remove(vResourcePerspective);
        return removed;
    }

    /**
     * Method removeResourcePerspectiveAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.ResourcePerspective removeResourcePerspectiveAt(
            final int index) {
        java.lang.Object obj = this._resourcePerspectiveList.remove(index);
        return (eu.dca.model.ResourcePerspective) obj;
    }

    /**
     * Method removeResourceRelType.
     * 
     * @param vResourceRelType
     * @return true if the object was removed from the collection.
     */
    public boolean removeResourceRelType(
            final eu.dca.model.ResourceRelType vResourceRelType) {
        boolean removed = _resourceRelTypeList.remove(vResourceRelType);
        return removed;
    }

    /**
     * Method removeResourceRelTypeAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.ResourceRelType removeResourceRelTypeAt(
            final int index) {
        java.lang.Object obj = this._resourceRelTypeList.remove(index);
        return (eu.dca.model.ResourceRelType) obj;
    }

    /**
     * Method removeResourceRepresentation.
     * 
     * @param vResourceRepresentation
     * @return true if the object was removed from the collection.
     */
    public boolean removeResourceRepresentation(
            final eu.dca.model.ResourceRepresentation vResourceRepresentation) {
        boolean removed = _resourceRepresentationList.remove(vResourceRepresentation);
        return removed;
    }

    /**
     * Method removeResourceRepresentationAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.ResourceRepresentation removeResourceRepresentationAt(
            final int index) {
        java.lang.Object obj = this._resourceRepresentationList.remove(index);
        return (eu.dca.model.ResourceRepresentation) obj;
    }

    /**
     * Method removeResourceSource.
     * 
     * @param vResourceSource
     * @return true if the object was removed from the collection.
     */
    public boolean removeResourceSource(
            final eu.dca.model.ResourceSource vResourceSource) {
        boolean removed = _resourceSourceList.remove(vResourceSource);
        return removed;
    }

    /**
     * Method removeResourceSourceAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.ResourceSource removeResourceSourceAt(
            final int index) {
        java.lang.Object obj = this._resourceSourceList.remove(index);
        return (eu.dca.model.ResourceSource) obj;
    }

    /**
     * Method removeRightsResource.
     * 
     * @param vRightsResource
     * @return true if the object was removed from the collection.
     */
    public boolean removeRightsResource(
            final eu.dca.model.RightsResource vRightsResource) {
        boolean removed = _rightsResourceList.remove(vRightsResource);
        return removed;
    }

    /**
     * Method removeRightsResourceAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.RightsResource removeRightsResourceAt(
            final int index) {
        java.lang.Object obj = this._rightsResourceList.remove(index);
        return (eu.dca.model.RightsResource) obj;
    }

    /**
     * Sets the value of field 'resourceDateTaken'. The field
     * 'resourceDateTaken' has the following description:
     * Definition: A date or range of dates associated with the
     * creation or production of the original resource, e.g. the
     * image or recording. 
     * 
     * @param resourceDateTaken the value of field
     * 'resourceDateTaken'.
     */
    public void setResourceDateTaken(
            final eu.dca.model.ResourceDateTaken resourceDateTaken) {
        this._resourceDateTaken = resourceDateTaken;
    }

    /**
     * 
     * 
     * @param index
     * @param vResourceDescription
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setResourceDescription(
            final int index,
            final eu.dca.model.ResourceDescription vResourceDescription)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._resourceDescriptionList.size()) {
            throw new IndexOutOfBoundsException("setResourceDescription: Index value '" + index + "' not in range [0.." + (this._resourceDescriptionList.size() - 1) + "]");
        }

        this._resourceDescriptionList.set(index, vResourceDescription);
    }

    /**
     * 
     * 
     * @param vResourceDescriptionArray
     */
    public void setResourceDescription(
            final eu.dca.model.ResourceDescription[] vResourceDescriptionArray) {
        //-- copy array
        _resourceDescriptionList.clear();

        for (int i = 0; i < vResourceDescriptionArray.length; i++) {
                this._resourceDescriptionList.add(vResourceDescriptionArray[i]);
        }
    }

    /**
     * Sets the value of field 'resourceID'. The field 'resourceID'
     * has the following description: Definition: The unique
     * numeric or alphanumeric identification of the original
     * (digital or analogue) resource.
     * 
     * @param resourceID the value of field 'resourceID'.
     */
    public void setResourceID(
            final eu.dca.model.ResourceID resourceID) {
        this._resourceID = resourceID;
    }

    /**
     * 
     * 
     * @param index
     * @param vResourcePerspective
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setResourcePerspective(
            final int index,
            final eu.dca.model.ResourcePerspective vResourcePerspective)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._resourcePerspectiveList.size()) {
            throw new IndexOutOfBoundsException("setResourcePerspective: Index value '" + index + "' not in range [0.." + (this._resourcePerspectiveList.size() - 1) + "]");
        }

        this._resourcePerspectiveList.set(index, vResourcePerspective);
    }

    /**
     * 
     * 
     * @param vResourcePerspectiveArray
     */
    public void setResourcePerspective(
            final eu.dca.model.ResourcePerspective[] vResourcePerspectiveArray) {
        //-- copy array
        _resourcePerspectiveList.clear();

        for (int i = 0; i < vResourcePerspectiveArray.length; i++) {
                this._resourcePerspectiveList.add(vResourcePerspectiveArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vResourceRelType
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setResourceRelType(
            final int index,
            final eu.dca.model.ResourceRelType vResourceRelType)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._resourceRelTypeList.size()) {
            throw new IndexOutOfBoundsException("setResourceRelType: Index value '" + index + "' not in range [0.." + (this._resourceRelTypeList.size() - 1) + "]");
        }

        this._resourceRelTypeList.set(index, vResourceRelType);
    }

    /**
     * 
     * 
     * @param vResourceRelTypeArray
     */
    public void setResourceRelType(
            final eu.dca.model.ResourceRelType[] vResourceRelTypeArray) {
        //-- copy array
        _resourceRelTypeList.clear();

        for (int i = 0; i < vResourceRelTypeArray.length; i++) {
                this._resourceRelTypeList.add(vResourceRelTypeArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vResourceRepresentation
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setResourceRepresentation(
            final int index,
            final eu.dca.model.ResourceRepresentation vResourceRepresentation)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._resourceRepresentationList.size()) {
            throw new IndexOutOfBoundsException("setResourceRepresentation: Index value '" + index + "' not in range [0.." + (this._resourceRepresentationList.size() - 1) + "]");
        }

        this._resourceRepresentationList.set(index, vResourceRepresentation);
    }

    /**
     * 
     * 
     * @param vResourceRepresentationArray
     */
    public void setResourceRepresentation(
            final eu.dca.model.ResourceRepresentation[] vResourceRepresentationArray) {
        //-- copy array
        _resourceRepresentationList.clear();

        for (int i = 0; i < vResourceRepresentationArray.length; i++) {
                this._resourceRepresentationList.add(vResourceRepresentationArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vResourceSource
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setResourceSource(
            final int index,
            final eu.dca.model.ResourceSource vResourceSource)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._resourceSourceList.size()) {
            throw new IndexOutOfBoundsException("setResourceSource: Index value '" + index + "' not in range [0.." + (this._resourceSourceList.size() - 1) + "]");
        }

        this._resourceSourceList.set(index, vResourceSource);
    }

    /**
     * 
     * 
     * @param vResourceSourceArray
     */
    public void setResourceSource(
            final eu.dca.model.ResourceSource[] vResourceSourceArray) {
        //-- copy array
        _resourceSourceList.clear();

        for (int i = 0; i < vResourceSourceArray.length; i++) {
                this._resourceSourceList.add(vResourceSourceArray[i]);
        }
    }

    /**
     * Sets the value of field 'resourceType'. The field
     * 'resourceType' has the following description: Definition:
     * The generic identification of the medium of the image or
     * other resource.
     * 
     * @param resourceType the value of field 'resourceType'.
     */
    public void setResourceType(
            final eu.dca.model.ResourceType resourceType) {
        this._resourceType = resourceType;
    }

    /**
     * 
     * 
     * @param index
     * @param vRightsResource
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setRightsResource(
            final int index,
            final eu.dca.model.RightsResource vRightsResource)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._rightsResourceList.size()) {
            throw new IndexOutOfBoundsException("setRightsResource: Index value '" + index + "' not in range [0.." + (this._rightsResourceList.size() - 1) + "]");
        }

        this._rightsResourceList.set(index, vRightsResource);
    }

    /**
     * 
     * 
     * @param vRightsResourceArray
     */
    public void setRightsResource(
            final eu.dca.model.RightsResource[] vRightsResourceArray) {
        //-- copy array
        _rightsResourceList.clear();

        for (int i = 0; i < vRightsResourceArray.length; i++) {
                this._rightsResourceList.add(vRightsResourceArray[i]);
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
