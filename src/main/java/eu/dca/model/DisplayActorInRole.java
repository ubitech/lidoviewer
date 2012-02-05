/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

/**
 * Definition: Display element for an actor coupled with its
 * specific role, corresponding to the following actor element.How
 * to record: May include name, brief biographical information, and
 * roles (if necessary) of the named actor, presented in a syntax
 * suitable for display to the end-user and including any necessary
 * indications of uncertainty, ambiguity, and nuance. If there is
 * no known actor, make a reference to the presumed culture or
 * nationality of the unknown actor.May be concatenated from the
 * respective Actor element. The name should be in natural order,
 * if possible, although inverted order is acceptable. Include
 * nationality and life dates. For unknown actors, use e.g.:
 * "unknown," "unknown Chinese," "Chinese," or "unknown 15th
 * century Chinese."Repeat this element only for language variants.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class DisplayActorInRole extends TextComplexType 
implements java.io.Serializable
{


      //----------------/
     //- Constructors -/
    //----------------/

    public DisplayActorInRole() {
        super();
    }

    public DisplayActorInRole(final java.lang.String defaultValue) {
        super(defaultValue);
    }


      //-----------/
     //- Methods -/
    //-----------/

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
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled eu.dca.model.DisplayActorInRole
     */
    public static eu.dca.model.DisplayActorInRole unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (eu.dca.model.DisplayActorInRole) org.exolab.castor.xml.Unmarshaller.unmarshal(eu.dca.model.DisplayActorInRole.class, reader);
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
