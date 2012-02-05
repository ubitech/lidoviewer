/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package eu.dca.model;

import eu.gml.model.LineString;
import eu.gml.model.Point;
import eu.gml.model.Polygon;

/**
 * Definition: Specifies the GML instantiation for
 * georeferences.Notes: For documentation on GML refer to
 * http://www.opengis.net/gml/. 
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class GmlComplexType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _pointList.
     */
    private java.util.Vector<Point> _pointList;

    /**
     * Field _lineStringList.
     */
    private java.util.Vector<LineString> _lineStringList;

    /**
     * Field _polygonList.
     */
    private java.util.Vector<Polygon> _polygonList;


      //----------------/
     //- Constructors -/
    //----------------/

    public GmlComplexType() {
        super();
        this._pointList = new java.util.Vector<Point>();
        this._lineStringList = new java.util.Vector<LineString>();
        this._polygonList = new java.util.Vector<Polygon>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vLineString
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addLineString(
            final LineString vLineString)
    throws java.lang.IndexOutOfBoundsException {
        this._lineStringList.addElement(vLineString);
    }

    /**
     * 
     * 
     * @param index
     * @param vLineString
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addLineString(
            final int index,
            final LineString vLineString)
    throws java.lang.IndexOutOfBoundsException {
        this._lineStringList.add(index, vLineString);
    }

    /**
     * 
     * 
     * @param vPoint
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPoint(
            final Point vPoint)
    throws java.lang.IndexOutOfBoundsException {
        this._pointList.addElement(vPoint);
    }

    /**
     * 
     * 
     * @param index
     * @param vPoint
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPoint(
            final int index,
            final Point vPoint)
    throws java.lang.IndexOutOfBoundsException {
        this._pointList.add(index, vPoint);
    }

    /**
     * 
     * 
     * @param vPolygon
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPolygon(
            final Polygon vPolygon)
    throws java.lang.IndexOutOfBoundsException {
        this._polygonList.addElement(vPolygon);
    }

    /**
     * 
     * 
     * @param index
     * @param vPolygon
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPolygon(
            final int index,
            final Polygon vPolygon)
    throws java.lang.IndexOutOfBoundsException {
        this._polygonList.add(index, vPolygon);
    }

    /**
     * Method enumerateLineString.
     * 
     * @return an Enumeration over all LineString elements
     */
    public java.util.Enumeration<? extends LineString> enumerateLineString(
    ) {
        return this._lineStringList.elements();
    }

    /**
     * Method enumeratePoint.
     * 
     * @return an Enumeration over all Point elements
     */
    public java.util.Enumeration<? extends Point> enumeratePoint(
    ) {
        return this._pointList.elements();
    }

    /**
     * Method enumeratePolygon.
     * 
     * @return an Enumeration over all Polygon elements
     */
    public java.util.Enumeration<? extends Polygon> enumeratePolygon(
    ) {
        return this._polygonList.elements();
    }

    /**
     * Method getLineString.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the LineString at the given index
     */
    public LineString getLineString(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._lineStringList.size()) {
            throw new IndexOutOfBoundsException("getLineString: Index value '" + index + "' not in range [0.." + (this._lineStringList.size() - 1) + "]");
        }

        return (LineString) _lineStringList.get(index);
    }

    /**
     * Method getLineString.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public LineString[] getLineString(
    ) {
        LineString[] array = new LineString[0];
        return (LineString[]) this._lineStringList.toArray(array);
    }

    /**
     * Method getLineStringCount.
     * 
     * @return the size of this collection
     */
    public int getLineStringCount(
    ) {
        return this._lineStringList.size();
    }

    /**
     * Method getPoint.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the Point at the given index
     */
    public Point getPoint(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._pointList.size()) {
            throw new IndexOutOfBoundsException("getPoint: Index value '" + index + "' not in range [0.." + (this._pointList.size() - 1) + "]");
        }

        return (Point) _pointList.get(index);
    }

    /**
     * Method getPoint.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public Point[] getPoint(
    ) {
        Point[] array = new Point[0];
        return (Point[]) this._pointList.toArray(array);
    }

    /**
     * Method getPointCount.
     * 
     * @return the size of this collection
     */
    public int getPointCount(
    ) {
        return this._pointList.size();
    }

    /**
     * Method getPolygon.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the Polygon at the given index
     */
    public Polygon getPolygon(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._polygonList.size()) {
            throw new IndexOutOfBoundsException("getPolygon: Index value '" + index + "' not in range [0.." + (this._polygonList.size() - 1) + "]");
        }

        return (Polygon) _polygonList.get(index);
    }

    /**
     * Method getPolygon.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public Polygon[] getPolygon(
    ) {
        Polygon[] array = new Polygon[0];
        return (Polygon[]) this._polygonList.toArray(array);
    }

    /**
     * Method getPolygonCount.
     * 
     * @return the size of this collection
     */
    public int getPolygonCount(
    ) {
        return this._polygonList.size();
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
    public void removeAllLineString(
    ) {
        this._lineStringList.clear();
    }

    /**
     */
    public void removeAllPoint(
    ) {
        this._pointList.clear();
    }

    /**
     */
    public void removeAllPolygon(
    ) {
        this._polygonList.clear();
    }

    /**
     * Method removeLineString.
     * 
     * @param vLineString
     * @return true if the object was removed from the collection.
     */
    public boolean removeLineString(
            final LineString vLineString) {
        boolean removed = _lineStringList.remove(vLineString);
        return removed;
    }

    /**
     * Method removeLineStringAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public LineString removeLineStringAt(
            final int index) {
        java.lang.Object obj = this._lineStringList.remove(index);
        return (LineString) obj;
    }

    /**
     * Method removePoint.
     * 
     * @param vPoint
     * @return true if the object was removed from the collection.
     */
    public boolean removePoint(
            final Point vPoint) {
        boolean removed = _pointList.remove(vPoint);
        return removed;
    }

    /**
     * Method removePointAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public Point removePointAt(
            final int index) {
        java.lang.Object obj = this._pointList.remove(index);
        return (Point) obj;
    }

    /**
     * Method removePolygon.
     * 
     * @param vPolygon
     * @return true if the object was removed from the collection.
     */
    public boolean removePolygon(
            final Polygon vPolygon) {
        boolean removed = _polygonList.remove(vPolygon);
        return removed;
    }

    /**
     * Method removePolygonAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public Polygon removePolygonAt(
            final int index) {
        java.lang.Object obj = this._polygonList.remove(index);
        return (Polygon) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vLineString
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setLineString(
            final int index,
            final LineString vLineString)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._lineStringList.size()) {
            throw new IndexOutOfBoundsException("setLineString: Index value '" + index + "' not in range [0.." + (this._lineStringList.size() - 1) + "]");
        }

        this._lineStringList.set(index, vLineString);
    }

    /**
     * 
     * 
     * @param vLineStringArray
     */
    public void setLineString(
            final LineString[] vLineStringArray) {
        //-- copy array
        _lineStringList.clear();

        for (int i = 0; i < vLineStringArray.length; i++) {
                this._lineStringList.add(vLineStringArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vPoint
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setPoint(
            final int index,
            final Point vPoint)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._pointList.size()) {
            throw new IndexOutOfBoundsException("setPoint: Index value '" + index + "' not in range [0.." + (this._pointList.size() - 1) + "]");
        }

        this._pointList.set(index, vPoint);
    }

    /**
     * 
     * 
     * @param vPointArray
     */
    public void setPoint(
            final Point[] vPointArray) {
        //-- copy array
        _pointList.clear();

        for (int i = 0; i < vPointArray.length; i++) {
                this._pointList.add(vPointArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vPolygon
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setPolygon(
            final int index,
            final Polygon vPolygon)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._polygonList.size()) {
            throw new IndexOutOfBoundsException("setPolygon: Index value '" + index + "' not in range [0.." + (this._polygonList.size() - 1) + "]");
        }

        this._polygonList.set(index, vPolygon);
    }

    /**
     * 
     * 
     * @param vPolygonArray
     */
    public void setPolygon(
            final Polygon[] vPolygonArray) {
        //-- copy array
        _polygonList.clear();

        for (int i = 0; i < vPolygonArray.length; i++) {
                this._polygonList.add(vPolygonArray[i]);
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
