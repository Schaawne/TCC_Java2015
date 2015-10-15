package com.HelloWorld;

import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * com.HelloWorld.HelloWorld Class
 *
 * @author Sean Blanton
 * @version 0.0.0.1
 */
public class HelloWorld {
    /**
     * Main function for com.HelloWorld
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        /**
         * Hello World
         */
        //Hello World!
        System.out.println("Hello World!");

        /**
         * Tinker with TestClass
         */
        //Instantiate TestClass
        TestClass localTestClass = new TestClass();

        //Twiddle some bits
        localTestClass.setPrivInt(15);
        System.out.format("privInt = %d\r\n", localTestClass.getPrivInt());

        /**
         * Commandline arguments processing
         */
        //Process command line args
        ArgsProcessor(args);

        /**
         * Tinker with Pattern and Matcher java util classes
         */
        //Line to be parsed
        String inputString = "This order was canceled for QT3000! OK?";

        //Pattern to match (RegEx)
        String pattern = "(\\b\\w*\\b)( for )(\\b\\w*\\d+\\b)";

        //Attempt to match with the pattern
        PatternMatching(inputString, pattern);

        /**
         * Tinker with ShapeInterface
         */
        //Some easy points
        CartesianPoint p1 = new CartesianPoint(0, 0);
        CartesianPoint p2 = new CartesianPoint(0, 5);
        CartesianPoint p3 = new CartesianPoint(5, 0);
        CartesianPoint p4 = new CartesianPoint(5, 5);

        /** TriangleAsInterface **/
        TriangleAsInterface triangleAsInterface = new TriangleAsInterface(p1, p2, p3);
        System.out.println("**TriangleAsInterface**");

        //PolygonInterface printing
        PolygonInterfacePrinter(triangleAsInterface);

        //ShapeInterface printing
        ShapeInterfacePrinter(triangleAsInterface);

        /** RectangleAsInterface */
        RectangleAsInterface rectangleAsInterface = new RectangleAsInterface(p1, p2, p3, p4);
        System.out.println("**RectangleAsInterface**");

        //PolygonInterface printing
        PolygonInterfacePrinter(rectangleAsInterface);

        //ShapeInterface printing
        ShapeInterfacePrinter(rectangleAsInterface);

        /** CircleAsInterface */
        CircleAsInterface circleAsInterface = new CircleAsInterface(2.5, new CartesianPoint(2.5, 2.5));
        System.out.println("**CircleAsInterface**");

        //ShapeInterface printing
        ShapeInterfacePrinter(circleAsInterface);

        /**
         * Tinker with Shape inheritance
         */
        /** TriangleAsInterface **/
        Triangle triangle = new Triangle(p1, p2, p3);
        System.out.println("**Triangle**");

        //Polygon printing
        PolygonPrinter(triangle);

        //Shape printing
        ShapePrinter(triangle);

        /** RectangleAsInterface */
        Rectangle rectangle = new Rectangle(p1, p2, p3, p4);
        System.out.println("**Rectangle**");

        //Polygon printing
        PolygonPrinter(rectangle);

        //Shape printing
        ShapePrinter(rectangle);

        /** CircleAsInterface */
        Circle circle = new Circle(2.5, new CartesianPoint(2.5, 2.5));
        System.out.println("**Circle**");

        //Shape printing
        ShapePrinter(circle);
    }

    /**
     * PolygonInterface values printer
     *
     * @param polygon PolygonInterface object
     */
    public static void PolygonInterfacePrinter(PolygonInterface polygon)
    {
        //Get vertices
        List<CartesianPoint> polygonVertices = polygon.Vertices();

        System.out.println("Polygon Vertices:");
        for(CartesianPoint point : polygonVertices)
        {
            System.out.println("\t(" + point.X() + "," + point.Y() + "),");
        }
    }

    /**
     * Polygon values printer
     *
     * @param polygon Polygon object
     */
    public static void PolygonPrinter(Polygon polygon)
    {
        //Get vertices
        List<CartesianPoint> polygonVertices = polygon.Vertices();

        System.out.println("Polygon Vertices:");
        for(CartesianPoint point : polygonVertices)
        {
            System.out.println("\t(" + point.X() + "," + point.Y() + "),");
        }
    }

    /**
     * ShapeInterface values printer
     *
     * @param shape ShapeInterface object
     */
    public static void ShapeInterfacePrinter(ShapeInterface shape)
    {
        System.out.println("Shape Height: " + shape.Height());
        System.out.println("Shape Width: " + shape.Width());
        System.out.println("Shape Area: " + shape.Area());
        System.out.println("Shape Perimeter: " + shape.Perimeter());
    }

    /**
     * Shape values printer
     *
     * @param shape Shape object
     */
    public static void ShapePrinter(Shape shape)
    {
        System.out.println("Shape Height: " + shape.Height());
        System.out.println("Shape Width: " + shape.Width());
        System.out.println("Shape Area: " + shape.Area());
        System.out.println("Shape Perimeter: " + shape.Perimeter());
    }

    /**
     * Processes args array for HelloWorld.main()
     *
     * @param args String array of command line arguments
     */
    public static void ArgsProcessor(String[] args) {
        //Check out args
        int argCount = 0;
        if(null != args) {
            System.out.format("Found %d arguments!\r\n", args.length);
            for (String arg : args) {
                System.out.format("arg[%d] - \"%s\"\r\n", argCount, arg);
                argCount++;
            }
        }
        else
        {
            System.out.println("No args provided.");
        }
    }

    /**
     * Tryinng out Pattern and Matcher classes
     *
     * @param inputString String to be processed
     * @param pattern Pattern to match within inputString
     */
    public static void PatternMatching(String inputString, String pattern) {
        //Pattern object
        Pattern thePattern = Pattern.compile(pattern);

        //Matcher object
        Matcher theMatcher = thePattern.matcher(inputString);

        //Find matches
        int groupCount;
        int matchCount = 0;
        while(theMatcher.find())
        {
            matchCount++;
            groupCount = theMatcher.groupCount();
            System.out.format("Match Number %d, Group Count %d:\r\n", matchCount, groupCount);
            for(int groupID = 0; groupID <= groupCount; groupID++)
            {
                System.out.format("\t-Group(%d) = %s\r\n", groupID, theMatcher.group(groupID));
            }
        }
        if(0 == matchCount)
        {
            System.out.println("No match found!");
        }
        else
        {
            System.out.format("Total of %d matches found!\r\n", matchCount);
        }
    }
}