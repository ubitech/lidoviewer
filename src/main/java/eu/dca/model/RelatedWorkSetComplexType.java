/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: A wrapper for one object / work, group, collection,
 * or series that is directly related to the object / work at hand,
 * including direct relationships between the two, between an
 * object / work and its components, and between an item and the
 * larger group, collection, or series.How to record: If there is
 * more than one object / work referred to then the set should be
 * repeated.Preferably taken from a published controlled
 * vocabulary.Notes: Objects referred to may be corresponding
 * object / works or those created to be shown together with the
 * object / work in question, but also e.g., literature
 * (bibliographic objects) in which the object / work is documented
 * or mentioned forms a "relatedWorkSet". 
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class RelatedWorkSetComplexType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: Wrapper for the display and reference elements
     * of a related object / work.
     */
    private eu.dca.model.RelatedWork _relatedWork;

    /**
     * Definition: A term describing the nature of the relationship
     * between the object / work at hand and the related entity.
     */
    private eu.dca.model.RelatedWorkRelType _relatedWorkRelType;


      //----------------/
     //- Constructors -/
    //----------------/

    public RelatedWorkSetComplexType() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'relatedWork'. The field
     * 'relatedWork' has the following description: Definition:
     * Wrapper for the display and reference elements of a related
     * object / work.
     * 
     * @return the value of field 'RelatedWork'.
     */
    public eu.dca.model.RelatedWork getRelatedWork(
    ) {
        return this._relatedWork;
    }

    /**
     * Returns the value of field 'relatedWorkRelType'. The field
     * 'relatedWorkRelType' has the following description:
     * Definition: A term describing the nature of the relationship
     * between the object / work at hand and the related entity.
     * 
     * @return the value of field 'RelatedWorkRelType'.
     */
    public eu.dca.model.RelatedWorkRelType getRelatedWorkRelType(
    ) {
        return this._relatedWorkRelType;
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
     * Sets the value of field 'relatedWork'. The field
     * 'relatedWork' has the following description: Definition:
     * Wrapper for the display and reference elements of a related
     * object / work.
     * 
     * @param relatedWork the value of field 'relatedWork'.
     */
    public void setRelatedWork(
            final eu.dca.model.RelatedWork relatedWork) {
        this._relatedWork = relatedWork;
    }

    /**
     * Sets the value of field 'relatedWorkRelType'. The field
     * 'relatedWorkRelType' has the following description:
     * Definition: A term describing the nature of the relationship
     * between the object / work at hand and the related entity.
     * 
     * @param relatedWorkRelType the value of field
     * 'relatedWorkRelType'.
     */
    public void setRelatedWorkRelType(
            final eu.dca.model.RelatedWorkRelType relatedWorkRelType) {
        this._relatedWorkRelType = relatedWorkRelType;
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
