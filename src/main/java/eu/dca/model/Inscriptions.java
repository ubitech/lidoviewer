/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: A transcription or description of any distinguishing
 * or identifying physical lettering, annotations, texts, markings,
 * or labels that are affixed, applied, stamped, written,
 * inscribed, or attached to the object / work, excluding any mark
 * or text inherent in the materials of which it is made. Notes:
 * Record watermarks in Display Materials/Techniques.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class Inscriptions implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: Qualifies the type of information given in the
     * holding element. 
     */
    private java.lang.String _type;

    /**
     * Definition: Assigns a priority order for online presentation
     * of the element. 
     */
    private long _sortorder;

    /**
     * keeps track of state for field: _sortorder
     */
    private boolean _has_sortorder;

    /**
     * Definition: Transcription of the inscription.
     */
    private java.util.Vector<eu.dca.model.InscriptionTranscription> _inscriptionTranscriptionList;

    /**
     * Definition: Wrapper for a description of the inscription,
     * including description identifer, descriptive note of the
     * inscription and sources. 
     */
    private java.util.Vector<eu.dca.model.InscriptionDescription> _inscriptionDescriptionList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Inscriptions() {
        super();
        this._inscriptionTranscriptionList = new java.util.Vector<eu.dca.model.InscriptionTranscription>();
        this._inscriptionDescriptionList = new java.util.Vector<eu.dca.model.InscriptionDescription>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vInscriptionDescription
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addInscriptionDescription(
            final eu.dca.model.InscriptionDescription vInscriptionDescription)
    throws java.lang.IndexOutOfBoundsException {
        this._inscriptionDescriptionList.addElement(vInscriptionDescription);
    }

    /**
     * 
     * 
     * @param index
     * @param vInscriptionDescription
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addInscriptionDescription(
            final int index,
            final eu.dca.model.InscriptionDescription vInscriptionDescription)
    throws java.lang.IndexOutOfBoundsException {
        this._inscriptionDescriptionList.add(index, vInscriptionDescription);
    }

    /**
     * 
     * 
     * @param vInscriptionTranscription
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addInscriptionTranscription(
            final eu.dca.model.InscriptionTranscription vInscriptionTranscription)
    throws java.lang.IndexOutOfBoundsException {
        this._inscriptionTranscriptionList.addElement(vInscriptionTranscription);
    }

    /**
     * 
     * 
     * @param index
     * @param vInscriptionTranscription
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addInscriptionTranscription(
            final int index,
            final eu.dca.model.InscriptionTranscription vInscriptionTranscription)
    throws java.lang.IndexOutOfBoundsException {
        this._inscriptionTranscriptionList.add(index, vInscriptionTranscription);
    }

    /**
     */
    public void deleteSortorder(
    ) {
        this._has_sortorder= false;
    }

    /**
     * Method enumerateInscriptionDescription.
     * 
     * @return an Enumeration over all
     * eu.dca.model.InscriptionDescription elements
     */
    public java.util.Enumeration<? extends eu.dca.model.InscriptionDescription> enumerateInscriptionDescription(
    ) {
        return this._inscriptionDescriptionList.elements();
    }

    /**
     * Method enumerateInscriptionTranscription.
     * 
     * @return an Enumeration over all
     * eu.dca.model.InscriptionTranscription elements
     */
    public java.util.Enumeration<? extends eu.dca.model.InscriptionTranscription> enumerateInscriptionTranscription(
    ) {
        return this._inscriptionTranscriptionList.elements();
    }

    /**
     * Method getInscriptionDescription.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.InscriptionDescription
     * at the given index
     */
    public eu.dca.model.InscriptionDescription getInscriptionDescription(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._inscriptionDescriptionList.size()) {
            throw new IndexOutOfBoundsException("getInscriptionDescription: Index value '" + index + "' not in range [0.." + (this._inscriptionDescriptionList.size() - 1) + "]");
        }

        return (eu.dca.model.InscriptionDescription) _inscriptionDescriptionList.get(index);
    }

    /**
     * Method getInscriptionDescription.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.InscriptionDescription[] getInscriptionDescription(
    ) {
        eu.dca.model.InscriptionDescription[] array = new eu.dca.model.InscriptionDescription[0];
        return (eu.dca.model.InscriptionDescription[]) this._inscriptionDescriptionList.toArray(array);
    }

    /**
     * Method getInscriptionDescriptionCount.
     * 
     * @return the size of this collection
     */
    public int getInscriptionDescriptionCount(
    ) {
        return this._inscriptionDescriptionList.size();
    }

    /**
     * Method getInscriptionTranscription.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * eu.dca.model.InscriptionTranscription at the given index
     */
    public eu.dca.model.InscriptionTranscription getInscriptionTranscription(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._inscriptionTranscriptionList.size()) {
            throw new IndexOutOfBoundsException("getInscriptionTranscription: Index value '" + index + "' not in range [0.." + (this._inscriptionTranscriptionList.size() - 1) + "]");
        }

        return (eu.dca.model.InscriptionTranscription) _inscriptionTranscriptionList.get(index);
    }

    /**
     * Method getInscriptionTranscription.Returns the contents of
     * the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.InscriptionTranscription[] getInscriptionTranscription(
    ) {
        eu.dca.model.InscriptionTranscription[] array = new eu.dca.model.InscriptionTranscription[0];
        return (eu.dca.model.InscriptionTranscription[]) this._inscriptionTranscriptionList.toArray(array);
    }

    /**
     * Method getInscriptionTranscriptionCount.
     * 
     * @return the size of this collection
     */
    public int getInscriptionTranscriptionCount(
    ) {
        return this._inscriptionTranscriptionList.size();
    }

    /**
     * Returns the value of field 'sortorder'. The field
     * 'sortorder' has the following description: Definition:
     * Assigns a priority order for online presentation of the
     * element. 
     * 
     * @return the value of field 'Sortorder'.
     */
    public long getSortorder(
    ) {
        return this._sortorder;
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
     * Method hasSortorder.
     * 
     * @return true if at least one Sortorder has been added
     */
    public boolean hasSortorder(
    ) {
        return this._has_sortorder;
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
    public void removeAllInscriptionDescription(
    ) {
        this._inscriptionDescriptionList.clear();
    }

    /**
     */
    public void removeAllInscriptionTranscription(
    ) {
        this._inscriptionTranscriptionList.clear();
    }

    /**
     * Method removeInscriptionDescription.
     * 
     * @param vInscriptionDescription
     * @return true if the object was removed from the collection.
     */
    public boolean removeInscriptionDescription(
            final eu.dca.model.InscriptionDescription vInscriptionDescription) {
        boolean removed = _inscriptionDescriptionList.remove(vInscriptionDescription);
        return removed;
    }

    /**
     * Method removeInscriptionDescriptionAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.InscriptionDescription removeInscriptionDescriptionAt(
            final int index) {
        java.lang.Object obj = this._inscriptionDescriptionList.remove(index);
        return (eu.dca.model.InscriptionDescription) obj;
    }

    /**
     * Method removeInscriptionTranscription.
     * 
     * @param vInscriptionTranscription
     * @return true if the object was removed from the collection.
     */
    public boolean removeInscriptionTranscription(
            final eu.dca.model.InscriptionTranscription vInscriptionTranscription) {
        boolean removed = _inscriptionTranscriptionList.remove(vInscriptionTranscription);
        return removed;
    }

    /**
     * Method removeInscriptionTranscriptionAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.InscriptionTranscription removeInscriptionTranscriptionAt(
            final int index) {
        java.lang.Object obj = this._inscriptionTranscriptionList.remove(index);
        return (eu.dca.model.InscriptionTranscription) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vInscriptionDescription
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setInscriptionDescription(
            final int index,
            final eu.dca.model.InscriptionDescription vInscriptionDescription)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._inscriptionDescriptionList.size()) {
            throw new IndexOutOfBoundsException("setInscriptionDescription: Index value '" + index + "' not in range [0.." + (this._inscriptionDescriptionList.size() - 1) + "]");
        }

        this._inscriptionDescriptionList.set(index, vInscriptionDescription);
    }

    /**
     * 
     * 
     * @param vInscriptionDescriptionArray
     */
    public void setInscriptionDescription(
            final eu.dca.model.InscriptionDescription[] vInscriptionDescriptionArray) {
        //-- copy array
        _inscriptionDescriptionList.clear();

        for (int i = 0; i < vInscriptionDescriptionArray.length; i++) {
                this._inscriptionDescriptionList.add(vInscriptionDescriptionArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vInscriptionTranscription
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setInscriptionTranscription(
            final int index,
            final eu.dca.model.InscriptionTranscription vInscriptionTranscription)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._inscriptionTranscriptionList.size()) {
            throw new IndexOutOfBoundsException("setInscriptionTranscription: Index value '" + index + "' not in range [0.." + (this._inscriptionTranscriptionList.size() - 1) + "]");
        }

        this._inscriptionTranscriptionList.set(index, vInscriptionTranscription);
    }

    /**
     * 
     * 
     * @param vInscriptionTranscriptionArray
     */
    public void setInscriptionTranscription(
            final eu.dca.model.InscriptionTranscription[] vInscriptionTranscriptionArray) {
        //-- copy array
        _inscriptionTranscriptionList.clear();

        for (int i = 0; i < vInscriptionTranscriptionArray.length; i++) {
                this._inscriptionTranscriptionList.add(vInscriptionTranscriptionArray[i]);
        }
    }

    /**
     * Sets the value of field 'sortorder'. The field 'sortorder'
     * has the following description: Definition: Assigns a
     * priority order for online presentation of the element. 
     * 
     * @param sortorder the value of field 'sortorder'.
     */
    public void setSortorder(
            final long sortorder) {
        this._sortorder = sortorder;
        this._has_sortorder = true;
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
     * @return the unmarshaled eu.dca.model.Inscriptions
     */
    public static eu.dca.model.Inscriptions unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (eu.dca.model.Inscriptions) org.exolab.castor.xml.Unmarshaller.unmarshal(eu.dca.model.Inscriptions.class, reader);
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
