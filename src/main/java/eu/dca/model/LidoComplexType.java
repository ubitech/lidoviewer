/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: Holds the metadata of an object / work.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class LidoComplexType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: Indicates the format of the data source from
     * which the data were migrated. For each sub-element with data
     * values then the related source data fields can be referenced
     * through the attributes encodinganalog and label.
     */
    private java.lang.String _relatedencoding;

    /**
     * Definition: A unique lido record identification preferably
     * composed of an identifier for the contributor and a record
     * identification in the contributor's (local) system.
     */
    private java.util.Vector<eu.dca.model.LidoRecID> _lidoRecIDList;

    /**
     * Definition: A unique, published identification of the
     * described object / work. 
     */
    private java.util.Vector<eu.dca.model.ObjectPublishedID> _objectPublishedIDList;

    /**
     * Definition: Indicates the category of which this item is an
     * instance, preferably referring to CIDOC-CRM concept
     * definitions. 
     */
    private eu.dca.model.Category _category;

    /**
     * Field _lidoDescriptiveMetadataList.
     */
    private java.util.Vector<eu.dca.model.LidoDescriptiveMetadata> _lidoDescriptiveMetadataList;

    /**
     * Field _lidoAdministrativeMetadataList.
     */
    private java.util.Vector<eu.dca.model.LidoAdministrativeMetadata> _lidoAdministrativeMetadataList;


      //----------------/
     //- Constructors -/
    //----------------/

    public LidoComplexType() {
        super();
        this._lidoRecIDList = new java.util.Vector<eu.dca.model.LidoRecID>();
        this._objectPublishedIDList = new java.util.Vector<eu.dca.model.ObjectPublishedID>();
        this._lidoDescriptiveMetadataList = new java.util.Vector<eu.dca.model.LidoDescriptiveMetadata>();
        this._lidoAdministrativeMetadataList = new java.util.Vector<eu.dca.model.LidoAdministrativeMetadata>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vLidoAdministrativeMetadata
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addLidoAdministrativeMetadata(
            final eu.dca.model.LidoAdministrativeMetadata vLidoAdministrativeMetadata)
    throws java.lang.IndexOutOfBoundsException {
        this._lidoAdministrativeMetadataList.addElement(vLidoAdministrativeMetadata);
    }

    /**
     * 
     * 
     * @param index
     * @param vLidoAdministrativeMetadata
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addLidoAdministrativeMetadata(
            final int index,
            final eu.dca.model.LidoAdministrativeMetadata vLidoAdministrativeMetadata)
    throws java.lang.IndexOutOfBoundsException {
        this._lidoAdministrativeMetadataList.add(index, vLidoAdministrativeMetadata);
    }

    /**
     * 
     * 
     * @param vLidoDescriptiveMetadata
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addLidoDescriptiveMetadata(
            final eu.dca.model.LidoDescriptiveMetadata vLidoDescriptiveMetadata)
    throws java.lang.IndexOutOfBoundsException {
        this._lidoDescriptiveMetadataList.addElement(vLidoDescriptiveMetadata);
    }

    /**
     * 
     * 
     * @param index
     * @param vLidoDescriptiveMetadata
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addLidoDescriptiveMetadata(
            final int index,
            final eu.dca.model.LidoDescriptiveMetadata vLidoDescriptiveMetadata)
    throws java.lang.IndexOutOfBoundsException {
        this._lidoDescriptiveMetadataList.add(index, vLidoDescriptiveMetadata);
    }

    /**
     * 
     * 
     * @param vLidoRecID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addLidoRecID(
            final eu.dca.model.LidoRecID vLidoRecID)
    throws java.lang.IndexOutOfBoundsException {
        this._lidoRecIDList.addElement(vLidoRecID);
    }

    /**
     * 
     * 
     * @param index
     * @param vLidoRecID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addLidoRecID(
            final int index,
            final eu.dca.model.LidoRecID vLidoRecID)
    throws java.lang.IndexOutOfBoundsException {
        this._lidoRecIDList.add(index, vLidoRecID);
    }

    /**
     * 
     * 
     * @param vObjectPublishedID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addObjectPublishedID(
            final eu.dca.model.ObjectPublishedID vObjectPublishedID)
    throws java.lang.IndexOutOfBoundsException {
        this._objectPublishedIDList.addElement(vObjectPublishedID);
    }

    /**
     * 
     * 
     * @param index
     * @param vObjectPublishedID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addObjectPublishedID(
            final int index,
            final eu.dca.model.ObjectPublishedID vObjectPublishedID)
    throws java.lang.IndexOutOfBoundsException {
        this._objectPublishedIDList.add(index, vObjectPublishedID);
    }

    /**
     * Method enumerateLidoAdministrativeMetadata.
     * 
     * @return an Enumeration over all
     * eu.dca.model.LidoAdministrativeMetadata elements
     */
    public java.util.Enumeration<? extends eu.dca.model.LidoAdministrativeMetadata> enumerateLidoAdministrativeMetadata(
    ) {
        return this._lidoAdministrativeMetadataList.elements();
    }

    /**
     * Method enumerateLidoDescriptiveMetadata.
     * 
     * @return an Enumeration over all
     * eu.dca.model.LidoDescriptiveMetadata elements
     */
    public java.util.Enumeration<? extends eu.dca.model.LidoDescriptiveMetadata> enumerateLidoDescriptiveMetadata(
    ) {
        return this._lidoDescriptiveMetadataList.elements();
    }

    /**
     * Method enumerateLidoRecID.
     * 
     * @return an Enumeration over all eu.dca.model.LidoRecID
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.LidoRecID> enumerateLidoRecID(
    ) {
        return this._lidoRecIDList.elements();
    }

    /**
     * Method enumerateObjectPublishedID.
     * 
     * @return an Enumeration over all
     * eu.dca.model.ObjectPublishedID elements
     */
    public java.util.Enumeration<? extends eu.dca.model.ObjectPublishedID> enumerateObjectPublishedID(
    ) {
        return this._objectPublishedIDList.elements();
    }

    /**
     * Returns the value of field 'category'. The field 'category'
     * has the following description: Definition: Indicates the
     * category of which this item is an instance, preferably
     * referring to CIDOC-CRM concept definitions. 
     * 
     * @return the value of field 'Category'.
     */
    public eu.dca.model.Category getCategory(
    ) {
        return this._category;
    }

    /**
     * Method getLidoAdministrativeMetadata.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * eu.dca.model.LidoAdministrativeMetadata at the given index
     */
    public eu.dca.model.LidoAdministrativeMetadata getLidoAdministrativeMetadata(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._lidoAdministrativeMetadataList.size()) {
            throw new IndexOutOfBoundsException("getLidoAdministrativeMetadata: Index value '" + index + "' not in range [0.." + (this._lidoAdministrativeMetadataList.size() - 1) + "]");
        }

        return (eu.dca.model.LidoAdministrativeMetadata) _lidoAdministrativeMetadataList.get(index);
    }

    /**
     * Method getLidoAdministrativeMetadata.Returns the contents of
     * the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.LidoAdministrativeMetadata[] getLidoAdministrativeMetadata(
    ) {
        eu.dca.model.LidoAdministrativeMetadata[] array = new eu.dca.model.LidoAdministrativeMetadata[0];
        return (eu.dca.model.LidoAdministrativeMetadata[]) this._lidoAdministrativeMetadataList.toArray(array);
    }

    /**
     * Method getLidoAdministrativeMetadataCount.
     * 
     * @return the size of this collection
     */
    public int getLidoAdministrativeMetadataCount(
    ) {
        return this._lidoAdministrativeMetadataList.size();
    }

    /**
     * Method getLidoDescriptiveMetadata.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * eu.dca.model.LidoDescriptiveMetadata at the given index
     */
    public eu.dca.model.LidoDescriptiveMetadata getLidoDescriptiveMetadata(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._lidoDescriptiveMetadataList.size()) {
            throw new IndexOutOfBoundsException("getLidoDescriptiveMetadata: Index value '" + index + "' not in range [0.." + (this._lidoDescriptiveMetadataList.size() - 1) + "]");
        }

        return (eu.dca.model.LidoDescriptiveMetadata) _lidoDescriptiveMetadataList.get(index);
    }

    /**
     * Method getLidoDescriptiveMetadata.Returns the contents of
     * the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.LidoDescriptiveMetadata[] getLidoDescriptiveMetadata(
    ) {
        eu.dca.model.LidoDescriptiveMetadata[] array = new eu.dca.model.LidoDescriptiveMetadata[0];
        return (eu.dca.model.LidoDescriptiveMetadata[]) this._lidoDescriptiveMetadataList.toArray(array);
    }

    /**
     * Method getLidoDescriptiveMetadataCount.
     * 
     * @return the size of this collection
     */
    public int getLidoDescriptiveMetadataCount(
    ) {
        return this._lidoDescriptiveMetadataList.size();
    }

    /**
     * Method getLidoRecID.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.LidoRecID at the given
     * index
     */
    public eu.dca.model.LidoRecID getLidoRecID(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._lidoRecIDList.size()) {
            throw new IndexOutOfBoundsException("getLidoRecID: Index value '" + index + "' not in range [0.." + (this._lidoRecIDList.size() - 1) + "]");
        }

        return (eu.dca.model.LidoRecID) _lidoRecIDList.get(index);
    }

    /**
     * Method getLidoRecID.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.LidoRecID[] getLidoRecID(
    ) {
        eu.dca.model.LidoRecID[] array = new eu.dca.model.LidoRecID[0];
        return (eu.dca.model.LidoRecID[]) this._lidoRecIDList.toArray(array);
    }

    /**
     * Method getLidoRecIDCount.
     * 
     * @return the size of this collection
     */
    public int getLidoRecIDCount(
    ) {
        return this._lidoRecIDList.size();
    }

    /**
     * Method getObjectPublishedID.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.ObjectPublishedID at
     * the given index
     */
    public eu.dca.model.ObjectPublishedID getObjectPublishedID(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._objectPublishedIDList.size()) {
            throw new IndexOutOfBoundsException("getObjectPublishedID: Index value '" + index + "' not in range [0.." + (this._objectPublishedIDList.size() - 1) + "]");
        }

        return (eu.dca.model.ObjectPublishedID) _objectPublishedIDList.get(index);
    }

    /**
     * Method getObjectPublishedID.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.ObjectPublishedID[] getObjectPublishedID(
    ) {
        eu.dca.model.ObjectPublishedID[] array = new eu.dca.model.ObjectPublishedID[0];
        return (eu.dca.model.ObjectPublishedID[]) this._objectPublishedIDList.toArray(array);
    }

    /**
     * Method getObjectPublishedIDCount.
     * 
     * @return the size of this collection
     */
    public int getObjectPublishedIDCount(
    ) {
        return this._objectPublishedIDList.size();
    }

    /**
     * Returns the value of field 'relatedencoding'. The field
     * 'relatedencoding' has the following description: Definition:
     * Indicates the format of the data source from which the data
     * were migrated. For each sub-element with data values then
     * the related source data fields can be referenced through the
     * attributes encodinganalog and label.
     * 
     * @return the value of field 'Relatedencoding'.
     */
    public java.lang.String getRelatedencoding(
    ) {
        return this._relatedencoding;
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
    public void removeAllLidoAdministrativeMetadata(
    ) {
        this._lidoAdministrativeMetadataList.clear();
    }

    /**
     */
    public void removeAllLidoDescriptiveMetadata(
    ) {
        this._lidoDescriptiveMetadataList.clear();
    }

    /**
     */
    public void removeAllLidoRecID(
    ) {
        this._lidoRecIDList.clear();
    }

    /**
     */
    public void removeAllObjectPublishedID(
    ) {
        this._objectPublishedIDList.clear();
    }

    /**
     * Method removeLidoAdministrativeMetadata.
     * 
     * @param vLidoAdministrativeMetadata
     * @return true if the object was removed from the collection.
     */
    public boolean removeLidoAdministrativeMetadata(
            final eu.dca.model.LidoAdministrativeMetadata vLidoAdministrativeMetadata) {
        boolean removed = _lidoAdministrativeMetadataList.remove(vLidoAdministrativeMetadata);
        return removed;
    }

    /**
     * Method removeLidoAdministrativeMetadataAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.LidoAdministrativeMetadata removeLidoAdministrativeMetadataAt(
            final int index) {
        java.lang.Object obj = this._lidoAdministrativeMetadataList.remove(index);
        return (eu.dca.model.LidoAdministrativeMetadata) obj;
    }

    /**
     * Method removeLidoDescriptiveMetadata.
     * 
     * @param vLidoDescriptiveMetadata
     * @return true if the object was removed from the collection.
     */
    public boolean removeLidoDescriptiveMetadata(
            final eu.dca.model.LidoDescriptiveMetadata vLidoDescriptiveMetadata) {
        boolean removed = _lidoDescriptiveMetadataList.remove(vLidoDescriptiveMetadata);
        return removed;
    }

    /**
     * Method removeLidoDescriptiveMetadataAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.LidoDescriptiveMetadata removeLidoDescriptiveMetadataAt(
            final int index) {
        java.lang.Object obj = this._lidoDescriptiveMetadataList.remove(index);
        return (eu.dca.model.LidoDescriptiveMetadata) obj;
    }

    /**
     * Method removeLidoRecID.
     * 
     * @param vLidoRecID
     * @return true if the object was removed from the collection.
     */
    public boolean removeLidoRecID(
            final eu.dca.model.LidoRecID vLidoRecID) {
        boolean removed = _lidoRecIDList.remove(vLidoRecID);
        return removed;
    }

    /**
     * Method removeLidoRecIDAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.LidoRecID removeLidoRecIDAt(
            final int index) {
        java.lang.Object obj = this._lidoRecIDList.remove(index);
        return (eu.dca.model.LidoRecID) obj;
    }

    /**
     * Method removeObjectPublishedID.
     * 
     * @param vObjectPublishedID
     * @return true if the object was removed from the collection.
     */
    public boolean removeObjectPublishedID(
            final eu.dca.model.ObjectPublishedID vObjectPublishedID) {
        boolean removed = _objectPublishedIDList.remove(vObjectPublishedID);
        return removed;
    }

    /**
     * Method removeObjectPublishedIDAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.ObjectPublishedID removeObjectPublishedIDAt(
            final int index) {
        java.lang.Object obj = this._objectPublishedIDList.remove(index);
        return (eu.dca.model.ObjectPublishedID) obj;
    }

    /**
     * Sets the value of field 'category'. The field 'category' has
     * the following description: Definition: Indicates the
     * category of which this item is an instance, preferably
     * referring to CIDOC-CRM concept definitions. 
     * 
     * @param category the value of field 'category'.
     */
    public void setCategory(
            final eu.dca.model.Category category) {
        this._category = category;
    }

    /**
     * 
     * 
     * @param index
     * @param vLidoAdministrativeMetadata
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setLidoAdministrativeMetadata(
            final int index,
            final eu.dca.model.LidoAdministrativeMetadata vLidoAdministrativeMetadata)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._lidoAdministrativeMetadataList.size()) {
            throw new IndexOutOfBoundsException("setLidoAdministrativeMetadata: Index value '" + index + "' not in range [0.." + (this._lidoAdministrativeMetadataList.size() - 1) + "]");
        }

        this._lidoAdministrativeMetadataList.set(index, vLidoAdministrativeMetadata);
    }

    /**
     * 
     * 
     * @param vLidoAdministrativeMetadataArray
     */
    public void setLidoAdministrativeMetadata(
            final eu.dca.model.LidoAdministrativeMetadata[] vLidoAdministrativeMetadataArray) {
        //-- copy array
        _lidoAdministrativeMetadataList.clear();

        for (int i = 0; i < vLidoAdministrativeMetadataArray.length; i++) {
                this._lidoAdministrativeMetadataList.add(vLidoAdministrativeMetadataArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vLidoDescriptiveMetadata
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setLidoDescriptiveMetadata(
            final int index,
            final eu.dca.model.LidoDescriptiveMetadata vLidoDescriptiveMetadata)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._lidoDescriptiveMetadataList.size()) {
            throw new IndexOutOfBoundsException("setLidoDescriptiveMetadata: Index value '" + index + "' not in range [0.." + (this._lidoDescriptiveMetadataList.size() - 1) + "]");
        }

        this._lidoDescriptiveMetadataList.set(index, vLidoDescriptiveMetadata);
    }

    /**
     * 
     * 
     * @param vLidoDescriptiveMetadataArray
     */
    public void setLidoDescriptiveMetadata(
            final eu.dca.model.LidoDescriptiveMetadata[] vLidoDescriptiveMetadataArray) {
        //-- copy array
        _lidoDescriptiveMetadataList.clear();

        for (int i = 0; i < vLidoDescriptiveMetadataArray.length; i++) {
                this._lidoDescriptiveMetadataList.add(vLidoDescriptiveMetadataArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vLidoRecID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setLidoRecID(
            final int index,
            final eu.dca.model.LidoRecID vLidoRecID)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._lidoRecIDList.size()) {
            throw new IndexOutOfBoundsException("setLidoRecID: Index value '" + index + "' not in range [0.." + (this._lidoRecIDList.size() - 1) + "]");
        }

        this._lidoRecIDList.set(index, vLidoRecID);
    }

    /**
     * 
     * 
     * @param vLidoRecIDArray
     */
    public void setLidoRecID(
            final eu.dca.model.LidoRecID[] vLidoRecIDArray) {
        //-- copy array
        _lidoRecIDList.clear();

        for (int i = 0; i < vLidoRecIDArray.length; i++) {
                this._lidoRecIDList.add(vLidoRecIDArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vObjectPublishedID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setObjectPublishedID(
            final int index,
            final eu.dca.model.ObjectPublishedID vObjectPublishedID)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._objectPublishedIDList.size()) {
            throw new IndexOutOfBoundsException("setObjectPublishedID: Index value '" + index + "' not in range [0.." + (this._objectPublishedIDList.size() - 1) + "]");
        }

        this._objectPublishedIDList.set(index, vObjectPublishedID);
    }

    /**
     * 
     * 
     * @param vObjectPublishedIDArray
     */
    public void setObjectPublishedID(
            final eu.dca.model.ObjectPublishedID[] vObjectPublishedIDArray) {
        //-- copy array
        _objectPublishedIDList.clear();

        for (int i = 0; i < vObjectPublishedIDArray.length; i++) {
                this._objectPublishedIDList.add(vObjectPublishedIDArray[i]);
        }
    }

    /**
     * Sets the value of field 'relatedencoding'. The field
     * 'relatedencoding' has the following description: Definition:
     * Indicates the format of the data source from which the data
     * were migrated. For each sub-element with data values then
     * the related source data fields can be referenced through the
     * attributes encodinganalog and label.
     * 
     * @param relatedencoding the value of field 'relatedencoding'.
     */
    public void setRelatedencoding(
            final java.lang.String relatedencoding) {
        this._relatedencoding = relatedencoding;
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
