package com.HelloWorld;

/**
 * com.HelloWorld.CartesianPoint class
 *
 * @author Sean Blanton
 * @version 0.0.0.1
 * @since 0.0.0.1
 */
public class CartesianPoint {
    /** X cartesian coordinate */
    private double x_coord;
    /** Y cartesian coordinate */
    private double y_coord;

    /**
     * CartesianPoint constructor
     *
     * @param x_coord X coordinate
     * @param y_coord Y coordinate
     */
    public CartesianPoint(double x_coord, double y_coord) {
        this.x_coord = x_coord;
        this.y_coord = y_coord;
    }

    /**
     * Getter for y_coord
     *
     * @return y_coord
     */
    public double Y() {
        return y_coord;
    }

    /**
     * Getter for x_coord
     *
     * @return x_coord
     */
    public double X() {
        return x_coord;
    }

    /**
     * Distance calculation between this point and provided point
     * <p>
     * Formula from: https://en.wikipedia.org/wiki/Euclidean_distance
     *
     * @param p2 CartesianPoint object to calculate distance from
     * @return distance between the two points
     */
    public double Distance(CartesianPoint p2)
    {
        return Math.sqrt(Math.pow(p2.X() - x_coord, 2) + Math.pow(p2.Y() - y_coord, 2));
    }
}
