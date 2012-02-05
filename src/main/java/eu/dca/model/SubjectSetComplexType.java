/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: Wrapper for display and index elements for one set
 * of subject information.How to record: If an object / work has
 * multiple parts or otherwise has separate, multiple subjects,
 * repeat this element and use Extent Subject in the Subject
 * element. This element may also be repeated to distinguish
 * between subjects that reflect what an object / work is of
 * (description and identification) from what it is about
 * (interpretation).
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class SubjectSetComplexType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: A free-text description of the subject matter
     * represented by/in the object / work, corresponding to the
     * following subject element
     */
    private java.util.Vector<eu.dca.model.DisplaySubject> _displaySubjectList;

    /**
     * Definition: Contains sub-elements for a structured subject
     * description. These identify, describe, and/or interpret what
     * is depicted in and by an object / work or what it is about.
     */
    private eu.dca.model.Subject _subject;


      //----------------/
     //- Constructors -/
    //----------------/

    public SubjectSetComplexType() {
        super();
        this._displaySubjectList = new java.util.Vector<eu.dca.model.DisplaySubject>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vDisplaySubject
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDisplaySubject(
            final eu.dca.model.DisplaySubject vDisplaySubject)
    throws java.lang.IndexOutOfBoundsException {
        this._displaySubjectList.addElement(vDisplaySubject);
    }

    /**
     * 
     * 
     * @param index
     * @param vDisplaySubject
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDisplaySubject(
            final int index,
            final eu.dca.model.DisplaySubject vDisplaySubject)
    throws java.lang.IndexOutOfBoundsException {
        this._displaySubjectList.add(index, vDisplaySubject);
    }

    /**
     * Method enumerateDisplaySubject.
     * 
     * @return an Enumeration over all eu.dca.model.DisplaySubject
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.DisplaySubject> enumerateDisplaySubject(
    ) {
        return this._displaySubjectList.elements();
    }

    /**
     * Method getDisplaySubject.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.DisplaySubject at the
     * given index
     */
    public eu.dca.model.DisplaySubject getDisplaySubject(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._displaySubjectList.size()) {
            throw new IndexOutOfBoundsException("getDisplaySubject: Index value '" + index + "' not in range [0.." + (this._displaySubjectList.size() - 1) + "]");
        }

        return (eu.dca.model.DisplaySubject) _displaySubjectList.get(index);
    }

    /**
     * Method getDisplaySubject.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.DisplaySubject[] getDisplaySubject(
    ) {
        eu.dca.model.DisplaySubject[] array = new eu.dca.model.DisplaySubject[0];
        return (eu.dca.model.DisplaySubject[]) this._displaySubjectList.toArray(array);
    }

    /**
     * Method getDisplaySubjectCount.
     * 
     * @return the size of this collection
     */
    public int getDisplaySubjectCount(
    ) {
        return this._displaySubjectList.size();
    }

    /**
     * Returns the value of field 'subject'. The field 'subject'
     * has the following description: Definition: Contains
     * sub-elements for a structured subject description. These
     * identify, describe, and/or interpret what is depicted in and
     * by an object / work or what it is about.
     * 
     * @return the value of field 'Subject'.
     */
    public eu.dca.model.Subject getSubject(
    ) {
        return this._subject;
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
    public void removeAllDisplaySubject(
    ) {
        this._displaySubjectList.clear();
    }

    /**
     * Method removeDisplaySubject.
     * 
     * @param vDisplaySubject
     * @return true if the object was removed from the collection.
     */
    public boolean removeDisplaySubject(
            final eu.dca.model.DisplaySubject vDisplaySubject) {
        boolean removed = _displaySubjectList.remove(vDisplaySubject);
        return removed;
    }

    /**
     * Method removeDisplaySubjectAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.DisplaySubject removeDisplaySubjectAt(
            final int index) {
        java.lang.Object obj = this._displaySubjectList.remove(index);
        return (eu.dca.model.DisplaySubject) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vDisplaySubject
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setDisplaySubject(
            final int index,
            final eu.dca.model.DisplaySubject vDisplaySubject)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._displaySubjectList.size()) {
            throw new IndexOutOfBoundsException("setDisplaySubject: Index value '" + index + "' not in range [0.." + (this._displaySubjectList.size() - 1) + "]");
        }

        this._displaySubjectList.set(index, vDisplaySubject);
    }

    /**
     * 
     * 
     * @param vDisplaySubjectArray
     */
    public void setDisplaySubject(
            final eu.dca.model.DisplaySubject[] vDisplaySubjectArray) {
        //-- copy array
        _displaySubjectList.clear();

        for (int i = 0; i < vDisplaySubjectArray.length; i++) {
                this._displaySubjectList.add(vDisplaySubjectArray[i]);
        }
    }

    /**
     * Sets the value of field 'subject'. The field 'subject' has
     * the following description: Definition: Contains sub-elements
     * for a structured subject description. These identify,
     * describe, and/or interpret what is depicted in and by an
     * object / work or what it is about.
     * 
     * @param subject the value of field 'subject'.
     */
    public void setSubject(
            final eu.dca.model.Subject subject) {
        this._subject = subject;
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
