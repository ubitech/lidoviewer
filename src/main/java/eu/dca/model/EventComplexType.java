/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: Complex type for one event associated with the
 * object / work and its related information.How to record: If
 * there is more than one event repeat the Event Set element.
 * Notes: [none] 
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class EventComplexType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: A unique identifier for the event.
     */
    private java.util.Vector<eu.dca.model.EventID> _eventIDList;

    /**
     * Definition: The nature of the event associated with an
     * object / work.
     */
    private eu.dca.model.EventType _eventType;

    /**
     * Definition: The role played within this event by the
     * described entity. 
     */
    private java.util.Vector<eu.dca.model.RoleInEvent> _roleInEventList;

    /**
     * Definition: An appellation for the event, e.g. a title,
     * identifying phrase, or name given to it.
     */
    private java.util.Vector<eu.dca.model.EventName> _eventNameList;

    /**
     * Definition: Wrapper for display and index elements for an
     * actor with role information (participating or being present
     * in the event).
     */
    private java.util.Vector<eu.dca.model.EventActor> _eventActorList;

    /**
     * Definition: Name of a culture, cultural context, people, or
     * also a nationality. 
     */
    private java.util.Vector<eu.dca.model.Culture> _cultureList;

    /**
     * Definition: Date specification of the event.
     */
    private eu.dca.model.EventDate _eventDate;

    /**
     * Definition: A period in which the event happened. 
     */
    private java.util.Vector<eu.dca.model.PeriodName> _periodNameList;

    /**
     * Definition: Place specification of the event.
     */
    private java.util.Vector<eu.dca.model.EventPlace> _eventPlaceList;

    /**
     * Definition: The method by which the event is carried out. 
     */
    private java.util.Vector<eu.dca.model.EventMethod> _eventMethodList;

    /**
     * Definition: Indicates the substances or materials used
     * within the event (e.g. the creation of an object / work), as
     * well as any implements, production or manufacturing
     * techniques, processes, or methods incorporated.
     */
    private java.util.Vector<eu.dca.model.EventMaterialsTech> _eventMaterialsTechList;

    /**
     * Definition: References another object that was present at
     * this same event.
     */
    private java.util.Vector<eu.dca.model.ThingPresent> _thingPresentList;

    /**
     * Definition: References an event which is linked in some way
     * to this event, e.g. a field trip within which this object
     * was collected. 
     */
    private java.util.Vector<eu.dca.model.RelatedEventSet> _relatedEventSetList;

    /**
     * Definition: Wrapper for a description of the event,
     * including description identifer, descriptive note of the
     * event and its sources. 
     */
    private java.util.Vector<eu.dca.model.EventDescriptionSet> _eventDescriptionSetList;


      //----------------/
     //- Constructors -/
    //----------------/

    public EventComplexType() {
        super();
        this._eventIDList = new java.util.Vector<eu.dca.model.EventID>();
        this._roleInEventList = new java.util.Vector<eu.dca.model.RoleInEvent>();
        this._eventNameList = new java.util.Vector<eu.dca.model.EventName>();
        this._eventActorList = new java.util.Vector<eu.dca.model.EventActor>();
        this._cultureList = new java.util.Vector<eu.dca.model.Culture>();
        this._periodNameList = new java.util.Vector<eu.dca.model.PeriodName>();
        this._eventPlaceList = new java.util.Vector<eu.dca.model.EventPlace>();
        this._eventMethodList = new java.util.Vector<eu.dca.model.EventMethod>();
        this._eventMaterialsTechList = new java.util.Vector<eu.dca.model.EventMaterialsTech>();
        this._thingPresentList = new java.util.Vector<eu.dca.model.ThingPresent>();
        this._relatedEventSetList = new java.util.Vector<eu.dca.model.RelatedEventSet>();
        this._eventDescriptionSetList = new java.util.Vector<eu.dca.model.EventDescriptionSet>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vCulture
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCulture(
            final eu.dca.model.Culture vCulture)
    throws java.lang.IndexOutOfBoundsException {
        this._cultureList.addElement(vCulture);
    }

    /**
     * 
     * 
     * @param index
     * @param vCulture
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCulture(
            final int index,
            final eu.dca.model.Culture vCulture)
    throws java.lang.IndexOutOfBoundsException {
        this._cultureList.add(index, vCulture);
    }

    /**
     * 
     * 
     * @param vEventActor
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEventActor(
            final eu.dca.model.EventActor vEventActor)
    throws java.lang.IndexOutOfBoundsException {
        this._eventActorList.addElement(vEventActor);
    }

    /**
     * 
     * 
     * @param index
     * @param vEventActor
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEventActor(
            final int index,
            final eu.dca.model.EventActor vEventActor)
    throws java.lang.IndexOutOfBoundsException {
        this._eventActorList.add(index, vEventActor);
    }

    /**
     * 
     * 
     * @param vEventDescriptionSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEventDescriptionSet(
            final eu.dca.model.EventDescriptionSet vEventDescriptionSet)
    throws java.lang.IndexOutOfBoundsException {
        this._eventDescriptionSetList.addElement(vEventDescriptionSet);
    }

    /**
     * 
     * 
     * @param index
     * @param vEventDescriptionSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEventDescriptionSet(
            final int index,
            final eu.dca.model.EventDescriptionSet vEventDescriptionSet)
    throws java.lang.IndexOutOfBoundsException {
        this._eventDescriptionSetList.add(index, vEventDescriptionSet);
    }

    /**
     * 
     * 
     * @param vEventID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEventID(
            final eu.dca.model.EventID vEventID)
    throws java.lang.IndexOutOfBoundsException {
        this._eventIDList.addElement(vEventID);
    }

    /**
     * 
     * 
     * @param index
     * @param vEventID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEventID(
            final int index,
            final eu.dca.model.EventID vEventID)
    throws java.lang.IndexOutOfBoundsException {
        this._eventIDList.add(index, vEventID);
    }

    /**
     * 
     * 
     * @param vEventMaterialsTech
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEventMaterialsTech(
            final eu.dca.model.EventMaterialsTech vEventMaterialsTech)
    throws java.lang.IndexOutOfBoundsException {
        this._eventMaterialsTechList.addElement(vEventMaterialsTech);
    }

    /**
     * 
     * 
     * @param index
     * @param vEventMaterialsTech
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEventMaterialsTech(
            final int index,
            final eu.dca.model.EventMaterialsTech vEventMaterialsTech)
    throws java.lang.IndexOutOfBoundsException {
        this._eventMaterialsTechList.add(index, vEventMaterialsTech);
    }

    /**
     * 
     * 
     * @param vEventMethod
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEventMethod(
            final eu.dca.model.EventMethod vEventMethod)
    throws java.lang.IndexOutOfBoundsException {
        this._eventMethodList.addElement(vEventMethod);
    }

    /**
     * 
     * 
     * @param index
     * @param vEventMethod
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEventMethod(
            final int index,
            final eu.dca.model.EventMethod vEventMethod)
    throws java.lang.IndexOutOfBoundsException {
        this._eventMethodList.add(index, vEventMethod);
    }

    /**
     * 
     * 
     * @param vEventName
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEventName(
            final eu.dca.model.EventName vEventName)
    throws java.lang.IndexOutOfBoundsException {
        this._eventNameList.addElement(vEventName);
    }

    /**
     * 
     * 
     * @param index
     * @param vEventName
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEventName(
            final int index,
            final eu.dca.model.EventName vEventName)
    throws java.lang.IndexOutOfBoundsException {
        this._eventNameList.add(index, vEventName);
    }

    /**
     * 
     * 
     * @param vEventPlace
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEventPlace(
            final eu.dca.model.EventPlace vEventPlace)
    throws java.lang.IndexOutOfBoundsException {
        this._eventPlaceList.addElement(vEventPlace);
    }

    /**
     * 
     * 
     * @param index
     * @param vEventPlace
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEventPlace(
            final int index,
            final eu.dca.model.EventPlace vEventPlace)
    throws java.lang.IndexOutOfBoundsException {
        this._eventPlaceList.add(index, vEventPlace);
    }

    /**
     * 
     * 
     * @param vPeriodName
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPeriodName(
            final eu.dca.model.PeriodName vPeriodName)
    throws java.lang.IndexOutOfBoundsException {
        this._periodNameList.addElement(vPeriodName);
    }

    /**
     * 
     * 
     * @param index
     * @param vPeriodName
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPeriodName(
            final int index,
            final eu.dca.model.PeriodName vPeriodName)
    throws java.lang.IndexOutOfBoundsException {
        this._periodNameList.add(index, vPeriodName);
    }

    /**
     * 
     * 
     * @param vRelatedEventSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRelatedEventSet(
            final eu.dca.model.RelatedEventSet vRelatedEventSet)
    throws java.lang.IndexOutOfBoundsException {
        this._relatedEventSetList.addElement(vRelatedEventSet);
    }

    /**
     * 
     * 
     * @param index
     * @param vRelatedEventSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRelatedEventSet(
            final int index,
            final eu.dca.model.RelatedEventSet vRelatedEventSet)
    throws java.lang.IndexOutOfBoundsException {
        this._relatedEventSetList.add(index, vRelatedEventSet);
    }

    /**
     * 
     * 
     * @param vRoleInEvent
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRoleInEvent(
            final eu.dca.model.RoleInEvent vRoleInEvent)
    throws java.lang.IndexOutOfBoundsException {
        this._roleInEventList.addElement(vRoleInEvent);
    }

    /**
     * 
     * 
     * @param index
     * @param vRoleInEvent
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRoleInEvent(
            final int index,
            final eu.dca.model.RoleInEvent vRoleInEvent)
    throws java.lang.IndexOutOfBoundsException {
        this._roleInEventList.add(index, vRoleInEvent);
    }

    /**
     * 
     * 
     * @param vThingPresent
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addThingPresent(
            final eu.dca.model.ThingPresent vThingPresent)
    throws java.lang.IndexOutOfBoundsException {
        this._thingPresentList.addElement(vThingPresent);
    }

    /**
     * 
     * 
     * @param index
     * @param vThingPresent
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addThingPresent(
            final int index,
            final eu.dca.model.ThingPresent vThingPresent)
    throws java.lang.IndexOutOfBoundsException {
        this._thingPresentList.add(index, vThingPresent);
    }

    /**
     * Method enumerateCulture.
     * 
     * @return an Enumeration over all eu.dca.model.Culture elements
     */
    public java.util.Enumeration<? extends eu.dca.model.Culture> enumerateCulture(
    ) {
        return this._cultureList.elements();
    }

    /**
     * Method enumerateEventActor.
     * 
     * @return an Enumeration over all eu.dca.model.EventActor
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.EventActor> enumerateEventActor(
    ) {
        return this._eventActorList.elements();
    }

    /**
     * Method enumerateEventDescriptionSet.
     * 
     * @return an Enumeration over all
     * eu.dca.model.EventDescriptionSet elements
     */
    public java.util.Enumeration<? extends eu.dca.model.EventDescriptionSet> enumerateEventDescriptionSet(
    ) {
        return this._eventDescriptionSetList.elements();
    }

    /**
     * Method enumerateEventID.
     * 
     * @return an Enumeration over all eu.dca.model.EventID elements
     */
    public java.util.Enumeration<? extends eu.dca.model.EventID> enumerateEventID(
    ) {
        return this._eventIDList.elements();
    }

    /**
     * Method enumerateEventMaterialsTech.
     * 
     * @return an Enumeration over all
     * eu.dca.model.EventMaterialsTech elements
     */
    public java.util.Enumeration<? extends eu.dca.model.EventMaterialsTech> enumerateEventMaterialsTech(
    ) {
        return this._eventMaterialsTechList.elements();
    }

    /**
     * Method enumerateEventMethod.
     * 
     * @return an Enumeration over all eu.dca.model.EventMethod
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.EventMethod> enumerateEventMethod(
    ) {
        return this._eventMethodList.elements();
    }

    /**
     * Method enumerateEventName.
     * 
     * @return an Enumeration over all eu.dca.model.EventName
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.EventName> enumerateEventName(
    ) {
        return this._eventNameList.elements();
    }

    /**
     * Method enumerateEventPlace.
     * 
     * @return an Enumeration over all eu.dca.model.EventPlace
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.EventPlace> enumerateEventPlace(
    ) {
        return this._eventPlaceList.elements();
    }

    /**
     * Method enumeratePeriodName.
     * 
     * @return an Enumeration over all eu.dca.model.PeriodName
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.PeriodName> enumeratePeriodName(
    ) {
        return this._periodNameList.elements();
    }

    /**
     * Method enumerateRelatedEventSet.
     * 
     * @return an Enumeration over all eu.dca.model.RelatedEventSet
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.RelatedEventSet> enumerateRelatedEventSet(
    ) {
        return this._relatedEventSetList.elements();
    }

    /**
     * Method enumerateRoleInEvent.
     * 
     * @return an Enumeration over all eu.dca.model.RoleInEvent
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.RoleInEvent> enumerateRoleInEvent(
    ) {
        return this._roleInEventList.elements();
    }

    /**
     * Method enumerateThingPresent.
     * 
     * @return an Enumeration over all eu.dca.model.ThingPresent
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.ThingPresent> enumerateThingPresent(
    ) {
        return this._thingPresentList.elements();
    }

    /**
     * Method getCulture.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.Culture at the given
     * index
     */
    public eu.dca.model.Culture getCulture(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._cultureList.size()) {
            throw new IndexOutOfBoundsException("getCulture: Index value '" + index + "' not in range [0.." + (this._cultureList.size() - 1) + "]");
        }

        return (eu.dca.model.Culture) _cultureList.get(index);
    }

    /**
     * Method getCulture.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.Culture[] getCulture(
    ) {
        eu.dca.model.Culture[] array = new eu.dca.model.Culture[0];
        return (eu.dca.model.Culture[]) this._cultureList.toArray(array);
    }

    /**
     * Method getCultureCount.
     * 
     * @return the size of this collection
     */
    public int getCultureCount(
    ) {
        return this._cultureList.size();
    }

    /**
     * Method getEventActor.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.EventActor at the
     * given index
     */
    public eu.dca.model.EventActor getEventActor(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._eventActorList.size()) {
            throw new IndexOutOfBoundsException("getEventActor: Index value '" + index + "' not in range [0.." + (this._eventActorList.size() - 1) + "]");
        }

        return (eu.dca.model.EventActor) _eventActorList.get(index);
    }

    /**
     * Method getEventActor.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.EventActor[] getEventActor(
    ) {
        eu.dca.model.EventActor[] array = new eu.dca.model.EventActor[0];
        return (eu.dca.model.EventActor[]) this._eventActorList.toArray(array);
    }

    /**
     * Method getEventActorCount.
     * 
     * @return the size of this collection
     */
    public int getEventActorCount(
    ) {
        return this._eventActorList.size();
    }

    /**
     * Returns the value of field 'eventDate'. The field
     * 'eventDate' has the following description: Definition: Date
     * specification of the event.
     * 
     * @return the value of field 'EventDate'.
     */
    public eu.dca.model.EventDate getEventDate(
    ) {
        return this._eventDate;
    }

    /**
     * Method getEventDescriptionSet.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.EventDescriptionSet at
     * the given index
     */
    public eu.dca.model.EventDescriptionSet getEventDescriptionSet(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._eventDescriptionSetList.size()) {
            throw new IndexOutOfBoundsException("getEventDescriptionSet: Index value '" + index + "' not in range [0.." + (this._eventDescriptionSetList.size() - 1) + "]");
        }

        return (eu.dca.model.EventDescriptionSet) _eventDescriptionSetList.get(index);
    }

    /**
     * Method getEventDescriptionSet.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.EventDescriptionSet[] getEventDescriptionSet(
    ) {
        eu.dca.model.EventDescriptionSet[] array = new eu.dca.model.EventDescriptionSet[0];
        return (eu.dca.model.EventDescriptionSet[]) this._eventDescriptionSetList.toArray(array);
    }

    /**
     * Method getEventDescriptionSetCount.
     * 
     * @return the size of this collection
     */
    public int getEventDescriptionSetCount(
    ) {
        return this._eventDescriptionSetList.size();
    }

    /**
     * Method getEventID.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.EventID at the given
     * index
     */
    public eu.dca.model.EventID getEventID(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._eventIDList.size()) {
            throw new IndexOutOfBoundsException("getEventID: Index value '" + index + "' not in range [0.." + (this._eventIDList.size() - 1) + "]");
        }

        return (eu.dca.model.EventID) _eventIDList.get(index);
    }

    /**
     * Method getEventID.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.EventID[] getEventID(
    ) {
        eu.dca.model.EventID[] array = new eu.dca.model.EventID[0];
        return (eu.dca.model.EventID[]) this._eventIDList.toArray(array);
    }

    /**
     * Method getEventIDCount.
     * 
     * @return the size of this collection
     */
    public int getEventIDCount(
    ) {
        return this._eventIDList.size();
    }

    /**
     * Method getEventMaterialsTech.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.EventMaterialsTech at
     * the given index
     */
    public eu.dca.model.EventMaterialsTech getEventMaterialsTech(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._eventMaterialsTechList.size()) {
            throw new IndexOutOfBoundsException("getEventMaterialsTech: Index value '" + index + "' not in range [0.." + (this._eventMaterialsTechList.size() - 1) + "]");
        }

        return (eu.dca.model.EventMaterialsTech) _eventMaterialsTechList.get(index);
    }

    /**
     * Method getEventMaterialsTech.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.EventMaterialsTech[] getEventMaterialsTech(
    ) {
        eu.dca.model.EventMaterialsTech[] array = new eu.dca.model.EventMaterialsTech[0];
        return (eu.dca.model.EventMaterialsTech[]) this._eventMaterialsTechList.toArray(array);
    }

    /**
     * Method getEventMaterialsTechCount.
     * 
     * @return the size of this collection
     */
    public int getEventMaterialsTechCount(
    ) {
        return this._eventMaterialsTechList.size();
    }

    /**
     * Method getEventMethod.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.EventMethod at the
     * given index
     */
    public eu.dca.model.EventMethod getEventMethod(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._eventMethodList.size()) {
            throw new IndexOutOfBoundsException("getEventMethod: Index value '" + index + "' not in range [0.." + (this._eventMethodList.size() - 1) + "]");
        }

        return (eu.dca.model.EventMethod) _eventMethodList.get(index);
    }

    /**
     * Method getEventMethod.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.EventMethod[] getEventMethod(
    ) {
        eu.dca.model.EventMethod[] array = new eu.dca.model.EventMethod[0];
        return (eu.dca.model.EventMethod[]) this._eventMethodList.toArray(array);
    }

    /**
     * Method getEventMethodCount.
     * 
     * @return the size of this collection
     */
    public int getEventMethodCount(
    ) {
        return this._eventMethodList.size();
    }

    /**
     * Method getEventName.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.EventName at the given
     * index
     */
    public eu.dca.model.EventName getEventName(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._eventNameList.size()) {
            throw new IndexOutOfBoundsException("getEventName: Index value '" + index + "' not in range [0.." + (this._eventNameList.size() - 1) + "]");
        }

        return (eu.dca.model.EventName) _eventNameList.get(index);
    }

    /**
     * Method getEventName.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.EventName[] getEventName(
    ) {
        eu.dca.model.EventName[] array = new eu.dca.model.EventName[0];
        return (eu.dca.model.EventName[]) this._eventNameList.toArray(array);
    }

    /**
     * Method getEventNameCount.
     * 
     * @return the size of this collection
     */
    public int getEventNameCount(
    ) {
        return this._eventNameList.size();
    }

    /**
     * Method getEventPlace.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.EventPlace at the
     * given index
     */
    public eu.dca.model.EventPlace getEventPlace(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._eventPlaceList.size()) {
            throw new IndexOutOfBoundsException("getEventPlace: Index value '" + index + "' not in range [0.." + (this._eventPlaceList.size() - 1) + "]");
        }

        return (eu.dca.model.EventPlace) _eventPlaceList.get(index);
    }

    /**
     * Method getEventPlace.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.EventPlace[] getEventPlace(
    ) {
        eu.dca.model.EventPlace[] array = new eu.dca.model.EventPlace[0];
        return (eu.dca.model.EventPlace[]) this._eventPlaceList.toArray(array);
    }

    /**
     * Method getEventPlaceCount.
     * 
     * @return the size of this collection
     */
    public int getEventPlaceCount(
    ) {
        return this._eventPlaceList.size();
    }

    /**
     * Returns the value of field 'eventType'. The field
     * 'eventType' has the following description: Definition: The
     * nature of the event associated with an object / work.
     * 
     * @return the value of field 'EventType'.
     */
    public eu.dca.model.EventType getEventType(
    ) {
        return this._eventType;
    }

    /**
     * Method getPeriodName.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.PeriodName at the
     * given index
     */
    public eu.dca.model.PeriodName getPeriodName(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._periodNameList.size()) {
            throw new IndexOutOfBoundsException("getPeriodName: Index value '" + index + "' not in range [0.." + (this._periodNameList.size() - 1) + "]");
        }

        return (eu.dca.model.PeriodName) _periodNameList.get(index);
    }

    /**
     * Method getPeriodName.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.PeriodName[] getPeriodName(
    ) {
        eu.dca.model.PeriodName[] array = new eu.dca.model.PeriodName[0];
        return (eu.dca.model.PeriodName[]) this._periodNameList.toArray(array);
    }

    /**
     * Method getPeriodNameCount.
     * 
     * @return the size of this collection
     */
    public int getPeriodNameCount(
    ) {
        return this._periodNameList.size();
    }

    /**
     * Method getRelatedEventSet.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.RelatedEventSet at the
     * given index
     */
    public eu.dca.model.RelatedEventSet getRelatedEventSet(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._relatedEventSetList.size()) {
            throw new IndexOutOfBoundsException("getRelatedEventSet: Index value '" + index + "' not in range [0.." + (this._relatedEventSetList.size() - 1) + "]");
        }

        return (eu.dca.model.RelatedEventSet) _relatedEventSetList.get(index);
    }

    /**
     * Method getRelatedEventSet.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.RelatedEventSet[] getRelatedEventSet(
    ) {
        eu.dca.model.RelatedEventSet[] array = new eu.dca.model.RelatedEventSet[0];
        return (eu.dca.model.RelatedEventSet[]) this._relatedEventSetList.toArray(array);
    }

    /**
     * Method getRelatedEventSetCount.
     * 
     * @return the size of this collection
     */
    public int getRelatedEventSetCount(
    ) {
        return this._relatedEventSetList.size();
    }

    /**
     * Method getRoleInEvent.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.RoleInEvent at the
     * given index
     */
    public eu.dca.model.RoleInEvent getRoleInEvent(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._roleInEventList.size()) {
            throw new IndexOutOfBoundsException("getRoleInEvent: Index value '" + index + "' not in range [0.." + (this._roleInEventList.size() - 1) + "]");
        }

        return (eu.dca.model.RoleInEvent) _roleInEventList.get(index);
    }

    /**
     * Method getRoleInEvent.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.RoleInEvent[] getRoleInEvent(
    ) {
        eu.dca.model.RoleInEvent[] array = new eu.dca.model.RoleInEvent[0];
        return (eu.dca.model.RoleInEvent[]) this._roleInEventList.toArray(array);
    }

    /**
     * Method getRoleInEventCount.
     * 
     * @return the size of this collection
     */
    public int getRoleInEventCount(
    ) {
        return this._roleInEventList.size();
    }

    /**
     * Method getThingPresent.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.ThingPresent at the
     * given index
     */
    public eu.dca.model.ThingPresent getThingPresent(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._thingPresentList.size()) {
            throw new IndexOutOfBoundsException("getThingPresent: Index value '" + index + "' not in range [0.." + (this._thingPresentList.size() - 1) + "]");
        }

        return (eu.dca.model.ThingPresent) _thingPresentList.get(index);
    }

    /**
     * Method getThingPresent.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.ThingPresent[] getThingPresent(
    ) {
        eu.dca.model.ThingPresent[] array = new eu.dca.model.ThingPresent[0];
        return (eu.dca.model.ThingPresent[]) this._thingPresentList.toArray(array);
    }

    /**
     * Method getThingPresentCount.
     * 
     * @return the size of this collection
     */
    public int getThingPresentCount(
    ) {
        return this._thingPresentList.size();
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
    public void removeAllCulture(
    ) {
        this._cultureList.clear();
    }

    /**
     */
    public void removeAllEventActor(
    ) {
        this._eventActorList.clear();
    }

    /**
     */
    public void removeAllEventDescriptionSet(
    ) {
        this._eventDescriptionSetList.clear();
    }

    /**
     */
    public void removeAllEventID(
    ) {
        this._eventIDList.clear();
    }

    /**
     */
    public void removeAllEventMaterialsTech(
    ) {
        this._eventMaterialsTechList.clear();
    }

    /**
     */
    public void removeAllEventMethod(
    ) {
        this._eventMethodList.clear();
    }

    /**
     */
    public void removeAllEventName(
    ) {
        this._eventNameList.clear();
    }

    /**
     */
    public void removeAllEventPlace(
    ) {
        this._eventPlaceList.clear();
    }

    /**
     */
    public void removeAllPeriodName(
    ) {
        this._periodNameList.clear();
    }

    /**
     */
    public void removeAllRelatedEventSet(
    ) {
        this._relatedEventSetList.clear();
    }

    /**
     */
    public void removeAllRoleInEvent(
    ) {
        this._roleInEventList.clear();
    }

    /**
     */
    public void removeAllThingPresent(
    ) {
        this._thingPresentList.clear();
    }

    /**
     * Method removeCulture.
     * 
     * @param vCulture
     * @return true if the object was removed from the collection.
     */
    public boolean removeCulture(
            final eu.dca.model.Culture vCulture) {
        boolean removed = _cultureList.remove(vCulture);
        return removed;
    }

    /**
     * Method removeCultureAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.Culture removeCultureAt(
            final int index) {
        java.lang.Object obj = this._cultureList.remove(index);
        return (eu.dca.model.Culture) obj;
    }

    /**
     * Method removeEventActor.
     * 
     * @param vEventActor
     * @return true if the object was removed from the collection.
     */
    public boolean removeEventActor(
            final eu.dca.model.EventActor vEventActor) {
        boolean removed = _eventActorList.remove(vEventActor);
        return removed;
    }

    /**
     * Method removeEventActorAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.EventActor removeEventActorAt(
            final int index) {
        java.lang.Object obj = this._eventActorList.remove(index);
        return (eu.dca.model.EventActor) obj;
    }

    /**
     * Method removeEventDescriptionSet.
     * 
     * @param vEventDescriptionSet
     * @return true if the object was removed from the collection.
     */
    public boolean removeEventDescriptionSet(
            final eu.dca.model.EventDescriptionSet vEventDescriptionSet) {
        boolean removed = _eventDescriptionSetList.remove(vEventDescriptionSet);
        return removed;
    }

    /**
     * Method removeEventDescriptionSetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.EventDescriptionSet removeEventDescriptionSetAt(
            final int index) {
        java.lang.Object obj = this._eventDescriptionSetList.remove(index);
        return (eu.dca.model.EventDescriptionSet) obj;
    }

    /**
     * Method removeEventID.
     * 
     * @param vEventID
     * @return true if the object was removed from the collection.
     */
    public boolean removeEventID(
            final eu.dca.model.EventID vEventID) {
        boolean removed = _eventIDList.remove(vEventID);
        return removed;
    }

    /**
     * Method removeEventIDAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.EventID removeEventIDAt(
            final int index) {
        java.lang.Object obj = this._eventIDList.remove(index);
        return (eu.dca.model.EventID) obj;
    }

    /**
     * Method removeEventMaterialsTech.
     * 
     * @param vEventMaterialsTech
     * @return true if the object was removed from the collection.
     */
    public boolean removeEventMaterialsTech(
            final eu.dca.model.EventMaterialsTech vEventMaterialsTech) {
        boolean removed = _eventMaterialsTechList.remove(vEventMaterialsTech);
        return removed;
    }

    /**
     * Method removeEventMaterialsTechAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.EventMaterialsTech removeEventMaterialsTechAt(
            final int index) {
        java.lang.Object obj = this._eventMaterialsTechList.remove(index);
        return (eu.dca.model.EventMaterialsTech) obj;
    }

    /**
     * Method removeEventMethod.
     * 
     * @param vEventMethod
     * @return true if the object was removed from the collection.
     */
    public boolean removeEventMethod(
            final eu.dca.model.EventMethod vEventMethod) {
        boolean removed = _eventMethodList.remove(vEventMethod);
        return removed;
    }

    /**
     * Method removeEventMethodAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.EventMethod removeEventMethodAt(
            final int index) {
        java.lang.Object obj = this._eventMethodList.remove(index);
        return (eu.dca.model.EventMethod) obj;
    }

    /**
     * Method removeEventName.
     * 
     * @param vEventName
     * @return true if the object was removed from the collection.
     */
    public boolean removeEventName(
            final eu.dca.model.EventName vEventName) {
        boolean removed = _eventNameList.remove(vEventName);
        return removed;
    }

    /**
     * Method removeEventNameAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.EventName removeEventNameAt(
            final int index) {
        java.lang.Object obj = this._eventNameList.remove(index);
        return (eu.dca.model.EventName) obj;
    }

    /**
     * Method removeEventPlace.
     * 
     * @param vEventPlace
     * @return true if the object was removed from the collection.
     */
    public boolean removeEventPlace(
            final eu.dca.model.EventPlace vEventPlace) {
        boolean removed = _eventPlaceList.remove(vEventPlace);
        return removed;
    }

    /**
     * Method removeEventPlaceAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.EventPlace removeEventPlaceAt(
            final int index) {
        java.lang.Object obj = this._eventPlaceList.remove(index);
        return (eu.dca.model.EventPlace) obj;
    }

    /**
     * Method removePeriodName.
     * 
     * @param vPeriodName
     * @return true if the object was removed from the collection.
     */
    public boolean removePeriodName(
            final eu.dca.model.PeriodName vPeriodName) {
        boolean removed = _periodNameList.remove(vPeriodName);
        return removed;
    }

    /**
     * Method removePeriodNameAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.PeriodName removePeriodNameAt(
            final int index) {
        java.lang.Object obj = this._periodNameList.remove(index);
        return (eu.dca.model.PeriodName) obj;
    }

    /**
     * Method removeRelatedEventSet.
     * 
     * @param vRelatedEventSet
     * @return true if the object was removed from the collection.
     */
    public boolean removeRelatedEventSet(
            final eu.dca.model.RelatedEventSet vRelatedEventSet) {
        boolean removed = _relatedEventSetList.remove(vRelatedEventSet);
        return removed;
    }

    /**
     * Method removeRelatedEventSetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.RelatedEventSet removeRelatedEventSetAt(
            final int index) {
        java.lang.Object obj = this._relatedEventSetList.remove(index);
        return (eu.dca.model.RelatedEventSet) obj;
    }

    /**
     * Method removeRoleInEvent.
     * 
     * @param vRoleInEvent
     * @return true if the object was removed from the collection.
     */
    public boolean removeRoleInEvent(
            final eu.dca.model.RoleInEvent vRoleInEvent) {
        boolean removed = _roleInEventList.remove(vRoleInEvent);
        return removed;
    }

    /**
     * Method removeRoleInEventAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.RoleInEvent removeRoleInEventAt(
            final int index) {
        java.lang.Object obj = this._roleInEventList.remove(index);
        return (eu.dca.model.RoleInEvent) obj;
    }

    /**
     * Method removeThingPresent.
     * 
     * @param vThingPresent
     * @return true if the object was removed from the collection.
     */
    public boolean removeThingPresent(
            final eu.dca.model.ThingPresent vThingPresent) {
        boolean removed = _thingPresentList.remove(vThingPresent);
        return removed;
    }

    /**
     * Method removeThingPresentAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.ThingPresent removeThingPresentAt(
            final int index) {
        java.lang.Object obj = this._thingPresentList.remove(index);
        return (eu.dca.model.ThingPresent) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vCulture
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setCulture(
            final int index,
            final eu.dca.model.Culture vCulture)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._cultureList.size()) {
            throw new IndexOutOfBoundsException("setCulture: Index value '" + index + "' not in range [0.." + (this._cultureList.size() - 1) + "]");
        }

        this._cultureList.set(index, vCulture);
    }

    /**
     * 
     * 
     * @param vCultureArray
     */
    public void setCulture(
            final eu.dca.model.Culture[] vCultureArray) {
        //-- copy array
        _cultureList.clear();

        for (int i = 0; i < vCultureArray.length; i++) {
                this._cultureList.add(vCultureArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vEventActor
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setEventActor(
            final int index,
            final eu.dca.model.EventActor vEventActor)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._eventActorList.size()) {
            throw new IndexOutOfBoundsException("setEventActor: Index value '" + index + "' not in range [0.." + (this._eventActorList.size() - 1) + "]");
        }

        this._eventActorList.set(index, vEventActor);
    }

    /**
     * 
     * 
     * @param vEventActorArray
     */
    public void setEventActor(
            final eu.dca.model.EventActor[] vEventActorArray) {
        //-- copy array
        _eventActorList.clear();

        for (int i = 0; i < vEventActorArray.length; i++) {
                this._eventActorList.add(vEventActorArray[i]);
        }
    }

    /**
     * Sets the value of field 'eventDate'. The field 'eventDate'
     * has the following description: Definition: Date
     * specification of the event.
     * 
     * @param eventDate the value of field 'eventDate'.
     */
    public void setEventDate(
            final eu.dca.model.EventDate eventDate) {
        this._eventDate = eventDate;
    }

    /**
     * 
     * 
     * @param index
     * @param vEventDescriptionSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setEventDescriptionSet(
            final int index,
            final eu.dca.model.EventDescriptionSet vEventDescriptionSet)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._eventDescriptionSetList.size()) {
            throw new IndexOutOfBoundsException("setEventDescriptionSet: Index value '" + index + "' not in range [0.." + (this._eventDescriptionSetList.size() - 1) + "]");
        }

        this._eventDescriptionSetList.set(index, vEventDescriptionSet);
    }

    /**
     * 
     * 
     * @param vEventDescriptionSetArray
     */
    public void setEventDescriptionSet(
            final eu.dca.model.EventDescriptionSet[] vEventDescriptionSetArray) {
        //-- copy array
        _eventDescriptionSetList.clear();

        for (int i = 0; i < vEventDescriptionSetArray.length; i++) {
                this._eventDescriptionSetList.add(vEventDescriptionSetArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vEventID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setEventID(
            final int index,
            final eu.dca.model.EventID vEventID)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._eventIDList.size()) {
            throw new IndexOutOfBoundsException("setEventID: Index value '" + index + "' not in range [0.." + (this._eventIDList.size() - 1) + "]");
        }

        this._eventIDList.set(index, vEventID);
    }

    /**
     * 
     * 
     * @param vEventIDArray
     */
    public void setEventID(
            final eu.dca.model.EventID[] vEventIDArray) {
        //-- copy array
        _eventIDList.clear();

        for (int i = 0; i < vEventIDArray.length; i++) {
                this._eventIDList.add(vEventIDArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vEventMaterialsTech
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setEventMaterialsTech(
            final int index,
            final eu.dca.model.EventMaterialsTech vEventMaterialsTech)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._eventMaterialsTechList.size()) {
            throw new IndexOutOfBoundsException("setEventMaterialsTech: Index value '" + index + "' not in range [0.." + (this._eventMaterialsTechList.size() - 1) + "]");
        }

        this._eventMaterialsTechList.set(index, vEventMaterialsTech);
    }

    /**
     * 
     * 
     * @param vEventMaterialsTechArray
     */
    public void setEventMaterialsTech(
            final eu.dca.model.EventMaterialsTech[] vEventMaterialsTechArray) {
        //-- copy array
        _eventMaterialsTechList.clear();

        for (int i = 0; i < vEventMaterialsTechArray.length; i++) {
                this._eventMaterialsTechList.add(vEventMaterialsTechArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vEventMethod
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setEventMethod(
            final int index,
            final eu.dca.model.EventMethod vEventMethod)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._eventMethodList.size()) {
            throw new IndexOutOfBoundsException("setEventMethod: Index value '" + index + "' not in range [0.." + (this._eventMethodList.size() - 1) + "]");
        }

        this._eventMethodList.set(index, vEventMethod);
    }

    /**
     * 
     * 
     * @param vEventMethodArray
     */
    public void setEventMethod(
            final eu.dca.model.EventMethod[] vEventMethodArray) {
        //-- copy array
        _eventMethodList.clear();

        for (int i = 0; i < vEventMethodArray.length; i++) {
                this._eventMethodList.add(vEventMethodArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vEventName
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setEventName(
            final int index,
            final eu.dca.model.EventName vEventName)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._eventNameList.size()) {
            throw new IndexOutOfBoundsException("setEventName: Index value '" + index + "' not in range [0.." + (this._eventNameList.size() - 1) + "]");
        }

        this._eventNameList.set(index, vEventName);
    }

    /**
     * 
     * 
     * @param vEventNameArray
     */
    public void setEventName(
            final eu.dca.model.EventName[] vEventNameArray) {
        //-- copy array
        _eventNameList.clear();

        for (int i = 0; i < vEventNameArray.length; i++) {
                this._eventNameList.add(vEventNameArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vEventPlace
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setEventPlace(
            final int index,
            final eu.dca.model.EventPlace vEventPlace)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._eventPlaceList.size()) {
            throw new IndexOutOfBoundsException("setEventPlace: Index value '" + index + "' not in range [0.." + (this._eventPlaceList.size() - 1) + "]");
        }

        this._eventPlaceList.set(index, vEventPlace);
    }

    /**
     * 
     * 
     * @param vEventPlaceArray
     */
    public void setEventPlace(
            final eu.dca.model.EventPlace[] vEventPlaceArray) {
        //-- copy array
        _eventPlaceList.clear();

        for (int i = 0; i < vEventPlaceArray.length; i++) {
                this._eventPlaceList.add(vEventPlaceArray[i]);
        }
    }

    /**
     * Sets the value of field 'eventType'. The field 'eventType'
     * has the following description: Definition: The nature of the
     * event associated with an object / work.
     * 
     * @param eventType the value of field 'eventType'.
     */
    public void setEventType(
            final eu.dca.model.EventType eventType) {
        this._eventType = eventType;
    }

    /**
     * 
     * 
     * @param index
     * @param vPeriodName
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setPeriodName(
            final int index,
            final eu.dca.model.PeriodName vPeriodName)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._periodNameList.size()) {
            throw new IndexOutOfBoundsException("setPeriodName: Index value '" + index + "' not in range [0.." + (this._periodNameList.size() - 1) + "]");
        }

        this._periodNameList.set(index, vPeriodName);
    }

    /**
     * 
     * 
     * @param vPeriodNameArray
     */
    public void setPeriodName(
            final eu.dca.model.PeriodName[] vPeriodNameArray) {
        //-- copy array
        _periodNameList.clear();

        for (int i = 0; i < vPeriodNameArray.length; i++) {
                this._periodNameList.add(vPeriodNameArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vRelatedEventSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setRelatedEventSet(
            final int index,
            final eu.dca.model.RelatedEventSet vRelatedEventSet)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._relatedEventSetList.size()) {
            throw new IndexOutOfBoundsException("setRelatedEventSet: Index value '" + index + "' not in range [0.." + (this._relatedEventSetList.size() - 1) + "]");
        }

        this._relatedEventSetList.set(index, vRelatedEventSet);
    }

    /**
     * 
     * 
     * @param vRelatedEventSetArray
     */
    public void setRelatedEventSet(
            final eu.dca.model.RelatedEventSet[] vRelatedEventSetArray) {
        //-- copy array
        _relatedEventSetList.clear();

        for (int i = 0; i < vRelatedEventSetArray.length; i++) {
                this._relatedEventSetList.add(vRelatedEventSetArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vRoleInEvent
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setRoleInEvent(
            final int index,
            final eu.dca.model.RoleInEvent vRoleInEvent)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._roleInEventList.size()) {
            throw new IndexOutOfBoundsException("setRoleInEvent: Index value '" + index + "' not in range [0.." + (this._roleInEventList.size() - 1) + "]");
        }

        this._roleInEventList.set(index, vRoleInEvent);
    }

    /**
     * 
     * 
     * @param vRoleInEventArray
     */
    public void setRoleInEvent(
            final eu.dca.model.RoleInEvent[] vRoleInEventArray) {
        //-- copy array
        _roleInEventList.clear();

        for (int i = 0; i < vRoleInEventArray.length; i++) {
                this._roleInEventList.add(vRoleInEventArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vThingPresent
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setThingPresent(
            final int index,
            final eu.dca.model.ThingPresent vThingPresent)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._thingPresentList.size()) {
            throw new IndexOutOfBoundsException("setThingPresent: Index value '" + index + "' not in range [0.." + (this._thingPresentList.size() - 1) + "]");
        }

        this._thingPresentList.set(index, vThingPresent);
    }

    /**
     * 
     * 
     * @param vThingPresentArray
     */
    public void setThingPresent(
            final eu.dca.model.ThingPresent[] vThingPresentArray) {
        //-- copy array
        _thingPresentList.clear();

        for (int i = 0; i < vThingPresentArray.length; i++) {
                this._thingPresentList.add(vThingPresentArray[i]);
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
