/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: A wrapper for Subject information. This may be the
 * visual content (e.g. the iconography of a painting) or what the
 * object is about.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class SubjectWrap implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: Wrapper for display and index elements for one
     * set of subject information.
     */
    private java.util.Vector<eu.dca.model.SubjectSet> _subjectSetList;


      //----------------/
     //- Constructors -/
    //----------------/

    public SubjectWrap() {
        super();
        this._subjectSetList = new java.util.Vector<eu.dca.model.SubjectSet>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vSubjectSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSubjectSet(
            final eu.dca.model.SubjectSet vSubjectSet)
    throws java.lang.IndexOutOfBoundsException {
        this._subjectSetList.addElement(vSubjectSet);
    }

    /**
     * 
     * 
     * @param index
     * @param vSubjectSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSubjectSet(
            final int index,
            final eu.dca.model.SubjectSet vSubjectSet)
    throws java.lang.IndexOutOfBoundsException {
        this._subjectSetList.add(index, vSubjectSet);
    }

    /**
     * Method enumerateSubjectSet.
     * 
     * @return an Enumeration over all eu.dca.model.SubjectSet
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.SubjectSet> enumerateSubjectSet(
    ) {
        return this._subjectSetList.elements();
    }

    /**
     * Method getSubjectSet.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.SubjectSet at the
     * given index
     */
    public eu.dca.model.SubjectSet getSubjectSet(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._subjectSetList.size()) {
            throw new IndexOutOfBoundsException("getSubjectSet: Index value '" + index + "' not in range [0.." + (this._subjectSetList.size() - 1) + "]");
        }

        return (eu.dca.model.SubjectSet) _subjectSetList.get(index);
    }

    /**
     * Method getSubjectSet.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.SubjectSet[] getSubjectSet(
    ) {
        eu.dca.model.SubjectSet[] array = new eu.dca.model.SubjectSet[0];
        return (eu.dca.model.SubjectSet[]) this._subjectSetList.toArray(array);
    }

    /**
     * Method getSubjectSetCount.
     * 
     * @return the size of this collection
     */
    public int getSubjectSetCount(
    ) {
        return this._subjectSetList.size();
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
    public void removeAllSubjectSet(
    ) {
        this._subjectSetList.clear();
    }

    /**
     * Method removeSubjectSet.
     * 
     * @param vSubjectSet
     * @return true if the object was removed from the collection.
     */
    public boolean removeSubjectSet(
            final eu.dca.model.SubjectSet vSubjectSet) {
        boolean removed = _subjectSetList.remove(vSubjectSet);
        return removed;
    }

    /**
     * Method removeSubjectSetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.SubjectSet removeSubjectSetAt(
            final int index) {
        java.lang.Object obj = this._subjectSetList.remove(index);
        return (eu.dca.model.SubjectSet) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vSubjectSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSubjectSet(
            final int index,
            final eu.dca.model.SubjectSet vSubjectSet)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._subjectSetList.size()) {
            throw new IndexOutOfBoundsException("setSubjectSet: Index value '" + index + "' not in range [0.." + (this._subjectSetList.size() - 1) + "]");
        }

        this._subjectSetList.set(index, vSubjectSet);
    }

    /**
     * 
     * 
     * @param vSubjectSetArray
     */
    public void setSubjectSet(
            final eu.dca.model.SubjectSet[] vSubjectSetArray) {
        //-- copy array
        _subjectSetList.clear();

        for (int i = 0; i < vSubjectSetArray.length; i++) {
                this._subjectSetList.add(vSubjectSetArray[i]);
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
     * @return the unmarshaled eu.dca.model.SubjectWrap
     */
    public static eu.dca.model.SubjectWrap unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (eu.dca.model.SubjectWrap) org.exolab.castor.xml.Unmarshaller.unmarshal(eu.dca.model.SubjectWrap.class, reader);
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
