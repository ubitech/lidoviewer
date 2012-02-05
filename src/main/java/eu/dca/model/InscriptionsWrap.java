/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: A wrapper for information about inscriptions and
 * other marks.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class InscriptionsWrap implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: A transcription or description of any
     * distinguishing or identifying physical lettering,
     * annotations, texts, markings, or labels that are affixed,
     * applied, stamped, written, inscribed, or attached to the
     * object / work, excluding any mark or text inherent in the
     * materials of which it is made.
     */
    private java.util.Vector<eu.dca.model.Inscriptions> _inscriptionsList;


      //----------------/
     //- Constructors -/
    //----------------/

    public InscriptionsWrap() {
        super();
        this._inscriptionsList = new java.util.Vector<eu.dca.model.Inscriptions>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vInscriptions
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addInscriptions(
            final eu.dca.model.Inscriptions vInscriptions)
    throws java.lang.IndexOutOfBoundsException {
        this._inscriptionsList.addElement(vInscriptions);
    }

    /**
     * 
     * 
     * @param index
     * @param vInscriptions
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addInscriptions(
            final int index,
            final eu.dca.model.Inscriptions vInscriptions)
    throws java.lang.IndexOutOfBoundsException {
        this._inscriptionsList.add(index, vInscriptions);
    }

    /**
     * Method enumerateInscriptions.
     * 
     * @return an Enumeration over all eu.dca.model.Inscriptions
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.Inscriptions> enumerateInscriptions(
    ) {
        return this._inscriptionsList.elements();
    }

    /**
     * Method getInscriptions.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.Inscriptions at the
     * given index
     */
    public eu.dca.model.Inscriptions getInscriptions(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._inscriptionsList.size()) {
            throw new IndexOutOfBoundsException("getInscriptions: Index value '" + index + "' not in range [0.." + (this._inscriptionsList.size() - 1) + "]");
        }

        return (eu.dca.model.Inscriptions) _inscriptionsList.get(index);
    }

    /**
     * Method getInscriptions.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.Inscriptions[] getInscriptions(
    ) {
        eu.dca.model.Inscriptions[] array = new eu.dca.model.Inscriptions[0];
        return (eu.dca.model.Inscriptions[]) this._inscriptionsList.toArray(array);
    }

    /**
     * Method getInscriptionsCount.
     * 
     * @return the size of this collection
     */
    public int getInscriptionsCount(
    ) {
        return this._inscriptionsList.size();
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
    public void removeAllInscriptions(
    ) {
        this._inscriptionsList.clear();
    }

    /**
     * Method removeInscriptions.
     * 
     * @param vInscriptions
     * @return true if the object was removed from the collection.
     */
    public boolean removeInscriptions(
            final eu.dca.model.Inscriptions vInscriptions) {
        boolean removed = _inscriptionsList.remove(vInscriptions);
        return removed;
    }

    /**
     * Method removeInscriptionsAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.Inscriptions removeInscriptionsAt(
            final int index) {
        java.lang.Object obj = this._inscriptionsList.remove(index);
        return (eu.dca.model.Inscriptions) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vInscriptions
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setInscriptions(
            final int index,
            final eu.dca.model.Inscriptions vInscriptions)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._inscriptionsList.size()) {
            throw new IndexOutOfBoundsException("setInscriptions: Index value '" + index + "' not in range [0.." + (this._inscriptionsList.size() - 1) + "]");
        }

        this._inscriptionsList.set(index, vInscriptions);
    }

    /**
     * 
     * 
     * @param vInscriptionsArray
     */
    public void setInscriptions(
            final eu.dca.model.Inscriptions[] vInscriptionsArray) {
        //-- copy array
        _inscriptionsList.clear();

        for (int i = 0; i < vInscriptionsArray.length; i++) {
                this._inscriptionsList.add(vInscriptionsArray[i]);
        }
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled eu.dca.model.InscriptionsWrap
     */
    public static eu.dca.model.InscriptionsWrap unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (eu.dca.model.InscriptionsWrap) org.exolab.castor.xml.Unmarshaller.unmarshal(eu.dca.model.InscriptionsWrap.class, reader);
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
