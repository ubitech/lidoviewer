/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: A wrapper for one set of Subject Indexing
 * information. How to record: If an object / work has multiple
 * parts or otherwise has separate, multiple subjects, repeat the
 * superordinate Subject Set element and use Extent Subject. The
 * superordinate Subject Set element may also be repeated to
 * distinguish between subjects that reflect what an object / work
 * is of (description and identification) from what it is about
 * (interpretation).Notes: While not required, it is highly
 * recommended to include subject information, even for
 * non-objective art, for which the function or purpose of the
 * object / work may be included as subject.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class SubjectComplexType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: Qualifies the type of information given in the
     * holding element. 
     */
    private java.lang.String _type;

    /**
     * Definition: When there are multiple subjects, a term
     * indicating the part of the object / work to which these
     * subject terms apply.
     */
    private java.util.Vector<eu.dca.model.ExtentSubject> _extentSubjectList;

    /**
     * Definition: Provides references to concepts related to the
     * subject of the described object / work. 
     */
    private java.util.Vector<eu.dca.model.SubjectConcept> _subjectConceptList;

    /**
     * Definition: A person, group, or institution depicted in or
     * by an object / work, or what it is about, provided as
     * display and index elements. 
     */
    private java.util.Vector<eu.dca.model.SubjectActor> _subjectActorList;

    /**
     * Definition: A time specification depicted in or by an object
     * / work, or what it is about, provided as display and index
     * elements. 
     */
    private java.util.Vector<eu.dca.model.SubjectDate> _subjectDateList;

    /**
     * Definition: An event depicted in or by an object / work, or
     * what it is about, provided as display and index elements. 
     */
    private java.util.Vector<eu.dca.model.SubjectEvent> _subjectEventList;

    /**
     * Definition: A place depicted in or by an object / work, or
     * what it is about, provided as display and index elements. 
     */
    private java.util.Vector<eu.dca.model.SubjectPlace> _subjectPlaceList;

    /**
     * Definition: An object - e.g. a building or a work of art
     * depicted in or by an object / work, or what it is about,
     * provided as display and index elements. 
     */
    private java.util.Vector<eu.dca.model.SubjectObject> _subjectObjectList;


      //----------------/
     //- Constructors -/
    //----------------/

    public SubjectComplexType() {
        super();
        this._extentSubjectList = new java.util.Vector<eu.dca.model.ExtentSubject>();
        this._subjectConceptList = new java.util.Vector<eu.dca.model.SubjectConcept>();
        this._subjectActorList = new java.util.Vector<eu.dca.model.SubjectActor>();
        this._subjectDateList = new java.util.Vector<eu.dca.model.SubjectDate>();
        this._subjectEventList = new java.util.Vector<eu.dca.model.SubjectEvent>();
        this._subjectPlaceList = new java.util.Vector<eu.dca.model.SubjectPlace>();
        this._subjectObjectList = new java.util.Vector<eu.dca.model.SubjectObject>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vExtentSubject
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addExtentSubject(
            final eu.dca.model.ExtentSubject vExtentSubject)
    throws java.lang.IndexOutOfBoundsException {
        this._extentSubjectList.addElement(vExtentSubject);
    }

    /**
     * 
     * 
     * @param index
     * @param vExtentSubject
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addExtentSubject(
            final int index,
            final eu.dca.model.ExtentSubject vExtentSubject)
    throws java.lang.IndexOutOfBoundsException {
        this._extentSubjectList.add(index, vExtentSubject);
    }

    /**
     * 
     * 
     * @param vSubjectActor
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSubjectActor(
            final eu.dca.model.SubjectActor vSubjectActor)
    throws java.lang.IndexOutOfBoundsException {
        this._subjectActorList.addElement(vSubjectActor);
    }

    /**
     * 
     * 
     * @param index
     * @param vSubjectActor
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSubjectActor(
            final int index,
            final eu.dca.model.SubjectActor vSubjectActor)
    throws java.lang.IndexOutOfBoundsException {
        this._subjectActorList.add(index, vSubjectActor);
    }

    /**
     * 
     * 
     * @param vSubjectConcept
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSubjectConcept(
            final eu.dca.model.SubjectConcept vSubjectConcept)
    throws java.lang.IndexOutOfBoundsException {
        this._subjectConceptList.addElement(vSubjectConcept);
    }

    /**
     * 
     * 
     * @param index
     * @param vSubjectConcept
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSubjectConcept(
            final int index,
            final eu.dca.model.SubjectConcept vSubjectConcept)
    throws java.lang.IndexOutOfBoundsException {
        this._subjectConceptList.add(index, vSubjectConcept);
    }

    /**
     * 
     * 
     * @param vSubjectDate
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSubjectDate(
            final eu.dca.model.SubjectDate vSubjectDate)
    throws java.lang.IndexOutOfBoundsException {
        this._subjectDateList.addElement(vSubjectDate);
    }

    /**
     * 
     * 
     * @param index
     * @param vSubjectDate
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSubjectDate(
            final int index,
            final eu.dca.model.SubjectDate vSubjectDate)
    throws java.lang.IndexOutOfBoundsException {
        this._subjectDateList.add(index, vSubjectDate);
    }

    /**
     * 
     * 
     * @param vSubjectEvent
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSubjectEvent(
            final eu.dca.model.SubjectEvent vSubjectEvent)
    throws java.lang.IndexOutOfBoundsException {
        this._subjectEventList.addElement(vSubjectEvent);
    }

    /**
     * 
     * 
     * @param index
     * @param vSubjectEvent
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSubjectEvent(
            final int index,
            final eu.dca.model.SubjectEvent vSubjectEvent)
    throws java.lang.IndexOutOfBoundsException {
        this._subjectEventList.add(index, vSubjectEvent);
    }

    /**
     * 
     * 
     * @param vSubjectObject
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSubjectObject(
            final eu.dca.model.SubjectObject vSubjectObject)
    throws java.lang.IndexOutOfBoundsException {
        this._subjectObjectList.addElement(vSubjectObject);
    }

    /**
     * 
     * 
     * @param index
     * @param vSubjectObject
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSubjectObject(
            final int index,
            final eu.dca.model.SubjectObject vSubjectObject)
    throws java.lang.IndexOutOfBoundsException {
        this._subjectObjectList.add(index, vSubjectObject);
    }

    /**
     * 
     * 
     * @param vSubjectPlace
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSubjectPlace(
            final eu.dca.model.SubjectPlace vSubjectPlace)
    throws java.lang.IndexOutOfBoundsException {
        this._subjectPlaceList.addElement(vSubjectPlace);
    }

    /**
     * 
     * 
     * @param index
     * @param vSubjectPlace
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSubjectPlace(
            final int index,
            final eu.dca.model.SubjectPlace vSubjectPlace)
    throws java.lang.IndexOutOfBoundsException {
        this._subjectPlaceList.add(index, vSubjectPlace);
    }

    /**
     * Method enumerateExtentSubject.
     * 
     * @return an Enumeration over all eu.dca.model.ExtentSubject
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.ExtentSubject> enumerateExtentSubject(
    ) {
        return this._extentSubjectList.elements();
    }

    /**
     * Method enumerateSubjectActor.
     * 
     * @return an Enumeration over all eu.dca.model.SubjectActor
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.SubjectActor> enumerateSubjectActor(
    ) {
        return this._subjectActorList.elements();
    }

    /**
     * Method enumerateSubjectConcept.
     * 
     * @return an Enumeration over all eu.dca.model.SubjectConcept
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.SubjectConcept> enumerateSubjectConcept(
    ) {
        return this._subjectConceptList.elements();
    }

    /**
     * Method enumerateSubjectDate.
     * 
     * @return an Enumeration over all eu.dca.model.SubjectDate
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.SubjectDate> enumerateSubjectDate(
    ) {
        return this._subjectDateList.elements();
    }

    /**
     * Method enumerateSubjectEvent.
     * 
     * @return an Enumeration over all eu.dca.model.SubjectEvent
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.SubjectEvent> enumerateSubjectEvent(
    ) {
        return this._subjectEventList.elements();
    }

    /**
     * Method enumerateSubjectObject.
     * 
     * @return an Enumeration over all eu.dca.model.SubjectObject
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.SubjectObject> enumerateSubjectObject(
    ) {
        return this._subjectObjectList.elements();
    }

    /**
     * Method enumerateSubjectPlace.
     * 
     * @return an Enumeration over all eu.dca.model.SubjectPlace
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.SubjectPlace> enumerateSubjectPlace(
    ) {
        return this._subjectPlaceList.elements();
    }

    /**
     * Method getExtentSubject.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.ExtentSubject at the
     * given index
     */
    public eu.dca.model.ExtentSubject getExtentSubject(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._extentSubjectList.size()) {
            throw new IndexOutOfBoundsException("getExtentSubject: Index value '" + index + "' not in range [0.." + (this._extentSubjectList.size() - 1) + "]");
        }

        return (eu.dca.model.ExtentSubject) _extentSubjectList.get(index);
    }

    /**
     * Method getExtentSubject.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.ExtentSubject[] getExtentSubject(
    ) {
        eu.dca.model.ExtentSubject[] array = new eu.dca.model.ExtentSubject[0];
        return (eu.dca.model.ExtentSubject[]) this._extentSubjectList.toArray(array);
    }

    /**
     * Method getExtentSubjectCount.
     * 
     * @return the size of this collection
     */
    public int getExtentSubjectCount(
    ) {
        return this._extentSubjectList.size();
    }

    /**
     * Method getSubjectActor.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.SubjectActor at the
     * given index
     */
    public eu.dca.model.SubjectActor getSubjectActor(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._subjectActorList.size()) {
            throw new IndexOutOfBoundsException("getSubjectActor: Index value '" + index + "' not in range [0.." + (this._subjectActorList.size() - 1) + "]");
        }

        return (eu.dca.model.SubjectActor) _subjectActorList.get(index);
    }

    /**
     * Method getSubjectActor.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.SubjectActor[] getSubjectActor(
    ) {
        eu.dca.model.SubjectActor[] array = new eu.dca.model.SubjectActor[0];
        return (eu.dca.model.SubjectActor[]) this._subjectActorList.toArray(array);
    }

    /**
     * Method getSubjectActorCount.
     * 
     * @return the size of this collection
     */
    public int getSubjectActorCount(
    ) {
        return this._subjectActorList.size();
    }

    /**
     * Method getSubjectConcept.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.SubjectConcept at the
     * given index
     */
    public eu.dca.model.SubjectConcept getSubjectConcept(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._subjectConceptList.size()) {
            throw new IndexOutOfBoundsException("getSubjectConcept: Index value '" + index + "' not in range [0.." + (this._subjectConceptList.size() - 1) + "]");
        }

        return (eu.dca.model.SubjectConcept) _subjectConceptList.get(index);
    }

    /**
     * Method getSubjectConcept.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.SubjectConcept[] getSubjectConcept(
    ) {
        eu.dca.model.SubjectConcept[] array = new eu.dca.model.SubjectConcept[0];
        return (eu.dca.model.SubjectConcept[]) this._subjectConceptList.toArray(array);
    }

    /**
     * Method getSubjectConceptCount.
     * 
     * @return the size of this collection
     */
    public int getSubjectConceptCount(
    ) {
        return this._subjectConceptList.size();
    }

    /**
     * Method getSubjectDate.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.SubjectDate at the
     * given index
     */
    public eu.dca.model.SubjectDate getSubjectDate(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._subjectDateList.size()) {
            throw new IndexOutOfBoundsException("getSubjectDate: Index value '" + index + "' not in range [0.." + (this._subjectDateList.size() - 1) + "]");
        }

        return (eu.dca.model.SubjectDate) _subjectDateList.get(index);
    }

    /**
     * Method getSubjectDate.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.SubjectDate[] getSubjectDate(
    ) {
        eu.dca.model.SubjectDate[] array = new eu.dca.model.SubjectDate[0];
        return (eu.dca.model.SubjectDate[]) this._subjectDateList.toArray(array);
    }

    /**
     * Method getSubjectDateCount.
     * 
     * @return the size of this collection
     */
    public int getSubjectDateCount(
    ) {
        return this._subjectDateList.size();
    }

    /**
     * Method getSubjectEvent.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.SubjectEvent at the
     * given index
     */
    public eu.dca.model.SubjectEvent getSubjectEvent(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._subjectEventList.size()) {
            throw new IndexOutOfBoundsException("getSubjectEvent: Index value '" + index + "' not in range [0.." + (this._subjectEventList.size() - 1) + "]");
        }

        return (eu.dca.model.SubjectEvent) _subjectEventList.get(index);
    }

    /**
     * Method getSubjectEvent.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.SubjectEvent[] getSubjectEvent(
    ) {
        eu.dca.model.SubjectEvent[] array = new eu.dca.model.SubjectEvent[0];
        return (eu.dca.model.SubjectEvent[]) this._subjectEventList.toArray(array);
    }

    /**
     * Method getSubjectEventCount.
     * 
     * @return the size of this collection
     */
    public int getSubjectEventCount(
    ) {
        return this._subjectEventList.size();
    }

    /**
     * Method getSubjectObject.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.SubjectObject at the
     * given index
     */
    public eu.dca.model.SubjectObject getSubjectObject(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._subjectObjectList.size()) {
            throw new IndexOutOfBoundsException("getSubjectObject: Index value '" + index + "' not in range [0.." + (this._subjectObjectList.size() - 1) + "]");
        }

        return (eu.dca.model.SubjectObject) _subjectObjectList.get(index);
    }

    /**
     * Method getSubjectObject.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.SubjectObject[] getSubjectObject(
    ) {
        eu.dca.model.SubjectObject[] array = new eu.dca.model.SubjectObject[0];
        return (eu.dca.model.SubjectObject[]) this._subjectObjectList.toArray(array);
    }

    /**
     * Method getSubjectObjectCount.
     * 
     * @return the size of this collection
     */
    public int getSubjectObjectCount(
    ) {
        return this._subjectObjectList.size();
    }

    /**
     * Method getSubjectPlace.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.SubjectPlace at the
     * given index
     */
    public eu.dca.model.SubjectPlace getSubjectPlace(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._subjectPlaceList.size()) {
            throw new IndexOutOfBoundsException("getSubjectPlace: Index value '" + index + "' not in range [0.." + (this._subjectPlaceList.size() - 1) + "]");
        }

        return (eu.dca.model.SubjectPlace) _subjectPlaceList.get(index);
    }

    /**
     * Method getSubjectPlace.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.SubjectPlace[] getSubjectPlace(
    ) {
        eu.dca.model.SubjectPlace[] array = new eu.dca.model.SubjectPlace[0];
        return (eu.dca.model.SubjectPlace[]) this._subjectPlaceList.toArray(array);
    }

    /**
     * Method getSubjectPlaceCount.
     * 
     * @return the size of this collection
     */
    public int getSubjectPlaceCount(
    ) {
        return this._subjectPlaceList.size();
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
     */
    public void removeAllExtentSubject(
    ) {
        this._extentSubjectList.clear();
    }

    /**
     */
    public void removeAllSubjectActor(
    ) {
        this._subjectActorList.clear();
    }

    /**
     */
    public void removeAllSubjectConcept(
    ) {
        this._subjectConceptList.clear();
    }

    /**
     */
    public void removeAllSubjectDate(
    ) {
        this._subjectDateList.clear();
    }

    /**
     */
    public void removeAllSubjectEvent(
    ) {
        this._subjectEventList.clear();
    }

    /**
     */
    public void removeAllSubjectObject(
    ) {
        this._subjectObjectList.clear();
    }

    /**
     */
    public void removeAllSubjectPlace(
    ) {
        this._subjectPlaceList.clear();
    }

    /**
     * Method removeExtentSubject.
     * 
     * @param vExtentSubject
     * @return true if the object was removed from the collection.
     */
    public boolean removeExtentSubject(
            final eu.dca.model.ExtentSubject vExtentSubject) {
        boolean removed = _extentSubjectList.remove(vExtentSubject);
        return removed;
    }

    /**
     * Method removeExtentSubjectAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.ExtentSubject removeExtentSubjectAt(
            final int index) {
        java.lang.Object obj = this._extentSubjectList.remove(index);
        return (eu.dca.model.ExtentSubject) obj;
    }

    /**
     * Method removeSubjectActor.
     * 
     * @param vSubjectActor
     * @return true if the object was removed from the collection.
     */
    public boolean removeSubjectActor(
            final eu.dca.model.SubjectActor vSubjectActor) {
        boolean removed = _subjectActorList.remove(vSubjectActor);
        return removed;
    }

    /**
     * Method removeSubjectActorAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.SubjectActor removeSubjectActorAt(
            final int index) {
        java.lang.Object obj = this._subjectActorList.remove(index);
        return (eu.dca.model.SubjectActor) obj;
    }

    /**
     * Method removeSubjectConcept.
     * 
     * @param vSubjectConcept
     * @return true if the object was removed from the collection.
     */
    public boolean removeSubjectConcept(
            final eu.dca.model.SubjectConcept vSubjectConcept) {
        boolean removed = _subjectConceptList.remove(vSubjectConcept);
        return removed;
    }

    /**
     * Method removeSubjectConceptAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.SubjectConcept removeSubjectConceptAt(
            final int index) {
        java.lang.Object obj = this._subjectConceptList.remove(index);
        return (eu.dca.model.SubjectConcept) obj;
    }

    /**
     * Method removeSubjectDate.
     * 
     * @param vSubjectDate
     * @return true if the object was removed from the collection.
     */
    public boolean removeSubjectDate(
            final eu.dca.model.SubjectDate vSubjectDate) {
        boolean removed = _subjectDateList.remove(vSubjectDate);
        return removed;
    }

    /**
     * Method removeSubjectDateAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.SubjectDate removeSubjectDateAt(
            final int index) {
        java.lang.Object obj = this._subjectDateList.remove(index);
        return (eu.dca.model.SubjectDate) obj;
    }

    /**
     * Method removeSubjectEvent.
     * 
     * @param vSubjectEvent
     * @return true if the object was removed from the collection.
     */
    public boolean removeSubjectEvent(
            final eu.dca.model.SubjectEvent vSubjectEvent) {
        boolean removed = _subjectEventList.remove(vSubjectEvent);
        return removed;
    }

    /**
     * Method removeSubjectEventAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.SubjectEvent removeSubjectEventAt(
            final int index) {
        java.lang.Object obj = this._subjectEventList.remove(index);
        return (eu.dca.model.SubjectEvent) obj;
    }

    /**
     * Method removeSubjectObject.
     * 
     * @param vSubjectObject
     * @return true if the object was removed from the collection.
     */
    public boolean removeSubjectObject(
            final eu.dca.model.SubjectObject vSubjectObject) {
        boolean removed = _subjectObjectList.remove(vSubjectObject);
        return removed;
    }

    /**
     * Method removeSubjectObjectAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.SubjectObject removeSubjectObjectAt(
            final int index) {
        java.lang.Object obj = this._subjectObjectList.remove(index);
        return (eu.dca.model.SubjectObject) obj;
    }

    /**
     * Method removeSubjectPlace.
     * 
     * @param vSubjectPlace
     * @return true if the object was removed from the collection.
     */
    public boolean removeSubjectPlace(
            final eu.dca.model.SubjectPlace vSubjectPlace) {
        boolean removed = _subjectPlaceList.remove(vSubjectPlace);
        return removed;
    }

    /**
     * Method removeSubjectPlaceAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.SubjectPlace removeSubjectPlaceAt(
            final int index) {
        java.lang.Object obj = this._subjectPlaceList.remove(index);
        return (eu.dca.model.SubjectPlace) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vExtentSubject
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setExtentSubject(
            final int index,
            final eu.dca.model.ExtentSubject vExtentSubject)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._extentSubjectList.size()) {
            throw new IndexOutOfBoundsException("setExtentSubject: Index value '" + index + "' not in range [0.." + (this._extentSubjectList.size() - 1) + "]");
        }

        this._extentSubjectList.set(index, vExtentSubject);
    }

    /**
     * 
     * 
     * @param vExtentSubjectArray
     */
    public void setExtentSubject(
            final eu.dca.model.ExtentSubject[] vExtentSubjectArray) {
        //-- copy array
        _extentSubjectList.clear();

        for (int i = 0; i < vExtentSubjectArray.length; i++) {
                this._extentSubjectList.add(vExtentSubjectArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vSubjectActor
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSubjectActor(
            final int index,
            final eu.dca.model.SubjectActor vSubjectActor)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._subjectActorList.size()) {
            throw new IndexOutOfBoundsException("setSubjectActor: Index value '" + index + "' not in range [0.." + (this._subjectActorList.size() - 1) + "]");
        }

        this._subjectActorList.set(index, vSubjectActor);
    }

    /**
     * 
     * 
     * @param vSubjectActorArray
     */
    public void setSubjectActor(
            final eu.dca.model.SubjectActor[] vSubjectActorArray) {
        //-- copy array
        _subjectActorList.clear();

        for (int i = 0; i < vSubjectActorArray.length; i++) {
                this._subjectActorList.add(vSubjectActorArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vSubjectConcept
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSubjectConcept(
            final int index,
            final eu.dca.model.SubjectConcept vSubjectConcept)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._subjectConceptList.size()) {
            throw new IndexOutOfBoundsException("setSubjectConcept: Index value '" + index + "' not in range [0.." + (this._subjectConceptList.size() - 1) + "]");
        }

        this._subjectConceptList.set(index, vSubjectConcept);
    }

    /**
     * 
     * 
     * @param vSubjectConceptArray
     */
    public void setSubjectConcept(
            final eu.dca.model.SubjectConcept[] vSubjectConceptArray) {
        //-- copy array
        _subjectConceptList.clear();

        for (int i = 0; i < vSubjectConceptArray.length; i++) {
                this._subjectConceptList.add(vSubjectConceptArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vSubjectDate
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSubjectDate(
            final int index,
            final eu.dca.model.SubjectDate vSubjectDate)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._subjectDateList.size()) {
            throw new IndexOutOfBoundsException("setSubjectDate: Index value '" + index + "' not in range [0.." + (this._subjectDateList.size() - 1) + "]");
        }

        this._subjectDateList.set(index, vSubjectDate);
    }

    /**
     * 
     * 
     * @param vSubjectDateArray
     */
    public void setSubjectDate(
            final eu.dca.model.SubjectDate[] vSubjectDateArray) {
        //-- copy array
        _subjectDateList.clear();

        for (int i = 0; i < vSubjectDateArray.length; i++) {
                this._subjectDateList.add(vSubjectDateArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vSubjectEvent
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSubjectEvent(
            final int index,
            final eu.dca.model.SubjectEvent vSubjectEvent)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._subjectEventList.size()) {
            throw new IndexOutOfBoundsException("setSubjectEvent: Index value '" + index + "' not in range [0.." + (this._subjectEventList.size() - 1) + "]");
        }

        this._subjectEventList.set(index, vSubjectEvent);
    }

    /**
     * 
     * 
     * @param vSubjectEventArray
     */
    public void setSubjectEvent(
            final eu.dca.model.SubjectEvent[] vSubjectEventArray) {
        //-- copy array
        _subjectEventList.clear();

        for (int i = 0; i < vSubjectEventArray.length; i++) {
                this._subjectEventList.add(vSubjectEventArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vSubjectObject
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSubjectObject(
            final int index,
            final eu.dca.model.SubjectObject vSubjectObject)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._subjectObjectList.size()) {
            throw new IndexOutOfBoundsException("setSubjectObject: Index value '" + index + "' not in range [0.." + (this._subjectObjectList.size() - 1) + "]");
        }

        this._subjectObjectList.set(index, vSubjectObject);
    }

    /**
     * 
     * 
     * @param vSubjectObjectArray
     */
    public void setSubjectObject(
            final eu.dca.model.SubjectObject[] vSubjectObjectArray) {
        //-- copy array
        _subjectObjectList.clear();

        for (int i = 0; i < vSubjectObjectArray.length; i++) {
                this._subjectObjectList.add(vSubjectObjectArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vSubjectPlace
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSubjectPlace(
            final int index,
            final eu.dca.model.SubjectPlace vSubjectPlace)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._subjectPlaceList.size()) {
            throw new IndexOutOfBoundsException("setSubjectPlace: Index value '" + index + "' not in range [0.." + (this._subjectPlaceList.size() - 1) + "]");
        }

        this._subjectPlaceList.set(index, vSubjectPlace);
    }

    /**
     * 
     * 
     * @param vSubjectPlaceArray
     */
    public void setSubjectPlace(
            final eu.dca.model.SubjectPlace[] vSubjectPlaceArray) {
        //-- copy array
        _subjectPlaceList.clear();

        for (int i = 0; i < vSubjectPlaceArray.length; i++) {
                this._subjectPlaceList.add(vSubjectPlaceArray[i]);
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
