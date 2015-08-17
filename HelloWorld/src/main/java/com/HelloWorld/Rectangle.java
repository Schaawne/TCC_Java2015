package com.HelloWorld;

/**
 * Rectangle class for HelloWorld
 * <p>
 * Created by Schaawne on 8/16/2015.
 *
 * @author Sean Blanton
 * @version 0.0.0.1
 * @since 0.0.0.1
 */
public class Rectangle extends Polygon{
    /**
     * Rectangle Constructor
     *
     * @param p1 Vertex 1 cartesian point
     * @param p2 Vertex 2 cartesian point
     * @param p3 Vertex 3 cartesian point
     * @param p4 Vertex 4 cartesian point
     */
    public Rectangle(CartesianPoint p1, CartesianPoint p2, CartesianPoint p3, CartesianPoint p4) {
        //Call Polygon Constructor
        super();
        //Populate the List with provided CartesianPoints
        vertices.add(p1);
        vertices.add(p2);
        vertices.add(p3);
        vertices.add(p4);
    }

    /**
     * Area function
     * <p>
     * Calculates the area of the rectangle
     *
     * @return Area of the rectangle
     */
    public double Area() {
        return this.Height() * this.Width();
    }

    /**
     * Perimeter function
     * <p>
     * Calculates the perimeter of the rectangle
     *
     * @return Perimeter of the rectangle
     */
    public double Perimeter() {
        //P = 2*w + 2*h
        return 2*this.Height() + 2*this.Width();
    }
}
