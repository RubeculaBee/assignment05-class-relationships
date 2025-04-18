package Consistency;

/*********************************************************************************
 *
 * File: Circle.java
 * By: Robin Lane
 * Date: 04-01-2025
 *
 * Description: Simple class to represent a circle stores, changes, and returns it's radius
 *
 *********************************************************************************/

public class Circle
{
    private double radius; //store the radius in units
    //private double n;    //Also stores radius, but is unhelpfully named

    // no-arg constructor
    Circle(){}

    // constructor with args
    Circle(double radius)
    {
        this.radius = radius;
    }

    // Consistent names
    double getRadius()
    {
        return radius;
    }
    double getArea()
    {
        return Math.PI * radius * radius;
    }

    // Inconsistent names
    /*
    double retrieveRadius()
    {
        return radius;
    }
    double obtainArea()
    {
        return Math.PI * radius * radius;
    }
    */
}
