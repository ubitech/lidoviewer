/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model.types;

/**
 * Enumeration TermComplexTypeAddedSearchTermType.
 * 
 * @version $Revision$ $Date$
 */
public enum TermComplexTypeAddedSearchTermType {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant YES
     */
    YES("yes"),
    /**
     * Constant NO
     */
    NO("no");

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field value.
     */
    private final java.lang.String value;

    /**
     * Field enumConstants.
     */
    private static final java.util.Map<java.lang.String, TermComplexTypeAddedSearchTermType> enumConstants = new java.util.HashMap<java.lang.String, TermComplexTypeAddedSearchTermType>();


    static {
        for (TermComplexTypeAddedSearchTermType c: TermComplexTypeAddedSearchTermType.values()) {
            TermComplexTypeAddedSearchTermType.enumConstants.put(c.value, c);
        }

    };


      //----------------/
     //- Constructors -/
    //----------------/

    private TermComplexTypeAddedSearchTermType(final java.lang.String value) {
        this.value = value;
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method fromValue.
     * 
     * @param value
     * @return the constant for this value
     */
    public static eu.dca.model.types.TermComplexTypeAddedSearchTermType fromValue(
            final java.lang.String value) {
        TermComplexTypeAddedSearchTermType c = TermComplexTypeAddedSearchTermType.enumConstants.get(value);
        if (c != null) {
            return c;
        }
        throw new IllegalArgumentException(value);
    }

    /**
     * 
     * 
     * @param value
     */
    public void setValue(
            final java.lang.String value) {
    }

    /**
     * Method toString.
     * 
     * @return the value of this constant
     */
    public java.lang.String toString(
    ) {
        return this.value;
    }

    /**
     * Method value.
     * 
     * @return the value of this constant
     */
    public java.lang.String value(
    ) {
        return this.value;
    }

}
