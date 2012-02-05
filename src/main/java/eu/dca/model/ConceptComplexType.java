/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: Set for identifiers and terms of a concept.How to
 * record: A concept describes a conceptual resource. Concepts are
 * organized in concept schemes like thesauri, classification
 * schemes, taxonomies, subject-heading systems, or any other type
 * of structured controlled vocabulary. See also SKOS
 * specifications at http://www.w3.org/2004/02/skos/
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class ConceptComplexType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: A unique identifier for the concept.
     */
    private java.util.Vector<eu.dca.model.ConceptID> _conceptIDList;

    /**
     * Definition: A name for the referred concept, used for
     * indexing.
     */
    private java.util.Vector<eu.dca.model.Term> _termList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConceptComplexType() {
        super();
        this._conceptIDList = new java.util.Vector<eu.dca.model.ConceptID>();
        this._termList = new java.util.Vector<eu.dca.model.Term>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vConceptID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addConceptID(
            final eu.dca.model.ConceptID vConceptID)
    throws java.lang.IndexOutOfBoundsException {
        this._conceptIDList.addElement(vConceptID);
    }

    /**
     * 
     * 
     * @param index
     * @param vConceptID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addConceptID(
            final int index,
            final eu.dca.model.ConceptID vConceptID)
    throws java.lang.IndexOutOfBoundsException {
        this._conceptIDList.add(index, vConceptID);
    }

    /**
     * 
     * 
     * @param vTerm
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTerm(
            final eu.dca.model.Term vTerm)
    throws java.lang.IndexOutOfBoundsException {
        this._termList.addElement(vTerm);
    }

    /**
     * 
     * 
     * @param index
     * @param vTerm
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTerm(
            final int index,
            final eu.dca.model.Term vTerm)
    throws java.lang.IndexOutOfBoundsException {
        this._termList.add(index, vTerm);
    }

    /**
     * Method enumerateConceptID.
     * 
     * @return an Enumeration over all eu.dca.model.ConceptID
     * elements
     */
    public java.util.Enumeration<? extends eu.dca.model.ConceptID> enumerateConceptID(
    ) {
        return this._conceptIDList.elements();
    }

    /**
     * Method enumerateTerm.
     * 
     * @return an Enumeration over all eu.dca.model.Term elements
     */
    public java.util.Enumeration<? extends eu.dca.model.Term> enumerateTerm(
    ) {
        return this._termList.elements();
    }

    /**
     * Method getConceptID.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.ConceptID at the given
     * index
     */
    public eu.dca.model.ConceptID getConceptID(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._conceptIDList.size()) {
            throw new IndexOutOfBoundsException("getConceptID: Index value '" + index + "' not in range [0.." + (this._conceptIDList.size() - 1) + "]");
        }

        return (eu.dca.model.ConceptID) _conceptIDList.get(index);
    }

    /**
     * Method getConceptID.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.ConceptID[] getConceptID(
    ) {
        eu.dca.model.ConceptID[] array = new eu.dca.model.ConceptID[0];
        return (eu.dca.model.ConceptID[]) this._conceptIDList.toArray(array);
    }

    /**
     * Method getConceptIDCount.
     * 
     * @return the size of this collection
     */
    public int getConceptIDCount(
    ) {
        return this._conceptIDList.size();
    }

    /**
     * Method getTerm.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the eu.dca.model.Term at the given index
     */
    public eu.dca.model.Term getTerm(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._termList.size()) {
            throw new IndexOutOfBoundsException("getTerm: Index value '" + index + "' not in range [0.." + (this._termList.size() - 1) + "]");
        }

        return (eu.dca.model.Term) _termList.get(index);
    }

    /**
     * Method getTerm.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public eu.dca.model.Term[] getTerm(
    ) {
        eu.dca.model.Term[] array = new eu.dca.model.Term[0];
        return (eu.dca.model.Term[]) this._termList.toArray(array);
    }

    /**
     * Method getTermCount.
     * 
     * @return the size of this collection
     */
    public int getTermCount(
    ) {
        return this._termList.size();
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
    public void removeAllConceptID(
    ) {
        this._conceptIDList.clear();
    }

    /**
     */
    public void removeAllTerm(
    ) {
        this._termList.clear();
    }

    /**
     * Method removeConceptID.
     * 
     * @param vConceptID
     * @return true if the object was removed from the collection.
     */
    public boolean removeConceptID(
            final eu.dca.model.ConceptID vConceptID) {
        boolean removed = _conceptIDList.remove(vConceptID);
        return removed;
    }

    /**
     * Method removeConceptIDAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.ConceptID removeConceptIDAt(
            final int index) {
        java.lang.Object obj = this._conceptIDList.remove(index);
        return (eu.dca.model.ConceptID) obj;
    }

    /**
     * Method removeTerm.
     * 
     * @param vTerm
     * @return true if the object was removed from the collection.
     */
    public boolean removeTerm(
            final eu.dca.model.Term vTerm) {
        boolean removed = _termList.remove(vTerm);
        return removed;
    }

    /**
     * Method removeTermAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public eu.dca.model.Term removeTermAt(
            final int index) {
        java.lang.Object obj = this._termList.remove(index);
        return (eu.dca.model.Term) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vConceptID
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setConceptID(
            final int index,
            final eu.dca.model.ConceptID vConceptID)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._conceptIDList.size()) {
            throw new IndexOutOfBoundsException("setConceptID: Index value '" + index + "' not in range [0.." + (this._conceptIDList.size() - 1) + "]");
        }

        this._conceptIDList.set(index, vConceptID);
    }

    /**
     * 
     * 
     * @param vConceptIDArray
     */
    public void setConceptID(
            final eu.dca.model.ConceptID[] vConceptIDArray) {
        //-- copy array
        _conceptIDList.clear();

        for (int i = 0; i < vConceptIDArray.length; i++) {
                this._conceptIDList.add(vConceptIDArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vTerm
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setTerm(
            final int index,
            final eu.dca.model.Term vTerm)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._termList.size()) {
            throw new IndexOutOfBoundsException("setTerm: Index value '" + index + "' not in range [0.." + (this._termList.size() - 1) + "]");
        }

        this._termList.set(index, vTerm);
    }

    /**
     * 
     * 
     * @param vTermArray
     */
    public void setTerm(
            final eu.dca.model.Term[] vTermArray) {
        //-- copy array
        _termList.clear();

        for (int i = 0; i < vTermArray.length; i++) {
                this._termList.add(vTermArray[i]);
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
