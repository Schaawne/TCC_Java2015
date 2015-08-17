package com.HelloWorld;

/**
 * Circle class for HelloWorld
 * <p>
 * Created by Schaawne on 8/16/2015.
 *
 * @author Sean Blanton
 * @version 0.0.0.1
 * @since 0.0.0.1
 */
public class Circle extends Shape {
    /** Radius of the circle */
    private double radius;
    /** CartesianPoint for center of the circle */
    private CartesianPoint center;

    /**
     * Circle Constructor
     *
     * @param radius radius of circle
     * @param center center of circle
     */
    public Circle(double radius, CartesianPoint center) {
        this.radius = radius;
        this.center = center;
    }

    /**
     * Area function
     * <p>
     * Calculates the area of the circle
     *
     * @return Area of the circle
     */
    public double Area() {
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     * Height function
     * <p>
     * Calculates the height of the circle
     *
     * @return Height of the circle
     */
    public double Height() {
        return 2*radius;
    }

    /**
     * Perimeter fuunction
     * <p>
     * Calculates the perimeter of the circle
     *
     * @return Perimeter of the circle
     */
    public double Perimeter() {
        return 2*Math.PI*radius;
    }

    /**
     * Width function
     * <p>
     * Calculates the width of the circle
     *
     * @return Width of the circle
     */
    public double Width() {
        return 2*radius;
    }
}
