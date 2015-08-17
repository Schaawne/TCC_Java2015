package com.HelloWorld;

import java.util.ArrayList;
import java.util.List;

/**
 * Polygon class for HelloWorld
 * <p>
 * Created by Schaawne on 8/16/2015.
 *
 * @author Sean Blanton
 * @version 0.0.0.1
 * @since 0.0.0.1
 */
public abstract class Polygon extends Shape {
    /** List of vertices */
    protected List<CartesianPoint> vertices;

    /**
     * Polygon Constructor
     */
    protected Polygon() {
        vertices = new ArrayList<>();
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
        CartesianPoint point;

        maxY = 0;
        minY = 0;
        //Cycle through the vertices to find the height
        for(int index = 0; index < vertices.size(); index++)
        {
            //If first vertex, use it as max/min
            if(0 == index)
            {
                maxY = vertices.get(0).Y();
                minY = maxY;
            }
            else
            {
                point = vertices.get(index);
                if(maxY < point.Y())
                {
                    maxY = point.Y();
                }
                if(minY > point.Y())
                {
                    minY = point.Y();
                }
            }
        }

        //Height = maxY - minY
        return maxY - minY;
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
        CartesianPoint point;

        maxX = 0;
        minX = 0;
        //Cycle through the vertices to find the height
        for(int index = 0; index < vertices.size(); index++)
        {
            //If first vertex, use it as max/min
            if(0 == index)
            {
                maxX = vertices.get(0).X();
                minX = maxX;
            }
            else
            {
                point = vertices.get(index);
                if(maxX < point.X())
                {
                    maxX = point.X();
                }
                if(minX > point.X())
                {
                    minX = point.X();
                }
            }
        }

        //Width = maxX - minX
        return maxX - minX;
    }

    /**
     * Getter for vertices
     *
     * @return vertices
     */
    public List<CartesianPoint> Vertices() {
        return vertices;
    }
}
