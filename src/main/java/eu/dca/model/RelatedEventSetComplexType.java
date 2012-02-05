/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: A wrapper for one event related to the described
 * event. 
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class RelatedEventSetComplexType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: Display and index elements for the event related
     * to the event being recorded.
     */
    private eu.dca.model.RelatedEvent _relatedEvent;

    /**
     * Definition: A term describing the nature of the relationship
     * between the described event and the related event.
     */
    private eu.dca.model.RelatedEventRelType _relatedEventRelType;


      //----------------/
     //- Constructors -/
    //----------------/

    public RelatedEventSetComplexType() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'relatedEvent'. The field
     * 'relatedEvent' has the following description: Definition:
     * Display and index elements for the event related to the
     * event being recorded.
     * 
     * @return the value of field 'RelatedEvent'.
     */
    public eu.dca.model.RelatedEvent getRelatedEvent(
    ) {
        return this._relatedEvent;
    }

    /**
     * Returns the value of field 'relatedEventRelType'. The field
     * 'relatedEventRelType' has the following description:
     * Definition: A term describing the nature of the relationship
     * between the described event and the related event.
     * 
     * @return the value of field 'RelatedEventRelType'.
     */
    public eu.dca.model.RelatedEventRelType getRelatedEventRelType(
    ) {
        return this._relatedEventRelType;
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
     * Sets the value of field 'relatedEvent'. The field
     * 'relatedEvent' has the following description: Definition:
     * Display and index elements for the event related to the
     * event being recorded.
     * 
     * @param relatedEvent the value of field 'relatedEvent'.
     */
    public void setRelatedEvent(
            final eu.dca.model.RelatedEvent relatedEvent) {
        this._relatedEvent = relatedEvent;
    }

    /**
     * Sets the value of field 'relatedEventRelType'. The field
     * 'relatedEventRelType' has the following description:
     * Definition: A term describing the nature of the relationship
     * between the described event and the related event.
     * 
     * @param relatedEventRelType the value of field
     * 'relatedEventRelType'.
     */
    public void setRelatedEventRelType(
            final eu.dca.model.RelatedEventRelType relatedEventRelType) {
        this._relatedEventRelType = relatedEventRelType;
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
