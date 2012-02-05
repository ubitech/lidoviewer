/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: Wrapper for display and index elements for an actor
 * with role information (participating in an event). For multiple
 * actors repeat the element.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class ActorInRoleSetComplexType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: Display element for an actor coupled with its
     * specific role, corresponding to the following actor element.
     */
    private java.util.Vector<eu.dca.model.DisplayActorInRole> _displayActorInRoleList;

    /**
     * Definition: Describes an actor with role and (if necessary)
     * attributions in a structured way, consisting of the
     * sub-elements actor, its role, attribution and extent.
     */
    private eu.dca.model.ActorInRole _actorInRole;


      //----------------/
     //- Constructors -/
    //----------------/

    public ActorInRoleSetComplexType() {
        super();
        this._displayActorInRoleList = new java.util.Vector<eu.dca.model.DisplayActorInRole>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vDisplayActorInRole
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDisplayActorInRole(
            final eu.dca.model.DisplayActorInRole vDisplayActorInRole)
    throws java.lang.IndexOutOfBoundsException {
        this._displayActorInRoleList.addElement(vDisplayActorInRole);
    }

    /**
     * 
     * 
     * @param index
     * @param vDisplayActorInRole
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDisplayActorInRole(
            final int index,
            final eu.dca.model.DisplayActorInRole vDisplayActorInRole)
    throws java.lang.IndexOutOfBoundsException {
        this._displayActorInRoleList.add(index, vDisplayActorInRole);
    }

    /**
     * Method enumerateDisplayActorInRole.
     * 
     * @return an Enumeration over all
     * eu.dca.model.DisplayActorInRole elements
     */
    public java.util.Enumeration<? extends eu.dca.model.DisplayActorInRole> enumerateDisplayActorInRole(
    ) {
        return this._displayActorInRoleList.elements();
    }

    /**
     * Returns the value of field 'actorInRole'. The field
     * 'actorInRole' has the following description: Definition:
     * Describes an actor with role and (if necessary) attributions
     * in a structured way, consisting of the sub-elements actor,
     * its role, attribution and extent.
     * 
     * @return the value of field 'ActorInRole'.
     */
    public eu.dca.model.ActorInRole getActorInRole(
    ) {
        return this._actorInRole;
    }

    /**
     * Method getDisplayActorInRole.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.DisplayActorInRole at
     * the given index
     */
    public eu.dca.model.DisplayActorInRole getDisplayActorInRole(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._displayActorInRoleList.size()) {
            throw new IndexOutOfBoundsException("getDisplayActorInRole: Index value '" + index + "' not in range [0.." + (this._displayActorInRoleList.size() - 1) + "]");
        }

        return (eu.dca.model.DisplayActorInRole) _displayActorInRoleList.get(index);
    }

    /**
     * Method getDisplayActorInRole.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.DisplayActorInRole[] getDisplayActorInRole(
    ) {
        eu.dca.model.DisplayActorInRole[] array = new eu.dca.model.DisplayActorInRole[0];
        return (eu.dca.model.DisplayActorInRole[]) this._displayActorInRoleList.toArray(array);
    }

    /**
     * Method getDisplayActorInRoleCount.
     * 
     * @return the size of this collection
     */
    public int getDisplayActorInRoleCount(
    ) {
        return this._displayActorInRoleList.size();
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
    public void removeAllDisplayActorInRole(
    ) {
        this._displayActorInRoleList.clear();
    }

    /**
     * Method removeDisplayActorInRole.
     * 
     * @param vDisplayActorInRole
     * @return true if the object was removed from the collection.
     */
    public boolean removeDisplayActorInRole(
            final eu.dca.model.DisplayActorInRole vDisplayActorInRole) {
        boolean removed = _displayActorInRoleList.remove(vDisplayActorInRole);
        return removed;
    }

    /**
     * Method removeDisplayActorInRoleAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.DisplayActorInRole removeDisplayActorInRoleAt(
            final int index) {
        java.lang.Object obj = this._displayActorInRoleList.remove(index);
        return (eu.dca.model.DisplayActorInRole) obj;
    }

    /**
     * Sets the value of field 'actorInRole'. The field
     * 'actorInRole' has the following description: Definition:
     * Describes an actor with role and (if necessary) attributions
     * in a structured way, consisting of the sub-elements actor,
     * its role, attribution and extent.
     * 
     * @param actorInRole the value of field 'actorInRole'.
     */
    public void setActorInRole(
            final eu.dca.model.ActorInRole actorInRole) {
        this._actorInRole = actorInRole;
    }

    /**
     * 
     * 
     * @param index
     * @param vDisplayActorInRole
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setDisplayActorInRole(
            final int index,
            final eu.dca.model.DisplayActorInRole vDisplayActorInRole)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._displayActorInRoleList.size()) {
            throw new IndexOutOfBoundsException("setDisplayActorInRole: Index value '" + index + "' not in range [0.." + (this._displayActorInRoleList.size() - 1) + "]");
        }

        this._displayActorInRoleList.set(index, vDisplayActorInRole);
    }

    /**
     * 
     * 
     * @param vDisplayActorInRoleArray
     */
    public void setDisplayActorInRole(
            final eu.dca.model.DisplayActorInRole[] vDisplayActorInRoleArray) {
        //-- copy array
        _displayActorInRoleList.clear();

        for (int i = 0; i < vDisplayActorInRoleArray.length; i++) {
                this._displayActorInRoleList.add(vDisplayActorInRoleArray[i]);
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
