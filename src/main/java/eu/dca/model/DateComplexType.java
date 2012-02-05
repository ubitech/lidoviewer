/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: A wrapper for date specification.How to record: This
 * may be a period or a set of years in the proleptic Gregorian
 * calendar delimiting the span of time. If it is an exact date,
 * possibly with time, repeat the same date (and time) in earliest
 * and latest date. For ca. and other uncertain or approximate
 * dates, estimate the greatest possible span for indexing.
 * Uncertainty can be indicated in the type attributes of earliest
 * and latest date, and can be characterized more precisely in the
 * display element.Notes: Format of the data values in sub-elements
 * earliestDate and LatestDate is according to ISO 8601. This
 * includes date and time specification. 
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class DateComplexType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Definition: A year or exact date that broadly delimits the
     * beginning of an implied date span. 
     */
    private eu.dca.model.EarliestDate _earliestDate;

    /**
     * Definition: A year or exact date that broadly delimits the
     * end of an implied date span.
     */
    private eu.dca.model.LatestDate _latestDate;


      //----------------/
     //- Constructors -/
    //----------------/

    public DateComplexType() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'earliestDate'. The field
     * 'earliestDate' has the following description: Definition: A
     * year or exact date that broadly delimits the beginning of an
     * implied date span. 
     * 
     * @return the value of field 'EarliestDate'.
     */
    public eu.dca.model.EarliestDate getEarliestDate(
    ) {
        return this._earliestDate;
    }

    /**
     * Returns the value of field 'latestDate'. The field
     * 'latestDate' has the following description: Definition: A
     * year or exact date that broadly delimits the end of an
     * implied date span.
     * 
     * @return the value of field 'LatestDate'.
     */
    public eu.dca.model.LatestDate getLatestDate(
    ) {
        return this._latestDate;
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
     * Sets the value of field 'earliestDate'. The field
     * 'earliestDate' has the following description: Definition: A
     * year or exact date that broadly delimits the beginning of an
     * implied date span. 
     * 
     * @param earliestDate the value of field 'earliestDate'.
     */
    public void setEarliestDate(
            final eu.dca.model.EarliestDate earliestDate) {
        this._earliestDate = earliestDate;
    }

    /**
     * Sets the value of field 'latestDate'. The field 'latestDate'
     * has the following description: Definition: A year or exact
     * date that broadly delimits the end of an implied date span.
     * 
     * @param latestDate the value of field 'latestDate'.
     */
    public void setLatestDate(
            final eu.dca.model.LatestDate latestDate) {
        this._latestDate = latestDate;
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
