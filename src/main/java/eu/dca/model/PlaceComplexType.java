/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: Structured element for place information
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class PlaceComplexType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: Data values can include: Gemeinde, Kreis,
     * Bundesland, Staat, Herzogtum, city, county, country, civil
     * parish
     */
    private java.lang.String _politicalEntity;

    /**
     * Definition: Data values can include: Naturraum, Landschaft,
     * natural environment, landscape
     */
    private java.lang.String _geographicalEntity;

    /**
     * Definition: A unique identifier for the place.
     */
    private java.util.Vector<eu.dca.model.PlaceID> _placeIDList;

    /**
     * Definition: The name of the geographic place. 
     */
    private java.util.Vector<eu.dca.model.NamePlaceSet> _namePlaceSetList;

    /**
     * Definition: Georeferences of the place using the GML
     * specification.
     */
    private java.util.Vector<eu.dca.model.Gml> _gmlList;

    /**
     * Definition: Allows for indexing larger geographical entities.
     */
    private java.util.Vector<eu.dca.model.PartOfPlace> _partOfPlaceList;

    /**
     * Definition: A classification of the place, e.g. by
     * geological complex, stratigraphic unit or habitat type.
     */
    private java.util.Vector<eu.dca.model.PlaceClassification> _placeClassificationList;


      //----------------/
     //- Constructors -/
    //----------------/

    public PlaceComplexType() {
        super();
        this._placeIDList = new java.util.Vector<eu.dca.model.PlaceID>();
        this._namePlaceSetList = new java.util.Vector<eu.dca.model.NamePlaceSet>();
        this._gmlList = new java.util.Vector<eu.dca.model.Gml>();
        this._partOfPlaceList = new java.util.Vector<eu.dca.model.PartOfPlace>();
        this._placeClassificationList = new java.util.Vector<eu.dca.model.PlaceClassification>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vGml
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addGml(
            final eu.dca.model.Gml vGml)
    throws java.lang.IndexOutOfBoundsException {
        this._gmlList.addElement(vGml);
    }

    /**
     * 
     * 
     * @param index
     * @param vGml
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addGml(
            final int index,
            final eu.dca.model.Gml vGml)
    throws java.lang.IndexOutOfBoundsException {
        this._gmlList.add(index, vGml);
    }

    /**
     * 
     * 
     * @param vNamePlaceSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addNamePlaceSet(
            final eu.dca.model.NamePlaceSet vNamePlaceSet)
    throws java.lang.IndexOutOfBoundsException {
        this._namePlaceSetList.addElement(vNamePlaceSet);
    }

    /**
     * 
     * 
     * @param index
     * @param vNamePlaceSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addNamePlaceSet(
            final int index,
            final eu.dca.model.NamePlaceSet vNamePlaceSet)
    throws java.lang.IndexOutOfBoundsException {
        this._namePlaceSetList.add(index, vNamePlaceSet);
    }

    /**
     * 
     * 
     * @param vPartOfPlace
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPartOfPlace(
            final eu.dca.model.PartOfPlace vPartOfPlace)
    throws java.lang.IndexOutOfBoundsException {
        this._partOfPlaceList.addElement(vPartOfPlace);
    }

    /**
     * 
     * 
     * @param index
     * @param vPartOfPlace
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPartOfPlace(
            final int index,
            final eu.dca.model.PartOfPlace vPartOfPlace)
    throws java.lang.IndexOutOfBoundsException {
        this._partOfPlaceList.add(index, vPartOfPlace);
    }

    /**
     * 
     * 
     * @param vPlaceClassification
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPlaceClassification(
            final eu.dca.model.PlaceClassification vPlaceClassification)
    throws java.lang.IndexOutOfBoundsException {
        this._placeClassificationList.addElement(vPlaceClassification);
    }

    /**
     * 
     * 
     * @param index
     * @param vPlaceClassification
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPlaceClassification(
            final int index,
            final eu.dca.model.PlaceClassification vPlaceClassification)
    throws java.lang.IndexOutOfBoundsException {
        this._placeClassificationList.add(index, vPlaceClassification);
    }

    /**
     * 
     * 
     * @param vPlaceID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPlaceID(
            final eu.dca.model.PlaceID vPlaceID)
    throws java.lang.IndexOutOfBoundsException {
        this._placeIDList.addElement(vPlaceID);
    }

    /**
     * 
     * 
     * @param index
     * @param vPlaceID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPlaceID(
            final int index,
            final eu.dca.model.PlaceID vPlaceID)
    throws java.lang.IndexOutOfBoundsException {
        this._placeIDList.add(index, vPlaceID);
    }

    /**
     * Method enumerateGml.
     * 
     * @return an Enumeration over all eu.dca.model.Gml elements
     */
    public java.util.Enumeration<? extends eu.dca.model.Gml> enumerateGml(
    ) {
        return this._gmlList.elements();
    }

    /**
     * Method enumerateNamePlaceSet.
     * 
     * @return an Enumeration over all eu.dca.model.NamePlaceSet
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.NamePlaceSet> enumerateNamePlaceSet(
    ) {
        return this._namePlaceSetList.elements();
    }

    /**
     * Method enumeratePartOfPlace.
     * 
     * @return an Enumeration over all eu.dca.model.PartOfPlace
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.PartOfPlace> enumeratePartOfPlace(
    ) {
        return this._partOfPlaceList.elements();
    }

    /**
     * Method enumeratePlaceClassification.
     * 
     * @return an Enumeration over all
     * eu.dca.model.PlaceClassification elements
     */
    public java.util.Enumeration<? extends eu.dca.model.PlaceClassification> enumeratePlaceClassification(
    ) {
        return this._placeClassificationList.elements();
    }

    /**
     * Method enumeratePlaceID.
     * 
     * @return an Enumeration over all eu.dca.model.PlaceID elements
     */
    public java.util.Enumeration<? extends eu.dca.model.PlaceID> enumeratePlaceID(
    ) {
        return this._placeIDList.elements();
    }

    /**
     * Returns the value of field 'geographicalEntity'. The field
     * 'geographicalEntity' has the following description:
     * Definition: Data values can include: Naturraum, Landschaft,
     * natural environment, landscape
     * 
     * @return the value of field 'GeographicalEntity'.
     */
    public java.lang.String getGeographicalEntity(
    ) {
        return this._geographicalEntity;
    }

    /**
     * Method getGml.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.Gml at the given index
     */
    public eu.dca.model.Gml getGml(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._gmlList.size()) {
            throw new IndexOutOfBoundsException("getGml: Index value '" + index + "' not in range [0.." + (this._gmlList.size() - 1) + "]");
        }

        return (eu.dca.model.Gml) _gmlList.get(index);
    }

    /**
     * Method getGml.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.Gml[] getGml(
    ) {
        eu.dca.model.Gml[] array = new eu.dca.model.Gml[0];
        return (eu.dca.model.Gml[]) this._gmlList.toArray(array);
    }

    /**
     * Method getGmlCount.
     * 
     * @return the size of this collection
     */
    public int getGmlCount(
    ) {
        return this._gmlList.size();
    }

    /**
     * Method getNamePlaceSet.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.NamePlaceSet at the
     * given index
     */
    public eu.dca.model.NamePlaceSet getNamePlaceSet(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._namePlaceSetList.size()) {
            throw new IndexOutOfBoundsException("getNamePlaceSet: Index value '" + index + "' not in range [0.." + (this._namePlaceSetList.size() - 1) + "]");
        }

        return (eu.dca.model.NamePlaceSet) _namePlaceSetList.get(index);
    }

    /**
     * Method getNamePlaceSet.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.NamePlaceSet[] getNamePlaceSet(
    ) {
        eu.dca.model.NamePlaceSet[] array = new eu.dca.model.NamePlaceSet[0];
        return (eu.dca.model.NamePlaceSet[]) this._namePlaceSetList.toArray(array);
    }

    /**
     * Method getNamePlaceSetCount.
     * 
     * @return the size of this collection
     */
    public int getNamePlaceSetCount(
    ) {
        return this._namePlaceSetList.size();
    }

    /**
     * Method getPartOfPlace.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.PartOfPlace at the
     * given index
     */
    public eu.dca.model.PartOfPlace getPartOfPlace(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._partOfPlaceList.size()) {
            throw new IndexOutOfBoundsException("getPartOfPlace: Index value '" + index + "' not in range [0.." + (this._partOfPlaceList.size() - 1) + "]");
        }

        return (eu.dca.model.PartOfPlace) _partOfPlaceList.get(index);
    }

    /**
     * Method getPartOfPlace.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.PartOfPlace[] getPartOfPlace(
    ) {
        eu.dca.model.PartOfPlace[] array = new eu.dca.model.PartOfPlace[0];
        return (eu.dca.model.PartOfPlace[]) this._partOfPlaceList.toArray(array);
    }

    /**
     * Method getPartOfPlaceCount.
     * 
     * @return the size of this collection
     */
    public int getPartOfPlaceCount(
    ) {
        return this._partOfPlaceList.size();
    }

    /**
     * Method getPlaceClassification.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.PlaceClassification at
     * the given index
     */
    public eu.dca.model.PlaceClassification getPlaceClassification(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._placeClassificationList.size()) {
            throw new IndexOutOfBoundsException("getPlaceClassification: Index value '" + index + "' not in range [0.." + (this._placeClassificationList.size() - 1) + "]");
        }

        return (eu.dca.model.PlaceClassification) _placeClassificationList.get(index);
    }

    /**
     * Method getPlaceClassification.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.PlaceClassification[] getPlaceClassification(
    ) {
        eu.dca.model.PlaceClassification[] array = new eu.dca.model.PlaceClassification[0];
        return (eu.dca.model.PlaceClassification[]) this._placeClassificationList.toArray(array);
    }

    /**
     * Method getPlaceClassificationCount.
     * 
     * @return the size of this collection
     */
    public int getPlaceClassificationCount(
    ) {
        return this._placeClassificationList.size();
    }

    /**
     * Method getPlaceID.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.PlaceID at the given
     * index
     */
    public eu.dca.model.PlaceID getPlaceID(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._placeIDList.size()) {
            throw new IndexOutOfBoundsException("getPlaceID: Index value '" + index + "' not in range [0.." + (this._placeIDList.size() - 1) + "]");
        }

        return (eu.dca.model.PlaceID) _placeIDList.get(index);
    }

    /**
     * Method getPlaceID.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.PlaceID[] getPlaceID(
    ) {
        eu.dca.model.PlaceID[] array = new eu.dca.model.PlaceID[0];
        return (eu.dca.model.PlaceID[]) this._placeIDList.toArray(array);
    }

    /**
     * Method getPlaceIDCount.
     * 
     * @return the size of this collection
     */
    public int getPlaceIDCount(
    ) {
        return this._placeIDList.size();
    }

    /**
     * Returns the value of field 'politicalEntity'. The field
     * 'politicalEntity' has the following description: Definition:
     * Data values can include: Gemeinde, Kreis, Bundesland, Staat,
     * Herzogtum, city, county, country, civil parish
     * 
     * @return the value of field 'PoliticalEntity'.
     */
    public java.lang.String getPoliticalEntity(
    ) {
        return this._politicalEntity;
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
    public void removeAllGml(
    ) {
        this._gmlList.clear();
    }

    /**
     */
    public void removeAllNamePlaceSet(
    ) {
        this._namePlaceSetList.clear();
    }

    /**
     */
    public void removeAllPartOfPlace(
    ) {
        this._partOfPlaceList.clear();
    }

    /**
     */
    public void removeAllPlaceClassification(
    ) {
        this._placeClassificationList.clear();
    }

    /**
     */
    public void removeAllPlaceID(
    ) {
        this._placeIDList.clear();
    }

    /**
     * Method removeGml.
     * 
     * @param vGml
     * @return true if the object was removed from the collection.
     */
    public boolean removeGml(
            final eu.dca.model.Gml vGml) {
        boolean removed = _gmlList.remove(vGml);
        return removed;
    }

    /**
     * Method removeGmlAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.Gml removeGmlAt(
            final int index) {
        java.lang.Object obj = this._gmlList.remove(index);
        return (eu.dca.model.Gml) obj;
    }

    /**
     * Method removeNamePlaceSet.
     * 
     * @param vNamePlaceSet
     * @return true if the object was removed from the collection.
     */
    public boolean removeNamePlaceSet(
            final eu.dca.model.NamePlaceSet vNamePlaceSet) {
        boolean removed = _namePlaceSetList.remove(vNamePlaceSet);
        return removed;
    }

    /**
     * Method removeNamePlaceSetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.NamePlaceSet removeNamePlaceSetAt(
            final int index) {
        java.lang.Object obj = this._namePlaceSetList.remove(index);
        return (eu.dca.model.NamePlaceSet) obj;
    }

    /**
     * Method removePartOfPlace.
     * 
     * @param vPartOfPlace
     * @return true if the object was removed from the collection.
     */
    public boolean removePartOfPlace(
            final eu.dca.model.PartOfPlace vPartOfPlace) {
        boolean removed = _partOfPlaceList.remove(vPartOfPlace);
        return removed;
    }

    /**
     * Method removePartOfPlaceAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.PartOfPlace removePartOfPlaceAt(
            final int index) {
        java.lang.Object obj = this._partOfPlaceList.remove(index);
        return (eu.dca.model.PartOfPlace) obj;
    }

    /**
     * Method removePlaceClassification.
     * 
     * @param vPlaceClassification
     * @return true if the object was removed from the collection.
     */
    public boolean removePlaceClassification(
            final eu.dca.model.PlaceClassification vPlaceClassification) {
        boolean removed = _placeClassificationList.remove(vPlaceClassification);
        return removed;
    }

    /**
     * Method removePlaceClassificationAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.PlaceClassification removePlaceClassificationAt(
            final int index) {
        java.lang.Object obj = this._placeClassificationList.remove(index);
        return (eu.dca.model.PlaceClassification) obj;
    }

    /**
     * Method removePlaceID.
     * 
     * @param vPlaceID
     * @return true if the object was removed from the collection.
     */
    public boolean removePlaceID(
            final eu.dca.model.PlaceID vPlaceID) {
        boolean removed = _placeIDList.remove(vPlaceID);
        return removed;
    }

    /**
     * Method removePlaceIDAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.PlaceID removePlaceIDAt(
            final int index) {
        java.lang.Object obj = this._placeIDList.remove(index);
        return (eu.dca.model.PlaceID) obj;
    }

    /**
     * Sets the value of field 'geographicalEntity'. The field
     * 'geographicalEntity' has the following description:
     * Definition: Data values can include: Naturraum, Landschaft,
     * natural environment, landscape
     * 
     * @param geographicalEntity the value of field
     * 'geographicalEntity'.
     */
    public void setGeographicalEntity(
            final java.lang.String geographicalEntity) {
        this._geographicalEntity = geographicalEntity;
    }

    /**
     * 
     * 
     * @param index
     * @param vGml
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setGml(
            final int index,
            final eu.dca.model.Gml vGml)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._gmlList.size()) {
            throw new IndexOutOfBoundsException("setGml: Index value '" + index + "' not in range [0.." + (this._gmlList.size() - 1) + "]");
        }

        this._gmlList.set(index, vGml);
    }

    /**
     * 
     * 
     * @param vGmlArray
     */
    public void setGml(
            final eu.dca.model.Gml[] vGmlArray) {
        //-- copy array
        _gmlList.clear();

        for (int i = 0; i < vGmlArray.length; i++) {
                this._gmlList.add(vGmlArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vNamePlaceSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setNamePlaceSet(
            final int index,
            final eu.dca.model.NamePlaceSet vNamePlaceSet)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._namePlaceSetList.size()) {
            throw new IndexOutOfBoundsException("setNamePlaceSet: Index value '" + index + "' not in range [0.." + (this._namePlaceSetList.size() - 1) + "]");
        }

        this._namePlaceSetList.set(index, vNamePlaceSet);
    }

    /**
     * 
     * 
     * @param vNamePlaceSetArray
     */
    public void setNamePlaceSet(
            final eu.dca.model.NamePlaceSet[] vNamePlaceSetArray) {
        //-- copy array
        _namePlaceSetList.clear();

        for (int i = 0; i < vNamePlaceSetArray.length; i++) {
                this._namePlaceSetList.add(vNamePlaceSetArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vPartOfPlace
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setPartOfPlace(
            final int index,
            final eu.dca.model.PartOfPlace vPartOfPlace)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._partOfPlaceList.size()) {
            throw new IndexOutOfBoundsException("setPartOfPlace: Index value '" + index + "' not in range [0.." + (this._partOfPlaceList.size() - 1) + "]");
        }

        this._partOfPlaceList.set(index, vPartOfPlace);
    }

    /**
     * 
     * 
     * @param vPartOfPlaceArray
     */
    public void setPartOfPlace(
            final eu.dca.model.PartOfPlace[] vPartOfPlaceArray) {
        //-- copy array
        _partOfPlaceList.clear();

        for (int i = 0; i < vPartOfPlaceArray.length; i++) {
                this._partOfPlaceList.add(vPartOfPlaceArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vPlaceClassification
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setPlaceClassification(
            final int index,
            final eu.dca.model.PlaceClassification vPlaceClassification)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._placeClassificationList.size()) {
            throw new IndexOutOfBoundsException("setPlaceClassification: Index value '" + index + "' not in range [0.." + (this._placeClassificationList.size() - 1) + "]");
        }

        this._placeClassificationList.set(index, vPlaceClassification);
    }

    /**
     * 
     * 
     * @param vPlaceClassificationArray
     */
    public void setPlaceClassification(
            final eu.dca.model.PlaceClassification[] vPlaceClassificationArray) {
        //-- copy array
        _placeClassificationList.clear();

        for (int i = 0; i < vPlaceClassificationArray.length; i++) {
                this._placeClassificationList.add(vPlaceClassificationArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vPlaceID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setPlaceID(
            final int index,
            final eu.dca.model.PlaceID vPlaceID)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._placeIDList.size()) {
            throw new IndexOutOfBoundsException("setPlaceID: Index value '" + index + "' not in range [0.." + (this._placeIDList.size() - 1) + "]");
        }

        this._placeIDList.set(index, vPlaceID);
    }

    /**
     * 
     * 
     * @param vPlaceIDArray
     */
    public void setPlaceID(
            final eu.dca.model.PlaceID[] vPlaceIDArray) {
        //-- copy array
        _placeIDList.clear();

        for (int i = 0; i < vPlaceIDArray.length; i++) {
                this._placeIDList.add(vPlaceIDArray[i]);
        }
    }

    /**
     * Sets the value of field 'politicalEntity'. The field
     * 'politicalEntity' has the following description: Definition:
     * Data values can include: Gemeinde, Kreis, Bundesland, Staat,
     * Herzogtum, city, county, country, civil parish
     * 
     * @param politicalEntity the value of field 'politicalEntity'.
     */
    public void setPoliticalEntity(
            final java.lang.String politicalEntity) {
        this._politicalEntity = politicalEntity;
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
