/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: A wrapper for classification information.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ClassificationWrap implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: Concepts used to categorize an object / work by
     * grouping it together with others on the basis of similar
     * characteristics.
     */
    private java.util.Vector<eu.dca.model.Classification> _classificationList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ClassificationWrap() {
        super();
        this._classificationList = new java.util.Vector<eu.dca.model.Classification>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vClassification
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addClassification(
            final eu.dca.model.Classification vClassification)
    throws java.lang.IndexOutOfBoundsException {
        this._classificationList.addElement(vClassification);
    }

    /**
     * 
     * 
     * @param index
     * @param vClassification
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addClassification(
            final int index,
            final eu.dca.model.Classification vClassification)
    throws java.lang.IndexOutOfBoundsException {
        this._classificationList.add(index, vClassification);
    }

    /**
     * Method enumerateClassification.
     * 
     * @return an Enumeration over all eu.dca.model.Classification
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.Classification> enumerateClassification(
    ) {
        return this._classificationList.elements();
    }

    /**
     * Method getClassification.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.Classification at the
     * given index
     */
    public eu.dca.model.Classification getClassification(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._classificationList.size()) {
            throw new IndexOutOfBoundsException("getClassification: Index value '" + index + "' not in range [0.." + (this._classificationList.size() - 1) + "]");
        }

        return (eu.dca.model.Classification) _classificationList.get(index);
    }

    /**
     * Method getClassification.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.Classification[] getClassification(
    ) {
        eu.dca.model.Classification[] array = new eu.dca.model.Classification[0];
        return (eu.dca.model.Classification[]) this._classificationList.toArray(array);
    }

    /**
     * Method getClassificationCount.
     * 
     * @return the size of this collection
     */
    public int getClassificationCount(
    ) {
        return this._classificationList.size();
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
    public void removeAllClassification(
    ) {
        this._classificationList.clear();
    }

    /**
     * Method removeClassification.
     * 
     * @param vClassification
     * @return true if the object was removed from the collection.
     */
    public boolean removeClassification(
            final eu.dca.model.Classification vClassification) {
        boolean removed = _classificationList.remove(vClassification);
        return removed;
    }

    /**
     * Method removeClassificationAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.Classification removeClassificationAt(
            final int index) {
        java.lang.Object obj = this._classificationList.remove(index);
        return (eu.dca.model.Classification) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vClassification
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setClassification(
            final int index,
            final eu.dca.model.Classification vClassification)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._classificationList.size()) {
            throw new IndexOutOfBoundsException("setClassification: Index value '" + index + "' not in range [0.." + (this._classificationList.size() - 1) + "]");
        }

        this._classificationList.set(index, vClassification);
    }

    /**
     * 
     * 
     * @param vClassificationArray
     */
    public void setClassification(
            final eu.dca.model.Classification[] vClassificationArray) {
        //-- copy array
        _classificationList.clear();

        for (int i = 0; i < vClassificationArray.length; i++) {
                this._classificationList.add(vClassificationArray[i]);
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
     * @return the unmarshaled eu.dca.model.ClassificationWrap
     */
    public static eu.dca.model.ClassificationWrap unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (eu.dca.model.ClassificationWrap) org.exolab.castor.xml.Unmarshaller.unmarshal(eu.dca.model.ClassificationWrap.class, reader);
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
