package com.HelloWorld;

/**
 * Triangle class for HelloWorld
 * <p>
 * Created by Schaawne on 8/16/2015.
 *
 * @author Sean Blanton
 * @version 0.0.0.1
 * @since 0.0.0.1
 */
public class Triangle extends Polygon {
    /**
     * Triangle Constructor
     *
     * @param p1 Vertex 1 cartesian point
     * @param p2 Vertex 2 cartesian point
     * @param p3 Vertex 3 cartesian point
     */
    public Triangle(CartesianPoint p1, CartesianPoint p2, CartesianPoint p3) {
        //Call Polygon Constructor
        super();
        //Populate the vertex list with provided points
        vertices.add(p1);
        vertices.add(p2);
        vertices.add(p3);
    }

    /**
     * Area function
     * <p>
     * Calculates the area of the triangle based on its vertices
     * Formula from: https://en.wikipedia.org/wiki/Triangle#Computing_the_area_of_a_triangle
     *
     * @return Area of the triangle
     */
    public double Area() {
        double determinant;
        CartesianPoint a,b,c;

        //Get the CartesianPoint vertex objects
        a = vertices.get(0);
        b = vertices.get(1);
        c = vertices.get(2);

        //Calculate determinant
        determinant = (a.X() - c.X())*(b.Y() - a.Y()) - (a.X() - b.X())*(c.Y() - a.Y());

        //A = (1/2)*|determinant|
        return 0.5 * Math.abs(determinant);
    }

    /**
     * Perimeter function
     * <p>
     * Calculates the perimeter of the triangle based on its vertices
     *
     * @return Perimeter of the triangle
     */
    public double Perimeter() {
        double sideLength1, sideLength2, sideLength3;
        CartesianPoint a,b,c;

        //Get the CartesianPoint vertex objects
        a = vertices.get(0);
        b = vertices.get(1);
        c = vertices.get(2);

        //Calculate the side lengths
        sideLength1 = a.Distance(b);
        sideLength2 = b.Distance(c);
        sideLength3 = c.Distance(a);

        //P = a + b + c; a,b,c = length of sides
        return sideLength1 + sideLength2 + sideLength3;
    }
}
