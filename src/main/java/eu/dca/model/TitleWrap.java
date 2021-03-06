/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: Wrapper for Object name / Title information. 
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class TitleWrap implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: Wrapper for one title or object name and its
     * source information.
     */
    private java.util.Vector<eu.dca.model.TitleSet> _titleSetList;


      //----------------/
     //- Constructors -/
    //----------------/

    public TitleWrap() {
        super();
        this._titleSetList = new java.util.Vector<eu.dca.model.TitleSet>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vTitleSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTitleSet(
            final eu.dca.model.TitleSet vTitleSet)
    throws java.lang.IndexOutOfBoundsException {
        this._titleSetList.addElement(vTitleSet);
    }

    /**
     * 
     * 
     * @param index
     * @param vTitleSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTitleSet(
            final int index,
            final eu.dca.model.TitleSet vTitleSet)
    throws java.lang.IndexOutOfBoundsException {
        this._titleSetList.add(index, vTitleSet);
    }

    /**
     * Method enumerateTitleSet.
     * 
     * @return an Enumeration over all eu.dca.model.TitleSet element
     */
    public java.util.Enumeration<? extends eu.dca.model.TitleSet> enumerateTitleSet(
    ) {
        return this._titleSetList.elements();
    }

    /**
     * Method getTitleSet.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.TitleSet at the given
     * index
     */
    public eu.dca.model.TitleSet getTitleSet(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._titleSetList.size()) {
            throw new IndexOutOfBoundsException("getTitleSet: Index value '" + index + "' not in range [0.." + (this._titleSetList.size() - 1) + "]");
        }

        return (eu.dca.model.TitleSet) _titleSetList.get(index);
    }

    /**
     * Method getTitleSet.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.TitleSet[] getTitleSet(
    ) {
        eu.dca.model.TitleSet[] array = new eu.dca.model.TitleSet[0];
        return (eu.dca.model.TitleSet[]) this._titleSetList.toArray(array);
    }

    /**
     * Method getTitleSetCount.
     * 
     * @return the size of this collection
     */
    public int getTitleSetCount(
    ) {
        return this._titleSetList.size();
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
    public void removeAllTitleSet(
    ) {
        this._titleSetList.clear();
    }

    /**
     * Method removeTitleSet.
     * 
     * @param vTitleSet
     * @return true if the object was removed from the collection.
     */
    public boolean removeTitleSet(
            final eu.dca.model.TitleSet vTitleSet) {
        boolean removed = _titleSetList.remove(vTitleSet);
        return removed;
    }

    /**
     * Method removeTitleSetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.TitleSet removeTitleSetAt(
            final int index) {
        java.lang.Object obj = this._titleSetList.remove(index);
        return (eu.dca.model.TitleSet) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vTitleSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setTitleSet(
            final int index,
            final eu.dca.model.TitleSet vTitleSet)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._titleSetList.size()) {
            throw new IndexOutOfBoundsException("setTitleSet: Index value '" + index + "' not in range [0.." + (this._titleSetList.size() - 1) + "]");
        }

        this._titleSetList.set(index, vTitleSet);
    }

    /**
     * 
     * 
     * @param vTitleSetArray
     */
    public void setTitleSet(
            final eu.dca.model.TitleSet[] vTitleSetArray) {
        //-- copy array
        _titleSetList.clear();

        for (int i = 0; i < vTitleSetArray.length; i++) {
                this._titleSetList.add(vTitleSetArray[i]);
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
     * @return the unmarshaled eu.dca.model.TitleWrap
     */
    public static eu.dca.model.TitleWrap unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (eu.dca.model.TitleWrap) org.exolab.castor.xml.Unmarshaller.unmarshal(eu.dca.model.TitleWrap.class, reader);
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
