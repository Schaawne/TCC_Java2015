package com.HelloWorld;

import java.util.ArrayList;
import java.util.List;

/**
 * RectangleAsInterface class for HelloWorld
 * <p>
 * Created by Schaawne on 8/16/2015.
 *
 * @author Sean Blanton
 * @version 0.0.0.1
 * @since 0.0.0.1
 */
public class RectangleAsInterface implements PolygonInterface{
    /** List to store CartesianPoint objects representing the vertices */
    private List<CartesianPoint> vertexList;

    /**
     * RectangleAsInterface Constructor
     *
     * @param p1 Vertex 1 CartesianPoint
     * @param p2 Vertex 2 CartesianPoint
     * @param p3 Vertex 3 CartesianPoint
     * @param p4 Vertex 4 CartesianPoint
     */
    public RectangleAsInterface(CartesianPoint p1, CartesianPoint p2, CartesianPoint p3, CartesianPoint p4) {
        //Create the List
        vertexList = new ArrayList<>();
        //Populate the List with provided CartesianPoints
        vertexList.add(p1);
        vertexList.add(p2);
        vertexList.add(p3);
        vertexList.add(p4);
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
     * Height function
     * <p>
     * Calculates the height of the rectangle
     *
     * @return Height of the rectangle
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
     * Calculates the perimeter of the rectangle
     *
     * @return Perimeter of the rectangle
     */
    public double Perimeter() {
        //P = 2*w + 2*h
        return 2*this.Height() + 2*this.Width();
    }

    /**
     * Width function
     * <p>
     * Calculates the width of the rectangle based on its vertices
     *
     * @return Width of the rectangle
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
