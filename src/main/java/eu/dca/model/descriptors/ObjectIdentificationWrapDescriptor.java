/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model.descriptors;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import eu.dca.model.ObjectIdentificationWrap;

/**
 * Class ObjectIdentificationWrapDescriptor.
 * 
 * @version $Revision$ $Date$
 */
public class ObjectIdentificationWrapDescriptor extends org.exolab.castor.xml.util.XMLClassDescriptorImpl {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _elementDefinition.
     */
    private boolean _elementDefinition;

    /**
     * Field _nsPrefix.
     */
    private java.lang.String _nsPrefix;

    /**
     * Field _nsURI.
     */
    private java.lang.String _nsURI;

    /**
     * Field _xmlName.
     */
    private java.lang.String _xmlName;

    /**
     * Field _identity.
     */
    private org.exolab.castor.xml.XMLFieldDescriptor _identity;


      //----------------/
     //- Constructors -/
    //----------------/

    public ObjectIdentificationWrapDescriptor() {
        super();
        _nsURI = "http://www.lido-schema.org";
        _xmlName = "objectIdentificationWrap";
        _elementDefinition = true;

        //-- set grouping compositor
        setCompositorAsSequence();
        org.exolab.castor.xml.util.XMLFieldDescriptorImpl  desc           = null;
        org.exolab.castor.mapping.FieldHandler             handler        = null;
        org.exolab.castor.xml.FieldValidator               fieldValidator = null;
        //-- initialize attribute descriptors

        //-- initialize element descriptors

        //-- _titleWrap
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(eu.dca.model.TitleWrap.class, "_titleWrap", "titleWrap", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                ObjectIdentificationWrap target = (ObjectIdentificationWrap) object;
                return target.getTitleWrap();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ObjectIdentificationWrap target = (ObjectIdentificationWrap) object;
                    target.setTitleWrap( (eu.dca.model.TitleWrap) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return null;
            }
        };
        desc.setSchemaType("eu.dca.model.TitleWrap");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.lido-schema.org");
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _titleWrap
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _inscriptionsWrap
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(eu.dca.model.InscriptionsWrap.class, "_inscriptionsWrap", "inscriptionsWrap", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                ObjectIdentificationWrap target = (ObjectIdentificationWrap) object;
                return target.getInscriptionsWrap();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ObjectIdentificationWrap target = (ObjectIdentificationWrap) object;
                    target.setInscriptionsWrap( (eu.dca.model.InscriptionsWrap) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return null;
            }
        };
        desc.setSchemaType("eu.dca.model.InscriptionsWrap");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.lido-schema.org");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _inscriptionsWrap
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _repositoryWrap
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(eu.dca.model.RepositoryWrap.class, "_repositoryWrap", "repositoryWrap", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                ObjectIdentificationWrap target = (ObjectIdentificationWrap) object;
                return target.getRepositoryWrap();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ObjectIdentificationWrap target = (ObjectIdentificationWrap) object;
                    target.setRepositoryWrap( (eu.dca.model.RepositoryWrap) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return null;
            }
        };
        desc.setSchemaType("eu.dca.model.RepositoryWrap");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.lido-schema.org");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _repositoryWrap
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _displayStateEditionWrap
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(eu.dca.model.DisplayStateEditionWrap.class, "_displayStateEditionWrap", "displayStateEditionWrap", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                ObjectIdentificationWrap target = (ObjectIdentificationWrap) object;
                return target.getDisplayStateEditionWrap();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ObjectIdentificationWrap target = (ObjectIdentificationWrap) object;
                    target.setDisplayStateEditionWrap( (eu.dca.model.DisplayStateEditionWrap) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return null;
            }
        };
        desc.setSchemaType("eu.dca.model.DisplayStateEditionWrap");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.lido-schema.org");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _displayStateEditionWrap
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _objectDescriptionWrap
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(eu.dca.model.ObjectDescriptionWrap.class, "_objectDescriptionWrap", "objectDescriptionWrap", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                ObjectIdentificationWrap target = (ObjectIdentificationWrap) object;
                return target.getObjectDescriptionWrap();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ObjectIdentificationWrap target = (ObjectIdentificationWrap) object;
                    target.setObjectDescriptionWrap( (eu.dca.model.ObjectDescriptionWrap) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return null;
            }
        };
        desc.setSchemaType("eu.dca.model.ObjectDescriptionWrap");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.lido-schema.org");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _objectDescriptionWrap
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _objectMeasurementsWrap
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(eu.dca.model.ObjectMeasurementsWrap.class, "_objectMeasurementsWrap", "objectMeasurementsWrap", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                ObjectIdentificationWrap target = (ObjectIdentificationWrap) object;
                return target.getObjectMeasurementsWrap();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ObjectIdentificationWrap target = (ObjectIdentificationWrap) object;
                    target.setObjectMeasurementsWrap( (eu.dca.model.ObjectMeasurementsWrap) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return null;
            }
        };
        desc.setSchemaType("eu.dca.model.ObjectMeasurementsWrap");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.lido-schema.org");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _objectMeasurementsWrap
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method getAccessMode.
     * 
     * @return the access mode specified for this class.
     */
    @Override()
    public org.exolab.castor.mapping.AccessMode getAccessMode(
    ) {
        return null;
    }

    /**
     * Method getIdentity.
     * 
     * @return the identity field, null if this class has no
     * identity.
     */
    @Override()
    public org.exolab.castor.mapping.FieldDescriptor getIdentity(
    ) {
        return _identity;
    }

    /**
     * Method getJavaClass.
     * 
     * @return the Java class represented by this descriptor.
     */
    @Override()
    public java.lang.Class getJavaClass(
    ) {
        return eu.dca.model.ObjectIdentificationWrap.class;
    }

    /**
     * Method getNameSpacePrefix.
     * 
     * @return the namespace prefix to use when marshaling as XML.
     */
    @Override()
    public java.lang.String getNameSpacePrefix(
    ) {
        return _nsPrefix;
    }

    /**
     * Method getNameSpaceURI.
     * 
     * @return the namespace URI used when marshaling and
     * unmarshaling as XML.
     */
    @Override()
    public java.lang.String getNameSpaceURI(
    ) {
        return _nsURI;
    }

    /**
     * Method getValidator.
     * 
     * @return a specific validator for the class described by this
     * ClassDescriptor.
     */
    @Override()
    public org.exolab.castor.xml.TypeValidator getValidator(
    ) {
        return this;
    }

    /**
     * Method getXMLName.
     * 
     * @return the XML Name for the Class being described.
     */
    @Override()
    public java.lang.String getXMLName(
    ) {
        return _xmlName;
    }

    /**
     * Method isElementDefinition.
     * 
     * @return true if XML schema definition of this Class is that
     * of a global
     * element or element with anonymous type definition.
     */
    public boolean isElementDefinition(
    ) {
        return _elementDefinition;
    }

}
