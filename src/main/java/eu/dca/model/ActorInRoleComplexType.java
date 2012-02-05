/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: Describes an actor with role and (if necessary)
 * attributions related to the event the actor participated in.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class ActorInRoleComplexType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: Contains structured identifying and indexing
     * actor information.
     */
    private eu.dca.model.InRoleActor _inRoleActor;

    /**
     * Definition: Role of the Actor in the event. 
     */
    private java.util.Vector<eu.dca.model.RoleActor> _roleActorList;

    /**
     * Definition: A qualifier used when the attribution is
     * uncertain, is in dispute, when there is more than one actor,
     * when there is a former attribution, or when the attribution
     * otherwise requires explanation.
     */
    private java.util.Vector<eu.dca.model.AttributionQualifierActor> _attributionQualifierActorList;

    /**
     * Definition: Extent of the actor's participation in the
     * event, if there are several actors.
     */
    private java.util.Vector<eu.dca.model.ExtentActor> _extentActorList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ActorInRoleComplexType() {
        super();
        this._roleActorList = new java.util.Vector<eu.dca.model.RoleActor>();
        this._attributionQualifierActorList = new java.util.Vector<eu.dca.model.AttributionQualifierActor>();
        this._extentActorList = new java.util.Vector<eu.dca.model.ExtentActor>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vAttributionQualifierActor
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAttributionQualifierActor(
            final eu.dca.model.AttributionQualifierActor vAttributionQualifierActor)
    throws java.lang.IndexOutOfBoundsException {
        this._attributionQualifierActorList.addElement(vAttributionQualifierActor);
    }

    /**
     * 
     * 
     * @param index
     * @param vAttributionQualifierActor
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAttributionQualifierActor(
            final int index,
            final eu.dca.model.AttributionQualifierActor vAttributionQualifierActor)
    throws java.lang.IndexOutOfBoundsException {
        this._attributionQualifierActorList.add(index, vAttributionQualifierActor);
    }

    /**
     * 
     * 
     * @param vExtentActor
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addExtentActor(
            final eu.dca.model.ExtentActor vExtentActor)
    throws java.lang.IndexOutOfBoundsException {
        this._extentActorList.addElement(vExtentActor);
    }

    /**
     * 
     * 
     * @param index
     * @param vExtentActor
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addExtentActor(
            final int index,
            final eu.dca.model.ExtentActor vExtentActor)
    throws java.lang.IndexOutOfBoundsException {
        this._extentActorList.add(index, vExtentActor);
    }

    /**
     * 
     * 
     * @param vRoleActor
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRoleActor(
            final eu.dca.model.RoleActor vRoleActor)
    throws java.lang.IndexOutOfBoundsException {
        this._roleActorList.addElement(vRoleActor);
    }

    /**
     * 
     * 
     * @param index
     * @param vRoleActor
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRoleActor(
            final int index,
            final eu.dca.model.RoleActor vRoleActor)
    throws java.lang.IndexOutOfBoundsException {
        this._roleActorList.add(index, vRoleActor);
    }

    /**
     * Method enumerateAttributionQualifierActor.
     * 
     * @return an Enumeration over all
     * eu.dca.model.AttributionQualifierActor elements
     */
    public java.util.Enumeration<? extends eu.dca.model.AttributionQualifierActor> enumerateAttributionQualifierActor(
    ) {
        return this._attributionQualifierActorList.elements();
    }

    /**
     * Method enumerateExtentActor.
     * 
     * @return an Enumeration over all eu.dca.model.ExtentActor
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.ExtentActor> enumerateExtentActor(
    ) {
        return this._extentActorList.elements();
    }

    /**
     * Method enumerateRoleActor.
     * 
     * @return an Enumeration over all eu.dca.model.RoleActor
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.RoleActor> enumerateRoleActor(
    ) {
        return this._roleActorList.elements();
    }

    /**
     * Method getAttributionQualifierActor.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * eu.dca.model.AttributionQualifierActor at the given index
     */
    public eu.dca.model.AttributionQualifierActor getAttributionQualifierActor(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._attributionQualifierActorList.size()) {
            throw new IndexOutOfBoundsException("getAttributionQualifierActor: Index value '" + index + "' not in range [0.." + (this._attributionQualifierActorList.size() - 1) + "]");
        }

        return (eu.dca.model.AttributionQualifierActor) _attributionQualifierActorList.get(index);
    }

    /**
     * Method getAttributionQualifierActor.Returns the contents of
     * the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.AttributionQualifierActor[] getAttributionQualifierActor(
    ) {
        eu.dca.model.AttributionQualifierActor[] array = new eu.dca.model.AttributionQualifierActor[0];
        return (eu.dca.model.AttributionQualifierActor[]) this._attributionQualifierActorList.toArray(array);
    }

    /**
     * Method getAttributionQualifierActorCount.
     * 
     * @return the size of this collection
     */
    public int getAttributionQualifierActorCount(
    ) {
        return this._attributionQualifierActorList.size();
    }

    /**
     * Method getExtentActor.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.ExtentActor at the
     * given index
     */
    public eu.dca.model.ExtentActor getExtentActor(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._extentActorList.size()) {
            throw new IndexOutOfBoundsException("getExtentActor: Index value '" + index + "' not in range [0.." + (this._extentActorList.size() - 1) + "]");
        }

        return (eu.dca.model.ExtentActor) _extentActorList.get(index);
    }

    /**
     * Method getExtentActor.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.ExtentActor[] getExtentActor(
    ) {
        eu.dca.model.ExtentActor[] array = new eu.dca.model.ExtentActor[0];
        return (eu.dca.model.ExtentActor[]) this._extentActorList.toArray(array);
    }

    /**
     * Method getExtentActorCount.
     * 
     * @return the size of this collection
     */
    public int getExtentActorCount(
    ) {
        return this._extentActorList.size();
    }

    /**
     * Returns the value of field 'inRoleActor'. The field
     * 'inRoleActor' has the following description: Definition:
     * Contains structured identifying and indexing actor
     * information.
     * 
     * @return the value of field 'InRoleActor'.
     */
    public eu.dca.model.InRoleActor getInRoleActor(
    ) {
        return this._inRoleActor;
    }

    /**
     * Method getRoleActor.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.RoleActor at the given
     * index
     */
    public eu.dca.model.RoleActor getRoleActor(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._roleActorList.size()) {
            throw new IndexOutOfBoundsException("getRoleActor: Index value '" + index + "' not in range [0.." + (this._roleActorList.size() - 1) + "]");
        }

        return (eu.dca.model.RoleActor) _roleActorList.get(index);
    }

    /**
     * Method getRoleActor.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.RoleActor[] getRoleActor(
    ) {
        eu.dca.model.RoleActor[] array = new eu.dca.model.RoleActor[0];
        return (eu.dca.model.RoleActor[]) this._roleActorList.toArray(array);
    }

    /**
     * Method getRoleActorCount.
     * 
     * @return the size of this collection
     */
    public int getRoleActorCount(
    ) {
        return this._roleActorList.size();
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
    public void removeAllAttributionQualifierActor(
    ) {
        this._attributionQualifierActorList.clear();
    }

    /**
     */
    public void removeAllExtentActor(
    ) {
        this._extentActorList.clear();
    }

    /**
     */
    public void removeAllRoleActor(
    ) {
        this._roleActorList.clear();
    }

    /**
     * Method removeAttributionQualifierActor.
     * 
     * @param vAttributionQualifierActor
     * @return true if the object was removed from the collection.
     */
    public boolean removeAttributionQualifierActor(
            final eu.dca.model.AttributionQualifierActor vAttributionQualifierActor) {
        boolean removed = _attributionQualifierActorList.remove(vAttributionQualifierActor);
        return removed;
    }

    /**
     * Method removeAttributionQualifierActorAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.AttributionQualifierActor removeAttributionQualifierActorAt(
            final int index) {
        java.lang.Object obj = this._attributionQualifierActorList.remove(index);
        return (eu.dca.model.AttributionQualifierActor) obj;
    }

    /**
     * Method removeExtentActor.
     * 
     * @param vExtentActor
     * @return true if the object was removed from the collection.
     */
    public boolean removeExtentActor(
            final eu.dca.model.ExtentActor vExtentActor) {
        boolean removed = _extentActorList.remove(vExtentActor);
        return removed;
    }

    /**
     * Method removeExtentActorAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.ExtentActor removeExtentActorAt(
            final int index) {
        java.lang.Object obj = this._extentActorList.remove(index);
        return (eu.dca.model.ExtentActor) obj;
    }

    /**
     * Method removeRoleActor.
     * 
     * @param vRoleActor
     * @return true if the object was removed from the collection.
     */
    public boolean removeRoleActor(
            final eu.dca.model.RoleActor vRoleActor) {
        boolean removed = _roleActorList.remove(vRoleActor);
        return removed;
    }

    /**
     * Method removeRoleActorAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.RoleActor removeRoleActorAt(
            final int index) {
        java.lang.Object obj = this._roleActorList.remove(index);
        return (eu.dca.model.RoleActor) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vAttributionQualifierActor
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAttributionQualifierActor(
            final int index,
            final eu.dca.model.AttributionQualifierActor vAttributionQualifierActor)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._attributionQualifierActorList.size()) {
            throw new IndexOutOfBoundsException("setAttributionQualifierActor: Index value '" + index + "' not in range [0.." + (this._attributionQualifierActorList.size() - 1) + "]");
        }

        this._attributionQualifierActorList.set(index, vAttributionQualifierActor);
    }

    /**
     * 
     * 
     * @param vAttributionQualifierActorArray
     */
    public void setAttributionQualifierActor(
            final eu.dca.model.AttributionQualifierActor[] vAttributionQualifierActorArray) {
        //-- copy array
        _attributionQualifierActorList.clear();

        for (int i = 0; i < vAttributionQualifierActorArray.length; i++) {
                this._attributionQualifierActorList.add(vAttributionQualifierActorArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vExtentActor
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setExtentActor(
            final int index,
            final eu.dca.model.ExtentActor vExtentActor)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._extentActorList.size()) {
            throw new IndexOutOfBoundsException("setExtentActor: Index value '" + index + "' not in range [0.." + (this._extentActorList.size() - 1) + "]");
        }

        this._extentActorList.set(index, vExtentActor);
    }

    /**
     * 
     * 
     * @param vExtentActorArray
     */
    public void setExtentActor(
            final eu.dca.model.ExtentActor[] vExtentActorArray) {
        //-- copy array
        _extentActorList.clear();

        for (int i = 0; i < vExtentActorArray.length; i++) {
                this._extentActorList.add(vExtentActorArray[i]);
        }
    }

    /**
     * Sets the value of field 'inRoleActor'. The field
     * 'inRoleActor' has the following description: Definition:
     * Contains structured identifying and indexing actor
     * information.
     * 
     * @param inRoleActor the value of field 'inRoleActor'.
     */
    public void setInRoleActor(
            final eu.dca.model.InRoleActor inRoleActor) {
        this._inRoleActor = inRoleActor;
    }

    /**
     * 
     * 
     * @param index
     * @param vRoleActor
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setRoleActor(
            final int index,
            final eu.dca.model.RoleActor vRoleActor)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._roleActorList.size()) {
            throw new IndexOutOfBoundsException("setRoleActor: Index value '" + index + "' not in range [0.." + (this._roleActorList.size() - 1) + "]");
        }

        this._roleActorList.set(index, vRoleActor);
    }

    /**
     * 
     * 
     * @param vRoleActorArray
     */
    public void setRoleActor(
            final eu.dca.model.RoleActor[] vRoleActorArray) {
        //-- copy array
        _roleActorList.clear();

        for (int i = 0; i < vRoleActorArray.length; i++) {
                this._roleActorList.add(vRoleActorArray[i]);
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
