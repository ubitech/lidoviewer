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
public class SubjectSet extends eu.dca.model.SubjectSetComplexType 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: Assigns a priority order for online presentation
     * of the element. 
     */
    private long _sortorder;

    /**
     * keeps track of state for field: _sortorder
     */
    private boolean _has_sortorder;


      //----------------/
     //- Constructors -/
    //----------------/

    public SubjectSet() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteSortorder(
    ) {
        this._has_sortorder= false;
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
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled eu.dca.model.SubjectSet
     */
    public static eu.dca.model.SubjectSet unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (eu.dca.model.SubjectSet) org.exolab.castor.xml.Unmarshaller.unmarshal(eu.dca.model.SubjectSet.class, reader);
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
