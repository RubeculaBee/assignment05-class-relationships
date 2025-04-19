/*********************************************************************************
 *
 * File: Shape.java
 * By: Robin Lane
 * Date: 04-18-2025
 *
 * Description: Represents of an ambiguous shape. Only declares area and perimeter,
 *              the two properties every (2D) shape has.
 *
 *********************************************************************************/

public abstract class Shape
{
    private double area;
    private double perimeter;

    public Shape(){}

    public Shape(double area, double perimeter)
    {
        this.area = area;
        this.perimeter = perimeter;
    }

    public double getArea()
    {
        return area;
    }
    public void setArea(double area)
    {
        this.area = area;
    }

    public double getPerimeter()
    {
        return perimeter;
    }
    public void setPerimeter(double perimeter)
    {
        this.perimeter = perimeter;
    }
}
