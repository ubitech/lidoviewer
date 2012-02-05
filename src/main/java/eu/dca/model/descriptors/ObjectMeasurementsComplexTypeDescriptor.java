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

import eu.dca.model.ObjectMeasurementsComplexType;

/**
 * Class ObjectMeasurementsComplexTypeDescriptor.
 * 
 * @version $Revision$ $Date$
 */
public class ObjectMeasurementsComplexTypeDescriptor extends org.exolab.castor.xml.util.XMLClassDescriptorImpl {


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

    public ObjectMeasurementsComplexTypeDescriptor() {
        super();
        _nsURI = "http://www.lido-schema.org";
        _xmlName = "objectMeasurementsComplexType";
        _elementDefinition = false;

        //-- set grouping compositor
        setCompositorAsSequence();
        org.exolab.castor.xml.util.XMLFieldDescriptorImpl  desc           = null;
        org.exolab.castor.mapping.FieldHandler             handler        = null;
        org.exolab.castor.xml.FieldValidator               fieldValidator = null;
        //-- initialize attribute descriptors

        //-- initialize element descriptors

        //-- _measurementsSetList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(eu.dca.model.MeasurementsSet.class, "_measurementsSetList", "measurementsSet", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                ObjectMeasurementsComplexType target = (ObjectMeasurementsComplexType) object;
                return target.getMeasurementsSet();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ObjectMeasurementsComplexType target = (ObjectMeasurementsComplexType) object;
                    target.addMeasurementsSet( (eu.dca.model.MeasurementsSet) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    ObjectMeasurementsComplexType target = (ObjectMeasurementsComplexType) object;
                    target.removeAllMeasurementsSet();
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
        desc.setSchemaType("list");
        desc.setComponentType("eu.dca.model.MeasurementsSet");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.lido-schema.org");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _measurementsSetList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _extentMeasurementsList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(eu.dca.model.ExtentMeasurements.class, "_extentMeasurementsList", "extentMeasurements", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                ObjectMeasurementsComplexType target = (ObjectMeasurementsComplexType) object;
                return target.getExtentMeasurements();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ObjectMeasurementsComplexType target = (ObjectMeasurementsComplexType) object;
                    target.addExtentMeasurements( (eu.dca.model.ExtentMeasurements) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    ObjectMeasurementsComplexType target = (ObjectMeasurementsComplexType) object;
                    target.removeAllExtentMeasurements();
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
        desc.setSchemaType("list");
        desc.setComponentType("eu.dca.model.ExtentMeasurements");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.lido-schema.org");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _extentMeasurementsList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _qualifierMeasurementsList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(eu.dca.model.QualifierMeasurements.class, "_qualifierMeasurementsList", "qualifierMeasurements", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                ObjectMeasurementsComplexType target = (ObjectMeasurementsComplexType) object;
                return target.getQualifierMeasurements();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ObjectMeasurementsComplexType target = (ObjectMeasurementsComplexType) object;
                    target.addQualifierMeasurements( (eu.dca.model.QualifierMeasurements) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    ObjectMeasurementsComplexType target = (ObjectMeasurementsComplexType) object;
                    target.removeAllQualifierMeasurements();
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
        desc.setSchemaType("list");
        desc.setComponentType("eu.dca.model.QualifierMeasurements");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.lido-schema.org");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _qualifierMeasurementsList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _formatMeasurementsList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(eu.dca.model.FormatMeasurements.class, "_formatMeasurementsList", "formatMeasurements", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                ObjectMeasurementsComplexType target = (ObjectMeasurementsComplexType) object;
                return target.getFormatMeasurements();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ObjectMeasurementsComplexType target = (ObjectMeasurementsComplexType) object;
                    target.addFormatMeasurements( (eu.dca.model.FormatMeasurements) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    ObjectMeasurementsComplexType target = (ObjectMeasurementsComplexType) object;
                    target.removeAllFormatMeasurements();
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
        desc.setSchemaType("list");
        desc.setComponentType("eu.dca.model.FormatMeasurements");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.lido-schema.org");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _formatMeasurementsList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _shapeMeasurementsList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(eu.dca.model.ShapeMeasurements.class, "_shapeMeasurementsList", "shapeMeasurements", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                ObjectMeasurementsComplexType target = (ObjectMeasurementsComplexType) object;
                return target.getShapeMeasurements();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ObjectMeasurementsComplexType target = (ObjectMeasurementsComplexType) object;
                    target.addShapeMeasurements( (eu.dca.model.ShapeMeasurements) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    ObjectMeasurementsComplexType target = (ObjectMeasurementsComplexType) object;
                    target.removeAllShapeMeasurements();
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
        desc.setSchemaType("list");
        desc.setComponentType("eu.dca.model.ShapeMeasurements");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.lido-schema.org");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _shapeMeasurementsList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _scaleMeasurementsList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(eu.dca.model.ScaleMeasurements.class, "_scaleMeasurementsList", "scaleMeasurements", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                ObjectMeasurementsComplexType target = (ObjectMeasurementsComplexType) object;
                return target.getScaleMeasurements();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ObjectMeasurementsComplexType target = (ObjectMeasurementsComplexType) object;
                    target.addScaleMeasurements( (eu.dca.model.ScaleMeasurements) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    ObjectMeasurementsComplexType target = (ObjectMeasurementsComplexType) object;
                    target.removeAllScaleMeasurements();
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
        desc.setSchemaType("list");
        desc.setComponentType("eu.dca.model.ScaleMeasurements");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.lido-schema.org");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _scaleMeasurementsList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
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
        return eu.dca.model.ObjectMeasurementsComplexType.class;
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
