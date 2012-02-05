/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: Contains identifying and indexing actor
 * information.How to record: Data values of the type attribute:
 * person, corporation, family, group. 
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class ActorComplexType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: Indicates if the actor is an individual, a group
     * of individuals, a family or a corporation (firm or other
     * corporate body).
     */
    private java.lang.String _type;

    /**
     * Definition: A unique identifier for the actor.
     */
    private java.util.Vector<eu.dca.model.ActorID> _actorIDList;

    /**
     * Definition: A wrapper for name elements.
     */
    private java.util.Vector<eu.dca.model.NameActorSet> _nameActorSetList;

    /**
     * Definition: National or cultural affiliation of the person
     * or corporate body. 
     */
    private java.util.Vector<eu.dca.model.NationalityActor> _nationalityActorList;

    /**
     * Definition: The lifespan of the person or the existence of
     * the corporate body or group. 
     */
    private eu.dca.model.VitalDatesActor _vitalDatesActor;

    /**
     * Definition: The sex of the individual. 
     */
    private java.util.Vector<eu.dca.model.GenderActor> _genderActorList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ActorComplexType() {
        super();
        this._actorIDList = new java.util.Vector<eu.dca.model.ActorID>();
        this._nameActorSetList = new java.util.Vector<eu.dca.model.NameActorSet>();
        this._nationalityActorList = new java.util.Vector<eu.dca.model.NationalityActor>();
        this._genderActorList = new java.util.Vector<eu.dca.model.GenderActor>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vActorID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addActorID(
            final eu.dca.model.ActorID vActorID)
    throws java.lang.IndexOutOfBoundsException {
        this._actorIDList.addElement(vActorID);
    }

    /**
     * 
     * 
     * @param index
     * @param vActorID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addActorID(
            final int index,
            final eu.dca.model.ActorID vActorID)
    throws java.lang.IndexOutOfBoundsException {
        this._actorIDList.add(index, vActorID);
    }

    /**
     * 
     * 
     * @param vGenderActor
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addGenderActor(
            final eu.dca.model.GenderActor vGenderActor)
    throws java.lang.IndexOutOfBoundsException {
        this._genderActorList.addElement(vGenderActor);
    }

    /**
     * 
     * 
     * @param index
     * @param vGenderActor
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addGenderActor(
            final int index,
            final eu.dca.model.GenderActor vGenderActor)
    throws java.lang.IndexOutOfBoundsException {
        this._genderActorList.add(index, vGenderActor);
    }

    /**
     * 
     * 
     * @param vNameActorSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addNameActorSet(
            final eu.dca.model.NameActorSet vNameActorSet)
    throws java.lang.IndexOutOfBoundsException {
        this._nameActorSetList.addElement(vNameActorSet);
    }

    /**
     * 
     * 
     * @param index
     * @param vNameActorSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addNameActorSet(
            final int index,
            final eu.dca.model.NameActorSet vNameActorSet)
    throws java.lang.IndexOutOfBoundsException {
        this._nameActorSetList.add(index, vNameActorSet);
    }

    /**
     * 
     * 
     * @param vNationalityActor
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addNationalityActor(
            final eu.dca.model.NationalityActor vNationalityActor)
    throws java.lang.IndexOutOfBoundsException {
        this._nationalityActorList.addElement(vNationalityActor);
    }

    /**
     * 
     * 
     * @param index
     * @param vNationalityActor
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addNationalityActor(
            final int index,
            final eu.dca.model.NationalityActor vNationalityActor)
    throws java.lang.IndexOutOfBoundsException {
        this._nationalityActorList.add(index, vNationalityActor);
    }

    /**
     * Method enumerateActorID.
     * 
     * @return an Enumeration over all eu.dca.model.ActorID elements
     */
    public java.util.Enumeration<? extends eu.dca.model.ActorID> enumerateActorID(
    ) {
        return this._actorIDList.elements();
    }

    /**
     * Method enumerateGenderActor.
     * 
     * @return an Enumeration over all eu.dca.model.GenderActor
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.GenderActor> enumerateGenderActor(
    ) {
        return this._genderActorList.elements();
    }

    /**
     * Method enumerateNameActorSet.
     * 
     * @return an Enumeration over all eu.dca.model.NameActorSet
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.NameActorSet> enumerateNameActorSet(
    ) {
        return this._nameActorSetList.elements();
    }

    /**
     * Method enumerateNationalityActor.
     * 
     * @return an Enumeration over all
     * eu.dca.model.NationalityActor elements
     */
    public java.util.Enumeration<? extends eu.dca.model.NationalityActor> enumerateNationalityActor(
    ) {
        return this._nationalityActorList.elements();
    }

    /**
     * Method getActorID.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.ActorID at the given
     * index
     */
    public eu.dca.model.ActorID getActorID(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._actorIDList.size()) {
            throw new IndexOutOfBoundsException("getActorID: Index value '" + index + "' not in range [0.." + (this._actorIDList.size() - 1) + "]");
        }

        return (eu.dca.model.ActorID) _actorIDList.get(index);
    }

    /**
     * Method getActorID.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.ActorID[] getActorID(
    ) {
        eu.dca.model.ActorID[] array = new eu.dca.model.ActorID[0];
        return (eu.dca.model.ActorID[]) this._actorIDList.toArray(array);
    }

    /**
     * Method getActorIDCount.
     * 
     * @return the size of this collection
     */
    public int getActorIDCount(
    ) {
        return this._actorIDList.size();
    }

    /**
     * Method getGenderActor.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.GenderActor at the
     * given index
     */
    public eu.dca.model.GenderActor getGenderActor(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._genderActorList.size()) {
            throw new IndexOutOfBoundsException("getGenderActor: Index value '" + index + "' not in range [0.." + (this._genderActorList.size() - 1) + "]");
        }

        return (eu.dca.model.GenderActor) _genderActorList.get(index);
    }

    /**
     * Method getGenderActor.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.GenderActor[] getGenderActor(
    ) {
        eu.dca.model.GenderActor[] array = new eu.dca.model.GenderActor[0];
        return (eu.dca.model.GenderActor[]) this._genderActorList.toArray(array);
    }

    /**
     * Method getGenderActorCount.
     * 
     * @return the size of this collection
     */
    public int getGenderActorCount(
    ) {
        return this._genderActorList.size();
    }

    /**
     * Method getNameActorSet.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.NameActorSet at the
     * given index
     */
    public eu.dca.model.NameActorSet getNameActorSet(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._nameActorSetList.size()) {
            throw new IndexOutOfBoundsException("getNameActorSet: Index value '" + index + "' not in range [0.." + (this._nameActorSetList.size() - 1) + "]");
        }

        return (eu.dca.model.NameActorSet) _nameActorSetList.get(index);
    }

    /**
     * Method getNameActorSet.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.NameActorSet[] getNameActorSet(
    ) {
        eu.dca.model.NameActorSet[] array = new eu.dca.model.NameActorSet[0];
        return (eu.dca.model.NameActorSet[]) this._nameActorSetList.toArray(array);
    }

    /**
     * Method getNameActorSetCount.
     * 
     * @return the size of this collection
     */
    public int getNameActorSetCount(
    ) {
        return this._nameActorSetList.size();
    }

    /**
     * Method getNationalityActor.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.NationalityActor at
     * the given index
     */
    public eu.dca.model.NationalityActor getNationalityActor(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._nationalityActorList.size()) {
            throw new IndexOutOfBoundsException("getNationalityActor: Index value '" + index + "' not in range [0.." + (this._nationalityActorList.size() - 1) + "]");
        }

        return (eu.dca.model.NationalityActor) _nationalityActorList.get(index);
    }

    /**
     * Method getNationalityActor.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.NationalityActor[] getNationalityActor(
    ) {
        eu.dca.model.NationalityActor[] array = new eu.dca.model.NationalityActor[0];
        return (eu.dca.model.NationalityActor[]) this._nationalityActorList.toArray(array);
    }

    /**
     * Method getNationalityActorCount.
     * 
     * @return the size of this collection
     */
    public int getNationalityActorCount(
    ) {
        return this._nationalityActorList.size();
    }

    /**
     * Returns the value of field 'type'. The field 'type' has the
     * following description: Definition: Indicates if the actor is
     * an individual, a group of individuals, a family or a
     * corporation (firm or other corporate body).
     * 
     * @return the value of field 'Type'.
     */
    public java.lang.String getType(
    ) {
        return this._type;
    }

    /**
     * Returns the value of field 'vitalDatesActor'. The field
     * 'vitalDatesActor' has the following description: Definition:
     * The lifespan of the person or the existence of the corporate
     * body or group. 
     * 
     * @return the value of field 'VitalDatesActor'.
     */
    public eu.dca.model.VitalDatesActor getVitalDatesActor(
    ) {
        return this._vitalDatesActor;
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
     * Method removeActorID.
     * 
     * @param vActorID
     * @return true if the object was removed from the collection.
     */
    public boolean removeActorID(
            final eu.dca.model.ActorID vActorID) {
        boolean removed = _actorIDList.remove(vActorID);
        return removed;
    }

    /**
     * Method removeActorIDAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.ActorID removeActorIDAt(
            final int index) {
        java.lang.Object obj = this._actorIDList.remove(index);
        return (eu.dca.model.ActorID) obj;
    }

    /**
     */
    public void removeAllActorID(
    ) {
        this._actorIDList.clear();
    }

    /**
     */
    public void removeAllGenderActor(
    ) {
        this._genderActorList.clear();
    }

    /**
     */
    public void removeAllNameActorSet(
    ) {
        this._nameActorSetList.clear();
    }

    /**
     */
    public void removeAllNationalityActor(
    ) {
        this._nationalityActorList.clear();
    }

    /**
     * Method removeGenderActor.
     * 
     * @param vGenderActor
     * @return true if the object was removed from the collection.
     */
    public boolean removeGenderActor(
            final eu.dca.model.GenderActor vGenderActor) {
        boolean removed = _genderActorList.remove(vGenderActor);
        return removed;
    }

    /**
     * Method removeGenderActorAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.GenderActor removeGenderActorAt(
            final int index) {
        java.lang.Object obj = this._genderActorList.remove(index);
        return (eu.dca.model.GenderActor) obj;
    }

    /**
     * Method removeNameActorSet.
     * 
     * @param vNameActorSet
     * @return true if the object was removed from the collection.
     */
    public boolean removeNameActorSet(
            final eu.dca.model.NameActorSet vNameActorSet) {
        boolean removed = _nameActorSetList.remove(vNameActorSet);
        return removed;
    }

    /**
     * Method removeNameActorSetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.NameActorSet removeNameActorSetAt(
            final int index) {
        java.lang.Object obj = this._nameActorSetList.remove(index);
        return (eu.dca.model.NameActorSet) obj;
    }

    /**
     * Method removeNationalityActor.
     * 
     * @param vNationalityActor
     * @return true if the object was removed from the collection.
     */
    public boolean removeNationalityActor(
            final eu.dca.model.NationalityActor vNationalityActor) {
        boolean removed = _nationalityActorList.remove(vNationalityActor);
        return removed;
    }

    /**
     * Method removeNationalityActorAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.NationalityActor removeNationalityActorAt(
            final int index) {
        java.lang.Object obj = this._nationalityActorList.remove(index);
        return (eu.dca.model.NationalityActor) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vActorID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setActorID(
            final int index,
            final eu.dca.model.ActorID vActorID)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._actorIDList.size()) {
            throw new IndexOutOfBoundsException("setActorID: Index value '" + index + "' not in range [0.." + (this._actorIDList.size() - 1) + "]");
        }

        this._actorIDList.set(index, vActorID);
    }

    /**
     * 
     * 
     * @param vActorIDArray
     */
    public void setActorID(
            final eu.dca.model.ActorID[] vActorIDArray) {
        //-- copy array
        _actorIDList.clear();

        for (int i = 0; i < vActorIDArray.length; i++) {
                this._actorIDList.add(vActorIDArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vGenderActor
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setGenderActor(
            final int index,
            final eu.dca.model.GenderActor vGenderActor)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._genderActorList.size()) {
            throw new IndexOutOfBoundsException("setGenderActor: Index value '" + index + "' not in range [0.." + (this._genderActorList.size() - 1) + "]");
        }

        this._genderActorList.set(index, vGenderActor);
    }

    /**
     * 
     * 
     * @param vGenderActorArray
     */
    public void setGenderActor(
            final eu.dca.model.GenderActor[] vGenderActorArray) {
        //-- copy array
        _genderActorList.clear();

        for (int i = 0; i < vGenderActorArray.length; i++) {
                this._genderActorList.add(vGenderActorArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vNameActorSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setNameActorSet(
            final int index,
            final eu.dca.model.NameActorSet vNameActorSet)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._nameActorSetList.size()) {
            throw new IndexOutOfBoundsException("setNameActorSet: Index value '" + index + "' not in range [0.." + (this._nameActorSetList.size() - 1) + "]");
        }

        this._nameActorSetList.set(index, vNameActorSet);
    }

    /**
     * 
     * 
     * @param vNameActorSetArray
     */
    public void setNameActorSet(
            final eu.dca.model.NameActorSet[] vNameActorSetArray) {
        //-- copy array
        _nameActorSetList.clear();

        for (int i = 0; i < vNameActorSetArray.length; i++) {
                this._nameActorSetList.add(vNameActorSetArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vNationalityActor
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setNationalityActor(
            final int index,
            final eu.dca.model.NationalityActor vNationalityActor)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._nationalityActorList.size()) {
            throw new IndexOutOfBoundsException("setNationalityActor: Index value '" + index + "' not in range [0.." + (this._nationalityActorList.size() - 1) + "]");
        }

        this._nationalityActorList.set(index, vNationalityActor);
    }

    /**
     * 
     * 
     * @param vNationalityActorArray
     */
    public void setNationalityActor(
            final eu.dca.model.NationalityActor[] vNationalityActorArray) {
        //-- copy array
        _nationalityActorList.clear();

        for (int i = 0; i < vNationalityActorArray.length; i++) {
                this._nationalityActorList.add(vNationalityActorArray[i]);
        }
    }

    /**
     * Sets the value of field 'type'. The field 'type' has the
     * following description: Definition: Indicates if the actor is
     * an individual, a group of individuals, a family or a
     * corporation (firm or other corporate body).
     * 
     * @param type the value of field 'type'.
     */
    public void setType(
            final java.lang.String type) {
        this._type = type;
    }

    /**
     * Sets the value of field 'vitalDatesActor'. The field
     * 'vitalDatesActor' has the following description: Definition:
     * The lifespan of the person or the existence of the corporate
     * body or group. 
     * 
     * @param vitalDatesActor the value of field 'vitalDatesActor'.
     */
    public void setVitalDatesActor(
            final eu.dca.model.VitalDatesActor vitalDatesActor) {
        this._vitalDatesActor = vitalDatesActor;
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
