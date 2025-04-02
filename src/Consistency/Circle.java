package Consistency;

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
