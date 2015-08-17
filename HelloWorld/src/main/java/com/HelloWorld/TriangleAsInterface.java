package com.HelloWorld;

import java.util.ArrayList;
import java.util.List;

/**
 * com.HelloWorld.TriangleAsInterface class
 *
 * @author Sean Blanton
 * @version 0.0.0.1
 * @since Aug 16, 2015
 */
public class TriangleAsInterface implements PolygonInterface {
    /** List to store CartesianPoint objects representing the vertices */
    private List<CartesianPoint> vertexList;

    /**
     * TriangleAsInterface Constructor
     *
     * @param point1 Vertex 1 cartesian point
     * @param point2 Vertex 2 cartesian point
     * @param point3 Vertex 3 cartesian point
     */
    public TriangleAsInterface(CartesianPoint point1, CartesianPoint point2, CartesianPoint point3) {
        //Create the List
        vertexList = new ArrayList<>();
        //Populate the List with provided CartesianPoints
        vertexList.add(point1);
        vertexList.add(point2);
        vertexList.add(point3);
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
        a = vertexList.get(0);
        b = vertexList.get(1);
        c = vertexList.get(2);

        //Calculate determinant
        determinant = (a.X() - c.X())*(b.Y() - a.Y()) - (a.X() - b.X())*(c.Y() - a.Y());

        //A = (1/2)*|determinant|
        return 0.5 * Math.abs(determinant);
    }

    /**
     * Height function
     * <p>
     * Calculates the height of the triangle based on its vertices
     *
     * @return Height of the triangle
     */
    public double Height() {
        double maxY, minY;

        maxY = 0;
        minY = 0;
        //Cycle through the vertices to find the height
        for(int index = 0; index < vertexList.size(); index++)
        {
            //If first vertex, use it as max/min
            if(0 == index)
            {
                maxY = vertexList.get(0).Y();
                minY = maxY;
            }
            else
            {
                if(maxY < vertexList.get(index).Y())
                {
                    maxY = vertexList.get(index).Y();
                }
                if(minY > vertexList.get(index).Y())
                {
                    minY = vertexList.get(index).Y();
                }
            }
        }

        //Height = maxY - minY
        return maxY - minY;
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
        a = vertexList.get(0);
        b = vertexList.get(1);
        c = vertexList.get(2);

        //Calculate the side lengths
        sideLength1 = a.Distance(b);
        sideLength2 = b.Distance(c);
        sideLength3 = c.Distance(a);

        //P = a + b + c; a,b,c = length of sides
        return sideLength1 + sideLength2 + sideLength3;
    }

    /**
     * Width function
     * <p>
     * Calculates the width of the triangle based on its vertices
     *
     * @return Width of the triangle
     */
    public double Width() {
        double maxX, minX;

        maxX = 0;
        minX = 0;
        //Cycle through the vertices to find the height
        for(int index = 0; index < vertexList.size(); index++)
        {
            //If first vertex, use it as max/min
            if(0 == index)
            {
                maxX = vertexList.get(0).X();
                minX = maxX;
            }
            else
            {
                if(maxX < vertexList.get(index).X())
                {
                    maxX = vertexList.get(index).X();
                }
                if(minX > vertexList.get(index).X())
                {
                    minX = vertexList.get(index).X();
                }
            }
        }

        //Width = maxX - minX
        return maxX - minX;
    }

    /**
     * Getter for the vertex list
     *
     * @return the Vertex list
     */
    public List<CartesianPoint> Vertices() {
        return vertexList;
    }
}
