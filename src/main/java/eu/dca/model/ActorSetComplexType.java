/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: Wrapper for display and index elements for one
 * actor. For multiple actors repeat this element.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class ActorSetComplexType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: Display element for one actor, corresponding to
     * the following actor element.
     */
    private java.util.Vector<eu.dca.model.DisplayActor> _displayActorList;

    /**
     * Definition: Describes and identifies an actor, i.e. a
     * person, corporation, family or group, containing structured
     * sub-elements for indexing and identification references. 
     */
    private eu.dca.model.Actor _actor;


      //----------------/
     //- Constructors -/
    //----------------/

    public ActorSetComplexType() {
        super();
        this._displayActorList = new java.util.Vector<eu.dca.model.DisplayActor>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vDisplayActor
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDisplayActor(
            final eu.dca.model.DisplayActor vDisplayActor)
    throws java.lang.IndexOutOfBoundsException {
        this._displayActorList.addElement(vDisplayActor);
    }

    /**
     * 
     * 
     * @param index
     * @param vDisplayActor
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDisplayActor(
            final int index,
            final eu.dca.model.DisplayActor vDisplayActor)
    throws java.lang.IndexOutOfBoundsException {
        this._displayActorList.add(index, vDisplayActor);
    }

    /**
     * Method enumerateDisplayActor.
     * 
     * @return an Enumeration over all eu.dca.model.DisplayActor
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.DisplayActor> enumerateDisplayActor(
    ) {
        return this._displayActorList.elements();
    }

    /**
     * Returns the value of field 'actor'. The field 'actor' has
     * the following description: Definition: Describes and
     * identifies an actor, i.e. a person, corporation, family or
     * group, containing structured sub-elements for indexing and
     * identification references. 
     * 
     * @return the value of field 'Actor'.
     */
    public eu.dca.model.Actor getActor(
    ) {
        return this._actor;
    }

    /**
     * Method getDisplayActor.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.DisplayActor at the
     * given index
     */
    public eu.dca.model.DisplayActor getDisplayActor(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._displayActorList.size()) {
            throw new IndexOutOfBoundsException("getDisplayActor: Index value '" + index + "' not in range [0.." + (this._displayActorList.size() - 1) + "]");
        }

        return (eu.dca.model.DisplayActor) _displayActorList.get(index);
    }

    /**
     * Method getDisplayActor.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.DisplayActor[] getDisplayActor(
    ) {
        eu.dca.model.DisplayActor[] array = new eu.dca.model.DisplayActor[0];
        return (eu.dca.model.DisplayActor[]) this._displayActorList.toArray(array);
    }

    /**
     * Method getDisplayActorCount.
     * 
     * @return the size of this collection
     */
    public int getDisplayActorCount(
    ) {
        return this._displayActorList.size();
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
    public void removeAllDisplayActor(
    ) {
        this._displayActorList.clear();
    }

    /**
     * Method removeDisplayActor.
     * 
     * @param vDisplayActor
     * @return true if the object was removed from the collection.
     */
    public boolean removeDisplayActor(
            final eu.dca.model.DisplayActor vDisplayActor) {
        boolean removed = _displayActorList.remove(vDisplayActor);
        return removed;
    }

    /**
     * Method removeDisplayActorAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.DisplayActor removeDisplayActorAt(
            final int index) {
        java.lang.Object obj = this._displayActorList.remove(index);
        return (eu.dca.model.DisplayActor) obj;
    }

    /**
     * Sets the value of field 'actor'. The field 'actor' has the
     * following description: Definition: Describes and identifies
     * an actor, i.e. a person, corporation, family or group,
     * containing structured sub-elements for indexing and
     * identification references. 
     * 
     * @param actor the value of field 'actor'.
     */
    public void setActor(
            final eu.dca.model.Actor actor) {
        this._actor = actor;
    }

    /**
     * 
     * 
     * @param index
     * @param vDisplayActor
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setDisplayActor(
            final int index,
            final eu.dca.model.DisplayActor vDisplayActor)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._displayActorList.size()) {
            throw new IndexOutOfBoundsException("setDisplayActor: Index value '" + index + "' not in range [0.." + (this._displayActorList.size() - 1) + "]");
        }

        this._displayActorList.set(index, vDisplayActor);
    }

    /**
     * 
     * 
     * @param vDisplayActorArray
     */
    public void setDisplayActor(
            final eu.dca.model.DisplayActor[] vDisplayActorArray) {
        //-- copy array
        _displayActorList.clear();

        for (int i = 0; i < vDisplayActorArray.length; i++) {
                this._displayActorList.add(vDisplayActorArray[i]);
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
